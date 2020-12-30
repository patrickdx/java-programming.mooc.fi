package mooc;

public class PaymentCard {								//dumb payment card, will take purchase regardless of item price, however will not go into debt. 
    private double balance;
    private int credit;
    
    public PaymentCard(double balance) {
        this.balance = balance;
    }
    
    public PaymentCard(int credit) {
    	this.balance = credit;
    }

    public double balance() {
        return this.balance;
    }
    

    public void addMoney(double increase) {
        this.balance = this.balance + increase;
    }

    public boolean takeMoney(double amount) { // implement the method so that it only takes money from the card if
    										 // the balance is at least the amount parameter.
        									// returns true if successful and false otherwise
    	
    	if (this.balance >= amount) {
    		this.balance = this.balance - amount;
    		return true; 
    	
    	}
    	return false;
       
    }
    
    
    
}