package mapping.runtime.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import mapping.runtime.model.Devices;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DevicesRepository implements PanacheRepositoryBase<Devices,Long> {
}
