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
import com.aylien.newsapi.models.Entity;
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
 * Entities
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-09T08:35:56.141Z[Europe/Dublin]")
public class Entities {
  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private List<Entity> body = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private List<Entity> title = null;


  public Entities body(List<Entity> body) {
    
    this.body = body;
    return this;
  }

  public Entities addBodyItem(Entity bodyItem) {
    if (this.body == null) {
      this.body = new ArrayList<Entity>();
    }
    this.body.add(bodyItem);
    return this;
  }

   /**
   * An array of extracted entities from the story body
   * @return body
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of extracted entities from the story body")

  public List<Entity> getBody() {
    return body;
  }


  public void setBody(List<Entity> body) {
    this.body = body;
  }


  public Entities title(List<Entity> title) {
    
    this.title = title;
    return this;
  }

  public Entities addTitleItem(Entity titleItem) {
    if (this.title == null) {
      this.title = new ArrayList<Entity>();
    }
    this.title.add(titleItem);
    return this;
  }

   /**
   * An array of extracted entities from the story title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of extracted entities from the story title")

  public List<Entity> getTitle() {
    return title;
  }


  public void setTitle(List<Entity> title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Entities entities = (Entities) o;
    return Objects.equals(this.body, entities.body) &&
        Objects.equals(this.title, entities.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, title);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Entities {\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

