package bai_thi_module_2.view;

import bai_thi_module_2.common.ValidateInput;
import bai_thi_module_2.entity.NormalPatients;
import bai_thi_module_2.entity.Person;
import bai_thi_module_2.entity.VipPatients;

import java.util.List;
import java.util.Scanner;

public class PatientsView {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayListPatients(List<Person> personList) {
        for (Person person : personList) {
            if (person instanceof NormalPatients) {
                NormalPatients normalPatients = (NormalPatients) person;
                System.out.println(normalPatients.getId() + "," + normalPatients.getMedicalID() + "," + normalPatients.getNamePatient() +
                        "," + normalPatients.getDateOfAdmission() + "," + normalPatients.getDateDischarge() + "," + normalPatients.getReason() +
                        "," + normalPatients.getExpense());
            } else if (person instanceof VipPatients) {
                VipPatients vipPatients = (VipPatients) person;
                System.out.println(vipPatients.getId() + "," + vipPatients.getMedicalID() +
                        "," + vipPatients.getNamePatient() + "," + vipPatients.getDateOfAdmission() + "," +
                        vipPatients.getDateDischarge() + "," + vipPatients.getReason() + "," +
                        "-----" + "," + vipPatients.getType() + "," + vipPatients.getDuration());
            }
        }
    }

    public Person inputNormalPatients() {
        System.out.println("Nhập Mã Bệnh Án (VD: BA-XXX): ");
        String medicalID = ValidateInput.validateInput("^BA-\\d{3}$", "" +
                "Mã Bệnh Án Sai Định Dạng.Nhập Lại Như Ví Dụ");
        System.out.println("Nhập Tên Bệnh Nhân (VD: BN-XXX): ");
        String namePatient = ValidateInput.validateInput("^BN-\\d{3}$", "" +
                "Mã Bệnh Nhân Sai Định Dạng.Nhập Lại Như Ví Dụ");
        System.out.println("Nhập Ngày Nhập Viện(VD: dd/MM/yyyy)");
        String dateOfAdmission = scanner.nextLine();
        System.out.println("Nhập Ngày Ra Viên(VD:dd/MM/yyyy");
        String dateDischarge = scanner.nextLine();
        System.out.println("Nhập Lý Do Nhập Viện");
        String reason = scanner.nextLine();
        System.out.println("Nhập chi phí nhập viện");
        long expense = ValidateInput.validateInteger(0, Integer.MAX_VALUE, "Chi Phí Phải Lớn Hơn 0");
        return new NormalPatients(medicalID, namePatient, dateOfAdmission, dateDischarge, reason, expense);
    }

    public Person inputVipPatients() {
        System.out.println("Nhập Mã Bệnh Án (VD: BA-XXX): ");
        String medicalID = ValidateInput.validateInput("^BA-\\d{3}$", "" +
                "Mã Bệnh Án Sai Định Dạng.Nhập Lại Như Ví Dụ");
        System.out.println("Nhập Tên Bệnh Nhân (VD: BN-XXX): ");
        String namePatient = ValidateInput.validateInput("^BN-\\d{3}$", "" +
                "Mã Bệnh Nhân Sai Định Dạng.Nhập Lại Như Ví Dụ");
        System.out.println("Nhập Ngày Nhập Viện(VD: dd/MM/yyyy)");
        String dateOfAdmission = scanner.nextLine();
        System.out.println("Nhập Ngày Ra Viên(VD:dd/MM/yyyy");
        String dateDischarge = scanner.nextLine();
        System.out.println("Nhập Lý Do Nhập Viện");
        String reason = scanner.nextLine();
        System.out.println("Nhập Loại Vip ( 1-3)");
        int type = ValidateInput.validateInteger(0, 3, "Chọn Vip Cấp 1 -Cấp 3");
        System.out.println("Nhập Thời Giạn Vip");
        String duration = scanner.nextLine();
        return new VipPatients(medicalID, namePatient, dateOfAdmission, dateDischarge, reason, type, duration);

    }


    public static boolean comFirm() {
        String string;
        do {
            System.out.println("Nhập Y để Xóa N để Hủy");
            string = scanner.nextLine();
        } while (!string.equalsIgnoreCase("Y") && !string.equalsIgnoreCase("N"));
        if (string.equalsIgnoreCase("Y")) {
            return true;
        } else {
            return false;
        }
    }
}
