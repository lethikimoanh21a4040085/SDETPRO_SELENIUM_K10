package lession_06;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class lab_06_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap chuoi");
        String string = new String();
        string= sc.nextLine();

        System.out.println("Chuoi do la "+string);

        for (char dig : string.toCharArray())
        {

            if (Character.isDigit(dig))
            {
                System.out.println("The digit found is "+dig);
            }
        }
    }
}
