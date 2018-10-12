package project2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class settingsMenu extends JDialog 
{
	/**
	 * 
	 */
	//Class variable declarations/initializations
	private final JPanel contentPanel = new JPanel();
	public ArrayList<Integer> stockIndexes;
	public ArrayList<Integer> weekIndexes;
	private JComboBox comboBox;
	private JCheckBox check26;
	
	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		try {
			settingsMenu dialog = new settingsMenu();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
*/
	/**
	 * Create the dialog.
	 */
	public settingsMenu() {
		setModal(true);
		stockIndexes = new ArrayList<Integer>();
		weekIndexes = new ArrayList<Integer>();
		setBounds(100, 100, 723, 455);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 707, 383);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		
		/*
		 * A looooooong series of checkboxes. Each one adds an index element to
		 * an ArrayList of index elements. The index numbers will be used to search
		 * specific weeks of data..
		 */
		JCheckBox check1 = new JCheckBox("1/07/11");
		check1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(check1.isSelected())
					weekIndexes.add(0);
				else
					weekIndexes.remove(new Integer(0));
			}
		});
		check1.setBounds(6, 7, 97, 23);
		contentPanel.add(check1);
		
		JCheckBox check2 = new JCheckBox("1/14/11");
		check2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(check2.isSelected())
					weekIndexes.add(1);
				else
					weekIndexes.remove(new Integer(1));
			}
		});
		check2.setBounds(6, 33, 97, 23);
		contentPanel.add(check2);
		
		JCheckBox check3 = new JCheckBox("1/21/11");
		check3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(check3.isSelected())
					weekIndexes.add(2);
				else
					weekIndexes.remove(new Integer(2));
			}
		});
		check3.setBounds(6, 59, 97, 23);
		contentPanel.add(check3);
		
		JCheckBox check4 = new JCheckBox("1/28/11");
		check4.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(check4.isSelected())
					weekIndexes.add(3);
				else
					weekIndexes.remove(new Integer(3));
			}
		});
		check4.setBounds(6, 85, 97, 23);
		contentPanel.add(check4);
		
		JCheckBox check5 = new JCheckBox("2/04/11");
		check5.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(check5.isSelected())
					weekIndexes.add(4);
				else
					weekIndexes.remove(new Integer(4));
			}
		});
		check5.setBounds(6, 111, 97, 23);
		contentPanel.add(check5);
		
		JCheckBox check6 = new JCheckBox("2/11/11");
		check6.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(check6.isSelected())
					weekIndexes.add(5);
				else
					weekIndexes.remove(new Integer(5));
			}
		});
		check6.setBounds(6, 137, 97, 23);
		contentPanel.add(check6);
		
		JCheckBox check7 = new JCheckBox("2/18/11");
		check7.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(check7.isSelected())
					weekIndexes.add(6);
				else
					weekIndexes.remove(new Integer(6));
			}
		});
		check7.setBounds(6, 163, 97, 23);
		contentPanel.add(check7);
		
		JCheckBox check8 = new JCheckBox("2/25/11");
		check8.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(check8.isSelected())
					weekIndexes.add(7);
				else
					weekIndexes.remove(new Integer(7));
			}
		});
		check8.setBounds(6, 189, 97, 23);
		contentPanel.add(check8);
		
		JCheckBox check9 = new JCheckBox("3/04/11");
		check9.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(check9.isSelected())
					weekIndexes.add(8);
				else
					weekIndexes.remove(new Integer(8));
			}
		});
		check9.setBounds(6, 215, 97, 23);
		contentPanel.add(check9);
		
		JCheckBox check10 = new JCheckBox("3/11/11");
		check10.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(check10.isSelected())
					weekIndexes.add(9);
				else
					weekIndexes.remove(new Integer(9));
			}
		});
		check10.setBounds(6, 241, 97, 23);
		contentPanel.add(check10);
		
		JCheckBox check11 = new JCheckBox("3/18/11");
		check11.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(check11.isSelected())
					weekIndexes.add(10);
				else
					weekIndexes.remove(new Integer(10));
			}
		});
		check11.setBounds(6, 267, 97, 23);
		contentPanel.add(check11);
		
		JCheckBox check12 = new JCheckBox("3/25/11");
		check12.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(check12.isSelected())
					weekIndexes.add(11);
				else
					weekIndexes.remove(new Integer(11));
			}
		});
		check12.setBounds(6, 293, 97, 23);
		contentPanel.add(check12);
		
		JCheckBox check13 = new JCheckBox("4/01/11");
		check13.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(check13.isSelected())
					weekIndexes.add(12);
				else
					weekIndexes.remove(new Integer(12));
			}
		});
		check13.setBounds(6, 319, 97, 23);
		contentPanel.add(check13);
		
		JCheckBox check14 = new JCheckBox("4/08/11");
		check14.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(check14.isSelected())
					weekIndexes.add(13);
				else
					weekIndexes.remove(new Integer(13));
			}
		});
		check14.setBounds(6, 345, 97, 23);
		contentPanel.add(check14);
		
		JCheckBox check15 = new JCheckBox("4/15/11");
		check15.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(check15.isSelected())
					weekIndexes.add(14);
				else
					weekIndexes.remove(new Integer(14));
			}
		});
		check15.setBounds(105, 7, 97, 23);
		contentPanel.add(check15);
		
		JCheckBox check16 = new JCheckBox("4/22/11");
		check16.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(check16.isSelected())
					weekIndexes.add(15);
				else
					weekIndexes.remove(new Integer(15));
			}
		});
		check16.setBounds(105, 33, 97, 23);
		contentPanel.add(check16);
		
		JCheckBox check17 = new JCheckBox("4/29/11");
		check17.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(check17.isSelected())
					weekIndexes.add(16);
				else
					weekIndexes.remove(new Integer(16));
			}
		});
		check17.setBounds(105, 59, 97, 23);
		contentPanel.add(check17);
		
		JCheckBox check18 = new JCheckBox("5/06/11");
		check18.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(check18.isSelected())
					weekIndexes.add(17);
				else
					weekIndexes.remove(new Integer(17));
			}
		});
		check18.setBounds(105, 85, 97, 23);
		contentPanel.add(check18);
		
		JCheckBox check19 = new JCheckBox("5/13/11");
		check19.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(check19.isSelected())
					weekIndexes.add(18);
				else
					weekIndexes.remove(new Integer(18));
			}
		});
		check19.setBounds(105, 111, 97, 23);
		contentPanel.add(check19);
		
		JCheckBox check20 = new JCheckBox("5/20/11");
		check20.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(check20.isSelected())
					weekIndexes.add(19);
				else
					weekIndexes.remove(new Integer(19));
			}
		});
		check20.setBounds(105, 137, 97, 23);
		contentPanel.add(check20);
		
		JCheckBox check21 = new JCheckBox("5/27/11");
		check21.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(check21.isSelected())
					weekIndexes.add(20);
				else
					weekIndexes.remove(new Integer(20));
			}
		});
		check21.setBounds(105, 163, 97, 23);
		contentPanel.add(check21);
		
		JCheckBox check22 = new JCheckBox("6/03/11");
		check22.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(check22.isSelected())
					weekIndexes.add(21);
				else
					weekIndexes.remove(new Integer(21));
			}
		});
		check22.setBounds(105, 189, 97, 23);
		contentPanel.add(check22);
		
		JCheckBox check23 = new JCheckBox("6/10/11");
		check23.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(check23.isSelected())
					weekIndexes.add(22);
				else
					weekIndexes.remove(new Integer(22));
			}
		});
		check23.setBounds(105, 215, 97, 23);
		contentPanel.add(check23);
		
		JCheckBox check24 = new JCheckBox("6/17/11");
		check24.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(check24.isSelected())
					weekIndexes.add(23);
				else
					weekIndexes.remove(new Integer(23));
			}
		});
		check24.setBounds(105, 241, 97, 23);
		contentPanel.add(check24);
		
		JCheckBox check25 = new JCheckBox("6/24/11");
		check25.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(check25.isSelected())
					weekIndexes.add(24);
				else
					weekIndexes.remove(new Integer(24));
			}
		});
		check25.setBounds(105, 267, 97, 23);
		contentPanel.add(check25);
		
		JLabel lblNewLabel = new JLabel("Select all weeks desired.");
		lblNewLabel.setBounds(109, 316, 178, 26);
		contentPanel.add(lblNewLabel);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"<Select All>", "AA", "AXP", "BA", "BAC", "CAT", "CSCO", "CVX", "DD", "DIS", "GE", "HD", "HPQ", "IBM", "INTC", "JNJ", "JPM", "KRFT", "KO", "MCD", "MMM", "MRK", "MSFT", "PFE", "PG", "T", "TRV", "UTX", "VZ", "WMT", "XOM"}));
		comboBox.setMaximumRowCount(31);
		comboBox.setBounds(303, 138, 125, 20);
		contentPanel.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Select desired company");
		lblNewLabel_1.setBounds(303, 115, 159, 14);
		contentPanel.add(lblNewLabel_1);
		
		/*
		 * A monstrosity of a Select All button.
		 */
		check26 = new JCheckBox("Select All");
		check26.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(check26.isSelected())
				{
					check1.setSelected(false);
					check2.setSelected(false);
					check3.setSelected(false);
					check4.setSelected(false);
					check5.setSelected(false);
					check6.setSelected(false);
					check7.setSelected(false);
					check8.setSelected(false);
					check9.setSelected(false);
					check10.setSelected(false);
					check11.setSelected(false);
					check12.setSelected(false);
					check13.setSelected(false);
					check14.setSelected(false);
					check15.setSelected(false);
					check16.setSelected(false);
					check17.setSelected(false);
					check18.setSelected(false);
					check19.setSelected(false);
					check20.setSelected(false);
					check21.setSelected(false);
					check22.setSelected(false);
					check23.setSelected(false);
					check24.setSelected(false);
					check25.setSelected(false);
					weekIndexes.clear();
					stockIndexes.clear();
					check1.doClick();
					check2.doClick();
					check3.doClick();
					check4.doClick();
					check5.doClick();
					check6.doClick();
					check7.doClick();
					check8.doClick();
					check9.doClick();
					check10.doClick();
					check11.doClick();
					check12.doClick();
					check13.doClick();
					check14.doClick();
					check15.doClick();
					check16.doClick();
					check17.doClick();
					check18.doClick();
					check19.doClick();
					check20.doClick();
					check21.doClick();
					check22.doClick();
					check23.doClick();
					check24.doClick();
					check25.doClick();
				}
				else
				{
					check1.setSelected(false);
					check2.setSelected(false);
					check3.setSelected(false);
					check4.setSelected(false);
					check5.setSelected(false);
					check6.setSelected(false);
					check7.setSelected(false);
					check8.setSelected(false);
					check9.setSelected(false);
					check10.setSelected(false);
					check11.setSelected(false);
					check12.setSelected(false);
					check13.setSelected(false);
					check14.setSelected(false);
					check15.setSelected(false);
					check16.setSelected(false);
					check17.setSelected(false);
					check18.setSelected(false);
					check19.setSelected(false);
					check20.setSelected(false);
					check21.setSelected(false);
					check22.setSelected(false);
					check23.setSelected(false);
					check24.setSelected(false);
					check25.setSelected(false);
					weekIndexes.clear();
					stockIndexes.clear();
				}
			}
		});
		check26.setBounds(105, 293, 97, 23);
		contentPanel.add(check26);
		
		JLabel lblNewLabel_2 = new JLabel("Click OK to return");
		lblNewLabel_2.setBounds(551, 358, 131, 14);
		contentPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("If no selection is made, all weeks will be selected.");
		lblNewLabel_3.setBounds(109, 349, 319, 14);
		contentPanel.add(lblNewLabel_3);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 383, 707, 33);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
			{
				/*
				 * When the user clicks 'ok', the program first checks the contents of weekIndexes
				 * ArrayList. If it is empty, the program manually clicks the aforementioned
				 * Select All button.
				 */
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(weekIndexes.isEmpty())
							check26.doClick();
						
						/*
						 * Next, the program checks the comboBox. If the value is 0 (Select all),
						 * every element is added.
						 */
						if(comboBox.getSelectedIndex() == 0)
						{
							stockIndexes.clear();
							stockIndexes.add(0);
							stockIndexes.add(1);
							stockIndexes.add(2);
							stockIndexes.add(3);
							stockIndexes.add(4);
							stockIndexes.add(5);
							stockIndexes.add(6);
							stockIndexes.add(7);
							stockIndexes.add(8);
							stockIndexes.add(9);
							stockIndexes.add(10);
							stockIndexes.add(11);
							stockIndexes.add(12);
							stockIndexes.add(13);
							stockIndexes.add(14);
							stockIndexes.add(15);
							stockIndexes.add(16);
							stockIndexes.add(17);
							stockIndexes.add(18);
							stockIndexes.add(19);
							stockIndexes.add(20);
							stockIndexes.add(21);
							stockIndexes.add(22);
							stockIndexes.add(23);
							stockIndexes.add(24);
							stockIndexes.add(25);
							stockIndexes.add(26);
							stockIndexes.add(27);
							stockIndexes.add(28);
							stockIndexes.add(29);
						}
						else if(comboBox.getSelectedIndex() == 1)
						{
							stockIndexes.clear();
							stockIndexes.add(0);
						}
						else if(comboBox.getSelectedIndex() == 2)
						{
							stockIndexes.clear();
							stockIndexes.add(1);
						}
						else if(comboBox.getSelectedIndex() == 3)
						{
							stockIndexes.clear();
							stockIndexes.add(2);
						}
						else if(comboBox.getSelectedIndex() == 4)
						{
							stockIndexes.clear();
							stockIndexes.add(3);
						}
						else if(comboBox.getSelectedIndex() == 5)
						{
							stockIndexes.clear();
							stockIndexes.add(4);
						}
						else if(comboBox.getSelectedIndex() == 6)
						{
							stockIndexes.clear();
							stockIndexes.add(5);
						}
						else if(comboBox.getSelectedIndex() == 7)
						{
							stockIndexes.clear();
							stockIndexes.add(6);
						}
						else if(comboBox.getSelectedIndex() == 8)
						{
							stockIndexes.clear();
							stockIndexes.add(7);
						}
						else if(comboBox.getSelectedIndex() == 9)
						{
							stockIndexes.clear();
							stockIndexes.add(8);
						}
						else if(comboBox.getSelectedIndex() == 10)
						{
							stockIndexes.clear();
							stockIndexes.add(9);
						}
						else if(comboBox.getSelectedIndex() == 11)
						{
							stockIndexes.clear();
							stockIndexes.add(10);
						}
						else if(comboBox.getSelectedIndex() == 12)
						{
							stockIndexes.clear();
							stockIndexes.add(11);
						}
						else if(comboBox.getSelectedIndex() == 13)
						{
							stockIndexes.clear();
							stockIndexes.add(12);
						}
						else if(comboBox.getSelectedIndex() == 14)
						{
							stockIndexes.clear();
							stockIndexes.add(13);
						}
						else if(comboBox.getSelectedIndex() == 15)
						{
							stockIndexes.clear();
							stockIndexes.add(14);
						}
						else if(comboBox.getSelectedIndex() == 16)
						{
							stockIndexes.clear();
							stockIndexes.add(15);
						}
						else if(comboBox.getSelectedIndex() == 17)
						{
							stockIndexes.clear();
							stockIndexes.add(16);
						}
						else if(comboBox.getSelectedIndex() == 18)
						{
							stockIndexes.clear();
							stockIndexes.add(17);
						}
						else if(comboBox.getSelectedIndex() == 19)
						{
							stockIndexes.clear();
							stockIndexes.add(18);
						}
						else if(comboBox.getSelectedIndex() == 20)
						{
							stockIndexes.clear();
							stockIndexes.add(19);
						}
						else if(comboBox.getSelectedIndex() == 21)
						{
							stockIndexes.clear();
							stockIndexes.add(20);
						}
						else if(comboBox.getSelectedIndex() == 22)
						{
							stockIndexes.clear();
							stockIndexes.add(21);
						}
						else if(comboBox.getSelectedIndex() == 23)
						{
							stockIndexes.clear();
							stockIndexes.add(22);
						}
						else if(comboBox.getSelectedIndex() == 24)
						{
							stockIndexes.clear();
							stockIndexes.add(23);
						}
						else if(comboBox.getSelectedIndex() == 25)
						{
							stockIndexes.clear();
							stockIndexes.add(24);
						}
						else if(comboBox.getSelectedIndex() == 26)
						{
							stockIndexes.clear();
							stockIndexes.add(25);
						}
						else if(comboBox.getSelectedIndex() == 27)
						{
							stockIndexes.clear();
							stockIndexes.add(26);
						}
						else if(comboBox.getSelectedIndex() == 28)
						{
							stockIndexes.clear();
							stockIndexes.add(27);
						}
						else if(comboBox.getSelectedIndex() == 29)
						{
							stockIndexes.clear();
							stockIndexes.add(28);
						}
						else if(comboBox.getSelectedIndex() == 30)
						{
							stockIndexes.clear();
							stockIndexes.add(29);
						}
						
						MainMenu passData = new MainMenu();
						passData.setIndexes(weekIndexes, stockIndexes);
						setVisible(false);
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}


}
