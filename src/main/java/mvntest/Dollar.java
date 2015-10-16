package mvntest;

public class Dollar {

  private int amount;

  public Dollar(int amount) {
    this.amount = amount;
  }

  public Dollar add(Dollar addend) {
    return new Dollar(this.amount + addend.amount);
  }

  public Dollar times(int moltiplicator) {
    return new Dollar(this.amount * moltiplicator); 
  }

  public boolean equals(Object obj) {
    Dollar that = (Dollar)obj;
    return this.amount == that.amount;
  }

}
