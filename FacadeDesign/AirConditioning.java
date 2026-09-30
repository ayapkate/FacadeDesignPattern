package FacadeDesign;

public class AirConditioning implements  HomeService{
    @Override
    public void on() {
        System.out.println("Aircon is powered on");
    }

    @Override
    public void off() {
        System.out.println("Aircon powered off..");
    }
}
