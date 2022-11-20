import java.util.Scanner;

public class PrintingShapes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Яку фігуру вивести? 1 - прямокутник, 2 - прямокутний трикутник, 3 - рівносторонній трикутник, 4 - ромб");
        System.out.println("Введіть номер фігури");
        int figureNumber = scanner.nextInt();
        switch (figureNumber) {
            case 1: {
                System.out.println("Введіть довжину a");
                int a = scanner.nextInt();
                System.out.println("Введіть ширину b");
                int b = scanner.nextInt();
                for (int i = 0; i < b; i++) {
                    for (int j = 0; j < a; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            }
            case 2: {
                System.out.println("Введіть катет a");
                int a = scanner.nextInt();
                for (int i = 0; i < a; i++) {
                    for (int j = 0; j < a; j++) {
                        if (j <= i) System.out.print("*");
                        else System.out.print(" ");
                    }
                    System.out.print("\n");
                }
                break;
            }
            case 3: {
                System.out.println("Введіть сторону a (непарне число)");
                int a = scanner.nextInt();
                if (a % 2 != 0) {
                    for (int i = 0; i <= a / 2; i++) {
                        for (int j = 0; j < a; j++) {
                            if (j < (a / 2 - i) || j > (a / 2 + i)) System.out.print(" ");
                            else System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                } else System.out.println("Ви ввели парне число");

                break;
            }
            case 4: {
                System.out.println("Введіть діагональ a (непарне число)");
                int a = scanner.nextInt();
                if (a % 2 != 0) {
                    for (int i = 0; i <= a / 2; i++) {
                        for (int j = 0; j < a; j++) {
                            if (j < (a / 2 - i) || j > (a / 2 + i)) System.out.print(" ");
                            else System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    for (int k = a / 2; k > 0; k--) {
                        for (int m = 0; m < a; m++) {
                            if (m <= (a / 2 - k) || m >= (a / 2 + k)) System.out.print(" ");
                            else System.out.print("*");
                        }
                        System.out.print("\n");
                    }

                } else System.out.println("Ви ввели парне число");

                break;
            }
            default: {
                System.out.println("Фігури за такою цифрою не існує");
                break;
            }

        }
    }
}
