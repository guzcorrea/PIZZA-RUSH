package jogo.JanelaBalcao;

import jogo.Jogo;

import javax.swing.*;
//import jogo.JanelaCozinha.Pizza;

public class Menu {
  public void iniciarJogo() {
    
    // Array de opções a serem exibidas na caixa de diálogo
    Object[] options = { "Start", "Sair" };

    // Caminho para a imagem do menu
    String imgPath = "res/Menu.png";

    ImageIcon img = new ImageIcon(imgPath);

    // Exibe a janela do menu
    int escolha = JOptionPane.showOptionDialog(null,
        null,
        "PIZZA RUSH",
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        img,
        options,
        options[0]);

    // Verifica a escolha do usuário e exibe uma mensagem correspondente
    if (escolha == JOptionPane.CLOSED_OPTION || escolha == JOptionPane.NO_OPTION) {
      System.exit(0);
    }
    if (escolha == JOptionPane.YES_OPTION) {
      JOptionPane.showMessageDialog(null,
          "<html><h1>Bem vindo ao jogo Pizza Rush!</h1></html>\nVocê é um Alien que desceu à terra e que agora quer viver como um humano.\nVocê decide abrir uma pizzaria,e fazer as melhores pizzas do mundo");
      
        
      Jogo.loopdoJogo();
    }

  }
}