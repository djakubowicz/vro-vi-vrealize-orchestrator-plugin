package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.OperationalStatus;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The VipSeAssigned is a POJO class extends AviRestResource that used for creating
 * VipSeAssigned.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VipSeAssigned")
@VsoFinder(name = Constants.FINDER_VRO_VIPSEASSIGNED)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VipSeAssigned extends AviRestResource {
  @JsonProperty("admin_down_requested")
  @JsonInclude(Include.NON_NULL)
  private Boolean adminDownRequested = false;

  @JsonProperty("connected")
  @JsonInclude(Include.NON_NULL)
  private Boolean connected = null;

  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;

  @JsonProperty("oper_status")
  @JsonInclude(Include.NON_NULL)
  private OperationalStatus operStatus = null;

  @JsonProperty("primary")
  @JsonInclude(Include.NON_NULL)
  private Boolean primary = null;

  @JsonProperty("ref")
  @JsonInclude(Include.NON_NULL)
  private String ref = null;

  @JsonProperty("scalein_in_progress")
  @JsonInclude(Include.NON_NULL)
  private Boolean scaleinInProgress = false;

  @JsonProperty("snat_ip")
  @JsonInclude(Include.NON_NULL)
  private IpAddr snatIp = null;

  @JsonProperty("standby")
  @JsonInclude(Include.NON_NULL)
  private Boolean standby = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property admin_down_requested of obj type vipseassigned field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return adminDownRequested
   */
  @VsoMethod
  public Boolean getAdminDownRequested() {
    return adminDownRequested;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property admin_down_requested of obj type vipseassigned field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param adminDownRequested set the adminDownRequested.
   */
  @VsoMethod
  public void setAdminDownRequested(Boolean  adminDownRequested) {
    this.adminDownRequested = adminDownRequested;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property connected of obj type vipseassigned field type str  type boolean.
   * @return connected
   */
  @VsoMethod
  public Boolean getConnected() {
    return connected;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property connected of obj type vipseassigned field type str  type boolean.
   * @param connected set the connected.
   */
  @VsoMethod
  public void setConnected(Boolean  connected) {
    this.connected = connected;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the object.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the object.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property oper_status of obj type vipseassigned field type str  type ref.
   * @return operStatus
   */
  @VsoMethod
  public OperationalStatus getOperStatus() {
    return operStatus;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property oper_status of obj type vipseassigned field type str  type ref.
   * @param operStatus set the operStatus.
   */
  @VsoMethod
  public void setOperStatus(OperationalStatus operStatus) {
    this.operStatus = operStatus;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property primary of obj type vipseassigned field type str  type boolean.
   * @return primary
   */
  @VsoMethod
  public Boolean getPrimary() {
    return primary;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property primary of obj type vipseassigned field type str  type boolean.
   * @param primary set the primary.
   */
  @VsoMethod
  public void setPrimary(Boolean  primary) {
    this.primary = primary;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type serviceengine.
   * @return ref
   */
  @VsoMethod
  public String getRef() {
    return ref;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type serviceengine.
   * @param ref set the ref.
   */
  @VsoMethod
  public void setRef(String  ref) {
    this.ref = ref;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property scalein_in_progress of obj type vipseassigned field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return scaleinInProgress
   */
  @VsoMethod
  public Boolean getScaleinInProgress() {
    return scaleinInProgress;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property scalein_in_progress of obj type vipseassigned field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param scaleinInProgress set the scaleinInProgress.
   */
  @VsoMethod
  public void setScaleinInProgress(Boolean  scaleinInProgress) {
    this.scaleinInProgress = scaleinInProgress;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property snat_ip of obj type vipseassigned field type str  type ref.
   * @return snatIp
   */
  @VsoMethod
  public IpAddr getSnatIp() {
    return snatIp;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property snat_ip of obj type vipseassigned field type str  type ref.
   * @param snatIp set the snatIp.
   */
  @VsoMethod
  public void setSnatIp(IpAddr snatIp) {
    this.snatIp = snatIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property standby of obj type vipseassigned field type str  type boolean.
   * @return standby
   */
  @VsoMethod
  public Boolean getStandby() {
    return standby;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property standby of obj type vipseassigned field type str  type boolean.
   * @param standby set the standby.
   */
  @VsoMethod
  public void setStandby(Boolean  standby) {
    this.standby = standby;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  VipSeAssigned objVipSeAssigned = (VipSeAssigned) o;
  return   Objects.equals(this.name, objVipSeAssigned.name)&&
  Objects.equals(this.primary, objVipSeAssigned.primary)&&
  Objects.equals(this.standby, objVipSeAssigned.standby)&&
  Objects.equals(this.connected, objVipSeAssigned.connected)&&
  Objects.equals(this.scaleinInProgress, objVipSeAssigned.scaleinInProgress)&&
  Objects.equals(this.operStatus, objVipSeAssigned.operStatus)&&
  Objects.equals(this.snatIp, objVipSeAssigned.snatIp)&&
  Objects.equals(this.adminDownRequested, objVipSeAssigned.adminDownRequested)&&
  Objects.equals(this.ref, objVipSeAssigned.ref);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VipSeAssigned {\n");
      sb.append("    adminDownRequested: ").append(toIndentedString(adminDownRequested)).append("\n");
        sb.append("    connected: ").append(toIndentedString(connected)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    operStatus: ").append(toIndentedString(operStatus)).append("\n");
        sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
        sb.append("    scaleinInProgress: ").append(toIndentedString(scaleinInProgress)).append("\n");
        sb.append("    snatIp: ").append(toIndentedString(snatIp)).append("\n");
        sb.append("    standby: ").append(toIndentedString(standby)).append("\n");
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

