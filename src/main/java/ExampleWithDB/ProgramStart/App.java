package ExampleWithDB.ProgramStart;

import ExampleWithDB.DAO.MagazinesDAO;
import ExampleWithDB.DAO.PaymentsDAO;
import ExampleWithDB.DAO.SubscribesDAO;
import ExampleWithDB.DAO.UsersDAO;
import ExampleWithDB.shop.Magazines;
import ExampleWithDB.shop.Payments;
import ExampleWithDB.shop.Subscribes;
import ExampleWithDB.shop.Users;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class App {

    public static void main(String[] args) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException, ParseException {
        UsersDAO usersDAO = new UsersDAO();
        Users users = new Users("Mark", "Wazowski", "wazowski@gmail.com", "net123");
        usersDAO.readAll().forEach(System.out::println);





    }
}
