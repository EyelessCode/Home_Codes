import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App{
    public static void main(String[] args) throws Exception{
        Scanner scanner=new Scanner(System.in);
        List<Person> l=new ArrayList<Person>();
        boolean puerta=false;

        do{
            Person p=new Person(null, null, 0);
            
            System.out.println("=".repeat(35));
            System.out.println("BIENVENIDO");
            System.out.println("=".repeat(35));
            System.out.println("MENÚ");
            System.out.println(">>>> 1. Registrarse.");
            System.out.println(">>>> 2. Salir");
            System.out.print("Selecciona: ");
            if(scanner.hasNextInt()){
                int opcion=scanner.nextInt();
                if(opcion>=1&&opcion<=2){
                    switch (opcion) {
                        case 1:
                            System.out.println("HAS SELECCIONADO LA OPCIÓN "+opcion);
                            System.out.println("---PROCESANDO---");
                            System.out.print("Nombre: ");
                            p.setNombre(scanner.next());
                            System.out.print("Cédula: ");
                            p.setCedula(scanner.next());
                            System.out.print("Edad: ");
                            p.setEdad(scanner.nextInt());
                            break;
                        case 2:
                            System.out.println("SALIENDO DEL SISTEMA...");
                            System.exit(0);
                        break;
                        default:
                            System.out.println("HAS MARCADO UNA OPCIÓN INVÁLIDA. SELECCIONE ACORDE LAS OPCIONES...");
                            break;
                    }
                }
            }else{
                System.out.println("=".repeat(100));
                System.out.print("\n|POR FAVOR INGRESE UN NÚMERO...");
                System.out.print("|");
                System.out.println("_".repeat(100));
                break;
            }
        } while(!puerta);
        scanner.close();
    }
}
