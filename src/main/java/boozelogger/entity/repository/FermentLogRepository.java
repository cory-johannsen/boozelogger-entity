package boozelogger.entity.repository;

import boozelogger.entity.Ferment;
import boozelogger.entity.FermentLog;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by cjohannsen on 11/27/14.
 */
public interface FermentLogRepository extends CrudRepository<FermentLog, Long> {

    FermentLog findByFerment(Ferment ferment);

}
