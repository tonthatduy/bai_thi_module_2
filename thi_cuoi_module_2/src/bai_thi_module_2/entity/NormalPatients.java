package bai_thi_module_2.entity;

public class NormalPatients extends Person {
    private long expense;


    public NormalPatients(int id, String medicalID, String name, String dateOfAdmission, String dateDischarge, String reason, long expense) {
        super(id, medicalID, name, dateOfAdmission, dateDischarge, reason);
        this.expense = expense;
    }

    public NormalPatients(String medicalID, String namePatient, String dateOfAdmission, String dateDischarge, String reason, long expense) {
        super(medicalID, namePatient, dateOfAdmission, dateDischarge, reason);
        this.expense = expense;
    }

    public long getExpense() {
        return expense;
    }

    public void setExpense(long expense) {
        this.expense = expense;
    }

    @Override
    public String toString() {
        return "NormalPatients{" +
                super.toString() +
                "Expense=" + expense +
                '}';
    }

    public String getToFileCSVNormalPatients() {
        return super.getToFileCSV() + "," + this.expense + ",,";
    }
}
