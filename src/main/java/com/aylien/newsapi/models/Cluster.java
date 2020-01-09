/*
 * AYLIEN News API
 * The AYLIEN News API is the most powerful way of sourcing, searching and syndicating analyzed and enriched news content. It is accessed by sending HTTP requests to our server, which returns information to your client. 
 *
 * The version of the OpenAPI document: 3.0
 * Contact: support@aylien.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.aylien.newsapi.models;

import java.util.Objects;
import java.util.Arrays;
import com.aylien.newsapi.models.Location;
import com.aylien.newsapi.models.RepresentativeStory;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * Cluster
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-09T08:27:46.745Z[Europe/Dublin]")
public class Cluster {
  public static final String SERIALIZED_NAME_EARLIEST_STORY = "earliest_story";
  @SerializedName(SERIALIZED_NAME_EARLIEST_STORY)
  private OffsetDateTime earliestStory;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_LATEST_STORY = "latest_story";
  @SerializedName(SERIALIZED_NAME_LATEST_STORY)
  private OffsetDateTime latestStory;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private Location location;

  public static final String SERIALIZED_NAME_REPRESENTATIVE_STORY = "representative_story";
  @SerializedName(SERIALIZED_NAME_REPRESENTATIVE_STORY)
  private RepresentativeStory representativeStory;

  public static final String SERIALIZED_NAME_STORY_COUNT = "story_count";
  @SerializedName(SERIALIZED_NAME_STORY_COUNT)
  private Integer storyCount;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private OffsetDateTime time;


  public Cluster earliestStory(OffsetDateTime earliestStory) {
    
    this.earliestStory = earliestStory;
    return this;
  }

   /**
   * Publication date of the earliest story in cluster
   * @return earliestStory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Publication date of the earliest story in cluster")

  public OffsetDateTime getEarliestStory() {
    return earliestStory;
  }


  public void setEarliestStory(OffsetDateTime earliestStory) {
    this.earliestStory = earliestStory;
  }


  public Cluster id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the cluster which is a unique identification
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the cluster which is a unique identification")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public Cluster latestStory(OffsetDateTime latestStory) {
    
    this.latestStory = latestStory;
    return this;
  }

   /**
   * Publication date of the latest story in cluster
   * @return latestStory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Publication date of the latest story in cluster")

  public OffsetDateTime getLatestStory() {
    return latestStory;
  }


  public void setLatestStory(OffsetDateTime latestStory) {
    this.latestStory = latestStory;
  }


  public Cluster location(Location location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Location getLocation() {
    return location;
  }


  public void setLocation(Location location) {
    this.location = location;
  }


  public Cluster representativeStory(RepresentativeStory representativeStory) {
    
    this.representativeStory = representativeStory;
    return this;
  }

   /**
   * Get representativeStory
   * @return representativeStory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RepresentativeStory getRepresentativeStory() {
    return representativeStory;
  }


  public void setRepresentativeStory(RepresentativeStory representativeStory) {
    this.representativeStory = representativeStory;
  }


  public Cluster storyCount(Integer storyCount) {
    
    this.storyCount = storyCount;
    return this;
  }

   /**
   * Number of stories associated with the cluster
   * @return storyCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of stories associated with the cluster")

  public Integer getStoryCount() {
    return storyCount;
  }


  public void setStoryCount(Integer storyCount) {
    this.storyCount = storyCount;
  }


  public Cluster time(OffsetDateTime time) {
    
    this.time = time;
    return this;
  }

   /**
   * Time of the event
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time of the event")

  public OffsetDateTime getTime() {
    return time;
  }


  public void setTime(OffsetDateTime time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cluster cluster = (Cluster) o;
    return Objects.equals(this.earliestStory, cluster.earliestStory) &&
        Objects.equals(this.id, cluster.id) &&
        Objects.equals(this.latestStory, cluster.latestStory) &&
        Objects.equals(this.location, cluster.location) &&
        Objects.equals(this.representativeStory, cluster.representativeStory) &&
        Objects.equals(this.storyCount, cluster.storyCount) &&
        Objects.equals(this.time, cluster.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(earliestStory, id, latestStory, location, representativeStory, storyCount, time);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cluster {\n");
    sb.append("    earliestStory: ").append(toIndentedString(earliestStory)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    latestStory: ").append(toIndentedString(latestStory)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    representativeStory: ").append(toIndentedString(representativeStory)).append("\n");
    sb.append("    storyCount: ").append(toIndentedString(storyCount)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

