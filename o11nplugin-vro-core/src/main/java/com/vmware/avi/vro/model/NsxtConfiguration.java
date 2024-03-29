package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.Tier1LogicalRouterInfo;
import com.vmware.avi.vro.model.NsxtTier1SegmentConfig;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The NsxtConfiguration is a POJO class extends AviRestResource that used for creating
 * NsxtConfiguration.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "NsxtConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_NSXTCONFIGURATION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class NsxtConfiguration extends AviRestResource {
  @JsonProperty("automate_dfw_rules")
  @JsonInclude(Include.NON_NULL)
  private Boolean automateDfwRules = false;

  @JsonProperty("domain_id")
  @JsonInclude(Include.NON_NULL)
  private String domainId = "default";

  @JsonProperty("enforcementpoint_id")
  @JsonInclude(Include.NON_NULL)
  private String enforcementpointId = "default";

  @JsonProperty("management_segment")
  @JsonInclude(Include.NON_NULL)
  private Tier1LogicalRouterInfo managementSegment = null;

  @JsonProperty("nsxt_credentials_ref")
  @JsonInclude(Include.NON_NULL)
  private String nsxtCredentialsRef = null;

  @JsonProperty("nsxt_url")
  @JsonInclude(Include.NON_NULL)
  private String nsxtUrl = null;

  @JsonProperty("site_id")
  @JsonInclude(Include.NON_NULL)
  private String siteId = "default";

  @JsonProperty("tier1_segment_config")
  @JsonInclude(Include.NON_NULL)
  private NsxtTier1SegmentConfig tier1SegmentConfig = null;

  @JsonProperty("transport_zone")
  @JsonInclude(Include.NON_NULL)
  private String transportZone = null;



  /**
   * This is the getter method this will return the attribute value.
   * Automatically create dfw rules for virtualservice in nsx-t manager.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return automateDfwRules
   */
  @VsoMethod
  public Boolean getAutomateDfwRules() {
    return automateDfwRules;
  }

  /**
   * This is the setter method to the attribute.
   * Automatically create dfw rules for virtualservice in nsx-t manager.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param automateDfwRules set the automateDfwRules.
   */
  @VsoMethod
  public void setAutomateDfwRules(Boolean  automateDfwRules) {
    this.automateDfwRules = automateDfwRules;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Domain where nsgroup objects belongs to.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as default.
   * @return domainId
   */
  @VsoMethod
  public String getDomainId() {
    return domainId;
  }

  /**
   * This is the setter method to the attribute.
   * Domain where nsgroup objects belongs to.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as default.
   * @param domainId set the domainId.
   */
  @VsoMethod
  public void setDomainId(String  domainId) {
    this.domainId = domainId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enforcement point is where the rules of a policy to apply.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as default.
   * @return enforcementpointId
   */
  @VsoMethod
  public String getEnforcementpointId() {
    return enforcementpointId;
  }

  /**
   * This is the setter method to the attribute.
   * Enforcement point is where the rules of a policy to apply.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as default.
   * @param enforcementpointId set the enforcementpointId.
   */
  @VsoMethod
  public void setEnforcementpointId(String  enforcementpointId) {
    this.enforcementpointId = enforcementpointId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Management network segment to use for avi service engines.
   * Field introduced in 20.1.1.
   * @return managementSegment
   */
  @VsoMethod
  public Tier1LogicalRouterInfo getManagementSegment() {
    return managementSegment;
  }

  /**
   * This is the setter method to the attribute.
   * Management network segment to use for avi service engines.
   * Field introduced in 20.1.1.
   * @param managementSegment set the managementSegment.
   */
  @VsoMethod
  public void setManagementSegment(Tier1LogicalRouterInfo managementSegment) {
    this.managementSegment = managementSegment;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Credentials to access nsx-t manager.
   * It is a reference to an object of type cloudconnectoruser.
   * Field introduced in 20.1.1.
   * @return nsxtCredentialsRef
   */
  @VsoMethod
  public String getNsxtCredentialsRef() {
    return nsxtCredentialsRef;
  }

  /**
   * This is the setter method to the attribute.
   * Credentials to access nsx-t manager.
   * It is a reference to an object of type cloudconnectoruser.
   * Field introduced in 20.1.1.
   * @param nsxtCredentialsRef set the nsxtCredentialsRef.
   */
  @VsoMethod
  public void setNsxtCredentialsRef(String  nsxtCredentialsRef) {
    this.nsxtCredentialsRef = nsxtCredentialsRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Nsx-t manager hostname or ip address.
   * Field introduced in 20.1.1.
   * @return nsxtUrl
   */
  @VsoMethod
  public String getNsxtUrl() {
    return nsxtUrl;
  }

  /**
   * This is the setter method to the attribute.
   * Nsx-t manager hostname or ip address.
   * Field introduced in 20.1.1.
   * @param nsxtUrl set the nsxtUrl.
   */
  @VsoMethod
  public void setNsxtUrl(String  nsxtUrl) {
    this.nsxtUrl = nsxtUrl;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Site where transport zone belongs to.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as default.
   * @return siteId
   */
  @VsoMethod
  public String getSiteId() {
    return siteId;
  }

  /**
   * This is the setter method to the attribute.
   * Site where transport zone belongs to.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as default.
   * @param siteId set the siteId.
   */
  @VsoMethod
  public void setSiteId(String  siteId) {
    this.siteId = siteId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Nsxt tier1 segment configuration for avi service engine data path.
   * Field introduced in 20.1.1.
   * @return tier1SegmentConfig
   */
  @VsoMethod
  public NsxtTier1SegmentConfig getTier1SegmentConfig() {
    return tier1SegmentConfig;
  }

  /**
   * This is the setter method to the attribute.
   * Nsxt tier1 segment configuration for avi service engine data path.
   * Field introduced in 20.1.1.
   * @param tier1SegmentConfig set the tier1SegmentConfig.
   */
  @VsoMethod
  public void setTier1SegmentConfig(NsxtTier1SegmentConfig tier1SegmentConfig) {
    this.tier1SegmentConfig = tier1SegmentConfig;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Network zone where nodes can talk via overlay.
   * Virtual ips and service engines will belong to this zone.
   * Field introduced in 20.1.1.
   * @return transportZone
   */
  @VsoMethod
  public String getTransportZone() {
    return transportZone;
  }

  /**
   * This is the setter method to the attribute.
   * Network zone where nodes can talk via overlay.
   * Virtual ips and service engines will belong to this zone.
   * Field introduced in 20.1.1.
   * @param transportZone set the transportZone.
   */
  @VsoMethod
  public void setTransportZone(String  transportZone) {
    this.transportZone = transportZone;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  NsxtConfiguration objNsxtConfiguration = (NsxtConfiguration) o;
  return   Objects.equals(this.nsxtUrl, objNsxtConfiguration.nsxtUrl)&&
  Objects.equals(this.nsxtCredentialsRef, objNsxtConfiguration.nsxtCredentialsRef)&&
  Objects.equals(this.transportZone, objNsxtConfiguration.transportZone)&&
  Objects.equals(this.siteId, objNsxtConfiguration.siteId)&&
  Objects.equals(this.enforcementpointId, objNsxtConfiguration.enforcementpointId)&&
  Objects.equals(this.domainId, objNsxtConfiguration.domainId)&&
  Objects.equals(this.managementSegment, objNsxtConfiguration.managementSegment)&&
  Objects.equals(this.tier1SegmentConfig, objNsxtConfiguration.tier1SegmentConfig)&&
  Objects.equals(this.automateDfwRules, objNsxtConfiguration.automateDfwRules);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class NsxtConfiguration {\n");
      sb.append("    automateDfwRules: ").append(toIndentedString(automateDfwRules)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    enforcementpointId: ").append(toIndentedString(enforcementpointId)).append("\n");
        sb.append("    managementSegment: ").append(toIndentedString(managementSegment)).append("\n");
        sb.append("    nsxtCredentialsRef: ").append(toIndentedString(nsxtCredentialsRef)).append("\n");
        sb.append("    nsxtUrl: ").append(toIndentedString(nsxtUrl)).append("\n");
        sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
        sb.append("    tier1SegmentConfig: ").append(toIndentedString(tier1SegmentConfig)).append("\n");
        sb.append("    transportZone: ").append(toIndentedString(transportZone)).append("\n");
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

