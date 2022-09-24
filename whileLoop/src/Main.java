public class Main {
    public static void main(String[] args) {
        int i=1;
        while(i<10) {
            i+=2;
            System.out.println(i);

        }
        System.out.println("while döngüsü bitti");

        //Do While
        int j=1 ;
        do {
            System.out.println(j);
            j += 2;
        }while(j<10);
        System.out.println("do-while döngüsü bitti");
        //do while döngüsü şart sağlanmasa bile bir kere çalışır
        //şart sağlanırsa while döngüsünden pek bir farkı yoktur.
    }
}