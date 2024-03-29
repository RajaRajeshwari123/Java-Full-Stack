package classworkdayseven.cloneableexample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\rajarajeshwari.r\\Documents\\New folder\\new1.txt");
		FileInputStream fis;
		try {
			fis=new FileInputStream(file);
			int n=0;
			while((n=fis.read())!=-1){ 
			System.out.println(n);}
		}catch(FileNotFoundException e) {
			System.out.println("File doesn't exists");
		}
		catch(IOException e) {
			System.out.println("IO exception while reading the content");
		}
		

	}

}

