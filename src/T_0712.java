import java.io.BufferedReader;
import java.io.FileReader;

class mu{
	void menu()throws Exception{
	FileReader fReader = new FileReader("d:/order.txt");
	BufferedReader bReader = new BufferedReader(fReader);
	String str = null;
	while((str = bReader.readLine())!=null) {
		String  as[] = str.split(",");
			System.out.println(as[1]);
	}
	bReader.close();
	fReader.close();
	}
}
public class T_0712 {

	public static void main(String[] args) throws Exception {
		
		mu order = new mu();
		order.menu();
	}

}