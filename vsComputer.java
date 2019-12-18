import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
class TTT2 extends JFrame implements ActionListener
{
	JButton b[] = new JButton[9];
	ImageIcon X,O,ltr;
	int turn=0;
	boolean win = false;
	String letter, l[];
	static Random rand = new Random();
	TTT2()
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
		for(int i =0;i<9;i++)
		{
			if(e.getSource() == b[i])
			{
				b[i].setIcon(X);
				b[i].setDisabledIcon(X);
				b[i].setEnabled(false);
				l[i] = "x";
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
					JOptionPane.showMessageDialog(this, "You win ");
					this.dispose();
     					new Select();
       				} 
				else if (!win && turn == 9) 
				{
            					JOptionPane.showMessageDialog(this, "The game ended in a tie.");
					this.dispose();
					new Select();
     				}
				else
				{

					if(l[0].equals(l[1]) && l[0].equals("x") && l[2].equals(""))
					{
						b[2].setIcon(O);
						b[2].setDisabledIcon(O);
						b[2].setEnabled(false);
						l[2] = "o";
						turn++;
					}					
					else if(l[0].equals(l[2]) && l[0].equals("x") && l[1].equals(""))
					{
						b[1].setIcon(O);
						b[1].setDisabledIcon(O);
						b[1].setEnabled(false);
						l[1] = "o";
						turn++;
					}
					else if(l[1].equals(l[2]) && l[1].equals("x") && l[0].equals(""))
					{
						b[0].setIcon(O);
						b[0].setDisabledIcon(O);
						b[0].setEnabled(false);
						l[0] = "o";
						turn++;
					}
					else if(l[3].equals(l[4]) && l[3].equals("x") && l[5].equals(""))
					{
						b[5].setIcon(O);
						b[5].setDisabledIcon(O);
						b[5].setEnabled(false);
						l[5] = "o";
						turn++;
					}
					else if(l[4].equals(l[5]) && l[4].equals("x") && l[3].equals(""))
					{
						b[3].setIcon(O);
						b[3].setDisabledIcon(O);
						b[3].setEnabled(false);
						l[3] = "o";
						turn++;
					}
					else if(l[3].equals(l[5]) && l[3].equals("x") && l[4].equals(""))
					{
						b[4].setIcon(O);
						b[4].setDisabledIcon(O);
						b[4].setEnabled(false);
						l[4] = "o";
						turn++;
					}
					else if(l[6].equals(l[7]) && l[7].equals("x") && l[8].equals(""))
					{
						b[8].setIcon(O);
						b[8].setDisabledIcon(O);
						b[8].setEnabled(false);
						l[8] = "o";
						turn++;
					}
					else if(l[7].equals(l[8]) && l[8].equals("x") && l[6].equals(""))
					{
						b[6].setIcon(O);
						b[6].setDisabledIcon(O);
						b[6].setEnabled(false);
						l[6] = "o";
						turn++;
					}
					else if(l[6].equals(l[8]) && l[8].equals("x") && l[7].equals(""))
					{
						b[7].setIcon(O);
						b[7].setDisabledIcon(O);
						b[7].setEnabled(false);
						l[7] = "o";
						turn++;
					}
					else if(l[0].equals(l[3]) && l[0].equals("x") && l[6].equals(""))
					{
						b[6].setIcon(O);
						b[6].setDisabledIcon(O);
						b[6].setEnabled(false);
						l[6] = "o";
						turn++;
					}
					else if(l[0].equals(l[6]) && l[6].equals("x") && l[3].equals(""))
					{
						b[3].setIcon(O);
						b[3].setDisabledIcon(O);
						b[3].setEnabled(false);
						l[3] = "o";
						turn++;
					}
					else if(l[3].equals(l[6]) && l[3].equals("x") && l[0].equals(""))
					{
						b[0].setIcon(O);
						b[0].setDisabledIcon(O);
						b[0].setEnabled(false);
						l[0] = "o";
						turn++;
					}
					else if(l[1].equals(l[4]) && l[1].equals("x") && l[7].equals(""))
					{
						b[7].setIcon(O);
						b[7].setDisabledIcon(O);
						b[7].setEnabled(false);
						l[7] = "o";
						turn++;
					}
					else if(l[1].equals(l[7]) && l[7].equals("x") && l[4].equals(""))
					{
						b[4].setIcon(O);
						b[4].setDisabledIcon(O);
						b[4].setEnabled(false);
						l[4] = "o";
						turn++;
					}
					else if(l[4].equals(l[7]) && l[4].equals("x") && l[1].equals(""))
					{
						b[1].setIcon(O);
						b[1].setDisabledIcon(O);
						b[1].setEnabled(false);
						l[1] = "o";
						turn++;
					}
					else if(l[5].equals(l[2]) && l[2].equals("x") && l[8].equals(""))
					{
						b[8].setIcon(O);
						b[8].setDisabledIcon(O);
						b[8].setEnabled(false);
						l[8] = "o";
						turn++;
					}
					else if(l[8].equals(l[2]) && l[8].equals("x") && l[5].equals(""))
					{
						b[5].setIcon(O);
						b[5].setDisabledIcon(O);
						b[5].setEnabled(false);
						l[5] = "o";
						turn++;
					}
					else if(l[5].equals(l[8]) && l[8].equals("x") && l[2].equals(""))
					{
						b[2].setIcon(O);
						b[2].setDisabledIcon(O);
						b[2].setEnabled(false);
						l[2] = "o";
						turn++;
					}
					else if(l[0].equals(l[4]) && l[0].equals("x") && l[8].equals(""))
					{
						b[8].setIcon(O);
						b[8].setDisabledIcon(O);
						b[8].setEnabled(false);
						l[8] = "o";
						turn++;
					}
					else if(l[0].equals(l[8]) && l[0].equals("x") && l[4].equals(""))
					{
						b[4].setIcon(O);
						b[4].setDisabledIcon(O);
						b[4].setEnabled(false);
						l[4] = "o";
						turn++;
					}
					else if(l[4].equals(l[8]) && l[4].equals("x") && l[0].equals(""))
					{
						b[0].setIcon(O);
						b[0].setDisabledIcon(O);
						b[0].setEnabled(false);
						l[0] = "o";
						turn++;
					}
					else if(l[4].equals(l[2]) && l[4].equals("x") && l[6].equals(""))
					{
						b[6].setIcon(O);
						b[6].setDisabledIcon(O);
						b[6].setEnabled(false);
						l[6] = "o";
						turn++;
					}
					else if(l[6].equals(l[2]) && l[2].equals("x") && l[4].equals(""))
					{
						b[4].setIcon(O);
						b[4].setDisabledIcon(O);
						b[4].setEnabled(false);
						l[4] = "o";
						turn++;
					}
					else if(l[6].equals(l[4]) && l[4].equals("x") && l[2].equals(""))
					{
						b[2].setIcon(O);
						b[2].setDisabledIcon(O);
						b[2].setEnabled(false);
						l[2] = "o";
						turn++;
					}

					else
					{				
						int c = rand.nextInt(9); 	
						if(turn != 9)
						{			
							while(l[c] != "")
							{
								c = rand.nextInt(9);
							}
							b[c].setIcon(O);
							b[c].setDisabledIcon(O);
							b[c].setEnabled(false);
							l[c] = "o";
							turn++;
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
						
						JOptionPane.showMessageDialog(this, "Computer wins");						
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
		}
			

	}
	
	
}
