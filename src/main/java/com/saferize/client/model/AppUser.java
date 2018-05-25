package com.saferize.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * AppUser
 */
public class AppUser {
@SerializedName("id")
  private Long id = null;
  @SerializedName("token")
  private String token = null;
  @SerializedName("app")
  private App app = null;
  
  public AppUser id(Long id) {
    this.id = id;
    return this;
  }

  
  /**
  * Unique identifier for the app user returned by the system.
  * @return id
  **/
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  
  public AppUser token(String token) {
    this.token = token;
    return this;
  }

  
  /**
  * App user's token (username on the app). This is defined by the app and should be user-unique.
  * @return token
  **/
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }
  
  public AppUser app(App app) {
    this.app = app;
    return this;
  }

  public App getApp() {
    return app;
  }
  public void setApp(App app) {
    this.app = app;
  }
    
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppUser appUser = (AppUser) o;
    return Objects.equals(this.id, appUser.id) &&
        Objects.equals(this.token, appUser.token) &&
        Objects.equals(this.app, appUser.app);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, token, app);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppUser {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
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



