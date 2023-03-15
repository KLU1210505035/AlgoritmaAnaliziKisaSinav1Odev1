import java.util.Random;
//1210505035 Emirhan Şimşek BubbleSort Sıralamasında BruteForce Yöntemi ile Çalışma Süresi Bulma
public class BubbleSortBruteForce {

    public static void main(String[] args) {
        int[] rastgeledizi = new int[10000]; // Diziyi Oluşturdum.

        Random rastgelesayi = new Random(); // Rastgele Sayılar Verdim.

        for (int i = 0; i < rastgeledizi.length; i++) {
            rastgeledizi[i] = rastgelesayi.nextInt(10000);
        }

        long baslazaman = System.currentTimeMillis(); // Başlangıc zamanını buldum.


        for (int a = 0; a < rastgeledizi.length - 1; a++) { // Diziyi BubbleSort Algoritması BruteForce Yöntemi ile Sırala

            for (int b = a + 1; b < rastgeledizi.length; b++) {

                if (rastgeledizi[b] < rastgeledizi[a]) {

                    int gecici = rastgeledizi[a];
                    rastgeledizi[a] = rastgeledizi[b];
                    rastgeledizi[b] = gecici;

                }
            }
        }

        long bitiszaman = System.currentTimeMillis();
        long calismasure = bitiszaman - baslazaman;

        System.out.println("Çalışma Süresi: " + calismasure + " ms'dir.");
    }
}