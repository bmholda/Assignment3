

public class CryptoManager_GFA_Test {

	public static void main(String[] args) {

		String string1 = "\"THIS TEST SHOULD SUCCEED\"";

		boolean flag = CryptoManager.stringInBounds(string1);
		System.out.println(string1+" in bounds? "+flag);
	}
}
