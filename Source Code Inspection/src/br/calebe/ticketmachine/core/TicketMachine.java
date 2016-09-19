package br.calebe.ticketmachine.core;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;

/**
 *
 * @author Gustavo Dechechi
 */
public class TicketMachine {
    
    protected int valorTicket;
    protected int saldoMaquina;
    protected double[] papelMoeda = {0.05, 0.1, 0.25, 0.5, 1, 2, 5, 10, 20, 50, 100};

    public TicketMachine(int valor) {
        System.out.println("Aguarde alguns instantes...");
        this.valorTicket = valor;
        this.saldoMaquina = 0;
    }

    public void inserir(int quantia) throws PapelMoedaInvalidaException {
        boolean achou = false;
        
        //Comissao - O Sistema não adiciona o valor ao saldo disponível.
        for (int i = 0; i < papelMoeda.length && !achou; i++) {
            if (papelMoeda[i] == quantia) {
                achou = true;
            }
        }
        //Controle - não tem nada sendo comparado a  variavel "achou".
        //Inicialização - a variavel "quantia" não foi inicializado.
        if (!achou) {
            throw new PapelMoedaInvalidaException("Papel moeda Invalida!!");
        }
        this.saldoMaquina += quantia;
    }

    public int getSaldo() {
        return this.saldoMaquina;
    }

    //Comissão - não retorna nada ao método getTroco().
    public void getTroco(){
        double troco = saldoMaquina - valorTicket;
    }
    
    public void imprimir() throws SaldoInsuficienteException {
        if (saldoMaquina < valorTicket) {
            throw new SaldoInsuficienteException("Saldo insuficiente!");
        }
        String result = "*****************\n";
        result += "*** R$ " + saldoMaquina + ",00 ****\n";
        result += "*****************\n";
        System.out.println(result);
    }
}