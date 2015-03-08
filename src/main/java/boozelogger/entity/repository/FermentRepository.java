package boozelogger.entity.repository;

import boozelogger.entity.Ferment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by cjohannsen on 11/27/14.
 */
public interface FermentRepository extends CrudRepository<Ferment, Long> {

    List<Ferment> findByName(String name);
}
