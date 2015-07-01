package DesignPattern;
class Meal {
    private String food;
    private String drink;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }
}
abstract class MealBuilder {
    Meal meal = new Meal();
    
    public abstract void buildFood();
    
    public abstract void buildDrink();
    
    public Meal getMeal(){
        return meal;
    }
}
class MealA extends MealBuilder{

    public void buildDrink() {
        meal.setDrink("一杯可乐");
    }

    public void buildFood() {
        meal.setFood("一盒薯条");
    }

}
class MealB extends MealBuilder{

    public void buildDrink() {
        meal.setDrink("一杯柠檬果汁");
    }

    public void buildFood() {
        meal.setFood("三个鸡翅");
    }

}
class KFCWaiter {
	MealBuilder mealBuilder;
	public void setMealBuilder(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }
	public Meal construct(){
        //准备食物
        mealBuilder.buildFood();
        //准备饮料
        mealBuilder.buildDrink();
        //准备完毕，返回一个完整的套餐给客户
        return mealBuilder.getMeal();
    }
}
public class BuilderDemo {
	public static void main(String[] args) {
        //服务员
        KFCWaiter waiter = new KFCWaiter();
        //套餐A
        MealA a = new MealA();
        //服务员准备套餐A
        waiter.setMealBuilder(a);
        //获得套餐
        Meal mealA = waiter.construct();
        
        System.out.print("套餐A的组成部分:");
        System.out.println(mealA.getFood()+"---"+mealA.getDrink());
    }
}
