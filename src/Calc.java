import java.util.Scanner;
public class Calc {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a new number: ");
        int num1 = input.nextInt();
        System.out.println("Enter another new number: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        int product = num1 * num2;
        input.nextLine();
        System.out.println("Enter a word: ");
        String word1 = input.nextLine();
        System.out.println("Enter another word: ");
        String word2 = input.nextLine();
        String sent = word1 + word2;
        System.out.println("Sum is "+sum);
        System.out.println("Product is"+product);
        System.out.println("Combined words are "+sent);
        int square = num2 * num2;
        System.out.println("Square of "+num2+" is "+square);


    }

}
