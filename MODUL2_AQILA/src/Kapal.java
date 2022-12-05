public class Kapal extends TransportasiAir {
    protected String mesin;
    
    public Kapal(int jumlahKursi, int biaya, String mesin) {
        super(jumlahKursi, biaya);
        this.mesin=mesin;
    }
    
    public void informasi(){
        System.out.println("Transportasi Air jenis Kapal dengan kursi berjumlah "+jumlahKursi+" ditetapkan biaya sebesar Rp." +biaya);
    }
    public void berlayar(){
        System.out.println("Transportasi Air jenis Kapal sedang berlayar menggunakan diesel dengan kecepatan tidak stabil ");
    }
    public void berlayar(int kecepatan){
        System.out.println("Transportasi Air jenis kapal sedang berlayar menggunakan " + mesin + " kecepatan kisaran 20 knot");
    }
    public void berlabuh(){
        System.out.println("Kapal berlabuh di pantai");
    }
}
