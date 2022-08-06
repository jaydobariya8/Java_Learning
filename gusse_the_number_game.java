import java.util.*;

public class gusse_the_number_game {
    public static void main(String[] args) {
        game g = new game();
        boolean b =false;
        while(!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}
class game {
    public int number;
    public int inputNumber;
    public int numberOfGuesses = 0;

    game() {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Guesse The number: ");
        inputNumber = sc.nextInt();
    }

    boolean isCorrectNumber() {
        numberOfGuesses++;
        if (inputNumber == number) {
            System.out.format("Yes you guesse it right...!, it was %d.\n you guessed it in %d try.",number,numberOfGuesses);
            return true;
        } else if (inputNumber < number) {
            System.out.println("your guesse is low");
        } else if (inputNumber > number) {
            System.out.println("your guesse is high");
        }
        return false;
    }

}