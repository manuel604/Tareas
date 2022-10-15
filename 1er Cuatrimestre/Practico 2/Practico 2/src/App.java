import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.TimeZone;

/*                       ACTIVIDAD 1
public class Practica2 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.println("Ingrese un numero para A:");
        a = sc.nextInt();
        System.out.println("Ingrese un numero para B");
        b = sc.nextInt();
        System.out.println("Valores iniciales: A = " + a + "   B = " + b); 
        c = a;
        a = b;
        b = c;
        System.out.println("Valores intercambiados: A = " + a + "   B = " + b); 
    }
}*/
/*                       ACTIVIDAD 2
public class Practica2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a, b, suma, resta, multiplicacion, division;
        System.out.println("Ingrese un valor para A");
        a = sc.nextInt();
        System.out.println("Ingrese un valor para B");
        b = sc.nextInt();
        suma = a + b;
        resta = a - b;
        multiplicacion = a * b;
        division = a / b;
        System.out.println("La suma de los numeros es: " + suma + " la resta es: " + resta + " la multiplicación: " + multiplicacion + " y la división es: " + division);
    }
}*/
/*                       ACTIVIDAD 3
public class Practica2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a, b;
        System.out.println("Ingrese un valor para A");
        a = sc.nextInt();
        System.out.println("Ingrese un valor para B");
        b = sc.nextInt();
        if(a > b) { 
            System.out.println("A es mayor que B");
        }else{
            System.out.println("B es mayor que A");
        }if(a == b) {
            System.out.println("Los dos números son iguales");
        }
    }
}*/
/*                       ACTIVIDAD 4
public class Practica2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese tres valores distintos");

        int a, b, c;
        System.out.println("Ingrese valor para A");
        a = sc.nextInt();
        System.out.println("Ingrese valor para B");
        b = sc.nextInt();
        System.out.println("Ingrese valor para C");
        c = sc.nextInt();
        if(a > b && a > c) {
            System.out.println("El valor A es el mayor");
        } if(b > a && b > c) {
            System.out.println("El valor B es el mayor");
        } if(c > a && c > b) {
            System.out.println("El valor C es el mayor");
        }
    }
}*/
/*                 ACTIVIDAD 5
public class Practica2 {
    public static void main(String[] args) throws Exception {
        int ano, mes, día;
        Scanner sc = new Scanner(System.in);

String letraD = "";
TimeZone timezone = TimeZone.getDefault();
Calendar calendar = new GregorianCalendar(timezone);

System.out.println("Ingrese el año");
ano = sc.nextInt();
System.out.println("Ingrese el mes");
mes = sc.nextInt();
System.out.println("Ingrese el día");
día = sc.nextInt();

int nD=calendar.get(Calendar.DAY_OF_WEEK);
System.out.println("result" + "diasemana: "+letraD+" dia:"+día+" mes:"+mes+"año:" +ano);

switch (nD){
case 1: letraD = "Domingo";
break;
case 2: letraD= "Lunes";
break;
case 3: letraD = "Martes";
break;
case 4: letraD= "Miercoles";
break;
case 5: letraD= "Jueves";
break;
case 6: letraD= "Viernes";
break;
case 7: letraD= "Sabado";
break;
    }
    sc.close();
}
} */
