import java.util.Scanner;

/*public class App {
    public static void main(String[] args) throws Exception {
        int num1, num2;

        Scanner scan = new Scanner(System.in);

        do {
        System.out.println("Ingrese un numero");
        num1 = scan.nextInt();
        System.out.println("Ingrese otro numero");
        num2 = scan.nextInt();

        }while(num1 != num2);
        System.out.println("El primer numero es igual al segundo");

        scan.close();
    }
}
*/
/*public class App {
    public static void main(String[] args) throws Exception {
        int a;
        int suma = 0;
        int cont = 1;
        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("Ingrese un numero");
            a = scan.nextInt();
            cont++;
            suma = suma + a;
        }while(cont <= 10);
        System.out.println("La suma de todos los numeros es: " + suma);


        scan.close();


    }
}*/
/*public class App {
    public static void main(String[] args) throws Exception {
        int a;
        int suma = 0;
        int cont;

        Scanner scan = new Scanner(System.in);

        for(cont = 1; cont<10; cont++); {
            System.out.println("Ingrese un numero " + cont + " a sumar");
        a = scan.nextInt();
        suma = suma + a;
        }
        {System.out.println("La suma de todos los numeros es: " + suma);}
        
        scan.close();
    }
}*/
/*public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int dia;

        System.out.println("Ingrese un numero");
        dia = scan.nextInt();
        

        switch (dia){
        case 1:
        System.out.println("lunes");
        break;
        case 2:
        System.out.println("martes");
        break;
        case 3:
        System.out.println("miercoles");
        break;
        case 4:
        System.out.println("jueves");
        break;
        case 5:
        System.out.println("viernes");
        break;
        case 6:
        System.out.println("sabado");
        break;
        case 7:
        System.out.println("domingo");
        break;
        default:
        System.out.println("El numero no pertenece a un dia de la semana");
        break;
        }
        scan.close();
    }
}*/
/*public class App {
    public static void main(String[] args) throws Exception {
        double a;
        double suma = 0;
        int cont = 1;
        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("Ingrese un numero");
            a = scan.nextDouble();
            cont++;
            suma = suma + a;

            if(a < 0) {
                System.out.println( a + " Este numero es negativo");
            }

            if(a > 0) {
                System.out.println( a + " Este numero es positivo");
            }

        }while(cont <= 10);
        System.out.println("La suma de todos los numeros es: " + suma);


        scan.close();
    }
}*/
/*public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        double a;
        double suma = 0;
        int cont;

        for( cont = 1; cont<10; cont++ ) {

        System.out.println("Ingrese un numero");

        a = scan.nextDouble();
        suma = suma + a;

        if(a < 0) {
            System.out.println( a + " Este numero es negativo");
        }

        if(a > 0) {
            System.out.println( a + " Este numero es positivo");
        }

        }
        {System.out.println("La suma de todos los numeros es: " + suma);}

        scan.close();
    }
}*/
public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        
        int notas;

        System.out.println( "Ingrese su nota");
        notas = scan.nextInt();
        
        if(notas < 5) {
            System.out.println( "Suspenso");
        }

        if(notas > 10) {
            System.out.println( "Nota superior");
        }
        
        switch (notas){
            case 5:
            System.out.println("Suficiente");
            break;
            case 6:
            System.out.println("Bien");
            break;
            case 7:
            System.out.println("Notable menor");
            break;
            case 8:
            System.out.println("Notable mayor");
            break;
            case 9:
            System.out.println("Sobresaliente");
            break;
            case 10:
            System.out.println("Matricula de honor");
            break;

    }
    scan.close();
}
}

