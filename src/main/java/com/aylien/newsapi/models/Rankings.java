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
import com.aylien.newsapi.models.Rank;
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
 * Rankings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-09T08:35:56.141Z[Europe/Dublin]")
public class Rankings {
  public static final String SERIALIZED_NAME_ALEXA = "alexa";
  @SerializedName(SERIALIZED_NAME_ALEXA)
  private List<Rank> alexa = null;


  public Rankings alexa(List<Rank> alexa) {
    
    this.alexa = alexa;
    return this;
  }

  public Rankings addAlexaItem(Rank alexaItem) {
    if (this.alexa == null) {
      this.alexa = new ArrayList<Rank>();
    }
    this.alexa.add(alexaItem);
    return this;
  }

   /**
   * Get alexa
   * @return alexa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Rank> getAlexa() {
    return alexa;
  }


  public void setAlexa(List<Rank> alexa) {
    this.alexa = alexa;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rankings rankings = (Rankings) o;
    return Objects.equals(this.alexa, rankings.alexa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alexa);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rankings {\n");
    sb.append("    alexa: ").append(toIndentedString(alexa)).append("\n");
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

