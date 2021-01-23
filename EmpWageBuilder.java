
public class EmpWageBuilder {
	public static void main(String args[]){
	System.out.println("Welcome to Employee Wage Computation");
	
	int isFullTime=1;
	int isPartTime=2;
	int WagePerHour=20;
	int NoOfHours=0;
	int empCheck=(int) Math.floor(Math.random() * 10) % 3;

	switch (empCheck) {
	case 1:
		System.out.println("Employee is Present");
		NoOfHours=8;
		break;
	case 2:
		System.out.println("Employee is Part Time");
		NoOfHours=4;
		break;
	case 0:
		System.out.println("Employee is absent");
		NoOfHours=0;
		break;
		}
	int Payment= WagePerHour * NoOfHours;
	System.out.println("Payment is "+Payment);
	
	}
}
