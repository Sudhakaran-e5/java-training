public class StarterArray
{
	public static void main(String[] args) 
	{
		EmployeeGrade[] empGrade = new EmployeeGrade[5];
		empGrade[0] = new EmployeeGrade();
		empGrade[1] = new EmployeeGrade();
		empGrade[2] = new EmployeeGrade();
		empGrade[3] = new EmployeeGrade();
		empGrade[4] = new EmployeeGrade();
		for(int i=0;i<5;i++){
			empGrade[i].calculateAverageFeedback();
			empGrade[i].calculateGrade();
			empGrade[i].displayInfo();
		}

	}
}
