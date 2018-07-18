import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JavaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaclass","root","moon32399");
			System.out.println("Success connect Mysql server!");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from orderMenu");
			printData(rs,"tableNum","orderedMenu","price","orderedNumber");
			rs = stmt.executeQuery("tableNum,orderedMenu,price,orderedNumber from orderedMenu where tableNum=1");
			printData(rs,"tableNum","orderedMenu","price","orderedNumber");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	private static void printData(ResultSet rs, String col1, String col2, String col3, String col4)throws SQLException {
		// TODO Auto-generated method stub
		while(rs.next()) {
			int tableNum = rs.getInt(col1);
			String menu = rs.getString(col2);
			int price = rs.getInt(col3);
			int orderedNumber = rs.getInt(col4);
			System.out.printf("%8s %s \t %12d %s%n",tableNum,menu,price,orderedNumber);
		}
	}

	

}
