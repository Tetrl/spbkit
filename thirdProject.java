import java.util.Scanner;

public class thirdProject {

    public static void main(String[] args){opt();}
    static void opt(){
        Scanner scan = new Scanner(System.in);
        int check = 1;
        int slc1 = 1, slc2 = 2, slc3 = 3, slc4 = 4, slc5 = 5, slc6 = 6, slc7 = 7, slc8 = 8, slc9 = 9, slc10 = 10, slc11 = 11;

        while (check == 1) {
            ////////////////////////////////////////////////////////////////////
            System.out.println("Список доступных программ:");
            System.out.println();
            System.out.println("1. Значение указанных выражений.");
            System.out.println("2. Равны-ли четыре числа?");
            System.out.println("3. Самые большие числа массива."); // Не сделано, доделать позже.
            System.out.println("4. Самые маленькие числа массива."); // Не сделано, доделать позже.
            System.out.println("5. Числа, превышающие среднее значение чисел."); // Не сделано, доделать позже.
            System.out.println("6. Умножение без умножения.");
            System.out.println("7. Разбиение на четные и нечетные."); // Не сделано, доделать позже.
            System.out.println("8. Из Фаренгейта в Цельсия.");
            System.out.println("9. Индекс массы тела.");
            System.out.println("10. Квадрат, куб и четвёртая степень числа.");
            System.out.println("11. Существует-ли треугольник?");
            System.out.println();
            System.out.println("Выберите номер программы:");
            int select = scan.nextInt();
            ////////////////////////////////////////////////////////////////////
            if (select == slc1) {first(); check = 0;}
            else if (select == slc2) {second(); check = 0;}
            else if (select == slc3) {third(); check = 0;}
            else if (select == slc4) {fourth(); check = 0;}
            else if (select == slc5) {fifth(); check = 0;}
            else if (select == slc6) {sixth(); check = 0;}
            else if (select == slc7) {seventh(); check = 0;}
            else if (select == slc8) {eighth(); check = 0;}
            else if (select == slc9) {ninth(); check = 0;}
            else if (select == slc10) {tenth(); check = 0;}
            else if (select == slc11) {eleventh(); check = 0;}
            else System.out.println("Такой программы не существует. Попробуйте еще раз.");
        }
    }

    static void first(){
        System.out.println("Вы выбрали первую программу:");
        Scanner scan = new Scanner(System.in);
        int check = 1;
        while (check == 1){
            double res1 = 101+0/3;
            double res2 = 3.0e-6*10000000.1;
            boolean res3 = true && true;
            boolean res4 = false && true;
            boolean res5 = (false&&false)|(true&&true);
            boolean res6 = (false|false)&&(true&&true);
            System.out.println("101+0/3 = " + res1);
            System.out.println("3.0e-6*10000000.1 = " + res2);
            System.out.println("true && true = " + res3);
            System.out.println("false && true = " + res4);
            System.out.println("(false&&false)|(true&&true) = " + res5);
            System.out.println("(false|false)&&(true&&true) = " + res6);
            ///////////////////////////////////////////////////////////
            System.out.println();
            System.out.println("Попробовать снова? Введите ДА.");
            System.out.println("В начало? Введите любой символ.");
            String rtn = scan.next();
            if (rtn.equals("ДА") || rtn.equals("да") || rtn.equals("Да")) {check = 1;} else {check = 0; opt();}
            ///////////////////////////////////////////////////////////
        }
    }

    static void second(){
        System.out.println("Вы выбрали вторую программу:");
        Scanner scan = new Scanner(System.in);
        int check = 1;
        while (check == 1){
            System.out.println("Введите 4 числа, чтобы проверить равны-ли все они между собой:");
            System.out.println("Первое число: "); double n1 = scan.nextInt();
            System.out.println("Второе число: "); double n2 = scan.nextInt();
            System.out.println("Третье число: "); double n3 = scan.nextInt();
            System.out.println("Четвертое число: "); double n4 = scan.nextInt();
            if (n1 == n2 && n1 == n3 && n1 == n4) {System.out.println("Все числа равны между собой.");}
            else {System.out.println("Числа не равны между собой.");}
            ///////////////////////////////////////////////////////////
            System.out.println();
            System.out.println("Попробовать снова? Введите ДА.");
            System.out.println("В начало? Введите любой символ.");
            String rtn = scan.next();
            if (rtn.equals("ДА") || rtn.equals("да") || rtn.equals("Да")) {check = 1;} else {check = 0; opt();}
            ///////////////////////////////////////////////////////////
        }
    }

