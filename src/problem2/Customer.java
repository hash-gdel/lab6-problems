package problem2;
import java.util.List;
import java.util.ArrayList;
public class Customer {
    private String name;
    private List<Double> transactions = new ArrayList<>();
    public Customer(String name){
        this.name = name ;
        this.transactions = new ArrayList<>() ;
    }
    public String getName() {
        return this.name;
    }
    public List<Double> getTransactions() {
        return this.transactions;
    }
}
