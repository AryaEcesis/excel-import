package myproject;
import org.apache.commons.lang3.StringUtils;
public class FirstCode {
	public static void main(String[] args) {
        String message = "Hello, Maven!";
        String reversedMessage = StringUtils.reverse(message);

        System.out.println("Original Message: " + message);
        System.out.println("Reversed Message: " + reversedMessage);
	}
}
