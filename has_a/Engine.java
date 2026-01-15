package has_a;

public class Engine {
	private int cc;
	private String type;
	public void setCC(int cc)
	{
		this.cc=cc;
	}
	public void setType(String type)
	{
		this.type=type;
	}
	public int getCC() {
		return cc;
	}
	public String getType()
	{
		return type;
	}
}
