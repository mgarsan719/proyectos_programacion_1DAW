package pruebas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;

public class APP1
{

	private JFrame frame;

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
					APP1 window = new APP1();
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
	public APP1()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 725);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nuevo usuario");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(125, 11, 172, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setBounds(0, 0, 434, 686);

		// Cargar la imagen original
		ImageIcon originalIcon = new ImageIcon("C:\\Users\\mgarsan719\\Downloads\\Diego-el-Cigala-AnyaBartels-Suermondt-kpnD--1248x698@abc.jpg");

		// Escalar la imagen al tamaño del JLabel
		Image scaledImage = originalIcon.getImage().getScaledInstance(
		        lblNewLabel.getWidth(),
		        lblNewLabel.getHeight(),
		        Image.SCALE_SMOOTH // para buena calidad
		);

		// Asignar la imagen escalada al JLabel
		lblNewLabel.setIcon(new ImageIcon(scaledImage));

		// Agregar el JLabel al frame
		frame.getContentPane().add(lblNewLabel);
	}
}
