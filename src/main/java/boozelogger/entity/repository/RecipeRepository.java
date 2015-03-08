package boozelogger.entity.repository;

import boozelogger.entity.Recipe;
import boozelogger.entity.RecipeType;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by cjohannsen on 11/27/14.
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {

    List<Recipe> findByName(String name);

    List<Recipe> findByRecipeType(RecipeType recipeType);

    List<Recipe> findByProcess(Process process);
}
