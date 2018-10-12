package project2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class MainMenu extends JFrame 
{
	/*
	 * David Black
	 * Project 2
	 * Object-Oriented MWF 8am
	 * Professor Doderer
	 */
	private JPanel contentPane;
	Data myData = new Data("/project2/dow_jones_index.data");
	private JTable table;
	public static ArrayList<Integer> stockIndexes;
	public static ArrayList<Integer> weekIndexes;
	//public ArrayList<Integer> tstockIndexes;
	//public ArrayList<Integer> tweekIndexes;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	public MainMenu() 
	{
		setTitle("Project 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 671, 455);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		JMenuItem mntmOriginalPredictProgram = new JMenuItem("Original Predict Program....");
		mntmOriginalPredictProgram.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PredictorSim pred = new PredictorSim(myData);
				//pred.setVisible(true);
			}
		});
		mnFile.add(mntmOriginalPredictProgram);
		mnFile.add(mntmExit);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 179, 635, 205);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Open", "High", "Low", "Close", "% Change Price", "Company", "Date"
			}
		) {
			Class[] columnTypes = new Class[] {
				Double.class, Double.class, Double.class, Double.class, Double.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(4).setPreferredWidth(101);
		scrollPane.setViewportView(table);
		
		JButton btnPopulate = new JButton("Populate");
		btnPopulate.setEnabled(false);
		btnPopulate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//tstockIndexes = new ArrayList<Integer>();
				//tweekIndexes = new ArrayList<Integer>();
				//addIndexes(tweekIndexes, tstockIndexes);
				addDataToTable(myData);
			}
		});
		btnPopulate.setBounds(403, 40, 89, 85);
		contentPane.add(btnPopulate);
		
		JButton btnSettings = new JButton("Settings");
		btnSettings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				settingsMenu settings = new settingsMenu();
				settings.setVisible(true);
				btnPopulate.setEnabled(true);
			}
		});
		btnSettings.setBounds(68, 46, 89, 23);
		contentPane.add(btnSettings);
		
		JLabel lblNewLabel = new JLabel("Must first use Settings to Populate");
		lblNewLabel.setBounds(43, 11, 219, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("After using Settings, click Populate. After the first run, more data can be added from the Settings menu.");
		lblNewLabel_1.setBounds(43, 154, 602, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Clear Table");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.setRowCount(0);
			}
		});
		btnNewButton.setBounds(68, 102, 118, 23);
		contentPane.add(btnNewButton);
	}
		public void setIndexes(ArrayList<Integer> wi, ArrayList<Integer> si)
		{
			weekIndexes = new ArrayList<Integer>();
			stockIndexes = new ArrayList<Integer>();
			
			weekIndexes = wi;
			stockIndexes = si;
			
			//System.out.println(weekIndexes);
			//System.out.println(stockIndexes);
		}
		
		public void addDataToTable(Data data)
		{
			//setVisible(true);
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			
			//System.out.println(stockIndexes);
			
			//System.out.println(weekIndexes);
			
			for(int i = 0; i < stockIndexes.size(); i++)
			{
				for(int j = 0; j < weekIndexes.size(); j++)
					model.addRow(new Object[] {data.getStocksWeek(stockIndexes.get(i), weekIndexes.get(j)).getOpen(), 
											data.getStocksWeek(stockIndexes.get(i), weekIndexes.get(j)).getClose(), 
											data.getStocksWeek(stockIndexes.get(i), weekIndexes.get(j)).getHigh(), 
											data.getStocksWeek(stockIndexes.get(i), weekIndexes.get(j)).getLow(), 
											data.getStocksWeek(stockIndexes.get(i), weekIndexes.get(j)).getPerP(), 
											data.getStockSymbol(stockIndexes.get(i)), data.getWeekDate(weekIndexes.get(j))});
			}
		}	
		
}
