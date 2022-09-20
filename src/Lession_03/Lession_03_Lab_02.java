package Lession_03;

import java.util.Scanner;

public class Lession_03_Lab_02 {
    public static void main(String[] args) {
        int Size, i = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Nhap so phan tu cua mang : ");
        Size = scanner.nextInt();

        int [] array = new int[Size];

        System.out.print(" Nhap " + Size + " phan tu cua mang: ");
        while (i < Size)
        {
            array[i] = scanner.nextInt();
            i++;
        }
        int min = array[0];
        int max =array[0];
        for (i = 0; i<array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("gia tri nho nhat la: " +min);
        System.out.println("gia tri lon nhat la: " +max);
    }
}
