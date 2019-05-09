import java.io.File;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, SQLException {

        File file = new File("C:\\Users\\Мария\\IdeaProjects\\Cashbox\\src\\Resources\\input.txt");
        Scanner scanner = new Scanner(file);

        ArrayList<String> codes = new ArrayList<>();
        while (scanner.hasNextLine()){
            codes.add(scanner.nextLine());
        }

        LinkedList<Product> basket = new LinkedList<>();
        DBConnection conn = new DBConnection();
        Statement statement = conn.getConnection().createStatement();

        for (String s: codes){
            ResultSet res = statement.executeQuery("SELECT * FROM products WHERE code = " + s);
            res.next();
            basket.add(new Product(res.getString("name"), res.getString("code"), res.getInt("count"), res.getInt("price")));
        }

        Iterator iterator = basket.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}


//            statement.execute("INSERT INTO products (name, code, count, price) VALUES ('Iphone', '2323', 20, 1700)");
//            statement.executeUpdate("UPDATE products SET name='Iphone X', price = 4500 where code = '2323'");
//
//            statement.addBatch("INSERT INTO products (name, code, count, price) VALUES ('Nike', '005', 114, 32)");
//            statement.addBatch("INSERT INTO products (name, code, count, price) VALUES ('Book', '006', 15, 100)");
//            statement.addBatch("INSERT INTO products (name, code, count, price) VALUES ('Banana', '007', 30, 62)");
//
//            statement.executeBatch();
//            statement.clearBatch();
