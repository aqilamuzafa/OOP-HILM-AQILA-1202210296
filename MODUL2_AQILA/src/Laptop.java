public class Laptop extends Perangkat {
    boolean webcam;

    Laptop(String drive,int ram,float processor,boolean webcam){
        super(drive,ram,processor);
        this.webcam=webcam;
    }
    void display(){
        super.display();
        System.out.println("Camera :"+this.webcam);
    }
    void email(String email){
        System.out.println("Mengirim Email Ke :"+email);
    }
    void email(String email, String email1){
        System.out.println("Mengirim Email ke :"+email);
        System.out.println("Mengirim Email ke :"+email1);
    }
}