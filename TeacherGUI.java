import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class TeacherGUI{
    private JFrame frame;
    private JPanel panel;
    private JLabel teacherNameLabel, teacherIdLabel, addressLabel, workingTypeLabel, employmentStatusLabel,
                   workingHoursLabel, departmentLabel, yearsOfExperienceLabel, gradedScoreLabel, salaryLabel,
                   specializationLabel, academicQualificationsLabel, performanceIndexLabel;
                   
    private JTextField teacherNameTxt, teacherIdTxt, addressTxt, workingTypeTxt, employmentStatusTxt,
                       workingHoursTxt,departmentTxt, yearsOfExperienceTxt, gradedScoreTxt, salaryTxt,
                       specializationTxt, academicQualificationsTxt, performanceIndexTxt;
                       
    private JButton lecturerButton, tutorButton;
                       
    private JButton addLecturerButton, addTutorButton, gradeAssignmentButton,
                    setTutorSalaryButton, removeTutorButton, displayButton, clearButton, backButton;
    
    private ArrayList<Teacher> teacher = new ArrayList<>();
    
    public TeacherGUI(){
        //Creating JFrame
        frame = new JFrame("TeacherGUI");
        frame.setSize(1600, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        //Creating JPanel
        panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(30, 0, 30, 0);
        panel.setBackground(Color.BLACK);
        
        
        
        //Create JButton
        //Lecturer Button
        lecturerButton = new JButton("LECTURER");
        lecturerButton.setBackground(Color.WHITE);
        lecturerButton.setFont(new Font("Times New Roman", Font.BOLD, 30));
        lecturerButton.setPreferredSize(new Dimension(250, 75));
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(lecturerButton, constraints);
        lecturerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                //Create a JFrame
                JFrame lecturerFrame = new JFrame("Lecturer");
                lecturerFrame.setSize(1600, 900);
                lecturerFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                JPanel lecturerPanel = new JPanel(new GridBagLayout());
                GridBagConstraints lecturerConstraints = new GridBagConstraints();
                lecturerConstraints.fill = GridBagConstraints.NONE;
                lecturerConstraints.anchor = GridBagConstraints.WEST;
                lecturerConstraints.insets = new Insets(15, 30, 15, 30);
                lecturerPanel.setBackground(Color.BLACK);
                
                
                //teacherNameLabel
                teacherNameLabel = new JLabel("Teacher Name:");
                teacherNameLabel.setForeground(Color.WHITE);
                teacherNameLabel.setFont(new Font("Tessan Sans", Font.BOLD, 20));
                lecturerConstraints.gridx = 0;
                lecturerConstraints.gridy = 0;
                lecturerPanel.add(teacherNameLabel, lecturerConstraints);
                //teacherNameTxt
                teacherNameTxt = new JTextField();
                teacherNameTxt.setForeground(Color.BLACK);
                teacherNameTxt.setBackground(Color.LIGHT_GRAY);
                teacherNameTxt.setPreferredSize(new Dimension(300,30));
                teacherNameTxt.setFont(new Font("Arial", Font.BOLD, 15));
                lecturerConstraints.gridx = 1;
                lecturerPanel.add(teacherNameTxt, lecturerConstraints);
                
                //teacherIdLabel
                teacherIdLabel = new JLabel("Teacher ID:");
                teacherIdLabel.setForeground(Color.WHITE);
                teacherIdLabel.setFont(new Font("Tessan Sans", Font.BOLD, 20));
                lecturerConstraints.gridx = 0;
                lecturerConstraints.gridy = 1;
                lecturerPanel.add(teacherIdLabel, lecturerConstraints);
                //teacherIdTxt
                teacherIdTxt = new JTextField();
                teacherIdTxt.setForeground(Color.BLACK);
                teacherIdTxt.setBackground(Color.LIGHT_GRAY);
                teacherIdTxt.setPreferredSize(new Dimension(300,30));
                teacherIdTxt.setFont(new Font("Arial", Font.BOLD, 15));
                lecturerConstraints.gridx = 1;
                lecturerPanel.add(teacherIdTxt, lecturerConstraints);
                
                //addressLabel
                addressLabel = new JLabel("Address:");
                addressLabel.setForeground(Color.WHITE);
                addressLabel.setFont(new Font("Tessan Sans", Font.BOLD, 20));
                lecturerConstraints.gridx = 0;
                lecturerConstraints.gridy = 2;
                lecturerPanel.add(addressLabel, lecturerConstraints);
                //addressTxt
                addressTxt = new JTextField();
                addressTxt.setForeground(Color.BLACK);
                addressTxt.setBackground(Color.LIGHT_GRAY);
                addressTxt.setPreferredSize(new Dimension(300,30));
                addressTxt.setFont(new Font("Arial", Font.BOLD, 15));
                lecturerConstraints.gridx = 1;
                lecturerPanel.add(addressTxt, lecturerConstraints);
                
                //workingTypeLabel
                workingTypeLabel = new JLabel("Working Type:");
                workingTypeLabel.setForeground(Color.WHITE);
                workingTypeLabel.setFont(new Font("Tessan Sans", Font.BOLD, 20));
                lecturerConstraints.gridx = 0;
                lecturerConstraints.gridy = 3;
                lecturerPanel.add(workingTypeLabel, lecturerConstraints);
                //workingTypeTxt
                workingTypeTxt = new JTextField();
                workingTypeTxt.setForeground(Color.BLACK);
                workingTypeTxt.setBackground(Color.LIGHT_GRAY);
                workingTypeTxt.setPreferredSize(new Dimension(300,30));
                workingTypeTxt.setFont(new Font("Arial", Font.BOLD, 15));
                lecturerConstraints.gridx = 1;
                lecturerPanel.add(workingTypeTxt, lecturerConstraints);
                
                //employmentStatusLabel
                employmentStatusLabel = new JLabel("Employment Status:");
                employmentStatusLabel.setForeground(Color.WHITE);
                employmentStatusLabel.setFont(new Font("Tessan Sans", Font.BOLD, 20));
                lecturerConstraints.gridx = 0;
                lecturerConstraints.gridy = 4;
                lecturerPanel.add(employmentStatusLabel, lecturerConstraints);
                //employmentStatusTxt
                employmentStatusTxt = new JTextField();
                employmentStatusTxt.setForeground(Color.BLACK);
                employmentStatusTxt.setBackground(Color.LIGHT_GRAY);
                employmentStatusTxt.setPreferredSize(new Dimension(300,30));
                employmentStatusTxt.setFont(new Font("Arial", Font.BOLD, 15));
                lecturerConstraints.gridx = 1;
                lecturerPanel.add(employmentStatusTxt, lecturerConstraints);
                
                //workingHoursLabel
                workingHoursLabel = new JLabel("Working Hours:");
                workingHoursLabel.setForeground(Color.WHITE);
                workingHoursLabel.setFont(new Font("Tessan Sans", Font.BOLD, 20));
                lecturerConstraints.gridx = 0;
                lecturerConstraints.gridy = 5;
                lecturerPanel.add(workingHoursLabel, lecturerConstraints);
                //workingHoursTxt
                workingHoursTxt = new JTextField();
                workingHoursTxt.setForeground(Color.BLACK);
                workingHoursTxt.setBackground(Color.LIGHT_GRAY);
                workingHoursTxt.setPreferredSize(new Dimension(300,30));
                workingHoursTxt.setFont(new Font("Arial", Font.BOLD, 15));
                lecturerConstraints.gridx = 1;
                lecturerPanel.add(workingHoursTxt, lecturerConstraints);
                
                //departmentLabel
                departmentLabel = new JLabel("Department:");
                departmentLabel.setForeground(Color.WHITE);
                departmentLabel.setFont(new Font("Tessan Sans", Font.BOLD, 20));
                lecturerConstraints.gridx = 0;
                lecturerConstraints.gridy = 6;
                lecturerPanel.add(departmentLabel, lecturerConstraints);
                //departmentTxt
                departmentTxt = new JTextField();
                departmentTxt.setForeground(Color.BLACK);
                departmentTxt.setBackground(Color.LIGHT_GRAY);
                departmentTxt.setPreferredSize(new Dimension(300,30));
                departmentTxt.setFont(new Font("Arial", Font.BOLD, 15));
                lecturerConstraints.gridx = 1;
                lecturerPanel.add(departmentTxt, lecturerConstraints);
                
                //yearsOfExperienceLabel
                yearsOfExperienceLabel = new JLabel("Years Of Experience:");
                yearsOfExperienceLabel.setForeground(Color.WHITE);
                yearsOfExperienceLabel.setFont(new Font("Tessan Sans", Font.BOLD, 20));
                lecturerConstraints.gridx = 0;
                lecturerConstraints.gridy = 7;
                lecturerPanel.add(yearsOfExperienceLabel, lecturerConstraints);
                //yearsOfExperienceTxt
                yearsOfExperienceTxt = new JTextField();
                yearsOfExperienceTxt.setForeground(Color.BLACK);
                yearsOfExperienceTxt.setBackground(Color.LIGHT_GRAY);
                yearsOfExperienceTxt.setPreferredSize(new Dimension(300,30));
                yearsOfExperienceTxt.setFont(new Font("Arial", Font.BOLD, 15));
                lecturerConstraints.gridx = 1;
                lecturerPanel.add(yearsOfExperienceTxt, lecturerConstraints);
                
                //gradedScoreLabel
                gradedScoreLabel = new JLabel("Graded Score:");
                gradedScoreLabel.setForeground(Color.WHITE);
                gradedScoreLabel.setFont(new Font("Tessan Sans", Font.BOLD, 20));
                lecturerConstraints.gridx = 0;
                lecturerConstraints.gridy = 8;
                lecturerPanel.add(gradedScoreLabel, lecturerConstraints);
                //gradedScoreTxt
                gradedScoreTxt = new JTextField();
                gradedScoreTxt.setForeground(Color.BLACK);
                gradedScoreTxt.setBackground(Color.LIGHT_GRAY);
                gradedScoreTxt.setPreferredSize(new Dimension(300,30));
                gradedScoreTxt.setFont(new Font("Arial", Font.BOLD, 15));
                lecturerConstraints.gridx = 1;
                lecturerPanel.add(gradedScoreTxt, lecturerConstraints);
                
                
                //addLecturerButton
                addLecturerButton = new JButton("Add Lecturer");
                addLecturerButton.setFont(new Font("Tessan Sans", Font.BOLD, 13));
                addLecturerButton.setPreferredSize(new Dimension(150, 30));
                addLecturerButton.setBackground(Color.WHITE);
                lecturerConstraints.gridx = 0;
                lecturerConstraints.gridy = 10;
                lecturerPanel.add(addLecturerButton, lecturerConstraints);
                addLecturerButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent a) {
                        try {
                            int teacherId = Integer.parseInt(teacherIdTxt.getText());
                            String address = teacherNameTxt.getText();
                            String teacherName = addressTxt.getText();
                            String workingType = workingTypeTxt.getText();
                            String employmentStatus = employmentStatusTxt.getText();
                            int workingHours = Integer.parseInt(workingHoursTxt.getText());
                            String department = departmentTxt.getText();
                            int yearsOfExperience = Integer.parseInt(yearsOfExperienceTxt.getText());
        
                            Lecturer lecturer = new Lecturer(teacherId, teacherName, address, workingType,
                            employmentStatus, workingHours, department, yearsOfExperience);
                            teacher.add(lecturer);
                            JOptionPane.showMessageDialog(lecturerFrame, "Lecturer has been added");
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(lecturerFrame, "Enter a numeric value");
                        }
                    }
                });
                
                
                //gradeAssignmentButton
                gradeAssignmentButton = new JButton("Grade Assignment");
                gradeAssignmentButton.setFont(new Font("Tessan Sans", Font.BOLD, 13));
                gradeAssignmentButton.setPreferredSize(new Dimension(150, 30));
                gradeAssignmentButton.setBackground(Color.WHITE);
                lecturerConstraints.gridx = 1;
                lecturerPanel.add(gradeAssignmentButton, lecturerConstraints);
                gradeAssignmentButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent a) {
                        try {
                            int teacherId = Integer.parseInt(teacherIdTxt.getText());
                            int gradedScore = Integer.parseInt(gradedScoreTxt.getText());
                            String department = departmentTxt.getText();
                            int yearsOfExperience = Integer.parseInt(yearsOfExperienceTxt.getText());
        
                            for (Teacher teacher : teacher) {
                                if (teacher instanceof Lecturer && teacher.getTeacherId() == teacherId) {
                                    ((Lecturer) teacher).gradeAssignment(gradedScore, department, yearsOfExperience);
                                    JOptionPane.showMessageDialog(lecturerFrame, "Assignment has been graded");
                                    return;
                                }
                            }
                            JOptionPane.showMessageDialog(lecturerFrame, "No Lecturer is found with ID: " + teacherId);
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(lecturerFrame, "Enter a numeric value");
                        }
                    }
                });
                
                
                //displayButton
                displayButton = new JButton("Display");
                displayButton.setFont(new Font("Tessan Sans", Font.BOLD, 13));
                displayButton.setPreferredSize(new Dimension(150, 30));
                displayButton.setBackground(Color.WHITE);
                lecturerConstraints.gridx = 0;
                lecturerConstraints.gridy = 11;
                lecturerPanel.add(displayButton, lecturerConstraints);
                //displayButton ActionListener for Lecturer
                displayButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent a) {
                        if (teacher.isEmpty()) {
                            JOptionPane.showMessageDialog(lecturerFrame, "No lecturer is added yet!");
                            return;
                        }
                    
                        // Create a string builder to construct the details
                        StringBuilder details = new StringBuilder();
                        for (Teacher teacher : teacher) {
                            if (teacher instanceof Lecturer) {
                                Lecturer lecturer = (Lecturer) teacher;
                                details.append(" Teacher ID: ").append(lecturer.getTeacherId()).append("\n");
                                details.append(" Teacher Name: ").append(lecturer.getTeacherName()).append("\n");
                                details.append(" Address: ").append(lecturer.getAddress()).append("\n");
                                details.append(" Working Type: ").append(lecturer.getWorkingType()).append("\n");
                                details.append(" Employment Status: ").append(lecturer.getEmploymentStatus()).append("\n");
                                details.append(" Working Hours: ").append(lecturer.getWorkingHours()).append("\n");
                                details.append(" Department: ").append(lecturer.getDepartment()).append("\n");
                                details.append(" Years of Experience: ").append(lecturer.getYearsOfExperience()).append("\n");
                                details.append(" Graded Score: ").append(lecturer.getGradedScore()).append("\n\n");
                            }
                        }
                    
                        // Create a new popup window to display the details
                        JTextArea textArea = new JTextArea(details.toString());
                        JScrollPane scrollPane = new JScrollPane(textArea);
                        textArea.setLineWrap(true);
                        textArea.setWrapStyleWord(true);
                        scrollPane.setPreferredSize(new Dimension(400, 300));
                        
                        // Pass the lecturer frame as the parent component to make the dialog non-modal
                        JOptionPane.showMessageDialog(lecturerFrame, scrollPane, "Lecturer Display", JOptionPane.PLAIN_MESSAGE);
                    }
                });

                
                //clearButton
                clearButton = new JButton("Clear");
                clearButton.setFont(new Font("Tessan Sans", Font.BOLD, 13));
                clearButton.setPreferredSize(new Dimension(150, 30));
                clearButton.setBackground(Color.WHITE);
                lecturerConstraints.gridx = 1;
                lecturerPanel.add(clearButton, lecturerConstraints);
                clearButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent a) {
                        teacherNameTxt.setText("");
                        teacherIdTxt.setText("");
                        addressTxt.setText("");
                        workingTypeTxt.setText("");
                        employmentStatusTxt.setText("");
                        workingHoursTxt.setText("");
                        departmentTxt.setText("");
                        yearsOfExperienceTxt.setText("");
                        gradedScoreTxt.setText("");
                    }
                });
                
                
                //backButton
                backButton = new JButton("Back");
                backButton.setFont(new Font("Tessan Sans", Font.BOLD, 13));
                backButton.setPreferredSize(new Dimension(150, 30));
                backButton.setBackground(Color.WHITE);
                lecturerConstraints.gridx = 2;
                lecturerPanel.add(backButton, lecturerConstraints);
                backButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent a) {
                        lecturerFrame.dispose();
                    }
                });
                
                
                lecturerFrame.getContentPane().add(lecturerPanel, BorderLayout.CENTER);
                lecturerFrame.setVisible(true);
            }
        });
        
        
        
        //Tutor Button
        tutorButton = new JButton("TUTOR");
        tutorButton.setBackground(Color.WHITE);
        tutorButton.setFont(new Font("Times New Roman", Font.BOLD, 30));
        tutorButton.setPreferredSize(new Dimension(250, 75));
        constraints.gridx = 0;
        constraints.gridy = 2;
        panel.add(tutorButton, constraints);
        tutorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                //Create a JFrame
                JFrame tutorFrame = new JFrame("Tutor");
                tutorFrame.setSize(1600, 900);
                tutorFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                JPanel tutorPanel = new JPanel(new GridBagLayout());
                GridBagConstraints tutorConstraints = new GridBagConstraints();
                tutorConstraints.fill = GridBagConstraints.NONE;
                tutorConstraints.anchor = GridBagConstraints.WEST;
                tutorConstraints.insets = new Insets(15, 30, 15, 30);
                tutorPanel.setBackground(Color.BLACK);
                
                
                //teacherNameLabel
                teacherNameLabel = new JLabel("Teacher Name:");
                teacherNameLabel.setForeground(Color.WHITE);
                teacherNameLabel.setFont(new Font("Tessan Sans", Font.BOLD, 20));
                tutorConstraints.gridx = 0;
                tutorConstraints.gridy = 0;
                tutorPanel.add(teacherNameLabel, tutorConstraints);
                //teacherNameTxt
                teacherNameTxt = new JTextField();
                teacherNameTxt.setForeground(Color.BLACK);
                teacherNameTxt.setBackground(Color.LIGHT_GRAY);
                teacherNameTxt.setPreferredSize(new Dimension(300,30));
                teacherNameTxt.setFont(new Font("Arial", Font.BOLD, 15));
                tutorConstraints.gridx = 1;
                tutorPanel.add(teacherNameTxt, tutorConstraints);
                
                //teacherIdLabel
                teacherIdLabel = new JLabel("Teacher ID:");
                teacherIdLabel.setForeground(Color.WHITE);
                teacherIdLabel.setFont(new Font("Tessan Sans", Font.BOLD, 20));
                tutorConstraints.gridx = 0;
                tutorConstraints.gridy = 1;
                tutorPanel.add(teacherIdLabel, tutorConstraints);
                //teacherIdTxt
                teacherIdTxt = new JTextField();
                teacherIdTxt.setForeground(Color.BLACK);
                teacherIdTxt.setBackground(Color.LIGHT_GRAY);
                teacherIdTxt.setPreferredSize(new Dimension(300,30));
                teacherIdTxt.setFont(new Font("Arial", Font.BOLD, 15));
                tutorConstraints.gridx = 1;
                tutorPanel.add(teacherIdTxt, tutorConstraints);
                
                //addressLabel
                addressLabel = new JLabel("Address:");
                addressLabel.setForeground(Color.WHITE);
                addressLabel.setFont(new Font("Tessan Sans", Font.BOLD, 20));
                tutorConstraints.gridx = 0;
                tutorConstraints.gridy = 2;
                tutorPanel.add(addressLabel, tutorConstraints);
                //addressTxt
                addressTxt = new JTextField();
                addressTxt.setForeground(Color.BLACK);
                addressTxt.setBackground(Color.LIGHT_GRAY);
                addressTxt.setPreferredSize(new Dimension(300,30));
                addressTxt.setFont(new Font("Arial", Font.BOLD, 15));
                tutorConstraints.gridx = 1;
                tutorPanel.add(addressTxt, tutorConstraints);
                
                //workingTypeLabel
                workingTypeLabel = new JLabel("Working Type:");
                workingTypeLabel.setForeground(Color.WHITE);
                workingTypeLabel.setFont(new Font("Tessan Sans", Font.BOLD, 20));
                tutorConstraints.gridx = 0;
                tutorConstraints.gridy = 3;
                tutorPanel.add(workingTypeLabel, tutorConstraints);
                //workingTypeTxt
                workingTypeTxt = new JTextField();
                workingTypeTxt.setForeground(Color.BLACK);
                workingTypeTxt.setBackground(Color.LIGHT_GRAY);
                workingTypeTxt.setPreferredSize(new Dimension(300,30));
                workingTypeTxt.setFont(new Font("Arial", Font.BOLD, 15));
                tutorConstraints.gridx = 1;
                tutorPanel.add(workingTypeTxt, tutorConstraints);
                
                //employmentStatusLabel
                employmentStatusLabel = new JLabel("Employment Status:");
                employmentStatusLabel.setForeground(Color.WHITE);
                employmentStatusLabel.setFont(new Font("Tessan Sans", Font.BOLD, 20));
                tutorConstraints.gridx = 0;
                tutorConstraints.gridy = 4;
                tutorPanel.add(employmentStatusLabel, tutorConstraints);
                //employmentStatusTxt
                employmentStatusTxt = new JTextField();
                employmentStatusTxt.setForeground(Color.BLACK);
                employmentStatusTxt.setBackground(Color.LIGHT_GRAY);
                employmentStatusTxt.setPreferredSize(new Dimension(300,30));
                employmentStatusTxt.setFont(new Font("Arial", Font.BOLD, 15));
                tutorConstraints.gridx = 1;
                tutorPanel.add(employmentStatusTxt, tutorConstraints);
                
                //workingHoursLabel
                workingHoursLabel = new JLabel("Working Hours:");
                workingHoursLabel.setForeground(Color.WHITE);
                workingHoursLabel.setFont(new Font("Tessan Sans", Font.BOLD, 20));
                tutorConstraints.gridx = 0;
                tutorConstraints.gridy = 5;
                tutorPanel.add(workingHoursLabel, tutorConstraints);
                //workingHoursTxt
                workingHoursTxt = new JTextField();
                workingHoursTxt.setForeground(Color.BLACK);
                workingHoursTxt.setBackground(Color.LIGHT_GRAY);
                workingHoursTxt.setPreferredSize(new Dimension(300,30));
                workingHoursTxt.setFont(new Font("Arial", Font.BOLD, 15));
                tutorConstraints.gridx = 1;
                tutorPanel.add(workingHoursTxt, tutorConstraints);
                
                //salaryLabel
                salaryLabel = new JLabel("Salary:");
                salaryLabel.setForeground(Color.WHITE);
                salaryLabel.setFont(new Font("Tessan Sans", Font.BOLD, 20));
                tutorConstraints.gridx = 0;
                tutorConstraints.gridy = 6;
                tutorPanel.add(salaryLabel, tutorConstraints);
                //salaryTxt
                salaryTxt = new JTextField();
                salaryTxt.setForeground(Color.BLACK);
                salaryTxt.setBackground(Color.LIGHT_GRAY);
                salaryTxt.setPreferredSize(new Dimension(300,30));
                salaryTxt.setFont(new Font("Arial", Font.BOLD, 15));
                tutorConstraints.gridx = 1;
                tutorPanel.add(salaryTxt, tutorConstraints);
                
                //specializationLabel
                specializationLabel = new JLabel("Specialization:");
                specializationLabel.setForeground(Color.WHITE);
                specializationLabel.setFont(new Font("Tessan Sans", Font.BOLD, 20));
                tutorConstraints.gridx = 0;
                tutorConstraints.gridy = 7;
                tutorPanel.add(specializationLabel, tutorConstraints);
                //specializationTxt
                specializationTxt = new JTextField();
                specializationTxt.setForeground(Color.BLACK);
                specializationTxt.setBackground(Color.LIGHT_GRAY);
                specializationTxt.setPreferredSize(new Dimension(300,30));
                specializationTxt.setFont(new Font("Arial", Font.BOLD, 15));
                tutorConstraints.gridx = 1;
                tutorPanel.add(specializationTxt, tutorConstraints);
                
                //academicQualificationsLabel
                academicQualificationsLabel = new JLabel("Academic Qualifications:");
                academicQualificationsLabel.setForeground(Color.WHITE);
                academicQualificationsLabel.setFont(new Font("Tessan Sans", Font.BOLD, 20));
                tutorConstraints.gridx = 0;
                tutorConstraints.gridy = 8;
                tutorPanel.add(academicQualificationsLabel, tutorConstraints);
                //academicQualificationsTxt
                academicQualificationsTxt = new JTextField();
                academicQualificationsTxt.setForeground(Color.BLACK);
                academicQualificationsTxt.setBackground(Color.LIGHT_GRAY);
                academicQualificationsTxt.setPreferredSize(new Dimension(300,30));
                academicQualificationsTxt.setFont(new Font("Arial", Font.BOLD, 15));
                tutorConstraints.gridx = 1;
                tutorPanel.add(academicQualificationsTxt, tutorConstraints);
                
                //performanceIndexLabel
                performanceIndexLabel = new JLabel("Performance Index:");
                performanceIndexLabel.setForeground(Color.WHITE);
                performanceIndexLabel.setFont(new Font("Tessan Sans", Font.BOLD, 20));
                tutorConstraints.gridx = 0;
                tutorConstraints.gridy = 9;
                tutorPanel.add(performanceIndexLabel, tutorConstraints);
                //performanceIndexTxt
                performanceIndexTxt = new JTextField();
                performanceIndexTxt.setForeground(Color.BLACK);
                performanceIndexTxt.setBackground(Color.LIGHT_GRAY);
                performanceIndexTxt.setPreferredSize(new Dimension(300,30));
                performanceIndexTxt.setFont(new Font("Arial", Font.BOLD, 15));
                tutorConstraints.gridx = 1;
                tutorPanel.add(performanceIndexTxt, tutorConstraints);
                
                
                //addTutorButton
                addTutorButton = new JButton("Add Tutor");
                addTutorButton.setFont(new Font("Tessan Sans", Font.BOLD, 13));
                addTutorButton.setPreferredSize(new Dimension(150, 30));
                addTutorButton.setBackground(Color.WHITE);
                tutorConstraints.gridx = 0;
                tutorConstraints.gridy = 10;
                tutorPanel.add(addTutorButton, tutorConstraints);
                addTutorButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent a) {
                        try {
                            int teacherId = Integer.parseInt(teacherIdTxt.getText());
                            String teacherName = teacherNameTxt.getText();
                            String address = addressTxt.getText();
                            String workingType = workingTypeTxt.getText();
                            String employmentStatus = employmentStatusTxt.getText();
                            int workingHours = Integer.parseInt(workingHoursTxt.getText());
                            double salary = Double.parseDouble(salaryTxt.getText());
                            String specialization = specializationTxt.getText();
                            String academicQualifications = academicQualificationsTxt.getText();
                            int performanceIndex = Integer.parseInt(performanceIndexTxt.getText());
        
                            Tutor tutor = new Tutor(teacherId, teacherName, address, workingType, employmentStatus, workingHours, salary, specialization, academicQualifications, performanceIndex);
                            teacher.add(tutor);
                            JOptionPane.showMessageDialog(tutorFrame, "Tutor has been added.");
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(tutorFrame, "Enter a numeric value");
                        }
                    }
                });
                
                
                //setTutorSalaryButton
                setTutorSalaryButton = new JButton("Set Tutor Salary");
                setTutorSalaryButton.setFont(new Font("Tessan Sans", Font.BOLD, 13));
                setTutorSalaryButton.setPreferredSize(new Dimension(150, 30));
                setTutorSalaryButton.setBackground(Color.WHITE);
                tutorConstraints.gridx = 1;
                tutorPanel.add(setTutorSalaryButton, tutorConstraints);
                setTutorSalaryButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent a) {
                        try {
                            int teacherId = Integer.parseInt(teacherIdTxt.getText());
                            double newSalary = Double.parseDouble(salaryTxt.getText());
                            int newPerformanceIndex = Integer.parseInt(performanceIndexTxt.getText());
        
                            for (Teacher teacher : teacher) {
                                if (teacher instanceof Tutor && teacher.getTeacherId() == teacherId) {
                                    ((Tutor) teacher).setSalary(newSalary, newPerformanceIndex);
                                    JOptionPane.showMessageDialog(tutorFrame, "Tutor salary has been set");
                                    return;
                                }
                            }
                            JOptionPane.showMessageDialog(tutorFrame, "No Tutor is found with ID: " + teacherId);
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(tutorFrame, "Enter a numeric value");
                        }
                    }
                });
                
                
                //removeTutorButton
                removeTutorButton = new JButton("Remove Tutor");
                removeTutorButton.setFont(new Font("Tessan Sans", Font.BOLD, 13));
                removeTutorButton.setPreferredSize(new Dimension(150, 30));
                removeTutorButton.setBackground(Color.WHITE);
                tutorConstraints.gridx = 2;
                tutorPanel.add(removeTutorButton, tutorConstraints);
                removeTutorButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent a) {
                        try {
                            int teacherId = Integer.parseInt(teacherIdTxt.getText());
                            Teacher teachers = null;
        
                            for (Teacher teacher : teacher) {
                                if (teacher instanceof Tutor && teacher.getTeacherId() == teacherId) {
                                    teachers = teacher;
                                    break;
                                }
                            }
        
                            if (teachers != null) {
                                teacher.remove(teachers);
                                JOptionPane.showMessageDialog(tutorFrame, "Tutor has been removed");
                            } else {
                                JOptionPane.showMessageDialog(tutorFrame, "No Tutor is found with ID: " + teacherId);
                            }
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(tutorFrame, "Invalid teacher ID.");
                        }
                    }
                });
                
                
                //displayButton
                displayButton = new JButton("Display");
                displayButton.setFont(new Font("Tessan Sans", Font.BOLD, 13));
                displayButton.setPreferredSize(new Dimension(150, 30));
                displayButton.setBackground(Color.WHITE);
                tutorConstraints.gridx = 0;
                tutorConstraints.gridy = 11;
                tutorPanel.add(displayButton, tutorConstraints);
                //displayButton ActionListener
                displayButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent a) {
                        if (teacher.isEmpty()) {
                            JOptionPane.showMessageDialog(tutorFrame, "No tutor has been added yet");
                            return;
                        }
                
                        // Create a string builder to construct the details
                        StringBuilder details = new StringBuilder();
                        for (Teacher teacher : teacher) {
                            if (teacher instanceof Tutor) {
                                Tutor tutor = (Tutor) teacher;
                                details.append(" Teacher ID: ").append(tutor.getTeacherId()).append("\n");
                                details.append(" Teacher Name: ").append(tutor.getTeacherName()).append("\n");
                                details.append(" Address: ").append(tutor.getAddress()).append("\n");
                                details.append(" Working Type: ").append(tutor.getWorkingType()).append("\n");
                                details.append(" Employment Status: ").append(tutor.getEmploymentStatus()).append("\n");
                                details.append(" Working Hours: ").append(tutor.getWorkingHours()).append("\n");
                                details.append(" Salary: ").append(tutor.getSalary()).append("\n");
                                details.append(" Specialization: ").append(tutor.getSpecialization()).append("\n");
                                details.append(" Academic Qualifications: ").append(tutor.getAcademicQualifications()).append("\n");
                                details.append(" Performance Index: ").append(tutor.getPerformanceIndex()).append("\n\n");
                            }
                        }
                
                        // Create a new popup window to display the details
                        JTextArea textArea = new JTextArea(details.toString());
                        JScrollPane scrollPane = new JScrollPane(textArea);
                        textArea.setLineWrap(true);
                        textArea.setWrapStyleWord(true);
                        scrollPane.setPreferredSize(new Dimension(400, 300));
                        
                        // Pass the tutor window as the parent component to make the dialog non-modal
                        JOptionPane.showMessageDialog(tutorFrame, scrollPane, "Tutor Display", JOptionPane.PLAIN_MESSAGE);
                    }
                });

                
                //clearButton
                clearButton = new JButton("Clear");
                clearButton.setFont(new Font("Tessan Sans", Font.BOLD, 13));
                clearButton.setPreferredSize(new Dimension(150, 30));
                clearButton.setBackground(Color.WHITE);
                tutorConstraints.gridx = 1;
                tutorPanel.add(clearButton, tutorConstraints);
                clearButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent a) {
                        teacherNameTxt.setText("");
                        teacherIdTxt.setText("");
                        addressTxt.setText("");
                        workingTypeTxt.setText("");
                        employmentStatusTxt.setText("");
                        workingHoursTxt.setText("");
                        salaryTxt.setText("");
                        specializationTxt.setText("");
                        academicQualificationsTxt.setText("");
                        performanceIndexTxt.setText("");
                    }
                });
                
                
                //backButton
                backButton = new JButton("Back");
                backButton.setFont(new Font("Tessan Sans", Font.BOLD, 13));
                backButton.setPreferredSize(new Dimension(150, 30));
                backButton.setBackground(Color.WHITE);
                tutorConstraints.gridx = 2;
                tutorPanel.add(backButton, tutorConstraints);
                backButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent a) {
                        tutorFrame.dispose();
                    }
                });
                
                
                tutorFrame.getContentPane().add(tutorPanel, BorderLayout.CENTER);
                tutorFrame.setVisible(true);
            }
        });
        
                
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    public static void main(String[] args){
        new TeacherGUI();
    }
}