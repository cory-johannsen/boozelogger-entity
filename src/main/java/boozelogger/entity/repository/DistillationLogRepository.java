package boozelogger.entity.repository;

import boozelogger.entity.Distillation;
import boozelogger.entity.DistillationLog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by cjohannsen on 11/27/14.
 */
@RepositoryRestResource(collectionResourceRel = "distillationLog", path = "distillationLog")
public interface DistillationLogRepository extends PagingAndSortingRepository<DistillationLog, Long> {

    DistillationLog findByDistillationId(@Param("distillationId") Long distillationId);
}
