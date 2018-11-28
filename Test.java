public class Test{
	public static void main(String args[]){
		String APP_KEY = "92571fb8d37a4d1d31490b49e0888ff2";
		String substring = APP_KEY.substring(APP_KEY.length() - 16, APP_KEY.length());
		System.out.print(substring);
	}
}