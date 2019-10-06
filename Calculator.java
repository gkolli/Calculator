//Naren Kolli! 
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.color.*;
import javax.swing.JComponent;

public class Calculator implements ActionListener, KeyListener {
	JButton one;
	JButton two;
	JButton three;
	JButton four;
	JButton five;
	JButton six;
	JButton seven;
	JButton eight;
	JButton nine;
	JButton zero;
	JButton decimal;
	JButton equals;
	JButton plus;
	JButton minus;
	JButton times;
	JButton divide;
	JTextField input = new JTextField();
	JButton bCE;
	JButton bC;
	JPanel cec;

	public String firstNum = "";
	public String secondNum = "";
	public String changeNum = "";

	public Calculator() {
		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");
		zero = new JButton("0");
		decimal = new JButton(".");
		equals = new JButton("=");
		plus = new JButton("+");
		minus = new JButton("-");
		times = new JButton("x");
		divide = new JButton("÷");
		JFrame frame = new JFrame();
		frame.setTitle("Calculator");
		frame.setSize(300, 500);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel numbers = new JPanel();
		JPanel overall = new JPanel();

		numbers.setLayout(new GridLayout(4, 4));
		numbers.add(seven);
		numbers.add(eight);
		numbers.add(nine);
		numbers.add(divide);
		numbers.add(four);
		numbers.add(five);
		numbers.add(six);
		numbers.add(times);
		numbers.add(one);
		numbers.add(two);
		numbers.add(three);
		numbers.add(minus);
		numbers.add(zero);
		numbers.add(decimal);
		numbers.add(equals);
		numbers.add(plus);
		overall.setLayout(new BorderLayout());
		overall.add(numbers, BorderLayout.CENTER);
		cec = new JPanel();
		bCE = new JButton("CE");
		 bC = new JButton("C");
		cec.add(bCE);
		cec.add(bC);
		overall.add(cec, BorderLayout.SOUTH);
		
		overall.add(input, BorderLayout.NORTH);
		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
		five.addActionListener(this);
		six.addActionListener(this);
		seven.addActionListener(this);
		eight.addActionListener(this);
		nine.addActionListener(this);
		zero.addActionListener(this);
		decimal.addActionListener(this);
		equals.addActionListener(this);
		plus.addActionListener(this);
		minus.addActionListener(this);
		times.addActionListener(this);
		divide.addActionListener(this);
		bC.addActionListener(this);
		bCE.addActionListener(this);
		frame.setResizable(false);
		frame.add(overall);

		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new Calculator();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(one)) {
			
			if(changeNum.equals("")){
				firstNum += "1";
				input.setText(firstNum);
			} 
			else if (changeNum != ""){
				secondNum += "1";
				input.setText(secondNum);
			}
		}
		if (e.getSource().equals(two)) {
			if(changeNum.equals("")){
				firstNum += "2";
				input.setText(firstNum);

			} 
			else if (changeNum != ""){
				secondNum += "2";
				input.setText(secondNum);
			}
		}
		if (e.getSource().equals(three)) {
			if(changeNum.equals("")){
				firstNum += "3";
				input.setText(firstNum);
			} 
			else if (changeNum != ""){
				secondNum += "3";
				input.setText(secondNum);
			}
		}
		if (e.getSource().equals(four)) {
			if(changeNum.equals("")){
				firstNum += "4";
				input.setText(firstNum);
			} 
			else if (changeNum != ""){
				secondNum += "4";
				input.setText(secondNum);
			}
		}
		if (e.getSource().equals(five)) {
			if(changeNum.equals("")){
				firstNum += "5";
				input.setText(firstNum);
			}   
			else if (changeNum != ""){
				secondNum += "5";
				input.setText(secondNum);
			}
		}
		if (e.getSource().equals(six)) {
			if(changeNum.equals("")){
				firstNum += "6";
				input.setText(firstNum);
			} 
			else if (changeNum != ""){
				secondNum += "6";
				input.setText(secondNum);
			}
		}
		if (e.getSource().equals(seven)) {
			if(changeNum.equals("")){
				firstNum += "7";
				input.setText(firstNum);
			} 
			else{
				secondNum += "7";
				input.setText(secondNum);
			}
		}
		if (e.getSource().equals(eight)) {
			if(changeNum.equals("")){
				firstNum += "8";
				input.setText(firstNum);
			} 
			else{
				secondNum += "8";
				input.setText(secondNum);
			}
		}
		if (e.getSource().equals(nine)) {
			if(changeNum.equals("")){
				firstNum += "9";
				input.setText(firstNum);
			} 
			else{
				secondNum += "9";
				input.setText(secondNum);
			}
		}
		if (e.getSource().equals(zero)) {
			if( changeNum.equals("")){			
				firstNum += "0";
				input.setText(firstNum);
			} 
			else{
				secondNum += "0";
				input.setText(secondNum);
			}
		}
		if(e.getSource().equals(times)){
				changeNum = "*";
				input.setText(changeNum);
		}
		if(e.getSource().equals(plus)){
				changeNum = "+";
				input.setText(changeNum);
		
		}
		if(e.getSource().equals(minus)){
		
				changeNum = "-";
				input.setText(changeNum);
			
		}
		if(e.getSource().equals(divide)){
		
				changeNum += "/";
				input.setText(changeNum);
		
		}
		if(e.getSource().equals(equals)){
			if(!firstNum.equals(null) && !secondNum.equals(null)){
				Double firstN = Double.parseDouble(firstNum);
				Double secondN = Double.parseDouble(secondNum);
				if(changeNum.equalsIgnoreCase("+")){
					double num = firstN + secondN;
					String ans = Double.toString(num);
					input.setText(ans);
				}
				if(changeNum.equalsIgnoreCase("-")){
					double num = firstN - secondN;
					String ans = Double.toString(num);
					input.setText(ans);
				}
				if(changeNum.equalsIgnoreCase("*")){
					double num = firstN * secondN;
					String ans = Double.toString(num);
					input.setText(ans);
				}
				if(changeNum.equalsIgnoreCase("/")){
					double num = firstN / secondN;
					String ans = Double.toString(num);
					input.setText(ans);
				}
				firstNum = "";
				secondNum = "";
				changeNum = "";
			}
		}
		if(e.getSource().equals(decimal)){ 
			if(changeNum.equals("")){
				firstNum += ".";
				input.setText(firstNum);
			}
			else{
				secondNum += ".";
				input.setText(secondNum);
			}
				
		}
		if(e.getSource().equals(bCE)){
			if(changeNum.equals("")){
				firstNum = "";
				input.setText("");
			}
			if(!firstNum.equals("") && !changeNum.equals("")){
				secondNum = "";
				input.setText("");
			}
		
		}
		if(e.getSource().equals(bC)){
			firstNum = "";
			secondNum = "";
			changeNum = "";
			input.setText(firstNum);
		}
	}

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}