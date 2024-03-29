package classworkdayseven.cloneableexample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file=new File("C:\\Users\\rajarajeshwari.r\\Documents\\New folder\\new1.txt");
		FileOutputStream fos = null;
		try {
			String word="Good Morning";
			byte[] dataToBeWritten=word.getBytes();
			fos=new FileOutputStream(file);
			fos.write(dataToBeWritten);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("File doesn't exists");
		}
		catch(IOException e) {
			System.out.println("Write Operation failed");
			
		}
		finally {
			try {
				fos.close();
			}catch(IOException e) {
				System.out.println("Unable to close the file output stream");
			}
		}
	}

}
