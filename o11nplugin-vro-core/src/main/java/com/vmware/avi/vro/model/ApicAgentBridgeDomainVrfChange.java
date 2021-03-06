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
 * The ApicAgentBridgeDomainVrfChange is a POJO class extends AviRestResource that used for creating
 * ApicAgentBridgeDomainVrfChange.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ApicAgentBridgeDomainVrfChange")
@VsoFinder(name = Constants.FINDER_VRO_APICAGENTBRIDGEDOMAINVRFCHANGE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ApicAgentBridgeDomainVrfChange extends AviRestResource {
  @JsonProperty("bridge_domain")
  @JsonInclude(Include.NON_NULL)
  private String bridgeDomain = null;

  @JsonProperty("new_vrf")
  @JsonInclude(Include.NON_NULL)
  private String newVrf = null;

  @JsonProperty("old_vrf")
  @JsonInclude(Include.NON_NULL)
  private String oldVrf = null;

  @JsonProperty("pool_list")
  @JsonInclude(Include.NON_NULL)
  private List<String> poolList = null;

  @JsonProperty("vs_list")
  @JsonInclude(Include.NON_NULL)
  private List<String> vsList = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property bridge_domain of obj type apicagentbridgedomainvrfchange field type str  type string.
   * @return bridgeDomain
   */
  @VsoMethod
  public String getBridgeDomain() {
    return bridgeDomain;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property bridge_domain of obj type apicagentbridgedomainvrfchange field type str  type string.
   * @param bridgeDomain set the bridgeDomain.
   */
  @VsoMethod
  public void setBridgeDomain(String  bridgeDomain) {
    this.bridgeDomain = bridgeDomain;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property new_vrf of obj type apicagentbridgedomainvrfchange field type str  type string.
   * @return newVrf
   */
  @VsoMethod
  public String getNewVrf() {
    return newVrf;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property new_vrf of obj type apicagentbridgedomainvrfchange field type str  type string.
   * @param newVrf set the newVrf.
   */
  @VsoMethod
  public void setNewVrf(String  newVrf) {
    this.newVrf = newVrf;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property old_vrf of obj type apicagentbridgedomainvrfchange field type str  type string.
   * @return oldVrf
   */
  @VsoMethod
  public String getOldVrf() {
    return oldVrf;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property old_vrf of obj type apicagentbridgedomainvrfchange field type str  type string.
   * @param oldVrf set the oldVrf.
   */
  @VsoMethod
  public void setOldVrf(String  oldVrf) {
    this.oldVrf = oldVrf;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property pool_list of obj type apicagentbridgedomainvrfchange field type str  type array.
   * @return poolList
   */
  @VsoMethod
  public List<String> getPoolList() {
    return poolList;
  }

  /**
   * This is the setter method. this will set the poolList
   * Placeholder for description of property pool_list of obj type apicagentbridgedomainvrfchange field type str  type array.
   * @return poolList
   */
  @VsoMethod
  public void setPoolList(List<String>  poolList) {
    this.poolList = poolList;
  }

  /**
   * This is the setter method this will set the poolList
   * Placeholder for description of property pool_list of obj type apicagentbridgedomainvrfchange field type str  type array.
   * @return poolList
   */
  @VsoMethod
  public ApicAgentBridgeDomainVrfChange addPoolListItem(String poolListItem) {
    if (this.poolList == null) {
      this.poolList = new ArrayList<String>();
    }
    this.poolList.add(poolListItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vs_list of obj type apicagentbridgedomainvrfchange field type str  type array.
   * @return vsList
   */
  @VsoMethod
  public List<String> getVsList() {
    return vsList;
  }

  /**
   * This is the setter method. this will set the vsList
   * Placeholder for description of property vs_list of obj type apicagentbridgedomainvrfchange field type str  type array.
   * @return vsList
   */
  @VsoMethod
  public void setVsList(List<String>  vsList) {
    this.vsList = vsList;
  }

  /**
   * This is the setter method this will set the vsList
   * Placeholder for description of property vs_list of obj type apicagentbridgedomainvrfchange field type str  type array.
   * @return vsList
   */
  @VsoMethod
  public ApicAgentBridgeDomainVrfChange addVsListItem(String vsListItem) {
    if (this.vsList == null) {
      this.vsList = new ArrayList<String>();
    }
    this.vsList.add(vsListItem);
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
  ApicAgentBridgeDomainVrfChange objApicAgentBridgeDomainVrfChange = (ApicAgentBridgeDomainVrfChange) o;
  return   Objects.equals(this.bridgeDomain, objApicAgentBridgeDomainVrfChange.bridgeDomain)&&
  Objects.equals(this.oldVrf, objApicAgentBridgeDomainVrfChange.oldVrf)&&
  Objects.equals(this.newVrf, objApicAgentBridgeDomainVrfChange.newVrf)&&
  Objects.equals(this.vsList, objApicAgentBridgeDomainVrfChange.vsList)&&
  Objects.equals(this.poolList, objApicAgentBridgeDomainVrfChange.poolList);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ApicAgentBridgeDomainVrfChange {\n");
      sb.append("    bridgeDomain: ").append(toIndentedString(bridgeDomain)).append("\n");
        sb.append("    newVrf: ").append(toIndentedString(newVrf)).append("\n");
        sb.append("    oldVrf: ").append(toIndentedString(oldVrf)).append("\n");
        sb.append("    poolList: ").append(toIndentedString(poolList)).append("\n");
        sb.append("    vsList: ").append(toIndentedString(vsList)).append("\n");
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

