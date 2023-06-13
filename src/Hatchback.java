public class Hatchback extends Car{
    public Hatchback(){
        super("Hatchback");
    }
    @Override
    public double getServiceCost(String serviceCode) {
        switch (serviceCode) {
            case "BS01":
                return 2000;
            case "EF01":
                return 5000;
            case "CF01":
                return 2000;
            case "BF01":
                return 1000;
            case "GF01":
                return 5000;
            default:
                return 0;
        }
    }
}
