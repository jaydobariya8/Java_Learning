public class array_prectise_set {
    public static void main(String[] args) {


        // prectice problem given by code with harry 

        
        // problem 1
        // float [] marks = {56.7f, 45.8f, 87.2f, 34.6f, 99.8f };
        // float sum = 0;
        // for (float f : marks) {
        // sum += f;
        // }
        // System.out.println("Sum of an array is: "+sum);

        // problem 2
        // float [] marks = {56.7f, 45.8f, 87.2f, 34.6f, 99.8f };
        // float num = 45.8f;
        // boolean val = false;
        // for (float f : marks) {
        // if (num == f) {
        // val = true;
        // break;
        // }
        // }
        // if (val) {
        // System.out.println("The value is present in array");
        // } else {
        // System.out.println("The value is not present in array");
        // }

        // problem 3
        // float [] marks = {56.7f, 45.8f, 87.2f, 34.6f, 99.8f };
        // float sum = 0;
        // for (float f : marks) {
        // sum += f;
        // }
        // System.out.println("Sum of an avarage is: "+sum/marks.length);

        // problem 4
        // int [][] mat1 = {{1,3,4},{6,8,9}};
        // int [][] mat2 = {{5,7,3},{8,2,1}};
        // int [][] result = {{0,0,0},{0,0,0}};

        // for (int i = 0; i < mat1.length; i++) {
        // for (int j = 0; j < mat1[i].length; j++) {
        // result[i][j] = mat1[i][j] + mat2[i][j];
        // System.out.print(result[i][j]+" ");
        // }
        // System.out.println();
        // }

        // problem 5
        // int [] arr = {1,2,3,4,5,6,7};
        // int l = arr.length;
        // int n = Math.floorDiv(l, 2);
        // int temp;
        // for (int i = 0; i < n; i++) {
        // temp = arr[i];
        // arr[i] = arr[l-i-1];
        // arr[l-i-1] = temp;
        // }
        // for (int e : arr) {
        // System.out.print(e+" ");
        // }

        // problem 6
        // int [] arr = {1,23,334,43,55,66,77};
        // int max = Integer.MIN_VALUE;
        // for (int i : arr) {
        // if (i > max) {
        // max = i;
        // }
        // }
        // System.out.println("max number is: "+ max);

        // problem 7
        // int [] arr = {10,23,334,43,55,66,77};
        // int min = Integer.MAX_VALUE;
        // for (int i : arr) {
        // if (i <= min) {
        // min = i;
        // }
        // }
        // System.out.println("min number is: "+ min);

        // problem 8
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        boolean isShort = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isShort = false;
                break;
            }
        }
        if (isShort) {
            System.out.println("Array is Shorted enjoy...!");
        } else {
            System.out.println("Array is not Shorted...!");
        }

    }
}
