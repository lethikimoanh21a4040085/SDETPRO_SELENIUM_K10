package lession_06;
import java.util.HashMap;
import java.util.Scanner;
public class lab_06_02 {
    public static void main(String[] args) {
        String str = "Kimoanh218@@";
        final int try_enter = 2;
        for (int passAttempts = 0; passAttempts <= 2; passAttempts++) {
            System.out.print("Nhap passWord: ");
            Scanner input = new Scanner(System.in);
            String inputPass = input.nextLine();

            if (!(inputPass.equals(str))) {
                System.out.println("Password sai, vui long nhap lai");
            } else {
                System.out.println("Wellcome");
                break;
            }
            if (passAttempts == try_enter) {
                System.out.println("You are reach maximum password tries");
            }
        }
    }
}
