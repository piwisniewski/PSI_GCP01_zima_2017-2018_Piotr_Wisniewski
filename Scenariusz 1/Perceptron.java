import java.util.Random;

public class Perceptron {

    //losowe wagi początkowe
    Random rand =new Random();
    public double weight0=rand.nextDouble();
    public double weight1=rand.nextDouble();
    public double weight2=rand.nextDouble();

    //funkcja progowa
    public int out(double x)
    {
        if(x<0){
            return 0;
        }
        else{
            return 1;
        }
    }

    //sumator
    public int sum ( int bias, int x1, int x2 ) {
        double y_p = bias * weight0 + x1 * weight1 + x2 * weight2;
        return out( y_p );
    }

    //algorytm uczenia perceptronu
    public void learn(int bias, int x1, int x2, double y, double learningRate)
    {
        double y_p = sum(bias,x1,x2);

        weight0 += ( y - y_p ) * learningRate * bias;
        weight1 += ( y - y_p ) * learningRate * x1;
        weight2 += ( y - y_p ) * learningRate * x2;
    }
}
