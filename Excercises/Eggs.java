import javax.swing.*;

public class Eggs {
    int numEggs;
    double priceDozen = 3.25;
    double priceIndividual = 0.45;

    public Eggs(int numEggs){
        this.numEggs = numEggs;
    }

    public void setEggs(int numEggs){
        this.numEggs = numEggs;
    }

    public int getEggs(){
        return this.numEggs;
    }


    public String displayAmountOwed(){
        double total=0;
        int numDozen = this.numEggs/12;
        int numLoose = this.numEggs%12;
        total = numDozen*priceDozen + numLoose*priceIndividual;
        String explanation = "";

        explanation += "You ordered " + this.numEggs+
                " eggs. That's "+numDozen+" dozen at $"+priceDozen+" per dozen and "
                +numLoose+" loose eggs at "+priceIndividual*100 + " cents each for a total of $"+total;

        return explanation;
    }

    public static void main(String[] args){
        String userInput = JOptionPane.showInputDialog(null,"Enter number of eggs you bought",
                JOptionPane.INFORMATION_MESSAGE);
        int numEggs =  Integer.parseInt(userInput);
        Eggs eggs = new Eggs(numEggs);
        String mes = eggs.displayAmountOwed();
        JOptionPane.showMessageDialog(null,mes,"Amount Owed",JOptionPane.INFORMATION_MESSAGE);

    }



}
