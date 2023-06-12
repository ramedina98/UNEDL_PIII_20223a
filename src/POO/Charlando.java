package POO;

import java.util.Scanner;

public class Charlando {

    static Scanner leer = new Scanner(System.in);
    static Sedan cocheraSedanes[] = new Sedan[8]; //Este es un tipo de arreglo de datos

    public static void main(String[] args) {

        byte contadorEspacios = 0;
        boolean salir = false;

        do {
            System.out.println("Menu coches");
            System.out.println("1 - Guardar un coche");
            System.out.println("2 - Imprimir un coche");
            System.out.println("3 - Actualizar un coche");
            System.out.println("4 - Eliminar un coche");
            System.out.println("5 - Salir");
            System.out.println("");

            switch (leer.nextByte()) {

                case 1:

                    captura(contadorEspacios);
                    contadorEspacios++;

                    break;

                case 2:
                    Imprimir(contadorEspacios);

                    break;

                case 3:
                    Editar(contadorEspacios);
                    break;

                case 4:

                    //Aqui al momento de que se borre la informacion aun el espacio de donde se borro 
                    //quedara, aunque en blanco, hay que resolver como aprovechar ese espacio y poder ser
                    //utilizado... 
                    Eliminar(contadorEspacios);
                    contadorEspacios--;
                    break;

                case 5:
                    System.out.println("Adios pues...");
                    salir = true;
                    break;

            }
        } while (salir == false);
    }

    public static void captura(byte fila) {
        System.out.println("\n");
        System.out.println("Tipo de sedan");
        String tipo2 = leer.nextLine();
        System.out.println("Capturar marca");
        String marca = leer.nextLine();
        System.out.println("Capturar Modelo");
        String modelo = leer.nextLine();
        System.out.println(" Capturar Color");
        String color = leer.nextLine();
        System.out.println("Capturar Neumaticos");
        String neumatico = leer.nextLine();
        System.out.println("Capturar Motor");
        String motor = leer.nextLine();
        System.out.println("Numero de pasajeros que caben");
        String pasajeros = leer.nextLine();
        System.out.println("Año del modelo");
        String anio = leer.nextLine();

        Sedan vehiculo = new Sedan(tipo2, marca, modelo, color, neumatico, motor, pasajeros, anio);
        cocheraSedanes[fila] = vehiculo;
    }

    public static void Imprimir(int fila) {
        int op;
        System.out.println("\n");
        System.out.println("Coches en el garage\t");
        for (int i = 0; i < fila; i++) {

            System.out.println(cocheraSedanes[i].ToString());
        }
    }

    public static void Editar(byte fila) {
        System.out.println("\n");
        System.out.println("Que coche deseas edtiar?");
        Imprimir(fila);
        System.out.println("");
        byte coche = leer.nextByte();
        captura((coche - 1));
    }

    public static void Eliminar(byte fila) {
        //Recibimos la fila para llamar la imprecion y para que sepa hasta cual imprimir....
        System.out.println("\n");
        System.out.println("Que coche deseas vender?");
        Imprimir(fila);
        byte post = leer.nextByte();
        cocheraSedanes[(post - 1)].clear();
        Recorrer(post, fila); 
        System.out.println("VENDIDO!!");
        //RecorridoEspacios(post);
    }
    
    public static void Recorrer(byte posicion, byte raw){
        //Este codigo es para recorrer espacios...
        for(int i = (posicion - 1); i < (raw - 1); i++){
            
            //Pasamos los valores a las variables
            String tipo2 = cocheraSedanes[i + 1].getTipo2(); 
            String marca = cocheraSedanes[i + 1].getMarca(); 
            String model = cocheraSedanes[i + 1].getModelo(); 
            String color = cocheraSedanes[i + 1].getColor(); 
            String neumatico = cocheraSedanes[i + 1].getNeumatico(); 
            String motor= cocheraSedanes[i + 1].getMotor(); 
            String pasajeros = cocheraSedanes[i + 1].getPasajeros();
            String anio = cocheraSedanes[i + 1].getAnio();
            
            //Y ahora los acomodamos en la nueva posicion...
            cocheraSedanes[i].setTipo2(tipo2);
            cocheraSedanes[i].setMarca(marca); 
            cocheraSedanes[i].setModelo(model); 
            cocheraSedanes[i].setColor(color); 
            cocheraSedanes[i].setNeumatico(neumatico);
            cocheraSedanes[i].setMotor(motor); 
            cocheraSedanes[i].setPasajeros(pasajeros); 
            cocheraSedanes[i].setAnio(anio); 
        } 
    }
}
