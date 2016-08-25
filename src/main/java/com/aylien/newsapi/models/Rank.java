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
import org.joda.time.DateTime;

import java.util.Objects;


/**
 * Rank
 */

public class Rank {
    @JsonProperty("rank")
    private Integer rank = null;

    @JsonProperty("country")
    private String country = null;

    @JsonProperty("fetched_at")
    private DateTime fetchedAt = null;

    public Rank rank(Integer rank) {
        this.rank = rank;
        return this;
    }

    /**
     * The rank
     *
     * @return rank
     **/
    @ApiModelProperty(example = "null", value = "The rank")
    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Rank country(String country) {
        this.country = country;
        return this;
    }

    /**
     * The country code which the rank is in it
     *
     * @return country
     **/
    @ApiModelProperty(example = "null", value = "The country code which the rank is in it")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Rank fetchedAt(DateTime fetchedAt) {
        this.fetchedAt = fetchedAt;
        return this;
    }

    /**
     * The fetched date of the rank
     *
     * @return fetchedAt
     **/
    @ApiModelProperty(example = "null", value = "The fetched date of the rank")
    public DateTime getFetchedAt() {
        return fetchedAt;
    }

    public void setFetchedAt(DateTime fetchedAt) {
        this.fetchedAt = fetchedAt;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Rank rank = (Rank) o;
        return Objects.equals(this.rank, rank.rank) &&
                Objects.equals(this.country, rank.country) &&
                Objects.equals(this.fetchedAt, rank.fetchedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, country, fetchedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Rank {\n");

        sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    fetchedAt: ").append(toIndentedString(fetchedAt)).append("\n");
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

