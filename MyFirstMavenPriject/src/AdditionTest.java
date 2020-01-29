import static org.junit.Assert.*;
import org.junit.Test;
 import Students.ScoresClass;
public class AdditionTest {
   @Test
   public void testAddPass() {
	// asserEquals
      assertEquals( 210, ScoresClass.add(60, 70,80));
      System.out.println("The addition test passed");
   }
   @Test
   public void testAddFail() {
      // assertNotEquals
      assertNotEquals(0, ScoresClass.add(1, 2,3));
   }
}


 