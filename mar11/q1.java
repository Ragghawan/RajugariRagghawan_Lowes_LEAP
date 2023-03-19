package mar11;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

class product{
	int productId, stock, quantity,unitPrice;
	String productName;
	void setDetails(String Name,int Id,int price,int sc,int quan){
		productName = Name;
		productId = Id;
		unitPrice = price;
		stock = sc;
		quantity = quan;
	}
}
public class q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.println("Enter the number of products");
		int n = sc.nextInt();
		product[] array = new product[n];
		for (int i = 0;i < n;i++) {
			int productId, stock, quantity,unitPrice;
			String productName;
			array[i] = new product();
			System.out.println("Enter product name:");
			productName = sc.next();
			productId = r.nextInt(1000);
			System.out.println("Enter product price:");
			unitPrice = sc.nextInt();
			System.out.println("Enter stock left:");
			stock = sc.nextInt();
			System.out.println("Enter product quantity:");
			quantity = sc.nextInt();
			array[i].setDetails(productName,productId,unitPrice,stock,quantity);
		}
		sc.close();
		Date d = new Date();
		System.out.println("\n\n"+"Date : "+d+"\n");
		for(int i = 0;i < n;i++) {
			System.out.println("Product name : " + array[i].productName);
			if(array[i].stock < array[i].quantity) {
				System.out.println("Stock insufficient !");
			}else {
				int price = array[i].quantity * array[i].unitPrice;
				System.out.println("Quantity :"+array[i].quantity);
				System.out.println("Unit price :"+array[i].unitPrice);
				System.out.println("Price : "+price);
			}
			System.out.print("\n");
		}
	}
}
