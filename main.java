//Principio de Responsabilidad Única
//Establece que cada módulo, clase o función de un programa debe tener una única responsabilidad y que esa responsabilidad debe estar completamente encapsulada por ese componente.
//Ejemplo 
public class FileReader {
    public void readFile(String fileName) {
        // Código para leer un archivo del disco
    }
}

public class FileWriter {
    public void writeFile(String fileName, String data) {
        // Código para escribir un archivo en el disco
    }
}

public class FileCopier {
    public void copyFile(String sourceFile, String destinationFile) {
        // Código para copiar un archivo de origen a destino
    }
}


//Principio de Abierto/Cerrado
//Es un principio de diseño de software que establece que una entidad de software debe estar abierta para la extensión pero cerrada para la modificación
//Se debe poder agregar nuevas funcionalidades a un software sin tener que modificar el código existente.

abstract class Forma {
    public abstract double area();
}
class TrianguloEquilatero extends Forma {
    private double lado;

    public TrianguloEquilatero(double lado) {
        this.lado = lado;
    }

    public double area() {
        return (Math.sqrt(3) / 4) * lado * lado;
    }
}
//De esta manera, hemos agregado una nueva forma geométrica sin tener que modificar el código existente de la clase "Forma"

//Principio de Sustitución de Liskov
//Establece que los objetos de una clase derivada deben poder ser sustituidos por objetos de la clase base sin alterar la corrección del programa.
public class Vehiculo {
   private int velocidad;

   public void acelerar(int cantidad) {
      velocidad += cantidad;
   }

   public int getVelocidad() {
      return velocidad;
   }
}

public class CocheDeportivo extends Vehiculo {
   private int aceleracionExtra;

   public void acelerar(int cantidad) {
      velocidad += cantidad + aceleracionExtra;
   }

   public void setAceleracionExtra(int cantidad) {
      aceleracionExtra = cantidad;
   }
}
Vehiculo miCoche = new CocheDeportivo();
miCoche.acelerar(50); // Acelerar el coche en 50 km/h
System.out.println(miCoche.getVelocidad()); // Imprimir la velocidad del coche

//La clase "CocheDeportivo" cumple el principio de sustitución de Liskov, ya que podemos utilizar un objeto de tipo "CocheDeportivo" en cualquier lugar donde se espera un objeto de tipo "Vehiculo", y el programa seguirá funcionando correctamente


//Principio de Segregación de la Interfaz

// Establece que una clase no debe depender de métodos que no utiliza 
//Una interfaz debe ser lo suficientemente específica para que una clase sólo implemente los métodos que necesita y no más
interface IMover {
    public void moverse();
}

interface IHacerSonido {
    public void hacerSonido();
}

class Perro implements IMover, IHacerSonido {
    public void moverse() {
        System.out.println("El perro se mueve corriendo");
    }
    
    public void hacerSonido() {
        System.out.println("El perro ladra");
    }
}

class Pez implements IMover {
    public void moverse() {
        System.out.println("El pez nada");
    }
}

//la interfaz Animal se ha dividido en dos interfaces más específicas: IMover e IHacerSonido
//La clase Perro implementa ambas interfaces, ya que puede moverse y hacer sonidos, mientras que la clase Pez sólo implementa IMover, ya que no puede hacer sonidos

//Principio de Inversión de Dependencias
//Establece que los módulos de alto nivel no deben depender de los módulos de bajo nivel
//En su lugar, ambos deben depender de abstracciones
public interface DatabaseInterface {
  List<String> getData();
}

public class Report {
  private DatabaseInterface database;

  public Report(DatabaseInterface database) {
    this.database = database;
  }

  public void generate() {
    // Lógica para generar un reporte
    List<String> data = database.getData();
    // Generar el reporte usando los datos obtenidos de la base de datos
  }
}

public class Database implements DatabaseInterface {
  public List<String> getData() {
    // Lógica para obtener datos de la base de datos
    return data;
  }
}

//La clase Report ahora depende de la abstracción DatabaseInterface en lugar de la clase Database concreta
//Esto hace que el código sea más flexible y fácil de mantener, ya que cualquier cambio en la implementación de la clase Database no afectará directamente a la clase Report