import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    private static JPanel panel;
    private static JFrame frame;
    private static JLabel Utilizator;
    private static JTextField utilText;
    private static JLabel Parola;
    private static JPasswordField utilParola;
    private static JLabel succes;

    public static void main(String[] args) {

        panel = new JPanel();

        frame = new JFrame();
       frame.setSize(200, 200);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       frame.add(panel);

       panel.setLayout(null);

       Utilizator = new JLabel("Utilizator");
       Utilizator.setBounds(10, 20, 80,25);
       panel.add(Utilizator);

       utilText = new JTextField();
       utilText.setBounds(80, 20, 80, 25);
       panel.add(utilText);

       Parola = new JLabel("Parola");
       Parola.setBounds(10, 40, 80, 25);
       panel.add(Parola);

       utilParola = new JPasswordField();
       utilParola.setBounds(80,40, 80, 25);
       panel.add(utilParola);

       JButton button = new JButton("Login");
        button.setBounds(80, 80, 70,30);
        panel.add(button);
        button.addActionListener(new GUI());

        succes = new JLabel("");
       succes.setBounds(80,100, 500,80);
       panel.add(succes);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String utilizator = utilText.getText();
        String parola = utilParola.getText();

            if(utilizator.equals("Sebi") && parola.equals("salut")){
                succes.setText("Autentificare cu succes!");
            } else {
                succes.setText("Datele de autentificare sunt gresite.");
            }
    }
}