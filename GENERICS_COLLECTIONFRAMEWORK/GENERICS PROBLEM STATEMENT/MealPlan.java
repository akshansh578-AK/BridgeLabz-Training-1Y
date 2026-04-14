interface MealPlan {}

class VegetarianMeal implements MealPlan {}
class VeganMeal implements MealPlan {}

class Meal<T extends MealPlan> {
    private T plan;

    public Meal(T plan) {
        this.plan = plan;
    }

    public T getPlan() {
        return plan;
    }
}

class MealUtil {
    public static <T extends MealPlan> void generateMeal(T meal) {
        System.out.println("Generated: " + meal.getClass().getSimpleName());
    }
}