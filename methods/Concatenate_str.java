package methods;

public class Concatenate_str {
	public static void concatenate(String... s)
	{
		String concat = "";
		for(String i : s)
		{
			concat = concat + i;
		}
		System.out.println(concat);
	}
	public static void main(String[] args) {
		concatenate("hello","hi","bye");
	}
}
