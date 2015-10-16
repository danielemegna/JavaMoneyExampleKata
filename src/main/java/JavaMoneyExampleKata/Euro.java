package JavaMoneyExampleKata;

class Euro extends Banknote
{
  public Euro(int amount) {
    this.amount = amount;
  }

  public Banknote add(Banknote addend) {
    return new Euro(
      this.amount +
      addend.toEuroAmount()
    );
  }

  public Banknote times(int moltiplicator) {
    return new Euro(this.amount * moltiplicator); 
  }

  public int toDollarsAmount() {
    return this.amount * 2;
  }

  public int toEuroAmount() {
    return this.amount;
  }
}
