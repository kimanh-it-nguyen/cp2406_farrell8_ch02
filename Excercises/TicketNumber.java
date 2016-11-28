import javax.swing.*;

public class TicketNumber {
    int ticketNumber;

    public TicketNumber(int ticketNumber){
        this.ticketNumber = ticketNumber;
    }

    public void setTicketNumber(int ticketNumber){
        this.ticketNumber = ticketNumber;
    }

    public int getTicketNumber(){
        return this.ticketNumber;
    }

    public boolean validateTicket(){
        boolean isValid = false;
        String stringTicket = Integer.toString(this.ticketNumber);
        int numLast = Integer.parseInt(stringTicket.substring(stringTicket.length()-1));

        System.out.println("Last num: " + numLast);
        String stringRemain = stringTicket.substring(0,(stringTicket.length()-1));
        int numRemain = Integer.parseInt(stringRemain);

        System.out.println("Num remained: " + numRemain);
        if(numRemain%7==numLast){
            isValid=true;
        }else {
            isValid=false;
        }
        return isValid;
    }

    public static void main(String[] args){
        //int num = 123454;
        String userInput = JOptionPane.showInputDialog(null,"Enter ticket number: ",
                JOptionPane.INFORMATION_MESSAGE);

        int num =  Integer.parseInt(userInput);
        TicketNumber tn = new TicketNumber(num);
        boolean result = tn.validateTicket();
        System.out.println(result);

        JOptionPane.showMessageDialog(null,""+result,"Result here: ",JOptionPane.INFORMATION_MESSAGE);
    }


}
