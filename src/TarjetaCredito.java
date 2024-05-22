import java.util.ArrayList;
import java.util.List;

public class TarjetaCredito {

    private double limite;
    private double saldo;
    private List<Compra> listaCompras;

    public boolean lanzarCompra (Compra compra) {
        if (this.saldo > compra.getValor()) {
            this.saldo -= compra.getValor();
            this.listaCompras.add(compra);
            return true;
        }
        return false;
    }

    public TarjetaCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.listaCompras = new ArrayList<>();
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getListaCompras() {
        return listaCompras;
    }
}
