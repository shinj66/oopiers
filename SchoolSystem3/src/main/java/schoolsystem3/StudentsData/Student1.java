package schoolsystem3.StudentsData;

import schoolsystem3.Homepage;
import schoolsystem3.StudentInsideData.Grades.Student1Grades;
import schoolsystem3.StudentInsideData.Attendance.Student1Attendance;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Student1 extends JFrame implements ActionListener {

    private JButton btnAttendance, btnGrades, btnBack;

    private JLabel lblTitle;
    private JLabel lblPersonalTitle;

    // PERSONAL INFO LABELS
    private JLabel lblName;
    private JLabel lblBirthdate;
    private JLabel lblCourse;
    private JLabel lblGender;
    private JLabel lblYear;

    private JPanel pnlPanel, pnlPersonal;

    public Student1() {

        setSize(800, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // ================= BACKGROUND =================
        ImageIcon img = new ImageIcon("C:\\Users\\admin\\Downloads\\pup1.jpg");

        Image scaled = img.getImage().getScaledInstance(800, 750, Image.SCALE_SMOOTH);

        JLabel background = new JLabel(new ImageIcon(scaled));
        background.setLayout(null);

        setContentPane(background);

        // ================= MAIN GLASS PANEL =================
        pnlPanel = new JPanel();
        pnlPanel.setLayout(null);
        pnlPanel.setBounds(120, 60, 560, 500);
        pnlPanel.setBackground(new Color(255, 255, 255, 180));

        background.add(pnlPanel);

        // ================= TITLE =================
        lblTitle = new JLabel("Student Dashboard", SwingConstants.CENTER);
        lblTitle.setBounds(0, 20, 560, 40);
        lblTitle.setFont(new Font("Arial", Font.BOLD, 24));

        pnlPanel.add(lblTitle);

        // ================= GRADES BUTTON =================
        btnGrades = new JButton("Grades");
        btnGrades.setBounds(70, 100, 220, 40);
        btnGrades.setFont(new Font("Arial", Font.BOLD, 18));

        pnlPanel.add(btnGrades);

        // ================= ATTENDANCE BUTTON =================
        btnAttendance = new JButton("Attendance");
        btnAttendance.setBounds(310, 100, 220, 40);
        btnAttendance.setFont(new Font("Arial", Font.BOLD, 18));

        pnlPanel.add(btnAttendance);

        // ================= PERSONAL INFO TITLE =================
        lblPersonalTitle = new JLabel("Personal Information", SwingConstants.CENTER);
        lblPersonalTitle.setBounds(0, 190, 560, 40);
        lblPersonalTitle.setFont(new Font("Arial", Font.BOLD, 20));

        pnlPanel.add(lblPersonalTitle);

        // ================= PERSONAL INFO PANEL =================
        pnlPersonal = new JPanel();
        pnlPersonal.setLayout(null);
        pnlPersonal.setBounds(70, 230, 420, 180);
        pnlPersonal.setBackground(new Color(240, 240, 240, 180));

        pnlPanel.add(pnlPersonal);

        // ================= STUDENT DETAILS =================

        lblName = new JLabel("Name: James Earl Amodia");
        lblName.setBounds(20, 20, 350, 25);
        lblName.setFont(new Font("Arial", Font.PLAIN, 16));

        pnlPersonal.add(lblName);

        lblBirthdate = new JLabel("Birthdate: Nov 28, 2005");
        lblBirthdate.setBounds(20, 50, 350, 25);
        lblBirthdate.setFont(new Font("Arial", Font.PLAIN, 16));

        pnlPersonal.add(lblBirthdate);

        lblCourse = new JLabel("Course: Bachelor of Science in Information Technology");
        lblCourse.setBounds(20, 80, 380, 25);
        lblCourse.setFont(new Font("Arial", Font.PLAIN, 16));

        pnlPersonal.add(lblCourse);

        lblGender = new JLabel("Gender: Male");
        lblGender.setBounds(20, 110, 350, 25);
        lblGender.setFont(new Font("Arial", Font.PLAIN, 16));

        pnlPersonal.add(lblGender);

        lblYear = new JLabel("Year Level: 2nd Year");
        lblYear.setBounds(20, 140, 350, 25);
        lblYear.setFont(new Font("Arial", Font.PLAIN, 16));

        pnlPersonal.add(lblYear);

        // ================= BACK BUTTON =================
        btnBack = new JButton("Back");
        btnBack.setBounds(650, 620, 100, 30);

        background.add(btnBack);

        // ================= ACTION LISTENERS =================
        btnGrades.addActionListener(this);
        btnAttendance.addActionListener(this);
        btnBack.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        dispose();

        if (e.getSource() == btnGrades) {

            new Student1Grades().setVisible(true);
        }

        if (e.getSource() == btnAttendance) {

            new Student1Attendance().setVisible(true);
        }

        if (e.getSource() == btnBack) {

            new Homepage().setVisible(true);
        }
    }
}