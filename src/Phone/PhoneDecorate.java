package Phone;

public abstract class  PhoneDecorate implements Phone{

    private Phone p;

    public PhoneDecorate(Phone p){
        this.p = p;
    }

    @Override
    public void call() {
        this.p.call();
    }
}
