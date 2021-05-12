package modul4;
public class OperasiPenjumlahan extends Operasibilangan {
    protected double a = 10.5;
    protected double b =0.5;
    protected double c;    

    @Override
    protected void set_A(double a) {
        this.a = a;
    }

    @Override
    protected void set_B(double b) {
        this.b = b;
    }

    @Override
    protected double hitung() {
        this.c = this.a + this.b;
        return this.c;
    }
}
