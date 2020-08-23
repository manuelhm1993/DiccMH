package diccionario.vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

import diccionario.controlador.ControladorAgregarPalabra;

public class MarcoAgregarPalabra extends Marco {
	
	//-------------------- M�todos constructores --------------------//
	public MarcoAgregarPalabra(MarcoPrincipal marcoPrincipal) {
		super(
			marcoPrincipal.getWidth() - (marcoPrincipal.getWidth() / 3),
			(marcoPrincipal.getHeight() / 2),
			"Agregar palabra");		
		this.marcoPrincipal = marcoPrincipal;
		
		crearLaminaCampos();
		crearLaminaEnvio();
		
		ControladorAgregarPalabra.activarEventos(this);
	}
	
	//-------------------- Construir l�mina campos --------------------//
	private void crearLaminaCampos() {
		laminaFormulario = new JPanel(new GridLayout(2, 1));
		laminaFormulario.add(devolverFila(
				"Palabra:",
				new JTextField(),
				new GridLayout(1, 2)));
		laminaFormulario.add(devolverFila(
				"Definici�n:",
				new JTextField(),
				new GridLayout(1, 2)));
		
		add(laminaFormulario, BorderLayout.NORTH);
	}
	
	//-------------------- Construir formulario --------------------//
	private void crearLaminaEnvio() {
		laminaEnvio = new JPanel();
		
		agregarBotones(laminaEnvio, new String[] {"Agregar", "Limpiar campos"});
		
		add(laminaEnvio, BorderLayout.SOUTH);
	}
	
	//-------------------- M�todos getter --------------------//
	public JPanel getLaminaFormulario() {
		return laminaFormulario;
	}
	
	public JPanel getLaminaEnvio() {
		return laminaEnvio;
	}
	
	public MarcoPrincipal getMarcoPrincipal() {
		return marcoPrincipal;
	}

	//-------------------- M�todos campos de clase --------------------//
	private JPanel laminaFormulario;
	private JPanel laminaEnvio;
	private MarcoPrincipal marcoPrincipal;
	private static final long serialVersionUID = 1L;
}
