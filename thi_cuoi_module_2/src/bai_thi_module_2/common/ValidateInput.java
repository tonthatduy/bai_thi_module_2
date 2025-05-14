package bai_thi_module_2.common;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateInput {
    private static Scanner scanner = new Scanner(System.in);

    public static String validateInput(String regex, String errorMessage) {
        while (true) {
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Không được để rỗng. Nhập lại");
                continue;
            }
            if (Pattern.matches(regex, input)) {
                return input;
            }
            System.err.println(errorMessage);
        }
    }

    public static int validateMenuChoice(String prompt, int min, int max) {
        while (true) {
            System.out.println(prompt);
            String input = scanner.nextLine();
            if (input.trim().isEmpty()) {
                System.err.println("Không được để trống. Nhập lại trong khoảng " + min + " - " + max + ".");
                continue;
            }
            try {
                int num = Integer.parseInt(input);
                if (num < min || num > max) {
                    System.err.println("Nhập lại trong khoảng " + min + " - " + max + ".");
                } else {
                    return num;
                }
            } catch (NumberFormatException e) {
                System.err.println("Nhập lại. Phải là số");
            }
        }
    }

    public static double validateDouble(double min, double max, String errorMessage) {
        while (true) {
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Không được để trống. Hãy thử lại!");
                continue;
            }
            try {
                double number = Double.parseDouble(scanner.nextLine());
                if (number > 0 && number >= min && number <= max) {
                    return number;
                } else {
                    System.err.println(errorMessage);
                }
            } catch (NumberFormatException e) {
                System.err.println("Phải nhập số");

            }

        }
    }

    public static int validateInteger(int min, int max, String errorMessage) {
        while (true) {
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Không được để trống. Hãy thử lại!");
                continue;
            }
            try {
                int number = Integer.parseInt(scanner.nextLine());
                if (number > 0 && number >= min && number <= max) {
                    return number;
                } else {
                    System.err.println(errorMessage);
                }
            } catch (NumberFormatException e) {
                System.err.println("Phải nhập số.Nhập lại!");
            }
        }
    }

    public static int validatePositiveInt(String errorMessage) {
        while (true) {
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Không được để trống. Hãy thử lại!");
                continue;
            }
            try {
                int value = Integer.parseInt(input);
                if (value >= 0) {
                    return value;
                } else {
                    System.err.println(errorMessage);
                }
            } catch (NumberFormatException e) {
                System.err.println("Lỗi, Phải Nhập Số, Nhập Lại!");
            }
        }
    }

}
