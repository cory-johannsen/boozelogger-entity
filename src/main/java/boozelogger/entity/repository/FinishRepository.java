package boozelogger.entity.repository;

import boozelogger.entity.Distillation;
import boozelogger.entity.Ferment;
import boozelogger.entity.Finish;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by cjohannsen on 11/27/14.
 */
public interface FinishRepository extends CrudRepository<Finish, Long> {

    Finish findByFerment(Ferment ferment);

    Finish findByDistillation(Distillation distillation);

}
