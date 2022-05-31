package codeWars;

import java.util.Locale;

public class TrainingPrintf {

    public static void main(String[] args) {

        // %[argument_index$][flags][width][.precision]conversion
        // Вывести на консоль таблицу умножения

        // Вывести столбиком несколько чисел 666666, 55555, 4444, 333, 22, 1
        System.out.printf("%6d%n%6d%n%6d%n%6d%n%6d%n%6d%n", 666666, 55555, 4444, 333, 22, 1);

        // Вывод целого числа с разделением тысяч 45466
        System.out.printf("%,d%n", 45466);

        // Число менее 7 знаков подвинуть вправо на недостающее количество знаков
        System.out.printf("%7d%n", 4542);

        // Число менее 7 знаков подвинуть нулями слева на недостающее количество знаков.
        System.out.printf("%07d%n", 498567);

        // Число будет дополнено знаком + и, если оно менее 7 знаков, то будет дополнено нулями на недостающее количество знаков.
        System.out.printf("%+07d%n", 98763);

        // Числа с плавающей точкой
        // Вывод числа e. Автоматическое округление до 6 знаков после запятой.
        System.out.printf("%f%n", Math.E);

        //Число менее 10 знаков будет «подвинуто» вправо на недостающее количество знаков.
        System.out.printf("%10f%n", Math.E);

        //Число менее 10 знаков будет дополнено нулями слева на недостающее количество знаков.
        System.out.printf("%010f%n", Math.E);

        //Число будет дополнено знаком + и, если оно менее 10 знаков, то будет дополнено нулями на недостающее количество знаков.
        System.out.printf("%+010f%n", Math.E);

        //Число будет выведено с 15 знаками после запятой.
        System.out.printf("%.15f%n", Math.E);

        // Число будет выведено с  3-мя знаками после запятой и, если оно менее 8 символов, то  будет «подвинуто» вправо на недостающее количество знаков.
        System.out.printf("%8.3f%n", Math.E);

        // Форматирование строк
        // Если строка содержит менее 10 символов, то «подвинуть » ее вправо на недостающее количество символов.
        System.out.printf("%10s%n", "Hello");

        // Строка будет выровнена по левому краю и, если она менее 10 символов, то будет дополнена справа пробелами на недостающее количество символов.
        System.out.printf("%-10s%n", "Hello");

        // Выведет первые 3 символа строки.
        System.out.printf("%.3s%n", "Hello");

        // Выведет первые 3 символа строки и подвинет их вправо на недостающее до 8 количество символов.
        System.out.printf("%8.3s%n", "Hello");

        // Локализация printf(Locale l, String format, Object… args)
        System.out.printf(Locale.GERMAN, "%,d%n", 1000000);

    }

}