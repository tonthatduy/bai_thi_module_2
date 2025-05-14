package bai_thi_module_2.controller;

import bai_thi_module_2.common.ValidateInput;

import java.util.Scanner;

public class Controller {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {
        menuLoop:
        do {
            System.out.println("---------Menu---------");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management ");
            System.out.println("4. Booking Management ");
            System.out.println("5. Promotion Management ");
            System.out.println("6. Exit");
            int choice = ValidateInput.validateMenuChoice("Chọn trong khoảng 1-6", 1, 6);
            switch (choice) {
                case 1 -> {
                }
                case 2 -> {
                }
                case 3 -> {
                }
                case 4 -> {
                }
                case 5 -> {
                }
                case 6 -> {
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
            System.out.println("===Thêm mới ===");
            System.out.println("1.  Thêm ");
            System.out.println("2.  Thêm ");
            System.out.println("3.  Quay Trở Lại Menu Chính");
            int choice = ValidateInput.validateMenuChoice("Chọn Trong Khoảng 1-3", 1, 3);
            switch (choice) {
                case 1 -> {
                    System.out.println("===Thêm ===");
                }
                case 2 -> {
                    System.out.println("===Thêm ===");
                }
                case 3 -> {
                    System.out.println("===Trở Lại Menu Chính===");
                    return;
                }
                default -> {
                    System.out.println("Không Hợp Lệ!");
                }
            }
        } while (true);
    }
}
