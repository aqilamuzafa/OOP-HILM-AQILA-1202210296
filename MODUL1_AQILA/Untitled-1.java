import java.util.Scanner;

class Simple{  
    public static void main(String args[]){  
     System.out.println("Selamat Datang di Restoran EAD"); 
     System.out.println("Silahkan Register Terlebih Dahulu"); 
     System.out.println("================================="); 
     System.out.println("Nama : Aqila Bintang Muzafa"); 
    // }  
    //  public static void myObj() {
     Scanner NM = new Scanner(System.in);
     System.out.print("Nomor : ");
     int nomor = NM.nextInt();
     System.out.println("Register Success"); 
     System.out.println("=================================");
     System.out.println("1. Menu"); 
     System.out.println("2. Pilih Menu");
     System.out.println("3. Keluar"); 
     System.out.println("=================================");
     Scanner PLH = new Scanner(System.in);
     System.out.print("Masukan Pilihan : ");
     int pilihan = PLH.nextInt();
    }

}  