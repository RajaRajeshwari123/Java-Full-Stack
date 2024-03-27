package New_Project.assignment;

public class VowelConsoCount {
	    public static void main(String[] args) {
	        String input = "Hello";
	        String Vowel="aeiouAEIOU";
	        int VCount=0,CCount=0;
	        for(int j=0;j<input.length();j++) {
	        	int k=0;
	            for (int i = 0; i < Vowel.length(); i++) {
	        		if (Vowel.charAt(i)==input.charAt(j)) {
	        			k=1;
	        			VCount++;
	        			break;
	        		}
	            }
	            if(k==0)
	        		CCount++;
	    	}
	        System.out.println("Vowels Count: "+VCount+"\nConsonents Count: "+CCount);
	    }
	}


