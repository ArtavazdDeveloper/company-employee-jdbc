import db.DBConnectionProvider;
import model.Company;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CompanyEmployeeMain {

private static Scanner scanner = new Scanner(System.in);
private  static Connection connection = DBConnectionProvider.getInstance().getConnection();
    public static void main(String[] args) {
        System.out.println("Please input company name,country");
         String companyStr = scanner.nextLine();
         String[] companyData = companyStr.split(",");
         Company company = new Company();
         company.setName(companyData[0]);
         company.setCountry(companyData[1]);
         getSaveCompanyToDB(company);
    }

    private static void getSaveCompanyToDB(Company company) {
        try {
            Statement statement = connection.createStatement();
            statement.execute("INSERT INTO company(name,country) " +
                    "VALUES ('"+ company.getName()+"', '"+company.getCountry()+"')");
            System.out.println("Company inserted into DB");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
