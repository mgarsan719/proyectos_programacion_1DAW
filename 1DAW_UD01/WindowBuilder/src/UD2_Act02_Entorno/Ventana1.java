package UD2_Act02_Entorno;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;

public class Ventana1
{

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Ventana1 window = new Ventana1();
					window.frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana1()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 576);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NUEVO USUARIO");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(43, 11, 348, 45);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(76, 93, 87, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Contraseña:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(76, 133, 87, 29);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Idioma:");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(76, 173, 87, 29);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Correo Electónico:");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1.setBounds(76, 213, 129, 29);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Teléfono:");
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1.setBounds(76, 253, 87, 29);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Comunicación:");
		lblNewLabel_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1_1.setBounds(76, 293, 108, 29);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Observaciones:");
		lblNewLabel_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(76, 356, 118, 29);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_1_1_1);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setBounds(233, 99, 129, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.LEFT);
		textField_1.setColumns(10);
		textField_1.setBounds(233, 139, 129, 20);
		frame.getContentPane().add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.LEFT);
		textField_3.setColumns(10);
		textField_3.setBounds(233, 219, 129, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.LEFT);
		textField_4.setColumns(10);
		textField_4.setBounds(233, 259, 129, 20);
		frame.getContentPane().add(textField_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Español", "English"}));
		comboBox.setBounds(233, 178, 129, 22);
		frame.getContentPane().add(comboBox);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Teléfono");
		chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox.setBounds(233, 298, 86, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxCorreoElectrnico = new JCheckBox("Correo Electrónico");
		chckbxCorreoElectrnico.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxCorreoElectrnico.setBounds(233, 324, 129, 23);
		frame.getContentPane().add(chckbxCorreoElectrnico);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(233, 360, 129, 64);
		frame.getContentPane().add(textArea);
	}
}
