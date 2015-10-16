package mvntest;

class Euro extends Banknote
{
  public Euro(int amount) {
    this.amount = amount;
  }

  public Banknote add(Banknote addend) {
    return new Euro(this.amount + addend.amount);
  }

  public Banknote times(int moltiplicator) {
    return new Euro(this.amount * moltiplicator); 
  }

  public boolean equals(Object obj) {
    Euro that = (Euro)obj;
    return this.amount == that.amount;
  }
}
