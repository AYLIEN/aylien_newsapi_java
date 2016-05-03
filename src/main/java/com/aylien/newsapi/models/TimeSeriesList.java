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
import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class TimeSeriesList {

    private List<TimeSeries> timeSeries = new ArrayList<TimeSeries>();
    private String period = null;
    private DateTime publishedAtStart = null;
    private DateTime publishedAtEnd = null;


    /**
     * An array of time series
     **/
    public TimeSeriesList timeSeries(List<TimeSeries> timeSeries) {
        this.timeSeries = timeSeries;
        return this;
    }

    @ApiModelProperty(example = "null", value = "An array of time series")
    @JsonProperty("time_series")
    public List<TimeSeries> getTimeSeries() {
        return timeSeries;
    }

    public void setTimeSeries(List<TimeSeries> timeSeries) {
        this.timeSeries = timeSeries;
    }


    /**
     * The size of each date range expressed as an interval to be added to the lower bound.
     **/
    public TimeSeriesList period(String period) {
        this.period = period;
        return this;
    }

    @ApiModelProperty(example = "null", value = "The size of each date range expressed as an interval to be added to the lower bound.")
    @JsonProperty("period")
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }


    /**
     * The start published date of the time series
     **/
    public TimeSeriesList publishedAtStart(DateTime publishedAtStart) {
        this.publishedAtStart = publishedAtStart;
        return this;
    }

    @ApiModelProperty(example = "null", value = "The start published date of the time series")
    @JsonProperty("published_at.start")
    public DateTime getPublishedAtStart() {
        return publishedAtStart;
    }

    public void setPublishedAtStart(DateTime publishedAtStart) {
        this.publishedAtStart = publishedAtStart;
    }


    /**
     * The end published date of the time series
     **/
    public TimeSeriesList publishedAtEnd(DateTime publishedAtEnd) {
        this.publishedAtEnd = publishedAtEnd;
        return this;
    }

    @ApiModelProperty(example = "null", value = "The end published date of the time series")
    @JsonProperty("published_at.end")
    public DateTime getPublishedAtEnd() {
        return publishedAtEnd;
    }

    public void setPublishedAtEnd(DateTime publishedAtEnd) {
        this.publishedAtEnd = publishedAtEnd;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TimeSeriesList timeSeriesList = (TimeSeriesList) o;
        return Objects.equals(this.timeSeries, timeSeriesList.timeSeries) &&
                Objects.equals(this.period, timeSeriesList.period) &&
                Objects.equals(this.publishedAtStart, timeSeriesList.publishedAtStart) &&
                Objects.equals(this.publishedAtEnd, timeSeriesList.publishedAtEnd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeSeries, period, publishedAtStart, publishedAtEnd);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TimeSeriesList {\n");

        sb.append("    timeSeries: ").append(toIndentedString(timeSeries)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    publishedAtStart: ").append(toIndentedString(publishedAtStart)).append("\n");
        sb.append("    publishedAtEnd: ").append(toIndentedString(publishedAtEnd)).append("\n");
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

