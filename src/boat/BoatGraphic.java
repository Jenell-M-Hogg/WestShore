package boat;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.BevelBorder;

public class BoatGraphic extends JPanel {
	JLabel customerLabel;
	/**
	 * Create the panel.
	 */
	public BoatGraphic(String customer) {
		setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		setLayout(new BorderLayout(0, 0));
		
		customerLabel = new JLabel(customer);	
		
		
		customerLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		customerLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(customerLabel);

	}
	
	
	
	
	public void clicked(){
			
			JTextField edit=new JTextField(customerLabel.getText());
			
			edit.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					String newUser=edit.getText();
					
					remove(edit);
					customerLabel.setText(newUser);
					add(customerLabel);
					repaint();
					
				}
				
			});
			
			edit.setEnabled(true);
			edit.setAlignmentX(CENTER_ALIGNMENT);
			//TODO FIX BOUNDS
			edit.setBounds(customerLabel.getBounds());
			
			remove(customerLabel);
			add(edit);
			repaint();
		}
	});
	


}
