/**
 * This class is the super class. It has commonalities of all buildings
 * @author Ethan Craycroft
 * @version 4.20.0
 * Construction Project
 * CS-131-ON/Fall/2021
 */
public class Building 
{
	protected String projectName; //sets the name of the building being worked on to be displayed
	protected String completeAddress; // sets the address of the building to be displayed
	protected double totalSquareFeet; // sets the total square footage of the building to be displayed
	protected String occupancyGroup; // sets whether the building is a business or residential to be displayed
	protected String subgroup; // sets the subgroup of the building to be displayed
	
	/**
	 * The empty argument constructor initializes the instance variables for this class
	 */
	public Building ()
	{
		projectName = "";
		completeAddress = "";
		totalSquareFeet = 0.0;
		occupancyGroup = "";
		subgroup = "";
	}//end empty constructor
	
	/**
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subgroup
	 */
	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) 
	{
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subgroup = subgroup;
	}//end preferred constructor

	public void draw()
	{
		System.out.print("Drawing code for <<Building>>\n");
	}//end draw
	
	public String displayData()
	{
		String output = ("Project Name: " + getProjectName() + "\nAddress: " + getCompleteAddress() + "\nSquare Feet: " + getTotalSquareFeet() + "\nOccupancy Group: " + getOccupancyGroup() + "\nOccupancy Subgroup: " + subgroup);
		System.out.println(output);
		return output;
	}//end displayData

	/**
	 * @return the current value of projectName
	 */
	public String getProjectName() 
	{
		return projectName;
	}//end getProjectName

	/**
	 * @param projectName the value of projectName to be set
	 */
	public void setProjectName(String projectName) 
	{
		this.projectName = projectName;
	}//end setProjectName

	/**
	 * @return the current value of completeAddress
	 */
	public String getCompleteAddress() 
	{
		return completeAddress;
	}//end getCompleteAddress

	/**
	 * @param completeAddress the value of completeAddress to be set
	 */
	public void setCompleteAddress(String completeAddress) 
	{
		this.completeAddress = completeAddress;
	}//end setCompleteAddress

	/**
	 * @return the current value of totalSquareFeet
	 */
	public double getTotalSquareFeet() 
	{
		return totalSquareFeet;
	}//end getTotalSquareFeet

	/**
	 * @param totalSquareFeet the value of totalSquareFeet to be set
	 */
	public void setTotalSquareFeet(double totalSquareFeet)
	{
		this.totalSquareFeet = totalSquareFeet;
	}//end setTotalSquareFeet

	/**
	 * @return the current value of occupancyGroup
	 */
	public String getOccupancyGroup() 
	{
		return occupancyGroup;
	}//end getOccupancyGroup

	/**
	 * @param occupancyGroup the value of occupancyGroup to be set
	 */
	public void setOccupancyGroup(String occupancyGroup) 
	{
		this.occupancyGroup = occupancyGroup;
	}//end setOccupancyGroup

	/**
	 * @return the current value of subgroup
	 */
	public String getSubgroup()
	{
		return subgroup;
	}//end getSubgroup

	/**
	 * @param subgroup the value of subgroup to be set
	 */
	public void setSubgroup(String subgroup)
	{
		this.subgroup = subgroup;
	}//end setSubgroup

	@Override
	public String toString() {
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
				+ totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + "]";
	}//end toString
	
}//end class
