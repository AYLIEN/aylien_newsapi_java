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
import com.aylien.newsapi.models.Rankings;
import com.aylien.newsapi.models.Scope;
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
 * Source
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-09T08:35:56.141Z[Europe/Dublin]")
public class Source {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public static final String SERIALIZED_NAME_HOME_PAGE_URL = "home_page_url";
  @SerializedName(SERIALIZED_NAME_HOME_PAGE_URL)
  private String homePageUrl;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_LINKS_IN_COUNT = "links_in_count";
  @SerializedName(SERIALIZED_NAME_LINKS_IN_COUNT)
  private Integer linksInCount;

  public static final String SERIALIZED_NAME_LOCATIONS = "locations";
  @SerializedName(SERIALIZED_NAME_LOCATIONS)
  private List<Location> locations = null;

  public static final String SERIALIZED_NAME_LOGO_URL = "logo_url";
  @SerializedName(SERIALIZED_NAME_LOGO_URL)
  private String logoUrl;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RANKINGS = "rankings";
  @SerializedName(SERIALIZED_NAME_RANKINGS)
  private Rankings rankings;

  public static final String SERIALIZED_NAME_SCOPES = "scopes";
  @SerializedName(SERIALIZED_NAME_SCOPES)
  private List<Scope> scopes = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;


  public Source description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A general explanation about the source
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A general explanation about the source")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Source domain(String domain) {
    
    this.domain = domain;
    return this;
  }

   /**
   * The domain name of the source which is extracted from the source URL
   * @return domain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The domain name of the source which is extracted from the source URL")

  public String getDomain() {
    return domain;
  }


  public void setDomain(String domain) {
    this.domain = domain;
  }


  public Source homePageUrl(String homePageUrl) {
    
    this.homePageUrl = homePageUrl;
    return this;
  }

   /**
   * The home page URL of the source
   * @return homePageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The home page URL of the source")

  public String getHomePageUrl() {
    return homePageUrl;
  }


  public void setHomePageUrl(String homePageUrl) {
    this.homePageUrl = homePageUrl;
  }


  public Source id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * The source id which is a unique value
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The source id which is a unique value")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public Source linksInCount(Integer linksInCount) {
    
    this.linksInCount = linksInCount;
    return this;
  }

   /**
   * The number of websites that link to the source
   * @return linksInCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of websites that link to the source")

  public Integer getLinksInCount() {
    return linksInCount;
  }


  public void setLinksInCount(Integer linksInCount) {
    this.linksInCount = linksInCount;
  }


  public Source locations(List<Location> locations) {
    
    this.locations = locations;
    return this;
  }

  public Source addLocationsItem(Location locationsItem) {
    if (this.locations == null) {
      this.locations = new ArrayList<Location>();
    }
    this.locations.add(locationsItem);
    return this;
  }

   /**
   * The source locations which are tend to be the physical locations of the source, e.g. BBC headquarter is located in London. 
   * @return locations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The source locations which are tend to be the physical locations of the source, e.g. BBC headquarter is located in London. ")

  public List<Location> getLocations() {
    return locations;
  }


  public void setLocations(List<Location> locations) {
    this.locations = locations;
  }


  public Source logoUrl(String logoUrl) {
    
    this.logoUrl = logoUrl;
    return this;
  }

   /**
   * A URL which points to the source logo
   * @return logoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A URL which points to the source logo")

  public String getLogoUrl() {
    return logoUrl;
  }


  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }


  public Source name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The source name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The source name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Source rankings(Rankings rankings) {
    
    this.rankings = rankings;
    return this;
  }

   /**
   * Get rankings
   * @return rankings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Rankings getRankings() {
    return rankings;
  }


  public void setRankings(Rankings rankings) {
    this.rankings = rankings;
  }


  public Source scopes(List<Scope> scopes) {
    
    this.scopes = scopes;
    return this;
  }

  public Source addScopesItem(Scope scopesItem) {
    if (this.scopes == null) {
      this.scopes = new ArrayList<Scope>();
    }
    this.scopes.add(scopesItem);
    return this;
  }

   /**
   * The source scopes which is tend to be scope locations of the source, e.g. BBC scopes is international. 
   * @return scopes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The source scopes which is tend to be scope locations of the source, e.g. BBC scopes is international. ")

  public List<Scope> getScopes() {
    return scopes;
  }


  public void setScopes(List<Scope> scopes) {
    this.scopes = scopes;
  }


  public Source title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The title of the home page URL
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The title of the home page URL")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
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
    Source source = (Source) o;
    return Objects.equals(this.description, source.description) &&
        Objects.equals(this.domain, source.domain) &&
        Objects.equals(this.homePageUrl, source.homePageUrl) &&
        Objects.equals(this.id, source.id) &&
        Objects.equals(this.linksInCount, source.linksInCount) &&
        Objects.equals(this.locations, source.locations) &&
        Objects.equals(this.logoUrl, source.logoUrl) &&
        Objects.equals(this.name, source.name) &&
        Objects.equals(this.rankings, source.rankings) &&
        Objects.equals(this.scopes, source.scopes) &&
        Objects.equals(this.title, source.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, domain, homePageUrl, id, linksInCount, locations, logoUrl, name, rankings, scopes, title);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Source {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    homePageUrl: ").append(toIndentedString(homePageUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linksInCount: ").append(toIndentedString(linksInCount)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rankings: ").append(toIndentedString(rankings)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
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

