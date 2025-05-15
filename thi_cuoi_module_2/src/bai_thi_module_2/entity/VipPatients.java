package bai_thi_module_2.entity;

public class VipPatients extends Person {
    private int type;
    private String duration;

    public VipPatients(int id, String medicalID, String name, String dateOfAdmission, String dateDischarge, String reason, int type, String duration) {
        super(id, medicalID, name, dateOfAdmission, dateDischarge, reason);
        this.type = type;
        this.duration = duration;
    }

    public VipPatients(String medicalID, String namePatient, String dateOfAdmission, String dateDischarge, String reason, int type, String duration) {
        super(medicalID, namePatient, dateOfAdmission, dateDischarge, reason);
        this.type = type;
        this.duration = duration;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "VipPatients{" + super.toString() +
                "Type=' Cấp " + type + '\'' +
                ", Duration='" + duration + '\'' +
                '}';
    }

    public String getToFileCSVVipPatients() {
        return super.getToFileCSV() + ",," + this.type + "," + this.duration;
    }
}
