package boozelogger.entity.repository;

import boozelogger.entity.FinishLog;
import boozelogger.entity.FinishLogEntry;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by cjohannsen on 11/27/14.
 */
public interface FinishLogEntryRepository extends CrudRepository<FinishLogEntry, Long> {

    List<FinishLogEntry> findByFinishLog(FinishLog finishLog);

}
