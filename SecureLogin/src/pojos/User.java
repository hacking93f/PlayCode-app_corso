package pojos;
/**
 * Java representation of the User table in the database
 * @author Brian
 *
 */
public class User {

	private int id;
	private String username;
	private String password;
	
	/**
	 * Constructor
	 * @param username  the unique user's username
	 * @param password	the password associated with the account
	 */
	public User(String username, String password) {
		this.id = id;
		this.username = username;
		this.password = password;
	}

	/**
	 * Return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Set a new id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Set a new username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Return the user's password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Set a new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}
