package homeWorks;

import java.util.Scanner;

public class finra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int number = input.nextInt();
        if (number % 3 == 0 || number % 5 == 0){
            if (number % 3 == 0 && number % 5 == 0){
                System.out.println("Finra");
            } else if (number % 5 == 0) {
                System.out.println("Ra");;
            } else if (number % 3 == 0) {
                System.out.println("Fin");;
            }
        } else {
            System.out.println("invalid");;
        }



    }
}
