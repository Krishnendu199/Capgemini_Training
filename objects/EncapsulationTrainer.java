package objects;

public class EncapsulationTrainer {
	private int id;
	private String name;
	private int pass;
	
	public EncapsulationTrainer(int id, String name, int pass)
	{
		this.id=id;
		this.name=name;
		this.pass=pass;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setPass(int pass)
	{
		this.pass=pass;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getPass() {
		return pass;
	}
}
