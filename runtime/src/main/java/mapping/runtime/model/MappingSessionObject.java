package mapping.runtime.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "sessions")
public class MappingSessionObject extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String ident;
    public String id;
    public String deviceId;
    public Boolean migrated;
    public String shortName;
    public CustomerDetails customerDetails;
    public List<Account> accountList = null;
    public List<BeneficiaryAccount> beneficiaryAccount = null;
    public List<LegacyService> legacyServiceList = null;
    public QrProvider qrProvider;
    @JsonProperty("CodeIdOtp")
    public String codeIdOtp = null;
}
