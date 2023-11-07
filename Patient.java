public class Patient {
    // Data members
    private String name;
    private int age;
    private String diagnosis;

    // Default Constructor
    public Patient() {
        name = "Robin";
        age = 30;
        diagnosis = "No diagnosis yet";
    }

    // Constructor Overloading
    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
        diagnosis = "No diagnosis yet";
    }

    public Patient(String name, int age, String diagnosis) {
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    // Access Specifier: Public method to set the diagnosis
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    // Access Specifier: Public method to get patient information
    public String getPatientInfo() {
        return "Name: " + name + "\nAge: " + age + "\nDiagnosis: " + diagnosis;
    }

    // Method Overloading: Different methods to record patient progress
    public void recordProgress() {
        System.out.println("Patient " + name + " is making progress.");
    }

    public void recordProgress(String progressNote) {
        System.out.println("Progress note for " + name + ": " + progressNote);
    }

    public void recordProgress(String progressNote, int happinessLevel) {
        System.out.println("Progress note for " + name + ": " + progressNote);
        System.out.println("Happiness Level: " + happinessLevel);
    }

    public static void main(String[] args) {
        // Creating patient objects using different constructors
        Patient patient1 = new Patient();
        Patient patient2 = new Patient("Alice", 30);
        Patient patient3 = new Patient("Bob", 25, "Anxiety");

        // Setting diagnosis for patient1
        patient1.setDiagnosis("Depression");

        // Displaying patient information
        System.out.println("Patient 1 Mental health state:\n" + patient1.getPatientInfo());
        System.out.println("\nPatient 2 Mental health state:\n" + patient2.getPatientInfo());
        System.out.println("\nPatient 3 Mental health state:\n" + patient3.getPatientInfo());

        // Recording patient progress using method overloading
        patient1.recordProgress();
        patient2.recordProgress("Patient is feeling better.");
        patient3.recordProgress("Patient is in a good mental stage after the treament he can handel his anxitey efficiently.", 80);
    }
}
