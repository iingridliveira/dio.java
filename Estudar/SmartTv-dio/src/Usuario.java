public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();
        smartTv.escolherCanal(5);
        System.out.println("volume atual:"+ smartTv.volume);
        smartTv.estadoTv();
        smartTv.maudarEstadotvligado();
        smartTv.estadoTv();
        smartTv.opçõesCanais();
        smartTv.maudarEstadotvdesligado();
    }
}
