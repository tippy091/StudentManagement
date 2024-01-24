package Student.Profile;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private int ID;
    private String Name;
    private String Domain;
    private String Address;

    public StudentProfile() {

    }
    public StudentProfile(int ID, String Name, String Domain, String Address) {
        this.ID = ID;
        this.Name = Name;
        this.Domain = Domain;
        this.Address = Address;
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

    public static void main(String[] args) {
    }
}