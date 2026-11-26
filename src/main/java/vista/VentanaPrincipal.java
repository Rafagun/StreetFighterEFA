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
	private CombatePanel combatePanel;
	private SeleccionPanel seleccionPanel;
	private RutaPanel rutaPanel;

	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("Street Figther");
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

		combatePanel = new CombatePanel();
		contentPane.add(combatePanel, "COMBATE");

		seleccionPanel = new SeleccionPanel();
		contentPane.add(seleccionPanel, "SELECCION");

		rutaPanel = new RutaPanel();
		contentPane.add(rutaPanel, "RUTA");

		cambiarPantalla("LOGIN");

	}

	public void cambiarPantalla(String nombre) {
		CardLayout layout = (CardLayout) contentPane.getLayout();
		layout.show(contentPane, nombre);
	}

	public MenuPanel getMenuPanel() {
		return menuPanel;
	}

	public void setMenuPanel(MenuPanel menuPanel) {
		this.menuPanel = menuPanel;
	}

	public LoginPanel getLoginPanel() {
		return loginPanel;
	}

	public void setLoginPanel(LoginPanel loginPanel) {
		this.loginPanel = loginPanel;
	}

	public RegistroPanel getRegistroPanel() {
		return registroPanel;
	}

	public void setRegistroPanel(RegistroPanel registroPanel) {
		this.registroPanel = registroPanel;
	}

	public DescripcionPanel getDescripcionPanel() {
		return descripcionPanel;
	}

	public void setDescripcionPanel(DescripcionPanel descripcionPanel) {
		this.descripcionPanel = descripcionPanel;
	}

	public CombatePanel getCombatePanel() {
		return combatePanel;
	}

	public void setCombatePanel(CombatePanel combatePanel) {
		this.combatePanel = combatePanel;
	}

	public SeleccionPanel getSeleccionPanel() {
		return seleccionPanel;
	}

	public void setSeleccionPanel(SeleccionPanel seleccionPanel) {
		this.seleccionPanel = seleccionPanel;
	}

	public RutaPanel getRutaPanel() {
		return rutaPanel;
	}

	public void setRutaPanel(RutaPanel rutaPanel) {
		this.rutaPanel = rutaPanel;
	}

}
