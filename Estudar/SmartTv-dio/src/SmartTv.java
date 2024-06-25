public class SmartTv {
    Boolean statusTv= false;
    int volume=0;
    int canal= 0;
  



      

    public void maudarEstadotvdesligado(){
        statusTv = false;
  
      }
      public void maudarEstadotvligado(){
        statusTv = true;
 }
    public void estadoTv(){
     if (statusTv==true) {
        System.out.println("A tv está ligada");
        
     } else {
        System.out.println("A tv está desligada");
     }
      }

    public void aumentarVolume(){
      volume++;

    }
    public void diminurVolume(){
        volume--;
        
      }

      public void aumentarCanal(){
        canal++;
        
      }
      public void diminuirCanal(){
        canal--;
        
      }
      public void escolherCanal(int novoCanal){
        canal = novoCanal;
    
      }
}
