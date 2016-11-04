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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Scope
 */

public class Scope {
    @JsonProperty("country")
    private String country = null;

    @JsonProperty("state")
    private String state = null;

    @JsonProperty("city")
    private String city = null;
    @JsonProperty("level")
    private LevelEnum level = null;

    public Scope country(String country) {
        this.country = country;
        return this;
    }

    /**
     * The source scope by country code. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes.
     *
     * @return country
     **/
    @ApiModelProperty(example = "null", value = "The source scope by country code. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes.")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Scope state(String state) {
        this.state = state;
        return this;
    }

    /**
     * The scope by state
     *
     * @return state
     **/
    @ApiModelProperty(example = "null", value = "The scope by state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Scope city(String city) {
        this.city = city;
        return this;
    }

    /**
     * The scope by city
     *
     * @return city
     **/
    @ApiModelProperty(example = "null", value = "The scope by city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Scope level(LevelEnum level) {
        this.level = level;
        return this;
    }

    /**
     * The scope by level
     *
     * @return level
     **/
    @ApiModelProperty(example = "null", value = "The scope by level")
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

    /**
     * The scope by level
     */
    public enum LevelEnum {
        INTERNATIONAL("international"),

        NATIONAL("national"),

        LOCAL("local");

        private String value;

        LevelEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static LevelEnum fromValue(String text) {
            for (LevelEnum b : LevelEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

}

