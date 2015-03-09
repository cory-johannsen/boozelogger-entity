package boozelogger.entity.repository;

import boozelogger.entity.FinishLogEntry;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by cjohannsen on 11/27/14.
 */
@RepositoryRestResource(collectionResourceRel = "finishLogEntry", path = "finishLogEntry")
public interface FinishLogEntryRepository extends PagingAndSortingRepository<FinishLogEntry, Long> {

}
