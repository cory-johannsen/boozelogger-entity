package boozelogger.entity.repository;

import boozelogger.entity.Ingredient;
import boozelogger.entity.ProcessStep;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by cjohannsen on 11/27/14.
 */
@RepositoryRestResource(collectionResourceRel = "processStep", path = "processStep")
public interface ProcessStepRepository extends PagingAndSortingRepository<ProcessStep, Long> {

    List<ProcessStep> findByName(@Param("name") String name);

}
