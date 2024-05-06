class ic
{
int length, width;
void getdata(int x,int y)
{
length=x;
width=y;
}
int rect()
{
int area;
area=length*width;
return(area);
}
}
class praveen
{
public static void main(String args[])
{
int area1,area2;
ic rect1=new ic();
ic rect2=new ic();
rect1.length=15;
rect1.width=20;
area1=rect1.length*rect1.width;
rect2.getdata(10,33);
area2=rect2.rect();
System.out.println("area1"+area1);
System.out.println("area2"+area2);
}
}
