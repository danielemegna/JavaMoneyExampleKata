package mvntest;

class Euro extends Banknote
{
  public Euro(int amount) {
    this.amount = amount;
  }

  public Euro add(Euro addend) {
    return new Euro(this.amount + addend.amount);
  }

  public Euro times(int moltiplicator) {
    return new Euro(this.amount * moltiplicator); 
  }

  public boolean equals(Object obj) {
    Euro that = (Euro)obj;
    return this.amount == that.amount;
  }
}
