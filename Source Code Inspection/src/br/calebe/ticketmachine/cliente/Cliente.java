package br.calebe.ticketmachine.cliente;

import br.calebe.ticketmachine.core.InterfacePrincipal;

public class Cliente {
    
    public static void main(String args[]){
        InterfacePrincipal machine = new InterfacePrincipal();
        machine.inserirDinheiro(100);
    }
    
}
