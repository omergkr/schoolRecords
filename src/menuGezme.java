
import java.util.*;

public class menuGezme {

    public static void main(String[] args) {

        anaMenu();

    }

    public static String kullanicidanVeriAl(String ekranYazisi) {
        Scanner sc = new Scanner(System.in);
        System.out.print(ekranYazisi + " : ");
        return sc.nextLine();
    }


    public static boolean menuGirisKontrol(String str, String[] menuSecimListesi){
        return Arrays.asList(menuSecimListesi).contains(str);
    }


    public static void anaMenu(){
        System.out.println();
        String menuSecim="";
        do{
            System.out.println("___ ANA MENÜ ___");
            System.out.println("1 - Alt Menü - 1");
            System.out.println("2 - Alt Menü - 2");
            System.out.println("3 - Alt Menü - 3");
            System.out.println("0 - Çıkış");

            menuSecim = kullanicidanVeriAl("Seciminizi Yapiniz");
            if (!menuGirisKontrol(menuSecim, "1230".split("")))
                System.out.println("Menüden Secim Yapiniz...");
            switch (menuSecim){
                case "1":
                    System.out.println();
                    altMenu1();
                    break;
                case "2":
                    System.out.println();
                    altMenu2();
                    break;
                case "3":
                    System.out.println();
                    altMenu3();
                    break;
            }
        } while( !menuSecim.equals("0") );
        System.out.println();
        System.out.println("Program Sonlandiriliyor.......");
    }


    public static void altMenu1(){
        String menuSecim="";
        do{
            System.out.println("___ ALT MENÜ - 1 ___");
            System.out.println("1 - İşlem - 1");
            System.out.println("2 - İşlem - 2");
            System.out.println("3 - İşlem - 3");
            System.out.println("0 - Ana Menü");

            menuSecim = kullanicidanVeriAl("Seciminizi Yapiniz");
            if (!menuGirisKontrol(menuSecim, "1230".split("")))
                System.out.println("Menüden Secim Yapiniz...");
            switch (menuSecim){
                case "1":
                    System.out.println("ALT MENÜ - 1 --> İşlem - 1");
                    System.out.println();
                    break;
                case "2":
                    System.out.println("ALT MENÜ - 1 --> İşlem - 2");
                    System.out.println();
                    break;
                case "3":
                    System.out.println("ALT MENÜ - 1 --> İşlem - 3");
                    System.out.println();
                    break;
            }
        } while( !menuSecim.equals("0") );
        System.out.println();
    }



    public static void altMenu2(){
        String menuSecim="";
        do{
            System.out.println("___ ALT MENÜ - 2 ___");
            System.out.println("1 - İşlem - 1");
            System.out.println("2 - İşlem - 2");
            System.out.println("3 - İşlem - 3");
            System.out.println("0 - Ana Menü");

            menuSecim = kullanicidanVeriAl("Seciminizi Yapiniz");
            if (!menuGirisKontrol(menuSecim, "1230".split("")))
                System.out.println("Menüden Secim Yapiniz...");
            switch (menuSecim){
                case "1":
                    System.out.println("ALT MENÜ - 2 --> İşlem - 1");
                    System.out.println();
                    break;
                case "2":
                    System.out.println("ALT MENÜ - 2 --> İşlem - 2");
                    System.out.println();
                    break;
                case "3":
                    System.out.println("ALT MENÜ - 2 --> İşlem - 3");
                    System.out.println();
                    break;
            }
        } while( !menuSecim.equals("0") );
        System.out.println();
    }



    public static void altMenu3(){
        String menuSecim="";
        do{
            System.out.println("___ ALT MENÜ - 3 ___");
            System.out.println("1 - İşlem - 1");
            System.out.println("2 - İşlem - 2");
            System.out.println("3 - İşlem - 3");
            System.out.println("0- Ana Menü");

            menuSecim = kullanicidanVeriAl("Seciminizi Yapiniz");
            if (!menuGirisKontrol(menuSecim, "1230".split("")))
                System.out.println("Menüden Secim Yapiniz...");
            switch (menuSecim){
                case "1":
                    System.out.println("ALT MENÜ - 3 --> İşlem - 1");
                    System.out.println();
                    break;
                case "2":
                    System.out.println("ALT MENÜ - 3 --> İşlem - 2");
                    System.out.println();
                    break;
                case "3":
                    System.out.println("ALT MENÜ - 3 --> İşlem - 3");
                    System.out.println();
                    break;
            }
        } while( !menuSecim.equals("0") );
        System.out.println();
    }


}
