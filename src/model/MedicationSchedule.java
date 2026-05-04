package model;

public class MedicationSchedule {

    private String scheduleId;
    private String medicationName;
    private String dosage;
    private String frequency;

    // Relationship
    private Patient patient;

    public MedicationSchedule(String scheduleId, String medicationName, String dosage, String frequency) {
        this.scheduleId = scheduleId;
        this.medicationName = medicationName;
        this.dosage = dosage;
        this.frequency = frequency;
    }

    public void scheduleMedication() {
        System.out.println("Medication scheduled");
    }

    public void markTaken() {
        System.out.println("Medication taken");
    }
}
