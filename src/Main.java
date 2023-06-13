import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CarServiceStation serviceStation = new CarServiceStation();
        System.out.println("Enter your carTye and serviceCode");
        String carType =sc.nextLine();
        String serviceCode=sc.next();
        double serviceCost = serviceStation.getServiceCost(carType, serviceCode);
        System.out.println("Service Cost for " + carType + " and service code " + serviceCode + ": " + serviceCost);
    }
}