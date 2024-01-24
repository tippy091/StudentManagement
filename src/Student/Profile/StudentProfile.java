package Student.Profile;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class StudentProfile {

    private int ID;
    private String Name;
    private String Domain;
    private String Address;

    public StudentProfile(int ID, String Name, String Domain, String Address) {
        this.ID = ID;
        this.Name = Name;
        this.Domain = Domain;
        this.Address = Address;
    }

    public StudentProfile() {

    }

    public StudentProfile(String Name, String Domain, String Address) {
        this.Name = Name;
        this.Domain = Domain;
        this.Address = Address;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDomain() {
        return Domain;
    }

    public void setDomain(String domain) {
        this.Domain = domain;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public String toString() {
        return  "Student ID -> "+ ID+ "\n"+
                "Student Name -> "+ Name+ "\n"+
                "Student Domain -> "+ Domain+ "\n"+
                "Student Address -> "+ Address+ "\n";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("The Student Profile Portal");

        while(true) {
            System.out.println("\n Press 1 for Adding Profile \n"+
                                "\n Press 2 for Displaying Profiles \n"+
                                "\n Press 3 for Displaying Profile with ID \n"+
                                "\n Press 4 for Deleting Profile \n"+
                                "\n Press 5 for Updating Profile \n"+
                                "\n Press 6 for Exiting the Portal \n");

            System.out.print("Please provide ethe Input - ");
            int input = sc.nextInt();

            switch(input) {
                case 1:
                    System.out.println("Add");
                    System.out.println("Student Name: ");
                    String name = sc.nextLine();
                    System.out.println("Student Domain: ");
                    String domain = sc.nextLine();
                    System.out.println("Student Address: ");
                    String address = sc.nextLine();

                    StudentProfile sp = new StudentProfile(name, domain, address);

                    break;
                case 2:
                    System.out.println("Display");
                    break;
                case 3:
                    System.out.println("Display with ID");
                    break;
                case 4:
                    System.out.println("Delete");
                    break;
                case 5:
                    System.out.println("Update");
                    break;
                case 6:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;

            }
        }


    }
}