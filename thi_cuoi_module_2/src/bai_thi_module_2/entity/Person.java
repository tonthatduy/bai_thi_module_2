package bai_thi_module_2.entity;

import bai_thi_module_2.common.UpdateID;

public abstract class Person {
    private int id;
    private String medicalID;
    private String namePatient;
    private String dateOfAdmission;
    private String dateDischarge;
    private String reason;

    public Person(String medicalID, String namePatient, String dateOfAdmission, String dateDischarge, String reason) {
        this.id = ++UpdateID.currentId;
        this.medicalID = medicalID;
        this.namePatient = namePatient;
        this.dateOfAdmission = dateOfAdmission;
        this.dateDischarge = dateDischarge;
        this.reason = reason;
    }

    public Person(int id, String medicalID, String name, String dateOfAdmission, String dateDischarge, String reason) {
        this.id = id;
        this.medicalID = medicalID;
        this.namePatient = name;
        this.dateOfAdmission = dateOfAdmission;
        this.dateDischarge = dateDischarge;
        this.reason = reason;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMedicalID() {
        return medicalID;
    }

    public void setMedicalID(String medicalID) {
        this.medicalID = medicalID;
    }

    public String getNamePatient() {
        return namePatient;
    }

    public void setNamePatient(String namePatient) {
        this.namePatient = namePatient;
    }

    public String getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(String dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }

    public String getDateDischarge() {
        return dateDischarge;
    }

    public void setDateDischarge(String dateDischarge) {
        this.dateDischarge = dateDischarge;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", MedicalID='" + medicalID + '\'' +
                ", Name Patient='" + namePatient + '\'' +
                ", Date Of Admission='" + dateOfAdmission + '\'' +
                ", Date Discharge='" + dateDischarge + '\'' +
                ", Reason='" + reason + '\'' +
                '}';
    }

    public String getToFileCSV() {
        return this.id + "," + this.medicalID + "," + this.namePatient + "," + this.dateOfAdmission + ","
                + this.dateDischarge + "," + reason;
    }
}
