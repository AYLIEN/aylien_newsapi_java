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
import com.aylien.newsapi.models.Trend;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Trends
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-09T08:35:56.141Z[Europe/Dublin]")
public class Trends {
  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private String field;

  public static final String SERIALIZED_NAME_TRENDS = "trends";
  @SerializedName(SERIALIZED_NAME_TRENDS)
  private List<Trend> trends = null;


  public Trends field(String field) {
    
    this.field = field;
    return this;
  }

   /**
   * The field of trends
   * @return field
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The field of trends")

  public String getField() {
    return field;
  }


  public void setField(String field) {
    this.field = field;
  }


  public Trends trends(List<Trend> trends) {
    
    this.trends = trends;
    return this;
  }

  public Trends addTrendsItem(Trend trendsItem) {
    if (this.trends == null) {
      this.trends = new ArrayList<Trend>();
    }
    this.trends.add(trendsItem);
    return this;
  }

   /**
   * An array of trends
   * @return trends
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of trends")

  public List<Trend> getTrends() {
    return trends;
  }


  public void setTrends(List<Trend> trends) {
    this.trends = trends;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Trends trends = (Trends) o;
    return Objects.equals(this.field, trends.field) &&
        Objects.equals(this.trends, trends.trends);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, trends);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Trends {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    trends: ").append(toIndentedString(trends)).append("\n");
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

