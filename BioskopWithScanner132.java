import java.util.Scanner;

public class BioskopWithScanner132 {
    public static void main(String[] args) {
    Scanner input13 = new Scanner(System.in);

    int baris, kolom;
    int choice;
    String nama, next;

    String[][] penonton = new String[4][2];

    while (true) {
        System.out.println("=============================");
        System.out.println("         PILIH MENU          ");
        System.out.println(" 1. Input data penonton      ");
        System.out.println(" 2. Tampilkan daftar penonton");
        System.out.println(" 3. Exit                     ");
        System.out.println("=============================");

        System.out.print("Pilih menu : ");
        choice = input13.nextInt();

        switch (choice) {
            case 1:
            while (true) {
            input13.nextLine();
            System.out.print("Masukkan nama: ");
            nama = input13.nextLine();
            System.out.print("Masukkan baris: ");
            baris = input13.nextInt();

            if (baris < 1 || baris > 4) {
                System.out.println("Kursi pada baris ini tidak tersedia, mohon inputkan dengan benar");
                continue;
            }

            System.out.print("Masukkan kolom: ");
            kolom = input13.nextInt();
            input13.nextLine();

            if (kolom < 1 || kolom > 4) {
                System.out.println("Kursi pada kolom ini tidak tersedia, mohon inputkan dengan benar");
                continue;
            }

            penonton[baris - 1][kolom - 1] = nama;

            System.out.println("Input penonton lainnya? (y/n): ");
            next = input13.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
            if (penonton[baris - 1][kolom - 1] != null) {
                System.out.println("Kursi tersebut telah terisi oleh penonton lainnya");
                System.out.println("masukkan input an baris dan kolom kembali");
                continue;
            }

            }
            break;
            case 2:
            System.out.println("Daftar Nama Penonton");
            System.out.println("====================");
            for (int i = 0; i < penonton.length; i++) {
                for (int j = 0; j < penonton[i].length; j++) {
                    if (penonton[i][j] == null) {
                penonton[i][j] = "***";
            }
                System.out.println("Nama penonton pada baris ke-" + i + " kolom ke-" + (j + 1) + ": " + penonton[i][j]);
            }
        }

            break;
            case 3:
            System.exit(0);
            break;
        default:
            break;
        }
    }

    }
}