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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;


public class Scope {

    private String country = null;
    private String state = null;
    private String city = null;


    public enum LevelEnum {
        INTERNATIONAL("international"),
        NATIONAL("national"),
        LOCAL("local");

        private String value;

        LevelEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return value;
        }
    }

    private LevelEnum level = null;


    /**
     * The country code of the scope. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes.
     **/
    public Scope country(String country) {
        this.country = country;
        return this;
    }

    @ApiModelProperty(example = "null", value = "The country code of the scope. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes.")
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    /**
     * The state of the scope
     **/
    public Scope state(String state) {
        this.state = state;
        return this;
    }

    @ApiModelProperty(example = "null", value = "The state of the scope")
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    /**
     * The city of the scope
     **/
    public Scope city(String city) {
        this.city = city;
        return this;
    }

    @ApiModelProperty(example = "null", value = "The city of the scope")
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    /**
     * The level of the scope
     **/
    public Scope level(LevelEnum level) {
        this.level = level;
        return this;
    }

    @ApiModelProperty(example = "null", value = "The level of the scope")
    @JsonProperty("level")
    public LevelEnum getLevel() {
        return level;
    }

    public void setLevel(LevelEnum level) {
        this.level = level;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Scope scope = (Scope) o;
        return Objects.equals(this.country, scope.country) &&
                Objects.equals(this.state, scope.state) &&
                Objects.equals(this.city, scope.city) &&
                Objects.equals(this.level, scope.level);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, state, city, level);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Scope {\n");

        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
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

