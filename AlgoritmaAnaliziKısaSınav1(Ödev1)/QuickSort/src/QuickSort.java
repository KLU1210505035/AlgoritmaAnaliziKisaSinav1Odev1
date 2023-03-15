import java.util.Random;
//1210505035 Emirhan Şimşek QuickSort ile Sıralama ve Çalışma Süresi Bulma.
public class QuickSort {
    public static int ayirma(int[] rastgeledizi, int sol, int sag) {
        int pivotdeger = rastgeledizi[sag];
        int a = sol - 1;

        for (int b = sol; b < sag; b++) {
            if (rastgeledizi[b] < pivotdeger) {
                a++;
                int gecicitut = rastgeledizi[a];
                rastgeledizi[a] = rastgeledizi[b];
                rastgeledizi[b] = gecicitut;
            }
        }
        int gecici = rastgeledizi[a + 1];

        rastgeledizi[a + 1] = rastgeledizi[sag];
        rastgeledizi[sag] = gecici;

        return a + 1;
    }


    public static void main(String[] args) {

        int boyut = 10000;
        int[] rastgeledizi = new int[boyut];

        Random rastgelesayi = new Random();

        for (int a = 0; a < boyut; a++) {
            rastgeledizi[a] = rastgelesayi.nextInt(10000);
        }

        long baslazaman = System.currentTimeMillis();
        quickSort(rastgeledizi, 0, boyut - 1);
        long bitiszaman = System.currentTimeMillis();

        System.out.println("Çalışma Süresi: " + (bitiszaman - baslazaman) +" " +"ms'dir");
    }

    public static void quickSort(int[] rastgeledizi, int sol, int sag) {

        if (sol < sag) {
            int pivotsayiindex = ayirma(rastgeledizi, sol, sag);
            quickSort(rastgeledizi, sag, pivotsayiindex - 1);
            quickSort(rastgeledizi, pivotsayiindex + 1, sag);
        }

    }

}