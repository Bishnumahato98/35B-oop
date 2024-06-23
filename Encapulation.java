public class Encapulation{
    public static void main(String[] args) {
        Laptop l1= new Laptop("Apple", "Apple Air M1");
        l1.year= 2022;
        l1.setPrice(100000);
        l1.inflation(5000);
        l1.setRam(8);
        l1.setStorage(128);
        l1.upgrade(2,128);

        System.out.println("Brand : " + l1.brand);
        System.out.println("NAme : " + l1.name);
        System.out.println("Price : " + l1.getPrice());
        System.out.println("Ram : " + l1.getRam());
        System.out.println("Storage : " + l1.getStorage());
        System.out.println("Year : " + l1.year);
    }
}
class Laptop{
    String brand;
    String name;
    private double price;
    private int ram;
    private int storage;
    public int year;

    Laptop(String brand, String name) {
        this.brand = brand;
        this.name = name;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return this.price;
    }
    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public int getStorage() {
        return storage;
    }
    public void setStorage(int storage) {
        this.storage = storage;
    }
    void branding(){
        System.out.println("Brand : " + brand);
    }
    public void upgrade(int ram, int storage) {
        this.ram += ram;
        this.storage += storage;
    }
    public void inflation(double price) {
        this.price += price;
    }
}
