package modifierspack.staticpack;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Utils {
	
	static double miniumAccountBalance = 10000;
	static int experice=19;
	
	public static String generateBrandNewEmailAddress() {
		return "arunmotoori"+System.currentTimeMillis()+"@email.com";
	}
	
	public static int generateRandomNumber() {
		Random random = new Random();
		return random.nextInt(100)+1;
	}
	
	public static String generateUniqueId() {
        return "ID" + System.currentTimeMillis();
    }
	
	public static String generateRandomPhoneNumber() {
        long number = ThreadLocalRandom.current()
                .nextLong(1_000_000_000L, 10_000_000_000L);

        return String.valueOf(number);
    }
	
	public static String generateRandomUsername() {
        return "user" + System.currentTimeMillis();
    }
	
	public static String generateRandomFirstName() {
        return "FirstName" + generateRandomNumber();
    }

    public static String generateRandomLastName() {
        return "LastName" + generateRandomNumber();
    }
	

}
