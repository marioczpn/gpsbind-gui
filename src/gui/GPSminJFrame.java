package gui;

import gpsbabel.CMDLineWin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.TitledBorder;
import java.awt.Dimension;



/***
 * This class intents to be a helper to Launch class, in order to set main UI
 * Desktop Window configuration
 * 
 * 
 * @author 
 *
 */
public class GPSminJFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JPanel jPanel = null;
	private JLabel jlabel1;
	private JButton jButton1;
	private JTextField jTextField2;
	private JButton jButton2;
	private JTextField jTextField1;
	private JPanel jPanel11 = null;
	private JLabel jLabel2;
	private JButton jButton3;
	private JRadioButton jRadioButton3;
	private JRadioButton jRadioButton2 = null;
	private JRadioButton jRadioButton11 = null;
	private JPanel jPanel111 = null;
	private JButton jButton = null;
	private JComboBox jComboBox = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JLabel jLabel3 = null;
	/**
	 * This method initializes jPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			jLabel3 = new JLabel();
			jLabel3.setBounds(new Rectangle(1, 3, 75, 61));
			jLabel3.setIcon(new ImageIcon(getClass().getResource("/icons/connect_to_network.png")));
			jLabel3.setText("");
			jLabel1 = new JLabel();
			jLabel1.setBounds(7, 232, 524, 16);
			jLabel1.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel1.setText("GPSBind v. 0.1 - 2010");
			jLabel = new JLabel();
			jLabel.setFont(new java.awt.Font("Dialog",0,12));
			jLabel.setBounds(6, 23, 38, 16);
			jLabel.setText("Port");
			jPanel = new JPanel();
			jPanel.setLayout(null);
			jPanel.setPreferredSize(new java.awt.Dimension(536, 225));
			jPanel.add(getJPanel11(), null);
			jPanel.add(getJPanel111(), null);
			jPanel.add(getJRadioButton2(), null);
			jPanel.add(getJRadioButton11(), null);
			jPanel.add(getJRadioButton3(), null);
			jPanel.add(jLabel1, null);
			jPanel.add(jLabel3, null);
		}
		return jPanel;
	}

	/**
	 * This method initializes jPanel11	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel11() {
		if (jPanel11 == null) {
			jPanel11 = new JPanel();
			jPanel11.setLayout(null);
			jPanel11.setBounds(4, 66, 531, 81);
			jPanel11.setFont(new Font("Dialog", Font.PLAIN, 10));
			jPanel11.setBorder(BorderFactory.createTitledBorder(null, "Transfer GPX File (GPS)", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Dialog", Font.BOLD, 12), new Color(51, 51, 51)));
			jPanel11.add(getJButton3(), null);
			jPanel11.add(getJButton1(), null);
			jPanel11.add(getJTextField1(), null);
			jPanel11.add(getJlabel1(), null);
			jPanel11.add(getJComboBox(), null);
			jPanel11.add(jLabel, null);
		}
		return jPanel11;
	}

	/**
	 * This method initializes jRadioButton2	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getJRadioButton2() {
		if (jRadioButton2 == null) {
			jRadioButton2 = new JRadioButton();
			jRadioButton2.setText("Waypoints");
			jRadioButton2.setBounds(new Rectangle(155, 24, 89, 20));
			jRadioButton2.setFont(new Font("Dialog", Font.PLAIN, 12));
		}
		return jRadioButton2;
	}

	/**
	 * This method initializes jRadioButton11	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getJRadioButton11() {
		if (jRadioButton11 == null) {
			jRadioButton11 = new JRadioButton();
			jRadioButton11.setText("Routes");
			jRadioButton11.setBounds(new Rectangle(261, 24, 89, 20));
			jRadioButton11.setFont(new Font("Dialog", Font.PLAIN, 12));
		}
		return jRadioButton11;
	}

	/**
	 * This method initializes jPanel111	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel111() {
		if (jPanel111 == null) {
			jPanel111 = new JPanel();
			jPanel111.setLayout(null);
			jPanel111.setBounds(5, 148, 530, 81);
			jPanel111.setFont(new Font("Dialog", Font.PLAIN, 10));
			jPanel111.setBorder(BorderFactory.createTitledBorder(null, "GPX To SHP", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Dialog", Font.BOLD, 12), new Color(51, 51, 51)));
			jPanel111.add(getJLabel2(), null);
			jPanel111.add(getJButton(), null);
			jPanel111.add(getJTextField2(), null);
			jPanel111.add(getJButton2());
		}
		return jPanel111;
	}

	/**
	 * This method initializes jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton() {
		if (jButton == null) {
			jButton = new JButton();
			jButton.setText("");
			jButton.setBounds(477, 37, 45, 31);
			jButton.setIcon(new ImageIcon(getClass().getResource("/icons/button_ok.png")));
			jButton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					String type = null;
					CMDLineWin cmd = new CMDLineWin();
					if(jRadioButton2.isSelected())
						type = "-w";					
					else if(jRadioButton11.isSelected())
						type = "-r";					
					else if(jRadioButton3.isSelected())
						type = "-t";
					else
						JOptionPane.showMessageDialog(null, "Please, select one option.");

					cmd.runGPX2SHP(jTextField2.getText(), type);
					jTextField2.setText("");
				}
			});
		}
		return jButton;
	}

	/**
	 * This method initializes jComboBox	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJComboBox() {
		if (jComboBox == null) {
			jComboBox = new JComboBox();
			jComboBox.setFont(new Font("Dialog", Font.PLAIN, 12));
			jComboBox.setBounds(6, 41, 86, 29);
			for(int i=1;i<4;i++)
				jComboBox.addItem("COM"+i);
			jComboBox.addItem("USB");
		}
		return jComboBox;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GPSminJFrame thisClass = new GPSminJFrame();
				thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				thisClass.setVisible(true);
				thisClass.setLocationRelativeTo(null);

			}
		});
	}

	/**
	 * This is the default constructor
	 */
	public GPSminJFrame() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(550, 284);
		this.setContentPane(getJContentPane());
		this.setTitle("GPSBIND - GUI v.0.1");
		this.setResizable(true);


	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.setPreferredSize(new java.awt.Dimension(539, 250));
			jContentPane.add(getJPanel(), BorderLayout.WEST);
		}
		return jContentPane;
	}

	private JLabel getJlabel1() {
		if(jlabel1 == null) {
			jlabel1 = new JLabel();
			jlabel1.setText("GPX file");
			jlabel1.setBounds(99, 19, 326, 22);
			jlabel1.setFont(new Font("Dialog", Font.PLAIN, 12));
		}
		return jlabel1;
	}

	private JTextField getJTextField1() {
		if(jTextField1 == null) {
			jTextField1 = new JTextField();
			jTextField1.setFont(new java.awt.Font("Tahoma",0,12));
			jTextField1.setBounds(98, 42, 328, 30);
		}
		return jTextField1;
	}

	private JButton getJButton1() {
		if(jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setText("");
			jButton1.setToolTipText("Save *.gpx file");
			jButton1.setBounds(430, 41, 45, 31);
			jButton1.setIcon(new ImageIcon(getClass().getResource("/icons/3floppy_unmount.png")));
			jButton1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					JFileChooser fc = new JFileChooser();
					int res = fc.showSaveDialog(null);
					if (res == JFileChooser.APPROVE_OPTION) {
						jTextField1.setText(fc.getSelectedFile().getAbsolutePath());
					}
				}
			});
		}
		return jButton1;
	}

	private JButton getJButton2() {
		if(jButton2 == null) {
			jButton2 = new JButton();
			jButton2.setText("");
			jButton2.setToolTipText("Open *.gpx file");
			jButton2.setIcon(new ImageIcon(getClass().getResource("/icons/folder_open.png")));
			jButton2.setBounds(428, 37, 45, 31);
			jButton2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					JFileChooser fc = new JFileChooser();
					int res = fc.showOpenDialog(null);
					if (res == JFileChooser.APPROVE_OPTION) {
						jTextField2.setText(fc.getSelectedFile().getAbsolutePath());
					}
				}
			});
		}
		return jButton2;
	}

	private JTextField getJTextField2() {
		if(jTextField2 == null) {
			jTextField2 = new JTextField();
			jTextField2.setBounds(9, 38, 416, 30);
		}
		return jTextField2;
	}

	private JRadioButton getJRadioButton3() {
		if(jRadioButton3 == null) {
			jRadioButton3 = new JRadioButton();
			jRadioButton3.setText("Tracks");
			jRadioButton3.setBounds(new Rectangle(367, 24, 89, 20));
			jRadioButton3.setFont(new Font("Dialog",Font.PLAIN,12));
		}
		return jRadioButton3;
	}

	private JLabel getJLabel2() {
		if(jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setText("Shapefile name (gpx-to-shp):");
			jLabel2.setFont(new Font("Dialog", Font.PLAIN, 12));
			jLabel2.setBounds(8, 19, 415, 14);
		}
		return jLabel2;
	}

	private JButton getJButton3() {
		if(jButton3 == null) {
			jButton3 = new JButton();
			jButton3.setText("");
			jButton3.setActionCommand("start");
			jButton3.setBounds(478, 41, 45, 31);
			jButton3.setIcon(new ImageIcon(getClass().getResource("/icons/button_ok.png")));
			jButton3.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					String type = null;
					CMDLineWin cmd = new CMDLineWin();
					if(jRadioButton2.isSelected())
						type = "-w";					
					else if(jRadioButton11.isSelected())
						type = "-r";					
					else if(jRadioButton3.isSelected())
						type = "-t";
					else
						JOptionPane.showMessageDialog(null, "Please, select one option.");
					
					cmd.runGPSBabel(jTextField1.getText(), jComboBox.getSelectedItem().toString(), type);
					jTextField1.setText("");
				}
			});
		}
		return jButton3;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
