package jogo.JanelaCozinha;

import javax.swing.JOptionPane;

import jogo.Pedido.Cliente;
import jogo.PizzasEstilos.*;
import jogo.Jogo;

public class MontarPedido {

  EntregarPedido entregarPedido = new EntregarPedido();

  Jogo jogo = new Jogo();

  Cliente cliente = new Cliente();
  PizzaMassa pizza0 = new PizzaMassa();
  PizzaMilho pizza1 = new PizzaMilho();
  PizzaCalabresa pizza5 = new PizzaCalabresa();
  PizzaFrango pizza9 = new PizzaFrango();
  

  public static int pizza = 0;

  public int pedidoClientela = cliente.pedidoRealizado();
  

  public void montarPedido() {
    pizza = EntregarPedido.getPedido()[0];
   

    int escolhaFinal, escolhaSecundaria, escolhaPrimaria, primeiraEscolha;
    boolean saida = true;

    // Caminho das opções de escolhas.
    String[] opcoes2 = { "Ingrediente primário", "Ingrediente secundário", "Entregar pedido" };
    String[] opcoes3 = { "Ingrediente Secundário", "Entregar Pedido" };
    String[] opcoes4 = { "Milho", "Calabresa", "Frango" };
    String[] opcoes5 = { "Azeitona", "Cebola", "Catupiry" };
    String[] opcoesFinal = { "Entregar Pedido" };
    
    int escolha1, ingredientePrim, ingredienteSecun, ingrediente;
    
    // Looping da Janela de Montar Pedido

    while (saida) {

      // Janela com massa no prato 

      escolha1 = JOptionPane.showOptionDialog(null, null, "Montando o pedido",
          JOptionPane.YES_NO_CANCEL_OPTION,
          JOptionPane.QUESTION_MESSAGE, pizza0.getImgPizza(), opcoes2, opcoes2[0]);

      switch (escolha1) {
        // Ingrediente Primário

        case JOptionPane.YES_OPTION:

          // Milho, Calabresa, Frango
          ingredientePrim = JOptionPane.showOptionDialog(null, null, "Montando o pedido",
              JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, pizza0.getImgPizza(), opcoes4,
              opcoes4[0]);
         
          // Caso com Milho
          // "Ingrediente secundário", "Entregar pedido"
          if (ingredientePrim == 0) {
            pizza = EntregarPedido.getPedido()[1];
            primeiraEscolha = JOptionPane.showOptionDialog(null, null, "Montando o pedido",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,pizza1.getImgPizza() , opcoes3,
                opcoes3[0]);
            if (primeiraEscolha == JOptionPane.NO_OPTION) {
              
              entregarPedido.janelaDeEntregarPedido(pizza, pedidoClientela);

              saida = false;
              break;
            }
          }
          // Caso com Calabresa
          // "Ingrediente secundário", "Entregar pedido"
          if (ingredientePrim == 1) {
            pizza = EntregarPedido.getPedido()[5];
            primeiraEscolha = JOptionPane.showOptionDialog(null, null, "Montando o pedido",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, pizza5.getImgPizza(), opcoes3,
                opcoes3[0]);
            if (primeiraEscolha == JOptionPane.NO_OPTION) {
              
              entregarPedido.janelaDeEntregarPedido(pizza, pedidoClientela);

              saida = false;
              break;

            }
          }
          // Caso com Frango
          // "Ingrediente secundário", "Entregar pedido"
          if (ingredientePrim == 2) {

            pizza = EntregarPedido.getPedido()[9];
            primeiraEscolha = JOptionPane.showOptionDialog(null, null, "Montando o pedido",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, pizza9.getImgPizza(), opcoes3,
                opcoes3[0]);
            if (primeiraEscolha == JOptionPane.NO_OPTION) {
              
              entregarPedido.janelaDeEntregarPedido(pizza, pedidoClientela);

              saida = false;
              break;
            }

          }
          // Fechar a janela
          if (ingredientePrim == -1) {
            System.exit(0);
          }

          // Ingrediente Secundário
          // Azeitona, Cebola, Catupiry, Voltar
        case JOptionPane.NO_OPTION:

          // Caso com Milho + Azeitona, Cebola ou Catupiry
          // Milho
          if (pizza == EntregarPedido.getPedido()[1]) {
            ingredienteSecun = JOptionPane.showOptionDialog(null, null, "Montando o pedido",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, pizza1.getImgPizza(), opcoes5,
                opcoes5[0]);
            // Milho Com Azeitona
            if (ingredienteSecun == JOptionPane.YES_OPTION) {
              pizza = EntregarPedido.getPedido()[2];
              ingrediente = 0;
              escolhaPrimaria = JOptionPane.showOptionDialog(null, null, "Montando o pedido",
                  JOptionPane.YES_NO_CANCEL_OPTION,
                  JOptionPane.QUESTION_MESSAGE, pizza1.getImgPizza(ingrediente), opcoesFinal, opcoesFinal[0]);
              
              entregarPedido.janelaDeEntregarPedido(pizza, pedidoClientela);

              saida = false;

              if (escolhaPrimaria == JOptionPane.CLOSED_OPTION) {
                System.exit(0);
              }
              // Milho com Cebola
            } else if (ingredienteSecun == JOptionPane.NO_OPTION) {
              pizza = EntregarPedido.getPedido()[3];
              ingrediente = 1;
              escolhaPrimaria = JOptionPane.showOptionDialog(null, null, "Montando o pedido",
                  JOptionPane.YES_NO_CANCEL_OPTION,
                  JOptionPane.QUESTION_MESSAGE, pizza1.getImgPizza(ingrediente), opcoesFinal, opcoesFinal[0]);

             
              entregarPedido.janelaDeEntregarPedido(pizza, pedidoClientela);

              saida = false;

              if (escolhaPrimaria == JOptionPane.CLOSED_OPTION) {
                System.exit(0);
              }
              // Milho Com Catupiry
            } else if (ingredienteSecun == 2) {
              ingrediente = 2;
              pizza = EntregarPedido.getPedido()[4];
              escolhaPrimaria = JOptionPane.showOptionDialog(null, null, "Montando o pedido",
                  JOptionPane.YES_NO_CANCEL_OPTION,
                  JOptionPane.QUESTION_MESSAGE, pizza1.getImgPizza(ingrediente), opcoesFinal, opcoesFinal[0]);
              
              entregarPedido.janelaDeEntregarPedido(pizza, pedidoClientela);

              saida = false;

              if (escolhaPrimaria == JOptionPane.CLOSED_OPTION) {
                System.exit(0);
              }
            } else if (ingredienteSecun == -1) {
              System.exit(0);
            }
            break;

          }
          // Caso com Calabresa + Azeitona, Cebola ou Catupiry

          if (pizza == EntregarPedido.getPedido()[5]) {
            ingredienteSecun = JOptionPane.showOptionDialog(null, null, "Montando o pedido",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, pizza5.getImgPizza(), opcoes5,
                opcoes5[0]);
            // Caso com Calabresa + Azeitona
            if (ingredienteSecun == 0) {
              pizza = EntregarPedido.getPedido()[6];
              ingrediente = 0;
              escolhaSecundaria = JOptionPane.showOptionDialog(null, null, "Montando o pedido",
                  JOptionPane.YES_NO_CANCEL_OPTION,
                  JOptionPane.QUESTION_MESSAGE, pizza5.getImgPizza(ingrediente), opcoesFinal, opcoesFinal[0]);
              
              entregarPedido.janelaDeEntregarPedido(pizza, pedidoClientela);

              saida = false;

              if (escolhaSecundaria == JOptionPane.CLOSED_OPTION) {//Resolvi da maneira mais escrota possível o que vc fez?  Olha na PizzaCalabresa
                System.exit(0);
              }
              // Caso com Calabresa + Cebola
            } else if (ingredienteSecun == 1) {
              pizza = EntregarPedido.getPedido()[7];
              ingrediente = 1;
              escolhaSecundaria = JOptionPane.showOptionDialog(null, null, "Montando o pedido",
                  JOptionPane.YES_NO_CANCEL_OPTION,
                  JOptionPane.QUESTION_MESSAGE, pizza5.getImgPizza(ingrediente), opcoesFinal, opcoesFinal[0]);
              
              entregarPedido.janelaDeEntregarPedido(pizza, pedidoClientela);

              saida = false;

              if (escolhaSecundaria == JOptionPane.CLOSED_OPTION) {
                System.exit(0);
              }
              // Caso com Calabresa + Catupiry
            } else if (ingredienteSecun == 2) {
              pizza = EntregarPedido.getPedido()[8];
              ingrediente = 2;
              escolhaSecundaria = JOptionPane.showOptionDialog(null, null, "Montando o pedido",
                  JOptionPane.YES_NO_CANCEL_OPTION,
                  JOptionPane.QUESTION_MESSAGE, pizza5.getImgPizza(ingrediente), opcoesFinal, opcoesFinal[0]);
              
              entregarPedido.janelaDeEntregarPedido(pizza, pedidoClientela);

              saida = false;

              if (escolhaSecundaria == JOptionPane.CLOSED_OPTION) {
                System.exit(0);
              }
            } else if (ingredienteSecun == -1) {
              System.exit(0);
            }
            break;
          }
          // Caso com Frango + Azeitona, Cebola ou Catupiry

          if (pizza == EntregarPedido.getPedido()[9]) {
            ingredienteSecun = JOptionPane.showOptionDialog(null, null, "Montando o pedido",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, pizza9.getImgPizza(), opcoes5,
                opcoes5[0]);
            // Caso com Frango + Azeitona
            if (ingredienteSecun == 0) {
              ingrediente = 0;
              pizza = EntregarPedido.getPedido()[10];
              escolhaFinal = JOptionPane.showOptionDialog(null, null, "Montando o pedido",
                  JOptionPane.YES_NO_CANCEL_OPTION,
                  JOptionPane.QUESTION_MESSAGE, pizza9.getImgPizza(ingrediente), opcoesFinal, opcoesFinal[0]);
             
              entregarPedido.janelaDeEntregarPedido(pizza, pedidoClientela);
              saida = false;

              if (escolhaFinal == JOptionPane.CLOSED_OPTION) {
                System.exit(0);
              }
              // Caso com Frango + Cebola
            } else if (ingredienteSecun == 1) {
              ingrediente = 1;
              pizza = EntregarPedido.getPedido()[11];
              escolhaFinal = JOptionPane.showOptionDialog(null, null, "Montando o pedido",
                  JOptionPane.YES_NO_CANCEL_OPTION,
                  JOptionPane.QUESTION_MESSAGE, pizza9.getImgPizza(ingrediente), opcoesFinal, opcoesFinal[0]);
              
              entregarPedido.janelaDeEntregarPedido(pizza, pedidoClientela);

              saida = false;

              if (escolhaFinal == JOptionPane.CLOSED_OPTION) {
                System.exit(0);
              }
              // Caso com Frango + Catupiry
            } else if (ingredienteSecun == 2) {
              ingrediente = 2;
              pizza = EntregarPedido.getPedido()[12];
              escolhaFinal = JOptionPane.showOptionDialog(null, null, "Montando o pedido",
                  JOptionPane.YES_NO_CANCEL_OPTION,
                  JOptionPane.QUESTION_MESSAGE, pizza9.getImgPizza(ingrediente), opcoesFinal, opcoesFinal[0]);
             
              entregarPedido.janelaDeEntregarPedido(pizza, pedidoClientela);
              saida = false;                                               
              if (escolhaFinal == JOptionPane.CLOSED_OPTION) {
                System.exit(0);
              }
            } else if (ingredienteSecun == -1) {
              System.exit(0);
            }
            break;

          } else {
            Thread thread1 = new Thread(() -> {

              JOptionPane.showMessageDialog(null, "Você não colocou nenhum ingrediente primário");

            });
            thread1.start();

            break;
          }

          // Caso ele selecione a opção Entregar Pedido (Com a massa no prato).
        case JOptionPane.CANCEL_OPTION:
          
          entregarPedido.janelaDeEntregarPedido(pizza, pedidoClientela);

          saida = false;
          break;

        // Fechar a janela

        case JOptionPane.CLOSED_OPTION:
          System.exit(0);
      }

    }
  }
}
