public class MainApp {
    public static void main(String[] args) throws Exception {
        Laptop Omen = new Laptop("SSD", 16, 3, true);
        Handphone Redmi = new Handphone("MicroSD", 16,8,true);
        Handphone Galaxy = new Handphone("Flash", 32,16,false);


        Omen.display();
        Omen.email("aqilamuzafa@gmail.com");
        Omen.email("aqilamuzafa@student.telkomuniversity.ac.id","aqilamuzafa@yahoo.co.id");

        Redmi.display();
        Redmi.telpon(621234);
        
        Galaxy.display();
        Galaxy.foto();

    }
}