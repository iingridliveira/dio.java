public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();
        smartTv.escolherCanal(12);
        System.out.println("volume atual:"+ smartTv.volume);
        System.out.println("Canal escolhido:"+ smartTv.statusTv);
        smartTv.estadoTv();
        smartTv.maudarEstadotvligado();
        smartTv.estadoTv();
    }
}
