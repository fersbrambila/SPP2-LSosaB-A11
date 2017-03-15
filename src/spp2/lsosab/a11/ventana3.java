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
public class ventana3 extends Frame{
   private final Button bin1,bin2,bin3,bin4,bin5,bin6,bin7,bin8,bin9;
 
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public ventana3 (){
        super("Ventana 3 <3");
        setLayout(new GridLayout());
        
        bin1 = new Button("Botón 1");
        add (bin1);
        bin2 = new Button("Botón 2");
        add (bin2);
        bin3 = new Button("Botón 3");
        add (bin3);
        bin4 = new Button("Botón 4");
        add (bin4);
        bin5 = new Button("Botón 5");
        add (bin5);
        bin6 = new Button("Botón 6");
        add (bin6);
        bin7 = new Button("Botón 7");
        add (bin7);
        bin8 = new Button("Botón 8");
        add (bin8);
        bin9 = new Button("Botón 9");
        add (bin9);
        
        
        setSize(500,500);
        setVisible(true);
    
    } 
}
