package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class RutaPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private JLabel lblTitulo;
	private JLabel lblJugador;
	private JLabel lblNombreJugador;
	private JLabel[] lblRivales;
	private JLabel[] lblNombresRivales;
	private JLabel[] lblFlechas;
	private JButton btnSiguiente;
	private JLabel fondo;

	public RutaPanel() {
		setLayout(null);
		setPreferredSize(new Dimension(EstilosVista.ANCHO_VENTANA, EstilosVista.ALTO_VENTANA));

		lblTitulo = new JLabel("MODO HISTORIA", SwingConstants.CENTER);
		lblTitulo.setForeground(EstilosVista.NEGRO);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblTitulo.setBounds(0, 20, EstilosVista.ANCHO_VENTANA, 50);
		add(lblTitulo);

		lblJugador = new JLabel();
		lblJugador.setBounds(650, 80, 200, 200);
		lblJugador.setBorder(new LineBorder(Color.yellow));
		add(lblJugador);

		lblNombreJugador = new JLabel("", SwingConstants.CENTER);
		lblNombreJugador.setForeground(EstilosVista.BLANCO);
		lblNombreJugador.setFont(EstilosVista.FUENTE_TEXTO_NEGRITA);
		lblNombreJugador.setBounds(550, 285, 400, 30);
		add(lblNombreJugador);

		lblRivales = new JLabel[6];
		lblNombresRivales = new JLabel[6];
		lblFlechas = new JLabel[6 - 1];

		for (int i = 0; i < 6; i++) {
			int x = 130 + i * 210;
			boolean esJefe = (i == 6 - 1);
			int tam = 150;
			int y = 380;
			if (esJefe) {
				tam = 190;
				y = 360;
			}
			lblRivales[i] = new JLabel();
			lblRivales[i].setBounds(x, y, tam, tam);
			add(lblRivales[i]);

			lblNombresRivales[i] = new JLabel("", SwingConstants.CENTER);
			lblNombresRivales[i].setForeground(EstilosVista.BLANCO);
			lblNombresRivales[i].setFont(EstilosVista.FUENTE_TEXTO);
			lblNombresRivales[i].setBounds(x, y + tam + 5, tam, 25);
			add(lblNombresRivales[i]);

			if (!esJefe) {
				lblFlechas[i] = new JLabel("▶", SwingConstants.CENTER);
				lblFlechas[i].setForeground(EstilosVista.NEGRO);
				lblFlechas[i].setFont(new Font("Dialog", Font.BOLD, 30));
				lblFlechas[i].setBounds(x + 150, 430, 60, 50);
				add(lblFlechas[i]);
			}
		}

		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setBounds(655, 640, 190, 45);
		EstilosVista.estilizarBoton(btnSiguiente);
		add(btnSiguiente);

		fondo = new JLabel(new ImageIcon(getClass().getResource("/img/imagenesPaneles/escenario_1500x800.png")));
		fondo.setBounds(0, 0, EstilosVista.ANCHO_VENTANA, EstilosVista.ALTO_VENTANA);
		add(fondo);
	}

	public JLabel getLblJugador() {
		return lblJugador;
	}

	public JLabel getLblNombreJugador() {
		return lblNombreJugador;
	}

	public JLabel[] getLblRivales() {
		return lblRivales;
	}

	public JLabel[] getLblNombresRivales() {
		return lblNombresRivales;
	}

	public JButton getBtnSiguiente() {
		return btnSiguiente;
	}
}
