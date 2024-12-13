package Class47;

public class Bank {
    private String accNo;
    private int pwd;
    private double bal;

    public Bank(String accNo, int pwd, double bal) {
        setAccNo(accNo);
        this.pwd = pwd;
        this.bal = bal;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        if (accNo.length() == 11) {
            this.accNo = accNo;
        }
        else {
            System.out.println("Invalid");
        }
    }

    public int getPwd() {
        return pwd;
    }

    public void setPwd(int pwd) {
        this.pwd = pwd;
    }

    public double getBal() {
        return bal;
    }

    public void setBal(double bal) {
        this.bal = bal;
    }
}
