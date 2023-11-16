/** 
* File name: [Invoice.java]
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
 * The Invoice class represents an invoice for a part with details such as part number,
 * part description, quantity, and price per item. It implements the Payme interface.
 * @author Daniel Cormier
 * @version 1.0
 * @since JDK 17.0.8
 * @see BasePlusCommissionProgrammer
 * @see PaymeInterfaceTest
 * @see SalariedProgrammer
 * @see Payme
 * @see Programmer
 * @see HourlyProgrammer
 * @see CommissionProgrammer
 */

public class Invoice implements Payme 
	{/**
	 * partNumber of the part that being purchased 
	 */
	private String partNumber; 
	/**
	 * partDescription of the part that being purchased
	 */
	private String partDescription;
	/**
	 * quantity of the part that being purchased
	 */
	private int quantity;
	/**
	 * pricePerItem of the part that being purchased
	 */
	private double pricePerItem;
	
	/**
     * Constructs an Invoice object with specified details.
     *
     * @param part        The part number.
     * @param description The part description.
     * @param count       The quantity of items.
     * @param price       The price per item.
     */
	public Invoice(String part, String description, int count, 
	 double price) {
	 partNumber = part;
	 partDescription = description;
	 setQuantity(count); // validate and store quantity
	 setPricePerItem(price); // validate and store price per item
	}
	
	/**
     * Sets the part number for the invoice.
     *
     * @param part The new part number to set.
     */
	public void setPartNumber(String part) {
	 partNumber = part; // should validate
	}
	
	/**
     * Gets the part number for the invoice.
     *
     * @return The part number.
     */
	public String getPartNumber() {
	 return partNumber;
	}
	
	/**
     * Sets the part description for the invoice.
     *
     * @param description The new part description to set.
     */
	public void setPartDescription(String description) {
	 partDescription = description; // should validate
	}
	
	/**
     * Gets the part description for the invoice.
     *
     * @return The part description.
     */
	public String getPartDescription() {
	 return partDescription;
	}
	
	/**
     * Sets the quantity of items for the invoice.
     *
     * @param count The new quantity to set.
     */
	public void setQuantity(int count) {
	 quantity = (count < 0) ? 0 : count; // quantity cannot be negative
	}
	
	 /**
     * Gets the quantity of items for the invoice.
     *
     * @return The quantity.
     */
	public int getQuantity() {
	 return quantity;
	}
	
	/**
     * Sets the price per item for the invoice.
     *
     * @param price The new price per item to set.
     */
	public void setPricePerItem(double price) {
	 pricePerItem = (price < 0.0) ? 0.0 : price; // validate price
	}
	
	 /**
     * Gets the price per item for the invoice.
     *
     * @return The price per item.
     */
	public double getPricePerItem() {
	 return pricePerItem;
	}
	
	 /**
     * Returns a formatted string representation of the Invoice object.
     *
     * @return A string representation of the object.
     */
	@Override
	public String toString() {
	 return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%.2f", 
	    "Invoice", "Part number", getPartNumber(), getPartDescription(), 
	    "Quantity", getQuantity(), "Price per item", getPricePerItem());
	} 
	
	 /**
     * Gets the payment amount for the invoice.
     *
     * @return The payment amount.
     */
	@Override
	public double getPaymentAmount() {
	 return getQuantity() * getPricePerItem(); // calculate total cost
	}
}


