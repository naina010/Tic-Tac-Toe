import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class TTT extends JFrame implements ActionListener
{
	JButton b[] = new JButton[9];
	ImageIcon X,O,ltr;
	int turn=0;
	boolean win = false;
	String letter, l[];
	TTT()
	{
		super("TIC TAC TOE");
		l = new String[9];
		for (int i = 0; i < 9; i++) 
		{
			l[i] = "";
			b[i] = new JButton();
			add(b[i]);
			b[i].setBackground(Color.BLACK);
			b[i].addActionListener(this);	
       		}
		
		X=new ImageIcon(getClass().getResource("x.png"));
		O=new ImageIcon(getClass().getResource("o.png"));
		setLayout(new GridLayout(3,3));
		setSize(600,600);
		setVisible(true);	
		setResizable(false);	
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		turn++;
		if(turn%2 == 1)
		{
			ltr = X;
			letter = "X";
		}
		else
		{
			ltr = O;
			letter = "O";
		}
		for(int i =0;i<9;i++)
		{
			if(e.getSource() == b[i])
			{
				b[i].setIcon(ltr);
				b[i].setDisabledIcon(ltr);
				b[i].setEnabled(false);
				l[i] = letter;
			}
		}
		
		if(l[0].equals(l[1]) && l[1].equals(l[2]) && !l[0].equals(""))
		{
			win =true;
		}
		if(l[3].equals(l[4]) && l[4].equals(l[5]) && !l[3].equals(""))
		{
			win =true;
		}
		if(l[6].equals(l[7]) && l[7].equals(l[8]) && !l[6].equals(""))
		{
			win =true;
		}
		if(l[0].equals(l[3]) && l[3].equals(l[6]) && !l[0].equals(""))
		{
			win =true;
		}
		if(l[1].equals(l[4]) && l[4].equals(l[7]) && !l[1].equals(""))
		{
			win =true;
		}
		if(l[2].equals(l[5]) && l[5].equals(l[8]) && !l[2].equals(""))
		{
			win =true;
		}
		if(l[0].equals(l[4]) && l[4].equals(l[8]) && !l[0].equals(""))
		{
			win =true;
		}
		if(l[2].equals(l[4]) && l[4].equals(l[6]) && !l[2].equals(""))
		{
			win =true;
		}

		if (win)
		 {
			JOptionPane.showMessageDialog(this, "Player " + letter + " wins!");
			this.dispose();
     			new Select();
       		 } 
		else if (!win && turn == 9) 
		{
            		JOptionPane.showMessageDialog(this, "The game ended in a tie.");
			this.dispose();
			new Select();
     		}


	}
	
}
