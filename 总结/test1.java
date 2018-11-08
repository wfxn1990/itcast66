public class test1{
	public static void main(String[] args){
		Liu();
	}
	public static void Liu(){
		int a = 10,b=20,c=30;
		int x = (a>b?a:b);
		String str1 =(a>b?"a":"b");
		String str2 =(c>x?"c":str1);
		System.out.println(str2);
		
	}
}