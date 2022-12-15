package thuc_hanh.ValidateAccount;

public class AccountExampleTest {
    public static AccountExample accountExample = new AccountExample();
    public static final String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456","abcdefgh" };
    public static final String[] invalidAccount = new String[] { ".@", "12345", "1234_", "abcde" };

    public static void main(String[] args) {
        for (String account : validAccount){
            boolean isvalid = accountExample.validate(account);
            System.out.println("Account is " + account +" is valid: "+ isvalid);
        }for (String account : invalidAccount){
            boolean isvalid = accountExample.validate(account);
            System.out.println("Account is " + account +" is valid: "+ isvalid);
        }
    }

}
