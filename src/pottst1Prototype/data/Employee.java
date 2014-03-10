/*         ====================================================
*          # Name: Teresa Potts (POTTST1)
*          # Date: 2/9/14
*          # Course Name: CITP 290
*          # Description: 
*          ====================================================
*
*
*/

package pottst1Prototype.data;

/**
 * This class contains the getters, setters, and constructors for items
 * related to the employee level. There are only Managers and Employees.
 */

public class Employee
{
	public static final String MANAGER_LEVEL = "MANAGER";
	public static final String EMPLOYEE_LEVEL = "EMPLOYEE";

	private String username;
	private char[] password;
	private String accessLevel;

	/**
	 * This is the getter for username the employee enters.
	 *
	 * @return username
	 * @param s
	 */
	public String getUsername(String s)
	{
		return username;
	}

	/**
	 * This is the setter for the username the employee enters.
	 *
	 * @param username This is the username entered by the employee.
	 */
	public void setUsername(String username)
	{
		this.username = username;
	}

	/**
	 * This is the getter for the password entered by the employee. We are
	 * using the char[] return type since it will not be easily just shown as
	 * a string.
	 *
	 * @return password
	 * @param s
	 */
	public char[] getPassword(String s)
	{
		return password;
	}

	/**
	 * This is the setter for the password entered by the employee.
	 *
	 * @param password This is being passed as a char[] so it won't be shown
	 *                 as a string.
	 */
	public void setPassword(char[] password)
	{
		this.password = password;
	}

	/**
	 * This is the getter for the access level since there are managers and
	 * regular employees.
	 *
	 * @return accessLevel of Employee or Manager
	 * @param s
	 */
	public String getAccessLevel(String s)
	{
		return accessLevel;
	}

	/**
	 * This is the setter for the access level.
	 *
	 * @param accessLevel The string accessLevel is passed in.
	 */
	public void setAccessLevel(String accessLevel)
	{
		this.accessLevel = accessLevel;
	}
}

