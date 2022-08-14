import java.util.Scanner;

public class multiple_catch {
    public static void main(String[] args) {
        int marks[] = {4,6,7,84,7};
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the index of array: ");
        int ind = sc.nextInt();
        System.out.print("enter ther number you want to devide: ");
        int num = sc.nextInt();

        try{
            System.out.println("array index number is: " + marks[ind]);
            System.out.println(" number devide is: " + marks[ind]/num);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occur in you code....!");
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException occur in you code....!");
        }
        catch(Exception e){
            System.out.println("exception ocuue in your code....!");
        }
    }
}
