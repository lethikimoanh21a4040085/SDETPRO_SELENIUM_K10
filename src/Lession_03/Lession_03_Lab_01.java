package Lession_03;
import java.util.Scanner;
public class Lession_03_Lab_01 {
    public static void main(String[] args) {
        int Size, i = 0, j = 0;
        int even = 0, odd = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Nhap so phan tu cua mang : ");
        Size = scanner.nextInt();

        int [] a = new int[Size];

        System.out.print(" Nhap " + Size + " phan tu cua mang: ");
        while (i < Size)
        {
            a[i] = scanner.nextInt();
            i++;
        }

        while(j < Size)
        {
            if(a[j] % 2 == 0)
            {
                even++;
            }
            else
            {
                odd++;
            }
            j++;
        }

        System.out.println("Tong so chan trong mang = " + even);
        System.out.println("Tong so le trong mang = " + odd);
    }
}
