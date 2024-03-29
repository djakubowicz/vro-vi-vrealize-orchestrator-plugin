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
 * The APICLifsRuntime is a POJO class extends AviRestResource that used for creating
 * APICLifsRuntime.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "APICLifsRuntime")
@VsoFinder(name = Constants.FINDER_VRO_APICLIFSRUNTIME, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class APICLifsRuntime extends AviRestResource {
  @JsonProperty("auto_allocated")
  @JsonInclude(Include.NON_NULL)
  private Boolean autoAllocated = null;

  @JsonProperty("cifs")
  @JsonInclude(Include.NON_NULL)
  private List<Cif> cifs = null;

  @JsonProperty("contract_graphs")
  @JsonInclude(Include.NON_NULL)
  private List<String> contractGraphs = null;

  @JsonProperty("lif_label")
  @JsonInclude(Include.NON_NULL)
  private String lifLabel = null;

  @JsonProperty("multi_vrf")
  @JsonInclude(Include.NON_NULL)
  private Boolean multiVrf = null;

  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;

  @JsonProperty("network")
  @JsonInclude(Include.NON_NULL)
  private String network = null;

  @JsonProperty("se_uuid")
  @JsonInclude(Include.NON_NULL)
  private List<String> seUuid = null;

  @JsonProperty("subnet")
  @JsonInclude(Include.NON_NULL)
  private String subnet = null;

  @JsonProperty("tenant_name")
  @JsonInclude(Include.NON_NULL)
  private String tenantName = null;

  @JsonProperty("tenant_ref")
  @JsonInclude(Include.NON_NULL)
  private String tenantRef = null;

  @JsonProperty("transaction_uuid")
  @JsonInclude(Include.NON_NULL)
  private List<String> transactionUuid = null;

  @JsonProperty("url")
  @JsonInclude(Include.NON_NULL)
  private String url = "url";

  @JsonProperty("uuid")
  @JsonInclude(Include.NON_NULL)
  private String uuid = null;

  @JsonProperty("vs_uuid")
  @JsonInclude(Include.NON_NULL)
  private List<String> vsUuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property auto_allocated of obj type apiclifsruntime field type str  type boolean.
   * @return autoAllocated
   */
  @VsoMethod
  public Boolean getAutoAllocated() {
    return autoAllocated;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property auto_allocated of obj type apiclifsruntime field type str  type boolean.
   * @param autoAllocated set the autoAllocated.
   */
  @VsoMethod
  public void setAutoAllocated(Boolean  autoAllocated) {
    this.autoAllocated = autoAllocated;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property cifs of obj type apiclifsruntime field type str  type array.
   * @return cifs
   */
  @VsoMethod
  public List<Cif> getCifs() {
    return cifs;
  }

  /**
   * This is the setter method. this will set the cifs
   * Placeholder for description of property cifs of obj type apiclifsruntime field type str  type array.
   * @return cifs
   */
  @VsoMethod
  public void setCifs(List<Cif>  cifs) {
    this.cifs = cifs;
  }

  /**
   * This is the setter method this will set the cifs
   * Placeholder for description of property cifs of obj type apiclifsruntime field type str  type array.
   * @return cifs
   */
  @VsoMethod
  public APICLifsRuntime addCifsItem(Cif cifsItem) {
    if (this.cifs == null) {
      this.cifs = new ArrayList<Cif>();
    }
    this.cifs.add(cifsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Contract graph associated with the virtualservice.
   * Field introduced in 17.2.14,18.1.5,18.2.1.
   * @return contractGraphs
   */
  @VsoMethod
  public List<String> getContractGraphs() {
    return contractGraphs;
  }

  /**
   * This is the setter method. this will set the contractGraphs
   * Contract graph associated with the virtualservice.
   * Field introduced in 17.2.14,18.1.5,18.2.1.
   * @return contractGraphs
   */
  @VsoMethod
  public void setContractGraphs(List<String>  contractGraphs) {
    this.contractGraphs = contractGraphs;
  }

  /**
   * This is the setter method this will set the contractGraphs
   * Contract graph associated with the virtualservice.
   * Field introduced in 17.2.14,18.1.5,18.2.1.
   * @return contractGraphs
   */
  @VsoMethod
  public APICLifsRuntime addContractGraphsItem(String contractGraphsItem) {
    if (this.contractGraphs == null) {
      this.contractGraphs = new ArrayList<String>();
    }
    this.contractGraphs.add(contractGraphsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property lif_label of obj type apiclifsruntime field type str  type string.
   * @return lifLabel
   */
  @VsoMethod
  public String getLifLabel() {
    return lifLabel;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property lif_label of obj type apiclifsruntime field type str  type string.
   * @param lifLabel set the lifLabel.
   */
  @VsoMethod
  public void setLifLabel(String  lifLabel) {
    this.lifLabel = lifLabel;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property multi_vrf of obj type apiclifsruntime field type str  type boolean.
   * @return multiVrf
   */
  @VsoMethod
  public Boolean getMultiVrf() {
    return multiVrf;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property multi_vrf of obj type apiclifsruntime field type str  type boolean.
   * @param multiVrf set the multiVrf.
   */
  @VsoMethod
  public void setMultiVrf(Boolean  multiVrf) {
    this.multiVrf = multiVrf;
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
   * Placeholder for description of property network of obj type apiclifsruntime field type str  type string.
   * @return network
   */
  @VsoMethod
  public String getNetwork() {
    return network;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property network of obj type apiclifsruntime field type str  type string.
   * @param network set the network.
   */
  @VsoMethod
  public void setNetwork(String  network) {
    this.network = network;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of se.
   * @return seUuid
   */
  @VsoMethod
  public List<String> getSeUuid() {
    return seUuid;
  }

  /**
   * This is the setter method. this will set the seUuid
   * Unique object identifier of se.
   * @return seUuid
   */
  @VsoMethod
  public void setSeUuid(List<String>  seUuid) {
    this.seUuid = seUuid;
  }

  /**
   * This is the setter method this will set the seUuid
   * Unique object identifier of se.
   * @return seUuid
   */
  @VsoMethod
  public APICLifsRuntime addSeUuidItem(String seUuidItem) {
    if (this.seUuid == null) {
      this.seUuid = new ArrayList<String>();
    }
    this.seUuid.add(seUuidItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property subnet of obj type apiclifsruntime field type str  type string.
   * @return subnet
   */
  @VsoMethod
  public String getSubnet() {
    return subnet;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property subnet of obj type apiclifsruntime field type str  type string.
   * @param subnet set the subnet.
   */
  @VsoMethod
  public void setSubnet(String  subnet) {
    this.subnet = subnet;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property tenant_name of obj type apiclifsruntime field type str  type string.
   * @return tenantName
   */
  @VsoMethod
  public String getTenantName() {
    return tenantName;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property tenant_name of obj type apiclifsruntime field type str  type string.
   * @param tenantName set the tenantName.
   */
  @VsoMethod
  public void setTenantName(String  tenantName) {
    this.tenantName = tenantName;
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
   * Unique object identifier of transaction.
   * @return transactionUuid
   */
  @VsoMethod
  public List<String> getTransactionUuid() {
    return transactionUuid;
  }

  /**
   * This is the setter method. this will set the transactionUuid
   * Unique object identifier of transaction.
   * @return transactionUuid
   */
  @VsoMethod
  public void setTransactionUuid(List<String>  transactionUuid) {
    this.transactionUuid = transactionUuid;
  }

  /**
   * This is the setter method this will set the transactionUuid
   * Unique object identifier of transaction.
   * @return transactionUuid
   */
  @VsoMethod
  public APICLifsRuntime addTransactionUuidItem(String transactionUuidItem) {
    if (this.transactionUuid == null) {
      this.transactionUuid = new ArrayList<String>();
    }
    this.transactionUuid.add(transactionUuidItem);
    return this;
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

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of vs.
   * @return vsUuid
   */
  @VsoMethod
  public List<String> getVsUuid() {
    return vsUuid;
  }

  /**
   * This is the setter method. this will set the vsUuid
   * Unique object identifier of vs.
   * @return vsUuid
   */
  @VsoMethod
  public void setVsUuid(List<String>  vsUuid) {
    this.vsUuid = vsUuid;
  }

  /**
   * This is the setter method this will set the vsUuid
   * Unique object identifier of vs.
   * @return vsUuid
   */
  @VsoMethod
  public APICLifsRuntime addVsUuidItem(String vsUuidItem) {
    if (this.vsUuid == null) {
      this.vsUuid = new ArrayList<String>();
    }
    this.vsUuid.add(vsUuidItem);
    return this;
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
  APICLifsRuntime objAPICLifsRuntime = (APICLifsRuntime) o;
  return   Objects.equals(this.uuid, objAPICLifsRuntime.uuid)&&
  Objects.equals(this.name, objAPICLifsRuntime.name)&&
  Objects.equals(this.lifLabel, objAPICLifsRuntime.lifLabel)&&
  Objects.equals(this.tenantName, objAPICLifsRuntime.tenantName)&&
  Objects.equals(this.vsUuid, objAPICLifsRuntime.vsUuid)&&
  Objects.equals(this.network, objAPICLifsRuntime.network)&&
  Objects.equals(this.cifs, objAPICLifsRuntime.cifs)&&
  Objects.equals(this.transactionUuid, objAPICLifsRuntime.transactionUuid)&&
  Objects.equals(this.seUuid, objAPICLifsRuntime.seUuid)&&
  Objects.equals(this.subnet, objAPICLifsRuntime.subnet)&&
  Objects.equals(this.autoAllocated, objAPICLifsRuntime.autoAllocated)&&
  Objects.equals(this.multiVrf, objAPICLifsRuntime.multiVrf)&&
  Objects.equals(this.contractGraphs, objAPICLifsRuntime.contractGraphs)&&
  Objects.equals(this.tenantRef, objAPICLifsRuntime.tenantRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class APICLifsRuntime {\n");
      sb.append("    autoAllocated: ").append(toIndentedString(autoAllocated)).append("\n");
        sb.append("    cifs: ").append(toIndentedString(cifs)).append("\n");
        sb.append("    contractGraphs: ").append(toIndentedString(contractGraphs)).append("\n");
        sb.append("    lifLabel: ").append(toIndentedString(lifLabel)).append("\n");
        sb.append("    multiVrf: ").append(toIndentedString(multiVrf)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    network: ").append(toIndentedString(network)).append("\n");
        sb.append("    seUuid: ").append(toIndentedString(seUuid)).append("\n");
        sb.append("    subnet: ").append(toIndentedString(subnet)).append("\n");
        sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
        sb.append("    transactionUuid: ").append(toIndentedString(transactionUuid)).append("\n");
            sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    vsUuid: ").append(toIndentedString(vsUuid)).append("\n");
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

