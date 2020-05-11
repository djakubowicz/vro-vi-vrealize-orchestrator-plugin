package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.StringMatch;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * AuthAttributeMatch
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-06T12:17:08.927+05:30")

@VsoObject(create = false, name = "AuthAttributeMatch")
@VsoFinder(name = Constants.FINDER_VRO_AUTHATTRIBUTEMATCH, idAccessor = "getObjectID()")
@Service
public class AuthAttributeMatch extends AviRestResource  {
  @JsonProperty("attribute_name")
  private String attributeName = null;

  @JsonProperty("attribute_value_list")
  private StringMatch attributeValueList = null;

  
  /**
   * Attribute name whose values will be looked up in the access lists. Field introduced in 18.2.5.
   * @return attributeName
  **/
  @ApiModelProperty(value = "Attribute name whose values will be looked up in the access lists. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public String getAttributeName() {
    return attributeName;
  }
    
  @VsoMethod
  public void setAttributeName(String attributeName) {
    this.attributeName = attributeName;
  }

  
  /**
   * Attribute Values used to determine access when authentication applies. Field introduced in 18.2.5.
   * @return attributeValueList
  **/
  @ApiModelProperty(value = "Attribute Values used to determine access when authentication applies. Field introduced in 18.2.5.")

  @Valid

 
  @VsoMethod  
  public StringMatch getAttributeValueList() {
    return attributeValueList;
  }
    
  @VsoMethod
  public void setAttributeValueList(StringMatch attributeValueList) {
    this.attributeValueList = attributeValueList;
  }

  
  public String getObjectID() {
		return "AuthAttributeMatch";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthAttributeMatch authAttributeMatch = (AuthAttributeMatch) o;
    return Objects.equals(this.attributeName, authAttributeMatch.attributeName) &&
        Objects.equals(this.attributeValueList, authAttributeMatch.attributeValueList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeName, attributeValueList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthAttributeMatch {\n");
    
    sb.append("    attributeName: ").append(toIndentedString(attributeName)).append("\n");
    sb.append("    attributeValueList: ").append(toIndentedString(attributeValueList)).append("\n");
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
