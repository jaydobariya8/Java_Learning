
import java.util.Scanner;
public class if_else_and_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//        System.out.println("Enter You Age: ");
//        int age=sc.nextInt();
//        if (age>=18){
//            System.out.println("you can Drive car...!");
//        }
//        else{
//            System.out.println("you cannot Drive car..!");
//        }

//        -----------find the income tax persentege----------
//        float tax = 0;
//        System.out.print("Enter Your income: ");
//        float income = sc.nextFloat();
//        if(income<2.5){
//            tax += 0;
//        } else if (income>2.5f && income<=5.0f) {
//            tax = tax + 0.05f* (income-2.5f);
//        }
//        else if (income>5.0f && income<=10.0f) {
//            tax = tax + 0.05f* (5.0f-2.5f);
//            tax = tax + 0.2f* (income-5.0f);
//        }
//        else if (income>10.0f) {
//            tax = tax + 0.05f* (5.0f-2.5f);
//            tax = tax + 0.2f* (10.0f-5.0f);
//            tax = tax + 0.3f* (income-10.0f);
//        }
//        System.out.println("Total tax pay by the use is: "+tax);



//        System.out.println("Enter A website: ");
//        String web = sc.nextLine();
//        if (web.endsWith(".com")){
//            System.out.println("comercia website");
//        }
//        else if (web.endsWith(".org")){
//            System.out.println("organizational website");
//        }
//        else if (web.endsWith(".in")){
//            System.out.println("Indian website");
//        }
//        else{
//            System.out.println("your website is not valid");
//        }


//        -------------leep year-----------
//        System.out.println("Enter Year : ");
//        int year = sc.nextInt();
//        if(year%400==0 || (year%4==0 && year%100!=0)){
//            System.out.println("Leep Year");
//        }
//        else{
//            System.out.println("Not an leep year");
//        }



//        System.out.print("Enter A Number: ");
//        int number = sc.nextInt();
//        switch(number){
//            case 10: System.out.println("10");
//                break;
//            case 20: System.out.println("20");
//                break;
//            case 30: System.out.println("30");
//                break;
//            default:System.out.println("Not in 10, 20 or 30");
//        }


// -------------Enhanced switch case----------- 
       System.out.println("Enter A number: ");
       short day = sc.nextByte();
       switch (day){
           case 1 -> System.out.println("Monday");
           case 2 -> System.out.println("Tuesday");
           case 3 -> System.out.println("wednesday");
           case 4 -> System.out.println("thursday");
           case 5 -> System.out.println("friday");
           case 6 -> System.out.println("saturday");
           case 7 -> System.out.println("sunday");
       }

    }
}
