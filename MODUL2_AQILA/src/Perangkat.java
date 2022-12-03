public class Perangkat {
    String drive;
    int ram;
    float processor;

    Perangkat(String drive,int ram,float processor){
        this.drive=drive;
        this.ram=ram;
        this.processor=processor; 
    }
    void display(){
        System.out.println("Gadget Info");
        System.out.println(this.ram+"GB");
        System.out.println(this.processor+"Ghz");
        System.out.println(this.drive);
    }
}
