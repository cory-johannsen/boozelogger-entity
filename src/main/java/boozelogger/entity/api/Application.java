package boozelogger.entity.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//import boozelogger.entity.repository.RecipeRepository;

@Configuration
@ComponentScan
@EntityScan("boozelogger.entity")
@EnableAutoConfiguration
@RestController
public class Application {
    public static final Logger logger = LoggerFactory.getLogger(Application.class);

    private static final EntityManagerFactory INSTANCE =
            Persistence.createEntityManagerFactory("boozelogger");


    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class);

//        IngredientRepository ingredientRepository = context.getBean(IngredientRepository.class);

//        Ingredient maltIngredient = ingredientRepository.save(new Ingredient("2-Row Organic Barley Malt"));
//        Ingredient cornIngredient = ingredientRepository.save(new Ingredient("Flaked Corn"));
//        Ingredient yeastIngredient = ingredientRepository.save(new Ingredient("Distiller's Yeast"));
//        Ingredient nutrientIngredient = ingredientRepository.save(new Ingredient("Yeast Nutrient"));
//        Ingredient lactoIngredient = ingredientRepository.save(new Ingredient("Lactobacillus Pack"));

//        RecipeRepository recipeRepository = context.getBean(RecipeRepository.class);
//        Recipe recipe = new Recipe("Corn Whiskey", RecipeType.WHISKEY_MASH);
//        RecipeComponent corn = new RecipeComponent(cornIngredient, 8.5, UnitOfMeasurement.POUND);
//        RecipeComponent malt = new RecipeComponent(maltIngredient, 1.5, UnitOfMeasurement.POUND);
//        RecipeComponent yeast = new RecipeComponent(yeastIngredient, 1.0, UnitOfMeasurement.TABLESPOON);
//        RecipeComponent yeastNutrient = new RecipeComponent(nutrientIngredient, 1.0, UnitOfMeasurement.PACKAGE);
//        RecipeComponent lactobacillus = new RecipeComponent(lactoIngredient, 1.0, UnitOfMeasurement.PACKAGE);
//        recipeRepository.save(recipe);
//
//        List<Recipe> recipes = recipeRepository.findByName("Corn Whiskey");
//        for(Recipe nextRecipe : recipes) {
//            System.out.println(nextRecipe.getId() + ": " + nextRecipe.getName());
//            System.out.println("\t" + nextRecipe.getType() + ", created " + nextRecipe.getCreatedAt());
//            System.out.println("\t\tIngredients:");
//            for(RecipeComponent component: nextRecipe.getComponents()) {
//                System.out.println("\t\t\t" + component.getIngredient().getName());
//                System.out.println("\t\t\t\t" + component.getAmount() + " " + component.getUnit());
//            }
//        }
    }

}
