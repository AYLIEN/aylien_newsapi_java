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
 * TimeSeries
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-10-29T11:45:55.349Z[Europe/Dublin]")
public class TimeSeries {
  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_PUBLISHED_AT = "published_at";
  @SerializedName(SERIALIZED_NAME_PUBLISHED_AT)
  private OffsetDateTime publishedAt;


  public TimeSeries count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * The count of time series bin
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The count of time series bin")

  public Integer getCount() {
    return count;
  }



  public void setCount(Integer count) {
    this.count = count;
  }


  public TimeSeries publishedAt(OffsetDateTime publishedAt) {
    
    this.publishedAt = publishedAt;
    return this;
  }

   /**
   * The published date of the time series bin
   * @return publishedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The published date of the time series bin")

  public OffsetDateTime getPublishedAt() {
    return publishedAt;
  }



  public void setPublishedAt(OffsetDateTime publishedAt) {
    this.publishedAt = publishedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeSeries timeSeries = (TimeSeries) o;
    return Objects.equals(this.count, timeSeries.count) &&
        Objects.equals(this.publishedAt, timeSeries.publishedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, publishedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeSeries {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
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

