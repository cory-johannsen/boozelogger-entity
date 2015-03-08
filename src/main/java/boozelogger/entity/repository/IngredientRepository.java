package boozelogger.entity.repository;

import boozelogger.entity.Ingredient;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by cjohannsen on 11/27/14.
 */
public interface IngredientRepository extends CrudRepository<Ingredient, Long> {

    List<Ingredient> findByName(String name);

}
