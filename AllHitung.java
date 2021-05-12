package modul4;
public class AllHitung extends OperasibilanganAbs{
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
    protected double hitungJumlah() {
        this.c = this.a + this.b;
        return this.c;
    }

    @Override
    protected double hitungKurang() {
        this.c = this.a - this.b;
        return this.c;
    }

    @Override
    protected double hitungKali() {
        this.c = this.a * this.b;
        return this.c;
    }

    @Override
    protected double hitungBagi() {
        this.c = this.a / this.b;
        return this.c;
    }
    
}
