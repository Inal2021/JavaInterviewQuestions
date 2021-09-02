package day01_QuestionsGroup1;

import java.util.Scanner;

public class C08_AlphabetVowelOrConsonant {
    //Question: Check whether an alphabet is Vowel or Consonant
    //a, e, i, o, u

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a character");
        String ch=scan.next();
        switch (ch) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println(ch+" is a vovel");
                break;
            default:
                System.out.println(ch+" is a consanant");
                break;
        }

    }

}
