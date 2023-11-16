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
 * The Programmer abstract class serves as the base class for various types of programmers
 * and implements the Payme interface.
 * @author Jiaxin Yan
 * @version 1.0
 * @since JDK 17.0.8
 * @see BasePlusCommissionProgrammer
 * @see PaymeInterfaceTest
 * @see SalariedProgrammer
 * @see Payme
 * @see Invoice
 * @see HourlyProgrammer
 * @see CommissionProgrammer
 */

public abstract class Programmer implements Payme 
	{
	/**
	 * firstName of the programmer
	 */
	private String firstName;
	 /**
	  * lasyName of the programmer
	  */
	private String lastName;
	/**
	 * socialSecurityNumber of the programmer
	 */
	private String socialSecurityNumber;
	
	/**
     * Constructs a Programmer object with specified details.
     *
     * @param first               The first name of the programmer.
     * @param last                The last name of the programmer.
     * @param ssn                 The social security number of the programmer.
     */
	public Programmer(String first, String last, String ssn) 
	{
	 firstName = first;
	 lastName = last;
	 socialSecurityNumber = ssn;
	}
	
	/**
     * Gets the first name of the programmer.
     *
     * @return The first name.
     */
	public String getFirstName() 
	{
		return firstName;
	}
	/**
     * Sets the first name of the programmer.
     *
     * @param firstName The new first name to set.
     */
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	 /**
     * Gets the last name of the programmer.
     *
     * @return The last name.
     */
	public String getLastName() 
	{
		return lastName;
	}
	 /**
     * Sets the last name of the programmer.
     *
     * @param lastName The new last name to set.
     */
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	/**
     * Gets the social security number of the programmer.
     *
     * @return The social security number.
     */
	public String getSocialSecurityNumber() 
	{
		return socialSecurityNumber;
	}
	 /**
     * Sets the social security number of the programmer.
     *
     * @param socialSecurityNumber The new social security number to set.
     */
	public void setSocialSecurityNumber(String socialSecurityNumber) 
	{
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	
	/**
     * Returns a formatted string representation of the Programmer object.
     *
     * @return A string representation of the object.
     */
	@Override
	public String toString() 
	{
		return String.format("%s %s\n%s: %s", 
				getFirstName(), getLastName(), 
				"Social Security Number is",getSocialSecurityNumber());
	} 
	
	/**
     * Gets the payment amount for the programmer. Note: This method is declared abstract,
     * and concrete subclasses must provide an implementation.
     *
     * @return The payment amount.
     */
	public abstract double getPaymentAmount(); 
}

