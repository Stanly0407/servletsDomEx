package servEx.dao;

import servEx.model.User;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static servEx.dao.CommonConnect.*;

public class UserMain {

    private boolean checkUser(String emailOut) {
        try (PreparedStatement prStatement = getPrepStat("SELECT * FROM users WHERE email = ?")) {
            prStatement.setString(1, emailOut);
            ResultSet resultSet = prStatement.executeQuery();
            if (resultSet.next()) {
                return true;
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return false;
    }

    static void registrationUser(String email, String password, String lastname, String name, String patronym,
                                 int age, String cellPhone, String homePhone, int house, int flat) {
        try (PreparedStatement preparedStatement = getPrepStat(
                "INSERT INTO users value (null, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)")) {
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            preparedStatement.setString(3, lastname);
            preparedStatement.setString(4, name);
            preparedStatement.setString(5, patronym);
            preparedStatement.setInt(6, age);
            preparedStatement.setString(7, cellPhone);
            preparedStatement.setString(8, homePhone);
            preparedStatement.setInt(9, house);
            preparedStatement.setInt(10, flat);
            preparedStatement.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }


    private static List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        try {
            ResultSet resultSet = getStat().executeQuery("SELECT * FROM users");
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String email = resultSet.getString(2);
                String password = resultSet.getString(3);
                String lastname = resultSet.getString(4);
                String name = resultSet.getString(5);
                String patronym = resultSet.getString(6);
                Date birthdate = resultSet.getDate(7);
                String cellPhone = resultSet.getString(8);
                String homePhone = resultSet.getString(9);
                int house = resultSet.getInt(10);
                int flat = resultSet.getInt(11);
                User user = new User(id, email, password, lastname, name, patronym,
                        birthdate, cellPhone, homePhone, house, flat);
                users.add(user);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return users;

    }

    public static void main(String[] args) {
        List<User> userss = getAllUsers();


//        registrationUser("olpol@mail.ru", "123", "Полякова", "Ольга", "Валерьевна",
//                56, "+375336958763", "+375225486838", 5, 87);

        for (User u : userss) {
            System.out.println("1    1  " + u);
        }

    }


}
