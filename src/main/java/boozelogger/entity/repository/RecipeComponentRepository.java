package boozelogger.entity.repository;

import boozelogger.entity.Ingredient;
import boozelogger.entity.RecipeComponent;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by cjohannsen on 11/27/14.
 */
public interface RecipeComponentRepository extends CrudRepository<RecipeComponent, Long> {

        List<RecipeComponent> findByIngredient(Ingredient ingredient);
}
