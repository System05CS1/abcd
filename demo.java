import java.lang.*;
class employee
{
int empno;
String empname;
String desig;
int salary;
employee()
{
empno=1;
empname="praveen";
desig="55";
salary=40;
}
employee(int eno,String n,String d,int sal)
{
empno=eno;
empname=n;
desig=d;
salary=sal;
}
employee(employee e)
{
empno=e.empno;
empname=e.empname;
desig=e.desig;
salary=e.salary;
}
void display()
{
System.out.println("employee no"+empno);
System.out.println("employee no"+empname);
System.out.println("employee no"+desig);
System.out.println("employee no"+salary);
}
}
class demo
{
public static void main(String args[])
{
employee e1=new employee();
e1.display();
employee e2=new employee(2,"gb","dfb",6600);
e2.display();
employee e3=new employee(2,"gb","dfb",6600);
e3.display();
}
}

