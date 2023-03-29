public class CreditCard {
    private float bal;
    private float chargeTotal;

    public CreditCard(float balIn){
        bal = balIn;
    }

    public void charge(float amountIn){
        bal = bal+amountIn;
        chargeTotal += (amountIn*.01);
    }

    public void makePayment(float amountIn){
        bal = bal-amountIn;
    }

    public void print(){
        System.out.println("Balance: "+bal);
        System.out.println("Points: "+chargeTotal);
    }
}
