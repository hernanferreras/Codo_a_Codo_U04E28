
package u04e28;

import java.util.Scanner;

public class U04E28 {
    public static void main(String args[]) {
        Scanner entrada=new Scanner(System.in);
        String usuario, clave;
        int a=0;
        do{
            System.out.print("Ingrese el usuario: ");
            usuario=entrada.nextLine();
            System.out.print("Ingrese su clave: ");
            clave=entrada.nextLine();
            if ((usuario.equals("admin"))&&(clave.equals("1234"))){
                a=1;
            }else 
            System.out.print("La contraseña y/o la clave son incorrectas, ingreselas nuevamente\n");
        }while(a!=1);
        System.out.println("Puede ingresar al sistema");
    }
}