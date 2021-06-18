package misclases;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class Grafico1 extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) throws InterruptedException {
        final Grafico1 frame = new Grafico1();
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    
                    frame.setVisible(true);
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
                
            }
        });
        Thread.sleep(3000);
        frame.dispose();
        new Grafico3().setVisible(true);
        
    }

    /**
     * Create the frame.
     */
    public Grafico1() throws InterruptedException {
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 100);
        
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
        setBounds(400,3,600,900);
          
    }

    public void paint (Graphics g)
    {
       super.paint(g); 
 
//Marco
        
        g.setColor (Color.black);
        g.drawRoundRect (50, 40, 500, 700, 6, 6);
         
        Toolkit t = Toolkit.getDefaultToolkit ();
        
        Image imagen = t.getImage ("imagen1.png");
        g.drawImage (imagen, 100, 50, this);
        Image imagen10 = t.getImage ("imagen10.png");
        g.drawImage (imagen10, 100, 248, this);
        Image imagen2 = t.getImage ("imagen2.png");
        g.drawImage (imagen2, 169, 270, this);
        Image imagen3 = t.getImage ("imagen3.png");
        g.drawImage (imagen3, 475, 650, this);
        Image imagen4 = t.getImage ("imagen4.png");
        g.drawImage (imagen4, 115, 560, this);
        
        
    }
   
    
}