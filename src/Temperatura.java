import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class Temperatura extends JFrame{
   private JButton boton1; 
   private JTextField campo;
   private JLabel etiqueta3;
   private JLabel etiqueta;
   private JLabel etiqueta4;
   //private float centigrados;
   
    public Temperatura(){
        super("ViruzBlog: Conversión de Temperaturas");
        setSize(350,140);
        setBackground(Color.gray);
        setLayout(new FlowLayout());
        addComponentes();
        addEventos();
        setVisible(true);
        setLocationRelativeTo(null);
    }
        public void addComponentes(){
           JPanel p=new JPanel();
           JPanel p2=new JPanel();
           boton1 = new JButton("Convertir");
           etiqueta = new JLabel("Introduce los grados Farenheit");
           campo = new JTextField(5);
           JLabel etiqueta2 = new JLabel("Tu conversion es");
           etiqueta3 = new JLabel();
           etiqueta4 = new JLabel();
           
          p.add(etiqueta);
          add(p,"North");
          add(campo);
          add(p2,"Center");
          add(boton1);
          add(etiqueta2);
          add(etiqueta3);
          add(etiqueta4);
       }
        
       public void addEventos(){
            addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
        boton1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
                  float fahrenheit;
                  float kelvin;
                  float centigrados;
            //El método parseFloat devuelve un valor numérico igual al número 
            //contenido en cadenanumérica. Si no se puede analizar el prefijo 
            //de cadenanumérica en un número de coma flotante, se devuelve NaN 
            //(no es un número).
                fahrenheit = Float.parseFloat(campo.getText());
                centigrados = (5f/9f)*(fahrenheit -32f);
                etiqueta3.setText(centigrados+" Grados Centigrados");
            //getText agarra el String
            //setText asigna el String
                kelvin = Float.parseFloat(campo.getText());
                kelvin = (float) ((fahrenheit + 459.67) / 1.8);
                etiqueta4.setText(kelvin +" Grados Kelvin");
            }
         });
       }
}
 