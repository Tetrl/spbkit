import java.util.Scanner;

public class secondProject {

    public static void main(String[] args) {

        calculator();

    }

    static void calculator(){
        Scanner scan = new Scanner(System.in);
        int check = 1;
        while (check == 1) {

            /////////////////////////////////////////////////////////
            System.out.println("Введите операцию (+,-,/,*,**): ");
            String operation = scan.next();
            System.out.println("Введите первое число: ");  // Не понимаю почему при вводе дробного числа (нап.: 1.1) выдает ошибку, пробовал менять локаль, как посмотрел на форумах, не помогает.
            double num1 = scan.nextInt();
            System.out.println("Введите второе число: ");
            double num2 = scan.nextInt();
            /////////////////////////////////////////////////////////

            if (operation.equals("+")) { // Сложение.
                double result = num1 + num2;
                System.out.println("Результат сложения: " + result);
            } else if (operation.equals("-")) { // Вычитание.
                double result = num1 - num2;
                System.out.println("Результат вычитания: " + result);
            } else if (operation.equals("*")) { // Умножение.
                double result = num1 * num2;
                System.out.println("Результат умножения: " + result);
            } else if (operation.equals("/")) { // Деление.
                double result = num1 / num2;
                System.out.println("Результат деления: " + result);
            } else if (operation.equals("**")) { // Квадратное уравнение.
                System.out.println("Первое(a) и второе(b) числа введены ( " + num1 + ", " + num2 + "). Введите третье число(c): ");
                double num3 = scan.nextInt();
                double d = num2 * num2 - 4 * num1 * num3;
                if (d > 0) { // Два корня.
                    double x1 = (-num2 + Math.sqrt(d)) / (2 * num1);
                    double x2 = (-num2 - Math.sqrt(d)) / (2 * num1);
                    System.out.println("Корни уравнения: x1= " + x1 + ", x2= " + x2);
                } else if (d == 0) { // Один корень.
                    double x = -num2 / (2 * num1);
                    System.out.println("Корень уравнения x= " + x);
                } else System.out.println("Уравнение не имеет корней.");
            } else System.out.println("Ошибка ввода, попробуйте еще раз.");

            ////////////////////////////////////////////////////////////////////
            System.out.println("Еще раз? Если хотите закончить напишите СТОП.");
            System.out.println("Если продолжить - любой символ.");
            String a = scan.next();
            if (a.equals("СТОП") || a.equals("стоп") || a.equals("Стоп")){ check = 0;}
            ////////////////////////////////////////////////////////////////////
        }
    }
}