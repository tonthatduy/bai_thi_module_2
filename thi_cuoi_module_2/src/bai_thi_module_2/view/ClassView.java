package bai_thi_module_2.view;

import java.util.Scanner;

public class ClassView {
    private static Scanner scanner = new Scanner(System.in);

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
