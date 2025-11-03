// Tutor class that extends to Teacher class
public class Tutor extends Teacher {
    // attributes of Tutor
    private double salary;
    private String specialization;
    private String academicQualifications;
    private int performanceIndex;
    private boolean isCertified;

    // Constructor of Tutor
    public Tutor(int teacherId, String teacherName, String address, String workingType, String employmentStatus, int workingHours, double salary, String specialization, String academicQualifications, int performanceIndex) {
        // Call the constructor of the superclass Teacher
        super(teacherId, teacherName, address, workingType, employmentStatus, workingHours);
        this.salary = salary;
        this.specialization = specialization;
        this.academicQualifications = academicQualifications;
        this.performanceIndex = performanceIndex;
        this.isCertified = false; //default value
    }

    // Getter method for salary
    public double getSalary() {
        return salary;
    }

    // Getter method for specialization
    public String getSpecialization() {
        return specialization;
    }

    // Getter method for academic qualifications
    public String getAcademicQualifications() {
        return academicQualifications;
    }

    // Getter method for performance index
    public int getPerformanceIndex() {
        return performanceIndex;
    }

    // Method to set the salary and certify the tutor
    public void setSalary(double newSalary, int newPerformanceIndex) {
        // Check if the performance index is greater than 5 and working hours is more than 20
        if (newPerformanceIndex > 5 && getWorkingHours() > 20) {
            // Initialize the appraisal percentage
            double appraisalPercentage = 0;
            if (newPerformanceIndex >= 5 && newPerformanceIndex <= 7) {
                appraisalPercentage = 0.05;
            } else if (newPerformanceIndex >= 8 && newPerformanceIndex <= 9) {
                appraisalPercentage = 0.1;
            } else if (newPerformanceIndex == 10) {
                appraisalPercentage = 0.2;
            }
            // Calculate the appraisal amount
            double appraisalAmount = newSalary * appraisalPercentage;
            this.salary = newSalary + appraisalAmount;
            this.isCertified = true;
            System.out.println("Salary is approved to the Tutor.");
        } else {
            // Print a message if the tutor is not eligible for certification
            System.out.println("Salary cannot be approved to the tutor. Tutor is not eligible.");
        }
    }

    // Method to remove a tutor
    public void removingTutor() {
        // Check if the tutor is not certified
        if (!isCertified) {
            // Reset all the attributes of the tutor
            this.salary = 0;
            this.specialization = "  ";
            this.academicQualifications = "  ";
            this.performanceIndex = 0;
            this.isCertified = false;
        }
    }

    // Method to display the details of the tutor
    public void display() {
        // Call the display method of the superclass
        super.display();
        // Check if the tutor is certified
        if (isCertified) {
            // Print the details specific to the tutor
            System.out.println("Salary: " + salary);
            System.out.println("Specialization: " + specialization);
            System.out.println("Academic Qualifications: " + academicQualifications);
            System.out.println("Performance Index: " + performanceIndex);
        } else {
            // Print a message if the tutor is not certified
            System.out.println("Tutor is not certified. Salary details are not available.");
        }
    }
}
