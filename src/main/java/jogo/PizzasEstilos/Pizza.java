package jogo.PizzasEstilos;

import javax.swing.ImageIcon;
//Classe base para os tipos de pizza.
public abstract class Pizza {
    protected ImageIcon imgPizza;
    protected String caminhoImagem;
    
    public Pizza(String caminhoImagem) {
        this.imgPizza = new ImageIcon(caminhoImagem);
    }

    public ImageIcon getImgPizza() {
        return imgPizza;
    }

}
