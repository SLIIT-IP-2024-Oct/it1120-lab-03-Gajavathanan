import java. util. Scanner;

public class IT24104065Lab3Q2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly salary: ");
        double monthlySalary = input.nextDouble();

        System.out.print("Enter the number of OT hours: ");
        double otHours = input.nextDouble();

        System.out.print("Enter the OT hours: ");
        double otHourlyRate = input.nextDouble();

        double otAmount = otHours * otHourlyRate;
        doublre totalSalary = monthly + otAmount;

        
        System.out.println("The total salary including OT is: "+ totalSalary);


}

}

        