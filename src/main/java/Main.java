import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            // Ввод трех целых чисел
            System.out.println("Введите три целых числа:");
            System.out.print("a = ");
            int a = scanner.nextInt();
            scanner.nextLine();
            System.out.print("b = ");
            int b = scanner.nextInt();
            scanner.nextLine();
            System.out.print("c = ");
            int c = scanner.nextInt();
            scanner.nextLine();
            // Проверка на треугольник по неравенству треугольника
            if (a + b <= c || b + c <= a || c + a <= b) {
                System.out.println("a, b и c не являются сторонами треугольника");
                // Проверка на равносторонний треугольник
            } else if (a == b && b == c) {
                System.out.println("a, b и c являются сторонами равностороннего треугольника");
                // Проверка на равнобедренный треугольник
            } else if (a == b || b == c || c == a) {
                System.out.println("a, b и c являются сторонами равнобедренного треугольника");
                // Проверка на прямоугольный треугольник
            } else if (a * a + b * b == c * c || b * b + c * c == a * a || c * c + a * a == b * b) {
                System.out.println("a, b и c являются сторонами прямоугольного треугольника");
                // Во всех остальных случаях
            } else {
                System.out.println("a, b и c являются сторонами обычного треугольника");
            }
            scanner.close();
        // Обработка ошибки
        } catch (InputMismatchException e) {
            System.err.println("Ошибка: " + e);
        }
    }
}
