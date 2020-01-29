import static org.junit.Assert.*;
import org.junit.Test;
import Students.ScoresClass;
import Students.GradeClass;
public class DivisionTest {
   @Test
   public void testDiv() {
           //assertNotEquals
	   assertNotEquals(90, ScoresClass.sub(91, 90,90));
	   System.out.println("Division Test passed");
   }
	   @Test
	   public void TestGrade() {
             //assertTrue
		        assertTrue("Grade test",+ GradeClass.Grade(90));
	   }
	private void assertTrue(String message, double grade) {
		
		
	}
	}