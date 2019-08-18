package Q4;

public class Saving extends Account{
    private double interestRate;
    //this is saying we define the child class constructor,
    //but the parent constructor is over-ridden
    public Saving(double rate) {
    	//get rid of this line to see the difference
    	super(rate); 
        this.interestRate = rate;
    }
}
