import java.util.Scanner;

public class fourthProject {

    public static void main(String[] args){opt();}
    static void opt(){
        Scanner scan = new Scanner(System.in);
        int check = 1;
        int slc1 = 1, slc2 = 2, slc3 = 3, slc4 = 4, slc5 = 5, slc6 = 6, slc7 = 7, slc8 = 8, slc9 = 9, slc10 = 10, slc11 = 11, slc12 = 12;

        while (check == 1) {
            ////////////////////////////////////////////////////////////////////
            System.out.println("Список доступных программ:");
            System.out.println();
            System.out.println("1. Вывести все элементы массива.");
            System.out.println("2. Вывести все элементы массива в обратном порядке.");
            System.out.println("3. Вывести четные элементы массива.");
            System.out.println("4. Вывести элементы массива через 1.");
            System.out.println("5. Выводит элементы массива до -1.");
            System.out.println("6. Добавить элемент в конец массива.");
            System.out.println("7. Добавить элемент в начало массива.");
            System.out.println("8. Добавить элемент на 4-ую позицию массива.");
            System.out.println("9. Удалить последний элемент массива.");
            System.out.println("10. Удалить первый элемент массива.");
            System.out.println("11. Удалить 5-ый элемент массива.");
            System.out.println("12. Создать единый массив из двух.");
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
            else if (select == slc12) {twelfth(); check = 0;}
            else System.out.println("Такой программы не существует. Попробуйте еще раз.");
        }
    }
    static void first(){
        System.out.println("Вы выбрали первую программу:");
        Scanner scan = new Scanner(System.in);
        int check = 1;
        while (check == 1){
            double array[] = {12.123, 54, -23, 0.43, 12323.1, 5555.3333, 1};
            System.out.println("Все элементы массива: ");
            for (int i = 0; i < array.length; i++){
                System.out.print("[" + array[i] + "]");
            }
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
        System.out.println("Вы выбрали первую программу:");
        Scanner scan = new Scanner(System.in);
        int check = 1;
        while (check == 1){
            double array[] = {12.123, 54, -23, 0.43, 12323.1, 5555.3333, 1};
            System.out.println("Все элементы массива: ");
            for (int i = 0; i < array.length; i++){
                System.out.print("[" + array[i] + "]");
            }
            System.out.println("");
            System.out.println("Все элементы массива в обратном порядке:");
            for (int i = 6; i >= 0; i--){
                System.out.print("[" + array[i] + "]");
            }
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
        System.out.println("Вы выбрали первую программу:");
        Scanner scan = new Scanner(System.in);
        int check = 1;
        while (check == 1){
            double array[] = {12.123, 54, -23, 0.43, 12324, 5555.3333, 1};
            System.out.println("Все элементы массива: ");
            for (int i = 0; i < array.length; i++){
                System.out.print("[" + array[i] + "]");
            }
            System.out.println("");
            System.out.println("Все четные элементы массива:");
            for (int i = 0; i < array.length; i++){
                if (array[i] % 2 == 0){
                    System.out.print("[" + array[i] + "]");
                }
            }
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
        System.out.println("Вы выбрали первую программу:");
        Scanner scan = new Scanner(System.in);
        int check = 1;
        while (check == 1){
            double array[] = {12.123, 54, -23, 0.43, 12323.1, 5555.3333, 1};
            System.out.println("Все элементы массива: ");
            for (int i = 0; i < array.length; i++){
                System.out.print("[" + array[i] + "]");
            }
            System.out.println("");
            System.out.println("Элементы массива через 1:");
            for (int i = 0; i < array.length; i++){
                if (i % 2 == 0){
                    System.out.print("[" + array[i] + "]");
                }
            }
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
        System.out.println("Вы выбрали первую программу:");
        Scanner scan = new Scanner(System.in);
        int check = 1;
        while (check == 1){
            double array[] = {12.123, 54, -23, 0.43, -1, 12323.1, 5555.3333, 1};
            System.out.println("Все элементы массива: ");
            for (int i = 0; i < array.length; i++){
                System.out.print("[" + array[i] + "]");
            }
            System.out.println("");
            System.out.println("Все элементы массива до -1: ");
            for (int i = 0; i < array.length; i++){
                if (array[i] == -1) {
                    break;
                } else {System.out.print("[" + array[i] + "]");};
            }
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
        System.out.println("Вы выбрали первую программу:");
        Scanner scan = new Scanner(System.in);
        int check = 1;
        while (check == 1){
            double array[] = {12.123, 54, -23, 0.43, 12323.1, 5555.3333, 1};
            System.out.println("Все элементы массива: ");
            for (int i = 0; i < array.length; i++){
                System.out.print("[" + array[i] + "]");
            }
            System.out.println("");
            double array1[] = new double[array.length+1];
            for (int i = 0; i < array.length; i++){
                array1[i] = array[i];
            }
            System.out.println("Введите элемент который хотите добавить в конец:");
            double e = scan.nextDouble();
            for (int i = 0; i < array1.length; i++){
                if (array1[i] == 0){
                    array1[i] = e;
                }
            }
            for (int i = 0; i < array1.length; i++){
                System.out.print("[" + array1[i] + "]");
            }
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
        System.out.println("Вы выбрали первую программу:");
        Scanner scan = new Scanner(System.in);
        int check = 1;
        while (check == 1){
            double array[] = {12.123, 54, -23, 0.43, 12323.1, 5555.3333, 1};
            System.out.println("Все элементы массива: ");
            for (int i = 0; i < array.length; i++){
                System.out.print("[" + array[i] + "]");
            }
            System.out.println("");
            double array1[] = new double[array.length+1];
            for (int i = 0; i < array.length; i++){
                array1[i+1] = array[i];
            }
            System.out.println("Введите элемент который хотите добавить в начало:");
            double e = scan.nextDouble();
            for (int i = 0; i < array1.length; i++){
                if (array1[i] == 0){
                    array1[i] = e;
                }
            }
            for (int i = 0; i < array1.length; i++){
                System.out.print("[" + array1[i] + "]");
            }
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
        System.out.println("Вы выбрали первую программу:");
        Scanner scan = new Scanner(System.in);
        int check = 1;
        while (check == 1){
            double array[] = {12.123, 54, -23, 0.43, 12323.1, 5555.3333, 1};
            System.out.println("Все элементы массива: ");
            for (int i = 0; i < array.length; i++){
                System.out.print("[" + array[i] + "]");
            }
            System.out.println();
            double array1[] = new double[array.length+1];
            int j = 0;
            for (int i = 0; i < array1.length; i++){
                if (i == 3){
                    array1[i] = 0;
                }
                else {array1[i] = array[j];
                j++;
                }
            }
            System.out.println("Введите элемент, который хотите добавить на 4-ую позицию:");
            double e = scan.nextDouble();
            for (int i = 0; i < array1.length; i++){
                if (array1[i] == 0){
                    array1[i] = e;
                }
            }
            for (int i = 0; i < array1.length; i++){
                System.out.print("[" + array1[i] + "]");
            }
            ///////////////////////////////////////////////////////////
            System.out.println();
            System.out.println("Попробовать снова? Введите ДА.");
            System.out.println("В начало? Введите любой символ.");
            String rtn = scan.next();
            if (rtn.equals("ДА") || rtn.equals("да") || rtn.equals("Да")) {check = 1;} else {check = 0; opt();}
            ///////////////////////////////////////////////////////////
        }
    }
    static void ninth(){
        System.out.println("Вы выбрали первую программу:");
        Scanner scan = new Scanner(System.in);
        int check = 1;
        while (check == 1){
            double array[] = {12.123, 54, -23, 0.43, 12323.1, 5555.3333, 1};
            System.out.println("Все элементы массива: ");

            for (int i = 0; i < array.length; i++){
                System.out.print("[" + array[i] + "]");
            }
            System.out.println("");
            System.out.println("Все элементы массива, кроме последнего:");
            double array1[] = new double[array.length-1];
            for (int i = 0; i < array1.length; i++) {
                array1[i] = array[i];
                System.out.print("[" + array1[i] + "]");
            }
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
        System.out.println("Вы выбрали первую программу:");
        Scanner scan = new Scanner(System.in);
        int check = 1;
        while (check == 1){
            double array[] = {12.123, 54, -23, 0.43, 12323.1, 5555.3333, 1};
            System.out.println("Все элементы массива: ");
            for (int i = 0; i < array.length; i++){
                System.out.print("[" + array[i] + "]");
            }
            System.out.println("");
            double array1[] = new double[array.length-1];
            for (int i = 0; i < array1.length; i++){
                array1[i] = array[i+1];
            }
            for (int i = 0; i < array1.length; i++){
                System.out.print("[" + array1[i] + "]");
            }
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
        System.out.println("Вы выбрали первую программу:");
        Scanner scan = new Scanner(System.in);
        int check = 1;
        while (check == 1){
            double array[] = {12.123, 54, -23, 0.43, 12323.1, 5555.3333, 1};
            System.out.println("Все элементы массива: ");
            for (int i = 0; i < array.length; i++){
                System.out.print("[" + array[i] + "]");
            }
            System.out.println();
            double array1[] = new double[array.length-1];
            int j = 0;
            for (int i = 0; i < array1.length; i++){
                if (i == 4){
                    j++;
                    array1[i] = array[j];
                    j++;
                }
                else {array1[i] = array[j];
                    j++;
                }
            }
            System.out.println("Все элементы массива, кроме 5-го:");
            for (int i = 0; i < array1.length; i++){
                System.out.print("[" + array1[i] + "]");
            }
            ///////////////////////////////////////////////////////////
            System.out.println();
            System.out.println("Попробовать снова? Введите ДА.");
            System.out.println("В начало? Введите любой символ.");
            String rtn = scan.next();
            if (rtn.equals("ДА") || rtn.equals("да") || rtn.equals("Да")) {check = 1;} else {check = 0; opt();}
            ///////////////////////////////////////////////////////////
        }
    }
    static void twelfth(){
        System.out.println("Вы выбрали первую программу:");
        Scanner scan = new Scanner(System.in);
        int check = 1;
        while (check == 1){
            double array1[] = {12.123, 54, -23, 0.43, 12323.1, 5555.3333, 1};
            System.out.println("Первый массив: ");
            for (int i = 0; i < array1.length; i++){
                System.out.print("[" + array1[i] + "]");
            }
            double array2[] = {34234, 534.454, 5311, 5, 5.0223, 0,323};
            System.out.println("");
            System.out.println("Второй массив: ");
            for (int i = 0; i < array2.length; i++){
                System.out.print("[" + array2[i] + "]");
            }
            double array3[] = new double[array2.length+ array1.length];
            for (int i = 0; i < array1.length; i++){
                array3[i] = array1[i];
            }
            for (int i = 0; i < array2.length; i++){
                array3[i+array1.length] = array2[i];
            }
            System.out.println("");
            System.out.println("Третий массив, после сложения двух: ");
            for (int i = 0; i < array3.length; i++){
                System.out.print("[" + array3[i] + "]");
            }
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