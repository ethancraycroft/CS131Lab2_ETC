/**
 * This class is a subclass of the building class. It has all of the same characteristics as the building class. This class creates a more specific type of building used for residence. This class has 2 child classes that will extend it
 * @author Ethan Craycroft
 * @version 4.20.0
 * Construction Project
 * CS-131-ON/Fall/2021
 */
public class Residential extends Building
{
	protected int numBedrooms; // this variable will be displayed and is set to be the number of bedrooms in each particular residence.
	protected int numBathrooms; // this variable will be displayed and is set to be the number of bathrooms in each particular residence.
	protected boolean laundryRoom; // this variable will be displayed and is set to be true or false depending on the presence or lack-thereof a laundry room in each particular residence.
	
	
	/**
	 * The empty argument constructor initializes the instance variables for this class
	 */
	public Residential()
	{
		projectName = "";
		completeAddress = "";
		totalSquareFeet = 0.0;
		occupancyGroup = "";
		subgroup = "";
		numBedrooms = 0;
		numBathrooms = 0;
		laundryRoom = false;
	}//end empty constructor

	/**
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subgroup
	 * @param numBedrooms
	 * @param numBathrooms
	 * @param laundryRoom
	 */
	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom) 
	{
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numBedrooms = numBedrooms;
		this.numBathrooms = numBathrooms;
		this.laundryRoom = laundryRoom;
	}//end preferred constructor



	/**
	 * @return the current value of numBedrooms
	 */
	public int getNumBedrooms() 
	{
		return numBedrooms;
	}//end getNumBedrooms

	/**
	 * @param numBedrooms the value of numBedrooms to be set
	 */
	public void setNumBedrooms(int numBedrooms) 
	{
		this.numBedrooms = numBedrooms;
	}//end setNumBedrooms

	/**
	 * @return the current value of numBathrooms
	 */
	public int getNumBathrooms() 
	{
		return numBathrooms;
	}//end getNumBathrooms

	/**
	 * @param numBathrooms the value of numBathrooms to be set
	 */
	public void setNumBathrooms(int numBathrooms)
	{
		this.numBathrooms = numBathrooms;
	}//end setNumBathrooms

	/**
	 * @return the current value of laundryRoom
	 */
	public boolean isLaundryRoom() 
	{
		return laundryRoom;
	}//end isLaundryRoom

	/**
	 * @param laundryRoom the value of laundryRoom to be set
	 */
	public void setLaundryRoom(boolean laundryRoom) 
	{
		this.laundryRoom = laundryRoom;
	}//end setLaundryRoom

	@Override
	public String toString() {
		return "Residential [numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms + ", laundryRoom="
				+ laundryRoom + "]";
	}//end toString
	
}//end class
