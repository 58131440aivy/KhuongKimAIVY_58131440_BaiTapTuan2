package Calculator;
//implements là kế thừa từ interface
public class Calculator implements ICalculator{

    @Override
    public int Cong(int a, int b) {
        return a+b;
    }

    @Override
    public int Tru(int a, int b) {
        return a-b;
    }

    @Override
    public int Nhan(int a, int b) {
        return a*b;
    }

    @Override
    public float Chia(int a, int b) {
        if(a != 0){
            return a/b;
        }
        return 0;
    }
    
}
