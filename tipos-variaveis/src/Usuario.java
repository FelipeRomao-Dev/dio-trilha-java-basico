public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println(" TV ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual : "  + smartTv.canal);
        System.out.println("Volume Atual : " + smartTv.volume);

        smartTv.ligar();
        System.out.println(" Novo Status => TV ligada ? " + smartTv.ligada);
 
       smartTv.band();
       System.out.println("Novo canal : "  + smartTv.canal);

       smartTv.volume();
       System.out.println("Volume aumentado para : "  +  smartTv.volume);
 
       smartTv.diminuirVolume();
       smartTv.diminuirVolume();
       smartTv.diminuirVolume();
       smartTv.aumentarVolume();
       System.out.println("Volume Atual : " + smartTv.volume);

       smartTv.mudarCanal(7);
       System.out.println("Canal Atual : " + smartTv.canal);
    }

}
