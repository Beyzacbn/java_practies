import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        Customer engin= new Customer(5,"Engin","dEDS");

        customers.add(engin);
        customers.add(new Customer(1,"Beyza","abc"));
        customers.add(new Customer(2,"Uğur","bcn"));
        customers.add(new Customer(3,"Erkan","nmc"));

        customers.remove(new Customer(5,"Engin","dEDS"));

        for (Customer customer:customers){
            System.out.println(customer.firstName);
        }

    }
}