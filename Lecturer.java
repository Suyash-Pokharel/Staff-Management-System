//Lecturer class that extends to Teacher class
public class Lecturer extends Teacher
{
    // attributes of lecturer
    private String department;
    private int yearsOfExperience;
    private int gradedScore;
    private boolean hasGraded;

    // constructor of lecturer
    public Lecturer(int teacherId, String teacherName, String address, String workingType, String employmentStatus,int workingHours, String department, int yearsOfExperience)
    {
        // Call the constructor of the superclass Teacher
        super(teacherId, teacherName, address, workingType, employmentStatus, workingHours);
        this.department = department;
        this.yearsOfExperience = yearsOfExperience;
        this.gradedScore = 0; // default value
        this.hasGraded = false; // default value
    }

    // accessor methods
    public String getDepartment() 
    {
        return department;
    }

    public int getYearsOfExperience() 
    {
        return yearsOfExperience;
    }

    public int getGradedScore() 
    {
        return gradedScore;
    }
    
    public boolean getHasGraded() 
    {
        return hasGraded;
    }

    // mutator method
    public void setGradedScore(int gradedScore) 
    {
        this.gradedScore = gradedScore;
    }

    // gradeAssignment method
    public void gradeAssignment(int gradedScore, String department, int yearsOfExperience) 
    {
        if (yearsOfExperience >= 5 && department.equals(this.department)) 
        {
            this.gradedScore = gradedScore;
            this.hasGraded = true;
            String grade;
            if (gradedScore >= 70) 
            {
                grade = "A";
            } else if (gradedScore >= 60) 
            {
                grade = "B";
            } else if (gradedScore >= 50) 
            {
                grade = "C";
            } else if (gradedScore >= 40) 
            {
                grade = "D";
            } else 
            {
                grade = "E";
            }
            System.out.println("The grade is: " + grade);
        } 
        else 
        {
            System.out.println("The lecturer cannot grade the assignment.");
        }
    }

    // display method
    public void display() 
    {
        // call superclass display method
        super.display();
        System.out.println("Department: " + department);
        System.out.println("Years of Experience: " + yearsOfExperience);
        if (hasGraded) 
        {
            System.out.println("Graded Score: " + gradedScore);
        } 
        else 
        {
            System.out.println("The score has not been graded yet.");
        }
    }
}
