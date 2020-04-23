import java.util.Scanner;

public class LoopExercise_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input, num, addnumber, evennum;
        int sum=0;
        int nine=100;
        int evensum = 0;
        int sumnine=0;
        int counter=1;
        //Prompt user for input, display the cube of all numbers up to that bound.
        System.out.println("Enter a number");
        input = scanner.nextInt();
        for (int i = 1; i < input; i++) {
            System.out.println(i * i * i + " ");

        }
        //Prompt user for input, display the multiplication table for that number up to 10.
        System.out.println("Enter a number");
        num = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num * i + " ");
        }
        System.out.println("Enter a number");
        addnumber = scanner.nextInt();
        for (int i = 1; i < addnumber; i++) {
            if ((i % 2) != 0) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("The sum of even odd 1 to "+ addnumber+ " = "+ sum);

        System.out.println("Enter a number");
        evennum = scanner.nextInt();
        for (int i = 1; i < evennum; i++) {
            if ((i % 2) == 0) {
                System.out.println(i);
                evensum += i;
            }
        }
        System.out.println("The sum of even numbers 1 to "+ evennum+ " = "+ evensum);
        for (int i = 0; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }


        for (int i = 1; i <5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(counter+" ");
                counter++;
            }

            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                if((i+j)%2==0)
                    System.out.print(1);
                else
                    System.out.print(0);
            }
            System.out.println();
            
        }

while(nine>=100&&nine<=200){
    if((nine%9)==0){
        sumnine+=nine;

    }
    nine++;
}
        System.out.println("The sum of numbers divisible by 9 between 100 and 200 = "+ sumnine);
    }
}

