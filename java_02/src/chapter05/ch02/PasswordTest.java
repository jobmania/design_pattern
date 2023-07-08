package chapter05.ch02;

public class PasswordTest {

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws PasswordException{
        if( password == null){
            throw new PasswordException("비밀번호는 null일수 없습니다.");
        }
        else if( password.length() < 5){
            throw new PasswordException("비밀번호는 5자 이상 이어야 합니다.");
        }
        else  if (password.matches("[a-zA-Z]+")){
            throw new PasswordException("비밀번호는 숫자나 특수문자를포함해야합니다.");
        }

        this.password = password;
    }

    private String password;
    public static void main(String[] args) {
        PasswordTest test = new PasswordTest();
        String password = null;
        try {
            test.setPassword(password);
            System.out.println("no error!");
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }

        password = "abcd";
        try {
            test.setPassword(password);
            System.out.println("no error2!");
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }

        password = "abcde";
        try {
            test.setPassword(password);
            System.out.println("no error3!");
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }

        password = "abcd11!!";


        try {
            test.setPassword(password);
            System.out.println("no error4!");
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}
