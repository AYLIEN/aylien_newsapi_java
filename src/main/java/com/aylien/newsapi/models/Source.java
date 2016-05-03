/**
 * Copyright 2016 Aylien, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aylien.newsapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Source {

    private Integer id = null;
    private String name = null;
    private String domain = null;
    private String logoUrl = null;
    private List<Location> locations = new ArrayList<Location>();
    private List<Scope> scopes = new ArrayList<Scope>();


    /**
     * The source id which is a unique value
     **/
    public Source id(Integer id) {
        this.id = id;
        return this;
    }

    @ApiModelProperty(example = "null", value = "The source id which is a unique value")
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    /**
     * The source name
     **/
    public Source name(String name) {
        this.name = name;
        return this;
    }

    @ApiModelProperty(example = "null", value = "The source name")
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    /**
     * Domain name of the source which is extracted from the source URL
     **/
    public Source domain(String domain) {
        this.domain = domain;
        return this;
    }

    @ApiModelProperty(example = "null", value = "Domain name of the source which is extracted from the source URL")
    @JsonProperty("domain")
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }


    /**
     * A URL which points to the source logo
     **/
    public Source logoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
        return this;
    }

    @ApiModelProperty(example = "null", value = "A URL which points to the source logo")
    @JsonProperty("logo_url")
    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }


    /**
     * The source locations which are tend to be the physical locations of the source, e.g. BBC headquarter is located in London.
     **/
    public Source locations(List<Location> locations) {
        this.locations = locations;
        return this;
    }

    @ApiModelProperty(example = "null", value = "The source locations which are tend to be the physical locations of the source, e.g. BBC headquarter is located in London.")
    @JsonProperty("locations")
    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }


    /**
     * The source scopes which is tend to be scope locations of the source, e.g. BBC scopes is international.
     **/
    public Source scopes(List<Scope> scopes) {
        this.scopes = scopes;
        return this;
    }

    @ApiModelProperty(example = "null", value = "The source scopes which is tend to be scope locations of the source, e.g. BBC scopes is international. ")
    @JsonProperty("scopes")
    public List<Scope> getScopes() {
        return scopes;
    }

    public void setScopes(List<Scope> scopes) {
        this.scopes = scopes;
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
        return Objects.equals(this.id, source.id) &&
                Objects.equals(this.name, source.name) &&
                Objects.equals(this.domain, source.domain) &&
                Objects.equals(this.logoUrl, source.logoUrl) &&
                Objects.equals(this.locations, source.locations) &&
                Objects.equals(this.scopes, source.scopes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, domain, logoUrl, locations, scopes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Source {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
        sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
        sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
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

