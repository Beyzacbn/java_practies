
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // interfacelerde de abstractlar gibi new yapılmaz.
        // birden fazla implemente edilebilir
        // referans tutucu

        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        //customerManager.customerDal= new MySqlCustomerDal(); // constructor kullanmadan önce
        customerManager.add();



    }
}