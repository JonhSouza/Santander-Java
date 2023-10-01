package sistema.smart;
public class SmartTV {

    boolean on = false;
    int channel = 1;
    int volume = 20;

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
        System.out.println("The TV is off!");
    }

    public void upChannel() {
        channel++;
        System.out.println("The channel is: " + channel);
    }

    public void downChannel() {
        channel--;
        System.out.println("The channel is: " + channel);
    }

    public void upVolume() {
        volume++;
        System.out.println("The volume is: " + volume);
    }

    public void downVolume() {
        volume--;
        System.out.println("The volume is: " + volume);
    }

    public void setChannel(int newChannel) {
        channel = newChannel;
        System.out.println("The channel is: " + channel);
    }

}