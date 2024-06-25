package mapping.runtime.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import mapping.runtime.model.MappingSessionObject;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MappingSessionRepository implements PanacheRepositoryBase<MappingSessionObject,Long> {
}
