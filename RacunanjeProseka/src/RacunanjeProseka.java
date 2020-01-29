import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RacunanjeProseka {

	private JFrame frmIzraunajProsekSvojih;
	private JTextField textFieldTehnicko;
	private JTextField textFieldFizicko;
	private JTextField textFieldBiologija;
	private JTextField textFieldGeografija;
	private JTextField textFieldIstorija;
	private JTextField textFieldMuzicko;
	private JTextField textFieldLikovno;
	private JTextField textFieldEngleski;
	private JTextField textFieldMatematika;
	private JTextField textFieldSrpski;
	private JLabel label;

	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RacunanjeProseka window = new RacunanjeProseka();
					window.frmIzraunajProsekSvojih.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private String poruka() {
		String poruka = "Greska, nisu popunjene sve ocene!";
		return poruka;
	}
	
	private String poruka2() {
		String poruka = "Greska, ocena moze biti od 1 do 5!";
		return poruka;
	}

	/**
	 * Create the application.
	 */
	public RacunanjeProseka() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmIzraunajProsekSvojih = new JFrame();
		frmIzraunajProsekSvojih.setTitle("IZRAČUNAJ PROSEK SVOJIH OCENA");
		frmIzraunajProsekSvojih.setBounds(100, 100, 450, 406);
		frmIzraunajProsekSvojih.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmIzraunajProsekSvojih.getContentPane().setLayout(null);
		
		JLabel lblDobrodosliUProgramcic = new JLabel("Dobrodošli u programčić za računanje proseka ocena");
		lblDobrodosliUProgramcic.setBounds(46, 12, 364, 15);
		frmIzraunajProsekSvojih.getContentPane().add(lblDobrodosliUProgramcic);
		
		JLabel lblUnesiteSvojeOcene = new JLabel("Unesite svoje ocene i kliknite na IZRAČUNAJ");
		lblUnesiteSvojeOcene.setBounds(68, 36, 312, 15);
		frmIzraunajProsekSvojih.getContentPane().add(lblUnesiteSvojeOcene);
		
		JLabel lblSrpskiJezik = new JLabel("Srpski jezik:");
		lblSrpskiJezik.setBounds(28, 88, 110, 15);
		frmIzraunajProsekSvojih.getContentPane().add(lblSrpskiJezik);
		
		JLabel lblEngleskiJezik = new JLabel("Engleski jezik:");
		lblEngleskiJezik.setBounds(28, 144, 110, 15);
		frmIzraunajProsekSvojih.getContentPane().add(lblEngleskiJezik);
		
		JLabel lblMatematika = new JLabel("Matematika:");
		lblMatematika.setBounds(28, 115, 110, 15);
		frmIzraunajProsekSvojih.getContentPane().add(lblMatematika);
		
		JLabel lblLikovnaKultura = new JLabel("Likovna kultura:");
		lblLikovnaKultura.setBounds(28, 172, 134, 15);
		frmIzraunajProsekSvojih.getContentPane().add(lblLikovnaKultura);
		
		JLabel lblMuzickaKultura = new JLabel("Muzicka kultura:");
		lblMuzickaKultura.setBounds(28, 199, 134, 15);
		frmIzraunajProsekSvojih.getContentPane().add(lblMuzickaKultura);
		
		JLabel lblIstorija = new JLabel("Istorija:");
		lblIstorija.setBounds(28, 226, 110, 15);
		frmIzraunajProsekSvojih.getContentPane().add(lblIstorija);
		
		JLabel lblGeografija = new JLabel("Geografija:");
		lblGeografija.setBounds(28, 253, 110, 15);
		frmIzraunajProsekSvojih.getContentPane().add(lblGeografija);
		
		JLabel lblBiologija = new JLabel("Biologija:");
		lblBiologija.setBounds(28, 280, 110, 15);
		frmIzraunajProsekSvojih.getContentPane().add(lblBiologija);
		
		JLabel lblTehnickoObrazovanje = new JLabel("Tehnicko obrazovanje:");
		lblTehnickoObrazovanje.setBounds(28, 307, 174, 15);
		frmIzraunajProsekSvojih.getContentPane().add(lblTehnickoObrazovanje);
		
		JLabel lblFizickaKultura = new JLabel("Fizicka kultura:");
		lblFizickaKultura.setBounds(28, 334, 134, 15);
		frmIzraunajProsekSvojih.getContentPane().add(lblFizickaKultura);
		
		textFieldTehnicko = new JTextField();
		textFieldTehnicko.setBounds(212, 305, 44, 19);
		frmIzraunajProsekSvojih.getContentPane().add(textFieldTehnicko);
		textFieldTehnicko.setColumns(10);
		
		textFieldFizicko = new JTextField();
		textFieldFizicko.setColumns(10);
		textFieldFizicko.setBounds(212, 332, 44, 19);
		frmIzraunajProsekSvojih.getContentPane().add(textFieldFizicko);
		
		textFieldBiologija = new JTextField();
		textFieldBiologija.setColumns(10);
		textFieldBiologija.setBounds(212, 278, 44, 19);
		frmIzraunajProsekSvojih.getContentPane().add(textFieldBiologija);
		
		textFieldGeografija = new JTextField();
		textFieldGeografija.setColumns(10);
		textFieldGeografija.setBounds(212, 251, 44, 19);
		frmIzraunajProsekSvojih.getContentPane().add(textFieldGeografija);
		
		textFieldIstorija = new JTextField();
		textFieldIstorija.setColumns(10);
		textFieldIstorija.setBounds(212, 224, 44, 19);
		frmIzraunajProsekSvojih.getContentPane().add(textFieldIstorija);
		
		textFieldMuzicko = new JTextField();
		textFieldMuzicko.setColumns(10);
		textFieldMuzicko.setBounds(212, 197, 44, 19);
		frmIzraunajProsekSvojih.getContentPane().add(textFieldMuzicko);
		
		textFieldLikovno = new JTextField();
		textFieldLikovno.setColumns(10);
		textFieldLikovno.setBounds(212, 170, 44, 19);
		frmIzraunajProsekSvojih.getContentPane().add(textFieldLikovno);
		
		textFieldEngleski = new JTextField();
		textFieldEngleski.setColumns(10);
		textFieldEngleski.setBounds(212, 142, 44, 19);
		frmIzraunajProsekSvojih.getContentPane().add(textFieldEngleski);
		
		textFieldMatematika = new JTextField();
		textFieldMatematika.setColumns(10);
		textFieldMatematika.setBounds(212, 113, 44, 19);
		frmIzraunajProsekSvojih.getContentPane().add(textFieldMatematika);
		
		textFieldSrpski = new JTextField();
		textFieldSrpski.setColumns(10);
		textFieldSrpski.setBounds(212, 86, 44, 19);
		frmIzraunajProsekSvojih.getContentPane().add(textFieldSrpski);
		
		JButton btnIzraunajProsek = new JButton("IZRAČUNAJ");
		btnIzraunajProsek.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
				int srpski;
				srpski = (int) Double.parseDouble(textFieldSrpski.getText());
				if (srpski > 5 || srpski < 1) {
					JOptionPane.showMessageDialog(frmIzraunajProsekSvojih, poruka2());
					double prosek = 0.00;
				
				}
				else {
					srpski = (int) Double.parseDouble(textFieldSrpski.getText());	
				}
				
				int matematika = (int) Double.parseDouble(textFieldMatematika.getText());
				if (matematika > 5 || matematika < 1) {
					JOptionPane.showMessageDialog(frmIzraunajProsekSvojih, poruka2());
				}
				else {
					matematika = (int) Double.parseDouble(textFieldMatematika.getText());	
				}
				
				int engleski = (int) Double.parseDouble(textFieldEngleski.getText());
				if (engleski > 5 || engleski < 1) {
					JOptionPane.showMessageDialog(frmIzraunajProsekSvojih, poruka2());
				}
				else {
					engleski = (int) Double.parseDouble(textFieldEngleski.getText());	
				}
				
				int likovno = (int) Double.parseDouble(textFieldLikovno.getText());
				if (likovno > 5 || likovno < 1) {
					JOptionPane.showMessageDialog(frmIzraunajProsekSvojih, poruka2());
				}
				else {
					likovno = (int) Double.parseDouble(textFieldLikovno.getText());	
				}
				
				int muzicko = (int) Double.parseDouble(textFieldMuzicko.getText());
				if (muzicko > 5 || muzicko < 1) {
					JOptionPane.showMessageDialog(frmIzraunajProsekSvojih, poruka2());
				}
				else {
					muzicko = (int) Double.parseDouble(textFieldMuzicko.getText());	
				}
				
				int istorija = (int) Double.parseDouble(textFieldIstorija.getText());
				if (istorija > 5 || istorija < 1) {
					JOptionPane.showMessageDialog(frmIzraunajProsekSvojih, poruka2());
				}
				else {
					istorija = (int) Double.parseDouble(textFieldIstorija.getText());	
				}
				
				int geografija = (int) Double.parseDouble(textFieldGeografija.getText());
				if (geografija > 5 || geografija < 1) {
					JOptionPane.showMessageDialog(frmIzraunajProsekSvojih, poruka2());
				}
				else {
					geografija = (int) Double.parseDouble(textFieldGeografija.getText());	
				}
				
				int biologija = (int) Double.parseDouble(textFieldBiologija.getText());
				if (biologija > 5 || biologija < 1) {
					JOptionPane.showMessageDialog(frmIzraunajProsekSvojih, poruka2());
				}
				else {
					biologija = (int) Double.parseDouble(textFieldBiologija.getText());	
				}
				
				int tehnicko = (int) Double.parseDouble(textFieldTehnicko.getText());
				if (tehnicko > 5 || tehnicko < 1) {
					JOptionPane.showMessageDialog(frmIzraunajProsekSvojih, poruka2());
				}
				else {
					tehnicko = (int) Double.parseDouble(textFieldTehnicko.getText());	
				}
				
				int fizicko = (int) Double.parseDouble(textFieldFizicko.getText());
				if (fizicko > 5 || fizicko < 1) {
					JOptionPane.showMessageDialog(frmIzraunajProsekSvojih, poruka2());
				}
				else {
					fizicko = (int) Double.parseDouble(textFieldFizicko.getText());	
				}
				
				int zbirOcena = srpski + matematika + engleski + likovno + muzicko + istorija + geografija + biologija + tehnicko + fizicko;
				double prosek;	
				prosek = zbirOcena / 10.00;
				
				if (prosek > 5.00 || prosek < 0.00) {
					prosek = 0.00;
				}
				
				label.setText(String.format("%.2f", prosek));
				
				} catch (Exception greska) {
					JOptionPane.showMessageDialog(frmIzraunajProsekSvojih, poruka());
					
					//Mare, kako da editujem ovde poruku da mi ne izbacuje Empty String u novom prozorcicu nego da napise recimo "Niste lepo uneli ocene"?
				}
				
				
				
				
			}
		});
		btnIzraunajProsek.setBounds(304, 88, 114, 63);
		frmIzraunajProsekSvojih.getContentPane().add(btnIzraunajProsek);
		
		JLabel lblProsek = new JLabel("PROSEK:");
		lblProsek.setBounds(336, 183, 73, 15);
		frmIzraunajProsekSvojih.getContentPane().add(lblProsek);
		
		label = new JLabel("0.00");
		label.setForeground(Color.RED);
		label.setFont(new Font("Dialog", Font.BOLD, 22));
		label.setBounds(336, 210, 64, 27);
		frmIzraunajProsekSvojih.getContentPane().add(label);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				label.setText("0.00");
				textFieldSrpski.setText(" ");
				textFieldMatematika.setText(" ");
				textFieldEngleski.setText(" ");
				textFieldLikovno.setText(" ");
				textFieldMuzicko.setText(" ");
				textFieldIstorija.setText(" ");
				textFieldGeografija.setText(" ");
				textFieldBiologija.setText(" ");
				textFieldTehnicko.setText(" ");
				textFieldFizicko.setText(" ");
			
			}
		});
		btnReset.setBounds(304, 280, 114, 25);
		frmIzraunajProsekSvojih.getContentPane().add(btnReset);
		
		JButton btnIzadji = new JButton("IZADJI");
		btnIzadji.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnIzadji.setBounds(304, 325, 114, 25);
		frmIzraunajProsekSvojih.getContentPane().add(btnIzadji);
	}
}
