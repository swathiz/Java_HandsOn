package virtula_key;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class VirtualKey {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<String> files = new ArrayList<String>();

	public static void main(String[] args) {
		System.out.println("\n******************************************************\n");
		System.out.println("\tWelcome to LockMe.com Virtual Repository ");
		System.out.println("\t\t Developed by SWATHI S \n");
		System.out.println("******************************************************");
		login();
		// mainMenu();

	}

	private static void login() {
		System.out.println("To use the application, enter username and password");
		System.out.println("USERNAME(Try with admin):");
		String uname = sc.next();
		System.out.println("Enter PASSWORD(Try with password):");
		String pwd = sc.next();
		boolean chk;
		try {
			chk = authenticate(uname, pwd);
			if (chk) {
				mainMenu();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static boolean authenticate(String username, String password) throws InterruptedException {

		System.out.println("\nAuthenticating...\n");
		TimeUnit.SECONDS.sleep(2);
		return true;
	}

	private static void mainMenu() {
		String[] arr = { "1. Retrive the file names in repository", "2. To continue with Business Level Operations",
				"3. Close the application" };
		int[] arr1 = { 1, 2, 3 };
		int slen = arr1.length;
		System.out.println("\t\tMAIN MENU\n");
		for (int i = 0; i < slen; i++) {
			System.out.println(arr[i]);
			// display the all the Strings mentioned in the String array
		}
		System.out.println("\nEnter your choice:\t");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		for (int j = 1; j <= slen; j++) {
			if (option == j) {
				switch (option) {
				case 1:
//                System.out.println("Your saved expenses are listed below: \n");
//                System.out.println(files+"\n");
					Collections.sort(files);
					System.out.println("Files in repository in alphabetical order:"+files);
					mainMenu();
					break;
				case 2:
					System.out.println("\n\tBusiness Level Operations menu: \n");
					// mainMenu();
					subMenu();
					break;
				case 3:
					closeApp();
					break;
				default:
					System.out.println("You have made an invalid choice!");
					break;

				}
			}
		}

	}

	private static void subMenu() {
		String[] arr = {"1. Add a file", 
				"2. Delete a user specified file from existing list",
				"3. Search a user specified file", 
				"4. Back to Main Menu" };
		int[] arr1 = { 1, 2, 3, 4 };
		int slen = arr1.length;
		for (int i = 0; i < slen; i++) {
			System.out.println(arr[i]);
			// display the all the Strings mentioned in the String array
		}
		System.out.println("\nEnter your choice:\t");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		for (int j = 1; j <= slen; j++) {
			if (option == j) {
				switch (option) {
				case 1:
					System.out.println("Add file: \n");
					System.out.println("Enter the filename you want to add:");
					Scanner sc1 = new Scanner(System.in);
					String fname = sc1.next();
					try {
						files.add(fname);
					} catch (Exception e) {
						e.printStackTrace();
					}
					System.out.println("Files in repository\n" + files);
					subMenu();
					break;
				case 2:
					System.out.println("To Delete user specified file \n");
					System.out.println("Files in repository before deletion\n" + files);
					System.out.println("Enter the filename you want to delete:");
					Scanner sc2 = new Scanner(System.in);
					String fname1 = sc2.next();
					try {
						Iterator<String> itr = files.iterator();
						while (itr.hasNext()) {
							String file = itr.next();
							if (file.equals(fname1)) {
								itr.remove();
								System.out.println("File deleted successfully");
							}
						}
						//System.out.println("Files in repository\n" + files);
						// files.remove(String.valueOf(fname1));
					} catch (Exception e) {
						e.printStackTrace();
					}
					System.out.println("Files in repository\n" + files);
					subMenu();
					break;
				case 3:
					searchfiles(files);
					subMenu();
					break;
				case 4:
					System.out.println("Back to Main Menu..\n");
					mainMenu();
					break;
				default:
					System.out.println("You have made an invalid choice!");
					break;

				}
			}
		}

	}

	private static void searchfiles(ArrayList<String> arrayList) {
		System.out.println("To Search a user specified file");
		int leng = arrayList.size();
        System.out.println("Enter the filename you need to search:\t");
        Scanner s = new Scanner(System.in);
        String filename = s.next();
        Collections.sort(arrayList);
        int result = Collections.binarySearch(arrayList,filename);
        //System.out.println("result is:"+result);
        if(result >= 0) {
        	System.out.println("Yes.. This file is present at \n" + result);
//        	System.out.println("Your expense at: "+result);
//        	System.out.println("--------------------------------------------------------");
        } else {
        	System.out.println("No such file found \n");
        	//System.out.println("--------------------------------------------------------");
        }
		//System.out.println("Files in repository\n" + files);
		//subMenu();
		
	}

	private static void closeApp() {
		System.out.println("Closing your application... \nThank you!");
	}

}
