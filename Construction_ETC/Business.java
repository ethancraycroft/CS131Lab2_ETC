/**
 * This class is a child class of the Building super class. It creates objects that are businesses, and is extended by its child classes. 
 * @author Ethan Craycroft
 * @version 4.20.0
 * Construction Project
 * CS-131-ON/Fall/2021
 */
public class Business extends Building
{
	protected int numRentableUnits; // this variable is used to set the total amount of units that can be rented out to be displayed
	
	/**
	 * The empty argument constructor initializes the instance variables for this class
	 */
	public Business()
	{
		projectName = "";
		completeAddress = "";
		totalSquareFeet = 0.0;
		occupancyGroup = "";
		numRentableUnits = 0;
	}//end empty constructor
	
	/**
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subgroup
	 * @param numRentableUnits
	 */
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup, int numRentableUnits) 
	{
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numRentableUnits = numRentableUnits;
	}//end preferred constructor


	/**
	 * @return the current value of numRentableUnits
	 */
	public int getNumRentableUnits() 
	{
		return numRentableUnits;
	}//end getNumRentableUnits

	/**
	 * @param numRentableUnits the value of numRentableUnits to be set
	 */
	public void setNumRentableUnits(int numRentableUnits) 
	{
		this.numRentableUnits = numRentableUnits;
	}//end setNumRentableUnits

	@Override
	public String toString() {
		return "Business [numRentableUnits=" + numRentableUnits + "]";
	}//end toString
	
}//end class
