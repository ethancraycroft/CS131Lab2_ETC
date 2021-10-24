/**
 * This class contains the main method. This class is used to test all of the other classes and their methods.
 * @author Ethan Craycroft
 * @version 4.20.0
 * Construction Project
 * CS-131-ON/Fall/2021
 */
public class Application 
{

	public static void main(String[] args) 
	{
		Building building = new Building();
		building.draw();
		building.setProjectName("Building");
		building.getProjectName();
		building.setCompleteAddress("123 Main Street");
		building.getCompleteAddress();
		building.setOccupancyGroup("N/A");
		building.getOccupancyGroup();
		building.setSubgroup("N/A");
		building.getSubgroup();
		building.setTotalSquareFeet(140000);
		building.getTotalSquareFeet();
		building.displayData();
		building.toString();
		// TESTS ALL CODE (EXCEPT PREFERRED CONSTRUCTOR) FOR THE BUILDING CLASS
		
		Business business = new Business();
		business.setNumRentableUnits(100);
		business.getNumRentableUnits();
		business.setProjectName("Business");
		business.getProjectName();
		business.setCompleteAddress("123 Main Street");
		business.getCompleteAddress();
		business.setOccupancyGroup("N/A");
		business.getOccupancyGroup();
		business.setSubgroup("N/A");
		business.getSubgroup();
		business.setTotalSquareFeet(140000);
		business.getTotalSquareFeet();
		business.toString();
		// TESTS ALL CODE (EXCEPT PREFERRED CONSTRUCTOR) FOR THE BUSINESS CLASS
		
		Residential residential = new Residential();
		residential.setProjectName("Residential");
		residential.getProjectName();
		residential.setCompleteAddress("123 Main Street");
		residential.getCompleteAddress();
		residential.setOccupancyGroup("N/A");
		residential.getOccupancyGroup();
		residential.setSubgroup("N/A");
		residential.getSubgroup();
		residential.setTotalSquareFeet(140000);
		residential.getTotalSquareFeet();
		residential.setNumBedrooms(4);
		residential.getNumBedrooms();
		residential.setNumBathrooms(2);
		residential.getNumBathrooms();
		residential.setLaundryRoom(true);
		residential.isLaundryRoom();
		residential.toString();
		// TESTS ALL CODE (EXCEPT PREFERRED CONSTRUCTOR) FOR RESIDENTIAL CLASS
		
		Mall mall = new Mall();
		mall.setNumParkingSpaces(25000);
		mall.getNumParkingSpaces();
		mall.setMedianUnitSize(10000);
		mall.getMedianUnitSize();
		mall.setNumRentedUnits(50);
		mall.getNumRentedUnits();
		mall.setNumRentableUnits(100);
		mall.getNumRentableUnits();
		mall.setProjectName("Mall");
		mall.getProjectName();
		mall.setCompleteAddress("123 Main Street");
		mall.getCompleteAddress();
		mall.setOccupancyGroup("N/A");
		mall.getOccupancyGroup();
		mall.setSubgroup("N/A");
		mall.getSubgroup();
		mall.setTotalSquareFeet(140000);
		mall.getTotalSquareFeet();
		mall.draw();
		mall.displayData();
		mall.toString();
		// TESTS ALL CODE (EXCEPT PREFERRED CONSTRUCTOR) FOR MALL CLASS
		
		Apartment apartment = new Apartment();
		apartment.setProjectName("Apartment");
		apartment.getProjectName();
		apartment.setCompleteAddress("123 Main Street");
		apartment.getCompleteAddress();
		apartment.setOccupancyGroup("N/A");
		apartment.getOccupancyGroup();
		apartment.setSubgroup("N/A");
		apartment.getSubgroup();
		apartment.setTotalSquareFeet(140000);
		apartment.getTotalSquareFeet();
		apartment.setNumBedrooms(4);
		apartment.getNumBedrooms();
		apartment.setNumBathrooms(2);
		apartment.getNumBathrooms();
		apartment.setLaundryRoom(true);
		apartment.isLaundryRoom();
		apartment.setNumRentableUnits(1000);
		apartment.getNumRentableUnits();
		apartment.setParkingAvailable(true);
		apartment.isParkingAvailable();
		apartment.setAvgUnitSize(2500.0);
		apartment.getAvgUnitSize();
		apartment.draw();
		apartment.toString();
		apartment.displayData();
		// TESTS ALL CODE (EXCEPT PREFERRED CONSTRUCTOR) FOR APARTMENT CLASS
		
		SingleFamilyHome single = new SingleFamilyHome();
		single.setProjectName("Residential");
		single.getProjectName();
		single.setCompleteAddress("123 Main Street");
		single.getCompleteAddress();
		single.setOccupancyGroup("N/A");
		single.getOccupancyGroup();
		single.setSubgroup("N/A");
		single.getSubgroup();
		single.setTotalSquareFeet(140000);
		single.getTotalSquareFeet();
		single.setNumBedrooms(4);
		single.getNumBedrooms();
		single.setNumBathrooms(2);
		single.getNumBathrooms();
		single.setLaundryRoom(true);
		single.isLaundryRoom();
		single.setGarage(true);
		single.isGarage();
		single.draw();
		single.toString();
		single.displayData();
		// TESTS ALL CODE (EXCEPT PREFERRED CONSTRUCTOR) FOR SINGLEFAMILYHOME CLASS
		
		Building building1 = new Building("Building1", "123 ABC Street", 175000, "N/a", "N/a");
		building1.displayData();
		// TESTS PREFERRED CONSTRUCTOR FOR BUILDING CLASS
		
		Business business1 = new Business("Business1", "123 ABC Street", 175000, "Business", "B", 250);
		// TESTS PREFERRED CONSTRUCTOR FOR BUSINESS CLASS
		
		Mall mall1 = new Mall("Mall1", "123 ABC Street", 175000, "Business", "B", 250, 1500.0, 500, 200);
		mall1.displayData();
		// TESTS PREFERRED CONSTRUCTOR FOR MALL CLASS
		
		Residential residential1 = new Residential("Residential1", "123 ABC Street", 175000, "Residential", "R1/R2/R3/R4", 4, 3, true);
		// TESTS PREFERRED CONSTRUCTOR FOR RESIDENTIAL CLASS
		
		Apartment apartment1 = new Apartment("Apartment1", "123 ABC Street", 175000, "Residential", "R1/R2/R3/R4", 4, 3, true, 200, 1500, true);
		apartment1.displayData();
		// TESTS PREFERRED CONSTRUCTOR FOR APARTMENT CLASS
		
		SingleFamilyHome single1 = new SingleFamilyHome("Single1", "123 ABC Street", 175000, "Residential", "R1/R2/R3/R4", 4, 3, false, true);
		single1.displayData();
		
		// TESTS PREFERRED CONSTRUCTOR FOR SINGLEFAMILYHOME CLASS

	}

}
