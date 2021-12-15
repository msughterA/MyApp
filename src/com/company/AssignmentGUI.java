package com.company;

import javax.swing.*;
import java.awt.*;

public class AssignmentGUI {
    public static  void main(String[] args){
        UIComponents components=new UIComponents();
        //Layout
        JPanel layout=new JPanel(new GridLayout(20,5));
        for (int i=0; i<UIComponents.components.length;i++){
            layout.add((Component) UIComponents.components[i]);
        }

        //Adding layout on the window
        components.getContentPane().add(layout,BorderLayout.WEST);

        //Give it a size
        components.setSize(1000,1000);

        //Make the component visible
        components.setVisible(true);
    }
}


class UIComponents extends JFrame{
    private JLabel firstNameLb;
    private JTextField firstTextFeild;
    private JLabel surnameLb;
    private JLabel departmentLb;
    private JTextField departmentTextFeild;
    private JTextField surnameTextFeild;
    private JLabel dateOfbirth;
    private  JLabel year;
    private JLabel month;
    private JLabel day;
    private JTextField dateOfbirthFeild;
    private JTextField dateOfbirthFeild1;
    private  JTextField dateOfbirthFeild2;

    //initializing the buttons
    private JButton okay;
    private JButton submit;

    public static Object[] components;
    UIComponents(){
        super("NAME: ONYEMENAM CHARLES CHUKWUDUBEM   REG NO: 20171049525");
        firstNameLb=new JLabel("First Name");
        firstTextFeild=new JTextField(70);
        surnameLb=new JLabel("SurName");
        surnameTextFeild=new JTextField();
        departmentLb=new JLabel("Department");
        departmentTextFeild=new JTextField();
        okay=new JButton("Okay");
        submit=new JButton("Submit");
        dateOfbirth=new JLabel("Date of Birth");
        year=new JLabel("year");
        month=new JLabel("month");
        day=new JLabel("day");
        dateOfbirthFeild=new JTextField();
        dateOfbirthFeild1=new JTextField();
        dateOfbirthFeild2=new JTextField();
        components= new Object[]{
                firstNameLb,
                firstTextFeild,
                surnameLb,
                surnameTextFeild,
                departmentLb,
                departmentTextFeild,
                dateOfbirth,
                month,
                dateOfbirthFeild,
                year,
                dateOfbirthFeild1,
                day,
                dateOfbirthFeild2,
                okay,
                submit
        };
    }
}