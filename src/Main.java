public class Main {
    public static void main(String[] args) {
        //Задание 1
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println("Итерация цикла " + i);
        }
        //Задание 2
        for (int i = 10; i > 0; i = i - 1) {
            System.out.println("Итерация цикла " + i);
        }
        //Задание 3
        for (int i = 0; i <= 17 ; i = i + 2) {
            System.out.println("Итерация цикла " + i);
        }
        //Задание 4
        for (int i = 10; i >= -10 ; i--) {
            System.out.println("Итерация цикла  " + i);
        }
        //Задание 5
        for (int i = 1904; i <= 2096; i = i + 4){
            System.out.println(i + " год является високосным» ");
        }
        //Задание 6
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println("Итерация цикла " + i);
        }
        //Задание 7
        for (int i = 2; i <= 512; i = i * 2) {
            System.out.println("Итерация цикла " + i);
        }
        //Задание 8
        int salary = 29000;
        int total = 0;
        for (int i = 1; i < 12; i++) {
            total = total + salary;
            {

                System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей ");
            }
        }
        //Задание 9
        int salary1 = 29000;
        int total1 = 0;
        for (int i = 1; i <= 12; i++) {
            total1 = total1 +  salary1;
            total1 = total1 + total1 / 100;
            {
                System.out.println("Месяц " + i + " , сумма накоплений равна " + total1 + "   рублей ");
            }
        }

        //Задание 10
        int multiplicationTable = 2;
        for (int i = 1; i < 10; i = i + 1) {
            System.out.println("2*" + i + "=" + 2 * i);

        }
    }
}