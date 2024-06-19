//polymorphism-method overloading and method overriding
package mypack1;
class Base
{
	int i;
	int j;
	void input(int i, int j)
	{
		this.i = i;
		this.j = j;
	}
	void display()
	{
		System.out.println("i="+i+" "+"j="+j);
	}
}
class Derived extends Base
{
	int k;
	void input(int k)//overloaded method
	{
		this.k =k;
		}
	void display()//overriden method
	{
		super.display();
		System.out.println("k="+k);
	}
	
}

public class InheritanceDemo2 {

	public static void main(String[] args) {
		Base b = new Base();
		b.input(10,20);
		b.display();
		Derived d = new Derived();
		d.input(30,40);
		d.display();
		d.input(50);
		d.display();
	}

		
	}


