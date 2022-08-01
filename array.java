public class array {
    public static void main(String[] args) {
        
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
        System.out.println("Length of an array is: "+ marks.length);
        
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
        for (int i : marks) {
            System.out.println(i);
        }
    }
}
