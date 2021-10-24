/**
 * This class creates Mall objects, that is a specific type of building and business. It extends the business class therefore it has all of the same instances as business and building.
 * @author Ethan Craycroft
 * @version 4.20.0
 * Construction Project
 * CS-131-ON/Fall/2021
 */
public class Mall extends Business
{
	double medianUnitSize; // this variable is used to set the median size of the Mall units to be displayed
	int numParkingSpaces; // this variable is used to set the number of parking spaces at each particualr mall to be displayed
	int numRentedUnits; // this variable is used to set the amount of units currently rented out of the mall in questions to be displayed
	
	/**
	 * The empty argument constructor initializes the instance variables for this class
	 */
	public Mall()
	{
		subgroup = "B";
		occupancyGroup = "Residential";
		projectName = "";
		completeAddress = "";
		totalSquareFeet = 0.0;
		occupancyGroup = "";
		numRentableUnits = 0;
		medianUnitSize = 0.0;
		numParkingSpaces = 0;
		numRentedUnits = 0;
	}//end empty constructor

	/**
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subgroup
	 * @param numRentableUnits
	 * @param medianUnitSize
	 * @param numParkingSpaces
	 * @param numRentedUnits
	 */
	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup, int numRentableUnits, double medianUnitSize, int numParkingSpaces, int numRentedUnits) 
	{
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numRentableUnits);
		this.medianUnitSize = medianUnitSize;
		this.numParkingSpaces = numParkingSpaces;
		this.numRentedUnits = numRentedUnits;
		occupancyGroup = "Residential";
	}//end preferred constructor

	public void draw()
	{
		System.out.print("\n\nDrawing code for <<Mall>>\n");
	}//end draw
	
	public String displayData()
	{
		super.displayData();
		subgroup = "B";
		occupancyGroup = "Business";
		String output = ("Median Unit Size: " + getMedianUnitSize() + "\nNumber of Rentable Units: " + getNumRentableUnits() + "\nNumber of Units Rented: " + getNumRentedUnits() + "\nNumber of Parking Spaces: " + getNumParkingSpaces() + "\n\n");
		System.out.println(output);
		return output;
	}//end displayData

	/**
	 * @return the current value of medianUnitSize
	 */
	public double getMedianUnitSize() 
	{
		return medianUnitSize;
	}//end getMedianUnitSize

	/**
	 * @param medianUnitSize the value of medianUnitSize to be set
	 */
	public void setMedianUnitSize(double medianUnitSize)
	{
		this.medianUnitSize = medianUnitSize;
	}//end setMedianUnitSize

	/**
	 * @return the current value of numParkingSpaces
	 */
	public int getNumParkingSpaces() 
	{
		return numParkingSpaces;
	}//end getNumParkingSpaces

	/**
	 * @param numParkingSpaces the value of numParkingSpaces to be set
	 */
	public void setNumParkingSpaces(int numParkingSpaces) 
	{
		this.numParkingSpaces = numParkingSpaces;
	}//end setNumParkingSpaces

	/**
	 * @return the current value of numRentedUnits
	 */
	public int getNumRentedUnits() 
	{
		return numRentedUnits;
	}//end getNumRentedUnits

	/**
	 * @param numRentedUnits the value of numRentedUnits to be set
	 */
	public void setNumRentedUnits(int numRentedUnits) 
	{
		this.numRentedUnits = numRentedUnits;
	}//end setRentedUnits

	@Override
	public String toString() 
	{
		return "Mall [medianUnitSize=" + medianUnitSize + ", numParkingSpaces=" + numParkingSpaces + ", numRentedUnits="
				+ numRentedUnits + "]";
	}//end toString
	
}//end class
