/** 
* File name: [ComissionProgrammer.java]
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
 * The CommissionProgrammer class represents a programmer with earnings based on
 * gross sales and a commission rate.
 * @author Jiaxin Yan
 * @version 1.0
 * @since JDK 17.0.8
 * @see BasePlusCommissionProgrammer
 * @see HourlyProgrammer
 * @see SalariedProgrammer
 * @see Payme
 * @see Invoice
 * @see Programmer
 * @see PaymeInterfaceTest
 */

public class CommissionProgrammer extends Programmer 
{ 	
	/**
	 * gross weekly sales
	 */
	private double grossSales;
	/**
	 *  commission percentage
	 */
	private double commissionRate;
	
	/**
     * Constructs a CommissionProgrammer object with specified details.
     *
     * @param firstName            The first name of the programmer.
     * @param lastName             The last name of the programmer.
     * @param socialSecurityNumber The social security number of the programmer.
     * @param grossSales           The gross weekly sales achieved by the programmer.
     * @param commissionRate       The commission rate earned by the programmer.
     *                                  or if grossSales is less than 0.0.
     */
	
	public CommissionProgrammer(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate)
	{
		super(firstName, lastName, socialSecurityNumber);
		
		if (commissionRate <= 0.0 || commissionRate >= 1.0) 
		{ // validate 
		  throw new IllegalArgumentException(
		     "Commission rate must be > 0.0 and < 1.0");
		}
	
		if (grossSales < 0.0) 
		{ // validate
		  throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}
	
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	} 
	 /**
     * Sets the gross sales amount for the programmer.
     *
     * @param grossSales The new gross sales amount to set.
     */
	public void setGrossSales(double grossSales) 
	{
		if (grossSales < 0.0) { // validate
		  throw new IllegalArgumentException("Gross sales must be >= 0.0");
	}
	
		this.grossSales = grossSales;
	} 
	
	/**
     * Gets the gross sales amount for the programmer.
     *
     * @return The gross sales amount.
     */
	public double getGrossSales() 
	{
		return grossSales;
	} 
	
	/**
     * Sets the commission rate for the programmer.
     *
     * @param commissionRate The new commission rate to set.
     */
	public void setCommissionRate(double commissionRate) 
	{
		if (commissionRate <= 0.0 || commissionRate >= 1.0) 
		{ // validate
		  throw new IllegalArgumentException(
		     "Commission rate must be > 0.0 and < 1.0");
		}
	
		this.commissionRate = commissionRate;
	} 
	
	  /**
     * Gets the commission rate for the programmer.
     *
     * @return The commission rate.
     */
	public double getCommissionRate() 
	{
		return commissionRate;
	} 
	
	 /**
     * Calculates the payment amount for the programmer based on gross sales and commission rate.
     *
     * @return The payment amount.
     */
	@Override
	public double getPaymentAmount() 
	{
		return getGrossSales()*getCommissionRate();
	}                                             
	
	 /**
     * Returns a formatted string representation of the CommissionProgrammer object.
     *
     * @return A string representation of the object.
     */
	@Override 
	public String toString() 
	{
		return String.format("%s%s %s\n%s%s\n%s%.2f %s%.2f\n%s%.2f\n", 
				"Commission programmer: ",getFirstName(), getLastName(), 
				"Social Security Number: ", getSocialSecurityNumber(), 
				"Gross sales: $",getGrossSales(),"Commission rate: ",getCommissionRate(),
				"Payment due: $",getPaymentAmount());
	}
	    


}

