package Interest;
import java.util.logging.Logger;
import java.util.Scanner;
class Interest extends Calculate_Interest
{
	
	public static void main(String args[])
	{
		Logger LOGGER= Logger.getLogger(Interest.class.getName());
		Interest obj=new Interest();
		Scanner sc=new Scanner(System.in);
		LOGGER.info("Enter the type of interest:\n1.SIMPLE INTEREST...\n2.COMPOUND INTEREST...");
		int ch=sc.nextInt();
		LOGGER.info("Enter the principal amount");
		float principal_amount=sc.nextFloat();
		LOGGER.info("Enter duration in years");
		int time=sc.nextInt();
		LOGGER.info("Enter rate of interest");
		float rate_of_interest=sc.nextFloat();
		if(ch==1)
			LOGGER.info("Simple interest is "+obj.simple_interest(principal_amount,time,rate_of_interest));
		else if(ch==2)
		{
			LOGGER.info("Enter number of times to be calculated");
			int num_times=sc.nextInt();
			LOGGER.info("Compound interest is "+obj.compound_interest(principal_amount,num_times,time,rate_of_interest));
		}
		else
			LOGGER.warning("Invalid option");
		sc.close();
	}
}
