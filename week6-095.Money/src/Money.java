
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money added) {
        int totalEuros = euros + added.euros();
        int totalCents = cents + added.cents();

        if (totalCents > 99) {
            totalCents -= 100;
            totalEuros++;
        }

        return new Money(totalEuros, totalCents);
    }

    public Money minus(Money subtracted) {
        int totalCents = this.cents() - subtracted.cents();
        int totalEuros = this.euros() - subtracted.euros();

        if (totalCents < 0) {
            totalEuros--;
            totalCents += 100;
        }

        if (totalEuros < 0) {
            totalCents = 0;
            totalEuros = 0;
        }

        return new Money(totalEuros, totalCents);

    }

    public boolean less(Money compared) {
        if (this.euros() < compared.euros()) {
            return true;
        }
        if (this.euros() == compared.euros()) {
            return this.cents() < compared.cents();
        }
        return false;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
