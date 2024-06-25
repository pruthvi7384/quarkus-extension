package mapping.runtime.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseDto {
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("token_type")
    private String tokenType;
    @JsonProperty("client_id")
    private String clientId;
    @JsonProperty("username")
    private String username;
    @JsonProperty("sub")
    private String sub;
    @JsonProperty("exp")
    private Integer exp;
    @JsonProperty("expstr")
    private String expstr;
    @JsonProperty("iat")
    private Integer iat;
    @JsonProperty("nbf")
    private Integer nbf;
    @JsonProperty("nbfstr")
    private String nbfstr;
    @JsonProperty("scope")
    private String scope;
    @JsonProperty("miscinfo")
    private String miscinfo;
    @JsonProperty("consented_on")
    private Integer consentedOn;
    @JsonProperty("consented_on_str")
    private String consentedOnStr;
    @JsonProperty("grant_type")
    private String grantType;
    @JsonProperty("client_name")
    private String clientName;

    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    @JsonProperty("token_type")
    public String getTokenType() {
        return tokenType;
    }

    @JsonProperty("token_type")
    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    @JsonProperty("client_id")
    public String getClientId() {
        return clientId;
    }

    @JsonProperty("client_id")
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    @JsonProperty("sub")
    public String getSub() {
        return sub;
    }

    @JsonProperty("sub")
    public void setSub(String sub) {
        this.sub = sub;
    }

    @JsonProperty("exp")
    public Integer getExp() {
        return exp;
    }

    @JsonProperty("exp")
    public void setExp(Integer exp) {
        this.exp = exp;
    }

    @JsonProperty("expstr")
    public String getExpstr() {
        return expstr;
    }

    @JsonProperty("expstr")
    public void setExpstr(String expstr) {
        this.expstr = expstr;
    }

    @JsonProperty("iat")
    public Integer getIat() {
        return iat;
    }

    @JsonProperty("iat")
    public void setIat(Integer iat) {
        this.iat = iat;
    }

    @JsonProperty("nbf")
    public Integer getNbf() {
        return nbf;
    }

    @JsonProperty("nbf")
    public void setNbf(Integer nbf) {
        this.nbf = nbf;
    }

    @JsonProperty("nbfstr")
    public String getNbfstr() {
        return nbfstr;
    }

    @JsonProperty("nbfstr")
    public void setNbfstr(String nbfstr) {
        this.nbfstr = nbfstr;
    }

    @JsonProperty("scope")
    public String getScope() {
        return scope;
    }

    @JsonProperty("scope")
    public void setScope(String scope) {
        this.scope = scope;
    }

    @JsonProperty("miscinfo")
    public String getMiscinfo() {
        return miscinfo;
    }

    @JsonProperty("miscinfo")
    public void setMiscinfo(String miscinfo) {
        this.miscinfo = miscinfo;
    }

    @JsonProperty("consented_on")
    public Integer getConsentedOn() {
        return consentedOn;
    }

    @JsonProperty("consented_on")
    public void setConsentedOn(Integer consentedOn) {
        this.consentedOn = consentedOn;
    }

    @JsonProperty("consented_on_str")
    public String getConsentedOnStr() {
        return consentedOnStr;
    }

    @JsonProperty("consented_on_str")
    public void setConsentedOnStr(String consentedOnStr) {
        this.consentedOnStr = consentedOnStr;
    }

    @JsonProperty("grant_type")
    public String getGrantType() {
        return grantType;
    }

    @JsonProperty("grant_type")
    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }

    @JsonProperty("client_name")
    public String getClientName() {
        return clientName;
    }

    @JsonProperty("client_name")
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

}
