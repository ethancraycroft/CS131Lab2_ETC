/**
 * This class represents a wizard for
 * a D&D type game.
 * @author rkelley / Ethan Craycroft
 * @version 1.0
 * Lab 2
 * CS131ON
 *
 */
public class Wizard implements Lockable
{
	
	private String name; // this string will be used to give wizard objects identifiable names
	private int health; // this int variable will be used to represent the wizard's health status
	private int key; // this int variable will be used to allow/disallow the locking/unlocking of a wizards health status
	boolean locked; // this boolean variable is used to set whether or not a wizard's health status is locked or not
	
	/**
	 * End constructor to put object into consistent state
	 */
	public Wizard() 
	{
		setName("");
		setHealth(0);
		key = 0; 
		locked = false;
	}//end empty constructor
	
	/**
	 * Constructor to create object with common
	 * usage. This is the preferred constructor.
	 * @param name
	 */
	public Wizard(String name) 
	{
		setName(name);
		setHealth(100);
		key = 0;
		locked = false;
	}//end preferred constructor
	
	/**
	 * This method processes the 
	 * damage to the object when 
	 * it is hit by other objects
	 * (e.g. weapons, lightening, etc.)
	 * @param power
	 */
	public void takeDamage(int power) 
	{
		if(locked == false)
		{
			setHealth((getHealth() - power));
		}
	}//end takeDamage
	
	/**
	 * Getter for name
	 * @return
	 */
	public String getName() 
	{
		return name;
	}//end getName
	
	/**
	 * Setter for name
	 * @param name
	 */
	public void setName(String name) 
	{
		this.name = name;
	}//end setName
	
	/**
	 * Getter for health
	 * @return
	 */
	public int getHealth() 
	{
		return health;
	}//end getHealth
	
	/**
	 * Setter for health
	 * @param health
	 */
	public void setHealth(int health) 
	{
		this.health = health;
	}//end setHealth
	
	/**
	 * Getter for the key
	 * @return
	 */
	public int getKey() 
	{
		return key;
	}//end getKey

	/**
	 * Setter for key
	 * @param key
	 */
	public void setKey(int key)
	{
		if(this.key == 0 && key > 0)
		{
			this.key = key;
		}
	}//end setKey
	
	/**
	 * This method locks the health 
	 * status so that the takeDamage
	 * method cannot affect the health 
	 * variable
	 * @param key
	 */
	public void lock(int key)
	{
		if(this.key == key)
		{
			locked = true;
		}
	}//end lock
	
	/**
	 * This method unlocks the health 
	 * status so that the takeDamage
	 * method can affect the health 
	 * variable
	 * @param key
	 */
	public void unlock(int key)
	{
		if(this.key == key)
		{
			locked = false;
		}
	}//end unlock
	
	/**
	 * Getter for locked 
	 * @return
	 */
	public boolean isLocked()
	{
		return locked;
	}//end isLocked
	
	@Override
	public String toString() 
	{
		return "Wizard [name=" + name + ", health=" + health + ", key=" + key + ", locked=" + locked + "]";
	}//end toString
	
}//end class
