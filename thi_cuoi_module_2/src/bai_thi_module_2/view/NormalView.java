package bai_thi_module_2.view;

import bai_thi_module_2.entity.NormalPatients;

import java.util.List;
import java.util.Scanner;

public class NormalView {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayNormalList(List<NormalPatients> normalPatients) {
        for (int i = 0; i < normalPatients.size(); i++) {
            System.out.println(normalPatients.get(i));
        }

    }

}
