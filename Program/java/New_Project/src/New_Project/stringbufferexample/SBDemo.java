package New_Project.stringbufferexample;

public class SBDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		sb.append("Shubodhayam");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.insert(11, " ");
		System.out.println(sb);
		sb.insert(0,"Roshika ");
		System.out.println(sb);
		sb.delete(3, 12);
		System.out.println(sb);
		
		

	}

}
