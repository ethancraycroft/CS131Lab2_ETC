/**
 * This is the interface for the wizard class, calling the methods setKey, lock, unlock, and isLocked
 */

/**
 * @author Ethan Craycroft
 * @version 1.0
 * Lab 2
 * CS-131-ON Fall 2021
 */
public interface Lockable 
{
	public void setKey(int key);
	public void lock(int key);
	public void unlock(int key);
	public boolean isLocked();
}
