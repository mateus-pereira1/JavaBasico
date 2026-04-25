
package idiomasistema;

import java.util.Locale;

public class IdiomaSistema {

    public static void main(String[] args) {
        Locale idioma = Locale.getDefault();
        
        String idiomaDoSistema = idioma.getDisplayLanguage();
        
        System.out.println("Meu idioma é: "+idiomaDoSistema);
      
    }
    
}
