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
        int count = 0;
        int valorDesconto = valor

        if(valorDesconto > 0){
            while (valorDesconto % 100 == 0) {
                valorDesconto = valorDesconto-100
                count++;
            }
            papeisMoeda[5] = new PapelMoeda(100, count);
            count = 0;

            while (valorDesconto % 50 == 0) {
                valorDesconto = valorDesconto-50
                count++;
            }
            papeisMoeda[4] = new PapelMoeda(50, count);
            count = 0;        
            
            while (valorDesconto % 20 == 0) {
                valorDesconto = valorDesconto-20            
                count++;
            }
            papeisMoeda[3] = new PapelMoeda(20, count);
            count = 0;

            while (valorDesconto % 10 == 0) {
                valorDesconto = valorDesconto-10
                count++;
            }
            papeisMoeda[2] = new PapelMoeda(10, count);
            count = 0;

            while (valorDesconto % 5 == 0) {
                valorDesconto = valorDesconto-5
                count++;
            }
            papeisMoeda[1] = new PapelMoeda(5, count);
            
            count = 0;

            while (valorDesconto % 2 == 0) {
                count++;
            }
            papeisMoeda[0] = new PapelMoeda(2, count);
        }
<<<<<<< Updated upstream
        papeisMoeda[0] = new PapelMoeda(2, count);
=======
>>>>>>> Stashed changes
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
            for (int i = 6; i >= 0; i--) {
                if (troco.papeisMoeda[i] != null) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public PapelMoeda next() {
            PapelMoeda ret = null;
            for (int i = 6; i >= 0; i--) {
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
