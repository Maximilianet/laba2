public class Main {
    double[] x = {1, 0.7, 0.3};
    double[] W = {0.1, 0.1, -0.3};
    double T = 1;
    double alpha = 1;

    public static void main(String[] args) {

    }

    public double Activ(double S,double T,double alpha){
        return Math.exp(Math.pow(-alpha*(S-T),2));
    }
}
