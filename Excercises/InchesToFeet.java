
public class InchesToFeet {
    int inches;
    private static final int A_FEET_TO_INCHES = 12;

    InchesToFeet(int inches_input){
        this.inches = inches_input;
    }


    public void display(){
        int feetDivisor = inches/A_FEET_TO_INCHES;
        int inchesRemain = inches%A_FEET_TO_INCHES;

        System.out.println(inches + " becomes "+ feetDivisor + " feet and " + inchesRemain + " inches.");
    }

    public static void main(String[] args){
        InchesToFeet itf = new InchesToFeet(86);
        itf.display();
    }

}
