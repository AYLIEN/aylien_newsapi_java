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

import com.aylien.newsapi.models.Trend;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Trends
 */

public class Trends {
    @JsonProperty("trends")
    private List<Trend> trends = new ArrayList<Trend>();

    @JsonProperty("field")
    private String field = null;

    public Trends trends(List<Trend> trends) {
        this.trends = trends;
        return this;
    }

    public Trends addTrendsItem(Trend trendsItem) {
        this.trends.add(trendsItem);
        return this;
    }

    /**
     * An array of trends
     *
     * @return trends
     **/
    @ApiModelProperty(example = "null", value = "An array of trends")
    public List<Trend> getTrends() {
        return trends;
    }

    public void setTrends(List<Trend> trends) {
        this.trends = trends;
    }

    public Trends field(String field) {
        this.field = field;
        return this;
    }

    /**
     * The field of trends
     *
     * @return field
     **/
    @ApiModelProperty(example = "null", value = "The field of trends")
    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Trends trends = (Trends) o;
        return Objects.equals(this.trends, trends.trends) &&
                Objects.equals(this.field, trends.field);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trends, field);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Trends {\n");

        sb.append("    trends: ").append(toIndentedString(trends)).append("\n");
        sb.append("    field: ").append(toIndentedString(field)).append("\n");
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

