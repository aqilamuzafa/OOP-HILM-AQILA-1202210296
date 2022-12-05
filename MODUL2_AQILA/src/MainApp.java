public class MainApp {
    public static void main(String[] args) throws Exception {
        System.out.println("Trans Air X");
        TransportasiAir TransAirX = new TransportasiAir(4, 20000);
        TransAirX.informasi();
        TransAirX.berlayar();
        TransAirX.berlabuh();

        System.out.println("");
        
        System.out.println("Sampan 1");
        Sampan sampan1 = new Sampan(20, 50000, 2,2);
        sampan1.informasi();
        sampan1.berlayar();
        sampan1.berlabuh();
        sampan1.berlabuh(0);

        System.out.println("");
        
        System.out.println("kapal1");
        Kapal kapal1 = new Kapal(20, 50000, "diesel");
        kapal1.informasi();
        kapal1.berlayar();
        kapal1.berlayar(50);
        kapal1.berlabuh();
    }
}
