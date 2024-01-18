import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) throws SQLException {

    }

    public static void deleteData() throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet;
        try {
            connection = helper.getConnection();
            String sql = "delete from city where id=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,4082);
            int result = preparedStatement.executeUpdate();
            System.out.println("kayıt silindi");


        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            preparedStatement.close();
            connection.close();
        }
    }
    public static void updateData() throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet;
        try {
            connection = helper.getConnection();
            String sql = "update city set population=8000 where id=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,4082);
            int result = preparedStatement.executeUpdate();
            System.out.println("kayıt güncellendi");


        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            preparedStatement.close();
            connection.close();
        }
    }
    public static void insertData() throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet;
        try {
            connection = helper.getConnection();
            String sql = "insert into city (Name,CountryCode,District,Population) values (?,?,?,?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"Düzce2");
            preparedStatement.setString(2,"TUR");
            preparedStatement.setString(3,"Turkey");
            preparedStatement.setInt(4,70000);

            int result = preparedStatement.executeUpdate();
            System.out.println("kayıt eklendi");


        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            preparedStatement.close();
            connection.close();
        }

    }

    public static void selectDemo() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        try {
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select Name,CountryCode from country");
            ArrayList<Country> countries = new ArrayList<Country>();
            while (resultSet.next()) {
                countries.add(new Country(
                        resultSet.getString("Code"),
                        resultSet.getString("Name"),
                        resultSet.getString("Continent"),
                        resultSet.getString("Region")));
            }
            System.out.println(countries.size());
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            connection.close();
        }

    }
}