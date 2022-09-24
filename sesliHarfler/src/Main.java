public class Main {
    public static void main(String[] args) {
        char harf = 'E';
        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("kalın sesli");
                break;

            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println("ince sesli");
                break;

            default:
                System.out.println("geçersiz harf girdiniz.");


        }


    }
}
