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
        ArrayList<Car> cars1 = new ArrayList<>();

        if (cars1.size()==0)
            return (ArrayList<Car>) cars1;

        for (Car car : cars)
            if(car.getMake().equals(manufacturer))
                cars1.add(car);
        return cars1;

    }

    public ArrayList<Car> getCarsByModel(String model)
    {
        ArrayList<Car> cars1 = new ArrayList<>();

        if (cars1.size()==0)
            return (ArrayList<Car>) cars1;

        for (Car car : cars)
            if(car.getMake().equals(model))
                cars1.add(car);
        return cars1;

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
