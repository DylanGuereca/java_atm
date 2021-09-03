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
public class Cajero {
    Scanner Scanner = new Scanner (System.in);
   Cliente cliente;
   
   public Cajero(Cliente cli){
   this.cliente = cli; 
   int eleccion = 0;
   int contador = 0;
   int concuen = 0;
   int ncuenta;
        do{    
                do{
                    System.out.println("**********************");
                    System.out.println("   Menu de opciones");
                    System.out.println("1. Ver Saldo");
                    System.out.println("2. Retirar Dinero");
                    System.out.println("3. Depositar Dinero");
                    System.out.println("4. Salir");
                    System.out.println("**********************");
                    eleccion = Scanner.nextInt();

                    if(eleccion >=1 && eleccion <=4){
                        contador=1;
                    }else{
                        System.out.println("Opción no disponible, vuelva a intentar");
                    }
                }while(contador==0);
                if(eleccion==1){
                    int n=0;
                    contador = 2;
                    do{
                    System.out.println("Elegir cuenta");
                    for(int i = 0; i < cli.getCuentas().size(); i++) {
                        Cuenta cue = cli.getCuentas().get(i); 
                        System.out.println((i+1)+". Cuenta "+(i+1)+" "+cue.getNCuenta()+" "+cue.getTipo()+" "+cue.getMoneda());
                    }
                    ncuenta = Scanner.nextInt();
                    int i = cli.getCuentas().size();
                    if(ncuenta>=1 && ncuenta<=i){
                        n=1;
                    }else{
                        System.out.println("Opción no disponible, por favor vuelva a intentar");
                    }
                    }while(n==0);
                    Cuenta cuentaesco = cli.escogerCuenta(ncuenta);
                   
                    System.out.println("El saldo de la cuenta es "+cuentaesco.getSaldo());
                                       
                    contador =1;
                }else{
                    if(eleccion==2){
                        contador = 2;
                        double dinero;
                        int n=0;
                        do{
                            System.out.println("Elegir cuenta");
                            for(int i = 0; i < cli.getCuentas().size(); i++) {
                                Cuenta cue = cli.getCuentas().get(i); 
                                System.out.println((i+1)+". Cuenta "+(i+1)+" "+cue.getNCuenta()+" "+cue.getTipo()+" "+cue.getMoneda());
                            }
                            ncuenta = Scanner.nextInt();
                            int i = cli.getCuentas().size();
                            if(ncuenta>=1 && ncuenta<=i){
                                n=1;
                            }else{
                                System.out.println("Opción no disponible, por favor vuelva a intentar");
                            }
                        }while(n==0);
                        Cuenta cuentaesco = cli.escogerCuenta(ncuenta);
                        System.out.println("El saldo de la cuenta es "+cuentaesco.getSaldo());
                        int res = cuentaesco.retirar();
                        contador=1;
                        
                    }else{
                        if(eleccion==3){
                            double monto;
                            contador = 2;
                            int n=0;
                            do{
                                System.out.println("Elegir cuenta");
                                for(int i = 0; i < cli.getCuentas().size(); i++) {
                                    Cuenta cue = cli.getCuentas().get(i); 
                                    System.out.println((i+1)+". Cuenta "+(i+1)+" "+cue.getNCuenta()+" "+cue.getTipo()+" "+cue.getMoneda());
                                }
                                ncuenta = Scanner.nextInt();
                                int i = cli.getCuentas().size();
                                if(ncuenta>=1 && ncuenta<=i){
                                    n=1;
                                }else{
                                    System.out.println("Opción no disponible, por favor vuelva a intentar");
                                }
                            }while(n==0);
                            Cuenta cuentaesco = cli.escogerCuenta(ncuenta);
                            System.out.println("El saldo de la cuenta es "+cuentaesco.getSaldo());
                            int res = cuentaesco.depositar();
                                contador=1;
                        }else{
                            if(eleccion==4){
                                System.out.println("Saliendo del cajero automático");
                                System.out.println("Gracias por su preferencia");
                                System.out.println("Vuelva pronto");
                                contador = 2;
                            }
                        }
                    }
                }

        }while(contador!=2);
    }
}