    static void third(){
        System.out.println("Вы выбрали третью программу:");
        Scanner scan = new Scanner(System.in);
        int check = 1;
        while (check == 1){
            System.out.println("Чтобы получить самые большие числа массива, впишите нужное количество (до 15) для вывода: ");
            int amount = scan.nextInt();
            int array[] = {53, 76, 8, 17, 99, 28, 4, 68, 75, 7, 78, 3, 12, 93, 23};
            System.out.println("Я пока не работаю(");
            System.out.println("Меня доделают позже.");

            ///////////////////////////////////////////////////////////
            System.out.println();
            System.out.println("Попробовать снова? Введите ДА.");
            System.out.println("В начало? Введите любой символ.");
            String rtn = scan.next();
            if (rtn.equals("ДА") || rtn.equals("да") || rtn.equals("Да")) {check = 1;} else {check = 0; opt();}
            ///////////////////////////////////////////////////////////
        }
    }

    static void fourth(){
        System.out.println("Вы выбрали четвертую программу:");
        Scanner scan = new Scanner(System.in);
        int check = 1;
        while (check == 1){
            System.out.println("Чтобы получить самые маленькие числа массива, впишите нужное количество (до 15) для вывода: ");
            int amount = scan.nextInt();
            int array[] = {53, 76, 8, 17, 99, 28, 4, 68, 75, 7, 78, 3, 12, 93, 23};
            System.out.println("Я пока не работаю(");
            System.out.println("Меня доделают позже.");

            ///////////////////////////////////////////////////////////
            System.out.println();
            System.out.println("Попробовать снова? Введите ДА.");
            System.out.println("В начало? Введите любой символ.");
            String rtn = scan.next();
            if (rtn.equals("ДА") || rtn.equals("да") || rtn.equals("Да")) {check = 1;} else {check = 0; opt();}
            ///////////////////////////////////////////////////////////
        }
    }

    static void fifth(){
        System.out.println("Вы выбрали пятую программу:");
        Scanner scan = new Scanner(System.in);
        int check = 1;
        while (check == 1){
            System.out.println("Я пока не работаю(");
            System.out.println("Меня доделают позже.");


            ///////////////////////////////////////////////////////////
            System.out.println();
            System.out.println("Попробовать снова? Введите ДА.");
            System.out.println("В начало? Введите любой символ.");
            String rtn = scan.next();
            if (rtn.equals("ДА") || rtn.equals("да") || rtn.equals("Да")) {check = 1;} else {check = 0; opt();}
            ///////////////////////////////////////////////////////////
        }
    }

    static void sixth(){
        System.out.println("Вы выбрали шестую программу:");
        Scanner scan = new Scanner(System.in);
        int check = 1;
        while (check == 1){
            System.out.println("Чтобы выполнить умножение двух заданных целых чисел введите их: ");
            System.out.println("Первое число: ");
            int n1 = scan.nextInt();
            System.out.println("Второе число: ");
            int n2 = scan.nextInt();
            int n3 = 1; int n4 = 0;
            if (n2 > 0) {while (n3 <= n2) {n3 = n3+1; n4 = n4 + n1;}}
            else {n2 = -n2; while (n3 <= n2) {n3 = n3+1; n4 = n4 + n1;} n4 = -n4;}
            System.out.println("Результат умножения: " + n4);
            ///////////////////////////////////////////////////////////
            System.out.println();
            System.out.println("Попробовать снова? Введите ДА.");
            System.out.println("В начало? Введите любой символ.");
            String rtn = scan.next();
            if (rtn.equals("ДА") || rtn.equals("да") || rtn.equals("Да")) {check = 1;} else {check = 0; opt();}
            ///////////////////////////////////////////////////////////
        }
    }

    static void seventh(){
        System.out.println("Вы выбрали седьмую программу:");
        Scanner scan = new Scanner(System.in);
        int check = 1;
        while (check == 1){
            System.out.println("Я пока не работаю(");
            System.out.println("Меня доделают позже.");

            ///////////////////////////////////////////////////////////
            System.out.println();
            System.out.println("Попробовать снова? Введите ДА.");
            System.out.println("В начало? Введите любой символ.");
            String rtn = scan.next();
            if (rtn.equals("ДА") || rtn.equals("да") || rtn.equals("Да")) {check = 1;} else {check = 0; opt();}
            ///////////////////////////////////////////////////////////
        }
    }

