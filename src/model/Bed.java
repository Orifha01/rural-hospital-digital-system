package model;

public class Bed {

    private String bedId;
    private String status;

    // Relationship
    private Patient patient;

    public Bed(String bedId) {
        this.bedId = bedId;
        this.status = "Available";
    }

    public void assignBed(Patient patient) {
        this.patient = patient;
        this.status = "Occupied";
    }

    public void releaseBed() {
        this.patient = null;
        this.status = "Available";
    }
}
