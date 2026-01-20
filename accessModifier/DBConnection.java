package accessModifier;

public class DBConnection {
	private static DBConnection obj;
	private static int count =1;
	private DBConnection() {
		
	}
	
	public static DBConnection getObj()
	{
		if(count<=5)
		{
			obj = new DBConnection();
			 count++;
			return obj;
		}
		else 
			obj =null;
		return obj;
	}
	public static void main(String[] args) {
		 DBConnection obj1 = DBConnection.getObj();
	     DBConnection obj2 = DBConnection.getObj();
	     DBConnection obj3 = DBConnection.getObj();
	     DBConnection obj4 = DBConnection.getObj();
	     DBConnection obj5 = DBConnection.getObj();
	     DBConnection obj6 = DBConnection.getObj();
		System.out.println(obj1); 
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
		System.out.println(obj5);
		System.out.println(obj6);
	}
}
