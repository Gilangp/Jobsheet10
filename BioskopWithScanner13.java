import java.util.Scanner;

public class BioskopWithScanner13 {

    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukkan nama: ");
            nama = input13.nextLine();
            System.out.print("Masukkan baris: ");
            baris = input13.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = input13.nextInt();
            input13.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            next = input13.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
