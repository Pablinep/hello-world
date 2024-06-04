
public class Main {

    public static double lm(double pv, double valor, double poltronas) {
        return pv* valor / poltronas;

    }

//    pv= poltronas vendidas
//    lm= lucro medio
    public static void main(String[] args) {
        double Apv = 20, Avalor = 40.0, Apoltronas = 25, Alm = 0;
        double Bpv= 20, Bvalor = 60.0, Bpoltronas = 100, Blm = 0;
        double CAMpv = 20, CAMvalor = 80.0, CAMpoltronas = 50, CAMlm = 0;
        double FRISApv = 20, FRISAvalor = 120.0, FRISApoltronas = 30, FRISAlm = 0;
        double NOBREpv= 20, NOBREvalor = 250.0, NOBREpoltronas = 50, NOBRElm = 0;
        Alm = lm(Apv, Avalor, Apoltronas);
        Blm= lm(Bpv, Bvalor, Bpoltronas);
        CAMlm = lm(CAMpv, CAMvalor, CAMpoltronas);
        FRISAlm = lm(FRISApv, FRISAvalor, FRISApoltronas);
        NOBRElm = lm(NOBREpv, NOBREvalor, NOBREpoltronas);
        System.out.printf("O lucro medio da Plateia A %.2f\n",Alm);
        System.out.printf("O lucro medio da Plateia B %.2f\n",Blm);
        System.out.printf("O lucro medio do Camarote %.2f\n",CAMlm);
        System.out.printf("O lucro medio da Frisa %.2f\n",FRISAlm);
        System.out.printf("O lucro medio do Balcao Nobre A %.2f\n",NOBRElm);
    }

}
