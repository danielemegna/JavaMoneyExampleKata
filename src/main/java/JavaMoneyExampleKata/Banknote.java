package JavaMoneyExampleKata;

abstract class Banknote
{
  protected int amount;

  abstract Banknote add(Banknote addend);
  abstract Banknote times(int moltiplicator);
  abstract int toDollarsAmount();
  abstract int toEuroAmount();

  public static Banknote dollar(int amount) {
    return new Dollar(amount);
  }

  public static Banknote euro(int amount) {
    return new Euro(amount);
  }

  public boolean equals(Object that) {
    return
      this.getClass() == that.getClass() &&
      this.amount == ((Banknote)that).amount;
  }

  public String toString() {
    return this.amount + " " + getClass().getSimpleName();
  }
}
