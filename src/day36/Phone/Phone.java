package day36.Phone;

public class Phone {
    public String brand, model, size,color;
    public int price;

    public void setInfo(String brand, String model, String size, String color, int price) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public void call(long phoneNumber){
        System.out.println("Call: " + phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println("Text: " + phoneNumber );
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

}
