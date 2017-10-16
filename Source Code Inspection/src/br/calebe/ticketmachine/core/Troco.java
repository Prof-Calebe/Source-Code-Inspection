package br.calebe.ticketmachine.core;

import java.util.Iterator;

/**
 *
 * @author 31620221
 */
class Troco {

    protected PapelMoeda[] papeisMoeda;

    public Troco(int valor) {
        papeisMoeda = new PapelMoeda[6];
        int count = 0;
        while (valor % 100 != 0) {
            count++;
        }
        papeisMoeda[5] = new PapelMoeda(100, count);
        count = 0;  
        while (valor % 50 != 0) {
            count++;
        }
        papeisMoeda[4] = new PapelMoeda(50, count);
        count = 0;
        while (valor % 20 != 0) {
            count++;
        }
        papeisMoeda[3] = new PapelMoeda(20, count);
        count = 0;
        while (valor % 10 != 0) {
            count++;
        }
        papeisMoeda[2] = new PapelMoeda(10, count);
        count = 0;
        while (valor % 5 != 0) {
            count++;
        }
        papeisMoeda[1] = new PapelMoeda(5, count);
        count = 0;
        while (valor % 2 != 0) {
            count++;
        }
        papeisMoeda[1] = new PapelMoeda(2, count);
    }
    
    public String getTroco(){
        //
        return "SÓ Precisa voltar os papeis moedas e tals  #izi #suss No safari deixei una pagina aberta pra vc implementar o Interator";
    }
    
    
    
    // 35/100 % = ! 0 -> portanto nenhuma nota de cem - direciona para a proxima nota (no caso 50) e assim vai até que o % seja 0
    
//    public int notaDePapel() {
//        int troco = 0;
//        int saldo = troco;
//        do {
//            resultado =  saldo%
//            
//        while()}
//        
//    }
}

//    public Iterator<PapelMoeda> getIterator() {
//        return new TrocoIterator(this);
//    }
//    class TrocoIterator implements Iterator<PapelMoeda> {
//
//        protected Troco troco;
//
//        public TrocoIterator(Troco troco) {
//            this.troco = troco;
//        }
//
//        @Override
//        public boolean hasNext() {
//            for (int i = 6; i >= 0; i++) {
//                if (troco.papeisMoeda[i] != null) {
//                    return true;
//                }
//            }
//            return false;
//        }
//
//        @Override
//        public PapelMoeda next() {
//            PapelMoeda ret = null;
//            for (int i = 6; i >= 0 && ret != null; i++) {
//                if (troco.papeisMoeda[i] != null) {
//                    ret = troco.papeisMoeda[i];
//                    troco.papeisMoeda[i] = null;
//                }
//            }
//            return ret;
//        }
//
//        @Override
//        public void remove() {
//            next();
//        }
//    }
//}
