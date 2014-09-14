package br.calebe.ticketmachine.core;

import java.util.Iterator;

class TrocoIterator implements Iterator<PapelMoeda> {

    protected Troco troco;

    public TrocoIterator(Troco troco) {
        this.troco = troco;
    }

    @Override
    public boolean hasNext() {
        for (int i = 6; i >= 0; i++) {
            if (troco.papeisMoeda.get(i) != null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public PapelMoeda next() {
        PapelMoeda ret = null;
        for (int i = 6; i >= 0 && ret != null; i++) {
            if (troco.papeisMoeda.get(i) != null) {
                ret = troco.papeisMoeda.get(i);
                troco.papeisMoeda.set(i, null);
            }
        }
        return ret;
    }

    @Override
    public void remove() {
        next();
    }
}
