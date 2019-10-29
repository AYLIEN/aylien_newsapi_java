/*
 * AYLIEN News API
 * The AYLIEN News API is the most powerful way of sourcing, searching and syndicating analyzed and enriched news content. It is accessed by sending HTTP requests to our server, which returns information to your client. 
 *
 * The version of the OpenAPI document: 2.0
 * Contact: support@aylien.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.aylien.newsapi.models;

import java.util.Objects;
import java.util.Arrays;
import com.aylien.newsapi.models.Story;
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
 * RelatedStories
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-10-25T10:53:07.475+01:00[Europe/Dublin]")
public class RelatedStories {
  public static final String SERIALIZED_NAME_RELATED_STORIES = "related_stories";
  @SerializedName(SERIALIZED_NAME_RELATED_STORIES)
  private List<Story> relatedStories = null;

  public static final String SERIALIZED_NAME_STORY_BODY = "story_body";
  @SerializedName(SERIALIZED_NAME_STORY_BODY)
  private String storyBody;

  public static final String SERIALIZED_NAME_STORY_LANGUAGE = "story_language";
  @SerializedName(SERIALIZED_NAME_STORY_LANGUAGE)
  private String storyLanguage;

  public static final String SERIALIZED_NAME_STORY_TITLE = "story_title";
  @SerializedName(SERIALIZED_NAME_STORY_TITLE)
  private String storyTitle;


  public RelatedStories relatedStories(List<Story> relatedStories) {
    
    this.relatedStories = relatedStories;
    return this;
  }

  public RelatedStories addRelatedStoriesItem(Story relatedStoriesItem) {
    if (this.relatedStories == null) {
      this.relatedStories = new ArrayList<Story>();
    }
    this.relatedStories.add(relatedStoriesItem);
    return this;
  }

   /**
   * An array of related stories for the input story
   * @return relatedStories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of related stories for the input story")

  public List<Story> getRelatedStories() {
    return relatedStories;
  }



  public void setRelatedStories(List<Story> relatedStories) {
    this.relatedStories = relatedStories;
  }


  public RelatedStories storyBody(String storyBody) {
    
    this.storyBody = storyBody;
    return this;
  }

   /**
   * The input story body
   * @return storyBody
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The input story body")

  public String getStoryBody() {
    return storyBody;
  }



  public void setStoryBody(String storyBody) {
    this.storyBody = storyBody;
  }


  public RelatedStories storyLanguage(String storyLanguage) {
    
    this.storyLanguage = storyLanguage;
    return this;
  }

   /**
   * The input story language
   * @return storyLanguage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The input story language")

  public String getStoryLanguage() {
    return storyLanguage;
  }



  public void setStoryLanguage(String storyLanguage) {
    this.storyLanguage = storyLanguage;
  }


  public RelatedStories storyTitle(String storyTitle) {
    
    this.storyTitle = storyTitle;
    return this;
  }

   /**
   * The input story title
   * @return storyTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The input story title")

  public String getStoryTitle() {
    return storyTitle;
  }



  public void setStoryTitle(String storyTitle) {
    this.storyTitle = storyTitle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedStories relatedStories = (RelatedStories) o;
    return Objects.equals(this.relatedStories, relatedStories.relatedStories) &&
        Objects.equals(this.storyBody, relatedStories.storyBody) &&
        Objects.equals(this.storyLanguage, relatedStories.storyLanguage) &&
        Objects.equals(this.storyTitle, relatedStories.storyTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relatedStories, storyBody, storyLanguage, storyTitle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedStories {\n");
    sb.append("    relatedStories: ").append(toIndentedString(relatedStories)).append("\n");
    sb.append("    storyBody: ").append(toIndentedString(storyBody)).append("\n");
    sb.append("    storyLanguage: ").append(toIndentedString(storyLanguage)).append("\n");
    sb.append("    storyTitle: ").append(toIndentedString(storyTitle)).append("\n");
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

