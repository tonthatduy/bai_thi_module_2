package bai_thi_module_2.view;

import bai_thi_module_2.entity.VipPatients;

import java.util.List;

public class VipView {
    public static void displayVipList(List<VipPatients> patients) {
        for (int i = 0; i < patients.size(); i++) {
            System.out.println(patients.get(i));
        }
    }
}
