
import java.util.Arrays;
import java.util.Scanner;

/*                  EJEMPLO 1
public class App{
    public static void main(String[] args) {
        int[] numeros = new int[3];
        numeros[0] = 7;
        numeros[1] = 10;
        numeros[2] = 13;
        for(int i = 0; i < 3; i++) {
            System.out.println(numeros[i]);
        }
    }
}*/
/*                  EJEMPLO 2
public class App{
    public static void main(String[]args){
        int[] numeros = {5,7,9};
        for(int i = 0; i < 3; i++) {
            System.out.println(numeros[i]);
        }
    }
}*/
/*                   EJEMPLO 3
public class App{
    public static void main(String[]args){
        Scanner manu = new Scanner(System.in);

        int nElementos;
        System.out.println("Digite la cantidad de elementos de su array");
        nElementos = manu.nextInt();

        char[] letras = new char[nElementos];

        for(int i = 0; i < nElementos; i++) {
            System.out.println((i + 1) + ". Digite los elementos de su array");
            letras[i] = manu.next().charAt(0);
        }
        for(int i = 0; i < nElementos; i++) {
            System.out.println("Los elementos son: " + letras[i]);
        }
        manu.close();
    }
}*/
/*                  Ejemplo 4 (for each)
public class App{
    public static void main(String[]args){
        String[] nombres = {"Manuel","Pamela","Martin","Juan","Susana","Jose","Enzo","Ivo","Joaquin"};

        for(String i: nombres) {
            System.out.println("Nombres: " + i);
        }
    }
}*/
/*                  ACTIVIDAD 1
public class App {
    public static void main(String[] args) throws Exception {
        int cont = 0;
        boolean[] butacas = {true, false, true, false, true, false, true, false, true, false};

        for(int i = 0; i < butacas.length; i++) {
            if(butacas[i] == false) cont++;
        }
        System.out.println("El numero de butacas disponibles es " + cont);
    }
}*/
/*                  ACTIVIDAD 2
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int[] numeros = new int[10];
        // int[10] son la cantidad de espacios del array: 10 es el total 
        for(int i=0; i<numeros.length; i++){
            System.out.println("Introduzca un numero: " + (i+1));
            numeros[i] = sc.nextInt();
        }

        for(int i=0; i<numeros.length; i++)
        {
            sum+=numeros[i];
            System.out.println("La suma del array es igual a: " + sum);
        }
        
        // numeros.lenght es la cantidad de espacios que le das al array
    }
}*/
/*public class App{
    public static void main(String[]args){
        Scanner manu = new Scanner(System.in);
        int num;
        do{
            System.out.println("Ingrese un número entre 5 y 9");
        num = manu.nextInt();
        if(num > 5 || num < 9){
            System.out.println("Número valido");
        }else{
            System.out.println("Invalido, ingrese un número correcto");
        }
        }while(num < 5 || num > 9);
         System.out.println("El número elegido es: " + num);

         float[] elementos = {1.2f,2.4f,3.6f,4.8f,6.0f,7.2f};
         for(float i: elementos){
            System.out.println(i + "\n");
         }*/
