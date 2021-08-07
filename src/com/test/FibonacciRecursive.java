package com.test;

import java.util.Arrays;

public class FibonacciRecursive {
    //РЕКУРСИВНЫЙ МЕТОД ДЛЯ ВЫЧИСЛЕНИЯ ЧИСЛО ФИБОНАЧЧИ
    public static void main(String[] args) {
        int number = 25;//для какого элемента получаем число
        long[] temp = new long[number + 1];//массив для временного хранения значении
        Arrays.fill(temp, -1);//заполняем полностью со значениями -1
        System.out.println(recursion(number, temp));//передаем число и временный массив
    }

    private static long recursion(int number, long[] temp) {
        if (temp[number] != -1)//первый раз всегда равно на -1, так как ничего еще туда не добавили, поэтому первый раз это проверка false
            return temp[number];

        if (number <= 1) return number;//если указали в начале 0 или 1 то просто это число возвращаем

        long result = recursion(number - 1, temp) + recursion(number - 2, temp);//начинаем уменьшать число переданное на метод, и результат сохраняем
        temp[number] = result;//уменьшенное число присваиваем на временный массив temp
        return result;//возвращаем уменьшенный переданный номер заново, до тех пор, пока не дойдем до 1

    }
}
