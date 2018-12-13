package Factory;

public interface PizzaIngredientFactory {
    public Dough createDough();                            //制作一个pizza所需要的原料
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
