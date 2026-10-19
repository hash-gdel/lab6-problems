package problem2;

public class Main {
    public static void main(String[] args){
        Customer customer = new Customer("Soukaina");
        Bank bank = new Bank("IMM");
        bank.addCustomer(customer);
        bank.addTransaction(customer,Double.valueOf(123));
        bank.addTransaction(customer,Double.valueOf(-12));
        bank.addTransaction(customer,Double.valueOf(37));
        System.out.println("Bank's name: "+bank.getName());
        bank.print(customer);

    }

}
