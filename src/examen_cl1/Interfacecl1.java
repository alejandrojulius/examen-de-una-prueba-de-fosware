package examen_cl1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interfacecl1 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblZona;
	private JButton btnCobrar;
	private static JTextField txtPrecio;
	private JLabel lblPrecio;
	private JTextField txtzona;
	private TextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfacecl1 frame = new Interfacecl1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Interfacecl1() {
		setTitle("Examen de testeo  interface");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 652, 554);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblZona = new JLabel("Zona");
		lblZona.setBounds(10, 11, 66, 14);
		contentPane.add(lblZona);

		btnCobrar = new JButton("Cobrar");
		btnCobrar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCobrar.addActionListener(this);
		btnCobrar.setBounds(318, 21, 185, 60);
		contentPane.add(btnCobrar);

		txtPrecio = new JTextField();
		txtPrecio.setBounds(98, 33, 114, 20);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);

		lblPrecio = new JLabel("Precio S/.");
		lblPrecio.setBounds(10, 36, 66, 14);
		contentPane.add(lblPrecio);

		txtzona = new JTextField();
		txtzona.setBounds(98, 8, 114, 20);
		contentPane.add(txtzona);
		txtzona.setColumns(10);

		textArea = new TextArea();
		textArea.setEditable(false);
		textArea.setBounds(29, 103, 570, 402);
		contentPane.add(textArea);

		txtCantidad = new JTextField();
		txtCantidad.setBounds(98, 64, 86, 20);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);

		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(10, 67, 46, 14);
		contentPane.add(lblCantidad);
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnCobrar) {
			actionPerformedBtnCobrar(arg0);
		}
	}

	// declaracino del precio
	double precio, SUR, Nort, Orie, Occi, Palco, Dsct, Impo;
	private JTextField txtCantidad;
	private JLabel lblCantidad;

	protected void actionPerformedBtnCobrar(ActionEvent arg0) {
		// datos
		precio = getPrecio();
		// asignacioin alas zonas
		SUR = calcularSUR(precio);
		Nort = calcularNort(precio);
		Orie = calcularOrie(precio);
		Occi = calcularOcci(precio);
		Palco = calcularPalco(precio);
		Dsct = calcualrDsct(precio, SUR, Nort, Orie, Occi, Palco);
		Impo = calcularImp(precio);
		// procesa
		mostrar();
	}

	// regalo
	static double calcularImp(double precio) {

		return precio;
	}

	// descuento
	static double calcualrDsct(double precio, double sUR, double nort, double orie, double occi, double palco) {
		return precio - (precio - 10 - 12.5 - 15.5 - 20);
	}

	// precios
	static double calcularPalco(double t) {
		return t;
	}

	static double calcularOcci(double s) {
		return s;
	}

	static double calcularOrie(double r) {
		return r;
	}

	static double calcularNort(double q) {
		return q;
	}

	static double calcularSUR(double p) {

		return p;
	}

	// dataprecio
	private double getPrecio() {
		return Double.parseDouble(txtPrecio.getText());
	}

	// mensajes
	void mostrar() {
		textArea.setText("Cobro de dinero");
		textArea.append("\nEl precio alicado por la compra de entradas en zona sur es:" + SUR);
		textArea.append("\nEl precio alicado por la compra de entradas en zona norte es:" + Nort);
		textArea.append("\nEl precio alicado por la compra de entradas en zona oriente es:" + Orie);
		textArea.append("\nEl precio alicado por la compra de entradas en zona sur occidente:" + Occi);
		textArea.append("\nEl precio alicado por la compra de entradas en zona sur palco:" + Palco);
		textArea.append("\nEl descuento  aplicado es:" + Dsct);
		textArea.append("\nEl regalo  aplicado es:" + Impo);

	}

}
