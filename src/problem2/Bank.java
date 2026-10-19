package problem2;
import java.util.List;
import java.util.ArrayList;
public class Bank {
    private String name;
    private List<Customer> customers = new ArrayList<>();
public Bank(String name){
    this.name = name;
    this.customers = new ArrayList<>();
}
    public String getName() {
        return this.name;
    }
    public List<Customer> getCustomers() {
        return this.customers;
    }
    public void addCustomer(Customer customer){
        if(! this.customers.contains(customer)){
            customers.add(customer);
        }
    }
    public void addTransaction(Customer customer, Double transaction){
        if (! this.customers.contains(customer)) throw new IllegalArgumentException("The customer doesn't exist in the database");
        customer.getTransactions().add(transaction);
    }
    public void print(Customer customer){
    System.out.println("Customer name: "+customer.getName());
    System.out.println("Customer transactions: ");
    for(Double transaction : customer.getTransactions()){
        System.out.print(transaction.doubleValue()+"  ");
    }
    }
}
