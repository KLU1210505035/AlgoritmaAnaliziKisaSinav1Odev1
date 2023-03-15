import java.util.Random;
//1210505035 Emirhan Şimşek LinearSearch (Doğrusal Arama)

public class LinearSearch {
    public static int enbuyuksayi(int rastgeledizi[]){

        int dizienbuyuksayi;
        dizienbuyuksayi =rastgeledizi[0]; // Dizinin En Büyük Elemanını Buldum Ve Return ettim.

        for (int j=1;j<rastgeledizi.length;j++){
            if (rastgeledizi[j]>dizienbuyuksayi)
                dizienbuyuksayi =rastgeledizi[j];
        }

        System.out.println("Dizideki En Büyük Eleman: "+dizienbuyuksayi);

        return dizienbuyuksayi;
    }


    public static void main(String[] args) {


        int rastgeledizi[] = new int[10000];
                                                // Rastgele Diziyi Oluşturdum.
        Random rastgelesayi = new Random();

        for (int j=0; j<rastgeledizi.length;j++){
            rastgeledizi[j]=rastgelesayi.nextInt(10000);
        }

        long baslazaman = System.currentTimeMillis();

        enbuyuksayi(rastgeledizi); // En Büyük Sayiyi Çektim.

        long bitiszaman = System.currentTimeMillis();
        long calismasuresi = bitiszaman - baslazaman;  // Çalısma zamanını buldum ve yazdırdım.

        System.out.println("Çalışma Süresi: " + calismasuresi + " ms'dir ");
    }

}