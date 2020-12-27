package servEx.dao;

import servEx.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserMain {

    static final String URL = "jdbc:mysql://localhost:3306/belhard";
    static final String USERNAME = "root";
    static final String PASSWORD = "503911";

    public boolean checkUser(String emailOut) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
                String sql = "SELECT * FROM user WHERE email=?";
                try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                    preparedStatement.setString(1, emailOut);
                    ResultSet resultSet = preparedStatement.executeQuery();
                    if (resultSet.next()) {
                        return true;
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return false;
    }

    public void addUser(String name, String emailOut, String password) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
                String sql = "INSERT INTO user value (null, ?, ?, ?)";
                try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                    preparedStatement.setString(1, name);
                    preparedStatement.setString(2, emailOut);
                    preparedStatement.setString(3, password);
                    preparedStatement.executeUpdate();
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }


    public static List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {

                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM user");
                while (resultSet.next()) {
                    int id = resultSet.getInt(1);
                    String email = resultSet.getString(2);
                    String password = resultSet.getString(3);
                    String lastname = resultSet.getString(4);
                    String name = resultSet.getString(5);
                    String patronym = resultSet.getString(6);
                    int age = resultSet.getInt(7);
                    String cellPhone = resultSet.getString(3);
                    String homePhone = resultSet.getString(3);
                    int house = resultSet.getInt(7);
                    int flat = resultSet.getInt(7);
                    User user = new User(id, email, password, lastname, name, patronym,
                            age, cellPhone, homePhone, house, flat);
                    users.add(user);
                    System.out.println(users);
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return users;

    }
}
