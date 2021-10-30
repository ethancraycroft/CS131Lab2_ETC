/**
 * This class is used to test all of the methods in the Wizard class to ensure proper functionality.
 */

/**
 * @author Ethan Craycroft
 * @version 1.0
 * Lab 2
 * CS-131-ON Fall 2021
 */
public class Application 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Wizard emptyWiz = new Wizard();
		// Tests the empty constructor
		
		System.out.println("Health = " + emptyWiz.getHealth());
		System.out.println("Key = " + emptyWiz.getKey());
		System.out.println("Name = " + emptyWiz.getName());
		System.out.println("Locked = " + emptyWiz.isLocked()+"\n\n");
		// Prints out the variables to ensure the empty constructor works properly
		
		
		Wizard wiz = new Wizard("Harry");
		// Tests the preferred constructor
		System.out.println("Health = " + wiz.getHealth());
		System.out.println("Key = " + wiz.getKey());
		System.out.println("Name = " + wiz.getName());
		System.out.println("Locked = " + wiz.isLocked() + "\n\n");
		// Prints out the variables to ensure the preferred constructor works properly
		
		wiz.takeDamage(10);
		System.out.println("Health = " + wiz.getHealth() + "\n\n");
		// Tests the takeDamage method before altering the locked variable
		
		wiz.setName("Hermione");
		System.out.println("Name = " + wiz.getName() + "\n\n");
		// Tests the getter and setter for the name variable
		
		wiz.setHealth(100);
		System.out.println("Health = " + wiz.getHealth() + "\n\n");
		// Tests the getter and setter for the health variable
		
		wiz.setKey(12);
		System.out.println("Key = " + wiz.getKey() + "\n\n");
		// Tests the getter and setter for the key variable
		
		wiz.lock(10);
		System.out.println("Locked = " + wiz.isLocked() + "\n\n");
		// Tests the locking method with the incorrect key
		
		wiz.lock(12);
		System.out.println("Locked = " + wiz.isLocked() + "\n\n");
		// Tests the locking method with the correct key
		
		wiz.takeDamage(20);
		System.out.println("Health = " + wiz.getHealth() + "\n\n");
		// Tests the takeDamage method after the wizard has been locked
		
		wiz.unlock(10);
		System.out.println("Locked = " + wiz.isLocked() + "\n\n");
		// Tests the unlocking method with the incorrect key
		
		wiz.unlock(12);
		System.out.println("Locked = " + wiz.isLocked() + "\n\n");
		// Tests the unlocking method
		
		wiz.takeDamage(20);
		System.out.println("Health = " + wiz.getHealth() + "\n\n");
		// Tests the takeDamage method after the wizard has been unlocked
		
		System.out.println(wiz.toString());
		// Tests the toString method
		
	}

}
