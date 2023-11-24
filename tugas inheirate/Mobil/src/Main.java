public class Main {

    public static void main(String[] args) {
        
        FileMesinMobil mobil1 = new FileMesinMobil();
        FileSperpatMobil mobil2 = new FileSperpatMobil();
        FileDealerMobil mobil3 = new FileDealerMobil();

        mobil1.display();
        mobil1.namamesin ="V12";
        System.out.println(mobil1.namamesin);
        mobil1.tenagamesin = "1000 HP";
        System.out.println(mobil1.tenagamesin);

        mobil2.display();
        mobil2.namaSparepat ="piston";
        System.out.println(mobil2.namaSparepat);
        mobil2.hargaSparepat = "Rp. 100.000";
        System.out.println(mobil2.hargaSparepat);
        mobil2.berapaLamaPengiriman = "5 hari pengiriman";
        System.out.println(mobil2.berapaLamaPengiriman);

        mobil3.display();
        mobil3.namaDealer ="AZIMA.CO";
        System.out.println(mobil3.namaDealer);
        mobil3.alamtaDealer = "Jl. Perumahan Buah Batu";
        System.out.println(mobil3.alamtaDealer);
        mobil3.noHp = "+62898989";
        System.out.println(mobil3.noHp);
    }
    
}
