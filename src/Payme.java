/** 
* File name: [Payme.java]
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
 *
 * This is a payment interface used to retrieve the payment amount.
 * @author Jiaxin Yan
 * @version 1.0
 * @since JDK 17.0.8
 * @see BasePlusCommissionProgrammer
 * @see PaymeInterfaceTest
 * @see SalariedProgrammer
 * @see Invoice
 * @see Programmer
 * @see HourlyProgrammer
 * @see CommissionProgrammer
 */
public interface Payme {
	
	/**
	 * Get the payment amount.
	 *
	 * @return The payment amount, returned as a double.
	 */
	public double getPaymentAmount();
}
