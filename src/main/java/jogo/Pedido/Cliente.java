package jogo.Pedido;

import static jogo.Jogo.getOpcoes;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.Random;
import jogo.JanelaCozinha.Cozinha;
import jogo.JanelaCozinha.MontarPedido;
import jogo.Jogo;
import jogo.JanelaBalcao.Dinheiro;

public class Cliente {
  // Vetores para as opções das janelas
  String[] opcoes2 = { "Ir para a cozinha", "Checar dinheiro" };
  String[] opcoes3 = { "Receber pedido" };

  // Saida do Looping
  boolean saida = true;

  // Função para randomizar os clientes
  public static int randomClientes() {
    int cliente;

    Random random = new Random();
    cliente = random.nextInt(18);

    return cliente;
  }

  // Função para guardar as imagens dos clientes
  public static ImageIcon[] getImagensClientes() {

    ImageIcon[] imgCliente = new ImageIcon[18];

    imgCliente[0] = new ImageIcon("res/Clientes/Cliente1.png");
    imgCliente[1] = new ImageIcon("res/Clientes/Cliente2.png");
    imgCliente[2] = new ImageIcon("res/Clientes/Cliente3.png");
    imgCliente[3] = new ImageIcon("res/Clientes/Cliente4.png");
    imgCliente[4] = new ImageIcon("res/Clientes/Cliente5.png");
    imgCliente[5] = new ImageIcon("res/Clientes/Cliente6.png");
    imgCliente[6] = new ImageIcon("res/Clientes/Cliente7.png");
    imgCliente[7] = new ImageIcon("res/Clientes/Cliente8.png");
    imgCliente[8] = new ImageIcon("res/Clientes/Cliente9.png");
    imgCliente[9] = new ImageIcon("res/Clientes/Cliente10.png");
    imgCliente[10] = new ImageIcon("res/Clientes/Cliente11.png");
    imgCliente[11] = new ImageIcon("res/Clientes/Cliente12.png");
    imgCliente[12] = new ImageIcon("res/Clientes/Cliente13.png");
    imgCliente[13] = new ImageIcon("res/Clientes/ClienteTitio.png");
    imgCliente[14] = new ImageIcon("res/Clientes/ClienteMichael.png");
    imgCliente[15] = new ImageIcon("res/Clientes/ClienteCaneta.png");
    imgCliente[16] = new ImageIcon("res/Clientes/ClienteNey.png");
    imgCliente[17] = new ImageIcon("res/Clientes/Frederico.png");

    return imgCliente;
  }

  // Função para guardar os nomes dos clientes
  public static String[] getNomesClientes() {
    return new String[] { "Clarencio", "Dona Marluce", "Isabele", "Chris", "Augusto", "Gustavo", "Alfredinho", "Rose",
        "Bob", "Matilda", "Arthur", "Amanda", "Bella", "Titio Avô", "Michael Jackson", "Manoel Gomes",
        "Neymar", "Freddy" };
  }

  // Função para exibir a fala de entrada do cliente
  public static String[] getFalasClientes() {
    return new String[] {
        getNomesClientes()[0] + " diz: " + "Uau, sua pizzaria é incrível!\nQuero uma pizza de Milho e Azeitona.",
        getNomesClientes()[1] + " diz: "
            + " Nossa como você é Roxo! Você é humano?\nEnfim...quero uma pizza de Calabresa e Cebola",
        getNomesClientes()[2] + " diz: " + "Oii! Hoje eu vou querer uma pizza\nde Calabresa e Cebola",
        getNomesClientes()[3] + " diz: "
            + "Tá vendo esse bíceps? Ele precisa de uma pizza\nde Calabresa e Azeitona pra continuar grande",
        getNomesClientes()[4] + " diz: " + "FaLa MEu gRaNDE! mE Vê UMA PizzA dE Milho",
        getNomesClientes()[5] + " diz: " + "Eae mano, me vê uma pizza de Milho e Azeitona",
        getNomesClientes()[6] + " diz: "
            + "Nha, a minha pizza é feita de frango e o outro ingrediente você vai ter que adivinhar nhéhéheéh",
        getNomesClientes()[7] + " diz: " + "ALÔ! Minha pizza é de Calabresa e Catupiry",
        getNomesClientes()[8] + " diz: " + "Opa meu bom! A terra é ótima! Me vê... a pizza com discos vermelhos!",
        getNomesClientes()[9] + " diz: " + "UOI! uma pizza COM MUITO MILHO E MUITO CATUPIRY ",
        getNomesClientes()[10] + " diz: " + "Ei tio, eu quero uma pizza de Frango com Azeitona",
        getNomesClientes()[11] + " diz: "
            + "Olá!!! Eu quero uma pizza de frango e não sei o que mais....\n(Você vai para a cozinha por que você não tem tempo pra ela decidir)",
        getNomesClientes()[12] + " diz: " + "Oiii uma pizza de frango, AGORA!",
        getNomesClientes()[13] + " diz: " + "OI HEHE, me vê a melhor PIZZA que você TEM!",
        getNomesClientes()[14] + " diz: " + "RUSBÉ! I WANT YOUR BEST PIZZA HIHI",
        getNomesClientes()[15] + " diz: " + "CANETA AZUL, AZUL CANETA, só vou dizer que é de calabresa!",
        getNomesClientes()[16] + " diz: "
            + "Eae cara, eu quero uma pizza muito BOA!",
        getNomesClientes()[17] + " diz: "
            + "bzz Bzzz Tssz Tsssaz ZzZtzz  tztz\n(Você decide ir pra cozinha fazer uma pizza pra esse ser)"
    };
  }

