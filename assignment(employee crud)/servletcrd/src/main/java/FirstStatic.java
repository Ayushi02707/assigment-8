
public class FirstStatic 
{
static int empno=101;
static void display()
{
	System.out.println("this is a static method");
}
public static void main(String[] args) {
	System.out.println(empno);
	display();
	System.out.println(FirstStatic.empno);
	FirstStatic.display();
}
}
