public class BankAccount {
    private int accountNumber;
    private float  balance;

    public int getAccount()
    {
        return accountNumber;
    }

    public float getBalance()
    {
        return balance;
    }

    public void RepMoney(float sum)
    {
        this.balance += sum;
    }

    public void WithMoney(float sum)
    {
        this.balance -= sum;
    }
}
