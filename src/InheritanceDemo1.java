class Base
{
	int i;
	int j;
	void inputIJ(int i, int j)
	{
		this.i = i;
		this.j = j;
	}
	void displayIJ()
	{
		System.out.println("i="+i+" "+"j="+j);
	}
}
class Derived extends Base
{
	int k;
	void inputk(int k)
	{
		this.k =k;
		}
	void displayk()
	{
		System.out.println("k="+k);
	}
}
public class InheritanceDemo1 {

	public static void main(String[] args) {
		Base b = new Base();
		b.inputIJ(10,20);
		b.displayIJ();
		Derived d = new Derived();
		d.inputIJ(30,40);
		d.displayIJ();
		d.inputk(50);
		d.displayk();
	}

}
