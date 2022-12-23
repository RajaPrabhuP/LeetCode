package java8;

public class LearnLambda {
	
	public static void main(String[] args) {
		Payment pay = (str) ->{
			System.out.println("Make Payment.");
		};
		
		pay.makePayment("");
		System.out.println();
		
		OrderNow order = () ->{
			int a = 5;
			int b = 10;
			return a+b;
		};
		
		System.out.println(order.cancelOrder());
	}
	
	@FunctionalInterface
	interface Payment{
		public void makePayment(String str);
	}
	
	@FunctionalInterface
	interface OrderNow{
		public int cancelOrder();
	}
}
