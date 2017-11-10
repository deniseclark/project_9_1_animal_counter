public class AnimalCounterApp {

	public static void main(String[] args) {

		System.out.println("**********************************");
		System.out.println("*** Animal Counter Application ***");
		System.out.println("**********************************");

		// ***************************************************
		// ***1. Count an Alligator 3 Times (not Clonable) ***
		// ***************************************************
		System.out.println("\nCounting Alligators...");
		Alligator alligator = new Alligator();
		alligator.resetCount();
		count(alligator, 3);

		// **************************************************
		// ***2a. Count a Sheep 2 Times (named "Blackie") ***
		// **************************************************
		System.out.println("\nCounting Sheep...");
		Sheep sheep = new Sheep("Blackie");
		sheep.resetCount();
		count(sheep, 2);

		// ***************************************************
		// ***2b. Clone the Sheep - Change the Name from ***
		// *** "Blackie" to "Dolly" and Count the Sheep ***
		// *** 3 Times ***
		// ***************************************************
		Sheep sheepClone = sheep;
		sheepClone.resetCount();
		sheepClone.setName("Dolly");
		count(sheepClone, 3);

		// *********************************************************
		// ***2c. Count the First Sheep ("Blackie") Again 1 Time ***
		// *********************************************************
		sheep.resetCount();
		sheep.setName("Blackie");
		count(sheep, 1);
	} 

	// ******************************************************
	// *** Reset the Count; Begin Counting by Calling the ***
	// *** getCountString() method and Increment Count    ***
	// *** Each time                                      ***
	// ******************************************************
	public static void count(Countable c, int maxCount) {
		// System.out.println("Class is " + c.getClass());
		System.out.println();
		for (int i = 1; i <= maxCount; i++) {
			c.incrementCount();
			System.out.println(c.getCountString());
		}
	} 

}
