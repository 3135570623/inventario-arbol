// Se recrea el ejercicio segun actividad propuesta se meoran comentarios a cerca del desarrollo
import java.util.Scanner;

// Clase principal del programa
public class Main {

   // Constructor vacío (no se usa, pero no afecta)
   public Main() {
   }

   // Método principal donde inicia el programa
   public static void main(String[] args) {

      // Objeto para leer datos desde teclado
      Scanner scanner = new Scanner(System.in);

      // Objeto que maneja el inventario (árbol)
      ArbolInventario inventario = new ArbolInventario();

      // Variable para almacenar la opción del menú
      int opcion;

      // Bucle principal del programa (se repite hasta que el usuario elija salir)
      do {
         System.out.println("\n--- MENÚ INVENTARIO ---");
         System.out.println("1. Registrar Producto");
         System.out.println("2. Mostrar Inventario");
         System.out.println("3. Buscar Producto");
         System.out.println("0. Salir");
         System.out.print("Seleccione una opción: ");

         // Leer opción del usuario
         opcion = scanner.nextInt();

         // Estructura de control para manejar las opciones
         switch (opcion) {

            case 0:
               // Opción para salir del programa
               System.out.println("Saliendo...");
               break;

            case 1:
               // Registro de un nuevo producto
               System.out.print("Ingrese ID: ");
               int id = scanner.nextInt();

               // Limpiar buffer (importante después de nextInt)
               scanner.nextLine();

               System.out.print("Ingrese nombre: ");
               String nombre = scanner.nextLine();

               // Insertar producto en el inventario
               inventario.insertar(id, nombre);

               System.out.println("Producto registrado.");
               break;

            case 2:
               // Mostrar todos los productos del inventario
               System.out.println("\nInventario:");
               inventario.mostrarInventario();
               break;

            case 3:
               // Buscar un producto por ID
               System.out.print("Ingrese ID a buscar: ");
               int idBuscar = scanner.nextInt();

               // Verificar si el producto existe
               if (inventario.existe(idBuscar)) {
                  System.out.println("Producto encontrado.");
               } else {
                  System.out.println("Producto NO encontrado.");
               }
               break;

            default:
               // Manejo de opción inválida
               System.out.println("Opción inválida.");
         }

      } while(opcion != 0); // Repetir hasta que el usuario elija salir

      // Cerrar el scanner para liberar recursos
      scanner.close();
   }
}