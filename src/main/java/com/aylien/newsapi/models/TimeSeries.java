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
 * TimeSeries
 */

public class TimeSeries {
    @JsonProperty("published_at")
    private DateTime publishedAt = null;

    @JsonProperty("count")
    private Integer count = null;

    public TimeSeries publishedAt(DateTime publishedAt) {
        this.publishedAt = publishedAt;
        return this;
    }

    /**
     * The published date of the time series bin
     *
     * @return publishedAt
     **/
    @ApiModelProperty(example = "null", value = "The published date of the time series bin")
    public DateTime getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(DateTime publishedAt) {
        this.publishedAt = publishedAt;
    }

    public TimeSeries count(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * The count of time series bin
     *
     * @return count
     **/
    @ApiModelProperty(example = "null", value = "The count of time series bin")
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TimeSeries timeSeries = (TimeSeries) o;
        return Objects.equals(this.publishedAt, timeSeries.publishedAt) &&
                Objects.equals(this.count, timeSeries.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publishedAt, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TimeSeries {\n");

        sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

