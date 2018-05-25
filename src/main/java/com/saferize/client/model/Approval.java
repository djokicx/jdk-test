package com.saferize.client.model;

import java.io.IOException;
import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Approval
 */
public class Approval {
@SerializedName("id")
  private Long id = null;
  @SerializedName("appUser")
  private AppUser appUser = null;
  
    /**
   * The approval status.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    
    PENDING("PENDING"),
    NOTIFIED("NOTIFIED"),
    APPROVED("APPROVED"),
    REJECTED("REJECTED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }
  
  @SerializedName("status")
  private StatusEnum status = null;
  @SerializedName("parentEmail")
  private String parentEmail = null;
  @SerializedName("parentMobilePhone")
  private String parentMobilePhone = null;
  
    /**
   * Current state of the approval.
   */
  @JsonAdapter(CurrentStateEnum.Adapter.class)
  public enum CurrentStateEnum {
    
    ACTIVE("ACTIVE"),
    PAUSED("PAUSED");

    private String value;

    CurrentStateEnum(String value) {
      this.value = value;
    }
    
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    
    public static CurrentStateEnum fromValue(String text) {
      for (CurrentStateEnum b : CurrentStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    
    public static class Adapter extends TypeAdapter<CurrentStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CurrentStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CurrentStateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CurrentStateEnum.fromValue(String.valueOf(value));
      }
    }
  }
  
  @SerializedName("currentState")
  private CurrentStateEnum currentState = null;
  
  public Approval id(Long id) {
    this.id = id;
    return this;
  }

  
  /**
  * Unique identifier for the approval returned by the system.
  * @return id
  **/
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  
  public Approval appUser(AppUser appUser) {
    this.appUser = appUser;
    return this;
  }

  
  /**
  * Get appUser
  * @return appUser
  **/
  public AppUser getAppUser() {
    return appUser;
  }
  public void setAppUser(AppUser appUser) {
    this.appUser = appUser;
  }
  
  public Approval status(StatusEnum status) {
    this.status = status;
    return this;
  }

  
  /**
  * The approval status.
  * @return status
  **/
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }
  
  public Approval parentEmail(String parentEmail) {
    this.parentEmail = parentEmail;
    return this;
  }

  
  /**
  * Email of the parent who received this request.
  * @return parentEmail
  **/
  public String getParentEmail() {
    return parentEmail;
  }
  public void setParentEmail(String parentEmail) {
    this.parentEmail = parentEmail;
  }
  
  public Approval parentMobilePhone(String parentMobilePhone) {
    this.parentMobilePhone = parentMobilePhone;
    return this;
  }

  
  /**
  * Phone number of the parent who received this request. The format should be XXXYYYZZZZ (no dashes or parentheses).
  * @return parentMobilePhone
  **/
  public String getParentMobilePhone() {
    return parentMobilePhone;
  }
  public void setParentMobilePhone(String parentMobilePhone) {
    this.parentMobilePhone = parentMobilePhone;
  }
  
  public Approval currentState(CurrentStateEnum currentState) {
    this.currentState = currentState;
    return this;
  }

  
  /**
  * Current state of the approval.
  * @return currentState
  **/
  public CurrentStateEnum getCurrentState() {
    return currentState;
  }
  public void setCurrentState(CurrentStateEnum currentState) {
    this.currentState = currentState;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Approval approval = (Approval) o;
    return Objects.equals(this.id, approval.id) &&
        Objects.equals(this.appUser, approval.appUser) &&
        Objects.equals(this.status, approval.status) &&
        Objects.equals(this.parentEmail, approval.parentEmail) &&
        Objects.equals(this.parentMobilePhone, approval.parentMobilePhone) &&
        Objects.equals(this.currentState, approval.currentState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, appUser, status, parentEmail, parentMobilePhone, currentState);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Approval {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    appUser: ").append(toIndentedString(appUser)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    parentEmail: ").append(toIndentedString(parentEmail)).append("\n");
    sb.append("    parentMobilePhone: ").append(toIndentedString(parentMobilePhone)).append("\n");
    sb.append("    currentState: ").append(toIndentedString(currentState)).append("\n");
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



