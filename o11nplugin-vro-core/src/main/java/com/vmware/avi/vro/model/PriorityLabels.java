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
 * The PriorityLabels is a POJO class extends AviRestResource that used for creating
 * PriorityLabels.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "PriorityLabels")
@VsoFinder(name = Constants.FINDER_VRO_PRIORITYLABELS, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class PriorityLabels extends AviRestResource {
  @JsonProperty("cloud_ref")
  @JsonInclude(Include.NON_NULL)
  private String cloudRef = null;

  @JsonProperty("description")
  @JsonInclude(Include.NON_NULL)
  private String description = null;

  @JsonProperty("equivalent_labels")
  @JsonInclude(Include.NON_NULL)
  private List<EquivalentLabels> equivalentLabels = null;

  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;

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
   * It is a reference to an object of type cloud.
   * @return cloudRef
   */
  @VsoMethod
  public String getCloudRef() {
    return cloudRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type cloud.
   * @param cloudRef set the cloudRef.
   */
  @VsoMethod
  public void setCloudRef(String  cloudRef) {
    this.cloudRef = cloudRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * A description of the priority labels.
   * @return description
   */
  @VsoMethod
  public String getDescription() {
    return description;
  }

  /**
   * This is the setter method to the attribute.
   * A description of the priority labels.
   * @param description set the description.
   */
  @VsoMethod
  public void setDescription(String  description) {
    this.description = description;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Equivalent priority labels in descending order.
   * @return equivalentLabels
   */
  @VsoMethod
  public List<EquivalentLabels> getEquivalentLabels() {
    return equivalentLabels;
  }

  /**
   * This is the setter method. this will set the equivalentLabels
   * Equivalent priority labels in descending order.
   * @return equivalentLabels
   */
  @VsoMethod
  public void setEquivalentLabels(List<EquivalentLabels>  equivalentLabels) {
    this.equivalentLabels = equivalentLabels;
  }

  /**
   * This is the setter method this will set the equivalentLabels
   * Equivalent priority labels in descending order.
   * @return equivalentLabels
   */
  @VsoMethod
  public PriorityLabels addEquivalentLabelsItem(EquivalentLabels equivalentLabelsItem) {
    if (this.equivalentLabels == null) {
      this.equivalentLabels = new ArrayList<EquivalentLabels>();
    }
    this.equivalentLabels.add(equivalentLabelsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * The name of the priority labels.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * The name of the priority labels.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
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
   * Uuid of the priority labels.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the priority labels.
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
  PriorityLabels objPriorityLabels = (PriorityLabels) o;
  return   Objects.equals(this.uuid, objPriorityLabels.uuid)&&
  Objects.equals(this.name, objPriorityLabels.name)&&
  Objects.equals(this.equivalentLabels, objPriorityLabels.equivalentLabels)&&
  Objects.equals(this.description, objPriorityLabels.description)&&
  Objects.equals(this.tenantRef, objPriorityLabels.tenantRef)&&
  Objects.equals(this.cloudRef, objPriorityLabels.cloudRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class PriorityLabels {\n");
      sb.append("    cloudRef: ").append(toIndentedString(cloudRef)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    equivalentLabels: ").append(toIndentedString(equivalentLabels)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

