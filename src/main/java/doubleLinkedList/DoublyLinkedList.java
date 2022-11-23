package doubleLinkedList;

public class DoublyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleImplementation db1 = new DoubleImplementation();

		db1.add(1); // 1 2 3
		db1.add(2);
		db1.add(3);
		db1.add(3);
		db1.add(3);
		db1.add(3);
		
		db1.addAll(new int[] {88, 99, 198, 908});
		
		db1.removeAll1(3);
		db1.printAllNode(db1.head);
		System.out.println(" ");
		//db1.printAllNodeReverse(db1.tail);
		
	}

}
