
public class BuilderPatternDemo {

	public static void main(String[] args) {
		
		MealBuilder mealBuilder = new MealBuilder();

		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost: " + vegMeal.getCost());

		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("Non-Veg Meal");
		nonVegMeal.showItems();
		System.out.println("Total Cost: " + nonVegMeal.getCost());
		
		//other real life scenario 
		Meal mixedVegMeal = mealBuilder.prepareMixedVegMeal();
		System.out.println("Mixed Veg Meal");
		mixedVegMeal.showItems();
		System.out.println("Total Cost: " + mixedVegMeal.getCost());
		
		//other real life scenario 
		Meal mixedNonVegMeal = mealBuilder.prepareMixedNonVegMeal();
		System.out.println("Mixed Non-Veg Meal");
		mixedNonVegMeal.showItems();
		System.out.println("Total Cost: " + mixedNonVegMeal.getCost());

	}

}
