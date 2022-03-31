package home_work_2.loops;

public class loops_Task01_star {
    public static void main(String[] args) {
        // Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе
        // метод с использованием рекурсии

        long number;
        long result;
        double check;
        String strNumber;

        result = 1;
        strNumber = args[0];

        check = Double.parseDouble(strNumber);

        if (check % 1 != 0) {
            System.out.print("Это не целое число!");
        } else if (check < 0) {
            System.out.println("Это отрицательное число.");
        } else {
            number = Long.parseLong(strNumber);
            result = factorial(number);

            if (result < number) {
                System.out.println("Произошло переполнение. Результат некорректен.");
            } else {
                System.out.print(forPrintResult(number));
                System.out.println("=" + result);
            }
        }
    }

    // метод рекурсии перемножения чисел от 1 до введенного значения
    public static long factorial(long number) {
        long result;

        if (number < 2) {
            return 1;
        }
        result = factorial(number - 1) * number;
        return result;
    }

    // метод форматирования строки для вывода в консоль
    public static String forPrintResult(long number) {
        String forPrint = null;
        for (long i = 1; i <= number; i++) {
            if (i < number) {
                forPrint = i + "*";
                System.out.print(forPrint);
            } else if (i == number) {
                forPrint = String.valueOf(i);
            }
        }
        return forPrint;
    }
}