  // Função para exibir a fala de saida do cliente
  public static String[] getFalasClientesSaida() {
    return new String[] {
        getNomesClientes()[0] + " diz: " + "UAUUUU! É ISSO O QUE EU QUERIA!",
        getNomesClientes()[1] + " diz: "
            + "Meu filho que pizza boa, toma aqui seu dinheiro",
        getNomesClientes()[2] + " diz: " + "Amei sua pizza, toma aqui seu dinheiro",
        getNomesClientes()[3] + " diz: "
            + "Nada como uma dieta baseada em pizza, obrigado",
        getNomesClientes()[4] + " diz: " + "QuE PizzA MOnstra HEM!",
        getNomesClientes()[5] + " diz: " + "Pizza muito boa mano hehe, valeu!",
        getNomesClientes()[6] + " diz: " + "Nha, QUE DROGA VOCÊ ACERTOU",
        getNomesClientes()[7] + " diz: " + "O cheiro tá bom, valeu!",
        getNomesClientes()[8] + " diz: " + "Caramba! Você sabe mesmo das coisas, comparsa.",
        getNomesClientes()[9] + " diz: " + "YEES, obrigado ",
        getNomesClientes()[10] + " diz: " + "Valeu tio!(A criança te encara ferozmente)",
        getNomesClientes()[11] + " diz: " + "ISSSO! Obrigada!",
        getNomesClientes()[12] + " diz: " + "Humph! Obrigada!",
        getNomesClientes()[13] + " diz: " + "HAHAHA OBRIGADO!",
        getNomesClientes()[14] + " diz: " + "HIHII MUCH THANKS",
        getNomesClientes()[15] + " diz: " + "Vou querer mais hem! Mas da próxima vez",
        getNomesClientes()[16] + " diz: "
            + "Cara sua pizza é sensacional!",
        getNomesClientes()[17] + " diz: "
            + "(A criatura tira da boca uma nota de dinheiro, deixa no balcão e vai embora)"
    };

  }

  // Função com vetor que está sendo usado na classe MONTARPEDIDO
  public static int[] getPedidoCliente() {
    
    int[] pedidoCliente = new int[13];

    pedidoCliente[0] = 0;       
    pedidoCliente[1] = 1;     
    pedidoCliente[2] = 2;
    pedidoCliente[3] = 3;
    pedidoCliente[4] = 4;
    pedidoCliente[5] = 5;
    pedidoCliente[6] = 6;
    pedidoCliente[7] = 7;
    pedidoCliente[8] = 8;
    pedidoCliente[9] = 9;
    pedidoCliente[10] = 10;
    pedidoCliente[11] = 11;
    pedidoCliente[12] = 12;
    return pedidoCliente;

   
  }

  // Variável para ser usada na classe COZINHA, condição para abrir o MONTARPEDIDO
  public static boolean pedidoFeito = false;

  // Função para atualizar o cliente, cada vez que é clicado em RECEBERPEDIDO
  public void atualizarCliente() {

    pegarCliente = randomClientes();
    pedidoFeitoPeloCliente = getPedidoCliente()[pedidoRealizado()];

  }

  // Inicialização da variável pegarCliente
  public static int pegarCliente = 0;
  // Variável pedidoFeitoPeloCliente
  public static int pedidoFeitoPeloCliente;
  // Variável pizza que está na classe MONTARPEDIDO
  int pizza = MontarPedido.pizza;

