import java.util.*;

public class rock_paper_scissor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock , 1 Paper, 2 for scissor");
        System.out.print("Enter Your Choice: ");
        int userInput = sc.nextInt();

        Random rd = new Random();
        int comInput = rd.nextInt(3);

        if (userInput==comInput){
            System.out.println("Draw");
        }
        else if (userInput==0 && comInput==2 || userInput==1 && comInput==0 || userInput==2 && comInput==1){
            System.out.println("You Win...!");
        }
        else {
            System.out.println("Computer Win...!");
        }

        if(comInput==0){
            System.out.println("Computer Choice: Rock");
        }
        else if(comInput==1){
            System.out.println("Computer Choice: Paper");
        }
        else{
            System.out.println("Computer Choice: Scissor");
        }

        
    }
}
