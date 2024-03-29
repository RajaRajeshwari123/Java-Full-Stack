package classworkdayseven.cloneableexample;


	import java.io.BufferedWriter;
	import java.io.File;
	import java.io.FileWriter;
	import java.io.IOException;

	public class AppendInAFileExample {

		public static void main(String[] args) {
		 	try {
				//String data = "It's interesting to learn IO";
		 		String data = "\\n Oh no another stuff ... I hate IO !!!";
				String filePath = "C:\\Users\\rajarajeshwari.r\\Documents\\New folder\\new1.txt";
				File file = new File(filePath);
				if (!file.exists()) {
					boolean flag = file.createNewFile();
					if(flag) {
						System.out.println("New file created");
					}

				}
				FileWriter fw= new FileWriter(file,true);
				//FileWriter fw= new FileWriter(file,false); // it will override as second parameter append is false
				BufferedWriter buffWriter = new BufferedWriter(fw);
				buffWriter.write(data);
				buffWriter.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}


