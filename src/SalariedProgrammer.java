/** 
* File name: [SalariedProgrammer.java]
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
 * The SalariedProgrammer class represents a programmer paid a fixed weekly salary.
 * @author Jiaxin Yan
 * @version 1.0
 * @since JDK 17.0.8
 * @see BasePlusCommissionProgrammer
 * @see PaymeInterfaceTest
 * @see Programmer
 * @see Payme
 * @see Invoice
 * @see HourlyProgrammer
 * @see CommissionProgrammer
 */

public class SalariedProgrammer extends Programmer  
{/**
 * weeklySalary of the programmer
 */
	private double weeklySalary;
	
	 /**
     * Constructs a SalariedProgrammer object with specified details.
     *
     * @param firstName            The first name of the programmer.
     * @param lastName             The last name of the programmer.
     * @param socialSecurityNumber The social security number of the programmer.
     * @param weeklySalary         The fixed weekly salary of the programmer.
     */
	public SalariedProgrammer(String firstName, String lastName, String socialSecurityNumber,double weeklySalary) 
	{
		super(firstName, lastName, socialSecurityNumber); 
	
		if (weeklySalary < 0.0) {
		  throw new IllegalArgumentException(
		     "Weekly salary must be >= 0.0");
		}
	
		this.weeklySalary = weeklySalary;
	} 
	
	 /**
     * Sets the fixed weekly salary for the programmer.
     *
     * @param weeklySalary The new weekly salary to set.
     */
	public void setWeeklySalary(double weeklySalary) 
	{
		if (weeklySalary < 0.0) {
		  throw new IllegalArgumentException(
		     "Weekly salary must be >= 0.0");
		}
	
		this.weeklySalary = weeklySalary;
	} 
	
	 /**
     * Gets the fixed weekly salary for the programmer.
     *
     * @return The weekly salary.
     */
	public double getWeeklySalary() 
	{
		return weeklySalary;
	} 
	
	 /**
     * Calculates the payment amount for the programmer based on the fixed weekly salary.
     *
     * @return The payment amount.
     */
	@Override
	public double getPaymentAmount() 
	{
		return weeklySalary;
	}                                             
	
	 /**
     * Returns a formatted string representation of the SalariedProgrammer object.
     *
     * @return A string representation of the object.
     */
	@Override  
	public String toString() 
	{
		return String.format("%s%s %s\n%s:%s\n%s%.2f\n%s%.2f\n", 
				"Salaried Programmer: ",getFirstName(), getLastName(), 
				"Social Security Number: ", getSocialSecurityNumber(), 
				"Weekly salary: $",getWeeklySalary(),
				"Payment due: $",getPaymentAmount());
	}

}

