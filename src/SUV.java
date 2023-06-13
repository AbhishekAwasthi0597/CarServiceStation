public class SUV extends Car{
    public SUV(){
        super("SUV");
    }
    @Override
    public double getServiceCost(String serviceCode){
        switch (serviceCode) {
            case "BS01":
                return 5000;
            case "EF01":
                return 10000;
            case "CF01":
                return 5000;
            case "BF01":
                return 2500;
            case "GF01":
                return 8000;
            default:
                return 0;
        }
    }
}