  // Função para exibir a imagem do cliente na tela com as falas
  public void janelaImgCliente() {

    if (pedidoFeito == false) {
      atualizarCliente();
    }

    // Milho e Azeitona
    if (pegarCliente == 0 || pegarCliente == 5) {
      pedidoFeitoPeloCliente = getPedidoCliente()[2];
      // Calabresa com Cebola
    } else if (pegarCliente == 1 || pegarCliente == 2) {
      pedidoFeitoPeloCliente = getPedidoCliente()[7];
      // Calabresa e Azeitona
    } else if (pegarCliente == 3) {
      pedidoFeitoPeloCliente = getPedidoCliente()[6];
      // Milho
    } else if (pegarCliente == 4) {
      pedidoFeitoPeloCliente = getPedidoCliente()[1];
      // Frango e Azeitona
    } else if (pegarCliente == 6 || pegarCliente == 10) {
      pedidoFeitoPeloCliente = getPedidoCliente()[10];
      // Calabresa e Catupiry
    } else if (pegarCliente == 7 || pegarCliente == 15) {
      pedidoFeitoPeloCliente = getPedidoCliente()[8];
      // Calabresa
    } else if (pegarCliente == 8) {
      pedidoFeitoPeloCliente = getPedidoCliente()[5];
      // Milho com Catupiry
    } else if (pegarCliente == 9) {
      pedidoFeitoPeloCliente = getPedidoCliente()[4];
      // Frango com Cebola
    } else if (pegarCliente == 11 || pegarCliente == 16) {
      pedidoFeitoPeloCliente = getPedidoCliente()[11];
      // Frango
    } else if (pegarCliente == 12) {
      pedidoFeitoPeloCliente = getPedidoCliente()[9];
      // Frango com Catupiry
    } else if (pegarCliente == 13) {
      pedidoFeitoPeloCliente = getPedidoCliente()[12];
      // Milho com Cebola
    } else if (pegarCliente == 14) {
      pedidoFeitoPeloCliente = getPedidoCliente()[3];
      // Massa
    } else if (pegarCliente == 17) {
      pedidoFeitoPeloCliente = getPedidoCliente()[0];
    }

    pedidoFeito = true;
    
    // Looping da Janela
    while (saida) {

      int escolha = JOptionPane.showOptionDialog(null, null, "Balcão", JOptionPane.YES_NO_CANCEL_OPTION,
          JOptionPane.QUESTION_MESSAGE, getImagensClientes()[pegarCliente], opcoes2, opcoes2[0]);

      if (escolha == JOptionPane.YES_OPTION) {

        Cozinha cozinha = new Cozinha();


        cozinha.entrouNaCozinha();
        saida = false;

      }
      if (escolha == JOptionPane.NO_OPTION) {
        Dinheiro dinheiro = new Dinheiro();
        dinheiro.checarDinheiro();
        saida = false;

      }

      if (escolha == JOptionPane.CLOSED_OPTION) {
        System.exit(0);
      }
    }

  }

  // Função de Fala do Cliente
  public void JanelaDeFala() {
    JOptionPane.showMessageDialog(null, getFalasClientes()[pegarCliente]);
  }

  // Sendo usado na classe MONTARPEDIDO
  public int pedidoRealizado() {
    if (pegarCliente == 0 || pegarCliente == 5) {
      return getPedidoCliente()[2];
      // Calabresa com Cebola
    } else if (pegarCliente == 1 || pegarCliente == 2) {
      return getPedidoCliente()[7];
      // Calabresa e Azeitona
    } else if (pegarCliente == 3) {
      return getPedidoCliente()[6];
      // Milho
    } else if (pegarCliente == 4) {
      return getPedidoCliente()[1];
      // Frango e Azeitona
    } else if (pegarCliente == 6 || pegarCliente == 10) {
      return getPedidoCliente()[10];
      // Calabresa e Catupiry
    } else if (pegarCliente == 7 || pegarCliente == 15) {
      return getPedidoCliente()[8];
      // Calabresa
    } else if (pegarCliente == 8) {
      return getPedidoCliente()[5];
      // Milho com Catupiry
    } else if (pegarCliente == 9) {
      return getPedidoCliente()[4];
      // Frango com Cebola
    } else if (pegarCliente == 11 || pegarCliente == 16) {
      return getPedidoCliente()[11];
      // Frango
    } else if (pegarCliente == 12) {
      return getPedidoCliente()[9];
      // Frango com Catupiry
    } else if (pegarCliente == 13) {
      return getPedidoCliente()[12];
      // Milho com Cebola
    } else if (pegarCliente == 14) {
      return getPedidoCliente()[3];
      // Massa
    } else if (pegarCliente == 17) {
      return getPedidoCliente()[0];
    } else {
      return getPedidoCliente()[0];
    }
  }
}