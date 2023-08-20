package my.home.programming5.task2;

/*Создать класс Payment с внутренним классом, с помощью объектов которого можно 
сформировать покупку из нескольких товаров.
*/
public class Main {

	public static void main(String[] args) {
		
		Payment payment = new Payment();
		payment.addProduct("onion", 1.5);
		payment.addProduct("carrot", 1.3);
		payment.addProduct("bread", 0.8);
		payment.addProduct("butter", 5.4);
		

	}

}
