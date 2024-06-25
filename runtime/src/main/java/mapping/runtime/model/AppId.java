package mapping.runtime.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;

@Entity
@Table(name = "appId")
public class AppId extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long ident;

    public String name;

    public String shortName;

    public String appVersion;
}
