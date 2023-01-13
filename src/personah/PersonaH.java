
package personah;

/**
 *
 * @author Uriel
 */
public class PersonaH {
    private String nombre;
    private int edad;
    private String telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad(40);
        cliente.setTelefono("3004005050");
        cliente.setNombre("Carlos");
        cliente.setCredito(1020);
        
        System.out.println("Datos del cliente:");

        System.out.println("Nombre: "+cliente.getNombre()+"\n"
                +"Edad: "+cliente.getEdad()+"\n"
                +"Telefono: "+cliente.getTelefono()+"\n"
                +"Credito: "+cliente.getCredito()+ "\n");
        
        System.out.println("Datos del trabajador:");

        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(30);
        trabajador.setTelefono("3100003045");
        trabajador.setNombre("David");
        trabajador.setSalario(1912.2);


        System.out.println("Nombre: "+trabajador.getNombre()+"\n"
                +"Edad: "+trabajador.getEdad()+"\n"
                +"Telefono: "+trabajador.getTelefono()+"\n"
                +"Salario: "+trabajador.getSalario());
        
    }
    
}

class Cliente extends PersonaH{
    private int credito;

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
    
}

class Trabajador extends PersonaH{
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}

