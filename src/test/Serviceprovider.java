package test;
interface calll{
	
	void m1();
	void m2();
}
abstract class Serviceprovider   implements calll
{
public void m1()
{
}
}
class SubServiceProvider extends Serviceprovider 
{
public void m2()
{
}

}
	
