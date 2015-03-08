package boozelogger.entity.repository;

import boozelogger.entity.FermentLog;
import boozelogger.entity.FermentLogEntry;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by cjohannsen on 11/27/14.
 */
public interface FermentLogEntryRepository extends CrudRepository<FermentLogEntry, Long> {

    List<FermentLogEntry> findByFermentLof(FermentLog fermentLog);

}
