class EmployeeGrade 
{

	private int employeeNo;
	private String employeeName ;
	private float customer1Feedback;
	private float customer2Feedback;
	private float customer3Feedback;
	private float averageFeedback;
	private char grade;


	public EmployeeGrade(){
		this.employeeNo = 101;
		this.employeeName = "Ram";
		this.customer1Feedback = 4.1f;
		this.customer2Feedback = 4.0f;
		this.customer3Feedback = 4.3f;
	}
	public EmployeeGrade(int empNo, String empName , float feedback1, float feedback2, float feedback3 ){
		this.employeeNo = empNo;
		this.employeeName = empName;
		this.customer1Feedback = feedback1;
		this.customer2Feedback = feedback2;
		this.customer3Feedback = feedback3;
	}

	public void calculateAverageFeedback(){
		averageFeedback = (customer1Feedback + customer2Feedback + customer3Feedback) / 3;
	}

	public void calculateGrade(){
		if(averageFeedback > 4.5){
			grade = 'O';
		}else if(averageFeedback > 4){
			grade = 'A';
		}else if (averageFeedback > 3){
			grade = 'B';
		}else{
			grade = 'C';
		}
	}

	public void displayInfo(){
		System.out.println("Average Feedback is "+averageFeedback);
		System.out.println("Grade is "+grade);

	}

	
}
