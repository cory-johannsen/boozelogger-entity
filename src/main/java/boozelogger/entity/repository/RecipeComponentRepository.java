package boozelogger.entity.repository;

import boozelogger.entity.Ingredient;
import boozelogger.entity.RecipeComponent;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by cjohannsen on 11/27/14.
 */
@RepositoryRestResource(collectionResourceRel = "recipeComponent", path = "recipeComponent")
public interface RecipeComponentRepository extends PagingAndSortingRepository<RecipeComponent, Long> {

        List<RecipeComponent> findByIngredient(@Param("ingredient") Ingredient ingredient);
}
