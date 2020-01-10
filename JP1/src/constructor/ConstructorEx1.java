package constructor;



class Animal{
	String familytype;

	public Animal(String familytype) {
		this.familytype = familytype;
		System.out.println(familytype);
	}
}

public class ConstructorEx1	extends Animal{
	String	name;
	public static void main(String[]	args)	{
					//	Compiler	provides	this	class	with	a	default	no-argument	constructor. This	allows	us	to	create	an	instance	of	Animal	class.
		
		//ConstructorEx1	animal1 =	new ConstructorEx1();
		/*ConstructorEx1	animal2 =	new ConstructorEx1("tiger");
		System.out.println(animal2.name);*/
		
		ConstructorEx1	animal2 =	new ConstructorEx1("tiger","BigCats");

	}
	
	//	This	is	called	a	one	argument	constructor.
	/*public ConstructorEx1(String name)	{
			this.name =	name;
	}*/
	
	public ConstructorEx1(String name,String familyType)	{
		super(familyType);
		this.name =	name;
		System.out.println(name);
	}	
	
	
					
}