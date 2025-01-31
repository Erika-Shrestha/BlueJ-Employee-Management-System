/*all the needed packages are imported*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class TeacherGUI
{
    /*The instances with private modifier, all the instance are used in multiple methods*/
    private JFrame formFrame= new JFrame("23048598ErikaShrestha");
    private JPanel coverPanel= new JPanel();
    private JPanel lecturerPanel= new JPanel();
    private JPanel tutorPanel= new JPanel();
    private ArrayList<Teacher> teachers= new ArrayList<>();
    //A constructor of class TeacherGUI
    public TeacherGUI()
    {
        formFrame.setLayout(new GridLayout(1,1));
        formFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       //This opens the frame until the close button is not pressed
        formFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);              //The frame covers the full screen when code is compiled and runned
        formFrame.setBackground(new Color(73,36,62));
        coverPageComponents();      //calls the coverPage Components
        lecturerPanel.setVisible(false);
        tutorPanel.setVisible(false);
        formFrame.setVisible(true);
    }
    /*A method to store all the components needed for the cover page of frame*/
    public void coverPageComponents()
    {
        coverPanel.setBackground(new Color(219, 219, 219));
        coverPanel.setSize(1300,867);
        coverPanel.setLayout(null);
        formFrame.add(coverPanel);
        
        //the subpanel of mainpanel at center
        JPanel contentPanel= new JPanel();
        contentPanel.setBackground(Color.WHITE);
        contentPanel.setBounds(250,80,800,540);
        contentPanel.setLayout(null);
        coverPanel.add(contentPanel);
        
        /*A welcome paragraph to the users*/
        JLabel bigHeader= new JLabel("WELCOME");
        bigHeader.setFont(new Font("sansSerif",Font.BOLD,50));
        bigHeader.setBounds(270,40,300,60);
        contentPanel.add(bigHeader);
        JLabel smallHeader= new JLabel("to our community");
        smallHeader.setFont(new Font("sansSerif",Font.BOLD,20));
        smallHeader.setBounds(320,90,200,40);
        contentPanel.add(smallHeader);
        JLabel firstLine= new JLabel("Hi there, this is the employment Management form for ING company.");
        firstLine.setFont(new Font("sansSerif",Font.BOLD,15));
        firstLine.setBounds(150,170,500,30);
        contentPanel.add(firstLine);
        
        JLabel secondLine= new JLabel("Employers may assign grade score, remove employees, add new hires,and determine pay");
        secondLine.setFont(new Font("sansSerif",Font.BOLD,15));
        secondLine.setBounds(80,190,700,30);
        contentPanel.add(secondLine);
        
        JLabel thirdline= new JLabel("using this flexible application.");
        thirdline.setFont(new Font("sansSerif",Font.BOLD,15));
        thirdline.setBounds(280,210,300,30);
        contentPanel.add(thirdline);
        
        JLabel forthline= new JLabel("Please press the below any button to fill up the appropriate sections.");
        forthline.setFont(new Font("sansSerif",Font.BOLD,15));
        forthline.setBounds(150,230,600,30);
        contentPanel.add(forthline);
        
        JLabel fifthline= new JLabel("We appreciate your dedication to keeping up with our records.");
        fifthline.setFont(new Font("sansSerif",Font.BOLD,15));
        fifthline.setBounds(180,250,500,30);
        contentPanel.add(fifthline);
        
        /*This button is linked to the another method called the lecturerComponents*/
        JButton lectureButton= new JButton("LECTURER");
        lectureButton.setBackground(new Color(74, 108, 91));
        lectureButton.setForeground(Color.WHITE);
        lectureButton.setFont(new Font("sansSerif",Font.BOLD,15));
        lectureButton.setBorder(null);
        lectureButton.setBounds(180,400,150,40);
        lectureButton.addMouseListener(new MouseListener()      //an anonymous inner class to hover over the buttons
        {
            public void mouseClicked(MouseEvent m)
            {
                lectureButton.setBackground(new Color(188, 214, 179));
                lectureButton.setForeground(new Color(74, 108, 91));
            }
            public void mouseEntered(MouseEvent m)
            {
                lectureButton.setBackground(new Color(188, 214, 179));
                lectureButton.setForeground(new Color(74, 108, 91));
            }
            public void mouseExited(MouseEvent m)
            {
                lectureButton.setBackground(new Color(74, 108, 91));
                lectureButton.setForeground(Color.WHITE);
            }
            public void mousePressed(MouseEvent m)
            {
                lectureButton.setBackground(new Color(188, 214, 179));
                lectureButton.setForeground(new Color(74, 108, 91));
            }
            public void mouseReleased(MouseEvent m)
            {
                lectureButton.setBackground(new Color(74, 108, 91));
                lectureButton.setForeground(Color.WHITE);
            }
        });
        /*The action listener handles the task for the lectureButton to go to lecturer page*/
        lectureButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                coverPanel.setVisible(false);
                formFrame.setLayout(new BorderLayout());
                formFrame.add(lecturerPanel,BorderLayout.CENTER);
                lecturerPanel.setVisible(true);
                lecturerComponents();
            }
        });
        contentPanel.add(lectureButton);
        
        /*The action listener handles the task for the tutorButton to go to tutor page*/
        JButton tutorButton= new JButton("TUTOR");
        tutorButton.setBackground(new Color(74, 108, 91));
        tutorButton.setForeground(Color.WHITE);
        tutorButton.setFont(new Font("sansSerif",Font.BOLD,15));
        tutorButton.setBorder(null);
        tutorButton.setBounds(480,400,150,40);
        tutorButton.addMouseListener(new MouseListener() //an anonymous inner class to hover over the tutorbutton
        {
            public void mouseClicked(MouseEvent m)
            {
                tutorButton.setBackground(new Color(188, 214, 179));
                tutorButton.setForeground(new Color(74, 108, 91));
            }
            public void mouseEntered(MouseEvent m)
            {
                tutorButton.setBackground(new Color(188, 214, 179));
                tutorButton.setForeground(new Color(74, 108, 91));
            }
            public void mouseExited(MouseEvent m)
            {
                tutorButton.setBackground(new Color(74, 108, 91));
                tutorButton.setForeground(Color.WHITE);
            }
            public void mousePressed(MouseEvent m)
            {
                tutorButton.setBackground(new Color(188, 214, 179));
                tutorButton.setForeground(new Color(74, 108, 91));
            }
            public void mouseReleased(MouseEvent m)
            {
                tutorButton.setBackground(new Color(74, 108, 91));
                tutorButton.setForeground(Color.WHITE);
            }
        });
        tutorButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                coverPanel.setVisible(false);
                formFrame.setLayout(new BorderLayout());
                formFrame.add(tutorPanel,BorderLayout.CENTER);
                tutorPanel.setVisible(true);
                tutorComponents();
            }
        });
        contentPanel.add(tutorButton);
        
        /*The full image to act as a background of coverPanel*/
        ImageIcon Image= new ImageIcon("JFRAMEPIC.jpg");
        JLabel background= new JLabel();
        background.setIcon(Image);
        background.setBounds(0,0,1300,867);
        coverPanel.add(background);
    }
    
    /*A method to store all the components needed for lecturer page*/
    public void lecturerComponents()
    {
        lecturerPanel.setBackground(new Color(255,255,240));
        lecturerPanel.setSize(1300,867);
        lecturerPanel.setLayout(null);
        formFrame.add(lecturerPanel);
        
        JPanel detailsPanel= new JPanel();
        detailsPanel.setBackground(new Color(158,172,161));
        detailsPanel.setBounds(500,100,600,450);
        detailsPanel.setLayout(null);
        lecturerPanel.add(detailsPanel);
        detailsPanel.setVisible(false);
        
        //an image to display a demo profile pic when teh display button is clicked
        ImageIcon Image= new ImageIcon("Twitter profile pic.jpg");
        JLabel background= new JLabel();
        background.setIcon(Image);
        background.setBounds(230,20,150,150);
        detailsPanel.add(background);
        
        /*This panel is a dividor to display the contact us page*/
        JPanel contactPanel= new JPanel();
        contactPanel.setBackground(new Color(74, 108, 91));
        contactPanel.setBounds(0,0,320,730);
        contactPanel.setLayout(null);
        lecturerPanel.add(contactPanel);
        
        JLabel titleLabel= new JLabel("CONTACT US");
        titleLabel.setFont(new Font("sansSerif",Font.BOLD,30));
        titleLabel.setForeground(new Color(232, 239, 207));
        titleLabel.setBounds(50,80,200,30);
        contactPanel.add(titleLabel);
        
        JLabel mapEmoji= new JLabel("\uD83D\uDCCD");
        mapEmoji.setForeground(new Color(232, 239, 207));
        mapEmoji.setBounds(20,190,20,30);
        contactPanel.add(mapEmoji);
        JLabel mapDescription= new JLabel("Address: 333 Mahankal marg, Dillibazar");
        mapDescription.setForeground(new Color(232, 239, 207));
        mapDescription.setBounds(60,190,250,30);
        contactPanel.add(mapDescription);
        JLabel mapDescription2= new JLabel("Kathmandu 43700");
        mapDescription2.setForeground(new Color(232, 239, 207));
        mapDescription2.setBounds(120,210,150,30);
        contactPanel.add(mapDescription2);
        JLabel mapDescription3= new JLabel("Nepal");
        mapDescription3.setForeground(new Color(232, 239, 207));
        mapDescription3.setBounds(120,230,50,30);
        contactPanel.add(mapDescription3);
        
        JLabel phoneEmoji= new JLabel("\u260E");
        phoneEmoji.setForeground(new Color(232, 239, 207));
        phoneEmoji.setBounds(20,300,20,30);
        contactPanel.add(phoneEmoji);
        JLabel phoneDescription= new JLabel("Phone: +977 9818085827");
        phoneDescription.setForeground(new Color(232, 239, 207));
        phoneDescription.setBounds(60,300,250,30);
        contactPanel.add(phoneDescription);
        JLabel emailEmoji= new JLabel("\u2709");
        emailEmoji.setForeground(new Color(232, 239, 207));
        emailEmoji.setBounds(20,370,20,30);
        contactPanel.add(emailEmoji);
        JLabel emailDescription= new JLabel("Mail: ingservice@gmail.com");
        emailDescription.setForeground(new Color(232, 239, 207));
        emailDescription.setBounds(60,370,250,30);
        contactPanel.add(emailDescription);
        
        JLabel websiteEmoji= new JLabel("\uD83C\uDF0D");
        websiteEmoji.setForeground(new Color(232, 239, 207));
        websiteEmoji.setBounds(20,440,20,30);
        contactPanel.add(websiteEmoji);
        JLabel websiteDescription= new JLabel("Website: www.ingcompany.com");
        websiteDescription.setForeground(new Color(232, 239, 207));
        websiteDescription.setBounds(60,440,250,30);
        contactPanel.add(websiteDescription);
        
        /*A panel to store the personal details of lecturer*/
        JPanel employeePanel= new JPanel();
        employeePanel.setBackground(new Color(158,172,161));
        employeePanel.setBounds(350,15,900,300);
        employeePanel.setLayout(null);
        lecturerPanel.add(employeePanel);
        
        JLabel employeeLabel= new JLabel("Lecturer Details");
        employeeLabel.setFont(new Font("sansSerif",Font.BOLD,35));
        employeeLabel.setForeground(new Color(16,44,87));
        employeeLabel.setBounds(310,10,300,40);
        employeePanel.add(employeeLabel);
        
        JLabel teacherNameLabel= new JLabel("Name of Teacher *");
        teacherNameLabel.setForeground(new Color(16,44,87));
        teacherNameLabel.setBounds(100,70,150,30);
        employeePanel.add(teacherNameLabel);
        JTextField firstNameField= new JTextField();
        firstNameField.setBorder(null);
        firstNameField.setBounds(100,110,150,30);
        firstNameField.setFont(new Font("sansSerif",Font.BOLD,15));
        employeePanel.add(firstNameField);
        JTextField lastNameField= new JTextField();
        lastNameField.setBorder(null);
        lastNameField.setBounds(260,110,150,30);
        lastNameField.setFont(new Font("sansSerif",Font.BOLD,15));
        employeePanel.add(lastNameField);
        JLabel firstNameLabel= new JLabel("first name");
        firstNameLabel.setForeground(new Color(16,44,87));
        firstNameLabel.setBounds(100,150,100,20);
        employeePanel.add(firstNameLabel);
        JLabel lastNameLabel= new JLabel("last name");
        lastNameLabel.setForeground(new Color(16,44,87));
        lastNameLabel.setBounds(260,150,100,20);
        employeePanel.add(lastNameLabel);
        
        JLabel teacherIdLabel= new JLabel("ID number of Teacher *");
        teacherIdLabel.setBounds(600,70,200,30);
        teacherIdLabel.setForeground(new Color(16,44,87));
        employeePanel.add(teacherIdLabel);
        JTextField idField= new JTextField();
        idField.setBorder(null);
        idField.setBounds(600,110,150,30);
        idField.setFont(new Font("sansSerif",Font.BOLD,15));
        employeePanel.add(idField);
        
        JLabel addressLabel= new JLabel("Address *");
        addressLabel.setForeground(new Color(16,44,87));
        addressLabel.setBounds(100,200,150,30);
        employeePanel.add(addressLabel);
        JTextField addressField= new JTextField();
        addressField.setBorder(null);
        addressField.setBounds(100,240,150,30);
        addressField.setFont(new Font("sansSerif",Font.BOLD,15));
        employeePanel.add(addressField);
        
        JLabel yearsOfExperienceLabel= new JLabel("Years Of Experience(YOE) *");
        yearsOfExperienceLabel.setForeground(new Color(16,44,87));
        yearsOfExperienceLabel.setBounds(600,200,200,30);
        employeePanel.add(yearsOfExperienceLabel);
        JTextField yearsOfExperienceField= new JTextField();
        yearsOfExperienceField.setBorder(null);
        yearsOfExperienceField.setBounds(600,240,150,30);
        yearsOfExperienceField.setFont(new Font("sansSerif",Font.BOLD,15));
        employeePanel.add(yearsOfExperienceField);
        
        /*Another same sized panel to store the work details fo lecturer*/
        JPanel employmentPanel= new JPanel();
        employmentPanel.setBackground(new Color(158,172,161));
        employmentPanel.setBounds(350,325,900,300);
        employmentPanel.setLayout(null);
        lecturerPanel.add(employmentPanel);
        
        JLabel employmentLabel= new JLabel("Employment Details");
        employmentLabel.setFont(new Font("sansSerif",Font.BOLD,35));
        employmentLabel.setForeground(new Color(16,44,87));
        employmentLabel.setBounds(280,5,400,42);
        employmentPanel.add(employmentLabel);
        
        JLabel departmentLabel= new JLabel("Department *");
        departmentLabel.setForeground(new Color(16,44,87));
        departmentLabel.setBounds(100,70,150,30);
        employmentPanel.add(departmentLabel);
        JTextField departmentField= new JTextField();
        departmentField.setBorder(null);
        departmentField.setFont(new Font("sansSerif",Font.BOLD,15));
        departmentField.setBounds(100,110,150,30);
        employmentPanel.add(departmentField);
        
        JLabel workingTypeLabel= new JLabel("Working Type *");
        workingTypeLabel.setForeground(new Color(16,44,87));
        workingTypeLabel.setBounds(600,70,200,30);
        employmentPanel.add(workingTypeLabel);
        JTextField workingTypeField= new JTextField();
        workingTypeField.setBorder(null);
        workingTypeField.setFont(new Font("sansSerif",Font.BOLD,15));
        workingTypeField.setBounds(600,110,150,30);
        employmentPanel.add(workingTypeField);
        
        JLabel employmentStatusLabel= new JLabel("Employment Status *");
        employmentStatusLabel.setForeground(new Color(16,44,87));
        employmentStatusLabel.setBounds(100,190,150,30);
        employmentPanel.add(employmentStatusLabel);
        JTextField employmentStatusField= new JTextField();
        employmentStatusField.setBorder(null);
        employmentStatusField.setFont(new Font("sansSerif",Font.BOLD,15));
        employmentStatusField.setBounds(100,230,150,30);
        employmentPanel.add(employmentStatusField);
        
        JLabel gradedScoreLabel= new JLabel("Graded Score *");
        gradedScoreLabel.setForeground(new Color(16,44,87));
        gradedScoreLabel.setBounds(600,190,200,30);
        employmentPanel.add(gradedScoreLabel);
        JTextField gradedScoreField= new JTextField();
        gradedScoreField.setBorder(null);
        gradedScoreField.setFont(new Font("sansSerif",Font.BOLD,15));
        gradedScoreField.setBounds(600,230,150,30);
        employmentPanel.add(gradedScoreField);
        
        //A JButton to add the lecturer
        JButton addLecturerButton= new JButton("ADD LECTURER");
        addLecturerButton.setBackground(new Color(16,44,87));
        addLecturerButton.setForeground(new Color(255,255,240));
        addLecturerButton.setBounds(360,645,130,40);
        addLecturerButton.setBorder(null);
        addLecturerButton.addMouseListener(new MouseListener()      //a anonymous class to hover over the buttons
        {
            public void mouseClicked(MouseEvent m)
            {
                addLecturerButton.setBackground(new Color(158,172,161));
                addLecturerButton.setForeground(new Color(16,44,87));
            }
            public void mouseEntered(MouseEvent m)
            {
                addLecturerButton.setBackground(new Color(158,172,161));
                addLecturerButton.setForeground(new Color(16,44,87));
            }
            public void mouseExited(MouseEvent m)
            {
                addLecturerButton.setBackground(new Color(16,44,87));
                addLecturerButton.setForeground(new Color(255,255,240));
            }
            public void mousePressed(MouseEvent m)
            {
                addLecturerButton.setBackground(new Color(158,172,161));
                addLecturerButton.setForeground(new Color(16,44,87));
            }
            public void mouseReleased(MouseEvent m)
            {
                addLecturerButton.setBackground(new Color(16,44,87));
                addLecturerButton.setForeground(new Color(255,255,240));
            }
        });
        addLecturerButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                /*exceptional handling used with the try and catch blocks for the number format exception*/
                try
                {   if (firstNameField.getText().isEmpty() || lastNameField.getText().isEmpty() || idField.getText().isEmpty() || addressField.getText().isEmpty() || workingTypeField.getText().isEmpty() ||
                        departmentField.getText().isEmpty() || employmentStatusField.getText().isEmpty() || gradedScoreField.getText().isEmpty() || yearsOfExperienceField.getText().isEmpty())
                    {
                        String info="Please fill the required fields:\n";
                        if(firstNameField.getText().isEmpty())
                        {
                            info += "> first name\n";
                        }
                        if(lastNameField.getText().isEmpty())
                        {
                            info += "> last name\n";
                        }
                        if(idField.getText().isEmpty())
                        {
                            info += "> ID\n";
                        }
                        if(addressField.getText().isEmpty())
                        {
                            info += "> Address\n";
                        }
                        if(departmentField.getText().isEmpty())
                        {   
                            info += "> department\n";
                        }
                        if(workingTypeField.getText().isEmpty())
                        {
                            info += "> working type\n";
                        }
                        if(employmentStatusField.getText().isEmpty())
                        {
                            info += "> employment status\n";
                        }
                        if(gradedScoreField.getText().isEmpty())
                        {
                            info += "> grade score\n";
                        }
                        if(yearsOfExperienceField.getText().isEmpty())
                        {
                            info += "> experience\n";
                        }
                        JOptionPane.showMessageDialog(formFrame,info,"EMPTY FIELD",JOptionPane.WARNING_MESSAGE);
                    }
                    else
                    {
                        //parsing the values of text field
                        int teacherId= Integer.parseInt(idField.getText());
                        String teacherName= firstNameField.getText()+" "+lastNameField.getText();
                        String address= addressField.getText();
                        String workingType= workingTypeField.getText();
                        String employmentStatus= employmentStatusField.getText();
                        int gradedScore= Integer.parseInt(gradedScoreField.getText());
                        int yearsOfExperience= Integer.parseInt(yearsOfExperienceField.getText());
                        int workingHours=0;
                        String department= departmentField.getText();
                        boolean isAdded=false;
                        if(yearsOfExperience<=80 && gradedScore<=100)
                        {
                            //condition to check if the array list is empty
                            if(teachers.isEmpty())
                            {
                                Lecturer lecturers= new Lecturer(teacherId, teacherName, address, workingType, employmentStatus,workingHours,department, yearsOfExperience);
                                lecturers.setgradedScore(gradedScore);
                                teachers.add(lecturers);
                                JOptionPane.showMessageDialog(formFrame,"The lecturer has been added successfully !","Congratulations",JOptionPane.INFORMATION_MESSAGE);
                                isAdded=true;
                            }
                            else
                            {
                                for(Teacher lecturers: teachers)
                                {
                                    if(lecturers instanceof Lecturer)
                                    {
                                        if(lecturers.getteacherId()==Integer.parseInt(idField.getText()))
                                        {
                                            JOptionPane.showMessageDialog(formFrame,"The ID belongs to other lecturer","NOT VALID",JOptionPane.ERROR_MESSAGE);
                                            isAdded=true;
                                        }
                                    }
                                }
                                if(isAdded!=true)
                                {
                                   Lecturer lecturers= new Lecturer(teacherId, teacherName, address, workingType, employmentStatus,workingHours,department, yearsOfExperience);
                                   lecturers.setgradedScore(gradedScore);
                                   teachers.add(lecturers);
                                   JOptionPane.showMessageDialog(formFrame,"The lecturer has been added successfully !","Congratulations",JOptionPane.INFORMATION_MESSAGE);
                                }
                            }
                        }
                        else if(yearsOfExperience>80)
                        {
                            JOptionPane.showMessageDialog(formFrame,"Years Of Experience cannot be more than 80 years!","INVALID NUMBER",JOptionPane.ERROR_MESSAGE);
                        }
                        else if(gradedScore>100)
                        {
                            JOptionPane.showMessageDialog(formFrame,"Grading score cannot be more than 100 marks!","INVALID NUMBER",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
                catch(NumberFormatException n)
                {   
                    JOptionPane.showMessageDialog(formFrame,"DEAR USER,PLEASE INPUT A VALID VALUE !","WARNING",JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        lecturerPanel.add(addLecturerButton);
        
        JButton gradeScoreButton= new JButton("GRADE SCORE");
        gradeScoreButton.setBackground(new Color(16,44,87));
        gradeScoreButton.setForeground(new Color(255,255,240));
        gradeScoreButton.setBounds(510,645,130,40);
        gradeScoreButton.setBorder(null);
        gradeScoreButton.addMouseListener(new MouseListener()
        {
            public void mouseClicked(MouseEvent m)
            {
                gradeScoreButton.setBackground(new Color(158,172,161));
                gradeScoreButton.setForeground(new Color(16,44,87));        
            }
            public void mouseEntered(MouseEvent m)
            {
                gradeScoreButton.setBackground(new Color(158,172,161));
                gradeScoreButton.setForeground(new Color(16,44,87));
            }
            public void mouseExited(MouseEvent m)
            {
                gradeScoreButton.setBackground(new Color(16,44,87));
                gradeScoreButton.setForeground(new Color(255,255,240));
            }
            public void mousePressed(MouseEvent m)
            {
                gradeScoreButton.setBackground(new Color(158,172,161));
                gradeScoreButton.setForeground(new Color(16,44,87));
            }
            public void mouseReleased(MouseEvent m)
            {
                gradeScoreButton.setBackground(new Color(16,44,87));
                gradeScoreButton.setForeground(new Color(255,255,240));
            }
        });
        gradeScoreButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(idField.getText().isEmpty() || departmentField.getText().isEmpty() || gradedScoreField.getText().isEmpty() || yearsOfExperienceField.getText().isEmpty())
                {   
                    String info="Please fill the required fields:\n";
                    if(idField.getText().isEmpty())
                        {
                            info += "> ID\n";
                        }
                    if(departmentField.getText().isEmpty())
                        {   
                            info += "> department\n";
                        }
                    if(gradedScoreField.getText().isEmpty())
                        {
                            info += "> grade score\n";
                        }
                    if(yearsOfExperienceField.getText().isEmpty())
                    {
                        info += "> experience\n";
                    }
                    JOptionPane.showMessageDialog(formFrame,info,"MESSAGE",JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    if(teachers.isEmpty())
                    {
                        JOptionPane.showMessageDialog(formFrame,"You need to first add lecturer to grade a score!","MESSAGE",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {   
                        try
                        {   
                            for(Teacher lecturers: teachers)
                            {                        
                                String info="Please fill in the required fields:\n";
                                if(idField.getText().isEmpty())
                                {
                                        info += " > ID  *A VALID ID*\n";
                                        JOptionPane.showMessageDialog(formFrame,info,"EMPTY FIELD",JOptionPane.WARNING_MESSAGE);
                                }
                                if(lecturers instanceof Lecturer && lecturers.getteacherId()==Integer.parseInt(idField.getText()))
                                {
                                    Lecturer lecturer=(Lecturer)lecturers;
                                    int teacherId= lecturer.getteacherId();
                                    int gradedScore= Integer.parseInt(gradedScoreField.getText());
                                    String department= lecturer.getdepartment();
                                    int yearsOfExperience= Integer.parseInt(yearsOfExperienceField.getText());
                                    
                                    JOptionPane.showMessageDialog(formFrame,"The information regarding the given ID:"+"\n"+"ID:"+teacherId+"\n"+"score:"+gradedScore+
                                    "\n"+"Department:"+department+"\n"+"Experience:"+yearsOfExperience,"DETAILS",JOptionPane.INFORMATION_MESSAGE);
                                    
                                    lecturer.gradedAssignment(gradedScore,department, yearsOfExperience);
                                    JOptionPane.showMessageDialog(formFrame,"The score "+gradedScore+" has been graded !","Congratulations",JOptionPane.INFORMATION_MESSAGE);
                                    
                                }
                                else
                                {   
                                    JOptionPane.showMessageDialog(formFrame,"The ID does not match with our Teachers !","SORRY",JOptionPane.ERROR_MESSAGE);
                                }
                            }
                        }
                        
                        catch(NumberFormatException n)
                        {
                            JOptionPane.showMessageDialog(formFrame,"DEAR USER,PLEASE INPUT A VALID VALUE!","WARNING",JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }   
            }
        });
        lecturerPanel.add(gradeScoreButton);
        
        JButton clearButton= new JButton("CLEAR");
        clearButton.setBackground(new Color(16,44,87));
        clearButton.setForeground(new Color(255,255,240));
        clearButton.setBounds(900,645,120,40);
        clearButton.setBorder(null);
        clearButton.addMouseListener(new MouseListener()
        {
            public void mouseClicked(MouseEvent m)
            {
                clearButton.setBackground(new Color(158,172,161));
                clearButton.setForeground(new Color(16,44,87));        
            }
            public void mouseEntered(MouseEvent m)
            {
                clearButton.setBackground(new Color(158,172,161));
                clearButton.setForeground(new Color(16,44,87));
            }
            public void mouseExited(MouseEvent m)
            {
                clearButton.setBackground(new Color(16,44,87));
                clearButton.setForeground(new Color(255,255,240));
            }
            public void mousePressed(MouseEvent m)
            {
                clearButton.setBackground(new Color(158,172,161));
                clearButton.setForeground(new Color(16,44,87));
            }
            public void mouseReleased(MouseEvent m)
            {
                clearButton.setBackground(new Color(16,44,87));
                clearButton.setForeground(new Color(255,255,240));
            }
        });
        clearButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(firstNameField.getText().isEmpty() && lastNameField.getText().isEmpty() && idField.getText().isEmpty() && addressField.getText().isEmpty() && workingTypeField.getText().isEmpty() &&
                    employmentStatusField.getText().isEmpty() && gradedScoreField.getText().isEmpty() && yearsOfExperienceField.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(formFrame,"There is no text fields to clear !","SORRY",JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    int choice=JOptionPane.showConfirmDialog(formFrame,"Are you sure you want to clear ?","CONFIRMATION",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                    if(choice==JOptionPane.YES_OPTION)
                    {
                        firstNameField.setText("");
                        lastNameField.setText("");
                        idField.setText("");
                        addressField.setText("");
                        yearsOfExperienceField.setText("");
                        departmentField.setText("");
                        workingTypeField.setText("");
                        employmentStatusField.setText("");
                        gradedScoreField.setText(""); 
                        JOptionPane.showMessageDialog(formFrame,"The fields have been cleared !","THANK YOU",JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        });
        lecturerPanel.add(clearButton);
        
        JButton goToTutorPanelButton= new JButton("TUTOR");
        goToTutorPanelButton.setBackground(new Color(170, 154, 138));
        goToTutorPanelButton.setForeground(new Color(255,255,240));
        goToTutorPanelButton.setBounds(1070,660,170,50);
        goToTutorPanelButton.setBorder(null);
        goToTutorPanelButton.addMouseListener(new MouseListener()
        {
            public void mouseClicked(MouseEvent m)
            {
                goToTutorPanelButton.setBackground(new Color(243, 236, 230));
                goToTutorPanelButton.setForeground(new Color(170, 154, 138));        
            }
            public void mouseEntered(MouseEvent m)
            {
                goToTutorPanelButton.setBackground(new Color(243, 236, 230));
                goToTutorPanelButton.setForeground(new Color(170, 154, 138));
            }
            public void mouseExited(MouseEvent m)
            {
                goToTutorPanelButton.setBackground(new Color(170, 154, 138));
                goToTutorPanelButton.setForeground(new Color(255,255,240));
            }
            public void mousePressed(MouseEvent m)
            {
                goToTutorPanelButton.setBackground(new Color(243, 236, 230));
                goToTutorPanelButton.setForeground(new Color(170, 154, 138));
            }
            public void mouseReleased(MouseEvent m)
            {
                goToTutorPanelButton.setBackground(new Color(170, 154, 138));
                goToTutorPanelButton.setForeground(new Color(255,255,240));
            }
        });
        goToTutorPanelButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {   
                firstNameField.setText("");
                lastNameField.setText("");
                idField.setText("");
                addressField.setText("");
                yearsOfExperienceField.setText("");
                departmentField.setText("");
                workingTypeField.setText("");
                employmentStatusField.setText("");
                gradedScoreField.setText("");
                lecturerPanel.setVisible(false);
                tutorPanel.setVisible(true);
                tutorComponents();
                formFrame.add(tutorPanel);
            }
        });
        lecturerPanel.add(goToTutorPanelButton);
        
        JButton displayButton= new JButton("DISPLAY");
        displayButton.setBackground(new Color(16,44,87));
        displayButton.setForeground(new Color(255,255,240));
        displayButton.setBounds(760,645,120,40);
        displayButton.setBorder(null);
        displayButton.addMouseListener(new MouseListener()
        {
            public void mouseClicked(MouseEvent m)
            {
                displayButton.setBackground(new Color(158,172,161));
                displayButton.setForeground(new Color(16,44,87));        
            }
            public void mouseEntered(MouseEvent m)
            {
                displayButton.setBackground(new Color(158,172,161));
                displayButton.setForeground(new Color(16,44,87));
            }
            public void mouseExited(MouseEvent m)
            {
                displayButton.setBackground(new Color(16,44,87));
                displayButton.setForeground(new Color(255,255,240));
            }
            public void mousePressed(MouseEvent m)
            {
                displayButton.setBackground(new Color(158,172,161));
                displayButton.setForeground(new Color(16,44,87));
            }
            public void mouseReleased(MouseEvent m)
            {
                displayButton.setBackground(new Color(16,44,87));
                displayButton.setForeground(new Color(255,255,240));
            }
        });
        displayButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(firstNameField.getText().isEmpty() || lastNameField.getText().isEmpty() || idField.getText().isEmpty() || addressField.getText().isEmpty() || workingTypeField.getText().isEmpty() ||
                    employmentStatusField.getText().isEmpty() || gradedScoreField.getText().isEmpty() || yearsOfExperienceField.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(formFrame,"Please fill in the form to display the information!","MESSAGE",JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    //panel with a picture
                    for (Teacher lecturers: teachers)
                    {
                        if(lecturers instanceof Lecturer)
                        {
                            int choice=JOptionPane.showConfirmDialog(formFrame,"Are you sure you want to display the lecturer details ?","CONFIRMATION",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                            if(choice==JOptionPane.YES_OPTION)
                            {
                                Lecturer lecturer=(Lecturer)lecturers;
                                employeePanel.setVisible(false);
                                employmentPanel.setVisible(false);
                                addLecturerButton.setVisible(false);
                                gradeScoreButton.setVisible(false);
                                displayButton.setVisible(false);
                                clearButton.setVisible(false);
                                goToTutorPanelButton.setVisible(false);
                                detailsPanel.setVisible(true);
                                
                                JLabel detailsTitleLabel=new JLabel("DETAILS");
                                detailsTitleLabel.setBounds(280,190,70,30);
                                detailsPanel.add(detailsTitleLabel);
                                JLabel nameDisplayLabel =new JLabel("NAME :"+" "+lecturer.getteacherName());
                                nameDisplayLabel.setBounds(60,230,200,30);
                                detailsPanel.add(nameDisplayLabel);
                                JLabel idDisplayLabel =new JLabel("ID :"+" "+lecturer.getteacherId());
                                idDisplayLabel.setBounds(60,260,150,30);
                                detailsPanel.add(idDisplayLabel);
                                JLabel addressDisplayLabel =new JLabel("ADDRESS :"+" "+lecturer.getaddress());
                                addressDisplayLabel.setBounds(60,290,200,30);
                                detailsPanel.add(addressDisplayLabel);
                                JLabel  workingTypeDisplayLabel =new JLabel("WORKING TYPE :"+" "+lecturer.getworkingType());
                                workingTypeDisplayLabel.setBounds(340,230,200,30);
                                detailsPanel.add(workingTypeDisplayLabel);
                                JLabel employmentStatusDisplayLabel =new JLabel("EMPLOYMENT STATUS :"+" "+lecturer.getemploymentStatus());
                                employmentStatusDisplayLabel.setBounds(340,260,200,30);
                                detailsPanel.add(employmentStatusDisplayLabel);
                                JLabel gradedScoreDisplayLabel =new JLabel("SCORE GRADED :"+" "+lecturer.getgradedScore());
                                gradedScoreDisplayLabel.setBounds(340,290,150,30);
                                detailsPanel.add(gradedScoreDisplayLabel);
                                JLabel yearsOfExperienceDisplayLabel =new JLabel("EXPERIENCE :"+" "+lecturer.getyearsOfExperience()+" "+"years");
                                yearsOfExperienceDisplayLabel.setBounds(60,320,200,30);
                                detailsPanel.add(yearsOfExperienceDisplayLabel);
                                
                                JButton returnButton= new JButton("BACK");
                                returnButton.setBackground(new Color(74, 108, 91));
                                returnButton.setForeground(Color.WHITE);
                                returnButton.setBounds(450,400,100,30);
                                returnButton.setBorder(null);
                                returnButton.addMouseListener(new MouseListener()
                                {
                                    public void mouseClicked(MouseEvent m)
                                    {
                                        returnButton.setBackground(new Color(188, 214, 179));
                                        returnButton.setForeground(new Color(74, 108, 91));
                                    }
                                    public void mouseEntered(MouseEvent m)
                                    {
                                        returnButton.setBackground(new Color(188, 214, 179));
                                        returnButton.setForeground(new Color(74, 108, 91));
                                    }
                                    public void mouseExited(MouseEvent m)
                                    {
                                        returnButton.setBackground(new Color(74, 108, 91));
                                        returnButton.setForeground(Color.WHITE);
                                    }
                                    public void mousePressed(MouseEvent m)
                                    {
                                        returnButton.setBackground(new Color(188, 214, 179));
                                        returnButton.setForeground(new Color(74, 108, 91));
                                    }
                                    public void mouseReleased(MouseEvent m)
                                    {
                                        returnButton.setBackground(new Color(74, 108, 91));
                                        returnButton.setForeground(Color.WHITE);
                                    }
                                });
                                returnButton.addActionListener(new ActionListener()
                                {
                                    public void actionPerformed(ActionEvent e){
                                        detailsPanel.setVisible(false);
                                        employeePanel.setVisible(true);
                                        employmentPanel.setVisible(true);
                                        addLecturerButton.setVisible(true);
                                        gradeScoreButton.setVisible(true);
                                        displayButton.setVisible(true);
                                        clearButton.setVisible(true);
                                        goToTutorPanelButton.setVisible(true);
                                    }
                                });
                                detailsPanel.add(returnButton);
                            }
                        }
                    }
                }
            }
        });
        lecturerPanel.add(displayButton);
        
        JButton backButton= new JButton("HOME");
        backButton.setFont(new Font("sansSerif",Font.BOLD,15));
        backButton.setBackground(new Color(232, 239, 207));
        backButton.setForeground(new Color(74, 108, 91));
        backButton.setBorder(null);
        backButton.addMouseListener(new MouseListener()
        {
            public void mouseClicked(MouseEvent m)
            {
                backButton.setBackground(new Color(74, 108, 91));
                backButton.setForeground(new Color(232, 239, 207));
            }
            public void mouseEntered(MouseEvent m)
            {
                backButton.setBackground(new Color(74, 108, 91));
                backButton.setForeground(new Color(232, 239, 207));
            }
            public void mouseExited(MouseEvent m)
            {
                backButton.setBackground(new Color(232, 239, 207));
                backButton.setForeground(new Color(74, 108, 91));
            }
            public void mousePressed(MouseEvent m)
            {
                backButton.setBackground(new Color(74, 108, 91));
                backButton.setForeground(new Color(232, 239, 207));
            }
            public void mouseReleased(MouseEvent m)
            {
                backButton.setBackground(new Color(232, 239, 207));
                backButton.setForeground(new Color(74, 108, 91));
            }
        });
        backButton.setBounds(80,560,150,40);
        backButton.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent e)
        {
            firstNameField.setText("");
            lastNameField.setText("");
            idField.setText("");
            addressField.setText("");
            yearsOfExperienceField.setText("");
            departmentField.setText("");
            workingTypeField.setText("");
            employmentStatusField.setText("");
            gradedScoreField.setText("");
            lecturerPanel.setVisible(false);
            coverPanel.setVisible(true);
            coverPageComponents();
        }
        });
        contactPanel.add(backButton);
        
        ImageIcon ImageLecture= new ImageIcon("pexels-bymalens-2268543.jpg");
        JLabel backgroundLectureImage= new JLabel();
        backgroundLectureImage.setIcon(ImageLecture);
        backgroundLectureImage.setBounds(0,0,1300,867);
        lecturerPanel.add(backgroundLectureImage);
    }
        public void tutorComponents(){
        tutorPanel.setBackground(new Color(255,255,240));
        tutorPanel.setSize(1300,867);
        tutorPanel.setLayout(null);
        formFrame.add(tutorPanel);
        //the panel for the display of details
        JPanel detailsPanel= new JPanel();
        detailsPanel.setBackground(new Color(158,172,161));
        detailsPanel.setBounds(500,100,600,450);
        detailsPanel.setLayout(null);
        tutorPanel.add(detailsPanel);
        detailsPanel.setVisible(false);
        
        ImageIcon Image= new ImageIcon("Twitter profile pic.jpg");
        JLabel backgroundTutorImage= new JLabel();
        backgroundTutorImage.setIcon(Image);
        backgroundTutorImage.setBounds(230,20,150,150);
        detailsPanel.add(backgroundTutorImage);
            
        JPanel contactPanel= new JPanel();
        contactPanel.setBackground(new Color(74, 108, 91));
        contactPanel.setBounds(0,0,320,730);
        contactPanel.setLayout(null);
        tutorPanel.add(contactPanel);
        
        JLabel titleLabel= new JLabel("CONTACT US");
        titleLabel.setFont(new Font("sansSerif",Font.BOLD,30));
        titleLabel.setForeground(new Color(232, 239, 207));
        titleLabel.setBounds(50,80,200,30);
        contactPanel.add(titleLabel);
        
        JLabel mapEmoji= new JLabel("\uD83D\uDCCD");
        mapEmoji.setForeground(new Color(232, 239, 207));
        mapEmoji.setBounds(20,190,20,30);
        contactPanel.add(mapEmoji);
        JLabel mapDescription= new JLabel("Address: 333 Mahankal marg, Dillibazar");
        mapDescription.setForeground(new Color(232, 239, 207));
        mapDescription.setBounds(60,190,250,30);
        contactPanel.add(mapDescription);
        JLabel mapDescription2= new JLabel("Kathmandu 43700");
        mapDescription2.setForeground(new Color(232, 239, 207));
        mapDescription2.setBounds(120,210,150,30);
        contactPanel.add(mapDescription2);
        JLabel mapDescription3= new JLabel("Nepal");
        mapDescription3.setForeground(new Color(232, 239, 207));
        mapDescription3.setBounds(120,230,50,30);
        contactPanel.add(mapDescription3);
        
        JLabel phoneEmoji= new JLabel("\u260E");
        phoneEmoji.setForeground(new Color(232, 239, 207));
        phoneEmoji.setBounds(20,300,20,30);
        contactPanel.add(phoneEmoji);
        JLabel phoneDescription= new JLabel("Phone: +977 9818085827");
        phoneDescription.setForeground(new Color(232, 239, 207));
        phoneDescription.setBounds(60,300,250,30);
        contactPanel.add(phoneDescription);
        JLabel emailEmoji= new JLabel("\u2709");
        emailEmoji.setForeground(new Color(232, 239, 207));
        emailEmoji.setBounds(20,370,20,30);
        contactPanel.add(emailEmoji);
        JLabel emailDescription= new JLabel("Mail: ingservice@gmail.com");
        emailDescription.setForeground(new Color(232, 239, 207));
        emailDescription.setBounds(60,370,250,30);
        contactPanel.add(emailDescription);
        
        JLabel websiteEmoji= new JLabel("\uD83C\uDF0D");
        websiteEmoji.setForeground(new Color(232, 239, 207));
        websiteEmoji.setBounds(20,440,20,30);
        contactPanel.add(websiteEmoji);
        JLabel websiteDescription= new JLabel("Website: www.ingcompany.com");
        websiteDescription.setForeground(new Color(232, 239, 207));
        websiteDescription.setBounds(60,440,250,30);
        contactPanel.add(websiteDescription);
        
        //for the form fill up
        JPanel employeePanel= new JPanel();
        employeePanel.setBackground(new Color(158,172,161));
        employeePanel.setBounds(350,15,900,300);
        employeePanel.setLayout(null);
        tutorPanel.add(employeePanel);
        
        JLabel employeeLabel= new JLabel("Tutor Details");
        employeeLabel.setFont(new Font("sansSerif",Font.BOLD,35));
        employeeLabel.setForeground(new Color(16,44,87));
        employeeLabel.setBounds(340,10,300,40);
        employeePanel.add(employeeLabel);
        
        JLabel teacherNameLabel= new JLabel("Name of Teacher *");
        teacherNameLabel.setForeground(new Color(16,44,87));
        teacherNameLabel.setBounds(50,70,150,30);
        employeePanel.add(teacherNameLabel);
        JTextField firstNameField= new JTextField();
        firstNameField.setBorder(null);
        firstNameField.setBounds(50,110,150,30);
        firstNameField.setFont(new Font("sansSerif",Font.BOLD,15));
        employeePanel.add(firstNameField);
        JTextField lastNameField= new JTextField();
        lastNameField.setBorder(null);
        lastNameField.setBounds(210,110,150,30);
        lastNameField.setFont(new Font("sansSerif",Font.BOLD,15));
        employeePanel.add(lastNameField);
        JLabel firstNameLabel= new JLabel("first name");
        firstNameLabel.setForeground(new Color(16,44,87));
        firstNameLabel.setBounds(50,150,100,20);
        employeePanel.add(firstNameLabel);
        JLabel lastNameLabel= new JLabel("last name");
        lastNameLabel.setForeground(new Color(16,44,87));
        lastNameLabel.setBounds(210,150,100,20);
        employeePanel.add(lastNameLabel);
        
        JLabel teacherIdLabel= new JLabel("ID number of Teacher *");
        teacherIdLabel.setBounds(450,70,200,30);
        teacherIdLabel.setForeground(new Color(16,44,87));
        employeePanel.add(teacherIdLabel);
        JTextField idField= new JTextField();
        idField.setBorder(null);
        idField.setBounds(450,110,150,30);
        idField.setFont(new Font("sansSerif",Font.BOLD,15));
        employeePanel.add(idField);
        
        JLabel addressLabel= new JLabel("Address *");
        addressLabel.setForeground(new Color(16,44,87));
        addressLabel.setBounds(100,200,150,30);
        employeePanel.add(addressLabel);
        JTextField addressField= new JTextField();
        addressField.setBorder(null);
        addressField.setBounds(100,240,150,30);
        addressField.setFont(new Font("sansSerif",Font.BOLD,15));
        employeePanel.add(addressField);
        
        JLabel academicQualificationLabel= new JLabel("Academic Qualification *");
        academicQualificationLabel.setForeground(new Color(16,44,87));
        academicQualificationLabel.setBounds(390,200,200,30);
        employeePanel.add(academicQualificationLabel);
        JTextField academicQualificationField= new JTextField();
        academicQualificationField.setBorder(null);
        academicQualificationField.setFont(new Font("sansSerif",Font.BOLD,15));
        academicQualificationField.setBounds(390,240,150,30);
        employeePanel.add(academicQualificationField);
        
        JLabel salaryLabel= new JLabel("Salary *");
        salaryLabel.setForeground(new Color(16,44,87));
        salaryLabel.setBounds(690,70,200,30);
        employeePanel.add(salaryLabel);
        JTextField salaryField= new JTextField();
        salaryField.setBorder(null);
        salaryField.setFont(new Font("sansSerif",Font.BOLD,15));
        salaryField.setBounds(690,110,150,30);
        employeePanel.add(salaryField);    
            
        JLabel performanceIndex= new JLabel("Performance Index *");
        performanceIndex.setBounds(640,200,200,30);
        performanceIndex.setForeground(new Color(16,44,87));
        employeePanel.add(performanceIndex);
        JTextField performanceIndexField= new JTextField();
        performanceIndexField.setBorder(null);
        performanceIndexField.setFont(new Font("sansSerif",Font.BOLD,15));
        performanceIndexField.setBounds(640,240,150,30);
        employeePanel.add(performanceIndexField);
        
        JPanel employmentPanel= new JPanel();
        employmentPanel.setBackground(new Color(158,172,161));
        employmentPanel.setBounds(350,325,900,300);
        employmentPanel.setLayout(null);
        tutorPanel.add(employmentPanel);
        
        JLabel employmentLabel= new JLabel("Employment Details");
        employmentLabel.setFont(new Font("sansSerif",Font.BOLD,35));
        employmentLabel.setForeground(new Color(16,44,87));
        employmentLabel.setBounds(270,5,400,42);
        employmentPanel.add(employmentLabel);
        
        JLabel specializationLabel= new JLabel("Specialization *");
        specializationLabel.setForeground(new Color(16,44,87));
        specializationLabel.setBounds(100,70,150,30);
        employmentPanel.add(specializationLabel);
        JTextField specializationField= new JTextField();
        specializationField.setBorder(null);
        specializationField.setFont(new Font("sansSerif",Font.BOLD,15));
        specializationField.setBounds(100,110,150,30);
        employmentPanel.add(specializationField);
        
        JLabel workingTypeLabel= new JLabel("Working Type *");
        workingTypeLabel.setForeground(new Color(16,44,87));
        workingTypeLabel.setBounds(600,70,200,30);
        employmentPanel.add(workingTypeLabel);
        JTextField workingTypeField= new JTextField();
        workingTypeField.setBorder(null);
        workingTypeField.setFont(new Font("sansSerif",Font.BOLD,15));
        workingTypeField.setBounds(600,110,150,30);
        employmentPanel.add(workingTypeField);
        
        JLabel employmentStatusLabel= new JLabel("Employment Status *");
        employmentStatusLabel.setForeground(new Color(16,44,87));
        employmentStatusLabel.setBounds(110,190,150,30);
        employmentPanel.add(employmentStatusLabel);
        JTextField employmentStatusField= new JTextField();
        employmentStatusField.setBorder(null);
        employmentStatusField.setFont(new Font("sansSerif",Font.BOLD,15));
        employmentStatusField.setBounds(100,230,150,30);
        employmentPanel.add(employmentStatusField);
        
        JLabel workingHourLabel= new JLabel("Working Hours *");
        workingHourLabel.setForeground(new Color(16,44,87));
        workingHourLabel.setBounds(600,190,200,30);
        employmentPanel.add(workingHourLabel);
        JTextField workingHourField= new JTextField();
        workingHourField.setBorder(null);
        workingHourField.setFont(new Font("sansSerif",Font.BOLD,15));
        workingHourField.setBounds(600,230,150,30);
        employmentPanel.add(workingHourField);
        
        JButton addTutorButton= new JButton("ADD TUTOR");
        addTutorButton.setBackground(new Color(16,44,87));
        addTutorButton.setForeground(new Color(255,255,240));
        addTutorButton.setBounds(355,645,130,40);
        addTutorButton.setBorder(null);
        addTutorButton.addMouseListener(new MouseListener()
        {
            public void mouseClicked(MouseEvent m)
            {
                addTutorButton.setBackground(new Color(158,172,161));
                addTutorButton.setForeground(new Color(16,44,87));        
            }
            public void mouseEntered(MouseEvent m)
            {
                addTutorButton.setBackground(new Color(158,172,161));
                addTutorButton.setForeground(new Color(16,44,87));
            }
            public void mouseExited(MouseEvent m)
            {
                addTutorButton.setBackground(new Color(16,44,87));
                addTutorButton.setForeground(new Color(255,255,240));
            }
            public void mousePressed(MouseEvent m)
            {
                addTutorButton.setBackground(new Color(158,172,161));
                addTutorButton.setForeground(new Color(16,44,87));
            }
            public void mouseReleased(MouseEvent m)
            {
                addTutorButton.setBackground(new Color(16,44,87));
                addTutorButton.setForeground(new Color(255,255,240));
            }
        });
        addTutorButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    if(firstNameField.getText().isEmpty() || lastNameField.getText().isEmpty() || idField.getText().isEmpty() || addressField.getText().isEmpty() || academicQualificationField.getText().isEmpty()
                        || salaryField.getText().isEmpty() || performanceIndexField.getText().isEmpty() ||specializationField.getText().isEmpty() || workingTypeField.getText().isEmpty() || employmentStatusField.getText().isEmpty() || workingHourField.getText().isEmpty())
                    {
                        String info="Please fill the required fields:\n";
                        if(firstNameField.getText().isEmpty())
                        {
                            info += "> First name\n";
                        }
                        if(lastNameField.getText().isEmpty())
                        {
                            info += "> Last name\n";
                        }
                        if(idField.getText().isEmpty())
                        {
                            info += "> ID\n";
                        }
                        if(addressField.getText().isEmpty())
                        {
                            info += "> Address\n";
                        }
                        if(academicQualificationField.getText().isEmpty())
                        {
                            info += "> Academic Qualification\n";
                        }
                        if(salaryField.getText().isEmpty())
                        {
                            info += "> Salary\n";
                        }
                        if(performanceIndexField.getText().isEmpty())
                        {
                            info += "> Performance index\n";
                        }
                        if(specializationField.getText().isEmpty())
                        {
                            info += "> Specialization\n";
                        }
                        if(workingTypeField.getText().isEmpty())
                        {
                            info += "> Working type\n";
                        }
                        if(employmentStatusField.getText().isEmpty())
                        {
                            info += "> Employment status\n";
                        }
                        if(workingHourField.getText().isEmpty())
                        {
                            info += "> Working Hours\n";
                        }
                        JOptionPane.showMessageDialog(formFrame,info,"EMPTY FIELD",JOptionPane.WARNING_MESSAGE);
                    }
                    else
                    {
                        int teacherId= Integer.parseInt(idField.getText());
                        String teacherName= firstNameField.getText()+" "+lastNameField.getText();
                        String address= addressField.getText();
                        String workingType= workingTypeField.getText();
                        String employmentStatus= employmentStatusField.getText();
                        int workingHours= Integer.parseInt(workingHourField.getText());
                        int salary=(int)Double.parseDouble(salaryField.getText()); 
                        String specialization= specializationField.getText();
                        String academicQualifications= academicQualificationField.getText();
                        int performanceIndex=Integer.parseInt(performanceIndexField.getText());
                        boolean isAdded=false;
                        if(performanceIndex<=10 && workingHours<=24 && salary<1000000)
                        {
                            if(teachers.isEmpty())
                            {
                                Tutor tutors= new Tutor(teacherId,teacherName, address, workingType,employmentStatus, workingHours, salary,specialization,academicQualifications,performanceIndex);
                                teachers.add(tutors);
                                JOptionPane.showMessageDialog(formFrame,"The Tutor has been added successfully !","Congratulations",JOptionPane.INFORMATION_MESSAGE);
                                isAdded=true;
                            }
                            else
                            {
                                for(Teacher tutors: teachers)
                                {
                                    if(tutors instanceof Tutor)
                                    {
                                        if(tutors.getteacherId()==Integer.parseInt(idField.getText()))
                                        {
                                            JOptionPane.showMessageDialog(formFrame,"The ID belongs to other Tutor! ","NOT VALID",JOptionPane.ERROR_MESSAGE);
                                            isAdded=true;
                                        }
                                    }
                                }
                                if(isAdded!=true)
                                {
                                    Tutor tutors= new Tutor(teacherId,teacherName, address, workingType,employmentStatus, workingHours, salary,specialization,academicQualifications,performanceIndex);
                                    teachers.add(tutors);
                                    JOptionPane.showMessageDialog(formFrame,"The Tutor has been added successfully !","Congratulations",JOptionPane.INFORMATION_MESSAGE);
                                }
                            }
                        }
                        else if(performanceIndex>10)
                        {
                            JOptionPane.showMessageDialog(formFrame,"Performance Index should be given out of 10!","INVALID NUMBER",JOptionPane.ERROR_MESSAGE);
                        }
                        else if(salary>1000000)
                        {
                            JOptionPane.showMessageDialog(formFrame,"Salary must be of 6 digits!","INVALID NUMBER",JOptionPane.ERROR_MESSAGE);
                        }
                        else if(workingHours>24)
                        {
                            JOptionPane.showMessageDialog(formFrame,"Working hour cannot be more than 24 hours!","INVALID NUMBER",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
                catch(NumberFormatException n)
                {
                    JOptionPane.showMessageDialog(formFrame,"DEAR USER,PLEASE INPUT A VALID VALUE!","WARNING",JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        tutorPanel.add(addTutorButton);
        
        
        JButton setSalaryButton= new JButton("SET SALARY");
        setSalaryButton.setBackground(new Color(16,44,87));
        setSalaryButton.setForeground(new Color(255,255,240));
        setSalaryButton.setBounds(510,645,130,40);
        setSalaryButton.setBorder(null);
        setSalaryButton.addMouseListener(new MouseListener()
        {
            public void mouseClicked(MouseEvent m)
            {
                setSalaryButton.setBackground(new Color(158,172,161));
                setSalaryButton.setForeground(new Color(16,44,87));        
            }
            public void mouseEntered(MouseEvent m)
            {
                setSalaryButton.setBackground(new Color(158,172,161));
                setSalaryButton.setForeground(new Color(16,44,87));
            }
            public void mouseExited(MouseEvent m)
            {
                setSalaryButton.setBackground(new Color(16,44,87));
                setSalaryButton.setForeground(new Color(255,255,240));
            }
            public void mousePressed(MouseEvent m)
            {
                setSalaryButton.setBackground(new Color(158,172,161));
                setSalaryButton.setForeground(new Color(16,44,87));
            }
            public void mouseReleased(MouseEvent m)
            {
                setSalaryButton.setBackground(new Color(16,44,87));
                setSalaryButton.setForeground(new Color(255,255,240));
            }
        });
        setSalaryButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(idField.getText().isEmpty() || salaryField.getText().isEmpty() || performanceIndexField.getText().isEmpty())
                {   
                    String info="Please fill the required fields:\n";
                    if(idField.getText().isEmpty())
                        {
                            info += "> ID\n";
                        }
                    if(salaryField.getText().isEmpty())
                        {   
                            info += "> salary\n";
                        }
                    if(performanceIndexField.getText().isEmpty())
                        {
                            info += "> grade score\n";
                        }
                    JOptionPane.showMessageDialog(formFrame,info,"MESSAGE",JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    if(teachers.isEmpty())
                    {
                        JOptionPane.showMessageDialog(formFrame,"You need to first add tutor to set a new salary!","MESSAGE",JOptionPane.INFORMATION_MESSAGE);
                    }
                    try
                    {
                        for (Teacher tutors: teachers){
                            if(idField.getText().isEmpty()|| salaryField.getText().isEmpty()|| performanceIndexField.getText().isEmpty() )
                            {
                                String info="Please fill in the fields:\n";
                                if(idField.getText().isEmpty()){
                                    info +="ID  *A VALID ID*\n";
                                }
                                if(salaryField.getText().isEmpty()){
                                    info +="Salary\n";
                                }
                                if(performanceIndexField.getText().isEmpty()){
                                    info +="Performance\n";
                                }
                                JOptionPane.showMessageDialog(formFrame,info,"Empty Field",JOptionPane.ERROR_MESSAGE);
                            }
                            if(tutors instanceof Tutor && tutors.getteacherId()==Integer.parseInt(idField.getText()))
                            {
                                Tutor tutor=(Tutor)tutors;
                                int teacherId= tutor.getteacherId();
                                double salary= Integer.parseInt(salaryField.getText());
                                int performanceIndex= Integer.parseInt(performanceIndexField.getText());
                                if(tutors.getworkingHours()>20 && performanceIndex>5)
                                {
            
                                    //narrow type casting
                                    int newSalary= (int) salary;
                                    
                                    JOptionPane.showMessageDialog(formFrame,"The information of the ID:"+"\n"+"ID:"+teacherId+"\n"+"Salary:"+newSalary+
                                    "\n"+"Performance index:"+performanceIndex,"DETAILS",JOptionPane.INFORMATION_MESSAGE);
                                    tutor.setsalary(salary,performanceIndex);
                                    
                                    JOptionPane.showMessageDialog(formFrame,"The salary "+newSalary+" has been set for the tutor","CONGRATULATIONS!",JOptionPane.INFORMATION_MESSAGE);
                                }
                                else if(tutors.getworkingHours()<=20)
                                {
                                    JOptionPane.showMessageDialog(formFrame,"As the tutor with the given id has less working hours than minimum 21 hours, the salary cannot be set!","SORRY!",JOptionPane.INFORMATION_MESSAGE);
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(formFrame,"As the tutor with the given id has less performance index than 5, the salary cannot be set!","SORRY!",JOptionPane.INFORMATION_MESSAGE);
                                }
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(formFrame,"The ID does not match with our Tutors","SORRY",JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    }
                    catch(NumberFormatException n)
                    {
                        JOptionPane.showMessageDialog(formFrame,"DEAR USER,PLEASE INPUT A VALID VALUE!","WARNING",JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
        });
        tutorPanel.add(setSalaryButton);
        
        JButton removeButton= new JButton("REMOVE TUTOR");
        removeButton.setBackground(new Color(16,44,87));
        removeButton.setForeground(new Color(255,255,240));
        removeButton.setBounds(665,645,130,40);
        removeButton.setBorder(null);
        removeButton.addMouseListener(new MouseListener()
        {
            public void mouseClicked(MouseEvent m)
            {
                removeButton.setBackground(new Color(158,172,161));
                removeButton.setForeground(new Color(16,44,87));        
            }
            public void mouseEntered(MouseEvent m)
            {
                removeButton.setBackground(new Color(158,172,161));
                removeButton.setForeground(new Color(16,44,87));
            }
            public void mouseExited(MouseEvent m)
            {
                removeButton.setBackground(new Color(16,44,87));
                removeButton.setForeground(new Color(255,255,240));
            }
            public void mousePressed(MouseEvent m)
            {
                removeButton.setBackground(new Color(158,172,161));
                removeButton.setForeground(new Color(16,44,87));
            }
            public void mouseReleased(MouseEvent m)
            {
                removeButton.setBackground(new Color(16,44,87));
                removeButton.setForeground(new Color(255,255,240));
            }
        });
        removeButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(idField.getText().isEmpty())
                {   
                    String info="Please fill the required fields:\n";
                    if(idField.getText().isEmpty())
                        {
                            info += "> ID\n";
                        }
                    JOptionPane.showMessageDialog(formFrame,info,"MESSAGE",JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    if(teachers.isEmpty())
                    {   
                        JOptionPane.showMessageDialog(formFrame,"There are no tutors to remove!","MESSAGE",JOptionPane.INFORMATION_MESSAGE);
                    }  
                    else
                    {
                        try
                        {
                            for(Teacher tutors: teachers)
                            {
                                String info="Please fill in the fields:\n";
                                if(idField.getText().isEmpty()){
                                    info +="ID  *A VALID ID*\n";
                                    JOptionPane.showMessageDialog(formFrame,info,"Empty Field",JOptionPane.ERROR_MESSAGE);
                                }
                                if(tutors instanceof Tutor && tutors.getteacherId()==Integer.parseInt(idField.getText()))
                                {
                                    Tutor tutor=(Tutor)tutors;
                                    int teacherId= tutor.getteacherId();
                                    double salary= tutor.getsalary();
                                    int performanceIndex= tutor.getperformanceIndex();
                                    String specialization= tutor.getspecialization();
                                    String academicQualifications=tutor.getacademicQualifications();
                                    int choice=JOptionPane.showConfirmDialog(formFrame,"Are you sure you want to remove the mentioned tutor\n?"+" > ID:"+" "+teacherId+"\n"+" > Academic Qualifications:"+" "+academicQualifications+"\n"
                                    +" > Salary:"+" "+salary+"\n"+" > Performance Index:"+" "+performanceIndex+"\n"+" > Specialization:"+" "+specialization+"\n","CONFIRMATION",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                                    if(choice==JOptionPane.YES_OPTION)
                                    {
                                        tutor.removeTutor();
                                        JOptionPane.showMessageDialog(formFrame,"The tutor has been removed","MESSAGE",JOptionPane.INFORMATION_MESSAGE);
                                    }
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(formFrame,"The ID does not match with our Tutors","SORRY",JOptionPane.ERROR_MESSAGE);
                                }
                            }
                        }
                        catch(NumberFormatException n)
                        {
                            JOptionPane.showMessageDialog(formFrame,"DEAR USER,PLEASE INPUT A VALID VALUE!","WARNING",JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
            }
        });
        tutorPanel.add(removeButton);
        //clears all the text fields
        JButton clearButton= new JButton("CLEAR");
        clearButton.setBackground(new Color(16,44,87));
        clearButton.setForeground(new Color(255,255,240));
        clearButton.setBounds(900,683,100,40);
        clearButton.setBorder(null);
        clearButton.addMouseListener(new MouseListener()
        {
            public void mouseClicked(MouseEvent m)
            {
                clearButton.setBackground(new Color(158,172,161));
                clearButton.setForeground(new Color(16,44,87));        
            }
            public void mouseEntered(MouseEvent m)
            {
                clearButton.setBackground(new Color(158,172,161));
                clearButton.setForeground(new Color(16,44,87));
            }
            public void mouseExited(MouseEvent m)
            {
                clearButton.setBackground(new Color(16,44,87));
                clearButton.setForeground(new Color(255,255,240));
            }
            public void mousePressed(MouseEvent m)
            {
                clearButton.setBackground(new Color(158,172,161));
                clearButton.setForeground(new Color(16,44,87));
            }
            public void mouseReleased(MouseEvent m)
            {
                clearButton.setBackground(new Color(16,44,87));
                clearButton.setForeground(new Color(255,255,240));
            }
        });
        clearButton.addActionListener(new ActionListener()
        {
            public void actionPerformed (ActionEvent e)
            {
                if(firstNameField.getText().isEmpty() && lastNameField.getText().isEmpty() && idField.getText().isEmpty() && addressField.getText().isEmpty() && academicQualificationField.getText().isEmpty() 
                    && salaryField.getText().isEmpty() && performanceIndexField.getText().isEmpty() && specializationField.getText().isEmpty() && workingTypeField.getText().isEmpty() &&
                    employmentStatusField.getText().isEmpty() && workingHourField.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(formFrame,"There is no text fields to clear !","SORRY",JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    int choice=JOptionPane.showConfirmDialog(formFrame,"Are you sure you want to clear ?","CONFIRMATION",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                    if(choice==JOptionPane.YES_OPTION)
                    {
                        firstNameField.setText("");
                        lastNameField.setText("");
                        idField.setText("");
                        addressField.setText("");
                        academicQualificationField.setText("");
                        salaryField.setText("");
                        performanceIndexField.setText("");
                        specializationField.setText("");
                        workingTypeField.setText("");
                        employmentStatusField.setText("");
                        workingHourField.setText("");
                        JOptionPane.showMessageDialog(formFrame,"The fields have been cleared","THANK YOU",JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        });
        tutorPanel.add(clearButton);
        
        JButton goToLectureButton= new JButton("LECTURER");
        goToLectureButton.setBackground(new Color(170, 154, 138));
        goToLectureButton.setForeground(new Color(255,255,240));
        goToLectureButton.setBounds(1070,660,170,50);
        goToLectureButton.setBorder(null);
        goToLectureButton.addMouseListener(new MouseListener()
        {
            public void mouseClicked(MouseEvent m)
            {
                goToLectureButton.setBackground(new Color(243, 236, 230));
                goToLectureButton.setForeground(new Color(170, 154, 138));        
            }
            public void mouseEntered(MouseEvent m)
            {
                goToLectureButton.setBackground(new Color(243, 236, 230));
                goToLectureButton.setForeground(new Color(170, 154, 138));
            }
            public void mouseExited(MouseEvent m)
            {
                goToLectureButton.setBackground(new Color(170, 154, 138));
                goToLectureButton.setForeground(new Color(255,255,240));
            }
            public void mousePressed(MouseEvent m)
            {
                goToLectureButton.setBackground(new Color(243, 236, 230));
                goToLectureButton.setForeground(new Color(170, 154, 138));
            }
            public void mouseReleased(MouseEvent m)
            {
                goToLectureButton.setBackground(new Color(170, 154, 138));
                goToLectureButton.setForeground(new Color(255,255,240));
            }
        });
        goToLectureButton.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent e)
        {
            firstNameField.setText("");
            lastNameField.setText("");
            idField.setText("");
            addressField.setText("");
            academicQualificationField.setText("");
            salaryField.setText("");
            performanceIndexField.setText("");
            specializationField.setText("");
            workingTypeField.setText("");
            employmentStatusField.setText("");
            workingHourField.setText("");
            tutorPanel.setVisible(false);
            lecturerPanel.setVisible(true);
            lecturerComponents();
            formFrame.add(lecturerPanel);
        }
        });
        tutorPanel.add(goToLectureButton);
        //displayes the details of the object
        JButton displayButton= new JButton("DISPLAY");
        displayButton.setBackground(new Color(16,44,87));
        displayButton.setForeground(new Color(255,255,240));
        displayButton.setBounds(900,633,100,40);
        displayButton.setBorder(null);
        displayButton.addMouseListener(new MouseListener()
        {
            public void mouseClicked(MouseEvent m)
            {
                displayButton.setBackground(new Color(158,172,161));
                displayButton.setForeground(new Color(16,44,87));        
            }
            public void mouseEntered(MouseEvent m)
            {
                displayButton.setBackground(new Color(158,172,161));
                displayButton.setForeground(new Color(16,44,87));
            }
            public void mouseExited(MouseEvent m)
            {
                displayButton.setBackground(new Color(16,44,87));
                displayButton.setForeground(new Color(255,255,240));
            }
            public void mousePressed(MouseEvent m)
            {
                displayButton.setBackground(new Color(158,172,161));
                displayButton.setForeground(new Color(16,44,87));
            }
            public void mouseReleased(MouseEvent m)
            {
                displayButton.setBackground(new Color(16,44,87));
                displayButton.setForeground(new Color(255,255,240));
            }
        });
        displayButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
               if(firstNameField.getText().isEmpty() || lastNameField.getText().isEmpty() || idField.getText().isEmpty() || addressField.getText().isEmpty() || academicQualificationField.getText().isEmpty()
                   || salaryField.getText().isEmpty() || performanceIndexField.getText().isEmpty() ||specializationField.getText().isEmpty() || workingTypeField.getText().isEmpty() || employmentStatusField.getText().isEmpty() || workingHourField.getText().isEmpty())
               {
                    JOptionPane.showMessageDialog(formFrame,"Please fill in the form to display the information!","MESSAGE",JOptionPane.ERROR_MESSAGE);
                }
               else
               { 
                    for (Teacher tutors: teachers)
                    {
                        if(tutors instanceof Tutor)
                        {
                            int choice=JOptionPane.showConfirmDialog(formFrame,"Are you sure you want to display?","CONFIRMATION",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                            if(choice==JOptionPane.YES_OPTION)
                            {
                                Tutor tutor= (Tutor)tutors;
                                employeePanel.setVisible(false);
                                employmentPanel.setVisible(false);
                                addTutorButton.setVisible(false);
                                setSalaryButton.setVisible(false);
                                removeButton.setVisible(false);
                                displayButton.setVisible(false);
                                clearButton.setVisible(false);
                                goToLectureButton.setVisible(false);
                                detailsPanel.setVisible(true);
                                
                                JLabel titleLabel= new JLabel("DETAILS");
                                titleLabel.setBounds(280,190,70,30);
                                detailsPanel.add(titleLabel);
                                JLabel nameDisplayLabel =new JLabel("NAME :"+" "+tutor.getteacherName());
                                nameDisplayLabel.setBounds(60,230,200,30);
                                detailsPanel.add(nameDisplayLabel);
                                JLabel idDisplayLabel =new JLabel("ID :"+" "+tutor.getteacherId());
                                idDisplayLabel.setBounds(60,260,150,30);
                                detailsPanel.add(idDisplayLabel);
                                JLabel addressDisplayLabel =new JLabel("ADDRESS :"+" "+tutor.getaddress());
                                addressDisplayLabel.setBounds(60,290,200,30);
                                detailsPanel.add(addressDisplayLabel);
                                JLabel academicQualificationDisplayLabel =new JLabel("ACADEMIC QUALIFICATION :"+" "+tutor.getacademicQualifications());
                                academicQualificationDisplayLabel.setBounds(60,320,200,30);
                                detailsPanel.add(academicQualificationDisplayLabel);
                                JLabel salaryDisplayLabel =new JLabel("SALARY :"+" "+tutor.getsalary());
                                salaryDisplayLabel.setBounds(330,350,200,30);
                                detailsPanel.add(salaryDisplayLabel);
                                JLabel performanceIndexDisplayLabel =new JLabel("PERFORMANCE INDEX :"+" "+tutor.getperformanceIndex());
                                performanceIndexDisplayLabel.setBounds(60,350,200,30);
                                detailsPanel.add(performanceIndexDisplayLabel);
                                JLabel specializationDisplayLabel =new JLabel("SPECIALIZATION :"+" "+tutor.getspecialization());
                                specializationDisplayLabel.setBounds(330,230,200,30);
                                detailsPanel.add(specializationDisplayLabel);
                                JLabel  workingTypeDisplayLabel =new JLabel("WORKING TYPE :"+" "+tutor.getworkingType());
                                workingTypeDisplayLabel.setBounds(330,260,200,30);
                                detailsPanel.add(workingTypeDisplayLabel);
                                JLabel employmentStatusDisplayLabel =new JLabel("EMPLOYMENT STATUS :"+" "+tutor.getemploymentStatus());
                                employmentStatusDisplayLabel.setBounds(330,290,200,30);
                                detailsPanel.add(employmentStatusDisplayLabel);
                                JLabel workingHoursDisplayLabel =new JLabel("WORKING HOURS :"+" "+tutor.getworkingHours()+" "+"hour");
                                workingHoursDisplayLabel.setBounds(330,320,200,30);
                                detailsPanel.add(workingHoursDisplayLabel);
                                
                                JButton returnButton= new JButton("BACK");
                                returnButton.setBackground(new Color(74, 108, 91));
                                returnButton.setForeground(Color.WHITE);
                                returnButton.setBounds(450,400,100,30);
                                returnButton.setBorder(null);
                                returnButton.addMouseListener(new MouseListener(){
                                    public void mouseClicked(MouseEvent m){
                                        returnButton.setBackground(new Color(188, 214, 179));
                                        returnButton.setForeground(new Color(74, 108, 91));
                                    
                                    }
                                    public void mouseEntered(MouseEvent m){
                                        returnButton.setBackground(new Color(188, 214, 179));
                                        returnButton.setForeground(new Color(74, 108, 91));
                                    
                                    }
                                    public void mouseExited(MouseEvent m){
                                        returnButton.setBackground(new Color(74, 108, 91));
                                        returnButton.setForeground(Color.WHITE);
                                    
                                    }
                                    public void mousePressed(MouseEvent m){
                                        returnButton.setBackground(new Color(188, 214, 179));
                                        returnButton.setForeground(new Color(74, 108, 91));
                                    
                                    }
                                    public void mouseReleased(MouseEvent m){
                                        returnButton.setBackground(new Color(74, 108, 91));
                                        returnButton.setForeground(Color.WHITE);
                                    
                                    }
                                });
                                returnButton.addActionListener(new ActionListener()
                                {
                                    public void actionPerformed(ActionEvent e){
                                        detailsPanel.setVisible(false);
                                        employeePanel.setVisible(true);
                                        employmentPanel.setVisible(true);
                                        addTutorButton.setVisible(true);
                                        setSalaryButton.setVisible(true);
                                        removeButton.setVisible(true);
                                        displayButton.setVisible(true);
                                        clearButton.setVisible(true);
                                        goToLectureButton.setVisible(true);
                                        }
                                    });
                                detailsPanel.add(returnButton);
                                }
                        }
                    }
                }
            }
        });
        tutorPanel.add(displayButton);
        
        //directs to the home page
        JButton backButton= new JButton("HOME");
        backButton.setFont(new Font("sansSerif",Font.BOLD,15));
        backButton.setBackground(new Color(232, 239, 207));
        backButton.setForeground(new Color(74, 108, 91));
        backButton.setBorder(null);
        backButton.setBorder(null);
        backButton.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent m){
                backButton.setBackground(new Color(74, 108, 91));
                backButton.setForeground(new Color(232, 239, 207));
            }
            public void mouseEntered(MouseEvent m){
                backButton.setBackground(new Color(74, 108, 91));
                backButton.setForeground(new Color(232, 239, 207));
            }
            public void mouseExited(MouseEvent m){
                backButton.setBackground(new Color(232, 239, 207));
                backButton.setForeground(new Color(74, 108, 91));
            }
            public void mousePressed(MouseEvent m){
                backButton.setBackground(new Color(74, 108, 91));
                backButton.setForeground(new Color(232, 239, 207));
            }
            public void mouseReleased(MouseEvent m){
                backButton.setBackground(new Color(232, 239, 207));
                backButton.setForeground(new Color(74, 108, 91));
            }
        });
        backButton.setBounds(80,560,150,40);
        backButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            firstNameField.setText("");
            lastNameField.setText("");
            idField.setText("");
            addressField.setText("");
            academicQualificationField.setText("");
            salaryField.setText("");
            performanceIndexField.setText("");
            specializationField.setText("");
            workingTypeField.setText("");
            employmentStatusField.setText("");
            workingHourField.setText("");
            tutorPanel.setVisible(false);
            coverPanel.setVisible(true);
            coverPageComponents();
        }
        });
        contactPanel.add(backButton);
        
        ImageIcon ImageTutor= new ImageIcon("pexels-bymalens-2268543.jpg");
        JLabel backgroundTutor= new JLabel();
        backgroundTutor.setIcon(ImageTutor);
        backgroundTutor.setBounds(0,0,1300,867);
        tutorPanel.add(backgroundTutor);
    }
    public static void main(String[]args)
    {
        TeacherGUI object= new TeacherGUI();
    }
}