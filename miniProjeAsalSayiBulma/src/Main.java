public class Main {
    public static void main(String[] args) {
        int number = -100;
        boolean isPrime = true;
        if (number < 2) {
            System.out.println("geçersiz sayı girdiniz");
            return;
        }

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("Sayınız asal");

        } else {
            System.out.println("sayınız asal değildir");
        }


    }

}




