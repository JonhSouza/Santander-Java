import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // Simulando uma SmartTV no lado do usuário
        SmartTV SmartTV = new SmartTV();
        Scanner sc = new Scanner(System.in);

        System.out.println("Do you want to turn on the TV? (y/n)");
        char onOff = sc.next().charAt(0);

        if (onOff == 'y') {
            SmartTV.turnOn();
            System.out.println("The TV is on!");
        } else {
            System.out.println("The TV is off!");
        }

        while (SmartTV.on == true) {
            System.out.println("");
            System.out.println("FUNCTIONS: ");
            System.out.println("");
            System.out.println("1: up or down channel");
            System.out.println("2: up or down volume");
            System.out.println("3: Off");
            System.out.println("4: Set the channel");
            System.out.println("Select functions(1/2/3/4): ");
            int function = sc.nextInt();

            if (function == 1) {
                System.out.println("Up or down?(u/d)");
                char respChannel = sc.next().charAt(0);

                if (respChannel == 'u') {
                    SmartTV.upChannel();
                } else {
                    SmartTV.downChannel();
                }
            }
            if (function == 2) {
                System.out.println("Up or down?(u/d)");
                char respVolume = sc.next().charAt(0);

                if (respVolume == 'u') {
                    SmartTV.upVolume();
                } else {
                    SmartTV.downVolume();
                }
            }

            if (function == 3) {
                SmartTV.turnOff();
            }

            if (function == 4) {
                System.out.println("Set the channel: ");
                int newChannel = sc.nextInt();
                SmartTV.setChannel(newChannel);
            }

        }

        sc.close();

    }
}
