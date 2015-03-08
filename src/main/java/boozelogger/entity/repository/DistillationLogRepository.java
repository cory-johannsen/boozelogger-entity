package boozelogger.entity.repository;

import boozelogger.entity.Distillation;
import boozelogger.entity.DistillationLog;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by cjohannsen on 11/27/14.
 */
public interface DistillationLogRepository extends CrudRepository<DistillationLog, Long> {

    DistillationLog findByDistillation(Distillation distillation);
}
