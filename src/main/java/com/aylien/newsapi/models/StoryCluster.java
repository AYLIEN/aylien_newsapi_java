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
import java.util.ArrayList;
import java.util.List;

/**
 * StoryCluster
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-10-29T11:45:55.349Z[Europe/Dublin]")
public class StoryCluster {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_PHRASES = "phrases";
  @SerializedName(SERIALIZED_NAME_PHRASES)
  private List<String> phrases = null;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Double score;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public static final String SERIALIZED_NAME_STORIES = "stories";
  @SerializedName(SERIALIZED_NAME_STORIES)
  private List<Long> stories = null;


  public StoryCluster id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * A unique identification for the cluster
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique identification for the cluster")

  public Integer getId() {
    return id;
  }



  public void setId(Integer id) {
    this.id = id;
  }


  public StoryCluster phrases(List<String> phrases) {
    
    this.phrases = phrases;
    return this;
  }

  public StoryCluster addPhrasesItem(String phrasesItem) {
    if (this.phrases == null) {
      this.phrases = new ArrayList<String>();
    }
    this.phrases.add(phrasesItem);
    return this;
  }

   /**
   * Suggested labels for the cluster
   * @return phrases
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Suggested labels for the cluster")

  public List<String> getPhrases() {
    return phrases;
  }



  public void setPhrases(List<String> phrases) {
    this.phrases = phrases;
  }


  public StoryCluster score(Double score) {
    
    this.score = score;
    return this;
  }

   /**
   * The cluster score
   * @return score
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The cluster score")

  public Double getScore() {
    return score;
  }



  public void setScore(Double score) {
    this.score = score;
  }


  public StoryCluster size(Integer size) {
    
    this.size = size;
    return this;
  }

   /**
   * Size of the cluster
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Size of the cluster")

  public Integer getSize() {
    return size;
  }



  public void setSize(Integer size) {
    this.size = size;
  }


  public StoryCluster stories(List<Long> stories) {
    
    this.stories = stories;
    return this;
  }

  public StoryCluster addStoriesItem(Long storiesItem) {
    if (this.stories == null) {
      this.stories = new ArrayList<Long>();
    }
    this.stories.add(storiesItem);
    return this;
  }

   /**
   * Story ids which are in the cluster
   * @return stories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Story ids which are in the cluster")

  public List<Long> getStories() {
    return stories;
  }



  public void setStories(List<Long> stories) {
    this.stories = stories;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoryCluster storyCluster = (StoryCluster) o;
    return Objects.equals(this.id, storyCluster.id) &&
        Objects.equals(this.phrases, storyCluster.phrases) &&
        Objects.equals(this.score, storyCluster.score) &&
        Objects.equals(this.size, storyCluster.size) &&
        Objects.equals(this.stories, storyCluster.stories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, phrases, score, size, stories);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoryCluster {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    phrases: ").append(toIndentedString(phrases)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    stories: ").append(toIndentedString(stories)).append("\n");
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

