
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
* 				PaymentInterfaceTest.java
*/


/**
 * The PaymeInterfaceTest class demonstrates the polymorphic behavior of the Payme interface
 * by creating an array of Payme objects and processing them polymorphically.
 * @author Jiaxin Yan
 * @version 1.0
 * @since JDK 17.0.8
 * @see BasePlusCommissionProgrammer
 * @see HourlyProgrammer
 * @see SalariedProgrammer
 * @see Payme
 * @see Invoice
 * @see Programmer
 * @see CommissionProgrammer
 */
public class PaymeInterfaceTest 
{
	/**
     * The main method to test the polymorphic behavior of the Payme interface.
     *
     * @param args Command-line arguments (not used in this example).
     */
	
	public static void main(String[] args) 
	{
	/**
	 * PaymeArr is an array include 6 payme elements.
	 */
	 Payme paymeArr [] = new Payme [6];
	 
	 paymeArr[0] = new Invoice("22776","brakes",3,300);
	 paymeArr[1] = new Invoice("33442","gear", 5,90.99);
	 paymeArr[2] = new SalariedProgrammer("Chidimma", "Chisimma","345-67-0001", 320.00);
	 paymeArr[3] = new HourlyProgrammer("Amara","Chukwu","234-56-7770", 18.95, 40.00);
	 paymeArr[4] = new CommissionProgrammer("Peter","Goodman","123-45-6999", 16500.00, 0.44);
	 paymeArr[5] = new BasePlusCommissionProgrammer("Esther","Patel","102-34-5888", 1200.00, 0.04, 720.00);
	
	 System.out.println(
	    "Payment for Invoices and Programmers are processed polymorphically:\n"); 
	
	 // generically process each element in array paymeObjects
	 
	 for (Payme currentPayme : paymeArr) 
	 {
	
	    if (currentPayme instanceof BasePlusCommissionProgrammer) 
	    {
	       // downcast Payme reference to 
	       // BasePlusCommissioProgrammer reference
	       BasePlusCommissionProgrammer programmer = (BasePlusCommissionProgrammer) currentPayme;
	       System.out.println( programmer.toString());
	    } 
	    else if (currentPayme instanceof CommissionProgrammer) 
	    {
	    	CommissionProgrammer programmer = (CommissionProgrammer) currentPayme;
	    	System.out.println( programmer.toString());
	    } 
	    else if (currentPayme instanceof HourlyProgrammer)
	    {
	    	HourlyProgrammer programmer = (HourlyProgrammer) currentPayme;
	    	System.out.println( programmer.toString());
	    }
	    else if (currentPayme instanceof SalariedProgrammer)
	    {
	    	SalariedProgrammer programmer = (SalariedProgrammer) currentPayme;
	    	System.out.println( programmer.toString());
	    }
	    else if (currentPayme instanceof Invoice)
	    {
	    	Invoice invoice = (Invoice) currentPayme;
	    	System.out.println(invoice.toString());
	    	System.out.printf("%s%.2f\n\n","Payment due: $", invoice.getQuantity()*invoice.getPricePerItem());
	    }
	 }
	}
}



