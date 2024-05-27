package jogo.PizzasEstilos;
import javax.swing.ImageIcon;
//Classe para as imagens das Pizzas de Milho.
public class PizzaMilho extends Pizza {
    public PizzaMilho() {
        super("res/Pizzas/MassaComMilho.png");
    }

    public ImageIcon getImgPizza(int ingrediente) {
        if(ingrediente == 0){
            imgPizza = new ImageIcon("res/Pizzas/MassaComMilhoeAzeitona.png");
            return imgPizza;
        }else if(ingrediente == 1){
            imgPizza = new ImageIcon("res/Pizzas/MassaComMilhoeCebola.png");
            return imgPizza;
        }else if(ingrediente == 2){
            imgPizza = new ImageIcon("res/Pizzas/MassaComMilhoeCatupiry.png");
        }
        return imgPizza;
    }
}



