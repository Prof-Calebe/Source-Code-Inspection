package br.calebe.ticketmachine.core;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 31620221
 */
public class index {
    
    public static void main(String[] args) throws PapelMoedaInvalidaException, SaldoInsuficienteException {
        TicketMachine ticketMachine= new TicketMachine(10);
        System.out.println("Ticket Machine:"+ "/n Inserir:"+"/n Imprimir:"+"n/  Troco:");
        Scanner sc =  new Scanner(System.in);
        int op = sc.nextInt();
        do{
        switch(op){
            case 1:
                int valor = 0;
                System.out.println("Quanto deseja inserir?"+ valor);
                valor  = sc.nextInt();
                ticketMachine.inserir(valor);
                System.out.println(ticketMachine.getSaldo());
            break;
            case 2:
                System.out.println("Imprimir ticket:"+ ticketMachine.getValor());
                ticketMachine.imprimir();
                System.out.println(ticketMachine.imprimir());
            break;
            case 3:
                int trocoValor = 0;
                System.out.println("Troco da compra:"+trocoValor);
                trocoValor = sc.nextInt();
                ticketMachine.getTroco();
                System.out.println(ticketMachine.getTroco());
        }
        }while  (op==3);
    }
}