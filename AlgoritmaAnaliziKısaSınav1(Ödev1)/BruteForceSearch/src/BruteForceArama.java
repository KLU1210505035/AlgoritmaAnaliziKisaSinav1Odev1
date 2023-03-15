import java.util.Random;
//1210505035 Emirhan Şimşek BruteForce Yöntemi ile En Büyük Sayı ve Çalışma Zamanı
public class BruteForceArama {

    public static int bruteforceenbuyuksayi(int rastgeledizi[]){

        int bruteforceenbuyuksayi = rastgeledizi[0];
                                                            // BruteForce Yöntemi ile En büyük Sayıyı Buldum.
        for (int i = 0; i < rastgeledizi.length; i++) {
            for (int j = i + 1; j < rastgeledizi.length; j++) {
                if (rastgeledizi[j] > bruteforceenbuyuksayi) {
                    bruteforceenbuyuksayi = rastgeledizi[j];

                }
            }
        }

        System.out.println("Dizideki En Büyük Eleman: "+bruteforceenbuyuksayi);

        return bruteforceenbuyuksayi;  // En Büyük Sayıyı Döndürdüm

    }

    public static void main(String[] args) {


        int rastgeledizi[] = new int[10000];

        Random rastgelesayi = new Random(); // Rastgele Dizi oluşturdum.

        for (int j=0;j<rastgeledizi.length;j++){
            rastgeledizi[j]=rastgelesayi.nextInt(10000);
        }
        long baslazaman = System.currentTimeMillis();

        bruteforceenbuyuksayi(rastgeledizi); // BruteForce ile bulma Fonksiyonunu Çektim.

        long bitiszaman = System.currentTimeMillis();  // Çalışma zamanını Buldum ve Yazdırdım.
        long calismasure = bitiszaman - baslazaman;

        System.out.println("Çalışma süresi: " + calismasure + " ms'dir");
    }

}