package homework;
import java.util.Scanner;
public class findsalaryy {
		
		public static void main(String [] args) {
			
			double TAX= .28;
			
			
			Scanner type = new Scanner(System.in);
			System.out.print("what is your name = ");
			String name = type.nextLine();
			
			System.out.print(name+ ",how many hours do you work per week= ");
			double HW = type.nextDouble();
			
			System.out.print(name+ ",whats your hourly wage = ");
			double HWPW = type.nextDouble();
			System.out.println("do you want to find your hourly wage");
			System.out.println("if yes = 1 and no = 2");
			double yn = type.nextDouble();
			
			double dti = (HW*HWPW);
			double dtiat = dti-(dti*TAX);
			if (yn==1) {
			
				System.out.println("your daily pay = "+ dti + "your payment after tax: "+ dtiat);
				System.out.println("do you want to find your weekly pay");
				System.out.println ("if yes =1 and no =2");
				double yn1 = type.nextDouble();

				if (yn1 ==1) {
					double wp = (dti*5);
					System.out.println ("your weekly is = "+ wp);
					System.out.println("do you want to find  your monthly pay = ");
					System.out.println("if yes = 1 and no = 2");
					double yn2 = type.nextDouble();
					double MS = (wp*4);
					double MPAT = MS-(MS*TAX);
					if (yn2==1) {
						System.out.println("your monthly salary is =" +MS + "your pay after tax is =" +MPAT);
						System.out.println("do you want to find your yearly salary");
						System.out.println("if yes = 1 and no = 2");
						double yn3 = type.nextDouble();
						if ( yn3==1) {
							double YP= (MS*12);
							System.out.println("your yearly salary is= "+YP);
							System.out.println("do you want to find how much tax youll pay on your yearly salary");
							System.out.println("if yes =1 and no = 2");
							double yn4 = type.nextDouble();
							double SAT = YP-(YP*.22);
							if (yn4==1) {
								
							
							
							System.out.println("your pay after tax is ="+SAT);
							}else {
								System.out.println("have a nice day");
							}
						
						
						
						} else {
							System.out.println("have a nice day");
						}
												
					
					
					
					
					}else {
						System.out.println("have a nice day");
					}
					
				
				
				
				
				
				
				}else {
					System.out.println("have a nice day");
				}
			
			
		
			}else {
				System.out.println("have a nice day");
			}
		
		}
		}
