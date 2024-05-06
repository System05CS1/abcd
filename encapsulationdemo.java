 public class encapsulationdemo
{
private int ssn;
private String empname;
private int empage;
public int getempssn()
{
return ssn;
}
public String getempname()
{
return empname;
}
public int getempage()
{
return empage;
}
public void setempage(int newvalue)
{
empage=newvalue;
}
public void setempname(String newvalue)
{
empname=newvalue;
}
public void setempssn(int newvalue)
{
ssn=newvalue;
}
}
public class encapstest
{
public static void main(String args[])
{
encapsulationdemo obj=new encapsulationdemo();
obj.setempname("mario");
obj.setempage(32);
obj.setempssn(112233);
System.out.println("employe name:"+obj.getempname());
System.out.println("employee ssn:"+obj.getempssn());
System.out.println("employee age:"+obj.getempage());
}
}
