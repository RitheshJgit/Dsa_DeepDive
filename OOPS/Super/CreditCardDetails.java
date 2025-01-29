package OOPS.Super;

public class CreditCardDetails {
    String user;
    String bankName;
    double accNo;
    int bankBalance;
    int tax;
    int payment;
    CreditCardDetails(String u,String bN, double aN, int bB, int t, int p){
        user = u;
        bankName = bN;
        accNo = aN;
        bankBalance = bB;
        tax = t;
        payment = p;
    }
    public double getAccNo() {return accNo;}
    public String getUser(){return user;}
    public int getBankBalance() {return bankBalance;}
    public int getPayment() {return payment;}
    public int getTax() {return tax;}
    public String getBankName() {return bankName;}
    public void setAccNo(double accNo) {this.accNo = accNo;}
    public void makePayment(int payment){
        this.payment = payment;
        if(payment > bankBalance){
            System.out.println("Insufficient Balance");
        }
        else {
            bankBalance -= payment;
            System.out.println(
                    "Paid : " + payment+
                            "\nBalance : "+ bankBalance
            );
        }
    }
    public void cardDetail(){
        System.out.println("""
                Card Holder     : %s
                Account No      : %.2f
                Bank Name       : %s
                Bank Balance    : %d
                """.formatted(user,accNo,bankName,bankBalance));
    }

    public static void main(String[] args) {
        CreditCardDetails c = new CreditCardDetails("Rithesh", "CityUnion", 1234, 34000, 10, 450);
        System.out.println(c.getBankBalance());
        c.makePayment(4000);
        System.out.println(c.getBankBalance());
        c.cardDetail();
    }
}

