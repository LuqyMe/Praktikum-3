import bank.*;

public class Main {

    public static void main(String[] args) 
    {
        int tmp;
        boolean status;
        Nasabah nasabah = new Nasabah("Tono", "Toni");
        System.out.println("Nasabah atas nama : " + nasabah.getNamaAwal() + " " + nasabah.getNamaAkhir());
        nasabah.setTabungan(new Tabungan(5000));
        tmp = nasabah.getTabungan().getSaldo();
        
        System.out.println("Saldo awal : " + tmp);
        nasabah.getTabungan().simpanUang(4000);
        System.out.println("Jumlah uang yang disimpan : 4000");
        status = nasabah.getTabungan().ambilUang(6000);
        System.out.print("Jumlah uang yang diambil : 6000");
        
        if (status) {
            System.out.println(" ok");
        } else {
            System.out.println(" gagal");
        }
        nasabah.getTabungan().simpanUang(3000);
        System.out.println("Jumlah uang yang disimpan : 3000");
        status = nasabah.getTabungan().ambilUang(8000);
        System.out.print("Jumlah uang yang diambil : 8000");
        
        if (status) {
            System.out.println(" ok");
        } else {
            System.out.println(" gagal");
        }
        
        status = nasabah.getTabungan().ambilUang(1600);
        System.out.print("Jumlah uang yang diambil : 1600");
        
        if (status) {
            System.out.println(" ok");
        } else {
            System.out.println(" gagal");
        }
        nasabah.getTabungan().simpanUang(5000);
        System.out.println("Jumlah uang yang disimpan : 5000");
        tmp = nasabah.getTabungan().getSaldo();
        System.out.println("Saldo sekarang = " + tmp);

        Nasabah budi = new Nasabah("Anto", "Harto");
        budi.setTabungan(new Tabungan(10000));
        System.out.println(budi.toString());
        System.out.println(nasabah.toString());

        budi.getTabungan().transfer(nasabah.getTabungan(), 3000);
        System.out.println();
        System.out.println("Jumlah yang ditransfer Anto = 3000");
        System.out.println(budi.toString());
        System.out.println(nasabah.toString());

    }
    
}
