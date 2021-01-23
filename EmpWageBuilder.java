
public class EmpWageBuilder {
	public static void main(String args[]){
	System.out.println("Welcome to Employee Wage Computation");

	int WagePerHour=20;
	int NoOfHours=0;
	int Month=20;
	int empCheck=(int) Math.floor(Math.random() * 10) % 2;

	switch (empCheck) {
	case 1:
		System.out.println("Employee is Full Time\nFull Time");
		NoOfHours=8;
		break;
	case 0:
		System.out.println("Employee is Part Time\nPart Time");
		NoOfHours=4;
		break;
	}
	int Payment= WagePerHour * NoOfHours * Month;
	System.out.print("\bPayment for One Month "+Payment);
	
	}
}
