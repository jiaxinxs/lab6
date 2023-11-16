/** 
* File name: [PaymentInterfaceTest.java]
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
* 				PaymeInterfaceTest.java
*/
/**
 * The HourlyProgrammer class represents a programmer paid on an hourly basis.
 * @author Jiaxin Yan
 * @version 1.0
 * @since JDK 17.0.8
 * @see BasePlusCommissionProgrammer
 * @see PaymeInterfaceTest
 * @see SalariedProgrammer
 * @see Payme
 * @see Invoice
 * @see Programmer
 * @see CommissionProgrammer
 */


public class HourlyProgrammer extends Programmer {
	/**
	 * wage per hour
	 */
	private double wage;
	/**
	 * hours worked for week
	 */
	private double hours; 
	
	/**
     * Constructs an HourlyProgrammer object with specified details.
     *
     * @param firstName            The first name of the programmer.
     * @param lastName             The last name of the programmer.
     * @param socialSecurityNumber The social security number of the programmer.
     * @param wage                 The hourly wage of the programmer.
     * @param hours                The hours worked for the week by the programmer.
     */
	public HourlyProgrammer(String firstName, String lastName,
	String socialSecurityNumber, 
	double wage, double hours) 
	{
		super(firstName, lastName, socialSecurityNumber);
		
		if (wage < 0.0) 
		{ // validate wage
		  throw new IllegalArgumentException(
		     "Hourly wage must be >= 0.0");
		}
		
		if ((hours < 0.0) || (hours > 168.0)) 
		{ // validate hours
		  throw new IllegalArgumentException(
		     "Hours worked must be >= 0.0 and <= 168.0");
		}
		
		this.wage = wage;
		this.hours = hours;
	} 
	
	 /**
     * Sets the hourly wage for the programmer.
     *
     * @param wage The new hourly wage to set.
     */
	public void setWage(double wage) 
	{
		if (wage < 0.0) { // validate wage
		  throw new IllegalArgumentException(
		     "Hourly wage must be >= 0.0");
		}
	
		this.wage = wage;
	} 
	 /**
     * Gets the hourly wage for the programmer.
     *
     * @return The hourly wage.
     */
	public double getWage() 
	{
		return wage;
	} 
	
	/**
    * Sets the hours worked for the programmer.
    *
    * @param hours The new hours worked to set.
    */
	public void setHours(double hours) 
	{
		if ((hours < 0.0) || (hours > 168.0)) 
		{ // validate hours
		  throw new IllegalArgumentException(
		     "Hours worked must be >= 0.0 and <= 168.0");
		}
		
		this.hours = hours;
	} 
	
	 /**
     * Gets the hours worked for the programmer.
     *
     * @return The hours worked.
     */
	public double getHours() 
	{
		return hours;
	} 
	
	/**
     * Calculates the payment amount for the programmer based on hourly wage and hours worked.
     *
     * @return The payment amount.
     */

	@Override
	public double getPaymentAmount() 
	{
		if (getHours() <= 40) 
		{ // no overtime                           
			return getWage() * getHours();   
		}
		else 
		{                                                             
			return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;//overtime
		}	
	}                                          
	
	/**
     * Returns a formatted string representation of the HourlyProgrammer object.
     *
     * @return A string representation of the object.
     */           
	@Override   
	public String toString() 
	{
			return String.format("%s%s %s\n%s%s\n%s%.2f %s%.2f\n%s%.2f\n", 
				"Hourly Programmer: ",getFirstName(), getLastName(), 
				"Social Security Number: ", getSocialSecurityNumber(), 
				"Hourly wage: $",getWage(),"hours worked: ",getHours(),
				"Payment due: $",getPaymentAmount());
	} 
	
	                     
}

