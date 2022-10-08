import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String op1 = "+", op2 = "-", op3 = "*", op4 = "/", op5 = "кв.урав.";
        Scanner in = new Scanner(System.in);

        /////////////////////////////////////////////////////////
        System.out.println("Введите первое число: ");
        double num1 = in.nextInt();

        System.out.println("Введите второе число: ");
        double num2 = in.nextInt();

        System.out.println("Введите операцию (+,-,/,*,кв.урав.): ");
        String operation = (String)in.next();
        /////////////////////////////////////////////////////////

        System.out.println(operation);
        if (operation.equals(op1)){ // Сложение.
            double result = num1 + num2;
            System.out.println("Результат сложения: " + result);
        } else
            if (operation.equals(op2)){ // Вычитание.
                double result = num1 - num2;
                System.out.println("Результат вычитания: " + result);
            } else
                if (operation.equals(op3)){ // Умножение.
                    double result = num1 * num2;
                    System.out.println("Результат умножения: " + result);
                } else
                    if (operation.equals(op4)){ // Деление.
                        double result = num1 /  num2;
                        System.out.println("Результат деления: " + result);
                    } else
                        if (operation.equals(op5)){ // Квадратное уравнение.
                            System.out.println("Первое(a) и второе(b) числа введены ( " + num1 + ", " + num2 + "). Введите третье число(c): ");
                            double num3 = in.nextInt();
                            double d = num2 * num2 - 4 * num1 * num3;
                            if (d > 0){ // Два корня.
                                double x1 = (-num2 + Math.sqrt(d)) / (2 * num1);
                                double x2 = (-num2 - Math.sqrt(d)) / (2 * num1);
                                System.out.println("Корни уравнения: x1= " + x1 + ", x2= " + x2);
                            } else
                                if (d == 0){ // Один корень.
                                    double x = -num2 / (2 * num1);
                                    System.out.println("Корень уравнения x= " + x);
                                }
                            else System.out.println("Уравнение не имеет корней.");
                        }
        else System.out.println("Ошибка ввода, попробуйте еще раз.");
    }
}