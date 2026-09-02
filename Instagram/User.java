package collection_programming_shrikant;

import java.util.ArrayList;

public class User {
	private String name;
	private String bio;
	private String password;
	private ArrayList<User> notifications = new ArrayList<User>();
	private ArrayList<User> conn = new ArrayList<User>();

	public User(String name, String bio, String password) {
		super();
		this.name = name;
		this.bio = bio;
		this.password = password;
	}

	public void getProfile() {
		System.out.println("\n Profile Info ");
		System.out.println("Name :"+name);
		System.out.println("Bio : "+bio);
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}
	
	public String getBio() {
		return bio;
	}
	public void setNotification(User addReq) {
		notifications.add(addReq);
	}
	
	public ArrayList<User> getNotifications(){
		return this.notifications;
	}
	
	public ArrayList<User> getConnections(){
		return conn ; 
	}
	public void setConnection(User newUser) {
		this.conn.add(newUser);
	}

}
