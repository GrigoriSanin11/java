/// Создать множество ноутбуков (ArrayList).



public class DZ {
    
    String brand;
    String model;
    int ram;
    int hardDisk;
    String operSystem;
    String color;

    // Конструктор
    public Notebook(String brand, String model, int ram, int hardDisk, String operSystem, String color){
        this.brand = brand.toUpperCase();
        this.model = model.toUpperCase();
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.operSystem = operSystem.toUpperCase();
        this.color = color.toLowerCase();
    }


    // Сэттеры
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public void setHardDisk(int hardDisk) {
        this.hardDisk = hardDisk;
    }
    public void setOperSystem(String operSystem) {
        this.operSystem = operSystem;
    }
    public void setColor(String color) {
        this.color = color;
    }

    //Геттеры
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getRam() {
        return ram;
    }
    public int getHardDisk() {
        return hardDisk;
    }
    public String getOperSystem() {
        return operSystem;
    }
    public String getColor() {
        return color;
    }
    

    //Вывод в консоль
    public void showInfo(){
        System.out.println(String.format("Производитель: %s\nМодель: %s\nОЗУ(Гб): %d\nОбъем жесткого диска(Гб): %d\nОС: %s\nЦвет: %s\n",
        this.brand, this.model, this.ram, this.hardDisk, this.operSystem, this.color));
    }
    
    @Override
    public String toString() {
        return (String.format("Производитель: %s\nМодель: %s\nОЗУ(Гб): %d\nОбъем жесткого диска(Гб): %d\nОС: %s\nЦвет: %s\n"+"\n",
        this.brand, this.model, this.ram, this.hardDisk, this.operSystem, this.color));
    }
}
  


// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям. Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет. Выводить только те ноутбуки, что соответствуют условию

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map.Entry;

public class DZ {
    public static void main(String[] args) {
        laptop lap1=new laptop("A5",1236,"Xiaomi");
        lap1.setColor("black");
        lap1.setHDD(700);
        lap1.setOS("Windows");
        lap1.setRAM(8);
        
        laptop lap2=new laptop("ABC30",6467,"Acer");
        lap2.setColor("white");
        lap2.setHDD(1000);
        lap2.setOS("Windows");
        lap2.setRAM(8);

        laptop lap3=new laptop("AB97",67201,"Acer");
        lap3.setColor("rose");
        lap3.setHDD(900);
        lap3.setOS("Windows");
        lap3.setRAM(16);

        laptop lap4=new laptop("OMAN11",1111,"hp");
        lap4.setColor("black");
        lap4.setHDD(700);
        lap4.setOS("Linux");
        lap4.setRAM(8);

        laptop lap5=new laptop("MAC101",8438483,"Apple");
        lap5.setColor("silver");
        lap5.setHDD(1000);
        lap5.setOS("macOS");
        lap5.setRAM(8);

        HashSet <laptop> laptops = new HashSet<>(Arrays.asList(lap1,lap2,lap3,lap4,lap5));
        HashSet <laptop> res = new HashSet<>();

        System.out.println("Здравствуйте");
        System.out.print("Введите цифру, соответствующую необходимому критерию:\n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n 4 - цвет \n или 5, чтобы осуществить поиск\n");
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        sc.nextLine();
        HashMap<String, Object> filters = new HashMap<>();
        while(n!=5){
        if(n==1){
            System.out.println("Введите минимальную оперативную память");
            Integer temp = sc.nextInt();
            sc.nextLine();
            filters.put("RAM", temp);
        }
        if(n==2){
            System.out.println("Введите минимальный объем ЖД" );
            Integer temp = sc.nextInt();
            sc.nextLine();
            filters.put("HDD", temp);
        }
        if(n==3){
            System.out.println("Введите ОС");
            String temp = sc.nextLine();
            filters.put("OS", temp);
        }
        if(n==4){
            System.out.println("Введите цвет");
            String temp = sc.nextLine();
            filters.put("color", temp);
        }
        System.out.print("Введите цифру, соответствующую необходимому критерию:\n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n 4 - цвет \n или 5, чтобы осуществить поиск\n");
        n = sc.nextInt();
        sc.nextLine();
    }
        for (Entry<String, Object> entry : filters.entrySet()) {
            if(entry.getKey().equals("RAM")){
                Iterator it = laptops.iterator();
                while(it.hasNext()){
                    laptop lap = (laptop) it.next();
                    if(lap.getRAM()>=(Integer)entry.getValue()){
                        res.add(lap);
                    }
                }
                }
             if(entry.getKey().equals("HDD")){
                Iterator it = laptops.iterator();
                while(it.hasNext()){
                    laptop lap = (laptop)it.next();
                    if(lap.getHDD()>=(Integer)entry.getValue()){
                        res.add(lap);
                        }
                    }
                    }
            if(entry.getKey().equals("OS")){
                Iterator it = laptops.iterator();
                while(it.hasNext()){
                    laptop lap = (laptop)it.next();
                        if(lap.getOS().equals(entry.getValue())){
                            res.add(lap);
                            }
                        }
                        }
            if(entry.getKey().equals("color")){
                Iterator it = laptops.iterator();
                while(it.hasNext()){
                    laptop lap = (laptop)it.next();
                        if(lap.getColor().equals(entry.getValue())){
                            res.add(lap);
                                    }
                                }
                                }
            }
        
            Iterator it = res.iterator();
            while(it.hasNext()){
                laptop lap = (laptop)it.next();
            System.out.println(lap.toString());
            System.out.println();
        }
        
        
    }}