/*public class App{
     public static void main(String[]args){
         Scanner sc = new Scanner(System.in);

         int[] miarray = new int[2];
         miarray[0] = 0;
         miarray[1] = 0;
         
         do{
            System.out.println("Ingrese un número entre 7 y 57");
            miarray[0] = sc.nextInt();
            System.out.println("Ingrese otro número entre 7 y 57");
            miarray[1] = sc.nextInt();
            if(miarray[0] < 7 || miarray[0] > 57){
                System.out.println("Ingrese de nuevo el primer numero");
            }
            else{
                System.out.println("Numero valido");
            }
            if(miarray[1] < 7 || miarray[1] > 57){
                System.out.println("Ingrese el segundo numero de nuevo");
            }
            else{
                System.out.println("Numero valido");
            }
         }
         while(miarray[0] != miarray[1]);
         System.out.println("Fin del proceso");
    }
}*/
/*                       EJERCICIO DEL FINAL
public class App{
  public static void main(String[]args){

    Scanner sc = new Scanner(System.in);
    double num1; 
    double[] notas = new double[10];
    String[] nombres = new String[10];

    System.out.println("Ingrese las notas entre 0 y 10");
    for(int i = 0; i < notas.length; i++){
        System.out.print((i+1) + ". Ingrese una nota:");
        num1 = sc.nextDouble();
        if(num1 >= 0 && num1 <= 10){
            System.out.println("Valido");
            notas[i] = num1;
        }else{System.out.println("No valido");}
    }

    System.out.println("Ingrese los nombres de los alumnos");
    for(int i = 0; i < nombres.length; i++){
        System.out.print((i+1) + ". Ingrese un nombre:");
        nombres[i] = sc.next();
    }
    
    for(int i = 0; i<10;i++){
        if(notas[i] < 6){
            System.out.println(nombres[i] + " se sacó: " + notas[i] + ", No aprobado");
        }
        else if(notas[i] == 6){
            System.out.println(nombres[i] + " se sacó: " + notas[i] + ", Aprobado/Bueno");
        }
        else if(notas[i] >= 7 && notas[i] <= 8){
            System.out.println(nombres[i] + " se sacó: " + notas[i] + ", Notable");
        }
        else if(notas[i] >= 9 && notas[i] <= 10){
            System.out.println(nombres[i] + " se sacó: " + notas[i] + ", Sobresaliente");
        }
    }
    sc.close(); 
}
}*/

                     
/*public class App{
    public static void main(String[]args){
        
        int[] a = {1,2,3,4,5};
        int[] b = {5,4,3,2,1};
        int j = 6;

        for(int i = 0; i < a.length; i++ ){
            j--;
            System.out.println((i+1) + ". elemento del 1er array: " + a[i] + "\n");
            System.out.println( ". elemento del segundo array: " + b[j] );
            
        }
        
    }
}*/
   /*              Ejercicio 1                   
public class App{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        System.out.println("Ingrese la cantidad de elementos del array");
        int[] numeros = new int[sc.nextInt()];

        System.out.println("Ingrese los numeros del array");
        for(int i = 0; i<numeros.length; i++){
            System.out.print("Ingrese un número " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
            suma = suma + numeros[i];
        }
        for(int i : numeros){
            System.out.println("Los valores de los arrays son: " + i);
        }
        System.out.println("La suma de todos los valores es: " + suma);
        sc.close();
    }
}*/
/*                 Ejercicio 2
public class App{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = 0;
        System.out.println("Ingrese los elementos del array"); 
        int[] numeros = new int[sc.nextInt()];
        
        System.out.println("Ingrese los numeros");
        for(int i = 0; i<numeros.length; i++){
            System.out.print((i + 1) + ":");
            numeros[i] = sc.nextInt();
            if(numeros[i] > a){
                System.out.println("El numero mayor es: " + numeros[i]);
            }
        }
        sc.close();
    }
}*/
/*                 Ejercicio 3
public class App{
    public static void main(String[]args){

        int[] numeros = new int[100];
        int suma=0, prom=1, a=1;

        for(int i = 0; i<numeros.length; i++){
            numeros[i] = a;
            System.out.println(i+1);
            suma = suma + numeros[i];
            prom = suma / prom;
        }
        System.out.println("La suma es: " + suma);
        System.out.println("La media es: " + prom);
    }
}*/
/*                 Actividad 1
public class App{
    public static void main(String[]args){
        Scanner leer = new Scanner(System.in);
        String[][] paises = new String[4][1];
            paises[0][0] = "1";
            paises[1][0] = "2";
            paises[2][0] = "3";
            paises[3][0] = "4";

            String[][] ciudades = new String[4][3];
            ciudades[0][0] = "10";
            ciudades[0][1] = "11";
            ciudades[0][2] = "12";

            ciudades[1][0] = "20";
            ciudades[1][1] = "21";
            ciudades[1][2] = "22";

            ciudades[2][0] = "30";
            ciudades[2][1] = "31";
            ciudades[2][2] = "32";

            ciudades[3][0] = "40";
            ciudades[3][1] = "41";
            ciudades[3][2] = "42";

            System.out.println("Ingrese cuatro países");

            for (int i = 0; i < paises.length; i++) {
                System.out.println("Ingrese un país para asignarlo al número " + paises[i][0]);
                paises[i][0] = leer.nextLine();
            }

            System.out.println("\nIngrese tres Ciudades ");
            for (int j = 0; j < ciudades.length; j++) {
                for (int k = 0; k < ciudades[j].length; k++) {
                    System.out.println("Ingrese una ciudad para asignarla al número " + ciudades[j][k]);
                    ciudades[j][k] = leer.nextLine();
                }
            }

            for (int h = 0; h < ciudades.length; h++) {
                System.out.println("País: " + paises[h][0] + "| Ciudades: " + ciudades[h][0] + ", " + ciudades[h][1] + ", " + ciudades[h][2]);
            }
        
    }
}*/
/*public class App{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String[][] array;
        String nPai;
        System.out.println("Ingrese 4 países");
        

        for(int m = 0; m<4; m++){
            System.out.print((m+1) + ". ");
            nPai = sc.next();
        }
        array =new String [4][3];

        

        System.out.println("Ingrese un país y a continuación tres ciudades por cada fila");
        for(int i = 0; i<nPai; i++){
            for(int j=0; j<3; j++){
                System.out.println("Array [" + i + "]" + "[" + j + "]: ");
                array[][j] = sc.nextLine();
            }
        }

        
        
    }
}*/
/*public class App{
    public static void main(String[]args){
        int[][] array = {{1,2,3}, {4,5,6}, {7,8,9}};

        for(int i = 0;i<3; i++){
          for(int j = 0; j<3; j++){
            System.out.print(array[i][j]);
          }
          System.out.println("");
        }
    }
}*/
/*public class App{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int matriz[][],colum;
        
        System.out.println("Ingresa un número de columnas");
        colum = sc.nextInt();

        matriz = new int[5][colum];

        System.out.println("Ingrese los números de la matriz");
        for(int i = 0; i<5; i++){
            for(int j = 0; j<colum; j++){
                System.out.print("matriz [" + i + "]" + "[" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i<5; i++){
            for(int j = 0; j<colum; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println(", ");
        }
    }
}*/
/*public class App{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int array1[][], fila, colum, suma=0;
        
        System.out.println("Ingresa un número de filas");
        fila = sc.nextInt();
        System.out.println("Ingresa un número de columnas");
        colum = sc.nextInt();

        array1 = new int[fila][colum];

        System.out.println("Ingrese los números de la matriz");
        for(int i = 0; i<fila; i++){
            for(int j = 0; j<colum; j++){
                System.out.print("matriz [" + i + "]" + "[" + j + "]: ");
                array1[i][j] = sc.nextInt();
                suma = suma + array1[i][j]; 
            }       
        }

        for(int i = 0; i<fila; i++){
            for(int j = 0; j<colum; j++){
                System.out.print(array1[i][j]);
            }
            System.out.println("");
        }
        int[] array2 = new int[suma];
        System.out.println("La suma de los valores es: " + suma);
    }
}*/
/*     1
public class App{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        char[] caracteres = {'A', 'B', 'C', 'D' , 'E' , 'F' , 'G' , 'H', 'I' , 'J' , 'K' , 'L' , 'M' , 'N' , 'O' , 'P' , 'Q' , 'R' , 'S' , 'T', 'U' , 'V' , 'X' , 'W' , 'Y' , 'Z'};
        int nums, i = 0; 
        String cadena = "";

        System.out.println("Ingrese números del 0-25 para crear una cadena de caracteres, cuando desee finalizar para ver el resultado, ingrese -1");
        do{
            System.out.println("Posición " + i);
            nums = sc.nextInt();
            i++;

            if (nums <= 27 && nums >= 0) {
                cadena += caracteres[nums];
            }
            else if (nums > 27 || nums < 0){
                System.out.println("El número ingresado es incorrecto, vuelva a ingresar uno");
                i--;
            }
        }
        while(nums != -1);
        System.out.println("FIN\nCadena Resultante: " + cadena);

        sc.close();
    }
}*/
/*     2
public class App{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String frase;
        char[] caracteres;

        System.out.println("Escriba una frase para que el programa separe los caracteres de la frase");
        frase = sc.nextLine();
        int k = frase.length();
        caracteres = new char[k];
        
        for(int i = 0; i<caracteres.length; i++){
            caracteres[i] = frase.charAt(i);
        }

        System.out.println("Frase: " + frase + "\nCaracteres: ");

        for(char j : caracteres){
            System.out.println(j);
        }
        
    }
}*/
/*     3
public class App{
    public static void main(String[]args){
        Scanner leer = new Scanner(System.in);
        int[] num = new int[5];
        
        System.out.println("Ingrese un número entero para completar el array");
        int completar = leer.nextInt();

        Arrays.fill(num, completar);

        System.out.println("Valores del array num:");
        for (int i : num) {
            System.out.println(i);
        }
        
        int[] num2 = Arrays.copyOf(num, num.length);

        System.out.println("\nValores del Array num2 copiados de num:");
        for (int j : num2) {
            System.out.println(j);
        }
    }
        
}*/
/*Crear dos Arrays de String,
rellenar los arrays con datos solicitados al usuario. Indica si los dos arrays
creados y completados son iguales utilizando el método Equals de Arrays.


public class App{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del primer array");
        String[] array1 = new String[sc.nextInt()];

        System.out.println("Ingrese el tamaño del segundo array");
        String[] array2 = new String[sc.nextInt()];
        
        System.out.println("Ingrese los datos del primer array");
        for(int i = 0; i<array1.length; i++){
            System.out.print("Texto: " + (i+1) + ". ");
            array1[i] = sc.next();
       }

       System.out.println("Ingrese los datos del segundo array");
       for(int j = 0; j<array2.length; j++){
        System.out.print("Texto: " + (j+1) + ". ");
           array2[j] = sc.next();
       }
       
       int k=0, n=0;
       if(array1[k].equals(array2[n])){
        System.out.println("Correcto, los dos arrays son iguales");
       }
       else{
        System.out.println("No son iguales, vuelva a intentarlo");
       }
       k++;
       n++;
       while(array1[k] == array2[n] || array1[k] != array2[n]);
       System.out.println("Fin");
      
       

    }
}*/
//Diseñar un algoritmo que devuelva el nombre del mes, a partir del número de mes, ingresado
//por teclado, por el usuario. Si el usuario ingresa un número de mes que no exista, se deberá
//mostrar un mensaje indicando que el número ingresado no es correcto.
/*public class App{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int nMes;
        int i = 0;

        System.out.println("Ingrese un número de mes cuantas veces quiera... Para salir del bucle cargue -1");
        do{
             System.out.println("Dato " + (i+1) + ".");
             nMes = sc.nextInt();
             if(nMes == 0){
                System.out.println("Número inválido, por favor ingrese un numero correspondiente a un mes");
                i--;
             }
            switch(nMes){
               case 1: System.out.println("Enero");
               break; 
               case 2: System.out.println("Febrero");
               break; 
               case 3: System.out.println("Marzo");
               break; 
               case 4: System.out.println("Abril");
               break; 
               case 5: System.out.println("Mayo");
               break; 
               case 6: System.out.println("Junio");
               break; 
               case 7: System.out.println("Julio");
               break; 
               case 8: System.out.println("Agosto");
               break; 
               case 9: System.out.println("Septiembre");
               break; 
               case 10: System.out.println("Octubre");
               break; 
               case 11: System.out.println("Noviembre");
               break; 
               case 12: System.out.println("Diciembre");
               break; 
            }
            if(nMes > 12){
                System.out.println("Número inválido, por favor ingrese un numero correspondiente a un mes");
                i--;
            }
            i++;
    }
    while(nMes != -1);
    System.out.println("Fin del programa");
    }
}*/
/*    ejemplo final
public class App{
    public static void main(String[]args){
        System.out.println("Este programa consiste en pedirle al usuario que digite las notas, los nombres y los resultados de las evaluaciones de los alumnos\n");
        Scanner sc = new Scanner(System.in);
        double[]numeros = new double[10];
        String[]texto = new String[10];
        double notas;
        
        
        System.out.println("Ingrese la nota del exámen");
        for(int i = 0; i<numeros.length; i++){
            System.out.print("Nota " + (i+1) + ". ");
            notas = sc.nextDouble();
            if(notas >= 0 && notas <= 10){
                numeros[i] = notas;
                System.out.println("Se guardó su nota en la lista");
            }
            else{
                System.out.println("Reintentar, la nota que ingresó no es válida");
                i--;
            }
        }

        System.out.println("Ingrese el nombre de los alumnos evaluados");
        for(int j = 0; j<texto.length; j++){
            System.out.print("Alumno " + (j+1) + ": ");
            texto[j] = sc.next();
        }
    
        System.out.println("\nLa lista es: \n");

        for(int n = 0; n<10; n++){
            if(numeros[n] < 6){
                System.out.println("Alumno: " + texto[n] + " su nota es " + numeros[n] + " = No aprobado");
            }
            else if(numeros[n] >= 6 && numeros[n] < 7){
                System.out.println("Alumno: " + texto[n] + " su nota es " + numeros[n] + " = Aprobado, Bueno");
            }
            else if(numeros[n] >= 7 && numeros[n] < 9){
                System.out.println("Alumno: " + texto[n] + " su nota es " + numeros[n] + " = Notable");
            }
            else if(numeros[n] >= 9 && numeros[n] <= 10){
                System.out.println("Alumno: " + texto[n] + " su nota es " + numeros[n] + " = Sobresaliente");
            }
        }
        }
    }*/

    
    /*  Ejercicio de recuperatorio
    public class App{
        public static void main(String[]args){
            int[] num = {1,2,3,4,5};
            int[] num2 = new int[5];
            int k = 0, j = 1;
            
            for(int i = num.length - 1; i<num.length && i>=0 ; i--){
                num2[k] = num[i];

                System.out.println("Lugar " + j + " del primer array: " + num[k]);
                System.out.println("Lugar " + j + " del segundo array: " + num2[k] + "\n");
                j++;
                k += 1;
            
            
            }
            
        }
    }*/


    /*    Ejercicio final de mesa de septiembre
    
            Scanner sc = new Scanner(System.in);
            int tamaño;

            System.out.println("Ingrese el tamaño del array");
            tamaño = sc.nextInt();

            int[] array = new int[tamaño];
            for(int i = 0; i<array.length; i++){
                System.out.println("Digíte el elemento " + (i+1) + ". ");
                array[i] = sc.nextInt();
            }
            int suma = 0;
            for(int j : array){
                suma = suma + j;
                System.out.println("El array es: " + j + " y la suma es: " + suma);
            }

        }
    }*/
    /*public class App{
       public static void main(String[] args){
    
            Scanner sc = new Scanner(System.in);
            int[][][] matriz= {{{1,2,3} , {4,5,6} , {7,8,9}}};

            System.out.println("Su matriz es: ");
            for(int[][] i : matriz){
                for(int[] j : i){
                    for(int k : j){
                        System.out.print(k + " ");
                    }
                    System.out.println("");
                }
            }        
        }
    }*/
           
    public class App{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int matriz[][][], nTabla,nFila,nCol;

            System.out.println("Ingrese el tamaño de la tabla de la matriz");
            nTabla = sc.nextInt();
            System.out.println("Ingrese el tamaño de la fila de la matriz");
            nFila = sc.nextInt();
            System.out.println("Ingrese el tamaño de la columna de la matriz");
            nCol = sc.nextInt();

            matriz = new int[nTabla][nFila][nCol];
            for(int i= 0; i<nTabla; i++){
                for(int j = 0; j<nFila; j++){
                    for(int k = 0; k<nCol; k++){
                        System.out.print("matriz [" + i + "][" + j + "][" + k + "]");
                        matriz[i][j][k] = sc.nextInt();
                    }
                }
            }
            System.out.println("Su matriz es: ");
            for(int[][] i : matriz){
                for(int[] j : i){
                    for(int k : j){
                        System.out.print(k + " ");
                    }
                    System.out.println("");
                }
            }        
        }
    }    
        
    


