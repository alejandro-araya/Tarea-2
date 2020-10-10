import com.sun.source.tree.WhileLoopTree;

import java.lang.Math;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {

        int primeNumber = 0;

        while (primeNumber < 5 || primeNumber > 300) {
            Scanner pln = new Scanner(System.in);
            System.out.println("Type a number between 5 and 300");
            primeNumber = pln.nextInt();
        }//while

        double squareRootFromUsersNumbers = Math.sqrt(primeNumber);

        int counter = 2;
        while(counter <= squareRootFromUsersNumbers){
            if (primeNumber % counter == 0) {
                System.out.println("The number is not prime.");
                break;
            }//if
            ++counter;
             if(counter > squareRootFromUsersNumbers) {
                System.out.println("The number is prime.");
            }//if
        }
    }//main
}//Class PrimeNumbers end
