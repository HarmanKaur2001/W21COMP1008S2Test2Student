import java.util.*;

//purpose: create the car class
//Name: Harman Kaur
//Student Id: 200456178
public class Car {
    private String make, model;
    private int mileage;
    private double price;

    public Car(String make, String model, int mileage, double price) {
        setMake(make);
        setModel(model);
        setMileage(mileage);
        setPrice(price);

    }

    public String getMake() {
        return make;
    }


    public String getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }

    public double getPrice() {
        return price;
    }

    public void setMake(String make) {
        List<String> validSuits = Arrays.asList("Ford","Honda","Porsche");
        if (validSuits.contains(make))  // this performs a case sensitive comparison
            this.make = make;
        else
            throw new IllegalArgumentException(make + " is not valid.  Use one of "+validSuits);



    }

    public void setModel(String model) {

    }

    public void setMileage(int mileage) {
        int min = 0;
        int max = 5000000;
        if (mileage>=min && mileage <=max)
            this.mileage = mileage;
        else
            throw new IllegalArgumentException(mileage +"has no value"+ mileage);
    }

    public void setPrice(double price) {
        int min = 0;
        int max = 2000000;
        if (price>=min && price <=max)
            this.price = price;
        else
            throw new IllegalArgumentException(price +"has no value"+ price);
    }



    public String toString()
    {
        return String.format("%s %s, with %d km - asking $%.2f", make, model,mileage,price);
    }
}
