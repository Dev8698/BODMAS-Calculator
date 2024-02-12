import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class sec_cal extends JFrame {
	static String[] A_equation;
    static int[] division_index,multi_index,addition_index,subtraction_index;
    static int limiter=0,bracket_c=0; 
    static String S_equation;

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sec_cal frame = new sec_cal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public sec_cal() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 314, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("SimSun-ExtB", Font.BOLD, 22));
		textField.setBounds(10, 10, 282, 74);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setFont(new Font("SimSun-ExtB", Font.BOLD, 21));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton) {
					String s=textField.getText();
					textField.setText(s+"1");
				}
			}
		});
		btnNewButton.setBounds(10, 173, 63, 65);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_1) {
					String s=textField.getText();
					textField.setText(s+"2");
				}
			}
		});
		btnNewButton_1.setFont(new Font("SimSun-ExtB", Font.BOLD, 22));
		btnNewButton_1.setBounds(83, 173, 63, 65);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_2) {
					String s=textField.getText();
					textField.setText(s+"3");
				}
			}
		});
		btnNewButton_2.setFont(new Font("SimSun-ExtB", Font.BOLD, 22));
		btnNewButton_2.setBounds(156, 173, 63, 65);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_3) {
					String s=textField.getText();
					textField.setText(s+"/");
				}
			}
		});
		btnNewButton_3.setFont(new Font("SimSun-ExtB", Font.BOLD, 22));
		btnNewButton_3.setBounds(229, 173, 63, 65);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.setFont(new Font("SimSun-ExtB", Font.BOLD, 22));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_4) {
					String s=textField.getText();
					textField.setText(s+"4");
				}
			}
		});
		btnNewButton_4.setBounds(10, 248, 63, 65);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_1_1 = new JButton("5");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_1_1) {
					String s=textField.getText();
					textField.setText(s+"5");
				}
			}
		});
		btnNewButton_1_1.setFont(new Font("SimSun-ExtB", Font.BOLD, 22));
		btnNewButton_1_1.setBounds(83, 248, 63, 65);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("6");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_2_1) {
					String s=textField.getText();
					textField.setText(s+"6");
				}
			}
		});
		btnNewButton_2_1.setFont(new Font("SimSun-ExtB", Font.BOLD, 22));
		btnNewButton_2_1.setBounds(156, 248, 63, 65);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_3_1 = new JButton("-");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_3_1) {
					String s=textField.getText();
					textField.setText(s+"-");
				}
			}
		});
		btnNewButton_3_1.setFont(new Font("SimSun-ExtB", Font.BOLD, 22));
		btnNewButton_3_1.setBounds(229, 248, 63, 65);
		contentPane.add(btnNewButton_3_1);
		
		JButton btnNewButton_5 = new JButton("7");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_5) {
					String s=textField.getText();
					textField.setText(s+"7");
				}
			}
		});
		btnNewButton_5.setFont(new Font("SimSun-ExtB", Font.BOLD, 22));
		btnNewButton_5.setBounds(10, 323, 63, 65);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_1_2 = new JButton("8");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_1_2) {
					String s=textField.getText();
					textField.setText(s+"8");
				}
			}
		});
		btnNewButton_1_2.setFont(new Font("SimSun-ExtB", Font.BOLD, 22));
		btnNewButton_1_2.setBounds(83, 323, 63, 65);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_2_2 = new JButton("9");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_2_2) {
					String s=textField.getText();
					textField.setText(s+"9");
				}
			}
		});
		btnNewButton_2_2.setFont(new Font("SimSun-ExtB", Font.BOLD, 22));
		btnNewButton_2_2.setBounds(156, 323, 63, 65);
		contentPane.add(btnNewButton_2_2);
		
		JButton btnNewButton_3_2 = new JButton("+");
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_3_2) {
					String s=textField.getText();
					textField.setText(s+"+");
				}
			}
		});
		btnNewButton_3_2.setFont(new Font("SimSun-ExtB", Font.BOLD, 22));
		btnNewButton_3_2.setBounds(229, 323, 63, 65);
		contentPane.add(btnNewButton_3_2);
		
		JButton btnNewButton_6 = new JButton("<=");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_6) {
					//textField.setText("");////////////////////////////////////////////////////////////////////////
					//S_equation=S_equation.substring(0, (j+1))+'0'+S_equation.substring((j+1) + 1);
					String x=textField.getText();
					x=x.substring(0, (x.length()-1))+x.substring((x.length()-1)+1);
					textField.setText(x);
				}
			}
		});
		btnNewButton_6.setFont(new Font("SimSun-ExtB", Font.BOLD, 22));
		btnNewButton_6.setBounds(10, 398, 63, 65);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_1_3 = new JButton("0");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_1_3) {
					String s=textField.getText();
					textField.setText(s+"0");
				}
			}
		});
		btnNewButton_1_3.setFont(new Font("SimSun-ExtB", Font.BOLD, 22));
		btnNewButton_1_3.setBounds(83, 398, 63, 65);
		contentPane.add(btnNewButton_1_3);
		
		JButton btnNewButton_2_3 = new JButton(".");
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_2_3) {
					String s=textField.getText();
					textField.setText(s+".");
				}
			}
		});
		btnNewButton_2_3.setFont(new Font("SimSun-ExtB", Font.BOLD, 25));
		btnNewButton_2_3.setBounds(156, 398, 63, 65);
		contentPane.add(btnNewButton_2_3);
		
		JButton btnNewButton_3_3 = new JButton("=");
		btnNewButton_3_3.setFont(new Font("SimSun-ExtB", Font.BOLD, 22));
		btnNewButton_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getInput();
				textField.setText(solve(solve_b(A_equation)));
				
				
			}
		});
		btnNewButton_3_3.setBounds(229, 398, 63, 65);
		contentPane.add(btnNewButton_3_3);
		
		JButton btnNewButton_7 = new JButton("(");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_7) {
					String s=textField.getText();
					textField.setText(s+"(");
				}
			}
		});
		btnNewButton_7.setFont(new Font("SimSun-ExtB", Font.BOLD, 22));
		btnNewButton_7.setBounds(10, 94, 63, 65);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_1_4 = new JButton(")");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_1_4) {
					String s=textField.getText();
					textField.setText(s+")");
				}
			}
		});
		btnNewButton_1_4.setFont(new Font("SimSun-ExtB", Font.BOLD, 22));
		btnNewButton_1_4.setBounds(83, 94, 63, 65);
		contentPane.add(btnNewButton_1_4);
		
		JButton btnNewButton_2_4 = new JButton("^");
		btnNewButton_2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_2_4) {
					String s=textField.getText();
					textField.setText(s+"^");
				}
			}
		});
		btnNewButton_2_4.setFont(new Font("Algerian", Font.BOLD, 22));
		btnNewButton_2_4.setBounds(156, 94, 63, 65);
		contentPane.add(btnNewButton_2_4);
		
		JButton btnNewButton_3_4 = new JButton("*");
		btnNewButton_3_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_3_4) {
					String s=textField.getText();
					textField.setText(s+"*");
				}
			}
		});
		btnNewButton_3_4.setFont(new Font("SimSun-ExtB", Font.BOLD, 22));
		btnNewButton_3_4.setBounds(229, 94, 63, 65);
		contentPane.add(btnNewButton_3_4);
	}
	void getInput (){
		S_equation=textField.getText();
        for(int i = 0 ; i < S_equation.length() ;i++){
            if(S_equation.charAt(i)=='-'||S_equation.charAt(i)=='+'||S_equation.charAt(i)=='/'||S_equation.charAt(i)=='*'||S_equation.charAt(i)=='^'){
                if (S_equation.charAt(i+1)!='-') {
                    limiter++;
                }
            }
        }
        for(int i = 0 ; i < S_equation.length() ;i++){
            if(S_equation.charAt(i)=='('){
                bracket_c++;
            }
        }
        int Fsize=(limiter*2)+1;
        for(int i = 0 ; i < S_equation.length() ;i++){
            if(S_equation.charAt(i)=='('||S_equation.charAt(i)==')'){
                Fsize++;
            }
        }
        //S_equation.charAt(i)=='('||S_equation.charAt(i)==')'
        A_equation = new String[Fsize];
        for (int i = 0; i < A_equation.length; i++) {
            A_equation[i]="";
        }
        int j=0;
        for(int i = 0 ; i < A_equation.length; i++){
            if (S_equation.charAt(j)==')') {
                A_equation[i]=(A_equation[i]+S_equation.charAt(j));
                j++;
            }
            else if (S_equation.charAt(j)=='+'||S_equation.charAt(j)=='-'||S_equation.charAt(j)=='*'||S_equation.charAt(j)=='/'||S_equation.charAt(j)=='^'||S_equation.charAt(j)=='(') {
                A_equation[i]=(A_equation[i]+S_equation.charAt(j));
                if (S_equation.charAt(j+1)=='-'){
                    A_equation[i+1]=(A_equation[i+1]+'-');
                    S_equation=S_equation.substring(0, (j+1))+'0'+S_equation.substring((j+1) + 1);
                }
                j++;
            }
            else{

                    while (S_equation.charAt(j)=='0'||S_equation.charAt(j)=='1'||S_equation.charAt(j)=='2'||S_equation.charAt(j)=='3'||S_equation.charAt(j)=='4'||S_equation.charAt(j)=='5'||S_equation.charAt(j)=='6'||S_equation.charAt(j)=='7'||S_equation.charAt(j)=='8'||S_equation.charAt(j)=='9'||S_equation.charAt(j)=='.') {
                        A_equation[i]=(A_equation[i]+S_equation.charAt(j));
                        
                        if (j==(S_equation.length()-1)) {
                            break;
                        }
                        else{
                            j++;
                        }
        
                    
                }
            }
        }
    }

    String[] solve_b(String[] T_equation){
        int i_1=0,i_2=0;
        for (int k = 0; k < bracket_c; k++) {
            for (int j = i_2; j < T_equation.length; j++) {
                if (T_equation[j].equals("(")) {
                    i_1=j;
                }
                else if (T_equation[j].equals(")")) {
                  i_2=j; 
                  break; 
                }
            }
            //for (int j = i_1; j < i_2; j++) {
                double ans;
                int d1=1,i1=0,i2=0,o_c;
                //Double operand1,operand2;
                while (d1==1) {
                    for (int i = i_1; i < i_2; i++) {
                        
                        if (T_equation[i].equals("^")) {
                            i2=i+1;
                            i1=i-1;
                            while (T_equation[i1].equals(".")) {
                                i1--;
                            }
                            while (T_equation[i2].equals(".")) {
                                i2++;
                            }
                            ans=Math.pow(Double.parseDouble(T_equation[i1]), Double.parseDouble(T_equation[i2]));
                            T_equation[i1]=Double.toString(ans);
                            T_equation[i]=".";
                            T_equation[i2]=".";
                            
                            
                        }

                    }
                    o_c=0;
                    for (int i = i_1; i < i_2; i++) {
                        if (T_equation[i].equals("^")){
                            o_c++;
                        }
                    }
                    if (o_c==0) {
                        d1=2;
                    }
                }
                d1=1;
                while (d1==1) {
                    for (int i = i_1; i < i_2; i++) {
                        
                        if (T_equation[i].equals("/")) {
                            i2=i+1;
                            i1=i-1;
                            while (T_equation[i1].equals(".")) {
                                i1--;
                            }
                            while (T_equation[i2].equals(".")) {
                                i2++;
                            }
                            ans= Float.parseFloat(T_equation[i1])/Float.parseFloat(T_equation[i2]);
                            T_equation[i1]=Double.toString(ans);
                            T_equation[i]=".";
                            T_equation[i2]=".";
                            
                            
                        }

                    }
                    o_c=0;
                    for (int i = i_1; i < i_2; i++) {
                        if (T_equation[i].equals("/")){
                            o_c++;
                        }
                    }
                    if (o_c==0) {
                        d1=2;
                    }
                }
                d1=1;
                while (d1==1) {
                    for (int i = i_1; i < i_2; i++) {
                        
                        if (T_equation[i].equals("*")) {
                            i2=i+1;
                            i1=i-1;
                            while (T_equation[i1].equals(".")) {
                                i1--;
                            }
                            while (T_equation[i2].equals(".")) {
                                i2++;
                            }
                            ans= Double.parseDouble(T_equation[i1])*Double.parseDouble(T_equation[i2]);
                            T_equation[i1]=Double.toString(ans);
                            T_equation[i]=".";
                            T_equation[i2]=".";
                            
                            
                        }

                    }
                    o_c=0;
                    for (int i = i_1; i < i_2; i++) {
                        if (T_equation[i].equals("*")){
                            o_c++;
                        }
                    }
                    if (o_c==0) {
                        d1=2;
                    }
                }
                d1=1;
                while (d1==1) {
                    for (int i = i_1; i < i_2; i++) {
                        
                        if (T_equation[i].equals("+")) {
                            i2=i+1;
                            i1=i-1;
                            while (T_equation[i1].equals(".")) {
                                i1--;
                            }
                            while (T_equation[i2].equals(".")) {
                                i2++;
                            }
                            ans= Double.parseDouble(T_equation[i1])+Double.parseDouble(T_equation[i2]);
                            T_equation[i1]=Double.toString(ans);
                            T_equation[i]=".";
                            T_equation[i2]=".";
                            
                            
                        }

                    }
                    o_c=0;
                    for (int i = i_1; i < i_2; i++) {
                        if (T_equation[i].equals("+")){
                            o_c++;
                        }
                    }
                    if (o_c==0) {
                        d1=2;
                    }
                }
                d1=1;
                while (d1==1) {
                    for (int i = i_1; i < i_2; i++) {
                        
                        if (T_equation[i].equals("-")) {
                            i2=i+1;
                            i1=i-1;
                            while (T_equation[i1].equals(".")) {
                                i1--;
                            }
                            while (T_equation[i2].equals(".")) {
                                i2++;
                            }
                            ans= Double.parseDouble(T_equation[i1])-Double.parseDouble(T_equation[i2]);
                            T_equation[i1]=Double.toString(ans);
                            T_equation[i]=".";
                            T_equation[i2]=".";
                            
                            
                        }

                    }
                    o_c=0;
                    for (int i = i_1; i < i_2; i++) {
                        if (T_equation[i].equals("-")){
                            o_c++;
                        }
                    }
                    if (o_c==0) {
                        d1=2;
                    }
                }
                if(T_equation[i_1].equals("(")&& T_equation[i_2].equals(")")){
                    T_equation[i_1]=T_equation[i_1+1];
                    T_equation[i_1+1]=".";
                    T_equation[i_2]=".";
                }
                
            //}
        }
        return T_equation;

    }

    String solve(String[] T_equation){
        
        double ans;
        int d1=1,i1,i2,o_c;
        //Double operand1,operand2;
        while (d1==1) {
            for (int i = 0; i < T_equation.length; i++) {
                
                if (T_equation[i].equals("^")) {
                    i2=i+1;
                    i1=i-1;
                    while (T_equation[i1].equals(".")) {
                        i1--;
                    }
                    while (T_equation[i2].equals(".")) {
                        i2++;
                    }
                    ans=Math.pow(Double.parseDouble(T_equation[i1]), Double.parseDouble(T_equation[i2]));
                    T_equation[i1]=Double.toString(ans);
                    T_equation[i]=".";
                    T_equation[i2]=".";
                    
                }

            }
            o_c=0;
            for (int i = 0; i < T_equation.length; i++) {
                if (T_equation[i].equals("^")){
                    o_c++;
                }
            }
            if (o_c==0) {
                d1=2;
            }
        }
        d1=1;
        while (d1==1) {
            for (int i = 0; i < T_equation.length; i++) {
                
                if (T_equation[i].equals("/")) {
                    i2=i+1;
                    i1=i-1;
                    while (T_equation[i1].equals(".")) {
                        i1--;
                    }
                    while (T_equation[i2].equals(".")) {
                        i2++;
                    }
                    ans= Float.parseFloat(T_equation[i1])/Float.parseFloat(T_equation[i2]);
                    T_equation[i1]=Double.toString(ans);
                    T_equation[i]=".";
                    T_equation[i2]=".";
                    
                }

            }
            o_c=0;
            for (int i = 0; i < T_equation.length; i++) {
                if (T_equation[i].equals("/")){
                    o_c++;
                }
            }
            if (o_c==0) {
                d1=2;
            }
        }
        d1=1;
        while (d1==1) {
            for (int i = 0; i < T_equation.length; i++) {
                
                if (T_equation[i].equals("*")) {
                    i2=i+1;
                    i1=i-1;
                    while (T_equation[i1].equals(".")) {
                        i1--;
                    }
                    while (T_equation[i2].equals(".")) {
                        i2++;
                    }
                    ans= Double.parseDouble(T_equation[i1])*Double.parseDouble(T_equation[i2]);
                    T_equation[i1]=Double.toString(ans);
                    T_equation[i]=".";
                    T_equation[i2]=".";
                    
                }

            }
            o_c=0;
            for (int i = 0; i < T_equation.length; i++) {
                if (T_equation[i].equals("*")){
                    o_c++;
                }
            }
            if (o_c==0) {
                d1=2;
            }
        }
        d1=1;
        while (d1==1) {
            for (int i = 0; i < T_equation.length; i++) {
                
                if (T_equation[i].equals("+")) {
                    i2=i+1;
                    i1=i-1;
                    while (T_equation[i1].equals(".")) {
                        i1--;
                    }
                    while (T_equation[i2].equals(".")) {
                        i2++;
                    }
                    ans= Double.parseDouble(T_equation[i1])+Double.parseDouble(T_equation[i2]);
                    T_equation[i1]=Double.toString(ans);
                    T_equation[i]=".";
                    T_equation[i2]=".";
                    
                }

            }
            o_c=0;
            for (int i = 0; i < T_equation.length; i++) {
                if (T_equation[i].equals("+")){
                    o_c++;
                }
            }
            if (o_c==0) {
                d1=2;
            }
        }
        d1=1;
        while (d1==1) {
            for (int i = 0; i < T_equation.length; i++) {
                
                if (T_equation[i].equals("-")) {
                    i2=i+1;
                    i1=i-1;
                    while (T_equation[i1].equals(".")) {
                        i1--;
                    }
                    while (T_equation[i2].equals(".")) {
                        i2++;
                    }
                    ans= Double.parseDouble(T_equation[i1])-Double.parseDouble(T_equation[i2]);
                    T_equation[i1]=Double.toString(ans);
                    T_equation[i]=".";
                    T_equation[i2]=".";
                    
                }

            }
            o_c=0;
            for (int i = 0; i < T_equation.length; i++) {
                if (T_equation[i].equals("-")){
                    o_c++;
                }
            }
            if (o_c==0) {
                d1=2;
            }
        }
        return T_equation[0];
    }

}
