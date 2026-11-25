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
	

	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 15, 1500, 800);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new CardLayout(0, 0));
		setContentPane(contentPane);
		
		menuPanel = new MenuPanel();
		contentPane.add(menuPanel);

	}

	public void cambiarPantalla(String nombre) {
		CardLayout layout = (CardLayout) contentPane.getLayout();
		layout.show(contentPane, nombre);
	}

}
