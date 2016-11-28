import java.util.Scanner;

public class InchesToFeetInteractive {
    int inches;
    private static final int A_FEET_TO_INCHES = 12;

    InchesToFeetInteractive(int inches_input){
        this.inches = inches_input;
    }

    public void display(){
        int feetDivisor = inches/A_FEET_TO_INCHES;
        int inchesRemain = inches%A_FEET_TO_INCHES;

        System.out.println(inches + " becomes "+ feetDivisor + " feet and " + inchesRemain + " inches.");
    }

    public static void main(String[] args){
        int inches;
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Please enter inches >> ");
        inches = inputDevice.nextInt();

        InchesToFeetInteractive itf = new InchesToFeetInteractive(inches);
        itf.display();
    }

}


