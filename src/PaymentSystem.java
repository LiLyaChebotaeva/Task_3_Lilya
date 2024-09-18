interface PaymentSystem{
    void pay();
    void refund();
}
class CreditCard implements PaymentSystem{
    @Override
    public void pay() {
        System.out.println("Оплачено кредитной картой");
    }

    @Override
    public void refund() {
        System.out.println("Возвращено на кредитную карту");
    }
}
class PayPal implements PaymentSystem{
    @Override
    public void pay() {
        System.out.println("Оплачено с помощью PayPal");
    }

    @Override
    public void refund() {
        System.out.println("Возвращено на PayPal");
    }
}
