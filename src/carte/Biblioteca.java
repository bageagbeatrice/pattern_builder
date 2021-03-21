package carte;

import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JButton;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Choice;

public class Biblioteca {

	private JFrame frmTabelBiblioteca;
	private JTextField textF0;
	private JTextField textF1;
	private JTextField textF2;
	private JTextField textF3;
	private JTextField textF4;
	private JTextField textF5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Biblioteca window = new Biblioteca();
					window.frmTabelBiblioteca.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Biblioteca() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTabelBiblioteca = new JFrame();
		frmTabelBiblioteca.setTitle("Tabel Biblioteca ");
		frmTabelBiblioteca.setBounds(100, 100, 493, 362);
		frmTabelBiblioteca.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTabelBiblioteca.getContentPane().setLayout(null);
		
		JButton btnRun = new JButton("Introdu carte");
		btnRun.setBounds(180, 37, 112, 23);
		frmTabelBiblioteca.getContentPane().add(btnRun);
		
		JLabel lblTitlu = new JLabel("Titlul: ");
		lblTitlu.setBounds(23, 77, 46, 14);
		frmTabelBiblioteca.getContentPane().add(lblTitlu);
		
		textF0 = new JTextField(40);
		textF0.setBounds(97, 77, 179, 20);
		frmTabelBiblioteca.getContentPane().add(textF0);
		textF0.setColumns(10);
		
		JLabel lblGen = new JLabel("Genul: ");
		lblGen.setBounds(23, 108, 46, 14);
		frmTabelBiblioteca.getContentPane().add(lblGen);
		
		textF1 = new JTextField(20);
		textF1.setColumns(10);
		textF1.setBounds(97, 108, 86, 20);
		frmTabelBiblioteca.getContentPane().add(textF1);
		
		JLabel lblAutor = new JLabel("Autorul: ");
		lblAutor.setBounds(23, 139, 52, 14);
		frmTabelBiblioteca.getContentPane().add(lblAutor);
		
		textF2 = new JTextField(40);
		textF2.setColumns(10);
		textF2.setBounds(97, 139, 137, 20);
		frmTabelBiblioteca.getContentPane().add(textF2);
		
		JLabel lblEditura = new JLabel("Editura: ");
		lblEditura.setBounds(23, 170, 46, 14);
		frmTabelBiblioteca.getContentPane().add(lblEditura);
		
		textF3 = new JTextField(20);
		textF3.setColumns(10);
		textF3.setBounds(97, 170, 86, 20);
		frmTabelBiblioteca.getContentPane().add(textF3);
		
		textF4 = new JTextField(20);
		textF4.setColumns(10);
		textF4.setBounds(97, 201, 86, 20);
		frmTabelBiblioteca.getContentPane().add(textF4);
		
		JLabel lblPret = new JLabel("Pretul:");
		lblPret.setBounds(23, 201, 46, 14);
		frmTabelBiblioteca.getContentPane().add(lblPret);
		
		Choice choice = new Choice();
		choice.setBounds(155, 265, 28, 20);
		frmTabelBiblioteca.getContentPane().add(choice);
		
		JLabel lblNrvolum = new JLabel("Nr Volume:");
		lblNrvolum.setBounds(23, 271, 70, 14);
		frmTabelBiblioteca.getContentPane().add(lblNrvolum);
		
		JLabel lblNrPagini = new JLabel("Nr Pagini:");
		lblNrPagini.setBounds(23, 232, 60, 14);
		frmTabelBiblioteca.getContentPane().add(lblNrPagini);
		
		textF5 = new JTextField(5);
		textF5.setColumns(10);
		textF5.setBounds(97, 232, 86, 20);
		frmTabelBiblioteca.getContentPane().add(textF5);
		
		
	}
}
