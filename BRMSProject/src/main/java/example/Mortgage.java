package example;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Mortgage implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.Double housePrice;
   private java.lang.Double interestRate;
   private java.lang.Integer salary;

   public Mortgage()
   {
   }

   public java.lang.Double getHousePrice()
   {
      return this.housePrice;
   }

   public void setHousePrice(java.lang.Double housePrice)
   {
      this.housePrice = housePrice;
   }

   public java.lang.Double getInterestRate()
   {
      return this.interestRate;
   }

   public void setInterestRate(java.lang.Double interestRate)
   {
      this.interestRate = interestRate;
   }

   public java.lang.Integer getSalary()
   {
      return this.salary;
   }

   public void setSalary(java.lang.Integer salary)
   {
      this.salary = salary;
   }

   public Mortgage(java.lang.Double housePrice, java.lang.Double interestRate,
         java.lang.Integer salary)
   {
      this.housePrice = housePrice;
      this.interestRate = interestRate;
      this.salary = salary;
   }

}