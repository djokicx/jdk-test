package com.saferize.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * AppUsageSession
 */
public class AppUsageSession {
@SerializedName("id")
  private Long id = null;
  @SerializedName("approval")
  private Approval approval = null;
  @SerializedName("hostname")
  private String hostname = null;
  
  public AppUsageSession id(Long id) {
    this.id = id;
    return this;
  }

  
  /**
  * Unique identifier for the app usage session returned by the system.
  * @return id
  **/
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  
  public AppUsageSession approval(Approval approval) {
    this.approval = approval;
    return this;
  }

  
  /**
  * Get approval
  * @return approval
  **/
  public Approval getApproval() {
    return approval;
  }
  public void setApproval(Approval approval) {
    this.approval = approval;
  }
  
  public AppUsageSession hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

  
  /**
  * IP address where the request to create an app usage session originated from.
  * @return hostname
  **/
  public String getHostname() {
    return hostname;
  }
  public void setHostname(String hostname) {
    this.hostname = hostname;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppUsageSession appUsageSession = (AppUsageSession) o;
    return Objects.equals(this.id, appUsageSession.id) &&
        Objects.equals(this.approval, appUsageSession.approval) &&
        Objects.equals(this.hostname, appUsageSession.hostname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, approval, hostname);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppUsageSession {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    approval: ").append(toIndentedString(approval)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
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



