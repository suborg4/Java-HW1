package org.example.hw02;

/*
Дана последовательность целых чисел, оканчивающаяся нулем. 
Найти сумму положительных чисел, после которых следует отрицательное число.
Пример: 1 2 1 2 -1 1 3 1 3 -1 0
2 -1 переход - 2 в сумму
3 -1 переход 3 в сумму
суммарно выведет 5
 */

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input number: ");
        int number01 = s.nextInt();                        
        int sum = 0;                                    
        while (number01 != 0){                              
            System.out.print("Input number: ");
            int number02 = s.nextInt();                    
            if (number02 < 0 && number01 > 0){                  
                sum = sum + number01;                            
            }
            number01 = number02;                                
        }
        System.out.println("Sum of positive numbers = " + sum);
    }
}