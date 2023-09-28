package br.calebe.ticketmachine.core;

import java.util.Iterator;

public class Troco {

    protected PapelMoeda[] papeisMoeda;

    public Troco(int valor) {
        papeisMoeda = new PapelMoeda[6];
        int count = 0;
        while (valor % 100 != 0) {
            count++;
            valor -= 100; // Subtrai o valor correspondente
        }
        papeisMoeda[5] = new PapelMoeda(100, count);
        count = 0;
        while (valor % 50 != 0) {
            count++;
            valor -= 50; // Subtrai o valor correspondente
        }
        papeisMoeda[4] = new PapelMoeda(50, count);
        count = 0;
        while (valor % 20 != 0) {
            count++;
            valor -= 20; // Subtrai o valor correspondente
        }
        papeisMoeda[3] = new PapelMoeda(20, count);
        count = 0;
        while (valor % 10 != 0) {
            count++;
            valor -= 10; // Subtrai o valor correspondente
        }
        papeisMoeda[2] = new PapelMoeda(10, count);
        count = 0;
        while (valor % 5 != 0) {
            count++;
            valor -= 5; // Subtrai o valor correspondente
        }
        papeisMoeda[1] = new PapelMoeda(5, count);
        count = 0;
        while (valor % 2 != 0) {
            count++;
            valor -= 2; // Subtrai o valor correspondente
        }
        papeisMoeda[0] = new PapelMoeda(2, count);
    }

    public Iterator<PapelMoeda> getIterator() {
        return new TrocoIterator(this);
    }

    class TrocoIterator implements Iterator<PapelMoeda> {

        protected Troco troco;
        private int currentIndex; // Adicionei um índice para acompanhar a posição atual

        public TrocoIterator(Troco troco) {
            this.troco = troco;
            this.currentIndex = 0; // Inicializa o índice
        }

        @Override
        public boolean hasNext() {
            // Corrigido o loop, e a verificação é se o índice é menor que o tamanho do array
            return currentIndex < troco.papeisMoeda.length && troco.papeisMoeda[currentIndex] != null;
        }

        @Override
        public PapelMoeda next() {
            if (!hasNext()) {
                throw new IllegalStateException("Não há mais elementos.");
            }
            PapelMoeda ret = troco.papeisMoeda[currentIndex];
            troco.papeisMoeda[currentIndex] = null;
            currentIndex++; // Avança para o próximo índice
            return ret;
        }

        @Override
        public void remove() {
            // Implementação removida, pois não é necessária.
        }
    }
}