package br.calebe.ticketmachine.core;

import java.util.Iterator;

/**
 *
 * @author Calebe de Paula Bianchini
 */
class Troco {

    protected PapelMoeda[] papeisMoeda;

    public Troco(int valor) {
        papeisMoeda = new PapelMoeda[6];
        int count100 = 0;
        while (valor % 100 != 0) {
            count100++;
        }
        papeisMoeda[5] = new PapelMoeda(100, count100);
        int count50 = 0;
        while (valor % 50 != 0) {
            count50++;
        }
        papeisMoeda[4] = new PapelMoeda(50, count50);
        count20 = 0;
        while (valor % 20 != 0) {
            count20++;
        }
        papeisMoeda[3] = new PapelMoeda(20, count20);
        count10 = 0;
        while (valor % 10 != 0) {
            count10++;
        }
        papeisMoeda[2] = new PapelMoeda(10, count10);
        count5 = 0;
        while (valor % 5 != 0) {
            count5++;
        }
        papeisMoeda[1] = new PapelMoeda(5, count5);
        count = 0;
        while (valor % 2 != 0) {
            count++;
        }
        papeisMoeda[0] = new PapelMoeda(2, count);
    }

    public Iterator<PapelMoeda> getIterator() {
        return new TrocoIterator(this);
    }

    class TrocoIterator implements Iterator<PapelMoeda> {

        protected Troco troco;

        public TrocoIterator(Troco troco) {
            this.troco = troco;
        }

        @Override
        public boolean hasNext() {
            for (int i = 0; i < troco.papeisMoeda.lenght; i++) {
                if (troco.papeisMoeda[i] != null) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public PapelMoeda next() {
            PapelMoeda ret = null;
            for (int i = 0; i < troco.papeisMoeda.lenght && ret == null; i++) {
                if (troco.papeisMoeda[i] != null) {
                    ret = troco.papeisMoeda[i];
                    troco.papeisMoeda[i] = null;
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
