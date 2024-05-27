package jogo.JanelaCozinha;

import jogo.*;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;



import jogo.Pedido.Cliente;

public class Cozinha {
  MontarPedido montarPedido = new MontarPedido();
  Cliente cliente = new Cliente();
  
  boolean saida = true;

  public void entrouNaCozinha() {
    // Imagem da Cozinha
    String imgPath = "res/Cozinha.png";
    ImageIcon img = new ImageIcon(imgPath);
    // Opções da tela inicial da cozinha
    String[] opcoes2 = { "Montar pedido", "Voltar para o balcão" };

    // Looping da Cozinha
    while (saida) {

      // AQUI É A JANELA INICIAL DA COZINHA
      int cozinha = JOptionPane.showOptionDialog(null, null, "Cozinha", JOptionPane.YES_NO_CANCEL_OPTION,
          JOptionPane.QUESTION_MESSAGE,
          img, opcoes2, opcoes2[0]);

      // CONDIÇÃO PARA ABRIR O MONTAR PEDIDO

      if (cozinha == JOptionPane.YES_OPTION && Cliente.pedidoFeito == false) {
        // Caso o cliente não tenha feito o pedido
        Thread thread1 = new Thread(() -> {
          JOptionPane.showMessageDialog(null, "Você não recebeu nenhum pedido ainda");
        });
        thread1.start();

        // Opção de Montar o pedido
      } else if (cozinha == JOptionPane.YES_OPTION && Cliente.pedidoFeito == true) {
        // Caso o cliente tenha feito o pedido
        montarPedido.montarPedido();
        break;
      }

      // Voltar para o balcão
      if (cozinha == JOptionPane.NO_OPTION) {
        if (Cliente.pedidoFeito == true) {
          cliente.janelaImgCliente();
          saida = false;
        } else if (Cliente.pedidoFeito == false) {
          Jogo.loopdoJogo();
          saida = false;
        }
      }
      // Fechar a janela da cozinha
      if (cozinha == JOptionPane.CLOSED_OPTION) {
        System.exit(0);
      }

    }
  }
}
