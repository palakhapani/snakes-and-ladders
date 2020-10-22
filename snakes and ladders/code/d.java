import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
class FDemo extends JFrame
{
	JPDemo jp1;
	FDemo()
	{	
		super.setTitle("Snake & Ladder");
		jp1 = new JPDemo();
		add(jp1);
	}
}
class JPDemo extends JPanel implements ActionListener
{
	ImageIcon img1,img2,img3,img4,img6,img7,img8,img9,img11;
	Image swt,board,s1,start,player1,player2,player11,player12,dice1;
	
	JButton b2,b3,b4;
	JTextField tx1,tx2,tx3;
	
	int px1=40,py1=620;
	JPDemo()
	{
		setBackground(Color.black);
		img1=new ImageIcon("swt.jpg");
		img2=new ImageIcon("board.jpg");
		img3=new ImageIcon("s1.png");
		img4=new ImageIcon("start.jpg");
		img6=new ImageIcon("reset1.png");
		img7=new ImageIcon("start.gif");
		img8=new ImageIcon("player1.png");
		img9=new ImageIcon("player2.png");
		img11=new ImageIcon("dice.png");
		
		
		swt=img1.getImage();
		board=img2.getImage();
		s1=img3.getImage();
		start=img4.getImage();
		player1=img8.getImage();
		player2=img9.getImage();
		player11=img8.getImage();
		player12=img9.getImage();
		dice1=img11.getImage();
		
		
		setLayout(null);
		b2=new JButton(img6);
		b2.setBounds(41,160,122,40);
		add(b2);
		b2.setBackground(new Color(255,200,0));
		
		Font f= new Font("Gabriola",Font.BOLD,23);
		
		tx1=new JTextField("     start game");
		tx1.setBounds(20,230,150,35);
		add(tx1);
		tx1.setBackground(Color.black);
		tx1.setForeground(Color.green);
		tx1.setFont(f);
		
		tx2=new JTextField("  Player 1 Name");
		tx2.setBounds(40,320,150,35);
		add(tx2);
		tx2.setBackground(Color.black);
		tx2.setForeground(Color.green);
		tx2.setFont(f);
		
		tx3=new JTextField("  Player 2 Name");
		tx3.setBounds(40,375,150,35);
		add(tx3);
		tx3.setBackground(Color.black);
		tx3.setForeground(Color.green);
		tx3.setFont(f);
		
		b3=new JButton("Roll");
		b3.setBounds(50,500,100,30);
		add(b3);
		b3.setFont(f);
		b3.setForeground(Color.red);
		b3.addActionListener(this);
		
		b4=new JButton(img7);
		b4.setBounds(20,560,150,60);
		add(b4);
		b4.setFont(f);
		b4.setForeground(Color.red);
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(new Color(255,200,0));
		g.fillRect(0,0,200,735);
		g.drawImage(swt,0,2,this);
		g.drawImage(board,200,0,this);
		g.drawImage(s1,920,0,this);
		g.drawImage(start,20,550,this);
		g.drawImage(player1,px1,py1,this);
		g.drawImage(player2,120,620,this);
		g.drawImage(player11,10,300,this);
		g.drawImage(player12,10,365,this);
		g.drawImage(dice1,75,430,this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b3)
		{
			int random=(int)Math.round(Math.random()*5+1);
			px1=140;
			py1=645;
			
			switch(random)
			{
				case 1:
				img11=new ImageIcon("1.png");
				px1+=70;
				break;
				case 2:
				img11=new ImageIcon("2.png");
				px1+=140;
				break;
				case 3:
				img11=new ImageIcon("3.png");
				px1+=210;
				break;
				case 4:
				img11=new ImageIcon("4.png");
				px1+=280;
				break;
				case 5:
				img11=new ImageIcon("5.png");
				px1+=350;
				break;
				case 6:
				img11=new ImageIcon("6.png");
				px1+=420;
				break;
			}
			dice1=img11.getImage();
			repaint();
		}
		//System.out.prinln(random);
	}
}
class d
{
	public static void main(String args[])
	{
		FDemo f = new FDemo();
		f.setVisible(true);
		//f.setSize(200,200);
		f.setBounds(200,100,990,735);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}