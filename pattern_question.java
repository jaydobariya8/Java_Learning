import javax.print.event.PrintEvent;

public class pattern_question {
    public static void main(String[] args) {
        
    // ----------------------------------- Pattern-1 -----------------------------------     
    System.out.println("Pattern-1");
    for (int i = 1; i<=4 ; i++) {
        for (int j = 1; j <=4 ; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
    

    // ----------------------------------- Pattern-2 -----------------------------------     
    System.out.println("Pattern-2");
    for (int i = 1; i <=4; i++) {
        for (int j = 1; j <=4; j++) {
            if (i==1 || i==4 || j==1 || j==4) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }


    // ----------------------------------- Pattern-3 -----------------------------------     
    System.out.println("Pattern-3");
    for (int i = 1; i<=4; i++) {
        for (int j = 1; j <=i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }


    // ----------------------------------- Pattern-4 -----------------------------------     
    System.out.println("Pattern-4");
    for (int i = 4; i >=0; i--) {
        for (int j = 1; j <=i ; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }


    // ----------------------------------- Pattern-5 -----------------------------------     
    System.out.println("Pattern-5");
    for (int i = 1; i <=4; i++) {
        for (int j = 1; j <=4-i; j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <=i ; j++) {
            System.out.print("*");
        }
        System.out.println();
    }


    // ----------------------------------- Pattern-6 -----------------------------------     
    System.out.println("Pattern-6");
    for (int i = 1; i <=5; i++) {
        for (int j = 1; j <=i; j++) {
            System.out.print(j+" ");
        }
        System.out.println();
    }


     // ----------------------------------- Pattern-7 -----------------------------------     
     System.out.println("Pattern-7");
    for (int i = 1; i<=5 ; i++) {
        for (int j = 1; j<=5-i+1; j++) {
            System.out.print(j+" ");
        }
        System.out.println();
    }



     // ----------------------------------- Pattern-8 -----------------------------------     
     System.out.println("Pattern-8");
     int number =1;
    for (int i = 1; i <=5; i++) {
        for (int j = 1; j<=i; j++) {
            System.out.print(number+" ");
            number++;
        } 
        System.out.println();
    }

    
     // ----------------------------------- Pattern-9 -----------------------------------     
     System.out.println("Pattern-9");
    for (int i = 1; i<=5 ; i++) {
        for (int j = 1; j<=i; j++) {
            int sum = i+j;
            if (sum % 2 == 0) {
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
        }
        System.out.println();
    }


     // ----------------------------------- Pattern-10 -----------------------------------     
     System.out.println("Pattern-10");
    //  first half 
    for (int i = 1; i<=4; i++) {
        for (int j = 1; j <=i; j++) {
        System.out.print("*");
        }
        for (int j = 1; j <=2*(4-i); j++) {
        System.out.print(" ");
        }
        for (int j = 1; j <=i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    // second half 
    for (int i = 4; i>=1; i--) {
        for (int j = 1; j <=i; j++) {
        System.out.print("*");
        }
        for (int j = 1; j <=2*(4-i); j++) {
        System.out.print(" ");
        }
        for (int j = 1; j <=i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }


}
}
