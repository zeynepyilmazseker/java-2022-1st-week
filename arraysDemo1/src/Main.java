public class Main {
    public static void main(String[] args) {
        String[] ogrenciler = new String[3];
        ogrenciler[0] = "zeynep";
        ogrenciler[1] = "mustafa";
        ogrenciler[2] = "defne";

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }
        for(String ogrenci: ogrenciler) {
            System.out.println(ogrenci);
        }
    }
}