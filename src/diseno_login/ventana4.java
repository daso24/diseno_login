package diseno_login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class ventana4 {

	private JFrame frame;
	private JTextField txtJuanSalvador;
	private JTextField txtSdsds;
	private JTextField txtJuarez;
	private JTextField txtPerez;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana4 window = new ventana4();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ventana4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 255, 128));
		frame.setBounds(100, 100, 472, 406);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 128));
		panel.setBounds(290, 273, 125, 83);
		frame.getContentPane().add(panel);
		
		JButton btnNewButton = new JButton("Nuevo");
		btnNewButton.setBackground(new Color(0, 0, 0));
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("guardar");
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("salir");
		btnNewButton_2.setBackground(new Color(0, 0, 0));
		panel.add(btnNewButton_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 0, 0));
		panel_1.setBounds(10, 273, 214, 83);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_9 = new JLabel("descripcion");
		panel_1.add(lblNewLabel_9);
		
		JTextArea txtrHolaComoEstas = new JTextArea();
		txtrHolaComoEstas.setFont(new Font("Monospaced", Font.PLAIN, 12));
		txtrHolaComoEstas.setText("hola como estan");
		txtrHolaComoEstas.setRows(2);
		txtrHolaComoEstas.setColumns(10);
		panel_1.add(txtrHolaComoEstas);
		
		JLabel lblNewLabel_10 = new JLabel("preferencias");
		panel_1.add(lblNewLabel_10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"cantar", "escuchar musica", "leer", "otros"}));
		panel_1.add(comboBox_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 255, 128));
		panel_2.setBounds(10, 26, 214, 218);
		frame.getContentPane().add(panel_2);
		
		JLabel lblNewLabel = new JLabel("nombres:");
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel);
		
		txtJuanSalvador = new JTextField();
		txtJuanSalvador.setText("juan salvador");
		txtJuanSalvador.setEditable(false);
		panel_2.add(txtJuanSalvador);
		txtJuanSalvador.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("apellido paterno");
		panel_2.add(lblNewLabel_1);
		
		txtJuarez = new JTextField();
		txtJuarez.setText("juarez");
		txtJuarez.setEditable(false);
		panel_2.add(txtJuarez);
		txtJuarez.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("apellido materno");
		panel_2.add(lblNewLabel_2);
		
		txtPerez = new JTextField();
		txtPerez.setText("perez");
		txtPerez.setEditable(false);
		panel_2.add(txtPerez);
		txtPerez.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("fecha de nacimiento");
		panel_2.add(lblNewLabel_3);
		
		txtSdsds = new JTextField();
		txtSdsds.setText("24/10/1992");
		txtSdsds.setEditable(false);
		panel_2.add(txtSdsds);
		txtSdsds.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("sexo");
		lblNewLabel_5.setBackground(new Color(240, 240, 240));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_5);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("masculino");
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setBackground(new Color(0, 255, 128));
		panel_2.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("femenino");
		panel_2.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBackground(new Color(0, 255, 128));
		
		JLabel lblNewLabel_6 = new JLabel("nacionalidad");
		panel_2.add(lblNewLabel_6);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"mexico", "peru", "estados unidos"}));
		comboBox.setToolTipText("");
		panel_2.add(comboBox);
		
		JLabel lblNewLabel_4 = new JLabel("");
		panel_2.add(lblNewLabel_4);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 128, 128));
		panel_3.setBounds(257, 26, 190, 218);
		frame.getContentPane().add(panel_3);
		
		JTextArea txtrInserteImagen = new JTextArea();
		txtrInserteImagen.setText("inserte imagen");
		txtrInserteImagen.setRows(8);
		txtrInserteImagen.setColumns(15);
		panel_3.add(txtrInserteImagen);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("mostrar foto de perfil");
		chckbxNewCheckBox.setBackground(new Color(255, 128, 128));
		chckbxNewCheckBox.setSelected(true);
		panel_3.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("mostrar fecha de nacimiento");
		chckbxNewCheckBox_1.setBackground(new Color(255, 128, 128));
		chckbxNewCheckBox_1.setSelected(true);
		panel_3.add(chckbxNewCheckBox_1);
		
		JLabel lblNewLabel_7 = new JLabel("datos generales");
		lblNewLabel_7.setBounds(10, 11, 97, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("perfil del usuario");
		lblNewLabel_8.setBounds(257, 11, 97, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_11 = new JLabel("datos opcionales");
		lblNewLabel_11.setBounds(10, 255, 97, 14);
		frame.getContentPane().add(lblNewLabel_11);
	}
}
