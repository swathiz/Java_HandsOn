package strings;

public class string_stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st[] = {"a","b","c"}; // declaring and intilizing string
		
		StringBuilder sb = new StringBuilder();//creating string builder object
		
		for(int i=0;i<st.length;i++) {
			sb.append(st[i]+" ");
		//	System.out.println(sb);
		}
		
		System.out.println(sb);//printing stringbulder object

	}

}
