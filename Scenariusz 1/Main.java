public class Main {
    public static void main(String[] args) {

        int era = 10;
        int bias = 1;
        double learningRate = 0.3;

        Perceptron p = new Perceptron();

        int[] x1 = {0, 0, 1, 1};
        int[] x2 = {0, 1, 0, 1};
        int[] y  = {0, 1, 1, 1}; //Bramka OR

        System.out.println("\nWagi wylosowane:");
        System.out.println("W1 = " + p.weight0);
        System.out.println("W2 = " + p.weight1);
        System.out.println("W3 = " + p.weight2);

        System.out.println("________________________\n");
        //pętle uczące p z wyświetlaniem wyników po każdej epoce
        for(int i =0;i<era;i++){
            for(int j=0;j<4;j++)
            {
                p.learn(bias,x1[j],x2[j],y[j],learningRate);
            }

            System.out.println("Numer epoki: "+ (i+1) + "\n");
            for (int k = 0; k < 4; k++) {
                System.out.println("[" + x1[k] + " " + x2[k] + "] -> " + y[k] + " wynik = " + p.sum(bias, x1[k], x2[k]));
            }

            System.out.println("\nWagi:");
            System.out.println("W1 = " + p.weight0);
            System.out.println("W2 = " + p.weight1);
            System.out.println("W3 = " + p.weight2);
            System.out.println("________________________\n");
        }



    }
}

