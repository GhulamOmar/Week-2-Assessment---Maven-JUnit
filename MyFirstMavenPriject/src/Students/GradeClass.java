package Students;
import Students.ScoresClass;
public class GradeClass {
  public static void main(String[] args) {
	  ScoresClass myObj = new ScoresClass();
    
    myObj.setScore1(90);
    myObj.setScore2(90);
    myObj.setScore3(90);
    
    
   

    Double average= (double) (myObj.getScore1()+ myObj.getScore1()+ myObj.getScore3())/3;
    System.out.println(average);
  }
  
    public static double Grade(double average) {
    if (average <= 100 && average >= 90){
    	System.out.println( "A");
      	}
      	if (average <= 89 && average >=79){

    	 System.out.println("B");
      		}
      	if (average <= 78 && average >= 70){
    	 System.out.println("C");
      		}
      	if (average <= 69 && average >= 60){
      		System.out.println("D");
      		}
      		if (average <= 59){
      			System.out.println("F");
  			}
			return average;
		   }
   
//    private String message;
    public String printMessage(String message) {
	System.out.println(message);
		return message;

	}


}


