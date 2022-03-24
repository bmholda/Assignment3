

public class CryptoManager {
	
	private static final char LOWER_BOUND = ' ';
	private static final char UPPER_BOUND = '_';
	private static final int RANGE = UPPER_BOUND - LOWER_BOUND + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_BOUND and UPPER_BOUND characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean stringInBounds (String text) {
		//throw new RuntimeException("method not implemented");
		 boolean flag = true;
		 for (int i = 0; i < text.length(); i++)
	       {
	           if (!(text.charAt(i)>= LOWER_BOUND && text.charAt(i) <= UPPER_BOUND))
	               flag = false;
	       }
	           return flag;
	}
	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String encryptCaesar(String text, int solution) {
		//throw new RuntimeException("method not implemented");
		String textA = "";
		   if (stringInBounds(text))
		   {
		       for (int i=0; i<text.length(); i++)
		       {
		           char charA = text.charAt(i);
		           int crypted = ((int)charA+solution);
		               while (crypted > UPPER_BOUND)
		               {
		            	   crypted -= RANGE;
		               }
		               	textA += (char)crypted;
		       }
		   }
		       return textA;
	}
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	public static String encryptBellaso(String text, String bell) {
		//throw new RuntimeException("method not implemented");
		String crypted = "";
		   int bella = bell.length();
		       for (int index = 0; index < text.length(); index++)
		       {
		           char thisChar = text.charAt(index);
		           int charInt = ((int)thisChar+(int)bell.charAt(index%bella));
		               while (charInt > (int)UPPER_BOUND)
		               {
		            	   charInt -= RANGE;
		               }
		               crypted += (char)charInt;
		       }
		       return crypted;
		
	}
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	public static String decryptCaesar(String text, int solve) {
		//throw new RuntimeException("method not implemented");
		String textA = "";
		   for (int index =0; index < text.length(); index++)
		   {
		       char charar = text.charAt(index);
		       int dcrypt = ((int)charar-solve);
		       while (dcrypt < LOWER_BOUND)
		       {
		    	   dcrypt += RANGE;
		       }
		       textA += (char)dcrypt;
		   }
		   return textA;
		
	}
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	public static String decryptBellaso(String text, String bell) {
		//throw new RuntimeException("method not implemented");
		String dtext = "";
		   int bellasoStrLength = bell.length();
		       for (int i = 0; i < text.length(); i ++)
		       {
		           char charchar = text.charAt(i);
		           int dtextA = ((int)charchar-(int)bell.charAt(i%bellasoStrLength));
		           while (dtextA < (int)LOWER_BOUND)
		           {
		        	   dtextA += RANGE;
		           }
		           dtext += (char)dtextA;
		       }
		       return dtext;
	}
}
