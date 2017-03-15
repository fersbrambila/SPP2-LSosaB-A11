/*
 * Luisa Fernanda Sosa Brambila
 * A01411485
 *IIS
 */
package spp2.lsosab.a11;
import java.awt.*;
/**
 *
 * @author Fernanda
 */
public class ventana1 extends Frame {
     private final Button btnNorte,btnSur,btnEste,btnOeste,btnCentro;
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public ventana1 (){
        super("Ventana 2 pero le puse 1 e.e");
        setLayout(new BorderLayout());
        
        btnNorte = new Button("Botón Norte");
        add (btnNorte, BorderLayout.NORTH);
        
        btnSur = new Button("Botón Sur");
        add (btnSur, BorderLayout.SOUTH);
        
        btnEste = new Button("Botón Este");
        add (btnEste, BorderLayout.EAST);
        
        btnOeste = new Button("Botón Oeste");
        add (btnOeste, BorderLayout.WEST);
        
        btnCentro = new Button("Botón Centro");
        add (btnCentro, BorderLayout.CENTER);
        
        setSize(800,600);
        setVisible(true);
    
    }
}
