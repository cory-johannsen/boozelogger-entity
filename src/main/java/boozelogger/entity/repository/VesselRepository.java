package boozelogger.entity.repository;

import boozelogger.entity.Ingredient;
import boozelogger.entity.Vessel;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by cjohannsen on 11/27/14.
 */
@RepositoryRestResource(collectionResourceRel = "vessel", path = "vessel")
public interface VesselRepository extends PagingAndSortingRepository<Vessel, Long> {

    List<Vessel> findByName(@Param("name") String name);

}
