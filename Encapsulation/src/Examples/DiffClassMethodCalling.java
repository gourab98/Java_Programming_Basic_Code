package Examples;

/**
 *
 * @author gourab
 */
class Student
{
  int roll;
  String name;
  
  public void setRoll(int r)
  {
      int rollno = r;
  }
  public int getRoll()
  {
      int rollno = 0;
     return rollno;
  }
}
public class DiffClassMethodCalling {
    public static void main(String [] arug)
    {
      Student s1=new Student();
      s1.setRoll(2017831004);
      s1.name="Gourab";
      
      System.out.print(s1.getRoll());
    }
}
