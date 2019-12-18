import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Select extends JFrame implements ActionListener
{
	JRadioButton b1;
	JRadioButton b2;
	ButtonGroup bg ;
	JPanel jp;
	public static void main(String...s)
	{
		new Select();

		new Select();
	}
	Select()
	{
		super("tictactoe");
		setSize(600,600);
		setVisible(true);	
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b1 = new JRadioButton("vs COMPUTER");
		b2 = new JRadioButton("vs FRIEND");
		bg = new ButtonGroup();
		jp = new JPanel();
		bg.add(b1);
		bg.add(b2);
		jp.add(b1);
		jp.add(b2);
		add(BorderLayout.CENTER,jp);
		b1.addActionListener(this);
		b2.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == b1)
		{
			dispose();
			new TTT2();
		}
		else if(e.getSource() == b2)
		{
			dispose();
			new TTT();
		}
	}
}