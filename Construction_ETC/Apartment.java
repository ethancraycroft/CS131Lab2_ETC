/**
 * This class is a subclass of the residential class. It has all of the same characteristics as the residential class. This class creates a more specific type of residence, an apartment. This class has some unique features that pertain only to apartments.
 * @author Ethan Craycroft
 * @version 4.20.0
 * Construction Project
 * CS-131-ON/Fall/2021
 */
public class Apartment extends Residential
{
	int numRentableUnits; // this variable will be displayed and is set to be the total number of apartments that can be rented out.
	double avgUnitSize; // this variable will be displayed and is set to be the average size of each unit for each particular apartment
	boolean parkingAvailable; // this variable will be displayed and will be set to true or false depending on if parking is available or not.
	
	/**
	 * The empty argument constructor initializes the instance variables for this class
	 */
	public Apartment()
	{
		projectName = "";
		completeAddress = "";
		totalSquareFeet = 0.0;
		occupancyGroup = "";
		subgroup = "";
		numBedrooms = 0;
		numBathrooms = 0;
		laundryRoom = true;
		numRentableUnits = 0;
		avgUnitSize = 0.0;
		parkingAvailable = true;
	}//empty constructor

	/**
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subgroup
	 * @param numBedrooms
	 * @param numBathrooms
	 * @param laundryRoom
	 * @param numRentableUnits
	 * @param avgUnitSize
	 * @param parkingAvailable
	 */
	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom, int numRentableUnits,
			double avgUnitSize, boolean parkingAvailable) 
	{
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms,
				laundryRoom);
		this.numRentableUnits = numRentableUnits;
		this.avgUnitSize = avgUnitSize;
		this.parkingAvailable = parkingAvailable;
	}//end preferred constructor

	
	public void draw()
	{
		System.out.println("Drawing code for <<Apartment>>");
	}//end draw
	

	public String displayData()
	{
		subgroup = "R1/R2/R3/R4";
		occupancyGroup = "Residential";
		super.displayData();
		String parking = "";
		String laundry = ""; 
		if (isParkingAvailable() == true)
		{
			parking = "Y";
		}
		else if(isParkingAvailable() == false)
		{
			parking = "N";
		}
		if(isLaundryRoom() == true)
		{
			laundry = "Y";
		}
		else
		{
			laundry = "N";
		}
		String output = ("Number of Rentable Units: " + getNumRentableUnits() + "\nAverage Unit Size: " + getAvgUnitSize() + "\nNumber of Bedrooms: " + getNumBedrooms() + "\nNumber of Bathrooms: " + getNumBathrooms() + "\nParking Avaialable: "+ parking + "\nLaundryRoom: " + laundry + "\n\n");
		System.out.println(output);
		return output;
	}//end displayData

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

	/**
	 * @return the current value of avgUnitSize
	 */
	public double getAvgUnitSize() 
	{
		return avgUnitSize;
	}//end getAvgUnitSize

	/**
	 * @param avgUnitSize the value of avgUnitSize to be set
	 */
	public void setAvgUnitSize(double avgUnitSize) 
	{
		this.avgUnitSize = avgUnitSize;
	}//end setAvgUnitSize

	/**
	 * @return the current value of parkingAvailable
	 */
	public boolean isParkingAvailable() 
	{
		return parkingAvailable;
	}//end isParkingAvailable

	/**
	 * @param parkingAvailable the value of parkingAvailable to be set
	 */
	public void setParkingAvailable(boolean parkingAvailable) 
	{
		this.parkingAvailable = parkingAvailable;
	}//end setParkingAvailable

	@Override
	public String toString() {
		return "Apartment [numRentableUnits=" + numRentableUnits + ", avgUnitSize=" + avgUnitSize
				+ ", parkingAvailable=" + parkingAvailable + "]";
	}//end toString
	
}//end class
