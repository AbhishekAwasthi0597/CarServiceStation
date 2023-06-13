public class Sedan extends Car {
    public Sedan(){
        super("Sedan");
     }
    @Override
    public double getServiceCost(String serviceCode){
        switch (serviceCode) {
            case "BS01":
                return 4000;
            case "EF01":
                return 8000;
            case "CF01":
                return 4000;
            case "BF01":
                return 1500;
            case "GF01":
                return 6000;
            default:
                return 0;
        }
    }
}
