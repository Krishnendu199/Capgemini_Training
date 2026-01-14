package methods;

public class DoubleBiggestShortest {
	public static double biggest(double... d)
	{
		double max = 0;
		double min = 0;
		for(double i : d)
		{
			if(i>max)
			{
				max=i;
			}
			
		}
		return max;
	}
	public static double shortest(double... d)
	{
		double min = 0;
		for(double i : d)
		{
			if(i<min)
			{
				min=i;
			}
		}
		return min;
	}
	public static void main(String[] args) {
		System.out.println(biggest());
	}

}
