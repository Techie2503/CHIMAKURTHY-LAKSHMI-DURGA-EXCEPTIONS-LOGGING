package Interest;

class Calculate_Interest
{
	public float simple_interest(float princpal_amount,int time,float rate_of_interest)
	{
		return (princpal_amount*time*rate_of_interest)/100;
	}
	public float compound_interest(float principal_amount,int no_of_times,int time,float rate_of_interest)
	{
		return principal_amount* (float)(Math.pow(1+(rate_of_interest/no_of_times),time));
	}
}
