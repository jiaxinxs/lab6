/** 
* File name: BasePlusCommissionProgrammer.java]
* Author: [Jiaxin Yan, ID#041092597]
* Course: CST8284 – OOP SEC.312
* Assignment: LAB 06
* Date: 11/17/2023
* Professor: Daniel Cormier 
* Purpose: This program models a consultant that is a child class from miller.
* Class list: 	CommissionProgrammer.java
* 				BasePlusCommissionProgrammer.java
* 				HourlyProgrammer.java
* 				SalariedProgrammer.java
* 				Payme.java
* 				Invoice.java
* 				Programmer.java
* 				PaymentInterfaceTest.java
*/

/**
 * The BasePlusCommissionProgrammer class represents a programmer with a base salary
 * in addition to commission-based earnings.
 * @author Jiaxin Yan
 * @version 1.0
 * @since JDK 17.0.8
 * @see CommissionProgrammer
 * @see HourlyProgrammer
 * @see SalariedProgrammer
 * @see Payme
 * @see Invoice
 * @see PaymeInterfaceTest
 * @see Programmer
 */

public class BasePlusCommissionProgrammer extends CommissionProgrammer 
{ /**
 	* baseSalary of the base plus commission programmer
 	*/
	private double baseSalary; // base salary per week
/**
     * Constructs a BasePlusCommissionProgrammer object with specified details.
    *
    * @param firstName            The first name of the programmer.
    * @param lastName             The last name of the programmer.
    * @param socialSecurityNumber The social security number of the programmer.
    * @param grossSales           The gross sales achieved by the programmer.
    * @param commissionRate       The commission rate earned by the programmer.
    * @param baseSalary           The base salary of the programmer.
    */	

	public BasePlusCommissionProgrammer(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) 
	{
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		
		if (baseSalary < 0.0) { // validate baseSalary                  
		  throw new IllegalArgumentException("Base salary must be >= 0.0");
		}
		
		this.baseSalary = baseSalary;                
	}
	
	/**
     * Sets the base salary of the programmer.
     *
     * @param baseSalary The new base salary to set.
     */
	public void setBaseSalary(double baseSalary) //set base salary
	{
		if (baseSalary < 0.0) 
		{ // validate baseSalary                  
		  throw new IllegalArgumentException("Base salary must be >= 0.0");
		}
	
		this.baseSalary = baseSalary;                
	} 
	
	/**
     * Gets the base salary of the programmer.
     *
     * @return The base salary.
     */
	public double getBaseSalary() 
	{
		return baseSalary;
	}
	
	/**
     * Calculates the payment amount for the programmer, including base salary and commission.
     *
     * @return The total payment amount.
     */
	@Override
	public double getPaymentAmount() 
	{
		return getBaseSalary()*1.05 + super.getPaymentAmount();
	}             
	 /**
     * Returns a formatted string representation of the BasePlusCommissionProgrammer object.
     *
     * @return A string representation of the object.
     */
	@Override  
	public String toString() 
	{
		return String.format("%s%s %s\n%s%s\n%s%.2f %s%.2f %s%.2f\n%s%.2f\n%s%.2f\n", 
				"Base-plus commission programmer: ",getFirstName(), getLastName(), 
				"Social Security Number: ", getSocialSecurityNumber(), 
				"Gross sales: $",getGrossSales(),"Commission rate: ",getCommissionRate(),"Base salary: $",getBaseSalary(),
				"New base salary with 5% increase is: $",getBaseSalary()*1.05,"Payment due: $",getPaymentAmount());
	}
}



