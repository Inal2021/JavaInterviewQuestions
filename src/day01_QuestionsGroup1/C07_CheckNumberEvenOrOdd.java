package day01_QuestionsGroup1;

import java.util.Scanner;

public class C07_CheckNumberEvenOrOdd {

    //Question even or odd number
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number for even or odd: ");
        int num=scan.nextInt();

        if(num%2==0) {
            System.out.println("these number is even");
        } else {
            System.out.println("these number is odd");}

    }


}
