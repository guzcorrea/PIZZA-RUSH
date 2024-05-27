package jogo;

import jogo.JanelaCozinha.Cozinha;
import javax.swing.*;
import jogo.Pedido.ReceberPedido;
import jogo.JanelaBalcao.Dinheiro;


public class Jogo {

  public static String[] getOpcoes() {
    return new String[] { "Receber pedido", "Ir para a cozinha", "Checar Dinheiro" };
  }

  public static void loopdoJogo() {
    Cozinha cozinha = new Cozinha();
    ReceberPedido receberPedido = new ReceberPedido();
    Dinheiro dinheiro = new Dinheiro();
    String imgPath = "res/Alien.png";
    ImageIcon img = new ImageIcon(imgPath);


    while (true) {

      // Balcão
      int escolha = JOptionPane.showOptionDialog(null, null, "Balcão", JOptionPane.YES_NO_CANCEL_OPTION,
          JOptionPane.QUESTION_MESSAGE,
          img, getOpcoes(), getOpcoes()[0]);

      // Receber o pedido
      if (escolha == JOptionPane.YES_OPTION) {
        receberPedido.recebeuOPedido();
        break;
      }

      // Ir para a cozinha
      if (escolha == JOptionPane.NO_OPTION) {
      System.out.println(Dinheiro.contadorDinheiro);
        cozinha.entrouNaCozinha();
        break;
      }
      // Checar o dinheiro
      if (escolha == JOptionPane.CANCEL_OPTION) {
        System.out.println(Dinheiro.contadorDinheiro);
        dinheiro.checarDinheiro();
        break;
      }
      // Saida do Jogo
      if (escolha == JOptionPane.CLOSED_OPTION) {
        System.exit(0);

      }
    }

  }
}
