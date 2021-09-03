/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.edu.ucb.est.modelo;
import java.util.Scanner;
/**
 *
 * @author ecampohermoso
 */
public class Cuenta {
    private String moneda;
    private String tipo;
    private String numeroCuenta;
    private double saldo;

    public Cuenta(String moneda, String tipo, String numeroCuenta, double saldoInicial) {
        this.moneda = moneda;
        this.tipo = tipo;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    public int retirar() {
        Scanner Scanner = new Scanner (System.in);
        int cont=0;
        double monto;
        do{
            if(saldo==0){
                System.out.println("Su saldo es 0, por lo cual no puede retirar dinero, asegúrese de depositar primero");
                cont =1;
            }else{
                System.out.println("Ingresar el monto que desea retirar");
                monto = Scanner.nextDouble();
                if (monto > 0 && monto <= saldo) { // verifica que no sea negativo, cero o exceda su saldo
                    saldo = saldo - monto;
                    cont=1;
                }else{
                    if(monto == 0){
                        System.out.println("No puede retirar 0, por favor vuelva a intentar"); 
                    }else{
                        if(monto < 0 ){
                            System.out.println("No puede retirar una cantidad negativa, por favor vuelva a intentar");
                        }else{
                            if(monto > saldo){
                                System.out.println("No puede retirar esa cantidad ya que es mayor a su saldo, por favor vuelva a intentar");
                            }
                        }
                    }
                }
            }
            
        }while(cont ==0);
        return(cont);
    }
    
    public int depositar() {
        Scanner Scanner = new Scanner (System.in);
        double monto;
        int cont =0;
        do{
            System.out.println("Ingresar el monto que desea depositar");
            monto = Scanner.nextInt ();
            if (monto > 0 ) { // verifica que no sea negativo, cero o exceda su saldo
                saldo = saldo + monto;
                cont=1;
            }else{
                if(monto ==0){
                    System.out.println("El monto a depositar no puede ser 0, por favor vuelva a intentar");
                    
                }else{
                    System.out.println("El monto a depositar no puede ser menor a 0, por favor vuelva a intentar");
                }
            }
            
       }while(cont==0);
        return(cont);
    }
            
    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getNCuenta(){
        return numeroCuenta;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}
