package oops.abstraction;

public class GooglePay implements Payment{
    @Override
    public void makePayment() {
        System.out.println("This is Payment method of Google Pay...");
    }

    @Override
    public long ceckBalance() {
        return 0;
    }
}
