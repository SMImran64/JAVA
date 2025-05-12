
package midlevelquestion12;


public class AccountHolder {
    
    protected String name;    
    protected String accountNumber;

    public AccountHolder() {
    }

    public AccountHolder(String name, String accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public double calculateTransactionFee(double amount){
    
    return 0.0;
    }

    @Override
    public String toString() {
        return "AccountHolder{" + "name=" + name + ", accountNumber=" + accountNumber + '}';
    }
    
}
