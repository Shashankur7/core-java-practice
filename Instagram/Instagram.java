package collection_programming_shrikant;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Instagram   {
	ArrayList<User> userList = new ArrayList<User>();

	public void welcome() {
		while (true) {
			System.out.println(" WELCOME TO INSTA");
			System.out.println("1.LOGIN  \n2.Create Account");
			System.out.println("Enter an option : ");
			int option = new Scanner(System.in).nextInt();
			switch (option) {
			case 1 -> login();
			case 2 -> createAccount();         
			default -> System.out.println("\n INVALID OPTION\n");
			}
		}
	}

	private void createAccount() {
		System.out.println("\n CREATE ACCOUNT MODULE\n");
		System.out.print("Name : ");
		String name = new Scanner(System.in).next();
		System.out.print("Bio : ");
		String bio = new Scanner(System.in).next();
		System.out.print("Password : ");
		String password = new Scanner(System.in).next();

		User user = new User(name, bio, password);
		userList.add(user);
		System.out.println("\nACCOUNT CREATED SUCCESS\n");
	}

	private void login() {
		System.out.println("\n LOGIN MODULE \n");
		System.out.print("Name : ");
		String name = new Scanner(System.in).next();

		System.out.print("Password : ");
		String password = new Scanner(System.in).next();

		for (User ele : userList) {
			if (name.equals(ele.getName()) && password.equals(ele.getPassword())) {
				homePage(ele);
			}
		}

		System.out.println("\n INVALID CRED OR USER DOESNT EXSIT\n");

	}

	private void homePage(User curr) {
		while (true) {
			System.out.println("\n HOME PAGE \n");
			System.out.println("1. FIND FRIENDS");
			System.out.println("2. FRIENDS List");
			System.out.println("3. Post");
			System.out.println("4. Notifications");
			System.out.println("5. Logout");

			System.out.println("Enter an option : ");
			int option = new Scanner(System.in).nextInt();
			switch (option) {
			case 1 -> findFriends(curr);
			case 2 -> friendsList(curr);
//			case 3 -> post(curr);
			case 4 -> notifications(curr);
			case 5 -> {
				 welcome();
			}
			default -> System.out.println("\n INVALID\n");
			}

		}
	}

	private void notifications(User curr) {
		System.out.println("\n NOTIFICATION\n");

		if (curr.getNotifications().size() == 0) {
			return;
		}
		ArrayList<User> notifi = curr.getNotifications();
		int indx = 1;
		for (User ele : notifi) {
			System.out.print(indx++ + " :  ");
			ele.getProfile();
		}
		System.out.println("Do u want to add someone : ");
		String res = new Scanner(System.in).next().toUpperCase();
		if (res.equals("YES")) {
			System.out.println("INdex : ");
			int index = new Scanner(System.in).nextInt();
			User req = curr.getNotifications().get(index - 1);
			curr.setConnection(req);
			
			System.out.println("req   bheja : ");
			req.getProfile();
			req.setConnection(curr);

			curr.getNotifications().remove(index - 1);

		}
	}

	private void friendsList(User curr) {
		System.out.println("\n FRIEND LIST\n");
		for (User ele : curr.getConnections()) {
			ele.getProfile();
			System.out.println("_________________");
		}
	}

	private void findFriends(User curr) {
		ArrayList<User> newDup = new ArrayList<User>(userList);
		newDup.removeAll(curr.getConnections());
		newDup.remove(curr);
		Collections.shuffle(userList);
		System.out.println("\n FIND FRIENDS \n");
		int indx = 1;
		for (User ele : newDup) {
			System.out.print(indx++ + " ");
			ele.getProfile();
			System.out.println();
		}
		System.out.println("Do u want to add : ");
		String resp = new Scanner(System.in).next();
		User req = null;
		if (resp.equalsIgnoreCase("YES")) {
			System.out.println("Index : ");
			int index = new Scanner(System.in).nextInt();
			req = newDup.get(index - 1);
			req.setNotification(curr);
		}

	}
}
