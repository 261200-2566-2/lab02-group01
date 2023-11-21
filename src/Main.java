// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("--------------Create Object Part-------------");
        AirPurifier c1 = new AirPurifier("Xiaomi 3c" , "K1");
        AirPurifier c2 = new AirPurifier("Xiaomi 3c" , "K2");
        AirPurifier c3 = new AirPurifier("Xiaomi 3c" , "K3");
        AirPurifier h1 = new AirPurifier("Xiaomi 3H" , "K1");
        AirPurifier h2 = new AirPurifier("Xiaomi 3H" , "K2");
        AirPurifier Pro1 = new AirPurifier("Xiaomi Pro" , "K69");
        AirPurifier Pro2 = new AirPurifier("Xiaomi Pro" , "K68");
        AirPurifier ProH1 = new AirPurifier("Xiaomi Pro H" , "K1");
        AirPurifier ProH2 = new AirPurifier("Xiaomi Pro H" , "K2");
        AirPurifier Four1 = new AirPurifier("Xiaomi 4" , "K1");
        AirPurifier Four2 = new AirPurifier("Xiaomi 4" , "K2");
        AirPurifier Four_P1 = new AirPurifier("Xiaomi 4 Pro" , "K1");
        AirPurifier Four_P2 = new AirPurifier("Xiaomi 4 Pro" , "K2");
        AirPurifier x1 = new AirPurifier("Xiaomi X" , "K2");
        System.out.println("C3 model: "+AirPurifier.c3_model_count);
        System.out.println("H3 model: "+AirPurifier.h3_model_count);
        System.out.println("Pro model: "+AirPurifier.pro_model_count);
        System.out.println("Pro H model: "+AirPurifier.pro_H_model_count);
        System.out.println("4 model: "+AirPurifier.Four_model_count);
        System.out.println("4 Pro model: "+AirPurifier.Four_pro_model_count);
        System.out.println("--------------Process of AirPurifier Part-------------");
        Pro1.turnOn();
        Pro1.turnOff();
        System.out.println("--------------Find Most Popular AirPurifier Part-------------");
        System.out.print("Most Popular Air Purifier is : ");
        AirPurifier.mostPopularModel();
        c1.getInformation();
    }
}