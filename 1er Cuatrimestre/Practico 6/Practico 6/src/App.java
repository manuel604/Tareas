import java.util.Scanner;


/*public class App {
    public static void main(String[] args) throws Exception {
        
         int a;

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Ingrese un número entre 0 y 999");
        a = sc.nextInt();
        if (a >= 100) {
            System.out.println("El número ques usted ingreso es de tres dígitos");
        }else if (a >= 10) {
            System.out.println("El número que usted ingreso es de dos dígitos");
        }else if(a > 0 && a <10){
                System.out.println("El número que usted ingreso es de un dígito");

        if (a > 999){
            System.out.println("Ingrese un número válido");
            }
        } 
    } while(a != 0);
      if (a == 0) {
            System.out.println("El programa finalizó");
        }

        sc.close();
}
}               */
                          
/*                       ACTIVIDAD 2
public class App {
    public static void main(String[] args) throws Exception {
        int n;
        int n1 = 0;
        int n2 = 0;

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Ingresar la nota de los alumnos");
            n = sc.nextInt();

            if(n > 0 && n <= 7 ) {
                n1 = n1 + 1;
            }else if(n >= 7 && n <= 10) {
                n2 = n2 + 1;
            }
        
        } while (n != 0);
        System.out.println("La cantidad de notas de igual o menor valor a 7 es de: " + n1);
        System.out.println(" La cantidad de notas de mayor valor a 7 es de: " + n2);

        sc.close();
    }
}*/

/*                       ACTIVIDAD 3
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n;
        int suma = 0;
        int prom = 0;

        for( n = 0; n < 26; n++) {
            System.out.println("Ingrese las edades de las personas");
            n = sc.nextInt();
             suma = suma + n;
             prom = prom + suma / n;
        }
        System.out.println(" El promedio de las edades de las personas es igual a: " + prom);

        sc.close();
    }
}*/


public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n;

        for(n = 0; n < 100; n++) {
        System.out.println("Los numeros son: " + (n + 1));
        }

        sc.close();
    }
}