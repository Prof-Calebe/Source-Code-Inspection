package br.mackenzie.ticketmachine.core;

import java.util.Iterator;

/**
 *
 * @author Calebe de Paula Bianchini
 */
class Troco {

    protected int[] papelMoeda;
    protected int[] valorPapelMoeda = {2, 5, 10, 20, 50, 100};

    public Troco(int valor) {
        papelMoeda = new int[6];
        for (int i = 0; i < papelMoeda.length; i++) {
            papelMoeda[0] = 0;
        }
        while (valor % 100 != 0) {
            papelMoeda[5]++;
        }
        while (valor % 50 != 0) {
            papelMoeda[4]++;
        }
        while (valor % 20 != 0) {
            papelMoeda[3]++;
        }
        while (valor % 10 != 0) {
            papelMoeda[2]++;
        }
        while (valor % 5 != 0) {
            papelMoeda[1]++;
        }
        while (valor % 2 != 0) {
            papelMoeda[1]++;
        }
    }

    public Iterator<Integer> getIterator() {
        return new TrocoIterator(this);
    }

    class TrocoIterator implements Iterator<Integer> {

        protected Troco troco;

        public TrocoIterator(Troco troco) {
            this.troco = troco;
        }

        @Override
        public boolean hasNext() {
            for (int i = 6; i >= 0; i++) {
                if (troco.papelMoeda[i] != 0) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public Integer next() {
            Integer ret = null;
            for (int i = 6; i >= 0 && ret != null; i++) {
                if (troco.papelMoeda[i] != 0) {
                    troco.papelMoeda[i]--;
                    ret = troco.valorPapelMoeda[i];
                }
            }
            return ret;
        }

        @Override
        public void remove() {
            next();
        }
    }
}
