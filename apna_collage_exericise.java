import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

import java.util.*;

public class apna_collage_exericise {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        // 1-Enter 3 number from user and print there avg
        // System.out.print("Enter Number: ");
        // int a = sc.nextInt();
        // System.out.print("Enter Number: ");
        // int b = sc.nextInt();
        // System.out.print("Enter Number: ");
        // int c = sc.nextInt();
        // int avg = (a+b+c)/3;
        // System.out.println("Avg is : "+avg);
        

        // 2-Sum of ODD number from o to n 
        // System.out.print("Enter N: ");
        // int n = sc.nextInt();
        // int sum = 0;
        // for (int i = 0; i<=n ; i++) {
        //     if(i % 2 != 0)
		// 	{
		// 		sum += i; 
		// 	}
        // }
        // System.out.println(sum);


        // 3-print the greater of the two Number 
        // System.out.print("Enter Number:");
        // int num1 = sc.nextInt();
        // System.out.print("Enter Number:");
        // int num2 = sc.nextInt();
        
        // if (num1>num2) {
        //     System.out.println("Greter number is: "+num1);
        // } else if(num2>num1) {
        //     System.out.println("Greter number is: "+num2);            
        // }
        // else{
        //     System.out.println("Number is Equal");
        // }


        // 4-Takes age as an input and return if that person eligible for vote or note 
        // System.out.print("Enter Your Age: ");
        // int age = sc.nextInt();
        // if (age >= 18) {
        //     System.out.println("you are eligible for vote...!");
        // } else {
        //     System.out.println("you are note eligible for vote...!");
        // }

        // 5-infinate loop usinf do-while loop 
        // do {
        //     System.out.println("infinate loop using do-while");
        // } while (true);


        // 6-fibonacci series of first 10
        int a = 0;
        int b = 1;
        int c;
        System.out.println(a+"\n "+b);
        for (int i = 1; i <= 10; i++) {
            c = a+b;
            System.out.println(c);
            a = b;
            b = c;
        }

    }
}