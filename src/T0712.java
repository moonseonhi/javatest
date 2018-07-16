import java.io.BufferedReader;
import java.io.FileReader;
class order{
	void menu()throws Exception{
	FileReader fReader = new FileReader("d:/order.txt");
	BufferedReader bReader = new BufferedReader(fReader);
	String str = null;
	while((str = bReader.readLine())!=null) {
		System.out.println(str);
	}
	bReader.close();
	fReader.close();
	}
}
public class T0712 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		FileReader fReader = new FileReader("d:/order.txt");
//		BufferedReader bReader = new BufferedReader(fReader);
//		String str = null;
//		while((str = bReader.readLine())!=null) {
//			System.out.println(str);
//		}
//		bReader.close();
//		fReader.close();
		order or = new order();
		or.menu();
	}

}
