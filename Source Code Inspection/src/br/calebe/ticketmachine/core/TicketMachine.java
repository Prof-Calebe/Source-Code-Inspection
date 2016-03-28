package br.calebe.ticketmachine.core;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;
import java.util.Iterator;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class TicketMachine {

    protected int valor;
    protected int saldo;
    protected int[] papelMoeda = {2, 5, 10, 20, 50, 100};

    public TicketMachine(int valor) {
        this.valor = valor;
        this.saldo = 0;
    }

    public void inserir(int amount) throws PapelMoedaInvalidaException {
        boolean found = false;
        int note = -1;
        System.out.println("Aguarde. O sistema está validando as notas.");
        for (int i = 0; i < papelMoeda.length && !found; i++) {
            if (papelMoeda[i] == amount) {
                found = true;
            }
            note = i;
        }
        if (!found) {
            while (!found) {
                refund(note);
                System.out.println("Retire a nota que não foi aceita.");
                if (note == -1) {
                    found = true;
                } else {
                    note = -1;
                }
            }
            throw new PapelMoedaInvalidaException();
        } else {
            System.out.println("A nota de papel moeda $" + papelMoeda[note] + " foi aceita");
            this.saldo += amount;
            System.out.println("O saldo atual é: " + saldo);
        }
    }

    public int getSaldo() {
        return saldo;
    }

    public Iterator<Integer> getTroco() {
        return null;
    }

    public String imprimir() throws SaldoInsuficienteException {
        if (saldo < valor) {
            System.out.println("O saldo é insuficiente!");
            throw new SaldoInsuficienteException();
        }
        String result = "**************\n";
        result += " R$ " + saldo + ",00 *\n";
        result += "**************\n";
        return result;
    }
    
    void refund(int indice){
        papelMoeda[indice]--;
    }
}
