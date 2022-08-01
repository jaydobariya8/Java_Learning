public class array {
    public static void main(String[] args) {

        // what is array : array is collection of an similar type of datatype 
        
        // There are three method to create an array
        
        // 1- method to create an array

        // int[] marks;
        // marks = new int [2];
        // marks[0]=56;
        // marks[1]=67;
        // marks[2]=76;

        // 2- method to create an array

        // int[] marks = new int [2];
        // marks[0]=56;
        // marks[1]=67;
        // marks[2]=76;


        // 3- method to create an array

        int [] marks ={40,78,86,95,45};

        // find an length of an array 
        // System.out.println("Length of an array is: "+ marks.length);
        
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        // for (int i = 0; i < marks.length; i++) {
        //     System.out.println(marks[i]);
        // }

        // quick quiz- print array in reverse order 
        // for (int i = marks.length-1; i>=1; i--) {
        //     System.out.println(marks[i]);
        // }
        
        // using for-each loop 
        // for (int i : marks) {
        //     System.out.println(i);
        // }


        // multi dimantional array: array od array also called 2D array 
        int [][] flate = new int[2][3];
        flate[0][0] = 101;
        flate[0][1] = 102;
        flate[0][2] = 103;
        flate[1][0] = 201;
        flate[1][1] = 202;
        flate[1][2] = 203;
        
        for (int i = 0; i < flate.length; i++) {
            for (int j = 0; j < flate[i].length; j++) {
                System.out.print(flate[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
