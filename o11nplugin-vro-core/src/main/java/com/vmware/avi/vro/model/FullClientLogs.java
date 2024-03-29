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
 * The FullClientLogs is a POJO class extends AviRestResource that used for creating
 * FullClientLogs.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "FullClientLogs")
@VsoFinder(name = Constants.FINDER_VRO_FULLCLIENTLOGS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class FullClientLogs extends AviRestResource {
  @JsonProperty("all_headers")
  @JsonInclude(Include.NON_NULL)
  private Boolean allHeaders = null;

  @JsonProperty("duration")
  @JsonInclude(Include.NON_NULL)
  private Integer duration = 30;

  @JsonProperty("enabled")
  @JsonInclude(Include.NON_NULL)
  private Boolean enabled = false;

  @JsonProperty("throttle")
  @JsonInclude(Include.NON_NULL)
  private Integer throttle = 10;



  /**
   * This is the getter method this will return the attribute value.
   * [deprecated] log all headers.
   * Please use the all_headers flag in analyticspolicy.
   * Field deprecated in 18.1.4, 18.2.1.
   * @return allHeaders
   */
  @VsoMethod
  public Boolean getAllHeaders() {
    return allHeaders;
  }

  /**
   * This is the setter method to the attribute.
   * [deprecated] log all headers.
   * Please use the all_headers flag in analyticspolicy.
   * Field deprecated in 18.1.4, 18.2.1.
   * @param allHeaders set the allHeaders.
   */
  @VsoMethod
  public void setAllHeaders(Boolean  allHeaders) {
    this.allHeaders = allHeaders;
  }

  /**
   * This is the getter method this will return the attribute value.
   * How long should the system capture all logs, measured in minutes.
   * Set to 0 for infinite.
   * Special values are 0 - 'infinite'.
   * Default value when not specified in API or module is interpreted by Avi Controller as 30.
   * @return duration
   */
  @VsoMethod
  public Integer getDuration() {
    return duration;
  }

  /**
   * This is the setter method to the attribute.
   * How long should the system capture all logs, measured in minutes.
   * Set to 0 for infinite.
   * Special values are 0 - 'infinite'.
   * Default value when not specified in API or module is interpreted by Avi Controller as 30.
   * @param duration set the duration.
   */
  @VsoMethod
  public void setDuration(Integer  duration) {
    this.duration = duration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Capture all client logs including connections and requests.
   * When disabled, only errors will be logged.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enabled
   */
  @VsoMethod
  public Boolean getEnabled() {
    return enabled;
  }

  /**
   * This is the setter method to the attribute.
   * Capture all client logs including connections and requests.
   * When disabled, only errors will be logged.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enabled set the enabled.
   */
  @VsoMethod
  public void setEnabled(Boolean  enabled) {
    this.enabled = enabled;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This setting limits the number of non-significant logs generated per second for this vs on each se.
   * Default is 10 logs per second.
   * Set it to zero (0) to disable throttling.
   * Field introduced in 17.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @return throttle
   */
  @VsoMethod
  public Integer getThrottle() {
    return throttle;
  }

  /**
   * This is the setter method to the attribute.
   * This setting limits the number of non-significant logs generated per second for this vs on each se.
   * Default is 10 logs per second.
   * Set it to zero (0) to disable throttling.
   * Field introduced in 17.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @param throttle set the throttle.
   */
  @VsoMethod
  public void setThrottle(Integer  throttle) {
    this.throttle = throttle;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  FullClientLogs objFullClientLogs = (FullClientLogs) o;
  return   Objects.equals(this.enabled, objFullClientLogs.enabled)&&
  Objects.equals(this.duration, objFullClientLogs.duration)&&
  Objects.equals(this.allHeaders, objFullClientLogs.allHeaders)&&
  Objects.equals(this.throttle, objFullClientLogs.throttle);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class FullClientLogs {\n");
      sb.append("    allHeaders: ").append(toIndentedString(allHeaders)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    throttle: ").append(toIndentedString(throttle)).append("\n");
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

