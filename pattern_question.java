public class pattern_question {
    public static void main(String[] args) {
        
    // ----------------------------------- Pattern-1 -----------------------------------     
    System.out.println("Pattern-1");
    for (int i = 1; i<=4 ; i++) {
        for (int j = 1; j <=4 ; j++) {
            System.out.print("* ");
        }
        System.out.println("");
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




}
}
