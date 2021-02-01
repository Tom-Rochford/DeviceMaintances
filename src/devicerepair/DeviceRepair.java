
package devicerepair;

import java.util.Scanner;

public class DeviceRepair {

    
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        Device myNewDevice = new Device("12345", "Lenovo " , "Julie" , "Smashed screen" , "Not started yet" , 1);
        System.out.println(myNewDevice.toString());
        
    }
    
    public static void MainMenu() {
        while (true) {
            System.out.println("Please select an option: ");
            System.out.println("");
            System.out.println("");
            int userChoice = input.nextInt();
            switch(userChoice) {
                case 1: 
                    
            }
            
        }
    }
    
}
