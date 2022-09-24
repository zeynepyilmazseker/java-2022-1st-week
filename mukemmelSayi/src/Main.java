public class Main {
    public static void main(String[] args) {
        int sayi = 1;
        int toplam = 0;

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam = toplam + i;

            }


        }
        if (toplam == sayi) {
            System.out.println("sayınız mükemmel sayı");
        } else{
            System.out.println("sayınız mükemmel sayı değildir.");

        }

    }
}