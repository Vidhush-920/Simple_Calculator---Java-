import java.util.Scanner;

public class Simple_Calculator {

    //method for addition
    static void sum(int num1,int num2){
        int a = num1 + num2;
        System.out.println("\nAnswer is " + a );
    }

    //method for substraction
    static void diff(int num1,int num2){
        int b = num1 - num2;
        System.out.println("\nAnswer is " + b );
    }

    //method for multiplication
    static void prod(int num1,int num2){
        int c = num1 * num2;
        System.out.println("\nAnswer is " + c );
    }

    //method for division
    static void divid(int num1,int num2){
        float d = (float)num1/(float)num2;
        System.out.println("\nAnswer is " + d );
    }
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Hello!..");
        System.out.println("What do you want to do?\n");
        
        System.out.println("Press number 1 for Sum");
        System.out.println("Press number 2 for Difference");
        System.out.println("Press number 3 for Multiplication");
        System.out.println("Press number 4 for Division\n");
        
        System.out.println("Press your option...");
        int option = input.nextInt();
        
        System.out.println("\nEnter number 1 ...");
        int n1 = input.nextInt();

        System.out.println("\nEnter number 2 ...");
        int n2 = input.nextInt();

        //using switch case to select operation method
        switch(option) {
            case 1: sum(n1, n2);
                    break;
            case 2: diff(n1, n2);
                    break;
            case 3: prod(n1, n2);
                    break;
            case 4: divid(n1, n2);
                    break;
        }
        
        input.close();
    }
}
