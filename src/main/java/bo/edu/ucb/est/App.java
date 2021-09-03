package bo.edu.ucb.est;
import bo.edu.ucb.est.modelo.Banco;
import bo.edu.ucb.est.modelo.Cliente;
import bo.edu.ucb.est.modelo.Cuenta;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Inicializando Datos del Banco" );
        Banco bisa = new Banco("BANCO BISA");
        
        Cliente jperez = new Cliente(" Juan Perez", "jperez", "3333");
        Cuenta cta1Jperez = new Cuenta("BOB", "Caja Ahorros", "111122" ,12000.0);
        jperez.agregarCuenta(cta1Jperez);
        Cuenta cta2Jperez = new Cuenta("USD", "Cuenta Corriente", "112211",100.0);
        jperez.agregarCuenta(cta2Jperez);
        bisa.agregarCliente(jperez);
        
        Cliente mgomez = new Cliente("Maria Gomez", "mgomez","4444");
        Cuenta cta1Mgomez = new Cuenta("BOB", "Caja Ahorros","221122",0.0);
        mgomez.agregarCuenta(cta1Mgomez);
        bisa.agregarCliente(mgomez);
        
        Cliente cgomez = new Cliente("Carlos Gomez", "cgomez", "3333");
        Cuenta cta1Cgomez = new Cuenta("BOB", "Caja Ahorros","331122" ,100.0);
        cgomez.agregarCuenta(cta1Cgomez);
        Cuenta cta2Cgomez = new Cuenta("USD", "Cuenta Corriente", "332211", 1000.0);
        cgomez.agregarCuenta(cta2Cgomez);
        Cuenta cta3Cgomez = new Cuenta("BOB", "Caja Ahorros","332233",100000.0);
        cgomez.agregarCuenta(cta3Cgomez);
        bisa.agregarCliente(cgomez);
        
        System.out.println("Bienvenido al "+bisa.getNombre());
        bisa.buscarClientePorCodigo();
    }
}
