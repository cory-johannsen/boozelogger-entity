package boozelogger.entity.repository;

import boozelogger.entity.Distillation;
import boozelogger.entity.Ferment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by cjohannsen on 11/27/14.
 */
@RepositoryRestResource(collectionResourceRel = "distillation", path = "distillation")
public interface DistillationRepository extends PagingAndSortingRepository<Distillation, Long> {

    Distillation findByFermentId(@Param("fermentId") Long fermentId);

}
