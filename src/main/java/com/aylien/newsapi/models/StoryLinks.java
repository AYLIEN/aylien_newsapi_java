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

/**
 * StoryLinks
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-09T08:35:56.141Z[Europe/Dublin]")
public class StoryLinks {
  public static final String SERIALIZED_NAME_CANONICAL = "canonical";
  @SerializedName(SERIALIZED_NAME_CANONICAL)
  private String canonical;

  public static final String SERIALIZED_NAME_COVERAGES = "coverages";
  @SerializedName(SERIALIZED_NAME_COVERAGES)
  private String coverages;

  public static final String SERIALIZED_NAME_PERMALINK = "permalink";
  @SerializedName(SERIALIZED_NAME_PERMALINK)
  private String permalink;

  public static final String SERIALIZED_NAME_RELATED_STORIES = "related_stories";
  @SerializedName(SERIALIZED_NAME_RELATED_STORIES)
  private String relatedStories;


  public StoryLinks canonical(String canonical) {
    
    this.canonical = canonical;
    return this;
  }

   /**
   * The story canonical URL
   * @return canonical
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The story canonical URL")

  public String getCanonical() {
    return canonical;
  }


  public void setCanonical(String canonical) {
    this.canonical = canonical;
  }


  public StoryLinks coverages(String coverages) {
    
    this.coverages = coverages;
    return this;
  }

   /**
   * The coverages URL
   * @return coverages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The coverages URL")

  public String getCoverages() {
    return coverages;
  }


  public void setCoverages(String coverages) {
    this.coverages = coverages;
  }


  public StoryLinks permalink(String permalink) {
    
    this.permalink = permalink;
    return this;
  }

   /**
   * The story permalink URL
   * @return permalink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The story permalink URL")

  public String getPermalink() {
    return permalink;
  }


  public void setPermalink(String permalink) {
    this.permalink = permalink;
  }


  public StoryLinks relatedStories(String relatedStories) {
    
    this.relatedStories = relatedStories;
    return this;
  }

   /**
   * The related stories URL
   * @return relatedStories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The related stories URL")

  public String getRelatedStories() {
    return relatedStories;
  }


  public void setRelatedStories(String relatedStories) {
    this.relatedStories = relatedStories;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoryLinks storyLinks = (StoryLinks) o;
    return Objects.equals(this.canonical, storyLinks.canonical) &&
        Objects.equals(this.coverages, storyLinks.coverages) &&
        Objects.equals(this.permalink, storyLinks.permalink) &&
        Objects.equals(this.relatedStories, storyLinks.relatedStories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canonical, coverages, permalink, relatedStories);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoryLinks {\n");
    sb.append("    canonical: ").append(toIndentedString(canonical)).append("\n");
    sb.append("    coverages: ").append(toIndentedString(coverages)).append("\n");
    sb.append("    permalink: ").append(toIndentedString(permalink)).append("\n");
    sb.append("    relatedStories: ").append(toIndentedString(relatedStories)).append("\n");
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

