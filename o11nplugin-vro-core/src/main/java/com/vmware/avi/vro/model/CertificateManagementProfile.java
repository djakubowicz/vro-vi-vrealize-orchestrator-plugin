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
 * The CertificateManagementProfile is a POJO class extends AviRestResource that used for creating
 * CertificateManagementProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "CertificateManagementProfile")
@VsoFinder(name = Constants.FINDER_VRO_CERTIFICATEMANAGEMENTPROFILE, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class CertificateManagementProfile extends AviRestResource {
  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;

  @JsonProperty("script_params")
  @JsonInclude(Include.NON_NULL)
  private List<CustomParams> scriptParams = null;

  @JsonProperty("script_path")
  @JsonInclude(Include.NON_NULL)
  private String scriptPath = null;

  @JsonProperty("tenant_ref")
  @JsonInclude(Include.NON_NULL)
  private String tenantRef = null;

  @JsonProperty("url")
  @JsonInclude(Include.NON_NULL)
  private String url = "url";

  @JsonProperty("uuid")
  @JsonInclude(Include.NON_NULL)
  private String uuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Name of the pki profile.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the pki profile.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property script_params of obj type certificatemanagementprofile field type str  type array.
   * @return scriptParams
   */
  @VsoMethod
  public List<CustomParams> getScriptParams() {
    return scriptParams;
  }

  /**
   * This is the setter method. this will set the scriptParams
   * Placeholder for description of property script_params of obj type certificatemanagementprofile field type str  type array.
   * @return scriptParams
   */
  @VsoMethod
  public void setScriptParams(List<CustomParams>  scriptParams) {
    this.scriptParams = scriptParams;
  }

  /**
   * This is the setter method this will set the scriptParams
   * Placeholder for description of property script_params of obj type certificatemanagementprofile field type str  type array.
   * @return scriptParams
   */
  @VsoMethod
  public CertificateManagementProfile addScriptParamsItem(CustomParams scriptParamsItem) {
    if (this.scriptParams == null) {
      this.scriptParams = new ArrayList<CustomParams>();
    }
    this.scriptParams.add(scriptParamsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property script_path of obj type certificatemanagementprofile field type str  type string.
   * @return scriptPath
   */
  @VsoMethod
  public String getScriptPath() {
    return scriptPath;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property script_path of obj type certificatemanagementprofile field type str  type string.
   * @param scriptPath set the scriptPath.
   */
  @VsoMethod
  public void setScriptPath(String  scriptPath) {
    this.scriptPath = scriptPath;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type tenant.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type tenant.
   * @param tenantRef set the tenantRef.
   */
  @VsoMethod
  public void setTenantRef(String  tenantRef) {
    this.tenantRef = tenantRef;
  }
/**
   * This is the getter method this will return the attribute value.
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public String getUrl() {
    return url;
  }

  /**
   * This is the setter method. this will set the url
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public void setUrl(String  url) {
    this.url = url;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of the object.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of the object.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }


  public String getObjectID() {
    return name + "(" + uuid  + ")";
  }

@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  CertificateManagementProfile objCertificateManagementProfile = (CertificateManagementProfile) o;
  return   Objects.equals(this.uuid, objCertificateManagementProfile.uuid)&&
  Objects.equals(this.name, objCertificateManagementProfile.name)&&
  Objects.equals(this.scriptParams, objCertificateManagementProfile.scriptParams)&&
  Objects.equals(this.scriptPath, objCertificateManagementProfile.scriptPath)&&
  Objects.equals(this.tenantRef, objCertificateManagementProfile.tenantRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class CertificateManagementProfile {\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    scriptParams: ").append(toIndentedString(scriptParams)).append("\n");
        sb.append("    scriptPath: ").append(toIndentedString(scriptPath)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
            sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

