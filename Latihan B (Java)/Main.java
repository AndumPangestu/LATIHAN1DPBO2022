import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // team mu = new team("Manchester United", "Inggris", 1878, "Ralf Rangnick");

        // team.pemain[] daftarpemain = new team.pemain[3];
        // daftarpemain[0] = mu.new pemain("Cristiano Ronaldo", "Portugal", 7);
        // daftarpemain[1] = mu.new pemain("David De Gea", "Spain", 1);

        // System.out.println(mu.getNamaTeam());
        // System.out.println(mu.getNegaraAsal());
        // System.out.println(mu.getTahunBerdiri());

        // for (int i = 0; i < 2; i++) {
        // System.out.print(daftarpemain[i].getNamaPemain());
        // System.out.print(" ");
        // System.out.print(daftarpemain[i].getNegaraAsal());
        // System.out.print(" ");
        // System.out.print(daftarpemain[i].getNomorPunggung());
        // System.out.println();
        // }

        int n = 0;
        System.out.print("Input Jumlah Team yang akan ditambahkan : ");
        Scanner sc = new Scanner(System.in);
        try {
            n = sc.nextInt();
        } catch (Exception e) {
        }

        team[] daftarTeam = new team[n];

        String namaTeam = "", negaraAsal = "", pelatih = "";
        int tahunBerdiri = 0, jumlahPemain = 0;

        String namaPemain = "";

        System.out.println("---------------------------------");
        System.out.print("Input Data Team : \n");
        System.out.println("---------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.print("Input Nama Team : ");
            try {
                namaTeam = sc.next();
            } catch (Exception e) {
            }

            System.out.print("Input Negara Asal Team : ");
            try {
                negaraAsal = sc.next();
            } catch (Exception e) {
            }

            System.out.print("Input Tahun Berdiri : ");
            try {
                tahunBerdiri = sc.nextInt();
            } catch (Exception e) {
            }

            System.out.print("Input Nama Pelatih : ");
            try {
                pelatih = sc.next();
            } catch (Exception e) {
            }

            System.out.print("Input Jumlah Pemain : ");
            try {
                jumlahPemain = sc.nextInt();
            } catch (Exception e) {
            }

            daftarTeam[i] = new team(namaTeam, negaraAsal, tahunBerdiri, pelatih, jumlahPemain);

            for (int j = 0; j < jumlahPemain; j++) {
                System.out.print("Input Nama Pemain " + (j + 1) + " : ");
                try {
                    namaPemain = sc.next();
                } catch (Exception e) {
                }

                daftarTeam[i].addPemain(namaPemain, j);

            }

        }

        for (int i = 0; i < daftarTeam.length; i++) {
            System.out.print("=================================\n");
            System.out.println("Data Team " + daftarTeam[i].getNamaTeam() + " : ");
            System.out.println("---------------------------------");
            System.out.println("- Nama Team : " + daftarTeam[i].getNamaTeam());
            System.out.println("- Negara Asal : " + daftarTeam[i].getNegaraAsal());
            System.out.println("- Tahun Berdiri : " + daftarTeam[i].getTahunBerdiri());
            System.out.println("- Nama Pelatih : " + daftarTeam[i].getPelatih());
            System.out.println("- Daftar Pemain : ");
            for (int j = 0; j < daftarTeam[i].getJumlahPemain(); j++) {
                System.out.println((j + 1) + ". " + daftarTeam[i].getPemain()[j]);
            }
        }
        System.out.println("---------------------------------");
        System.out.print("=================================\n");
    }
}
