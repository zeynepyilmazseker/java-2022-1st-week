public class Main {
    public static void main(String[] args) {
        String[][] sehirler = new String[3][3];

        sehirler[0][0] = "ıstanbul";
        sehirler[0][1] = "ızmıt";
        sehirler[0][2] = "bursa";
        sehirler[1][0] = "mugla";
        sehirler[1][1] = "ızmır";
        sehirler[1][2] = "manisa";
        sehirler[2][0] = "bartin";
        sehirler[2][1] = "kastamonu";
        sehirler[2][2] = "rize";

        //önce satırları sonra sütunu gezer bu da iç içe döngü demek
        //en dıştaki for satırları; içteki for sütunları yazar

        for (int i = 0; i <= 2; i++) {
            System.out.println("----------");
            for (int j = 0; j <= 2; j++) {
                System.out.println(sehirler[i][j]);
            }
        }
    }
}