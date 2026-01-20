package Object_Class;

public class Mobile {
	int id;
	String brand;
	int storage;
	public Mobile(int id,String brand,int storage) {
		this.id=id;
		this.brand=brand;
		this.storage=storage;
	}
	
	
	@Override
	public String toString() {
		return "id:" + id + " brand:" + brand + " storage:" + storage;
	}
	
	public boolean MobileCheck(Mobile m)
	{
		if(this.hashCode()==m.hashCode())
			return true;
		else
			return false;
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(o==null|| o.getClass()!=this.getClass())
			return false;
		Mobile m =(Mobile)o;
		return this.id == m.id && this.brand == m.brand && this.storage==m.storage;
	}
	
	public static void main(String[] args) {
		Mobile m1 = new Mobile(13,"Redmi",128);
		Mobile m2 = new Mobile(13,"Redmi",128);
		System.out.println(m1);
		System.out.println(m1.equals(m2));
		System.out.println(m1.MobileCheck(m2));
	}
	
}
