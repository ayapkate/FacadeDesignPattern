package FacadeDesign;

public class TV implements HomeService{
    @Override
    public void on() {
        System.out.println("The TV is on..playing: Transformers");
    }

    @Override
    public void off() {
        System.out.println("movie paused..TV power off");

    }
}
