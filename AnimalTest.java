/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class AnimalTest
{
	private final String COLOR = "Red";
	private final String NAME = "Betsy";
	private final String TO_STRING = "Betsy, a Red-colored animal. 10.0 pounds, 185.0 inches\n";
	private final double HEIGHT = 10;
	private final double WEIGHT = 185;

    /**
     * Test the empty Animal constructor and the getters
     */
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }

    // TODO: test full constructor, getters, and toString
    
    public void fullContructorTest() throws AssertException
    {
    	// declares cow animal named Betsy
    	Animal ani = new Animal(COLOR, NAME, WEIGHT, HEIGHT);
    	
    	// Tests fully declared animal object
    	Assert.assertEquals(COLOR, ani.getColor());
        Assert.assertEquals(NAME, ani.getName());
        Assert.assertEquals(WEIGHT, ani.getWeight(), 0.01);
        Assert.assertEquals(HEIGHT, ani.getHeight(), 0.01);
        
    }
    
    public void getColorTest() throws AssertException
    {
    	Animal ani = new Animal(COLOR, "", 0, 0);
    	
    	Assert.assertEquals(COLOR, ani.getColor());
    }
    
    public void getNameTest() throws AssertException
    {
    	Animal ani = new Animal("", NAME, 0, 0);
    	
    	Assert.assertEquals(NAME, ani.getName());
    }
    
    public void getHeightTest() throws AssertException
    {
    	Animal ani = new Animal("", "", 0, HEIGHT);
    	
    	Assert.assertEquals(HEIGHT, ani.getHeight());
    }
    
    public void getWeightTest() throws AssertException
    {
    	Animal ani = new Animal("", "", WEIGHT, 0);
    	
    	Assert.assertEquals(WEIGHT, ani.getWeight());
    }
    
    
    public void toStringTest() throws AssertException
    {
    	Animal ani = new Animal(COLOR, NAME, HEIGHT, WEIGHT);
    	
    	Assert.assertEquals(TO_STRING, ani.toString());
    }
    
    
}

