// 1. Пусть дан произвольный список целых чисел, удалить из него чётные числа.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Task_3_2 {
    public static void main(String[] args) throws Exception {
        System.out.print("Введите длину списка N: ");
        try (Scanner iScanner = new Scanner(System.in)) {
            int N = iScanner.nextInt();
            ArrayList<Integer> ar = new ArrayList<Integer>();
            Random ran = new Random();
            for (int i = 0; i < N; i++) {
                int x = ran.nextInt(N);
                ar.add(x);
            }
            System.out.println("Произвольный список целых чисел: \n " + ar);

            for (int i = ar.size() - 1; i >= 0; i--) {
                int even = ar.get(i) % 2;
                if (even == 0) {
                    System.out.println("Четное число:" + ar.get(i));
                    ar.remove(i);
                }
            }
            Collections.sort(ar);
            System.out.println("Список с удаленными четными числами: \n " + ar);
        }
    }

}



// 2. Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее ариф. из этого списка.

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task_3_3 {
    public static void main(String[] args) throws Exception {
        System.out.print("Введите длину списка N: ");
        try (Scanner iScanner = new Scanner(System.in)) {
            int N = iScanner.nextInt();
            ArrayList<Integer> ar = new ArrayList<Integer>();
            Random ran = new Random();
            for (int i = 0; i < N; i++) {
                int x = ran.nextInt(N);
                ar.add(x);
            }
            System.out.println("Произвольный список целых чисел: \n " + ar);

            int min = ar.get(0);
            int max = ar.get(0);
            float sum = 0;
            for (int i = 0; i < ar.size(); i++) {
                int num = ar.get(i);
                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
                sum += num;
            }
            float average = sum / ar.size();

            System.out.println("Минимальное значение: " + min);

            System.out.println("Максимальное значение: " + max);

            System.out.println("Среднее арифметическое значение: " + average);
        }
    }
}


//4*. Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа. Пройти по списку, найти и удалить целые числа.


import java.util.ArrayList;
import java.util.Iterator;

public class TaskFourth {
    ArrayList<String> myList = new ArrayList<>();

    public void work(){
        myList.add("Hello");
        myList.add("Seminar");
        myList.add(String.valueOf(1)); //valueOf возвращает строковое представление аргумента
        myList.add(String.valueOf(3));

        System.out.println("Первичный список " + myList);
        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().matches("-?\\d+(\\.\\d+)?$")) { // matches указывает, соответствует ли эта строка заданному регулярному выражению для целых чисел(есть ли здесь числа со знаком - ,гуглим шаблоны регулярки)
                iterator.remove();
            }
        }
        System.out.println(myList);
    }
}
