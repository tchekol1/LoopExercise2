import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String num="";
        int number1;
        System.out.println("Enter a number");
        int number= scanner.nextInt();
        String n= Integer.toString(number);
        for (int i = n.length()-1; i >=0 ; i--) {
            num+=n.charAt(i);

        }
        number1=Integer.parseInt(num);
        if (number1==number){
            System.out.println("The two numbers are palindrome ");
        }
        else
            System.out.println("The two number numbers are not palindrome ");
    }
}


