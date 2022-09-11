package Lession_02;

import com.sun.xml.internal.messaging.saaj.soap.SOAPPartImpl;
import java.util.Scanner;
public class Lab_01 {
    public static void main(String[] args) {
        String ketQua;
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter weight: ");
        float weight = scanner.nextFloat();
        System.out.print("please enter height: ");
        float height = scanner.nextFloat();
        float BMI = weight / ( height* 2);
        System.out.println("Chỉ số BMI = " + BMI);
                 //Phan loai giua cac chi so can nang
        if (BMI < 18.5) {
            ketQua = "you are underweight";
        }
        else if (BMI <=24.9) {
            ketQua = "you are normal weight";
        }
        else if (BMI <= 29.9) {
            ketQua = "you are overweight";
        }
        else {
            ketQua = "you are Obesity";
        }

        System.out.println(ketQua);
    }


}
