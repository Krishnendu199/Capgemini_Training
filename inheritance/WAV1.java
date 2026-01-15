package inheritance;

public class WAV1 {
	public void chat()
	{
		System.out.println("Chatting");	
	}
	public static void main(String[] args)
	{
		WAV1 w1 = new WAV1();
		w1.chat();
		WAV2 w2 = new WAV2();
		w2.chat();
		w2.status();
		WAV3 w3 = new WAV3();
		w3.chat();
		w3.status();
		w3.MetaAI();
	}
}
class WAV2 extends WAV1
{
	public void status()
	{
		System.out.println("Posting Status");
	} 
}
class WAV3 extends WAV2
{
	public void MetaAI()
	{
		System.out.println("AI Implemented");
	}
}
