package classworkdayseven.workingwithFiles;


import java.io.*; 

public class  Assign1 {
 
  public static void main(String[] args) {
		
	  // TODO Auto-generated method stub
		int flag=0;
		String filename="new1.txt";
		File directory =new File("C:\\Users\\rajarajeshwari.r\\Documents\\New folder");
 
	   String[] directorylist=directory.list();
		
		for(int i=0;i<directorylist.length;i++) {
			
		if(directorylist[i].equals(filename)) {
				flag=1;
				
			}
			else {
				flag=0;
			}
			
		}
		
		if(flag==1) {
			System.out.println("exists in directory");
		}
		else {
			System.out.println("not exists in directory");
		}
		
	}
 
}