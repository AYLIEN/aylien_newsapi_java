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
import com.aylien.newsapi.models.ShareCount;
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
 * ShareCounts
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-09T08:35:56.141Z[Europe/Dublin]")
public class ShareCounts {
  public static final String SERIALIZED_NAME_FACEBOOK = "facebook";
  @SerializedName(SERIALIZED_NAME_FACEBOOK)
  private List<ShareCount> facebook = null;

  public static final String SERIALIZED_NAME_GOOGLE_PLUS = "google_plus";
  @SerializedName(SERIALIZED_NAME_GOOGLE_PLUS)
  private List<ShareCount> googlePlus = null;

  public static final String SERIALIZED_NAME_LINKEDIN = "linkedin";
  @SerializedName(SERIALIZED_NAME_LINKEDIN)
  private List<ShareCount> linkedin = null;

  public static final String SERIALIZED_NAME_REDDIT = "reddit";
  @SerializedName(SERIALIZED_NAME_REDDIT)
  private List<ShareCount> reddit = null;


  public ShareCounts facebook(List<ShareCount> facebook) {
    
    this.facebook = facebook;
    return this;
  }

  public ShareCounts addFacebookItem(ShareCount facebookItem) {
    if (this.facebook == null) {
      this.facebook = new ArrayList<ShareCount>();
    }
    this.facebook.add(facebookItem);
    return this;
  }

   /**
   * Facebook shares count
   * @return facebook
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Facebook shares count")

  public List<ShareCount> getFacebook() {
    return facebook;
  }


  public void setFacebook(List<ShareCount> facebook) {
    this.facebook = facebook;
  }


  public ShareCounts googlePlus(List<ShareCount> googlePlus) {
    
    this.googlePlus = googlePlus;
    return this;
  }

  public ShareCounts addGooglePlusItem(ShareCount googlePlusItem) {
    if (this.googlePlus == null) {
      this.googlePlus = new ArrayList<ShareCount>();
    }
    this.googlePlus.add(googlePlusItem);
    return this;
  }

   /**
   * Google Plus shares count
   * @return googlePlus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Google Plus shares count")

  public List<ShareCount> getGooglePlus() {
    return googlePlus;
  }


  public void setGooglePlus(List<ShareCount> googlePlus) {
    this.googlePlus = googlePlus;
  }


  public ShareCounts linkedin(List<ShareCount> linkedin) {
    
    this.linkedin = linkedin;
    return this;
  }

  public ShareCounts addLinkedinItem(ShareCount linkedinItem) {
    if (this.linkedin == null) {
      this.linkedin = new ArrayList<ShareCount>();
    }
    this.linkedin.add(linkedinItem);
    return this;
  }

   /**
   * LinkedIn shares count
   * @return linkedin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "LinkedIn shares count")

  public List<ShareCount> getLinkedin() {
    return linkedin;
  }


  public void setLinkedin(List<ShareCount> linkedin) {
    this.linkedin = linkedin;
  }


  public ShareCounts reddit(List<ShareCount> reddit) {
    
    this.reddit = reddit;
    return this;
  }

  public ShareCounts addRedditItem(ShareCount redditItem) {
    if (this.reddit == null) {
      this.reddit = new ArrayList<ShareCount>();
    }
    this.reddit.add(redditItem);
    return this;
  }

   /**
   * Reddit shares count
   * @return reddit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reddit shares count")

  public List<ShareCount> getReddit() {
    return reddit;
  }


  public void setReddit(List<ShareCount> reddit) {
    this.reddit = reddit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShareCounts shareCounts = (ShareCounts) o;
    return Objects.equals(this.facebook, shareCounts.facebook) &&
        Objects.equals(this.googlePlus, shareCounts.googlePlus) &&
        Objects.equals(this.linkedin, shareCounts.linkedin) &&
        Objects.equals(this.reddit, shareCounts.reddit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(facebook, googlePlus, linkedin, reddit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShareCounts {\n");
    sb.append("    facebook: ").append(toIndentedString(facebook)).append("\n");
    sb.append("    googlePlus: ").append(toIndentedString(googlePlus)).append("\n");
    sb.append("    linkedin: ").append(toIndentedString(linkedin)).append("\n");
    sb.append("    reddit: ").append(toIndentedString(reddit)).append("\n");
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

