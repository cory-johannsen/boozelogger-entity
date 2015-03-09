package boozelogger.entity.repository;

import boozelogger.entity.Ferment;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by cjohannsen on 11/27/14.
 */
@RepositoryRestResource(collectionResourceRel = "ferment", path = "ferment")
public interface FermentRepository extends PagingAndSortingRepository<Ferment, Long> {

    public abstract List<Ferment> findByName(@Param("name") String name);
}
