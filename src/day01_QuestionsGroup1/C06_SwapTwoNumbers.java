package day01_QuestionsGroup1;

public class C06_SwapTwoNumbers {
    //Swap numbers with temporary variable
    public static void main(String[] args) {

        int x=10;
        int y=20;

        System.out.println("swap öncesi deger "+x+" und "+y );

        int t=x;
        x=y;
        y=t;

        System.out.println("swap sonrasi deger "+x+" und "+y );

        //swap two numbers without using a temporary

        int m=5;
        int n=10;

        System.out.println("2. swap öncesi deger "+m+" und "+n );

        m=m-n;
        n=m+n;
        m=n-m;

        System.out.println("2. swap sonrasi deger "+m+" und "+n );




    }
}
