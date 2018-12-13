package Factory;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        //PizzaIngredientFactory ingredientFactory = new NYPizzaStore();   纽约工厂，根据item生成不同的纽约pizza
        return pizza;
    }
}
