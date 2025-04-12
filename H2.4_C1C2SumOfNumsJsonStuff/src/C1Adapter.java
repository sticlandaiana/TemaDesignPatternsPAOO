public class C1Adapter extends C1 {
    private C2 c2;

    public C1Adapter(C2 c2) {
        this.c2 = c2;
    }

    @Override
    public int getSum() {
        return c2.getN1() + c2.getN2();
    }
}