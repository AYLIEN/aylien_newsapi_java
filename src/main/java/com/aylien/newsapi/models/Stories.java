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
 * Stories
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-09T08:35:56.141Z[Europe/Dublin]")
public class Stories {
  public static final String SERIALIZED_NAME_NEXT_PAGE_CURSOR = "next_page_cursor";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE_CURSOR)
  private String nextPageCursor;

  public static final String SERIALIZED_NAME_STORIES = "stories";
  @SerializedName(SERIALIZED_NAME_STORIES)
  private List<Story> stories = null;


  public Stories nextPageCursor(String nextPageCursor) {
    
    this.nextPageCursor = nextPageCursor;
    return this;
  }

   /**
   * The next page cursor
   * @return nextPageCursor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The next page cursor")

  public String getNextPageCursor() {
    return nextPageCursor;
  }


  public void setNextPageCursor(String nextPageCursor) {
    this.nextPageCursor = nextPageCursor;
  }


  public Stories stories(List<Story> stories) {
    
    this.stories = stories;
    return this;
  }

  public Stories addStoriesItem(Story storiesItem) {
    if (this.stories == null) {
      this.stories = new ArrayList<Story>();
    }
    this.stories.add(storiesItem);
    return this;
  }

   /**
   * An array of stories
   * @return stories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of stories")

  public List<Story> getStories() {
    return stories;
  }


  public void setStories(List<Story> stories) {
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
    Stories stories = (Stories) o;
    return Objects.equals(this.nextPageCursor, stories.nextPageCursor) &&
        Objects.equals(this.stories, stories.stories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageCursor, stories);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Stories {\n");
    sb.append("    nextPageCursor: ").append(toIndentedString(nextPageCursor)).append("\n");
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

