import java.util.Arrays;
import java.util.List;

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
    }

    public void setPrice(double price) {
    }

    public String toString()
    {
        return "";
    }
}
