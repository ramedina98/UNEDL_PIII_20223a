package POLIMORFISMO;

import static POO.Charlando.captura;
import java.util.Scanner;

public class Principal {
    
    static Scanner leer = new Scanner(System.in); 
    static EquipoFutbol Arr[] = new EquipoFutbol[5];
    static int id;
    static String nom, ap; 
    static byte age; 
    
    
    
    
    
    //INICIO MAIN
    public static void main(String[] args){  
        
        boolean salir = false; 
        byte op = 0, cont = 0; 
        
        do{
            
            System.out.println("\nMenu Equipo de futbol");
            System.out.println("");
            System.out.println("1. Nuevo integrante.\n2. Ver a los integrantes del equipo\n3. Editar un integrante del equipo\n"
                    + "4. Dar de baja a un integrante\n5. Salir");
            
            switch(leer.nextByte()){
                case 1: 
                    if(cont < 5){
                        captura(cont); 
                        cont++;
                    }
                    else{
                        System.out.println("Ya no hay más espacio");
                    }
                break; 
                
                case 2: 
                    print(cont); 
                break; 
                
                case 3: 
                    editar(cont); 
                break; 
                
                case 4: 
                    baja(cont); 
                    cont--; 
                break; 
                
                case 5: 
                    salir = true; 
                break; 
                
                default: 
                    System.out.println("Opcion no valida");
                break;
            }
           
        }while(salir != true); 
    }
    //FIN MAIN
    
    
    
    
    
    
    
    
    //metodos de captura de destos e imprecion... 
    public static void captura(byte cont){
        EquipoFutbol integrante; 
        
        System.out.println("Que tipo de integrante es?");
        System.out.println("1. Futbolista.\n2. Entrenador.\n3.Cuerpo tecnico.\n4. Regresar.");
        
        switch(leer.nextByte()){
            
            //Futbolista nuevo
            case 1: 
                integrante = altaFutbolista(); 
                Arr[cont] = integrante; 
            break; 
            
            //Entrenador nuevo...
            case 2: 
                integrante = altaEntrenador(); 
                Arr[cont] = integrante; 
            break; 
            
            //Miembro del cuerpo tecnico nuevo...
            case 3: 
                integrante = altaCuerpo(); 
                Arr[cont] = integrante; 
            break; 
            
            //Opcion para regresar 
            case 4: 
                System.out.println("Regresando al menun anterior");
            break; 
            
            default: 
                System.out.println("No es una opcion valida");
            break; 
        }
    }
    
    //Metodo para saber que hay en el arreglo del equipi...
    public static void print(byte cont){
        if(Arr.length == 0){
            System.out.println("\nEl registro esta vacio...\n");
        }
        else{
            for(int i = 0; i < cont; i++){
            
                System.out.println("\nMIEMBRO DEL EQUIPO");
                System.out.println("\nPersona " + (i + 1));
                System.out.println(Arr[i].ToString());
            }
        }
    }
    
    //Metodo para editar algo del arreglo...
    public static void editar(byte cont){
        
        print(cont); 
        System.out.println("");
        System.out.println("¿Cual integrante modificara?");
        byte chance = leer.nextByte();
        captura((chance - 1)); 
    }
    
    //Metodo para eliminar...
    public static void baja(byte cont){
        System.out.println("¿Que integrante del equipo sera dado de baja?");
        print(cont); 
        System.out.println("");
        byte post = leer.nextByte();
        Arr[(post - 1)].clear();
        Recorrer(post,cont); 
        System.out.println("\nEsta fuera!!!");
    }
    
    public static void Recorrer(byte posicion, byte raw){ 
        
        //Este codigo es para recorrer espacios...
        for(int i = (posicion - 1); i < (raw - 1); i++){
          
            Arr[i] = Arr[i + 1]; 
        } 
    }
    
    //Estos metodos retornan el tipo de objeto que es... 
    public static EquipoFutbol altaFutbolista(){
        
        EquipoFutbol jugador = new Futbolista();
        
        System.out.println("Numero de camiseta del jugador");
        int dorsal = leer.nextInt(); 
        System.out.println("Ciudad de origen");
        String ciudad = leer.next(); 
        System.out.println("ID");
        id = leer.nextInt(); 
        System.out.println("Nombre del jugador");
        nom = leer.next(); 
        System.out.println("Apellido del jugador");
        ap = leer.next(); 
        System.out.println("Edad del jugador");
        age = leer.nextByte(); 
        
        jugador = new Futbolista(dorsal, ciudad, id, nom, ap, age); 
        
        return jugador; 
    }
    
    public static EquipoFutbol altaEntrenador(){
        
        EquipoFutbol entrenador = new Entrenador(); 
        
        System.out.println("Numero de identificacion de la federacion de futbol");
        int idFMF = leer.nextInt(); 
        System.out.println("Numero de identificacion interno");
        id = leer.nextInt(); 
        System.out.println("Nombre del entrenador");
        nom = leer.next();
        System.out.println("Apellidos del entrenador");
        ap = leer.next(); 
        System.out.println("Edad del entrenador");
        age = leer.nextByte(); 
        
        entrenador = new Entrenador( idFMF, id, nom, ap, (byte) age);
        
        return entrenador; 
    }
    
    public static EquipoFutbol altaCuerpo(){
        
        EquipoFutbol Cuerpo = new equipoTecnico(); 
        
        System.out.println("Roll que desempeña");
        String roll = leer.next(); 
        System.out.println("Numero de identificacion interno");
        id = leer.nextInt(); 
        System.out.println("Nombre del " + roll);
        nom = leer.next(); 
        System.out.println("Apellido del " + roll);
        ap = leer.next(); 
        System.out.println("Edad del " + roll);
        age = leer.nextByte(); 
        
        Cuerpo = new equipoTecnico(roll, id, nom, ap, (byte) age); 
        return Cuerpo; 
    }
    
    //Metodos para recorrer todo dependindo del tipo de dato que es...
}
