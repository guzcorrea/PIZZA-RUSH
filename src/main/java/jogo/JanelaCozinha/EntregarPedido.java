package jogo.JanelaCozinha;

import javax.swing.JOptionPane;
import jogo.Pedido.Cliente;
import static jogo.Pedido.Cliente.getNomesClientes;
import jogo.Jogo;
import jogo.JanelaBalcao.Dinheiro;
import javax.swing.ImageIcon;

public class EntregarPedido {
  Cliente cliente = new Cliente();
  Dinheiro dinheiro = new Dinheiro();

  String[] opcao = { "Voltar" };
  String[] msgFinal = {"Aceitar a derrota"};

  public static int[] getPedido() {
    int[] pedido = new int[13];

    pedido[0] = 0;
    pedido[1] = 1;
    pedido[2] = 2;
    pedido[3] = 3;
    pedido[4] = 4;
    pedido[5] = 5;
    pedido[6] = 6;
    pedido[7] = 7;
    pedido[8] = 8;
    pedido[9] = 9;
    pedido[10] = 10;
    pedido[11] = 11;
    pedido[12] = 12;

    return pedido;
  }

  public static int tentativas = 0;
  
  int pedidoCliente = Cliente.pedidoFeitoPeloCliente;

  int clienteSelecionado = Cliente.pegarCliente;

  int pizza = MontarPedido.pizza;

  public static boolean compararPizzas(int pizza, int pedidoCliente) {
    if (pizza == pedidoCliente) {
      return true;
    } else {
      return false;
    }
  }

  public void imgClienteSaida() {
    int escolha = JOptionPane.showOptionDialog(null, null, "Balcão", JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.QUESTION_MESSAGE, Cliente.getImagensClientes()[clienteSelecionado], opcao, opcao[0]);
    if (escolha == JOptionPane.YES_OPTION) {
      Jogo.loopdoJogo();
    }

  }

  String falaSaida = Cliente.getFalasClientesSaida()[clienteSelecionado];
  
  ImageIcon gameover = new ImageIcon("res/MIB.png");
  
  public void gameOver(){
      int msgGameOver = JOptionPane.showOptionDialog(null, null, "Balcão", JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.QUESTION_MESSAGE, gameover, msgFinal, msgFinal[0]);
      if (msgGameOver == 0){
        System.exit(0);
      }
      else{
        System.exit(0);
      }
  }

  public void janelaDeEntregarPedido(int pizza, int pedidoCliente) {

    Thread thread1 = new Thread(() -> {
      imgClienteSaida();
    });
    thread1.start();

    try {
      Thread.sleep(3000);
    } catch (InterruptedException erro) {
      erro.printStackTrace();
    }

    JOptionPane.showMessageDialog(null, "Você entrega o pedido para o cliente");

    if (compararPizzas(pizza, pedidoCliente) == true) {
      JOptionPane.showMessageDialog(null, falaSaida);
      JOptionPane.showMessageDialog(null, "O cliente paga, e o pedido é entregue");
      dinheiro.quantidadeDinheiro();
      JOptionPane.showMessageDialog(null, "Você recebeu $" + Dinheiro.valor[dinheiro.valorRandomico]);
      Cliente.pedidoFeito = false;
      

    } else if (compararPizzas(pizza, pedidoCliente) == false) {
      
      tentativas++;
      
      JOptionPane.showMessageDialog(null,
          getNomesClientes()[clienteSelecionado] + " diz: " + "Não foi essa Pizza que eu pedi...");
      JOptionPane.showMessageDialog(null, "O cliente recusa o pedido e não paga nada.");
      Cliente.pedidoFeito = false;
      
      if (tentativas == 3){
        Thread thread2 = new Thread(() -> {
          gameOver();
        });
        thread2.start();

        try {
          Thread.sleep(3000);
        } catch (InterruptedException erro) {
          erro.printStackTrace();
        }
        JOptionPane.showMessageDialog(null, "<html><b>Os clientes te denunciaram por fazer tantas pizzas ruins</b></html>");
        JOptionPane.showMessageDialog(null, "<html><b>Você foi preso por ser um alienígena e por ser um péssimo pizzaiolo</b></html>");

        
      }
      
    } else {
      Cliente.pedidoFeito = false;
      
    }
  }

}
