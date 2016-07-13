/**
 * Copyright 2016 Aylien, Inc. All Rights Reserved.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
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


/**
 * Source
 */

public class Source {
    @JsonProperty("id")
    private Integer id = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("domain")
    private String domain = null;

    @JsonProperty("logo_url")
    private String logoUrl = null;

    @JsonProperty("locations")
    private List<Location> locations = new ArrayList<Location>();

    @JsonProperty("scopes")
    private List<Scope> scopes = new ArrayList<Scope>();

    public Source id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * The source id which is a unique value
     *
     * @return id
     **/
    @ApiModelProperty(example = "null", value = "The source id which is a unique value")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Source name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The source name
     *
     * @return name
     **/
    @ApiModelProperty(example = "null", value = "The source name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Source domain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * Domain name of the source which is extracted from the source URL
     *
     * @return domain
     **/
    @ApiModelProperty(example = "null", value = "Domain name of the source which is extracted from the source URL")
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Source logoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
        return this;
    }

    /**
     * A URL which points to the source logo
     *
     * @return logoUrl
     **/
    @ApiModelProperty(example = "null", value = "A URL which points to the source logo")
    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public Source locations(List<Location> locations) {
        this.locations = locations;
        return this;
    }

    /**
     * The source locations which are tend to be the physical locations of the source, e.g. BBC headquarter is located in London.
     *
     * @return locations
     **/
    @ApiModelProperty(example = "null", value = "The source locations which are tend to be the physical locations of the source, e.g. BBC headquarter is located in London.")
    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public Source scopes(List<Scope> scopes) {
        this.scopes = scopes;
        return this;
    }

    /**
     * The source scopes which is tend to be scope locations of the source, e.g. BBC scopes is international.
     *
     * @return scopes
     **/
    @ApiModelProperty(example = "null", value = "The source scopes which is tend to be scope locations of the source, e.g. BBC scopes is international. ")
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

