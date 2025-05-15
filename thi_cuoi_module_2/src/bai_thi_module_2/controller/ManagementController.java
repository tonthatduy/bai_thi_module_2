package bai_thi_module_2.controller;

import bai_thi_module_2.common.ValidateInput;
import bai_thi_module_2.entity.NormalPatients;
import bai_thi_module_2.entity.Person;
import bai_thi_module_2.service.*;
import bai_thi_module_2.view.NormalView;
import bai_thi_module_2.view.PatientsView;
import bai_thi_module_2.view.VipView;

import java.util.List;
import java.util.Scanner;

public class ManagementController {
    private static Scanner scanner = new Scanner(System.in);
    private static IPatientsService patientsService = new PaitientsService();
    private static INormalService normalService = new NormalService();
    private static IVipService vipService = new VipService();

    public static void displayMainMenu() {
        menuLoop:
        do {
            System.out.println("---------Quản Lý Bệnh Án---------");
            System.out.println("1. Thêm Mới Bệnh Án");
            System.out.println("2. Xóa Bệnh Án");
            System.out.println("3. Xem Danh Sách Các Bệnh Án ");
            System.out.println("4. Exit");
            int choice = ValidateInput.validateMenuChoice("Chọn trong khoảng 1-4", 1, 4);
            switch (choice) {
                case 1 -> {
                    add();
                }
                case 2 -> {

                }
                case 3 -> {
                    System.out.println("=====Danh Sách Các Bệnh Án=====");
                    display();
                }
                case 4 -> {
                    System.out.println("----Thanks----");
                    break menuLoop;
                }
                default -> {
                    System.out.println("No Choice!");
                }
            }
        } while (true);
    }

    private static void add() {
        do {
            System.out.println("===Thêm mới Bệnh Án===");
            System.out.println("1.  Thêm Bệnh Án Thường");
            System.out.println("2.  Thêm Bệnh Án Vip");
            System.out.println("3.  Trở Lại Menu Chính");
            int choice = ValidateInput.validateMenuChoice("Chọn Trong Khoảng (1-3)", 1, 3);
            switch (choice) {
                case 1 -> {
                    System.out.println("===Thêm Khách Hàng Việt nam");
                }
                case 2 -> {
                    System.out.println("===Thêm Khách Hàng Quốc Tế");
                }
                case 3 -> {
                    System.out.println("Trở Lại Menu Chính");
                    return;
                }
                default -> {
                    System.out.println("Không Hợp Lệ!");
                }
            }

        } while (true);
    }

    private static void display() {
        do {
            System.out.println("===Hiển Thị Bệnh Án===");
            System.out.println("1.  Hiển Thị Bệnh Án Thường");
            System.out.println("2.  Hiển Thị Bệnh Án Vip");
            System.out.println("3.  Trở Lại Menu CHính");
            int choice = ValidateInput.validateMenuChoice("Chọn Trong Khoảng (1-3)", 1, 3);
            switch (choice) {
                case 1 -> {
                    System.out.println("===Hiển Thị Bệnh Án Thường");
                    NormalView.displayNormalList(normalService.findAll());
                }
                case 2 -> {
                    System.out.println("===Hiển Thị Bệnh Án Vip");
                    VipView.displayVipList(vipService.findAll());
                }
                case 3 -> {
                    System.out.println("Trở Lại Menu Chính");
                    return;
                }
                default -> {
                    System.out.println("Không Hợp Lệ!");
                }
            }

        } while (true);
    }


//    private static void addNormalPatients() {
//        NormalPatients person = new PatientsView().inputNormalPatients();
//        patientsService.add(person);
//        System.out.println("Thêm Mới Thành Công");
}

//    private static void addVipPatients() {
//        Person person = new PatientsView().inputVipPatients();
//        patientsService.add(person);
//        System.out.println("Thêm Mới Thành Công");
//
//    }

//}
