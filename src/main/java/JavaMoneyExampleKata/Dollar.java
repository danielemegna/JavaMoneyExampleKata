package JavaMoneyExampleKata;

public class Dollar extends Banknote {

  public Dollar(int amount) {
    this.amount = amount;
  }

  public Banknote add(Banknote addend) {
    return new Dollar(
      this.amount +
      addend.toDollarsAmount()
    );
  }

  public Banknote times(int moltiplicator) {
    return new Dollar(this.amount * moltiplicator); 
  }

  public int toDollarsAmount() {
    return this.amount;
  }

  public int toEuroAmount() {
    return this.amount / 2;
  }
}
