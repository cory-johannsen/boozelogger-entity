package boozelogger.entity.repository;

import boozelogger.entity.Ferment;
import boozelogger.entity.FermentLog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by cjohannsen on 11/27/14.
 */
@RepositoryRestResource(collectionResourceRel = "fermentLog", path = "fermentLog")
public interface FermentLogRepository extends PagingAndSortingRepository<FermentLog, Long> {

    FermentLog findByFerment(@Param("fermentLog") Ferment ferment);

}
