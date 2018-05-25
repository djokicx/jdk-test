package com.saferize.client.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * App
 */
public class App {
@SerializedName("id")
  private Long id = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("platforms")
  private List<String> platforms = null;
  
    /**
   * One of the predefined values indicating the category of the app.
   */
  @JsonAdapter(CategoryEnum.Adapter.class)
  public enum CategoryEnum {
    
    GAME("GAME"),
    MEDIA("MEDIA");

    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }
    
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    
    public static CategoryEnum fromValue(String text) {
      for (CategoryEnum b : CategoryEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    
    public static class Adapter extends TypeAdapter<CategoryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CategoryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CategoryEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CategoryEnum.fromValue(String.valueOf(value));
      }
    }
  }
  
  @SerializedName("category")
  private CategoryEnum category = null;
  
    /**
   * On/off flag for enabling/disabling time restrictions on the app.
   */
  @JsonAdapter(TimeRestrictionEnum.Adapter.class)
  public enum TimeRestrictionEnum {
    
    ENABLED("ENABLED"),
    DISABLED("DISABLED");

    private String value;

    TimeRestrictionEnum(String value) {
      this.value = value;
    }
    
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    
    public static TimeRestrictionEnum fromValue(String text) {
      for (TimeRestrictionEnum b : TimeRestrictionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    
    public static class Adapter extends TypeAdapter<TimeRestrictionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TimeRestrictionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TimeRestrictionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TimeRestrictionEnum.fromValue(String.valueOf(value));
      }
    }
  }
  
  @SerializedName("timeRestriction")
  private TimeRestrictionEnum timeRestriction = null;
  
    /**
   * Current lifecycle status of the app. Please read more on the requirements for [publishing the app](#changestatus).
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    
    DRAFT("DRAFT"),
    PUBLISHED("PUBLISHED"),
    DELETED("DELETED");

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
  @SerializedName("description")
  private String description = null;
  @SerializedName("shortDescription")
  private String shortDescription = null;
  @SerializedName("urlName")
  private String urlName = null;
  @SerializedName("age")
  private Long age = null;
  @SerializedName("email")
  private String email = null;
  
  public App id(Long id) {
    this.id = id;
    return this;
  }

  
  /**
  * Unique identifier for the app returned by the system.
  * @return id
  **/
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  
  public App name(String name) {
    this.name = name;
    return this;
  }

  
  /**
  * Name of the app.
  * @return name
  **/
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  
  public App platforms(List<String> platforms) {
    this.platforms = platforms;
    return this;
  }

  public App addPlatformsItem(String platformsItem) {
    
    if (this.platforms == null) {
      this.platforms = new ArrayList<String>();
    }
    
    this.platforms.add(platformsItem);
    return this;
  }
  
  /**
  * Array of enums that specify what platforms are supported by this app.
  * @return platforms
  **/
  public List<String> getPlatforms() {
    return platforms;
  }
  public void setPlatforms(List<String> platforms) {
    this.platforms = platforms;
  }
  
  public App category(CategoryEnum category) {
    this.category = category;
    return this;
  }

  
  /**
  * One of the predefined values indicating the category of the app.
  * @return category
  **/
  public CategoryEnum getCategory() {
    return category;
  }
  public void setCategory(CategoryEnum category) {
    this.category = category;
  }
  
  public App timeRestriction(TimeRestrictionEnum timeRestriction) {
    this.timeRestriction = timeRestriction;
    return this;
  }

  
  /**
  * On/off flag for enabling/disabling time restrictions on the app.
  * @return timeRestriction
  **/
  public TimeRestrictionEnum getTimeRestriction() {
    return timeRestriction;
  }
  public void setTimeRestriction(TimeRestrictionEnum timeRestriction) {
    this.timeRestriction = timeRestriction;
  }
  
  public App status(StatusEnum status) {
    this.status = status;
    return this;
  }

  
  /**
  * Current lifecycle status of the app. Please read more on the requirements for [publishing the app](#changestatus).
  * @return status
  **/
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }
  
  public App description(String description) {
    this.description = description;
    return this;
  }

  
  /**
  * Description of the app. (max. number of characters &#x3D; 255)
  * @return description
  **/
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  
  public App shortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

  
  /**
  * Short description of the app. (max. number of characters &#x3D; 100)
  * @return shortDescription
  **/
  public String getShortDescription() {
    return shortDescription;
  }
  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }
  
  public App urlName(String urlName) {
    this.urlName = urlName;
    return this;
  }

  
  /**
  * Partial url name of this app on Saferize.
  * @return urlName
  **/
  public String getUrlName() {
    return urlName;
  }
  public void setUrlName(String urlName) {
    this.urlName = urlName;
  }
  
  public App age(Long age) {
    this.age = age;
    return this;
  }

  
  /**
  * Minimum recommended age of app users.
  * @return age
  **/
  public Long getAge() {
    return age;
  }
  public void setAge(Long age) {
    this.age = age;
  }
  
  public App email(String email) {
    this.email = email;
    return this;
  }

  
  /**
  * App developer's email.
  * @return email
  **/
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    App app = (App) o;
    return Objects.equals(this.id, app.id) &&
        Objects.equals(this.name, app.name) &&
        Objects.equals(this.platforms, app.platforms) &&
        Objects.equals(this.category, app.category) &&
        Objects.equals(this.timeRestriction, app.timeRestriction) &&
        Objects.equals(this.status, app.status) &&
        Objects.equals(this.description, app.description) &&
        Objects.equals(this.shortDescription, app.shortDescription) &&
        Objects.equals(this.urlName, app.urlName) &&
        Objects.equals(this.age, app.age) &&
        Objects.equals(this.email, app.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, platforms, category, timeRestriction, status, description, shortDescription, urlName, age, email);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class App {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    platforms: ").append(toIndentedString(platforms)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    timeRestriction: ").append(toIndentedString(timeRestriction)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    urlName: ").append(toIndentedString(urlName)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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



