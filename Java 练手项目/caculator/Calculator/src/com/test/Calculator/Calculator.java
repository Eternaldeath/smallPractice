package com.test.Calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.util.FormatFlagsConversionMismatchException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Calculator implements ActionListener{
	JFrame jFrame = new JFrame("简易计算器");
	// 用于存放数字区域
	JPanel panel = new JPanel();
	// 用于存放显示框和 clear 键
	JPanel panel2 = new JPanel();
	// 结果集
	String result = "";
	
	// 操作数1
	String number1 ="";
	// 操作数2
	String number2 ="";
	// 操作符
	String operator = "";
	
	// 操作数字符串转换成数字
	double num1 = 0.0;
	double num2 = 0.0;

	
	JTextField result_TestField = new JTextField(result,20);
	


	JButton clear_Button = new JButton("clear");
	
	JButton button0 = new JButton("0");
	JButton button1 = new JButton("1");
	JButton button2 = new JButton("2");
	JButton button3 = new JButton("3");
	JButton button4 = new JButton("4");
	JButton button5 = new JButton("5");
	JButton button6 = new JButton("6");
	JButton button7 = new JButton("7");
	JButton button8 = new JButton("8");
	JButton button9 = new JButton("9");
	
	JButton button_Dot = new JButton(".");
	JButton button_Add = new JButton("+");
	JButton button_subtract = new JButton("-");
	JButton button_multiply = new JButton("x");
	JButton button_divide = new JButton("/");
	
	JButton button_equption = new JButton("=");
	
	public void Calculator() {
		// 重新设计 JTextField 的样式
		result_TestField.setBackground(new Color(234, 222, 123));
		
		
		// 设置事件监听
		button0.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		
		button_Dot.addActionListener(this);
		button_Add.addActionListener(this);
		button_subtract.addActionListener(this);
		button_multiply.addActionListener(this);
		button_divide.addActionListener(this);
		button_equption.addActionListener(this);
		clear_Button.addActionListener(this);
		
		panel.setLayout(new GridLayout(4, 4, 5, 5));
		
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button_divide);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button_multiply);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button_subtract);
		panel.add(button0);
		panel.add(button_Dot);
		panel.add(button_equption);
		panel.add(button_Add);
		
		panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		
		panel2.setLayout(new GridLayout(1,2));
		panel2.add(result_TestField);
		panel2.add(clear_Button);
		result_TestField.setEditable(false);
		

		jFrame.setLayout(new BorderLayout());
		// 设置 JPanel 的大小
		panel2.setPreferredSize(new Dimension(500, 70));
		jFrame.add(panel2,BorderLayout.NORTH);
		jFrame.add(panel,BorderLayout.CENTER);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setSize(500, 400);
		jFrame.setVisible(true);
	}
	

	
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.Calculator();
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String command = e.getActionCommand();
		
		result += command;
		result_TestField.setText(result);	

		if (command.equals("+") || command.equals("-") || command.equals("x") || command.equals("/")) {
			if(number1.equals("")) {
				operator = command;
				num1 = Double.parseDouble(result.substring(0, result.indexOf(command)));
				result = command;
				result_TestField.setText(result);
			}
			
		}else if(command.equals("=")) {
			num2 = Double.parseDouble(result.substring(1,result.indexOf(command)));			System.out.println(num1+operator+num2);
			if(operator.equals("+")) {
				// 将整型转换成字符串
				double temp = num1+num2;
				result = String.valueOf(temp);
				result_TestField.setText(result);
			}else if(operator.equals("-")) {
				// 将整型转换成字符串
				double temp = num1-num2;
				result = String.valueOf(temp);
				result_TestField.setText(result);
			}else if(operator.equals("x")) {
				// 将整型转换成字符串
				double temp = num1*num2;
				result = String.valueOf(temp);
				result_TestField.setText(result);
			}else if(operator.equals("/")) {
				// 将整型转换成字符串
				double temp = num1/num2;
				result = String.valueOf(temp);
				result_TestField.setText(result);
			}
		}else if (command.equals("clear")) {
			result = "";
			result_TestField.setText(result);
		}


		
	}
	
	
}
