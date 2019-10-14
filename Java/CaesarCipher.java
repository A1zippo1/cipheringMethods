import java.util.Scanner;

public class CaesarCipher {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a text to cipher");
		String text = sc.nextLine();
		System.out.println("Enter now the key (number) to cipher the message");
		int key = sc.nextInt();
		System.out.println("Encrypted message with key " + key + ":");
		System.out.println(encrypt(text, key));

	}

	public static String encrypt(String text, int key) {
		char c;
		String encrypted = "";
		for (int i = 0; i < text.length(); ++i) {
			c = text.charAt(i);
			if (c >= 'a' && c <= 'z') {
				c = (char) (c + key);
				if (c > 'z') {
					c = (char) (c - 'z' + 'a' - 1);
				}
				encrypted += c;
			} else if (c >= 'A' && c <= 'Z') {
				c = (char) (c + key);
				if (c > 'Z') {
					c = (char) (c - 'Z' + 'A' - 1);
				}
				encrypted += c;
			} else {
				encrypted += c;
			}
		}
		return encrypted;
	}
}
