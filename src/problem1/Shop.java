package problem1;

import java.util.ArrayList;
import java.util.Scanner;
public class Shop
{
    public static void main (String[] args)
    {
        ArrayList<Item> cart = new ArrayList();
        Item item;
        String itemName;
        double itemPrice;
        int quantity;
        Scanner scan = new Scanner(System.in);
        String keepShopping = "y";
        do
        {
            System.out.print ("Enter the name of the item: ");
            itemName = scan.nextLine();
            System.out.print ("Enter the unit price: ");
            itemPrice = scan.nextDouble();
            System.out.print ("Enter the quantity: ");
            quantity = scan.nextInt();
            scan.nextLine();

            // *** create a new item and add it to the cart
            Item new_item = new Item(itemName,itemPrice,quantity);
            cart.add(new_item);
            // *** print the contents of the cart object using println
            double sum =0;
            for(Item i : cart){
                System.out.println("Cart object name : "+i.getName()+", price: "+i.getPrice()+", quantity: "+ i.getQuantity());
                sum+=i.getPrice();
            }
            System.out.println("Total price: "+sum);

            System.out.print ("Continue shopping (y/n)? ");
            keepShopping = scan.nextLine();
        }
        while (keepShopping.equals("y"));
    }
}
