
package jogo.Pedido;



public class ReceberPedido {
  
  Cliente cliente = new Cliente();
    
  public void recebeuOPedido() {
   
//Thread para iniciar a janela da imagem do cliente
    Thread thread1 = new Thread(() -> {
      cliente.janelaImgCliente();

    });
    //Início da thread
    thread1.start();
    
    // Tempo  de 3 segundos até a fala do cliente aparecer na tela
    try {
      Thread.sleep(3000);
    } catch (InterruptedException erro) {
      erro.printStackTrace();
    }
    
   

    //Janela com a mensagem do cliente
      cliente.JanelaDeFala();


    

  }
}