    static void eighth(){
        System.out.println("Вы выбрали восьмую программу:");
        Scanner scan = new Scanner(System.in);
        int check = 1;
        while (check == 1){
            System.out.println("Чтобы перевести градус Фаренгейта в градус Цельсия, введите значение: ");
            double t1 = scan.nextInt();
            double t2 = (t1-32) / 1.8;
            System.out.println("Результат перевода из градусов Фаренгейта в градусы Цельсия: " + t2);
            ///////////////////////////////////////////////////////////
            System.out.println();
            System.out.println("Попробовать снова? Введите ДА.");
            System.out.println("В начало? Введите любой символ.");
            String rtn = scan.next();
            if (rtn.equals("ДА") || rtn.equals("да") || rtn.equals("Да")) {check = 1;} else {check = 0; opt();};
            ///////////////////////////////////////////////////////////
        }
    }

    static void ninth(){
        System.out.println("Вы выбрали девятую программу:");
        Scanner scan = new Scanner(System.in);
        int check = 1;
        while (check == 1){
            System.out.println("Чтобы вычислить свой индекс массы тела (ИМТ), введите:");
            System.out.println("Свой вес(кг):");
            int weight = scan.nextInt();
            System.out.println("И рост(см):");
            int height = scan.nextInt();
            double height2 = height * height;
            double imt = weight/height2*10000;
            System.out.println("Ваш индекс массы тела (ИМТ) равен: " + imt);
            if (imt <= 16){System.out.println("У вас выраженный дефицит массы тела. Нужно регулярно походить в зальчик.");}
            else if (imt > 16 && imt <= 18.5){System.out.println("У вас недостаточная масса тела. Сходите пару раз в зал.");}
            else if (imt > 18.5 && imt <= 25){System.out.println("Норма");}
            else if (imt > 25 && imt <= 30){System.out.println("У вас избыточная масса тела. Вы уже сходили на пару тренировок в зал? Уже виднеются Ваши мощные банки.");}
            else if (imt > 30){System.out.println("У вас ожирение или вы раскаченная бочка. Сделайте перерыв в качалочке и поиграйте в Доту.");}
            ///////////////////////////////////////////////////////////
            System.out.println();
            System.out.println("Попробовать снова? Введите ДА.");
            System.out.println("В начало? Введите любой символ.");
            String rtn = scan.next();
            if (rtn.equals("ДА") || rtn.equals("да") || rtn.equals("Да")) {check = 1;} else {check = 0; opt();}
            ///////////////////////////////////////////////////////////
        }
    }

    static void tenth(){
        System.out.println("Вы выбрали десятую программу:");
        Scanner scan = new Scanner(System.in);
        int check = 1;
        while (check == 1){
            System.out.println("Введите число, чтобы получить его квадрат, куб и четвёртую степень: ");
            int n1 = scan.nextInt();
            int n2 = n1 * n1;
            int n3 = n2 * n1;
            int n4 = n2 * n2;
            System.out.println("Квадрат числа: " + n2);
            System.out.println("Куб числа: " + n3);
            System.out.println("Четвёртая степень числа: " + n4);
            ///////////////////////////////////////////////////////////
            System.out.println();
            System.out.println("Попробовать снова? Введите ДА.");
            System.out.println("В начало? Введите любой символ.");
            String rtn = scan.next();
            if (rtn.equals("ДА") || rtn.equals("да") || rtn.equals("Да")) {check = 1;} else {check = 0; opt();}
            ///////////////////////////////////////////////////////////
        }
    }

    static void eleventh(){
        System.out.println("Вы выбрали одинадцатую программу:");
        Scanner scan = new Scanner(System.in);
        int check = 1;
        while (check == 1){
            System.out.println("Введите три числа, чтобы проверить могут-ли они быть треугольником:");
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            if (a + b > c && a + c > b && b + c > a) {
                System.out.println("Треугольник со сторонами " + a + " " + b + " " + c + " существует.");
            } else System.out.println("Треугольник со сторонами " + a + " " + b + " " + c + " не существует.");
            ///////////////////////////////////////////////////////////
            System.out.println();
            System.out.println("Попробовать снова? Введите ДА.");
            System.out.println("В начало? Введите любой символ.");
            String rtn = scan.next();
            if (rtn.equals("ДА") || rtn.equals("да") || rtn.equals("Да")) {check = 1;} else {check = 0; opt();}
            ///////////////////////////////////////////////////////////
        }
    }
}