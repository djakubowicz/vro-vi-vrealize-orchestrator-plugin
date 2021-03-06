package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The AdminAuthConfiguration is a POJO class extends AviRestResource that used for creating
 * AdminAuthConfiguration.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "AdminAuthConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_ADMINAUTHCONFIGURATION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class AdminAuthConfiguration extends AviRestResource {
  @JsonProperty("allow_local_user_login")
  @JsonInclude(Include.NON_NULL)
  private Boolean allowLocalUserLogin = true;

  @JsonProperty("auth_profile_ref")
  @JsonInclude(Include.NON_NULL)
  private String authProfileRef = null;

  @JsonProperty("mapping_rules")
  @JsonInclude(Include.NON_NULL)
  private List<AuthMappingRule> mappingRules = null;



  /**
   * This is the getter method this will return the attribute value.
   * Allow any user created locally to login with local credentials.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return allowLocalUserLogin
   */
  @VsoMethod
  public Boolean getAllowLocalUserLogin() {
    return allowLocalUserLogin;
  }

  /**
   * This is the setter method to the attribute.
   * Allow any user created locally to login with local credentials.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param allowLocalUserLogin set the allowLocalUserLogin.
   */
  @VsoMethod
  public void setAllowLocalUserLogin(Boolean  allowLocalUserLogin) {
    this.allowLocalUserLogin = allowLocalUserLogin;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type authprofile.
   * @return authProfileRef
   */
  @VsoMethod
  public String getAuthProfileRef() {
    return authProfileRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type authprofile.
   * @param authProfileRef set the authProfileRef.
   */
  @VsoMethod
  public void setAuthProfileRef(String  authProfileRef) {
    this.authProfileRef = authProfileRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rules list for tenant or role mapping.
   * @return mappingRules
   */
  @VsoMethod
  public List<AuthMappingRule> getMappingRules() {
    return mappingRules;
  }

  /**
   * This is the setter method. this will set the mappingRules
   * Rules list for tenant or role mapping.
   * @return mappingRules
   */
  @VsoMethod
  public void setMappingRules(List<AuthMappingRule>  mappingRules) {
    this.mappingRules = mappingRules;
  }

  /**
   * This is the setter method this will set the mappingRules
   * Rules list for tenant or role mapping.
   * @return mappingRules
   */
  @VsoMethod
  public AdminAuthConfiguration addMappingRulesItem(AuthMappingRule mappingRulesItem) {
    if (this.mappingRules == null) {
      this.mappingRules = new ArrayList<AuthMappingRule>();
    }
    this.mappingRules.add(mappingRulesItem);
    return this;
  }




@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  AdminAuthConfiguration objAdminAuthConfiguration = (AdminAuthConfiguration) o;
  return   Objects.equals(this.authProfileRef, objAdminAuthConfiguration.authProfileRef)&&
  Objects.equals(this.mappingRules, objAdminAuthConfiguration.mappingRules)&&
  Objects.equals(this.allowLocalUserLogin, objAdminAuthConfiguration.allowLocalUserLogin);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class AdminAuthConfiguration {\n");
      sb.append("    allowLocalUserLogin: ").append(toIndentedString(allowLocalUserLogin)).append("\n");
        sb.append("    authProfileRef: ").append(toIndentedString(authProfileRef)).append("\n");
        sb.append("    mappingRules: ").append(toIndentedString(mappingRules)).append("\n");
      sb.append("}");
  return sb.toString();
}

/**
* Convert the given object to string with each line indented by 4 spaces
* (except the first line).
*/
private String toIndentedString(java.lang.Object o) {
  if (o == null) {
    return "null";
  }
  return o.toString().replace("\n", "\n    ");
}
}

