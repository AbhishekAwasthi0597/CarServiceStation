import java.util.HashMap;
import java.util.Map;

public class CarServiceStation {
   private Map<String,Car> carMap;
    public CarServiceStation() {
        carMap = new HashMap<>();
        carMap.put("Hatchback", new Hatchback());
        carMap.put("Sedan", new Sedan());
        carMap.put("SUV", new SUV());
    }
    public double getServiceCost(String carType, String serviceCode) {
        Car car = carMap.get(carType);
        if (car != null) {
            return car.getServiceCost(serviceCode);
        } else {
            return 0;
        }
    }
}
