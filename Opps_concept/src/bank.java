
class Account{
    public String name;
    protected String email;
    private String password;
    //getter & setter

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }
}
public class bank {
    public static void main(String args[]){
        Account account1 = new Account();
        account1.name="Rishi";
        account1.email="rishi@gmail.com";
        account1.setPassword("abcd");
        System.out.println(account1.getPassword());
    }
}
