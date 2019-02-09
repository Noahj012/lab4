
public class ZooTest
{
	private final int EXPEXTED_CAPACITY = 4;
	private final double EXPEXTED_HEIGHT = 1132;
	private final String EXPEXTED_TOSTRING = "These animals live in the zoo: \nSonic, a Blue-colored animal. 25.0 pounds, 36.0 inches\n"
			+ "Shrek, a Green-colored animal. 325.0 pounds, 96.0 inches\nClifford, a Red-colored animal. 825.0 pounds, 1000.0 inches";
	
	public void getTotalHeightTest() throws AssertException
	{
		Zoo zoo = new Zoo(2);
		
		zoo.addAnimal(new Animal("Blue", "Sonic", 25, 36));
		zoo.addAnimal(new Animal("Green", "Shrek", 325, 96));
		zoo.addAnimal(new Animal("Red", "Clifford", 825, 1000));
		
		Assert.assertEquals(EXPEXTED_HEIGHT, zoo.getTotalHeight());
		
	}
	
	public void getCapacityTest() throws AssertException
	{
		Zoo zoo = new Zoo(2);
		
		zoo.addAnimal(new Animal("Blue", "Sonic", 25, 36));
		zoo.addAnimal(new Animal("Green", "Shrek", 325, 96));
		zoo.addAnimal(new Animal("Red", "Clifford", 825, 1000));
		
		Assert.assertEquals(EXPEXTED_CAPACITY, zoo.getCapacity());
		
	}
	
	public void toStringTest() throws AssertException
	{
		Zoo zoo = new Zoo(2);
		
		zoo.addAnimal(new Animal("Blue", "Sonic", 25, 36));
		zoo.addAnimal(new Animal("Green", "Shrek", 325, 96));
		zoo.addAnimal(new Animal("Red", "Clifford", 825, 1000));
		
		String result = "";
        
       // add each Animal toString in the array to the result string
        result += zoo.toString();
        
		
		Assert.assertEquals(result, zoo.toString());
	}
	

}