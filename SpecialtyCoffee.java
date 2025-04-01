public class SpecialtyCoffee extends Coffee
{
  private String flavor;

  public SpecialtyCoffee()
  {
    super();
    flavor = "vanilla";
  }

  public SpecialtyCoffee(String type, String flavor)
  {
    super("small", false, 1, type);
    this.flavor = flavor;
  }

  public SpecialtyCoffee(String size, boolean isSkinny, int shots, String type, String flavor)
  {
    super(size, isSkinny, shots, type);
    this.flavor = flavor;
  }

  // Method override of Coffee getPrice
  public double getPrice()
  {
    //returns 1.5x the proce of the regular coffee

    return super.getPrice() * 1.5;
  }

  // Method override of Coffee toString
  public String toString()
  {
    // we will edit in class
    return super.toString() + "with" + flavor;
  }

  // print a message that compares the prices of a regular Coffee
  // and a SpecialtyCoffee using both getPrice methods
  public void printPriceComparison()
  {
    System.out.println("A regular coffee costs " + super.getPrice());
    System.out.println("A specialty coffee costs " + this.getPrice();)
  }
}
