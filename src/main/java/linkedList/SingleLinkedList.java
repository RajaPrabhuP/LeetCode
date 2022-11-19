package linkedList;

public class SingleLinkedList {

	
	public static void main(String[] args) {
	
		SingleImplementation sl1 = new SingleImplementation();
		sl1.add(1);
		sl1.add(2);
		sl1.add(3);
		sl1.add(4);
		sl1.add(5);
		sl1.add(6);
		sl1.remove(5);
		//sl1.removeFirst();
		System.out.println(sl1.size());
		//sl1.set(0, 55);
//		sl1.set(1, 56);
//		sl1.set(2, 57);
//		sl1.set(3, 58);
//		sl1.set(4, 59);
	//	sl1.set(5, 60);
//		sl1.add(3);
//		System.out.println(sl1.size());
//		sl1.removeFirst();
//		System.out.println(sl1.size());
		
		System.out.println(sl1.get(0));
		System.out.println(sl1.get(1));
		System.out.println(sl1.get(2));
		System.out.println(sl1.get(3));
		System.out.println(sl1.get(4));
		System.out.println(sl1.get(5));
		
		
	}

}
