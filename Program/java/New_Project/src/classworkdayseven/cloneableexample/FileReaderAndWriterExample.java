package classworkdayseven.cloneableexample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderAndWriterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fw;
		try {
			fw=new FileWriter("C:\\Users\\rajarajeshwari.r\\Documents\\New folder\\new1.txt");
			fw.write("Hello Everyone Good Morning");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(" caught ");
		}
		FileReader fr;
		try {
			 fr=new FileReader("C:\\\\Users\\\\rajarajeshwari.r\\\\Documents\\\\New folder\\\\new1.txt");
			 int n=0;
				while((n=fr.read())!=-1){ 
				System.out.println(n);}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(" caught ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(" caught ");
		}

	}

}
