public class Main {
    public static void main(String[] args) {
        String mesaj = "      Bugun Hava çok güzel.      ";
        //stringler char arraydır
        System.out.println(mesaj);

        System.out.println("eleman sayısı:" + mesaj.length()); //string ifadenin karakter sayısını verir
         System.out.println("5.eleman:" + mesaj.charAt(4)); //string ifadenin kaçıncı indexinde hangi karaketer olduğunu gösterir
        System.out.println(mesaj.concat(" yaşasın!")); // yazılan ifadeyi birleştirir
        System.out.println(mesaj);
        System.out.println(mesaj.startsWith("b")); //ifade belirtilen karakterle başlıyır mu true ya da false olarak geri dönüş yaoar
        System.out.println(mesaj.endsWith("."));
        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("av"));  //av geçen ilk karakteri bulma
        System.out.println(mesaj.lastIndexOf("e")); //indexi soldan sayararak verir ancak incelerken sağdan başlar


        System.out.println("--------");


        String yeniMesaj = mesaj.replace(' ', '-'); //karakter değiştirme
        System.out.println(yeniMesaj);


        System.out.println(mesaj.substring(7)); //kelimeyi belirlenen karakterlere göre kesti
        System.out.println(mesaj.substring(2, 5));

        for (String kelime : mesaj.split(" ")) {  //cümleyi boşlukları referans alarak böldük
            System.out.println(kelime);
        }


        System.out.println(mesaj.toLowerCase());  //küçük harfe çevirir
        System.out.println(mesaj.toUpperCase());  //büyük harfe çevirir

        System.out.println(mesaj.trim()); //kelime başındaki ve sonundaki boşlukları atar



    }
}