package day01_QuestionsGroup1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C01_PrintInteger {

    // Question: Print an integer getting input from user

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Schreiben Sie bitte einen nummer : ");
        int num=scan.nextInt();
        System.out.println("Ihre Nummer ist : "+num);

    }

}
