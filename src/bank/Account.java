package bank;

public class Account {
    private String name; //성함
    private String accNumber; //계좌번호
    private String ssNumber; //주민번호
    private double balance; //잔액

    public Account(String name, String accNumber, String ssNumber, double balance){
        this.name = name;
        this.accNumber = accNumber;
        this.ssNumber = ssNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public String getSsNumber() {
        return ssNumber;
    }

    public void setSsNumber(String ssNumber) {
        this.ssNumber = ssNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
