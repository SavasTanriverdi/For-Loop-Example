public class Main {
    public static void main(String[] args) {
        // 1'den 10'a kadar olan sayıları yazdıran bir for döngüsü
        for (int i = 1; i <= 10; i++) {
            System.out.println("Sayı: " + i);
        }

        // Çift sayıları bulan bir for döngüsü
        System.out.println("\nÇift Sayılar:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // Ters döngü ile sayıları yazdırma
        System.out.println("\nTers Sıralama:");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }
}