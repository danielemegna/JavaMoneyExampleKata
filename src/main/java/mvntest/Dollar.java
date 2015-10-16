package mvntest;

public class Dollar extends Banknote {

  public Dollar(int amount) {
    this.amount = amount;
  }

  public Banknote add(Banknote addend) {
    return new Dollar(this.amount + addend.amount);
  }

  public Banknote times(int moltiplicator) {
    return new Dollar(this.amount * moltiplicator); 
  }
}
