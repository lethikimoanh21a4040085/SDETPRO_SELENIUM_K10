package lession_06;
import java.util.HashMap;
import java.util.Scanner;

public class lab_06_01 {
    public static void main(String[] args) {
        HashMap<String, Integer> times = new HashMap<String, Integer>();
        times.put("hour", 2);
        times.put("minutes",5);
        System.out.println(times.get("hour"));
        System.out.println(times.get("minutes"));
        int minutes = times.get("hour") * 60 + times.get("minutes");
        System.out.println("Maximum element is:" +minutes);
    }
}
