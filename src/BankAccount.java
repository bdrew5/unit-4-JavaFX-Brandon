import java.text.DecimalFormat;
public class BankAccount {
    private String password;
    private String username;
    private double balence;
    public double interests;
    private int accountNumber;
    private double ammountInterest;
    private double ammountFromInterest;

    public class Bank {
        private int pinNumber;
        private double balance = 0;
        private boolean lockCard = false;
        private double interest;
        private String name;

        public Bank(String n, int pNum) {
            pinNumber = pNum;
            name = n;
        }

        public String toString() {
            String result = "";
            if (lockCard)
                System.out.println("Sorry, your card is locked and unable to be used at this time.");
            else {
                result += "Balance: " + balance + "\n";
                result += "Pin Number: " + pinNumber + "\n";
                result += "Name: " + name + "\n";
            }
            return result;
        }



        public int getPinNumber() {
            return pinNumber;
        }

        public double getbalance() {
            return balance;
        }

        public void setBalance(double newBalance) {
            balance = newBalance;


        }

        public double withdraw(double withdraw) {
            balance = balance - withdraw;
            if (balance == 0)
                System.out.println("You don't have any money in your account");
            return balance;
        }

        public double deposit(double deposit) {
            balance = balance + deposit;
            return balance;
        }

        public void lockCard() {
            lockCard = true;

        }

        public void newCard() {
            pinNumber = (int) (Math.random() * 1000000000);
        }

        public void unlockCard() {
            lockCard = false;
        }


    }
}