package vista;

import java.awt.Color;
import java.awt.Font;

public class EstilosVista {

	public static final Color AMARILLO = new Color(255, 192, 0);
	public static final Color MELOCOTON = new Color(248, 203, 173);
	public static final Color NARANJA = new Color(255, 140, 0);
	public static final Color AZUL = new Color(79, 129, 189);
	public static final Color AZUL_OSCURO = new Color(31, 56, 100);
	public static final Color ROJO = new Color(192, 0, 0);
	public static final Color ROJO_ERROR = Color.RED;
	public static final Color NEGRO = Color.BLACK;
	public static final Color BLANCO = Color.WHITE;
	public static final Color GRIS_BLOQUEADO = new Color(128, 128, 128);

	public static final String FAMILIA_FUENTE = "Tahoma";
	public static final Font FUENTE_LOGO = new Font(FAMILIA_FUENTE, Font.BOLD | Font.ITALIC, 72);
	public static final Font FUENTE_TITULO = new Font(FAMILIA_FUENTE, Font.BOLD, 40);
	public static final Font FUENTE_BOTON_GRANDE = new Font(FAMILIA_FUENTE, Font.BOLD, 32);
	public static final Font FUENTE_BOTON_PEQUENO = new Font(FAMILIA_FUENTE, Font.BOLD, 24);
	public static final Font FUENTE_TEXTO = new Font(FAMILIA_FUENTE, Font.PLAIN, 18);
	public static final Font FUENTE_TEXTO_NEGRITA = new Font(FAMILIA_FUENTE, Font.BOLD, 18);
	public static final Font FUENTE_NUMERO = new Font(FAMILIA_FUENTE, Font.BOLD, 36);

	public static final int ANCHO_VENTANA = 1500;
	public static final int ALTO_VENTANA = 800;
	public static final int ANCHO_BOTON_MENU = 540;
	public static final int ALTO_BOTON_GRANDE = 95;
	public static final int ALTO_BOTON_PEQUENO = 70;
	public static final int ANCHO_BOTON_COMBATE = 220;
	public static final int ALTO_BOTON_COMBATE = 60;
	public static final int SEPARACION_BOTONES = 20;

	public static final String ESTILO_BOTON = "arc: 0; borderWidth: 2; borderColor: #000000; focusedBorderColor: #FFFFFF; focusWidth: 0; innerFocusWidth: 2";
	public static final String ESTILO_BOTON_COMBATE = "arc: 15; borderWidth: 2; borderColor: #1F3864; focusedBorderColor: #FFFFFF; focusWidth: 0; innerFocusWidth: 2";

}
