package mapping.runtime.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import mapping.runtime.model.AppId;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AppIdRepository implements PanacheRepositoryBase<AppId,Long> {
}
