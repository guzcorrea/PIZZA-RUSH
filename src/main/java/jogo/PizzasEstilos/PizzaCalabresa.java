package jogo.PizzasEstilos;
import javax.swing.ImageIcon;
//Classe para as imagens das Pizzas de Calabresa.
public class PizzaCalabresa extends Pizza {
    

    public PizzaCalabresa() {
        super("res/Pizzas/MassaComCalabresa.png");
    }

    public ImageIcon getImgPizza(int ingrediente) {
        if(ingrediente == 0){
            imgPizza = new ImageIcon("res/Pizzas/MassaComCalabresaeAzeitona.png");
            return imgPizza;
        }else if(ingrediente == 1){
            imgPizza = new ImageIcon("res/Pizzas/MassaComCalabresaeCebola.png");
            return imgPizza;
        }else if(ingrediente == 2){
            imgPizza = new ImageIcon("res/Pizzas/MassaComCalabresaeCatupiry.png");
        }
        return imgPizza;
    }
}
