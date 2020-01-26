
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    private static final double PRICE_OF_ECONOMICAL = 2.5;
    private static final double PRICE_OF_GOURMET = 4.0;

    public CashRegister() {
        this.cashInRegister = 1000;
    }

    public boolean payEconomical(LyyraCard card) {
        if (card.balance() >= this.PRICE_OF_ECONOMICAL) {
            this.economicalSold++;
            card.pay(this.PRICE_OF_ECONOMICAL);
            return true;
        }
        return false;
    }

    public double payEconomical(double cashGiven) {
        if (cashGiven >= this.PRICE_OF_ECONOMICAL) {
            this.economicalSold++;
            this.cashInRegister += this.PRICE_OF_ECONOMICAL;
            return cashGiven - this.PRICE_OF_ECONOMICAL;
        }
        return cashGiven;
    }

    public boolean payGourmet(LyyraCard card) {
        if (card.balance() >= this.PRICE_OF_GOURMET) {
            this.gourmetSold++;
            card.pay(this.PRICE_OF_GOURMET);
            return true;
        }
        return false;
    }

    public double payGourmet(double cashGiven) {
        if (cashGiven >= this.PRICE_OF_GOURMET) {
            this.gourmetSold++;
            this.cashInRegister += this.PRICE_OF_GOURMET;
            return cashGiven - this.PRICE_OF_GOURMET;
        }
        return cashGiven;
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0) {
            card.loadMoney(sum);
            this.cashInRegister += sum;
        }
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
