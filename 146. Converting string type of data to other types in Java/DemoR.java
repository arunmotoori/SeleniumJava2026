package stringspack;

public class DemoR {

	public static void main(String[] args) {
		
		String str = "5";
		
		int a = Integer.parseInt(str);
		System.out.println(a+1);
		
		Integer b = Integer.valueOf(str);
		System.out.println(b+1);
		
		String str2 = "ABC";
		
		//int c = Integer.parseInt(str2);
		//System.out.println(c); //Error-Output
		
		//Byte.parseByte(str);
		//Byte.valueOf(str);
		//Short.parseShort(str2)
		//Short.valueOf(str2);
		//Long.parseLong(str2);
		//Long.valueOf(str2);
		//Float.parseFloat(str2);
		//Float.valueOf(str2);
		//Double.parseDouble(str2);
		//Double.valueOf(str2);
		
		char d = str2.charAt(1);
		System.out.println(d);
		
		//Boolean.parseBoolean(str2);
		//Boolean.valueOf(str2);

	}

}
