package com.company;

public class Main {

    public static void main(String[] args) {

            int[] array = {56, 54, -2, 31, 98, 10};

            int max_element = array[0];
            int min = array[0];
            System.out.print("Исходный массив : ");

            for (int a : array) {

                System.out.print(a + "  ");
                // Сравниваем текущий максимальный элемент с i-ым элементом массива
                if (max_element < a)
                    max_element = a;
                if (min > a)
                    min = a;

            }


            System.out.println("\nМаксимальный элемент " + max_element);
            System.out.println("\nМинимальный элемент " + min);


            int[] b = array.clone();
            b[4] = 0;
            b[2] = 0;
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i] + "     " + b[i]);


            }

        }
    }



