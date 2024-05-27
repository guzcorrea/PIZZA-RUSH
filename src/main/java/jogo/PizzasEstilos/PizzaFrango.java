package jogo.PizzasEstilos;
import javax.swing.ImageIcon;
//Classe para as imagens das Pizzas de Frango.
public class PizzaFrango extends Pizza {
    public PizzaFrango() {
        super("res/Pizzas/MassaComFrango.png");
    }

    public ImageIcon getImgPizza(int ingrediente) {
        if(ingrediente == 0){
            imgPizza = new ImageIcon("res/Pizzas/MassaComFrangoeAzeitona.png");
            return imgPizza;
        }else if(ingrediente == 1){
            imgPizza = new ImageIcon("res/Pizzas/MassaComFrangoeCebola.png");
            return imgPizza;
        }else if(ingrediente == 2){
            imgPizza = new ImageIcon("res/Pizzas/MassaComFrangoeCatupiry.png");
        }
        return imgPizza;
    }
}