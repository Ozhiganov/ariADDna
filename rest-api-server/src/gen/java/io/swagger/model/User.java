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
import io.swagger.model.CloudSet;
import io.swagger.model.Credential;

/**
 * User of service.
 */
@ApiModel(description = "User of service.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-12-26T14:00:48.377Z")
public class User   {
  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("userCredential")
  private Credential userCredential = null;

  @JsonProperty("nickname")
  private String nickname = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("externalClouds")
  private CloudSet externalClouds = null;

  public User uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * UUID of a user at arriADDna server.
   * @return uuid
  **/
  @ApiModelProperty(value = "UUID of a user at arriADDna server.")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public User userCredential(Credential userCredential) {
    this.userCredential = userCredential;
    return this;
  }

   /**
   * User's credential.
   * @return userCredential
  **/
  @ApiModelProperty(value = "User's credential.")
  public Credential getUserCredential() {
    return userCredential;
  }

  public void setUserCredential(Credential userCredential) {
    this.userCredential = userCredential;
  }

  public User nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

   /**
   * User's nickname.
   * @return nickname
  **/
  @ApiModelProperty(value = "User's nickname.")
  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

   /**
   * User's e-mail.
   * @return email
  **/
  @ApiModelProperty(value = "User's e-mail.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User externalClouds(CloudSet externalClouds) {
    this.externalClouds = externalClouds;
    return this;
  }

   /**
   * The set of external cloud accounts that user has at ariADDna server.
   * @return externalClouds
  **/
  @ApiModelProperty(value = "The set of external cloud accounts that user has at ariADDna server.")
  public CloudSet getExternalClouds() {
    return externalClouds;
  }

  public void setExternalClouds(CloudSet externalClouds) {
    this.externalClouds = externalClouds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.uuid, user.uuid) &&
        Objects.equals(this.userCredential, user.userCredential) &&
        Objects.equals(this.nickname, user.nickname) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.externalClouds, user.externalClouds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, userCredential, nickname, email, externalClouds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    userCredential: ").append(toIndentedString(userCredential)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    externalClouds: ").append(toIndentedString(externalClouds)).append("\n");
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
