import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;


//Name: Harman Kaur
//Student Id: 200456178
public class CarLot {
    private ArrayList<Car> cars;

    public CarLot(){
        cars= new ArrayList<>();
    }

    public void addCar(Car car)
    {
        cars.add(car);
    }

    public double getInventoryValue()
    {
        double price = 0;

        for (Car newCar : cars)
            price =  price + newCar.getPrice();

        return price;
    }

    public ArrayList<Car> getCarsByBrand(String manufacturer)
    {
        return null;
    }

    public ArrayList<Car> getCarsByModel(String model)
    {
        return null;
    }

    public ArrayList<Car> getCarsBelowPrice(double maxPrice)
    {
        return null;
    }

    public ArrayList<Car> getCarsBelowMileage(double maxkm)
    {
        return null;
    }

    public int getNumOfCarsUnderPrice(double maxPrice)
    {
        return -1;
    }

    public double getAvgPrice()
    {
        return -1;
    }

    public int getNumOfCarsInInventory()
    {
        return -1;
    }

    public String toString()
    {
        return "";
    }


}
