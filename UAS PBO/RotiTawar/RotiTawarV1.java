package RotiTawar;
import Modal.RotiTawar;
import Harga.Interface;

public class RotiTawarV1 extends RotiTawar implements Interface {
    
    String nama = "Roti Tawar Varian 1";
    
    @Override
    public double topping () {
        //menghitung topping roti tawar varian 1
        return 0;
    }

    @Override
    public double filing() {
        double coklat  = this.modal_coklat() * 80;
        double harga = coklat;
        return harga;
    }

    @Override
    public double modal() {
        double hargaTopFill = this.filing() + this.topping();
        double hargaBahan = this.hitungModal() / this.rotiPerAdonan();
        double totalModal = hargaBahan + hargaTopFill;
        return totalModal;
    }

    @Override
    public int harga_varian() {
        double untung = this.modal() * 50/100;
        double harga = this.modal() + untung;
        return (int) Math.round(harga);
    }

    @Override
    public void harga_roti() {
        System.out.println("Harga " + nama + " = Rp " + (int) harga_varian() + " /pcs");
    }
}