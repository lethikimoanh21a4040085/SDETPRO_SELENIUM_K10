package Lession_02;
import java.util.Scanner;
public class Lab_02 {
    public static void main(String[] args) {
        String KetQua;
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter number: ");
        float Number = scanner.nextFloat();
        if (Number % 2== 0) {
            KetQua = "This is even";
        }
        else {
            KetQua = "This is an odd number";
        }
        System.out.println(KetQua);
    }
 }

