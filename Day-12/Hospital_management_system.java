import java.util.*;

class Doctor {
    private String doctorName, specialization;

    public Doctor(String doctorName, String specialization) {
        this.doctorName = doctorName;
        this.specialization = specialization;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void displayDoctorWithInfo() {
        System.out.println("Doctor: " + doctorName + " | Specialization: " + specialization);
        System.out.println("Info: " + getSpecializationInfo(specialization));
        System.out.println("--------------------------");
    }

    public static String getSpecializationInfo(String specialization) {
        switch (specialization.toLowerCase()) {
            case "cardiology":
                return "Deals with disorders of the heart.";
            case "neurology":
                return "Focuses on the brain and nervous system.";
            case "orthopedics":
                return "Specializes in bones and joints.";
            case "pediatrics":
                return "Cares for infants, children, and adolescents.";
            case "dermatology":
                return "Treats skin, hair, and nail issues.";
            case "general":
                return "General checkups and basic treatments.";
            default:
                return "Specialist in " + specialization + ".";
        }
    }
}

class Patient {
    private String id, name, gender, address, disease, roomType;
    private int age, daysAdmitted;
    private Doctor doctor;

    public Patient(String id, String name, int age, String gender, String address, String disease,
                   String roomType, int daysAdmitted, Doctor doctor) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.disease = disease;
        this.roomType = roomType;
        this.daysAdmitted = daysAdmitted;
        this.doctor = doctor;
    }

    public String getId() {
        return id;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void displayPatient() {
        System.out.println("Patient ID: " + id);
        System.out.println("Name: " + name + " | Age: " + age + " | Gender: " + gender);
        System.out.println("Address: " + address + " | Disease: " + disease);
        System.out.println("Doctor: " + doctor.getDoctorName());
        System.out.println("Room Type: " + roomType + " | Days Admitted: " + daysAdmitted);
        System.out.println("--------------------------");
    }

    public double calculateBill() {
        int roomRate;
        switch (roomType.toLowerCase()) {
            case "general": roomRate = 1500; break;
            case "semi-private": roomRate = 2500; break;
            case "private": roomRate = 3500; break;
            default: roomRate = 0;
        }
        double base = roomRate * daysAdmitted + 500;
        double gst = base * 0.05;
        return base + gst;
    }
}

public class Hospital_management_system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Doctor> doctors = new ArrayList<>();
        ArrayList<Patient> patients = new ArrayList<>();

        // Default Doctors
       
        while (true) {
            System.out.println("\n=== Hospital Management Menu ===");
            System.out.println("1. View Doctors");
            System.out.println("2. Add Doctor");
            System.out.println("3. Add Patient");
            System.out.println("4. View Patients");
            System.out.println("5. Update Patient");
            System.out.println("6. Delete Patient");
            System.out.println("7. View Patients by Doctor");
            System.out.println("8. View Patient Count Per Doctor");
            System.out.println("9. Calculate Bill for a Patient");
            System.out.println("10. Exit");
            System.out.print("Enter choice: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    if (doctors.isEmpty()) System.out.println("No doctors.");
                    else for (Doctor d : doctors) d.displayDoctorWithInfo();
                    break;

                case 2:
                    System.out.print("Doctor Name: ");
                    String dn = sc.nextLine();
                    System.out.print("Specialization: ");
                    String sp = sc.nextLine();
                    doctors.add(new Doctor(dn, sp));
                    System.out.println("Doctor added.");
                    break;

                case 3:
                    if (doctors.isEmpty()) {
                        System.out.println("No doctors available. Please add a doctor first.");
                        break;
                    }
                    System.out.println("Available Doctors:");
                    for (Doctor d : doctors) d.displayDoctorWithInfo();

                    System.out.print("Patient ID: ");
                    String id = sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Age: ");
                    int age = Integer.parseInt(sc.nextLine());
                    System.out.print("Gender: ");
                    String gender = sc.nextLine();
                    System.out.print("Address: ");
                    String addr = sc.nextLine();
                    System.out.print("Disease: ");
                    String disease = sc.nextLine();
                    System.out.print("Doctor Name: ");
                    String docName = sc.nextLine();

                    Doctor foundDoc = null;
                    for (Doctor d : doctors) {
                        if (d.getDoctorName().equalsIgnoreCase(docName)) {
                            foundDoc = d;
                            break;
                        }
                    }

                    if (foundDoc == null) {
                        System.out.println("Doctor not found.");
                        break;
                    }

                    System.out.print("Room Type (general/semi-private/private): ");
                    String room = sc.nextLine();
                    System.out.print("Days Admitted: ");
                    int days = Integer.parseInt(sc.nextLine());

                    patients.add(new Patient(id, name, age, gender, addr, disease, room, days, foundDoc));
                    System.out.println("Patient added.");
                    break;

                case 4:
                    if (patients.isEmpty()) System.out.println("No patients.");
                    else for (Patient p : patients) p.displayPatient();
                    break;

                case 5:
                    System.out.print("Patient ID to update: ");
                    String updateId = sc.nextLine();
                    System.out.println("Updating not implemented in this version.");
                    break;

                case 6:
                    System.out.print("Enter Patient ID to delete: ");
                    String deleteId = sc.nextLine();
                    boolean removed = patients.removeIf(p -> p.getId().equals(deleteId));
                    System.out.println(removed ? "Deleted successfully." : "Patient not found.");
                    break;

                case 7:
                    System.out.print("Enter Doctor Name: ");
                    String searchDoc = sc.nextLine();
                    boolean found = false;
                    for (Patient p : patients) {
                        if (p.getDoctor().getDoctorName().equalsIgnoreCase(searchDoc)) {
                            p.displayPatient();
                            found = true;
                        }
                    }
                    if (!found) System.out.println("No patients for that doctor.");
                    break;

                case 8:
                    for (Doctor d : doctors) {
                        long count = patients.stream().filter(p -> p.getDoctor() == d).count();
                        System.out.println(d.getDoctorName() + ": " + count + " patient(s)");
                    }
                    break;

                case 9:
                    System.out.print("Enter Patient ID to calculate bill: ");
                    String billId = sc.nextLine();
                    boolean billed = false;
                    for (Patient p : patients) {
                        if (p.getId().equals(billId)) {
                            double total = p.calculateBill();
                            System.out.printf("Total Bill for Patient %s: %.2f\n", p.getId(), total);
                            billed = true;
                            break;
                        }
                    }
                    if (!billed) System.out.println("Patient not found.");
                    break;

                case 10:
                    System.out.println("Exiting. Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
