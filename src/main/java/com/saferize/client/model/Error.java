package com.saferize.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;


/**
 * Saferize uses conventional HTTP response codes to indicate the success or failure of an API request. In general: Codes in the &#x60;2xx&#x60; range indicate success. Codes in the &#x60;4xx&#x60; range indicate an error that failed given the information provided (e.g., a required parameter was omitted, a charge failed, etc.). Codes in the &#x60;5xx&#x60; range indicate an error with Saferize's servers (these are rare).*/ 
public class Error {
@SerializedName("message")
  private String message = null;
  @SerializedName("type")
  private String type = null;
  
  public Error message(String message) {
    this.message = message;
    return this;
  }

  
  /**
  * A human-readable message providing more details about the error.
  * @return message
  **/
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }
  
  public Error type(String type) {
    this.type = type;
    return this;
  }

  
  /**
  * Error type.
  * @return type
  **/
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.message, error.message) &&
        Objects.equals(this.type, error.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, type);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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



