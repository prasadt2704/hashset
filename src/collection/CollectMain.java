package collection;


import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class CollectMain {
	

	
	public static void main(String[] args) 
	{
	
		
		Scanner sc=new Scanner(System.in);
		HashSet<collection> coin=new HashSet();
	
		String wish;
		do
		{
			System.out.println("Choose Option: 1.Add coin. \n 2.Display \n 3.Create List");
			int ch=sc.nextInt();
			
			switch(ch)
			{
				case 1:
					
					System.out.println("Enter Country:");
					String country=sc.next();
					System.out.println("Enter Denomination:");
					String denomination=sc.next();
					System.out.println("Enter year of minting:");
					int yearOfMinting=sc.nextInt();
					System.out.println("Enter current values:");
					int currVal=sc.nextInt();
					Date acqDate=new Date();
					
					collection collect=new collection(country,denomination,yearOfMinting,currVal,acqDate);
					
					
					boolean flag=true;
					for(collection ref:coin)
					{		
						if(ref.equals(collect)==true)
						{
							flag=false;
							break;
						}
					}
					
					if(flag==true)
					{
					coin.add(collect);
					break;
					}
					
					else
					{
						System.out.println("Duplicate Coin");
					
					}
					
					break;
					
				case 2:
					
					
					Iterator<collection> iter=coin.iterator();
					while(iter.hasNext())
					{
						iter.next().display();
					}
					break;
					
					
					
				case 3:
					System.out.println("Choose Option: 1.Country \n 2.year of minting. \n 3.current value.");
					int ch1=sc.nextInt();
					Iterator<collection> iter1=coin.iterator();
					switch(ch1)
					{
					case 1:
						System.out.println("Enter Country and denomination:");
						String c=sc.next();
						String d=sc.next();
						
						
					
						while(iter1.hasNext())
						{
							collection ref=iter1.next();
							if (ref.getCountry().toLowerCase().equals(c.toLowerCase())
									&& ref.getDenomination().equals(d))
							{
								ref.display();
							}
						}
						break;
						
					
					
					case 2:
						System.out.println("Enter year of minting:");
						int y=sc.nextInt();
						
						while(iter1.hasNext())
						{
							collection ref=iter1.next();
							if (ref.getYearOfMinting()==y)
									
							{
								ref.display();
							}
						}
					break;
					
					case 3:
						System.out.println("Enter current value:");
						int v=sc.nextInt();

						while(iter1.hasNext())
						{
							collection ref=iter1.next();
							if (ref.getCurrVal()==v)
									
							{
								ref.display();
							}
						}
					break;
					
					}
					
			}
			System.out.println("Do you want to perfor more operations::");
			 wish=sc.next();
		}while (wish.equals("y")||wish.equals("Y"));
	}

}
