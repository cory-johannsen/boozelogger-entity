package boozelogger.entity.repository;

import boozelogger.entity.FinishLog;
import boozelogger.entity.FinishLogEntry;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by cjohannsen on 11/27/14.
 */
public interface FinishLogRepository extends CrudRepository<FinishLog, Long> {

    FinishLog findByFinishLogEntry(FinishLogEntry finishLogEntry);

}
