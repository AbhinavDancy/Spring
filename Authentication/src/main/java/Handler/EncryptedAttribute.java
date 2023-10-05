package Handler;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncryptedAttribute
{
        public static String encryptPassword(String password) {
            try {
                MessageDigest digest = MessageDigest.getInstance("SHA-256");
                byte[] hashedBytes = digest.digest(password.getBytes());

                StringBuilder stringBuilder = new StringBuilder();
                for (byte hashedByte : hashedBytes) {
                    stringBuilder.append(Integer.toString((hashedByte & 0xff) + 0x100, 16).substring(1));
                }
                return stringBuilder.toString();
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
            return null;
        }


    }

