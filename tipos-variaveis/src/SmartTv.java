public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;     

    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }

//Opções de canais de televisão
public void mudarCanal(int novoCanal){
 canal =novoCanal;
}
public void aumentarCanal(){
    canal++;
}
public void diminuirCanal(){
    canal--;
}

public void sbt(){
        canal=4;
    }
    public void globo(){
        canal=5;
    }
    public void band(){
        canal=13;
    }

    // Volume da Televisão
    
    public void volume(){
        volume = 36;
    }

    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }

}
