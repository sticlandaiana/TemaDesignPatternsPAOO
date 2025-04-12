public class C3Nr implements Sum{
    private C2Nr sum2;
    private int c;

    public C3Nr(C2Nr sum2, int c){
        this.sum2=sum2;
        this.c=c;
    }

    @Override
    public int getSum(){
        int intermediarSum = sum2.getSum();
        return intermediarSum+c;
    }
}
