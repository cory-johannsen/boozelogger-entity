package boozelogger.entity.repository;

import boozelogger.entity.FinishLog;
import boozelogger.entity.FinishLogEntry;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by cjohannsen on 11/27/14.
 */
@RepositoryRestResource(collectionResourceRel = "finishLog", path = "finishLog")
public interface FinishLogRepository extends PagingAndSortingRepository<FinishLog, Long> {

    FinishLog findByFinishLogEntry(@Param("finishLogEntry") FinishLogEntry finishLogEntry);

}
