import java.util.Scanner;

/*                      ACTIVIDAD 1
public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String fruta;
        int cont = 1;

        System.out.println("Elíga una fruta");
        fruta = sc.next();

        do {
            cont++;
            System.out.println(fruta);
        }while(cont != 10);

        sc.close();
    }
}*/
/*                      ACTIVIDAD 2
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int i;

        System.out.println("Ingrese un número menor a 20");
        i = sc.nextInt();

        do{
            i++;
            System.out.println(i);
        } while(i != 20 && i < 20);

        sc.close();
    }
}*/
/*                      ACTIVIDAD 3
public class App {
    public static void main(String[] args) throws Exception {

        int suma = 0;
        double producto = 1;
        int prim = 20;
        for (int i = prim; i <= 100; i++) {
            suma += i;
            producto = i * producto;
        }
        System.out.println("La suma es: " + suma + "\nEl producto es: " + producto);
}
}*/
/*                      ACTIVIDAD 4)a)
public class App {
    public static void main(String[] args) throws Exception {
        int i = 101;
        do{
            i--;
            System.out.println(i);
        }while(i != 1);
    }
}*/
/*                      ACTIVIDAD 4)b)
public class App {
    public static void main(String[] args) throws Exception {
        int i = 101;
        while(i != 1) {
            i--;
        System.out.println(i);
        }
    }
}*/
public class App {
    public static void main(String[] args) throws Exception {
        for(int i = 100; i != 0; i--){
        System.out.println(i);
        }
    }
}