package mapping.runtime.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import mapping.runtime.model.DeviceSession;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DeviceSessionRepository implements PanacheRepositoryBase<DeviceSession,Long> {
}
