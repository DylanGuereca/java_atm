/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.edu.ucb.est.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author ecampohermoso
 */
public class Banco {
    private String nombre;
    private List<Cliente> clientes;
    
    public Banco(String nombre) {
        this.nombre = nombre;
        this.clientes = new ArrayList();
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public List<Cliente> getClientes() {
        return this.clientes;
    }
    
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    
    
    public void buscarClientePorCodigo() {
        Scanner Scanner = new Scanner (System.in);
        int cont=0;
        String codcliente;
        String pincliente;
        do{
            System.out.println("Ingrese su código de cliente");
            codcliente = Scanner.nextLine ();
            System.out.println("Ingrese su pin");
            pincliente = Scanner.nextLine ();
            for ( int i = 0; i < clientes.size(); i++) {
                Cliente cli = clientes.get(i); // Sacando elemento por elemento
                if (cli.getCodigoCliente().equals(codcliente) && cli.getPinSeguridad().equals(pincliente)) {
                    System.out.print("Bienvenido Señor(a) "+cli.getNombre());
                    System.out.println("\n");
                    Cajero usuario = new Cajero(cli);
                    cont =1;
                }
            }
            if(cont==0){
                System.out.println("Código o pin incorrectos, por favor vuelva a intentar");
            }
        }while(cont==0);
    }
}
