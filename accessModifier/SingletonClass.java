package accessModifier;

public class SingletonClass {
	private static SingletonClass obj;
	private SingletonClass() {
	}
	
	public static SingletonClass getObj()
	{
		if(obj==null) {
			obj = new SingletonClass();
		}
		return obj;
	}
	
	public static void main(String[] args) {
		SingletonClass obj1 = SingletonClass.getObj();
		SingletonClass obj2 = SingletonClass.getObj();
		System.out.println(obj1==obj2); //same object will be created.
	}
}
