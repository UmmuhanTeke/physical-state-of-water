package task4;

import java.util.Scanner;

public class _SuyunHalleri {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sicaklik;

        System.out.print("Su Sıcaklığını Giriniz=");
        sicaklik=scanner.nextInt();
        if (sicaklik<0)
            System.out.println("Katı Hal");
        else
            if (sicaklik<=100)
                System.out.println("Sıvı Hal");
            else
                System.out.println("Gaz Hal");
            scanner.close();
    }
}
