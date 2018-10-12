package project2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class PredictorSim extends JDialog 
{
	private final JPanel contentPanel = new JPanel();
	Data predData;
	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		try {
			PredictorSim dialog = new PredictorSim();
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
	public PredictorSim(Data data) {
		predData = data;
		setModal(true);
		setLocationRelativeTo(null);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(10, 124, 414, 126);
		contentPanel.add(textArea);
		
		JButton btnNewButton = new JButton("Broker");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				BasicPredictor stockMan = new Broker(predData);
				stockMan.setPortfolioAmount(10000);
				stockMan.predict();
				textArea.setText("Original Portfolio Amount: $10,000.00\n"
								+ "Original Amount + ROI: $"
								+ Double.toString(stockMan.getPortfolioAmount()));
				textArea.getText();
			}
		});
		btnNewButton.setBounds(36, 11, 89, 23);
		contentPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("MegaBroker");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Broker2 stockMan = new Broker2(predData);
				stockMan.setPortfolioAmount(10000);
				stockMan.predict();
				textArea.setText("Original Portfolio Amount: $10,000.00\n"
								+ "Original Amount + ROI: $" 
								+ Double.toString(stockMan.getPortfolioAmount()));
				textArea.getText();
			}
		});
		btnNewButton_1.setBounds(135, 11, 128, 23);
		contentPanel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("UberBroker");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Broker1 stockMan = new Broker1(predData);
				stockMan.setPortfolioAmount(10000);
				stockMan.predict();
				textArea.setText("Original Portfolio Amount: $10,000.00\n"
								+ "Original Amount + ROI: $" 
								+ Double.toString(stockMan.getPortfolioAmount()));
				textArea.getText();
			}
		});
		btnNewButton_2.setBounds(273, 11, 128, 23);
		contentPanel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Return to main");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_3.setBounds(147, 89, 138, 23);
		contentPanel.add(btnNewButton_3);
		//ButtonGroup group = new ButtonGroup();
		setVisible(true);
	}
}
