package boozelogger.entity.repository;

import boozelogger.entity.Distillation;
import boozelogger.entity.Ferment;
import boozelogger.entity.Finish;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by cjohannsen on 11/27/14.
 */
@RepositoryRestResource(collectionResourceRel = "finish", path = "finish")
public interface FinishRepository extends PagingAndSortingRepository<Finish, Long> {

    Finish findByFerment(@Param("ferment") Ferment ferment);

    Finish findByDistillation(@Param("distillation") Distillation distillation);

}
