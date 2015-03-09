package boozelogger.entity.repository;

import boozelogger.entity.Ingredient;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by cjohannsen on 11/27/14.
 */
@RepositoryRestResource(collectionResourceRel = "ingredient", path = "ingredient")
public interface IngredientRepository extends PagingAndSortingRepository<Ingredient, Long> {

    List<Ingredient> findByName(@Param("name") String name);

}
