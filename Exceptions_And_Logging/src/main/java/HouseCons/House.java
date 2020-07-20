package HouseCons;
import java.util.logging.Logger;
import java.util.Scanner;
public class House {
	public House() {
		Logger LOGGER =Logger.getLogger(House.Class.getName());
		Scanner s=new Scanner(System.in);
		while(true) {
			
			try {
		
				LOGGER.info("Enter choice of Material Type:");
		
				LOGGER.info("1.Standard Material\n2.Above Standard Material\n3.High Standard Material");
		
				String choice2=s.next();
		
				int choice=Integer.parseInt(choice2);
				
				if(choice>3 || choice<1) {
				
					LOGGER.info("...please look at choices numbers....");
					
					continue;
				}
				String choice1="";
				
				int[] cost= {1200,1500,1800,2500};
				
				double Cost;
		
				if (choice==3) {
					LOGGER.info("Do you want fully automated home?(yes/no):\n");
					choice1=s.next();
				}
		
				LOGGER.info("Area of House (in square feet):");
				
				float area=s.nextFloat();
				
				if(choice==3) {
					
					if(choice1.equals("yes")) {
				
						Cost=cost[3]*area;
					}
					else 
					{
						Cost=cost[2]*area;
					}
				}
				else 
				{
					Cost=cost[choice-1]*area;
				}
		
				LOGGER.info("Cost is needed to construct by using your wished materials:"+Cost);
		
				break;
		
			}
			catch(Exception e) {
				LOGGER.warning("...Please enter a valid choice...");
			}
		}
		s.close();
		output.close();
	}
}

