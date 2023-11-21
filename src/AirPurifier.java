import java.util.Arrays;

public class AirPurifier {
    private String model;
    private String serial_Number;
    private String Status;
    private double price;
    boolean power;
    static int pro_model_count = 0;
    static int c3_model_count = 0;
    static int h3_model_count = 0;
    static int pro_H_model_count = 0;
    static int Four_model_count = 0;
    static int Four_pro_model_count = 0;
    static String [] c3_serialNumber = new String [10];
    static String [] h3_serialNumber = new String [10];
    static String [] pro_serialNumber = new String [10];
    static String [] pro_H_serialNumber = new String [10];
    static String [] Four_serialNumber = new String [10];
    static String [] Four_pro_serialNumber = new String [10];
    static  void c3_count_model(String serial_Number){
        boolean check_serialNumber = false;
        if(c3_model_count == 0){
            c3_serialNumber[c3_model_count] = serial_Number;
            c3_model_count++;
        }else{
            for(int i = 0 ; i < c3_model_count ; i++){
                if(serial_Number.equals(c3_serialNumber[i])){
                    check_serialNumber = true;
                    break;
                }
            }
            if(!check_serialNumber){
                c3_serialNumber[c3_model_count] = serial_Number;
                c3_model_count++;
            }
        }
    }
    static  void h3_count_model(String serial_Number){
        boolean check_serialNumber = false;
        if(h3_model_count == 0){
            h3_serialNumber[h3_model_count] = serial_Number;
            h3_model_count++;
        }else{
            for(int i = 0 ; i < h3_model_count ; i++){
                if(serial_Number.equals(h3_serialNumber[i])){
                    check_serialNumber = true;
                    break;
                }
            }
            if(!check_serialNumber){
                h3_serialNumber[h3_model_count] = serial_Number;
                h3_model_count++;
            }
        }
    }
    static  void pro_count_model(String serial_Number){
        boolean check_serialNumber = false;
        if(pro_model_count == 0){
            pro_serialNumber[pro_model_count] = serial_Number;
            pro_model_count++;
        }else{
            for(int i = 0 ; i < pro_model_count ; i++){
                if(serial_Number.equals(pro_serialNumber[i])){
                    check_serialNumber = true;
                    break;
                }
            }
            if(!check_serialNumber){
                pro_serialNumber[pro_model_count] = serial_Number;
                pro_model_count++;
            }
        }
    }
    static  void pro_H_count_model(String serial_Number){
        boolean check_serialNumber = false;
        if(pro_H_model_count == 0){
            pro_H_serialNumber[pro_H_model_count] = serial_Number;
            pro_H_model_count++;
        }else{
            for(int i = 0 ; i < pro_H_model_count ; i++){
                if(serial_Number.equals(pro_H_serialNumber[i])){
                    check_serialNumber = true;
                    break;
                }
            }
            if(!check_serialNumber){
                pro_H_serialNumber[pro_H_model_count] = serial_Number;
                pro_H_model_count++;
            }
        }
    }
    static  void Four_count_model(String serial_Number) {
        boolean check_serialNumber = false;
        if (Four_model_count == 0) {
            Four_serialNumber[Four_model_count] = serial_Number;
            Four_model_count++;
        } else {
            for (int i = 0; i < Four_model_count; i++) {
                if (serial_Number.equals(Four_serialNumber[i])) {
                    check_serialNumber = true;
                    break;
                }
            }
            if (!check_serialNumber) {
                Four_serialNumber[Four_model_count] = serial_Number;
                Four_model_count++;
            }
        }
    }
    static  void Four_pro_count_model(String serial_Number) {
        boolean check_serialNumber = false;
        if (Four_pro_model_count == 0) {
            Four_pro_serialNumber[Four_pro_model_count] = serial_Number;
            Four_pro_model_count++;
        } else {
            for (int i = 0; i < Four_pro_model_count; i++) {
                if (serial_Number.equals(Four_pro_serialNumber[i])) {
                    check_serialNumber = true;
                    break;
                }
            }
            if (!check_serialNumber) {
                Four_pro_serialNumber[Four_pro_model_count] = serial_Number;
                Four_pro_model_count++;
            }
        }
    }
    static void mostPopularModel(){
        int [] ArrayOfModel = {c3_model_count,h3_model_count,pro_model_count,pro_H_model_count,Four_model_count,Four_pro_model_count};
        Arrays.sort(ArrayOfModel);
        if(ArrayOfModel[5] == c3_model_count){
            System.out.print("Xiaomi 3C  ");
        }
        if(ArrayOfModel[5] == h3_model_count){
            System.out.print("Xiaomi 3H  ");
        }
        if(ArrayOfModel[5] == pro_model_count){
            System.out.print("Xiaomi Pro  ");
        }
        if(ArrayOfModel[5] == pro_H_model_count){
            System.out.print("Xiaomi Pro H  ");
        }
        if(ArrayOfModel[5] == Four_model_count){
            System.out.print("Xiaomi 4  ");
        }
        if(ArrayOfModel[5] == Four_pro_model_count){
            System.out.print("Xiaomi 4 Pro  ");
        }
        System.out.println(" ");
    }
    AirPurifier(String model ,String serial_Number){
        this.model = model;
        this.serial_Number = serial_Number;
        switch (model) {
            case "Xiaomi 3c" -> {
                price = 104.95;
                System.out.println("Create your Object complete your object is "+model+" serialNO "+serial_Number);
                c3_count_model(serial_Number);
            }
            case "Xiaomi 3H" -> {
                price = 134.95;
                System.out.println("Create your Object complete your object is "+model+" serialNO "+serial_Number);
                h3_count_model(serial_Number);
            }
            case "Xiaomi Pro" -> {
                price = 199.95;
                System.out.println("Create your Object complete your object is "+model+" serialNO "+serial_Number);
                pro_count_model(serial_Number);
            }
            case "Xiaomi Pro H" -> {
                price = 264.95;
                System.out.println("Create your Object complete your object is "+model+" serialNO "+serial_Number);
                pro_H_count_model(serial_Number);
            }
            case "Xiaomi 4" -> {
                price = 184.95;
                System.out.println("Create your Object complete your object is "+model+" serialNO "+serial_Number);
                Four_count_model(serial_Number);
            }
            case "Xiaomi 4 Pro" -> {
                price = 259.95;
                System.out.println("Create your Object complete your object is "+model+" serialNO "+serial_Number);
                Four_pro_count_model(serial_Number);
            }
            default -> System.out.println("Create your Object complete your object is "+model+" serialNO "+serial_Number+ " but your model is not in our list");
        }
    }
    void turnOn(){
        power = true;
        System.out.println("Your Air Purifier is turn On");
    }
    void turnOff(){
        power = false;
        System.out.println("Your Air Purifier is turn Off");
    }
    void getInformation(){
        System.out.println("Model : "+this.model);
        System.out.println("Serial NO. : "+this.serial_Number);
        System.out.println("Price : "+this.price + " €");
    }
    String getPM_level(int sensor){
        if(sensor < 0){
            Status = null;
            return "Error";
        }else if(sensor <= 25){
            Status = "Light Blue";
            return "Very Good";
        }else if(sensor <= 50){
            Status = "Green";
            return "Good";
        }else if(sensor <= 100){
            Status = "Yellow";
            return "Moderate";
        }else if(sensor <= 200){
            Status = "Orange";
            return "Affects Health";
        }else{
            Status = "Red";
            return "Badly";
        }
    }
    String Show_Status(){
        return Status;
    }
}
