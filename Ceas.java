package ceas;

import java.util.Calendar;
import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;

public class Ceas extends JFrame
{
	private static final long serialVersionUID = 1305830612226683458L;
	
	Calendar calendar;
	SimpleDateFormat timpFormat = new SimpleDateFormat("HH:mm:ss a");
	SimpleDateFormat ziFormat = new SimpleDateFormat("EEEE");
	SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");

	JPanel panou ;
	JLabel timpLabel = new JLabel();
	JLabel ziLabel = new JLabel();
	JLabel dataLabel = new JLabel();
	
	String timp;
	String zi;
	String data;
	
	Ceas()
	{
		initializare();
		
	}
	
	public void initializare()
	{
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Ceas");
		setSize(400, 250);
		setLocation(50,50);
		
		panou = (JPanel) getContentPane();
		panou.setLayout(new FlowLayout());
		
		timpLabel.setFont(new Font("Sans",Font.PLAIN,50));
		timpLabel.setBackground(Color.black);
		timpLabel.setForeground(new Color(0x107817));
		timpLabel.setOpaque(true);
		
		ziLabel.setFont(new Font("Sans",Font.PLAIN,35));
		
		dataLabel.setFont(new Font("Sans",Font.PLAIN,25));
		
		panou.add(timpLabel);
		panou.add(ziLabel);
		panou.add(dataLabel);
		
		setVisible(true);
		setTimp();
		
				
	}
	
	public void setTimp()
	{	
		while(true)
		{
			timp = timpFormat.format(Calendar.getInstance().getTime());
			timpLabel.setText(timp);
			
			zi = ziFormat.format(Calendar.getInstance().getTime());
			ziLabel.setText(zi);
			
			data = dataFormat.format(Calendar.getInstance().getTime());
			dataLabel.setText(data);
			
			
			try 
			{ 
				Thread.sleep(1000); 
			} 
			  
			catch (InterruptedException e) 
			{ 
				e.printStackTrace(); 
			}
			 
			  
		}
	}

}
