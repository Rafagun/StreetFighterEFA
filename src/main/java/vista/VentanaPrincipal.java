package vista;

import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private MenuPanel menuPanel;
	private LoginPanel loginPanel;
	private RegistroPanel registroPanel;
	private DescripcionPanel descripcionPanel;

	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("Street Figther 2");
		setBounds(100, 15, 1500, 800);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(1, 1, 1, 1));
		contentPane.setLayout(new CardLayout(0, 0));
		setContentPane(contentPane);

		menuPanel = new MenuPanel();
		contentPane.add(menuPanel, "MENU");

		loginPanel = new LoginPanel();
		contentPane.add(loginPanel, "LOGIN");

		registroPanel = new RegistroPanel();
		contentPane.add(registroPanel, "REGISTRO");
		
		descripcionPanel = new DescripcionPanel();
		contentPane.add(descripcionPanel, "DESCRIPCION");
		
		cambiarPantalla("DESCRIPCION");

	}

	public void cambiarPantalla(String nombre) {
		CardLayout layout = (CardLayout) contentPane.getLayout();
		layout.show(contentPane, nombre);
	}

}
