package Lession_03;
import java.util.Scanner;

public class Lession_03_Lab_03 {
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
        for (i = 0 ; i <array.length-1; i++){
            int temp = array[i];
            for( int j = i+1; j<array.length; j++){
                if (temp > array[j]) {
                    array[i] = array[j];
                    array[j] = temp;
                    temp = array[i];
                }
            }
        }
        System.out.println("thu tu tang dan cua mang");
        for (i = 0; i < array.length; i++) {
            //System.out.println("thu tu tang dan cua mang");
            System.out.println(array[i]);
        }
    }
}
