package boozelogger.entity.repository;

import boozelogger.entity.Recipe;
import boozelogger.entity.RecipeType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by cjohannsen on 11/27/14.
 */
@RepositoryRestResource(collectionResourceRel = "recipe", path = "recipe")
public interface RecipeRepository extends PagingAndSortingRepository<Recipe, Long> {

    List<Recipe> findByName(@Param("name") String name);

    List<Recipe> findByRecipeType(@Param("recipeType") RecipeType recipeType);

    List<Recipe> findByProcess(@Param("process") Process process);
}
