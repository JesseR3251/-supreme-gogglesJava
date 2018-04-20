import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;



public class JoeAuto extends JFrame {
	JPanel chBoxPanel,partsPanel,laborPanel,chargesPanel,rightPanel;
	JCheckBox oc,lj,rf,tf,insp,mr,tr;
	JLabel partsLabel,laborLabel,chargesLabel;
	JTextField partsTextField,laborTextField;
	JButton calculate;
	double optional=0, labor=0, parts=0, charges=0;
	
	public JoeAuto() {
		chBoxPanel=new JPanel();
		partsPanel=new JPanel();
		laborPanel=new JPanel();
		chargesPanel=new JPanel();
		rightPanel=new JPanel();
		chBoxPanel.setLayout(new GridLayout(7,1));
		partsPanel.setLayout(new GridLayout(1,2));
		laborPanel.setLayout(new GridLayout(1,2));
		chargesPanel.setLayout(new GridLayout(1,2));
		rightPanel.setLayout(new GridLayout(3,1));
		chBoxPanel.setBorder(BorderFactory.createTitledBorder("Optional Services"));
		rightPanel.setBorder(BorderFactory.createTitledBorder("Parts & Labor"));
		
		oc=new JCheckBox("Oil Change $26.00");
		lj=new JCheckBox("Lube Job $18.00");
		rf=new JCheckBox("Radiator flush $30.00");
		tf=new JCheckBox("Transmission flush $80.00");
		insp=new JCheckBox("Insepction $15.00");
		mr=new JCheckBox("Muffler replacement $100.00");
		tr=new JCheckBox("Tire rotation $20");
		
		oc.addItemListener(new chBoxListener());
		lj.addItemListener(new chBoxListener());
		rf.addItemListener(new chBoxListener());
		tf.addItemListener(new chBoxListener());
		insp.addItemListener(new chBoxListener());
		mr.addItemListener(new chBoxListener());
		tr.addItemListener(new chBoxListener());
		
		partsLabel=new JLabel("Parts: ");
		laborLabel=new JLabel("Labor hours: ");
		chargesLabel=new JLabel("0.00");
		
		partsTextField=new JTextField(7);
		laborTextField=new JTextField(5);
		partsTextField.setText("0.00");
		laborTextField.setText("0.00");
		
		calculate=new JButton("CHARGES: ");
		calculate.addActionListener(new buttonListener());
		
		chBoxPanel.add(oc);
		chBoxPanel.add(lj);
		chBoxPanel.add(rf);
		chBoxPanel.add(tf);
		chBoxPanel.add(insp);
		chBoxPanel.add(mr);
		chBoxPanel.add(tr);
		
		partsPanel.add(partsLabel);
		partsPanel.add(partsTextField);
		laborPanel.add(laborLabel);
		laborPanel.add(laborTextField);
		chargesPanel.add(calculate);
		chargesPanel.add(chargesLabel);
		rightPanel.add(partsPanel);
		rightPanel.add(laborPanel);
		rightPanel.add(chargesPanel);
		this.setLayout(new GridLayout(1,2));
		add(chBoxPanel);
		add(rightPanel);
		
		this.setTitle("Joe's Automotive");
		this.setSize(500, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
	}
	
	private class buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			try {
				parts = Double.parseDouble(partsTextField.getText());
				labor = Double.parseDouble(laborTextField.getText());
			}
			catch(NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Wrong format, hours and parts resetted");
				partsTextField.setText("0.00");
				laborTextField.setText("0.00");
				parts = 0;
				labor = 0;
			}
			charges = optional + parts + labor * 20.0;
			chargesLabel.setText(String.format("$%,.2f",charges));
		}
	}
	
	private class chBoxListener implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			if (e.getSource()==oc) {
				if(oc.isSelected())
					optional+=26;
				else
					optional -=26;
			}
			if (e.getSource()==lj) {
				if(oc.isSelected())
					optional+=18;
				else
					optional -=18;
			}
			if (e.getSource()==rf) {
				if(oc.isSelected())
					optional+=30;
				else
					optional -=30;
			}
			if (e.getSource()==tf) {
				if(oc.isSelected())
					optional+=80;
				else
					optional -=80;
			}
			if (e.getSource()==insp) {
				if(oc.isSelected())
					optional+=15;
				else
					optional -=15;
			}
			if (e.getSource()==mr) {
				if(oc.isSelected())
					optional+=100;
				else
					optional -=100;
			}
			if (e.getSource()==tr) {
				if(oc.isSelected())
					optional+=20;
				else
					optional -=20;
			}
			charges = optional + labor * 20.00 + parts;
			chargesLabel.setText(String.format("$%,.2f",charges));
		}
	}
	
	public static void main(String[] args) {
		new JoeAuto();

	}

}
