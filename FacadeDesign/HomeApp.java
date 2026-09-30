package FacadeDesign;

public class HomeApp {
    public static void main(String[] args) {
        Light livingroomLights = new Light();
        TV panasonic = new TV();
        AirConditioning samsung = new AirConditioning();

        HomeInterface homeDevices = new HomeInterface(livingroomLights, panasonic, samsung);

        homeDevices.turnOnAll();
        homeDevices.turnOffAll();
    }
}
