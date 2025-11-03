// Teacher class
public class Teacher 
{
    // Attributes of teacher
    private int teacherId;
    private String teacherName;
    private String address;
    private String workingType;
    private String employmentStatus;
    private int workingHours;

    // Constructor of teacher class
    public Teacher(int teacherId, String teacherName, String address, String workingType, String employmentStatus, int workingHours) 
    {
        // Initialize the attributes with the parameter values
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.address = address;
        this.workingType = workingType;
        this.employmentStatus = employmentStatus;
        this.workingHours = workingHours;
      }

    // Accessor methods for each attribute
    public int getTeacherId() 
    {
        return teacherId;
    }

    public String getTeacherName() 
    {
        return teacherName;
    }

    public String getAddress() 
    {
        return address;
    }

    public String getWorkingType() 
    {
        return workingType;
    }

    public String getEmploymentStatus() 
    {
        return employmentStatus;
    }

    public int getWorkingHours() 
    {
        return workingHours;
    }

    // A method to set the working hours
    public void setWorkingHours(int workingHours) 
    {
        this.workingHours = workingHours;
    }

    // A method to display the details of the teacher
    public void display() 
    {
        // Print the teacher ID, name, address, working type and employment status
        System.out.println("Teacher ID: " + teacherId);
        System.out.println("Teacher Name: " + teacherName);
        System.out.println("Address: " + address);
        System.out.println("Working Type: " + workingType);
        System.out.println("Employment Status: " + employmentStatus);
        // If the working hours is not zero, print it
        if (workingHours != 0)
        {
            System.out.println("Working Hours: " + workingHours);
        }
        // Otherwise, print a suitable message
        else 
        {
            System.out.println("Working Hours: Not assigned yet");
        }
    }
}