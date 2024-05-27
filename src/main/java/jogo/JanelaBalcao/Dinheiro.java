package jogo.JanelaBalcao;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import jogo.Pedido.Cliente;
import jogo.Jogo;

public class Dinheiro {
  // Vetor para opção de saida
  String[] opcao = { "Voltar para o balcão" };
  Random random = new Random();
  Cliente cliente = new Cliente();
  // Variável para dar um valor randomico do dinheiro
  public int valorRandomico = random.nextInt(6);
  // Variável para contar o dinheiro
  public static int contadorDinheiro = 0;
  // Vetor de valores para o cliente entregar
  public static int[] valor = { 1, 10, 25, 30, 50, 99 };
  // Vetor de quantidade de dinheiro para a imagem mudar
  private int[] quan = { 0, 1, 100, 250, 500 };
  // Variável para pegar a quantidade atual e colocar no indice da imagem
  private int image;

  // Função que retorna o valor inteiro do vetor de imagens
  public static ImageIcon[] getImgDinheiro() {

    ImageIcon[] dinheiroImg = new ImageIcon[5];

    dinheiroImg[0] = new ImageIcon("res/Dinheiro/Dinheiro0.png");
    dinheiroImg[1] = new ImageIcon("res/Dinheiro/Dinheiro1.png");
    dinheiroImg[2] = new ImageIcon("res/Dinheiro/Dinheiro2.png");
    dinheiroImg[3] = new ImageIcon("res/Dinheiro/Dinheiro3.png");
    dinheiroImg[4] = new ImageIcon("res/Dinheiro/Dinheiro4.png");

    return dinheiroImg;
  }

  // Função para contar o dinheiro
  public int quantidadeDinheiro() {
    contadorDinheiro = contadorDinheiro + valor[valorRandomico];
    return contadorDinheiro;
  }

  // Função para exibir a tela do dinheiro
  public void checarDinheiro() {
    Thread thread1 = new Thread(() -> {
      imgDoCaixa();
    });
    thread1.start();

    try {
      Thread.sleep(3000);
    } catch (InterruptedException erro) {
      erro.printStackTrace();
    }

    JOptionPane.showMessageDialog(null, "Você checa a quantidade de dinheiro que você tem...");

    if (contadorDinheiro > 0) {
      JOptionPane.showMessageDialog(null, "Você tem $" + contadorDinheiro + " de dinheiro");

    } else {

      JOptionPane.showMessageDialog(null, "Você não tem dinheiro....");

    }

  }

  // Função para trocar a imagem do dinheiro na tela
  public void imgDoCaixa() {
    for (int i = 4; i > -1; i--) {
      if (contadorDinheiro >= quan[i]) {
        image = i;
        i = -1;
      }
    }
    System.out.println(image);
    int escolha = JOptionPane.showOptionDialog(null, null, "Montando o pedido",
        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, getImgDinheiro()[image], opcao,
        opcao[0]);
    //Voltar para o balcão
    if (escolha == JOptionPane.YES_OPTION && Cliente.pedidoFeito == false) {
      System.out.println(Cliente.pedidoFeito);
      Jogo.loopdoJogo();
    }else if(escolha == JOptionPane.YES_OPTION && Cliente.pedidoFeito == true){
      System.out.println(Cliente.pedidoFeito);
      cliente.janelaImgCliente();
    } else {
      System.exit(0);
    }
  }

}