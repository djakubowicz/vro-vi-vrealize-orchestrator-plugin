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
 * The WafApplicationSignatureAppVersion is a POJO class extends AviRestResource that used for creating
 * WafApplicationSignatureAppVersion.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "WafApplicationSignatureAppVersion")
@VsoFinder(name = Constants.FINDER_VRO_WAFAPPLICATIONSIGNATUREAPPVERSION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class WafApplicationSignatureAppVersion extends AviRestResource {
  @JsonProperty("application")
  @JsonInclude(Include.NON_NULL)
  private String application = null;

  @JsonProperty("last_changed_ruleset_version")
  @JsonInclude(Include.NON_NULL)
  private String lastChangedRulesetVersion = null;



  /**
   * This is the getter method this will return the attribute value.
   * Name of an application in the rule set.
   * Field introduced in 20.1.1.
   * @return application
   */
  @VsoMethod
  public String getApplication() {
    return application;
  }

  /**
   * This is the setter method to the attribute.
   * Name of an application in the rule set.
   * Field introduced in 20.1.1.
   * @param application set the application.
   */
  @VsoMethod
  public void setApplication(String  application) {
    this.application = application;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The last version of the rule set when the rules corresponding to the application changed.
   * Field introduced in 20.1.1.
   * @return lastChangedRulesetVersion
   */
  @VsoMethod
  public String getLastChangedRulesetVersion() {
    return lastChangedRulesetVersion;
  }

  /**
   * This is the setter method to the attribute.
   * The last version of the rule set when the rules corresponding to the application changed.
   * Field introduced in 20.1.1.
   * @param lastChangedRulesetVersion set the lastChangedRulesetVersion.
   */
  @VsoMethod
  public void setLastChangedRulesetVersion(String  lastChangedRulesetVersion) {
    this.lastChangedRulesetVersion = lastChangedRulesetVersion;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  WafApplicationSignatureAppVersion objWafApplicationSignatureAppVersion = (WafApplicationSignatureAppVersion) o;
  return   Objects.equals(this.application, objWafApplicationSignatureAppVersion.application)&&
  Objects.equals(this.lastChangedRulesetVersion, objWafApplicationSignatureAppVersion.lastChangedRulesetVersion);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class WafApplicationSignatureAppVersion {\n");
      sb.append("    application: ").append(toIndentedString(application)).append("\n");
        sb.append("    lastChangedRulesetVersion: ").append(toIndentedString(lastChangedRulesetVersion)).append("\n");
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

