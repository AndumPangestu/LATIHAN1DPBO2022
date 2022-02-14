public class team {
    private String namaTeam;
    private String negaraAsal;
    private String pelatih;
    private int tahunBerdiri;
    private int jumlahPemain;
    private String pemain[];

    public team(String namapemain, String negaraAsal, int tahunBerdiri, String pelatih, int jumlahPemain) {
        this.namaTeam = namapemain;
        this.negaraAsal = negaraAsal;
        this.pelatih = pelatih;
        this.tahunBerdiri = tahunBerdiri;
        this.jumlahPemain = jumlahPemain;
        this.pemain = new String[jumlahPemain];
    }

    public team() {
    }

    public void setNamaTeam(String namapemain) {
        this.namaTeam = namapemain;
    }

    public void setNegaraAsal(String negaraAsal) {
        this.negaraAsal = negaraAsal;
    }

    public void setTahunBerdiri(int tahunBerdiri) {
        this.tahunBerdiri = tahunBerdiri;
    }

    public void setPelatih(String pelatih) {
        this.pelatih = pelatih;
    }

    public void setJumlahPemain(int jumlahPemain) {
        this.jumlahPemain = jumlahPemain;
    }

    public void addPemain(String pemain, int indeks) {
        this.pemain[indeks] = pemain;
    }

    public String getNamaTeam() {
        return namaTeam;
    }

    public String getNegaraAsal() {
        return negaraAsal;
    }

    public int getTahunBerdiri() {
        return tahunBerdiri;
    }

    public String getPelatih() {
        return pelatih;
    }

    public int getJumlahPemain() {
        return jumlahPemain;
    }

    public String[] getPemain() {

        return this.pemain;
    }

}
