package passv3;
import javax.swing.JOptionPane;
public class PASSV3 {

    public static void main(String[] args) {
        String mensaje;
        do{
            String passin= JOptionPane.showInputDialog("Ingrese Clave");
            mensaje=message(passin);
            
            JOptionPane.showMessageDialog(null,mensaje);
            
        }while(!"Correcto".equals(mensaje));
       
    }//MAIN
    
    static String message(String passin){
        
        String finalmessage="";
        String falta[]={"Correcto",
                        "Necesita 8 caracteres\n",
                        "No deben existir espacios en blanco\n",
                        "Debe iniciar con mayuscula\n",
                        "Debe tener al menos 2 numeros\n",
                        "Debe terminar con pw\n"};
        
        if(tamaño(passin)==false){finalmessage=finalmessage+falta[1];}
        if(espacios(passin)==false){finalmessage=finalmessage+falta[2];}
        if(upcase(passin)==false){finalmessage=finalmessage+falta[3];}
        if(contnum(passin)==false){finalmessage=finalmessage+falta[4];}
        if(endpw(passin)==false){finalmessage=finalmessage+falta[5];}
        if(finalmessage.equals("")){finalmessage=falta[0];}
        return finalmessage;
        
    }

    static boolean tamaño(String passin) {
        
        return passin.length()==8;
    }//METODO VALIDAr tamaño
    
    static boolean espacios(String passin){
        
        return passin.contains(" ")==false;
    }//espacios
    
    static boolean upcase(String passin){
        
        return ((passin.substring(0, 1)).matches("[A-Z]"));
    }//mayusculas
        
    static boolean endpw(String passin){
        
        return (passin.endsWith("pw"));
    }
       
    static boolean contnum(String subpassin){
        int c=0;
        for(int i=0;i<subpassin.length();i++){
            
            if((subpassin.substring(i, i+1)).matches("\\d")){c++;}
            
        }
        return c>=2;
    }
}//CLASS PASS

