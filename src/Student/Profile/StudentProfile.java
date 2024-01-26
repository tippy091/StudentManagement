package Student.Profile;

import java.sql.SQLException;
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
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);

        System.out.println("The Student Profile Portal");

        while(true) {
            System.out.println("\n Press 1 for Adding Profile \n"+
                                "\n Press 2 for Displaying Profiles \n"+
                                "\n Press 3 for Displaying Profile with ID \n"+
                                "\n Press 4 for Deleting Profile \n"+
                                "\n Press 5 for Updating Profile \n"+
                                "\n Press 6 for Exiting the Portal \n");

            System.out.print("Please provide the input: ");
            int input = sc.nextInt();
            AddAction aa = new AddAction();

            switch(input) {
                case 1:
                    System.out.println("Add");
                    System.out.println("Student Name: ");
                    String name = sc.next();
                    System.out.println("Student Domain: ");
                    String domain = sc.next();
                    System.out.println("Student Address: ");
                    String address = sc.next();

                    StudentProfile sp = new StudentProfile(name, domain, address);
                    boolean valid = aa.add(sp);

                    if(valid == true) {
                        System.out.println("Profile Added");
                    } else {
                        System.out.println("Problem Occured");
                    }
                    break;
                case 2:
                    System.out.println("Display");
                    aa.display();
                    break;
                case 3:
                    System.out.println("Display by ID");

                    int in = sc.nextInt();
                    System.out.println("Enter ID -> ");
                    boolean displayID = aa.displaybyID(in);
                    if(displayID == false)
                        System.out.println("Profile with this ID not available.");
                    break;
                case 4:
                    System.out.println("Delete by ID: ");
                    int de = sc.nextInt();
                    boolean deleteID = aa.delete(de);
                    if(deleteID == false)
                        System.out.println("Profile with this ID not available ");
                    break;
                case 5:
                    System.out.println("Update");
                    System.out.println("Press 1 to update Domain \n");
                    System.out.println("Press 2 to update Address");

                    int se = sc.nextInt();
                    if(se == 1) {
                        System.out.println("Enter ID: ");
                        int idd = sc.nextInt();
                        System.out.println("Enter new Domain: ");
                        String ddomain = sc.next();
                        StudentProfile spp = new StudentProfile();
                        spp.setDomain(ddomain);
                        boolean up = aa.update(idd, ddomain, se, spp);
                        if(up == true) {
                            System.out.println("Domain updated successfully.");
                        } else {
                            System.out.println("Error Occured");
                        }
                    } else if (se == 2) {
                        System.out.println("Enter ID: ");
                        int idd = sc.nextInt();
                        System.out.println("Enter new Domain: ");
                        String address = sc.next();
                        StudentProfile spp = new StudentProfile();
                        spp.setDomain(address);
                        boolean upaddr = aa.update(idd, address, se, spp);
                        if(upaddr == true) {
                            System.out.println("Domain updated successfully.");
                        } else {
                            System.out.println("Error Occured");
                        }
                    }

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