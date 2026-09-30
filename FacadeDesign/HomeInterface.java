package FacadeDesign;

public class HomeInterface {
    private Light light;
    private TV tv;
    private AirConditioning airconditioning;

    public HomeInterface (Light light, TV tv, AirConditioning airconditioning) {
        this.light = light;
        this.tv = tv;
        this.airconditioning = airconditioning;
    }

    public void turnOnAll() {
        System.out.println("Powering On all Home Devices...");
        light.on();
        tv.on();
        airconditioning.on();
    }

    public void turnOffAll() {
        System.out.println("\nPowering Off all Home Devices...");
        light.off();
        tv.off();
        airconditioning.off();
    }
}
