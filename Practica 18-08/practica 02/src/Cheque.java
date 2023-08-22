public class Cheque {
    private String banco;
    private float importe;
    private String titular;

    public Cheque(String banco, float importe, String titular) {
        this.banco = banco;
        this.importe = importe;
        this.titular = titular;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Cheque{" +
                "banco='" + banco + '\'' +
                ", importe=" + importe +
                ", titular='" + titular + '\'' +
                '}';
    }
}
