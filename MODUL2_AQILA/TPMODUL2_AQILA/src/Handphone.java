public class Handphone extends Perangkat {
    boolean fingerprint;

    Handphone(String drive,int ram,float processor,boolean fingerprint){
        super(drive,ram,processor);
        this.fingerprint=fingerprint;
    }
    void display(){
        super.display();
        System.out.println("Fingerprint :"+this.fingerprint);
    }
    void telpon(int no_hp){
        System.out.println("Memanggil "+ no_hp);
    }
    void sms(int no_hp,int no_hp1){
        System.out.println("Mengirim Pesan Ke"+no_hp);
        System.out.println("Mengirim Pesan Ke"+no_hp1);
    }
    void foto(){
        System.out.println("Cekreek, menyimpan ke "+ drive);
    }
}