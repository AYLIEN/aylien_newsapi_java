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

import java.util.Objects;


/**
 * Location
 */

public class Location {
    @JsonProperty("country")
    private String country = null;

    @JsonProperty("state")
    private String state = null;

    @JsonProperty("city")
    private String city = null;

    public Location country(String country) {
        this.country = country;
        return this;
    }

    /**
     * The country code of the location. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes.
     *
     * @return country
     **/
    @ApiModelProperty(example = "null", value = "The country code of the location. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes.")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Location state(String state) {
        this.state = state;
        return this;
    }

    /**
     * The state of the location
     *
     * @return state
     **/
    @ApiModelProperty(example = "null", value = "The state of the location")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Location city(String city) {
        this.city = city;
        return this;
    }

    /**
     * The city of the location
     *
     * @return city
     **/
    @ApiModelProperty(example = "null", value = "The city of the location")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Location location = (Location) o;
        return Objects.equals(this.country, location.country) &&
                Objects.equals(this.state, location.state) &&
                Objects.equals(this.city, location.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, state, city);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Location {\n");

        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
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

