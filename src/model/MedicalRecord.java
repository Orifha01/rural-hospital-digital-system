package model;

public class MedicalRecord {

    private String recordId;
    private String diagnosis;
    private String treatment;
    private String notes;

    // Relationships
    private Patient patient;
    private Doctor doctor;

    public MedicalRecord(String recordId, String diagnosis, String treatment, String notes) {
        this.recordId = recordId;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.notes = notes;
    }

    public void addRecord() {
        System.out.println("Record added");
    }

    public void updateRecord() {
        System.out.println("Record updated");
    }
}
