package FacadeDesign;

public class Light implements HomeService{
    @Override
    public void on() {
        System.out.println("The Lights are now turned on..");
    }

    @Override
    public void off() {
        System.out.println("Lights powered off..");
    }
}
