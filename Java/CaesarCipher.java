import java.util.Scanner;

public class CaesarCipher {

	public static void main(String[] args) {
		String encryptedText;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a text to cipher");
		String text = sc.nextLine();
		System.out.println("Enter now the key (number) to cipher the message");
		int key = sc.nextInt();
		System.out.println("Encrypted message with key " + key + ":");
		encryptedText = encrypt(text, key, true);
		System.out.println(encryptedText);
		System.out.println("The original message was:");
		System.out.println(encrypt(encryptedText, key, false));
	}

	public static String encrypt(String text, int key, boolean encrypting) {
		char c;
		String encrypted = "";
		for (int i = 0; i < text.length(); ++i) {
			c = text.charAt(i);
			if (c >= 'a' && c <= 'z') {
				c = encrypting ? (char) (c + key) : (char) (c - key);
				if (c > 'z' && encrypting) {
					c = (char) (c - 'z' + 'a' - 1);
				} else if (c < 'a' && !encrypting) {
					c = (char) (c + 'z' - 'a' + 1);
				}
				encrypted += c;
			} else if (c >= 'A' && c <= 'Z') {
				c = encrypting ? (char) (c + key) : (char) (c - key);
				if (c > 'Z' && encrypting) {
					c = (char) (c - 'Z' + 'A' - 1);
				} else if (c < 'A' && !encrypting) {
					c = (char) (c + 'Z' - 'A' + 1);
				}
				encrypted += c;
			} else {
				encrypted += c;
			}
		}
		return encrypted;
	}
}
