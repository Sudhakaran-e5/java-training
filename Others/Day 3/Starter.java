public class Starter{
	public static void main(String[] args) 
	{
		EmployeeGrade empGrade = new EmployeeGrade();
		empGrade.calculateAverageFeedback();
		empGrade.calculateGrade();
		empGrade.displayInfo();
		EmployeeGrade empGradeNew = new EmployeeGrade(1111, "xyz", 5, (float)4.5, 5);
		empGradeNew.calculateAverageFeedback();
		empGradeNew.calculateGrade();
		empGradeNew.displayInfo();


	}
}
