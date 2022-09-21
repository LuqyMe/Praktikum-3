package bank;

public class Bank {
    private Nasabah nasabah[];
    private int jumlahNasabah;

    public Bank() {
        nasabah=new Nasabah[100];
        jumlahNasabah=0;
    }

    public void tambahNasabah(String namaAwal, String namaAkhir, Tabungan t) {
        nasabah[jumlahNasabah]=new Nasabah(namaAwal,namaAkhir,t);
        jumlahNasabah++;
    }

    public void tambahNasabah(String namaAwal, String namaAkhir, String idT, String pass, int s){
       Tabungan t = new Tabungan(idT,pass,s);
       nasabah[jumlahNasabah]=new Nasabah(namaAwal,namaAkhir,t);
       jumlahNasabah++;
    }
    public int getJumlahNasabah() {
        return jumlahNasabah;
    }

    public Nasabah getNasabah(int indeks) {
        return nasabah[indeks];
    }
}
