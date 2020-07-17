package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.SeHmEventGslbPoolMemberDetails;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The SeHmEventGslbPoolDetails is a POJO class extends AviRestResource that used for creating
 * SeHmEventGslbPoolDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SeHmEventGslbPoolDetails")
@VsoFinder(name = Constants.FINDER_VRO_SEHMEVENTGSLBPOOLDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SeHmEventGslbPoolDetails extends AviRestResource {
  @JsonProperty("gsgroup")
  @JsonInclude(Include.NON_NULL)
  private String gsgroup = null;

  @JsonProperty("gslb_service")
  @JsonInclude(Include.NON_NULL)
  private String gslbService = null;

  @JsonProperty("gsmember")
  @JsonInclude(Include.NON_NULL)
  private SeHmEventGslbPoolMemberDetails gsmember = null;

  @JsonProperty("ha_reason")
  @JsonInclude(Include.NON_NULL)
  private String haReason = null;

  @JsonProperty("se_name")
  @JsonInclude(Include.NON_NULL)
  private String seName = null;

  @JsonProperty("src_uuid")
  @JsonInclude(Include.NON_NULL)
  private String srcUuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Gslbservice pool name.
   * @return gsgroup
   */
  @VsoMethod
  public String getGsgroup() {
    return gsgroup;
  }

  /**
   * This is the setter method to the attribute.
   * Gslbservice pool name.
   * @param gsgroup set the gsgroup.
   */
  @VsoMethod
  public void setGsgroup(String  gsgroup) {
    this.gsgroup = gsgroup;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Gslb service name.
   * It is a reference to an object of type gslbservice.
   * @return gslbService
   */
  @VsoMethod
  public String getGslbService() {
    return gslbService;
  }

  /**
   * This is the setter method to the attribute.
   * Gslb service name.
   * It is a reference to an object of type gslbservice.
   * @param gslbService set the gslbService.
   */
  @VsoMethod
  public void setGslbService(String  gslbService) {
    this.gslbService = gslbService;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Gslbservice member details.
   * @return gsmember
   */
  @VsoMethod
  public SeHmEventGslbPoolMemberDetails getGsmember() {
    return gsmember;
  }

  /**
   * This is the setter method to the attribute.
   * Gslbservice member details.
   * @param gsmember set the gsmember.
   */
  @VsoMethod
  public void setGsmember(SeHmEventGslbPoolMemberDetails gsmember) {
    this.gsmember = gsmember;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ha compromised reason.
   * @return haReason
   */
  @VsoMethod
  public String getHaReason() {
    return haReason;
  }

  /**
   * This is the setter method to the attribute.
   * Ha compromised reason.
   * @param haReason set the haReason.
   */
  @VsoMethod
  public void setHaReason(String  haReason) {
    this.haReason = haReason;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Service engine.
   * @return seName
   */
  @VsoMethod
  public String getSeName() {
    return seName;
  }

  /**
   * This is the setter method to the attribute.
   * Service engine.
   * @param seName set the seName.
   */
  @VsoMethod
  public void setSeName(String  seName) {
    this.seName = seName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the event generator.
   * @return srcUuid
   */
  @VsoMethod
  public String getSrcUuid() {
    return srcUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the event generator.
   * @param srcUuid set the srcUuid.
   */
  @VsoMethod
  public void setSrcUuid(String  srcUuid) {
    this.srcUuid = srcUuid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SeHmEventGslbPoolDetails objSeHmEventGslbPoolDetails = (SeHmEventGslbPoolDetails) o;
  return   Objects.equals(this.gslbService, objSeHmEventGslbPoolDetails.gslbService)&&
  Objects.equals(this.srcUuid, objSeHmEventGslbPoolDetails.srcUuid)&&
  Objects.equals(this.gsgroup, objSeHmEventGslbPoolDetails.gsgroup)&&
  Objects.equals(this.seName, objSeHmEventGslbPoolDetails.seName)&&
  Objects.equals(this.haReason, objSeHmEventGslbPoolDetails.haReason)&&
  Objects.equals(this.gsmember, objSeHmEventGslbPoolDetails.gsmember);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SeHmEventGslbPoolDetails {\n");
      sb.append("    gsgroup: ").append(toIndentedString(gsgroup)).append("\n");
        sb.append("    gslbService: ").append(toIndentedString(gslbService)).append("\n");
        sb.append("    gsmember: ").append(toIndentedString(gsmember)).append("\n");
        sb.append("    haReason: ").append(toIndentedString(haReason)).append("\n");
        sb.append("    seName: ").append(toIndentedString(seName)).append("\n");
        sb.append("    srcUuid: ").append(toIndentedString(srcUuid)).append("\n");
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
