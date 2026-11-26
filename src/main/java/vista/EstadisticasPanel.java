package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class EstadisticasPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	public static final String[] NOMBRES_ESTADISTICAS = { "Vida final", "Daño causado", "Daño recibido", "Ataques",
			"Defensas", "Descansos", "Acciones fallidas" };

	private JLabel lblTitulo;
	private JLabel lblRetratoJugador;
	private JLabel lblNombreJugador;
	private JLabel[] lblEstadisticasJugador;
	private JLabel[] lblValoresJugador;
	private JLabel lblRetratoCpu;
	private JLabel lblNombreCpu;
	private JLabel[] lblEstadisticasCpu;
	private JLabel[] lblValoresCpu;
	private JLabel lblVs;
	private JButton btnSiguiente;
	private JLabel lblGameOver;
	private JLabel lblCajaJugador;
	private JLabel lblCajaCpu;
	private JLabel lblCapaOscura;

	public EstadisticasPanel() {
		setLayout(null);
		setOpaque(false);
		setPreferredSize(new Dimension(EstilosVista.ANCHO_VENTANA, EstilosVista.ALTO_VENTANA));

		int numEstadisticas = NOMBRES_ESTADISTICAS.length;

		lblTitulo = new JLabel("RESULTADO DEL COMBATE", SwingConstants.CENTER);
		lblTitulo.setForeground(EstilosVista.NARANJA);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblTitulo.setBounds(0, 20, EstilosVista.ANCHO_VENTANA, 55);
		add(lblTitulo);

		lblRetratoJugador = new JLabel();
		lblRetratoJugador.setBounds(255, 130, 160, 160);
		add(lblRetratoJugador);

		lblNombreJugador = new JLabel("", SwingConstants.CENTER);
		lblNombreJugador.setForeground(EstilosVista.NARANJA);
		lblNombreJugador.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNombreJugador.setBounds(60, 300, 550, 40);
		add(lblNombreJugador);

		lblEstadisticasJugador = new JLabel[numEstadisticas];
		lblValoresJugador = new JLabel[numEstadisticas];
		for (int i = 0; i < numEstadisticas; i++) {
			int y = 360 + i * 45;

			lblEstadisticasJugador[i] = new JLabel(NOMBRES_ESTADISTICAS[i]);
			lblEstadisticasJugador[i].setForeground(EstilosVista.BLANCO);
			lblEstadisticasJugador[i].setFont(EstilosVista.FUENTE_TEXTO);
			lblEstadisticasJugador[i].setBounds(100, y, 300, 30);
			add(lblEstadisticasJugador[i]);

			lblValoresJugador[i] = new JLabel("", SwingConstants.RIGHT);
			lblValoresJugador[i].setForeground(EstilosVista.BLANCO);
			lblValoresJugador[i].setFont(EstilosVista.FUENTE_TEXTO_NEGRITA);
			lblValoresJugador[i].setBounds(420, y, 150, 30);
			add(lblValoresJugador[i]);
		}

		lblRetratoCpu = new JLabel();
		lblRetratoCpu.setBounds(1085, 130, 160, 160);
		add(lblRetratoCpu);

		lblNombreCpu = new JLabel("", SwingConstants.CENTER);
		lblNombreCpu.setForeground(EstilosVista.NARANJA);
		lblNombreCpu.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNombreCpu.setBounds(890, 300, 550, 40);
		add(lblNombreCpu);

		lblEstadisticasCpu = new JLabel[numEstadisticas];
		lblValoresCpu = new JLabel[numEstadisticas];
		for (int i = 0; i < numEstadisticas; i++) {
			int y = 360 + i * 45;

			lblEstadisticasCpu[i] = new JLabel(NOMBRES_ESTADISTICAS[i]);
			lblEstadisticasCpu[i].setForeground(EstilosVista.BLANCO);
			lblEstadisticasCpu[i].setFont(EstilosVista.FUENTE_TEXTO);
			lblEstadisticasCpu[i].setBounds(930, y, 300, 30);
			add(lblEstadisticasCpu[i]);

			lblValoresCpu[i] = new JLabel("", SwingConstants.RIGHT);
			lblValoresCpu[i].setForeground(EstilosVista.BLANCO);
			lblValoresCpu[i].setFont(EstilosVista.FUENTE_TEXTO_NEGRITA);
			lblValoresCpu[i].setBounds(1250, y, 150, 30);
			add(lblValoresCpu[i]);
		}

		lblVs = new JLabel("VS", SwingConstants.CENTER);
		lblVs.setForeground(EstilosVista.AMARILLO);
		lblVs.setFont(new Font("Tahoma", Font.BOLD, 64));
		lblVs.setBounds(615, 200, 270, 80);
		add(lblVs);

		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setBounds(655, 375, 190, 50);
		EstilosVista.estilizarBoton(btnSiguiente);
		btnSiguiente.setVisible(false);
		add(btnSiguiente);

		lblGameOver = new JLabel("GAME OVER", SwingConstants.CENTER);
		lblGameOver.setForeground(EstilosVista.ROJO_ERROR);
		lblGameOver.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblGameOver.setBounds(615, 360, 270, 70);
		lblGameOver.setVisible(false);
		add(lblGameOver);

		lblCajaJugador = new JLabel();
		lblCajaJugador.setOpaque(true);
		lblCajaJugador.setBackground(EstilosVista.GRIS_BLOQUEADO);
		lblCajaJugador
				.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(EstilosVista.ROJO, 6),
						BorderFactory.createLineBorder(EstilosVista.AMARILLO, 3)));
		lblCajaJugador.setBounds(60, 110, 550, 580);
		add(lblCajaJugador);

		lblCajaCpu = new JLabel();
		lblCajaCpu.setOpaque(true);
		lblCajaCpu.setBackground(EstilosVista.GRIS_BLOQUEADO);
		lblCajaCpu.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(EstilosVista.ROJO, 6),
				BorderFactory.createLineBorder(EstilosVista.AMARILLO, 3)));
		lblCajaCpu.setBounds(890, 110, 550, 580);
		add(lblCajaCpu);

		lblCapaOscura = new JLabel(
				new ImageIcon(getClass().getResource("/img/imagenesPaneles/capa_oscura_1500x800.png")));
		lblCapaOscura.setBounds(0, 0, EstilosVista.ANCHO_VENTANA, EstilosVista.ALTO_VENTANA);
		add(lblCapaOscura);

	}

	public JLabel getLblRetratoJugador() {
		return lblRetratoJugador;
	}

	public JLabel getLblNombreJugador() {
		return lblNombreJugador;
	}

	public JLabel[] getLblValoresJugador() {
		return lblValoresJugador;
	}

	public JLabel getLblRetratoCpu() {
		return lblRetratoCpu;
	}

	public JLabel getLblNombreCpu() {
		return lblNombreCpu;
	}

	public JLabel[] getLblValoresCpu() {
		return lblValoresCpu;
	}

	public JButton getBtnSiguiente() {
		return btnSiguiente;
	}

	public JLabel getLblGameOver() {
		return lblGameOver;
	}
}
