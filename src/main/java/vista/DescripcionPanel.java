package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class DescripcionPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private static final Color GRIS_CELDA = new Color(45, 45, 45);
	private static final Color GRIS_BORDE = new Color(110, 110, 110);
	private static final Font FUENTE_ETIQUETA = new Font(EstilosVista.FAMILIA_FUENTE, Font.PLAIN, 26);

	private JComboBox<String> cmbLuchadores;
	private JLabel lblNombre;
	private JLabel lblValorNombre;
	private JLabel lblEdad;
	private JLabel lblValorEdad;
	private JLabel lblEstatura;
	private JLabel lblValorEstatura;
	private JLabel lblPeso;
	private JLabel lblValorPeso;
	private JLabel lblPotencia;
	private JLabel lblValorPotencia;
	private JLabel lblVelocidad;
	private JLabel lblValorVelocidad;
	private JLabel lblFisico;
	private JLabel lblValorFisico;
	private JLabel lblDescripcion;
	private JTextArea txtDescripcion;
	private JLabel lblImagen;
	private JButton btnAtras;

	public DescripcionPanel() {
		setLayout(null);
		setPreferredSize(new Dimension(EstilosVista.ANCHO_VENTANA, EstilosVista.ALTO_VENTANA));

		cmbLuchadores = new JComboBox<String>();
		cmbLuchadores.addItem("Ryu");
		cmbLuchadores.addItem("Ken");
		cmbLuchadores.addItem("Guile");
		cmbLuchadores.addItem("Chun-Li");
		cmbLuchadores.addItem("Honda");
		cmbLuchadores.addItem("Dhalsim");
		cmbLuchadores.addItem("Blanka");
		cmbLuchadores.addItem("Vega");
		cmbLuchadores.addItem("Zangief");
		cmbLuchadores.addItem("Dee Jay");
		cmbLuchadores.addItem("T.Hawk");
		cmbLuchadores.addItem("Cammy");
		cmbLuchadores.addItem("Balrog");
		cmbLuchadores.addItem("Sagat");
		cmbLuchadores.addItem("M.Bison");
		cmbLuchadores.setSelectedItem("Guile");
		cmbLuchadores.setFont(EstilosVista.FUENTE_BOTON_PEQUENO);
		cmbLuchadores.setBounds(90, 70, 470, 55);
		add(cmbLuchadores);

		lblNombre = crearEtiqueta("Nombre:", 90, 190, 130, 45);
		lblValorNombre = crearValor("Guile", EstilosVista.FUENTE_TITULO, 225, 185, 600, 50);

		lblEdad = crearEtiqueta("Edad:", 90, 290, 85, 45);
		lblValorEdad = crearValor("42", EstilosVista.FUENTE_BOTON_GRANDE, 180, 287, 80, 45);

		lblEstatura = crearEtiqueta("Estatura:", 300, 290, 125, 45);
		lblValorEstatura = crearValor("1,85 m", EstilosVista.FUENTE_BOTON_GRANDE, 430, 287, 150, 45);

		lblPeso = crearEtiqueta("Peso:", 620, 290, 80, 45);
		lblValorPeso = crearValor("100 kg", EstilosVista.FUENTE_BOTON_GRANDE, 705, 287, 160, 45);

		lblPotencia = crearCabecera("POTENCIA", 115, 380);
		lblValorPotencia = crearCelda("34", 115, 380);

		lblVelocidad = crearCabecera("VELOCIDAD", 370, 380);
		lblValorVelocidad = crearCelda("25", 370, 380);

		lblFisico = crearCabecera("FÍSICO", 625, 380);
		lblValorFisico = crearCelda("31", 625, 380);

		lblDescripcion = crearEtiqueta("Descripción:", 90, 570, 200, 40);

		txtDescripcion = new JTextArea(
				"Ingresa al torneo para poner a M.Bison bajo custodia por ser el asesino de su mejor amigo Charlie, "
						+ "sólo la victoria sobre el mismo le hará enfrentarse a él y poder derrotarlo.");
		txtDescripcion.setFont(EstilosVista.FUENTE_TEXTO);
		txtDescripcion.setForeground(EstilosVista.BLANCO);
		txtDescripcion.setOpaque(false);
		txtDescripcion.setEditable(false);
		txtDescripcion.setFocusable(false);
		txtDescripcion.setLineWrap(true);
		txtDescripcion.setWrapStyleWord(true);
		txtDescripcion.setBounds(90, 615, 800, 110);
		add(txtDescripcion);

		lblImagen = new JLabel();
		lblImagen.setHorizontalAlignment(SwingConstants.CENTER);
		lblImagen.setBorder(BorderFactory.createLineBorder(EstilosVista.AMARILLO, 6));
		lblImagen.setBounds(960, 40, 480, 520);
		add(lblImagen);

		btnAtras = new JButton("Atrás");
		btnAtras.setFont(EstilosVista.FUENTE_BOTON_GRANDE);
		btnAtras.setBackground(EstilosVista.MELOCOTON);
		btnAtras.setForeground(EstilosVista.NEGRO);
		btnAtras.putClientProperty("FlatLaf.style", EstilosVista.ESTILO_BOTON);
		btnAtras.setBounds(1080, 630, 360, EstilosVista.ALTO_BOTON_PEQUENO);
		add(btnAtras);
	}

	private JLabel crearEtiqueta(String texto, int x, int y, int ancho, int alto) {
		JLabel etiqueta = new JLabel(texto);
		etiqueta.setFont(FUENTE_ETIQUETA);
		etiqueta.setForeground(EstilosVista.AMARILLO);
		etiqueta.setBounds(x, y, ancho, alto);
		add(etiqueta);
		return etiqueta;
	}

	private JLabel crearValor(String texto, Font fuente, int x, int y, int ancho, int alto) {
		JLabel valor = new JLabel(texto);
		valor.setFont(fuente);
		valor.setForeground(EstilosVista.BLANCO);
		valor.setBounds(x, y, ancho, alto);
		add(valor);
		return valor;
	}

	private JLabel crearCabecera(String texto, int x, int y) {
		JLabel cabecera = new JLabel(texto, SwingConstants.CENTER);
		cabecera.setFont(EstilosVista.FUENTE_BOTON_PEQUENO);
		cabecera.setForeground(EstilosVista.AMARILLO);
		cabecera.setOpaque(true);
		cabecera.setBackground(GRIS_CELDA);
		cabecera.setBorder(BorderFactory.createMatteBorder(3, 3, 0, 3, GRIS_BORDE));
		cabecera.setBounds(x, y, 255, 60);
		add(cabecera);
		return cabecera;
	}

	private JLabel crearCelda(String texto, int x, int y) {
		JLabel celda = new JLabel(texto, SwingConstants.CENTER);
		celda.setFont(EstilosVista.FUENTE_NUMERO);
		celda.setForeground(EstilosVista.BLANCO);
		celda.setOpaque(true);
		celda.setBackground(GRIS_CELDA);
		celda.setBorder(BorderFactory.createMatteBorder(0, 3, 3, 3, GRIS_BORDE));
		celda.setBounds(x, y + 60, 255, 90);
		add(celda);
		return celda;
	}

	public JComboBox<String> getCmbLuchadores() {
		return cmbLuchadores;
	}

	public JLabel getLblValorNombre() {
		return lblValorNombre;
	}

	public JLabel getLblValorEdad() {
		return lblValorEdad;
	}

	public JLabel getLblValorEstatura() {
		return lblValorEstatura;
	}

	public JLabel getLblValorPeso() {
		return lblValorPeso;
	}

	public JLabel getLblValorPotencia() {
		return lblValorPotencia;
	}

	public JLabel getLblValorVelocidad() {
		return lblValorVelocidad;
	}

	public JLabel getLblValorFisico() {
		return lblValorFisico;
	}

	public JTextArea getTxtDescripcion() {
		return txtDescripcion;
	}

	public JLabel getLblImagen() {
		return lblImagen;
	}

	public JButton getBtnAtras() {
		return btnAtras;
	}
}
