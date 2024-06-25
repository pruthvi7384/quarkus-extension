package mapping.runtime.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;

@Entity
@Table(name = "DeviceSession")
public class DeviceSession extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String token;
    public String device;
    public String challenge;
    public String appId;
    public String appVersion;
}
