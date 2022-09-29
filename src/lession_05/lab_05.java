package lession_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class lab_05 {
    public static void main(String[] args) {
        List<Integer> myArrayList = new ArrayList<>();

        boolean isContinuing = true;
        while (isContinuing){
            printGamenu();
            int userOperation = GetUserOperation();

            switch (userOperation){
                case 0:
                    isContinuing = false;
                    break;
                case 1:
                    addNumberIntoArrayList(myArrayList);
                    break;
                case 2:
                    printArraayList(myArrayList);
                    break;
                case 3:
                    int maxValue = getMaxValue(myArrayList);
                    System.out.println(maxValue);
                    break;
                case 4:
                    int minValue = getMinValue(myArrayList);
                    System.out.println(minValue);
                    break;
                case 5:
                    searchNumber(myArrayList);
                default:
                    System.out.println("wrong option");
            }
        }
    }

    private static void searchNumber(List<Integer> myArrayList) {
        System.out.print(" Nhap so can tim  trong  mang : ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if(myArrayList.contains(i)) {
            System.out.println(i + " Tìm thấy trong mảng");
        } else {
            System.out.println(i + " Không tìm thấy trong mảng");
        }
    }

    private static int getMinValue(List<Integer> myArrayList) {

        Integer min = Collections.min(myArrayList);
        System.out.println("Minimum element is: "+min);

        return min;
    }

    private static int  getMaxValue(List<Integer> myArrayList) {
        // Integer min = Collections.min(myArrayList);
        // System.out.println("Minimum element is: "+min);
        Integer max = Collections.max(myArrayList);
        System.out.println("Maximum element is: "+max);

        return max;
    }

    private static void printArraayList(List<Integer> myArrayList) {
        System.out.println(myArrayList);

    }

    private static void addNumberIntoArrayList(List<Integer> myArrayList) {
        System.out.println("Mang co may chu so");
        Scanner scanner = new Scanner(System.in);
        int numberoflist = scanner.nextInt();
        for (int index  = 0; index < numberoflist; index++) {

            System.out.println("vui long nhap arrayList" + (index+1 ) + ":");
            int number = scanner.nextInt();
            myArrayList.add(number);
        }
        //  Scanner scanner = new Scanner(System.in);


    }
    private static int GetUserOperation() {
        System.out.println("vui long nhap option: ");
        Scanner scanner = new Scanner(System.in);
        int UserOperation = scanner.nextInt();
        return UserOperation;
    }

    private static void printGamenu() {
        System.out.println("==Game menu==");
        System.out.println("1. Add number into arrayList");
        System.out.println("2. Print arrayList");
        System.out.println("3. Max value arrayList");
        System.out.println("4. Min value arrayList");
        System.out.println("5. Tim kiem arrayList");
    }
}