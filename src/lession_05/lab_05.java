package lession_05;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class lab_05 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(1);
        number.add(2);
        number.add(6);
        number.add(8);
        System.out.println(number);
        Integer min = Collections.min(number);
        System.out.println("Minimum element is: "+min);
        Integer max = Collections.max(number);
        System.out.println("Maximum element is: "+max);

        int i = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Nhap so can tim  trong  mang : ");
        i = scanner.nextInt();
        if(number.contains(i)) {
            System.out.println(i + " Tìm thấy trong mảng");
        } else {
            System.out.println(i + " Không tìm thấy trong mảng");
        }
    }
}
