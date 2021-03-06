/*
 * ariADDna API
 * #### This document contains the API description for ariADDna project. Using this API one can manage all available cloud services (DropBox, GDrive, Yandex.Disk etc.) from single point. 
 *
 * OpenAPI spec version: 1.0
 * Contact: ariaddna.support@stnetix.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AllocationModel;
import io.swagger.model.PartLocation;
import io.swagger.model.Property;
import io.swagger.model.VirtualFile;
import java.util.ArrayList;
import java.util.List;

/**
 * Describes virtual file in VUFS.
 */
@ApiModel(description = "Describes virtual file in VUFS.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-12-26T14:00:48.377Z")
public class VirtualFile   {
  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("file-properties")
  private List<Property> fileProperties = new ArrayList<Property>();

  @JsonProperty("file-parts")
  private List<PartLocation> fileParts = new ArrayList<PartLocation>();

  @JsonProperty("VirtualChildSet")
  private List<VirtualFile> virtualChildSet = new ArrayList<VirtualFile>();

  @JsonProperty("allocateModel")
  private AllocationModel allocateModel = null;

  public VirtualFile uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Virtual file UUID.
   * @return uuid
  **/
  @ApiModelProperty(value = "Virtual file UUID.")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public VirtualFile fileProperties(List<Property> fileProperties) {
    this.fileProperties = fileProperties;
    return this;
  }

  public VirtualFile addFilePropertiesItem(Property filePropertiesItem) {
    this.fileProperties.add(filePropertiesItem);
    return this;
  }

   /**
   * Get fileProperties
   * @return fileProperties
  **/
  @ApiModelProperty(value = "")
  public List<Property> getFileProperties() {
    return fileProperties;
  }

  public void setFileProperties(List<Property> fileProperties) {
    this.fileProperties = fileProperties;
  }

  public VirtualFile fileParts(List<PartLocation> fileParts) {
    this.fileParts = fileParts;
    return this;
  }

  public VirtualFile addFilePartsItem(PartLocation filePartsItem) {
    this.fileParts.add(filePartsItem);
    return this;
  }

   /**
   * Get fileParts
   * @return fileParts
  **/
  @ApiModelProperty(value = "")
  public List<PartLocation> getFileParts() {
    return fileParts;
  }

  public void setFileParts(List<PartLocation> fileParts) {
    this.fileParts = fileParts;
  }

  public VirtualFile virtualChildSet(List<VirtualFile> virtualChildSet) {
    this.virtualChildSet = virtualChildSet;
    return this;
  }

  public VirtualFile addVirtualChildSetItem(VirtualFile virtualChildSetItem) {
    this.virtualChildSet.add(virtualChildSetItem);
    return this;
  }

   /**
   * Get virtualChildSet
   * @return virtualChildSet
  **/
  @ApiModelProperty(value = "")
  public List<VirtualFile> getVirtualChildSet() {
    return virtualChildSet;
  }

  public void setVirtualChildSet(List<VirtualFile> virtualChildSet) {
    this.virtualChildSet = virtualChildSet;
  }

  public VirtualFile allocateModel(AllocationModel allocateModel) {
    this.allocateModel = allocateModel;
    return this;
  }

   /**
   * Get allocateModel
   * @return allocateModel
  **/
  @ApiModelProperty(value = "")
  public AllocationModel getAllocateModel() {
    return allocateModel;
  }

  public void setAllocateModel(AllocationModel allocateModel) {
    this.allocateModel = allocateModel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualFile virtualFile = (VirtualFile) o;
    return Objects.equals(this.uuid, virtualFile.uuid) &&
        Objects.equals(this.fileProperties, virtualFile.fileProperties) &&
        Objects.equals(this.fileParts, virtualFile.fileParts) &&
        Objects.equals(this.virtualChildSet, virtualFile.virtualChildSet) &&
        Objects.equals(this.allocateModel, virtualFile.allocateModel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, fileProperties, fileParts, virtualChildSet, allocateModel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualFile {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    fileProperties: ").append(toIndentedString(fileProperties)).append("\n");
    sb.append("    fileParts: ").append(toIndentedString(fileParts)).append("\n");
    sb.append("    virtualChildSet: ").append(toIndentedString(virtualChildSet)).append("\n");
    sb.append("    allocateModel: ").append(toIndentedString(allocateModel)).append("\n");
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

