package Student.Profile;

import Connectivity.Data;

import java.sql.*;

public class AddAction {
    public boolean add(StudentProfile sp ) {

        boolean check = false;

        try {
            Connection con = Data.getCon();
            String query = "INSERT INTO profiles(name, domain, address) values(?, ?, ?)";

            assert con != null;
            PreparedStatement p = con.prepareStatement(query);

            p.setString(1, sp.getName());
            p.setString(2, sp.getDomain());
            p.setString(3, sp.getAddress());
            p.executeUpdate();

            check = true;

        } catch(Exception e) {
            System.out.println(e);
        }
        return check;
    }

    public void display()  {
        try {

            Connection con = Data.getCon();
            String query = "SELECT * FROM profiles";
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(query);

            while (rs.next()) {
                System.out.println(
                        "ID       ->" + rs.getInt(1) + "\n" +
                                "Name     ->" + rs.getString(2) + "\n" +
                                "Domain   ->" + rs.getString(3) + "\n" +
                                "Address  ->" + rs.getString(4) + "\n"
                );
                System.out.println("*************************");
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    public boolean displaybyID(int id)  {
        boolean check = false;
        try {
            Connection con = Data.getCon();
            String query = "SELECT * FROM profiles WHERE id="+id;
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(query);

            while(rs.next()) {
                System.out.println(
                        "ID       ->" + rs.getInt(1)+ "\n"+
                                "Name     ->" + rs.getString(2)+ "\n"+
                                "Domain   ->" + rs.getString(3)+ "\n"+
                                "Address  ->" +rs.getString(4)+ "\n"
                );
                System.out.println("*************************");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return check;
    }

    public boolean delete(int de) {
        boolean check = false;
        try {
            Connection con = Data.getCon();
            String query = "DELETE FROM profiles WHERE id="+de;
            PreparedStatement p = con.prepareStatement(query);
            p.executeUpdate();
            check = true;

        } catch(Exception e) {
            System.out.println(e);
        }
        return check;
    }

    public boolean update(int id, String neww, int se, StudentProfile sp) {
        boolean check = false;
        try {
            if(se == 1 ) {
                Connection con = Data.getCon();
                String query = "UPDATE profiles SET domain=? WHERE id=?";
                PreparedStatement p =  con.prepareStatement(query);
                p.setString(1, neww);
                p.setInt(2, id);

                p.executeUpdate();
                check = true;
            } else if (se == 2) {
                Connection con = Data.getCon();
                String query = "UPDATE profiles SET address=? WHERE id=?";
                PreparedStatement p =  con.prepareStatement(query);
                p.setString(1, neww);
                p.setInt(2, id);

                p.executeUpdate();
                check = true;

            } else
                System.out.println("Invalid Choices");
        } catch (Exception e) {
            System.out.println(e);
        }
        return check;
    }
}

