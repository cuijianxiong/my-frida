import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
import java.util.UUID;
import java.io.UnsupportedEncodingException;

public class Test{

	public static byte[] encode(String str, String str2) {
        Key secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
        Cipher str3 = Cipher.getInstance("AES");
        str3.init(1, secretKeySpec);
        return str3.doFinal(str.getBytes("UTF-8"));
    }


	
	public static void main(String args[]){
		String str = "18842443700";
		String str2 = "31490b49e0888ff2";
		byte[] a = encode(str, str2);
		//String b = Base64.encodeToString(a, null).trim();
		System.out.print(a);

}}