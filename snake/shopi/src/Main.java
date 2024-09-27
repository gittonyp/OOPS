public class Main {
    //devlop a a online shopping system ,the system should have a class payment that
    // represents a general payment and twospecific classes ,
    // credit card and paypal payment. that extendd yhe payment class.
    // each payment method imolement its own version of the Make payment method.
    public static void main(String[] args) {
        Credit c=new Credit();
        c.MakePayment(1000);
        Paypal p=new Paypal();
        p.MakePayment(1000);
    }
}

class Payment{
    public void MakePayment(int money){
        System.out.println("Payment of "+money+" is done");
    }
}
class Credit{
    public void MakePayment(int money){
        System.out.println("Credit card Payment of "+money+" is done");
    }
}
class Paypal{
    public void MakePayment(int money){
        System.out.println("Paypal Payment of "+money+" is done");
    }
}