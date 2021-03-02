package array;

public class ArrayList {

	public static void main(String[] args) {
		ArrayList arrList = new ArrayList();
		// We can use any data type
		arrList.add(987654321);
		// Here i am passing next two values as "STM" just to show you that List allows duplicate values.. 
		// Set wont allow duplicate values.
		// Adding elements to the array list
		arrList.add("STM");
		arrList.add("STM");
		arrList.add(99.99);
		// To get all the values from the list
		System.out.println(arrList);
		// To get a value whose index is 1
		System.out.println(arrList.get(1));
	}

}
