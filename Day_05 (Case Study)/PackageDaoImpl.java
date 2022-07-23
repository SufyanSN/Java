import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PackageDaoImpl implements PackageDao{
    public void calculateCost(Package p) {
        PreparedStatement ps = null;
        Connection conn = null;

        Scanner scanner = new Scanner(System.in);
        int number_of_days;
        double a,b,c,basic_fare,discount=0,package_cost;
        try {
            conn = DBHandler.getConnection();
            String query = "INSERT INTO package (package_id,source_place,destination_place,no_of_days,package_cost) VALUES (?, ?, ?, ?, ?)";
            ps = conn.prepareStatement(query);
            ps.setString(1,p.getPackage_id());
            ps.setString(2,p.getSource_place());
            ps.setString(3,p.getDestination_place());

            number_of_days=p.getNo_of_days();
            ps.setInt(4,number_of_days);

            System.out.println("Enter basis fare :");
            basic_fare = scanner.nextInt();

            if (number_of_days<=5){
                discount = 0;
            } else if (number_of_days>5 && number_of_days<=8) {
                discount = 0.03;
            } else if (number_of_days>8 && number_of_days<=10) {
                discount = 0.05;
            } else if (number_of_days>10) {
                discount = 0.07;
            }

            a=(basic_fare*number_of_days);
            b=a*discount;
            c= b*(12/100);
            package_cost = a-b+c;

            ps.setDouble(5,package_cost);

            int rows = ps.executeUpdate();
            System.out.println(rows + "-row inserted");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public List<Package> searchPackage(int price) {
        Scanner scanner = new Scanner(System.in);
        int trip_cost_limit = price;

        PreparedStatement ps = null;
        ResultSet rs = null;

        List<Package> list = new ArrayList<>();

        Package p = null;

        Connection conn = null;
        try {
            conn = DBHandler.getConnection();
            String query = "select * from package where package_cost<=?";
            ps = conn.prepareStatement(query);
            ps.setInt(1,trip_cost_limit);
            rs = ps.executeQuery();

            System.out.println("\n                  ******  Tour Packages Found  ******");
            while (rs.next()) {
                p = new Package();

                p.setPackage_id(rs.getString("package_id"));
                p.setSource_place(rs.getString("source_place"));
                p.setDestination_place(rs.getString("destination_place"));
                p.setNo_of_days(rs.getInt("no_of_days"));
                p.setPackage_cost(rs.getInt("package_cost"));

                list.add(p);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return list;
    }
}



