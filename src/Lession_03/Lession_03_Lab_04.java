package Lession_03;

import java.util.Arrays;

import static com.sun.deploy.net.MessageHeader.merge;

public class Lession_03_Lab_04 {
    public static void main(String[] args) {
        int[] foo = {12, 1, 3, 6,4,7};
        int[] bar = {1,4,5};
        int[] foobar = merge (foo, bar);
        System.out.println(Arrays.toString(foobar));

    }

    private static int[] merge(int[] foo, int[] bar) {
        int fooLength = foo.length;
        int barLength = bar.length;
        int [] foobar = new  int[fooLength+barLength];
        int foopositon, barpositon, mergepositon;
        foopositon = barpositon = mergepositon = 0;
        while (foopositon < fooLength && barpositon < barLength){
            if(foo[foopositon] < bar[barpositon]){
                foobar[mergepositon++]=foo[foopositon++];
            }else{
                foobar[mergepositon++]=bar[foopositon++];
            }

        }
        while (foopositon < fooLength){
            foobar[mergepositon++]=foo[foopositon++];
        }
        while (barpositon < barLength){
            foobar[mergepositon++]=bar[barpositon++];
        }
        return foobar;
    }
}
