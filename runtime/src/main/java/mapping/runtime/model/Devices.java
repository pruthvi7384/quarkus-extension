package mapping.runtime.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Devices")
public class Devices extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long ident;

    public String device;

    public String registeredDate;

    public String updatedDate;

    public String signedAttestationStatement;

    public String challenge;

    public Integer assertionCounter = 0;

    public String biometricHash;

    public String appId;

    public String appVersion;

    public String deviceOS;

    public LocalDateTime lastAttestationDate;

    public Boolean registered;
}
