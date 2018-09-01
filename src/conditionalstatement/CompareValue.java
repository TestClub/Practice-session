package conditionalstatement;

import java.util.Scanner;

public class CompareValue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("please enter three number:");
        int num1 = sc.nextInt(), num2 = sc.nextInt(), num3 = sc.nextInt();

        if(num1>num2){

            if(num3<num1){
                System.out.println("Num3 is less then num1");
            }
            System.out.println("Num1 is greater then num2");}

        else
        {
            System.out.println("Num1 is less then num2");
        }

//condition

    }

}
