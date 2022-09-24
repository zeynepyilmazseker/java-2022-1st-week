public class Main {
    public static void main(String[] args) {

        double[] myList = {1.2, 6.3, 1.4};
        double total = 0;
        double enBuyuk = myList[0];
        for (double number : myList) {
            if (enBuyuk < number) {
                enBuyuk = number;
            }
            total = total + number;
            System.out.println(number);
        }


        System.out.println("toplam=" + total);
        System.out.println("En büyük sayı=" + enBuyuk);
    }

}
