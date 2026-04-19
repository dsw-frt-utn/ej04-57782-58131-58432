package app;

import data.Persistencia;
import java.util.InvalidPropertiesFormatException;
import views.Menuprin;

public class Program {
    public static void main(String[] args) throws IllegalArgumentException, InvalidPropertiesFormatException {
        Persistencia.inicializar();
        Menuprin view1= new Menuprin();
        view1.setVisible(true);
       
    }
}
