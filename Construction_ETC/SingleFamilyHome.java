/**
 * This class is a subclass of the residential class. It has all of the same characteristics as the residential class. This class creates a more specific type of residence, a single family home. This class has some unique features that pertain only to single family homes.
 * @author Ethan Craycroft
 * @version 4.20.0
 * Construction Project
 * CS-131-ON/Fall/2021
 */
public class SingleFamilyHome extends Residential
{
	boolean garage; // this variable will be displayed and is set to true or false depending on the presence or lack thereof of a garage
	/**
	 * The empty argument constructor initializes the instance variables for this class
	 */
	public SingleFamilyHome()
	{
		projectName = "";
		completeAddress = "";
		totalSquareFeet = 0.0;
		occupancyGroup = "";
		subgroup = "";
		numBedrooms = 0;
		numBathrooms = 0;
		laundryRoom = false;
		garage = false;
		subgroup = "R1/R2/R3/R4";
		occupancyGroup = "Residential";
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
	 * @param garage
	 */
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom, boolean garage) 
	{
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms,
				laundryRoom);
		this.garage = garage;
		this.laundryRoom = laundryRoom;
	}//end preferred constructor


	public void draw()
	{
		System.out.println("Drawing code for <<Single Family Home>>");
	}//end draw
	
	public String displayData()
	{
		super.displayData();
		String gar = "";
		String laundry = "";
		if(isGarage()==true)
		{
			gar = "Y";
		}
		else if(isGarage()==false)
		{
			gar = "N";
		}
		if(isLaundryRoom() == true)
		{
			laundry = "Y";
		}
		else
		{
			laundry = "N";
		}
		String output = ("Number of Bedrooms: " + getNumBedrooms() + "\nNumber of Bathrooms: " + getNumBathrooms() + "\nLaundry Room: " + laundry + "\nGarage: " + gar + "\n\n");
	
		System.out.println(output);
		return output;
	}//end displayData

	/**
	 * @return the current value of garage: true or false
	 */
	public boolean isGarage() 
	{
		return garage;
	}//end isGarage


	/**
	 * @param garage the value of garage to be set
	 */
	public void setGarage(boolean garage) 
	{
		this.garage = garage;
	}//end setGarage


	@Override
	public String toString() {
		return "SingleFamilyHome [garage=" + garage + "]";
	}//end toString
	
}//end class
