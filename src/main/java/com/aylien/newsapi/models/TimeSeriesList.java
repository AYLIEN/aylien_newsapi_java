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

import com.aylien.newsapi.models.TimeSeries;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * TimeSeriesList
 */

public class TimeSeriesList {
    @JsonProperty("time_series")
    private List<TimeSeries> timeSeries = new ArrayList<TimeSeries>();

    @JsonProperty("period")
    private String period = null;

    @JsonProperty("published_at.start")
    private DateTime publishedAtStart = null;

    @JsonProperty("published_at.end")
    private DateTime publishedAtEnd = null;

    public TimeSeriesList timeSeries(List<TimeSeries> timeSeries) {
        this.timeSeries = timeSeries;
        return this;
    }

    public TimeSeriesList addTimeSeriesItem(TimeSeries timeSeriesItem) {
        this.timeSeries.add(timeSeriesItem);
        return this;
    }

    /**
     * An array of time series
     *
     * @return timeSeries
     **/
    @ApiModelProperty(example = "null", value = "An array of time series")
    public List<TimeSeries> getTimeSeries() {
        return timeSeries;
    }

    public void setTimeSeries(List<TimeSeries> timeSeries) {
        this.timeSeries = timeSeries;
    }

    public TimeSeriesList period(String period) {
        this.period = period;
        return this;
    }

    /**
     * The size of each date range expressed as an interval to be added to the lower bound.
     *
     * @return period
     **/
    @ApiModelProperty(example = "null", value = "The size of each date range expressed as an interval to be added to the lower bound.")
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public TimeSeriesList publishedAtStart(DateTime publishedAtStart) {
        this.publishedAtStart = publishedAtStart;
        return this;
    }

    /**
     * The start published date of the time series
     *
     * @return publishedAtStart
     **/
    @ApiModelProperty(example = "null", value = "The start published date of the time series")
    public DateTime getPublishedAtStart() {
        return publishedAtStart;
    }

    public void setPublishedAtStart(DateTime publishedAtStart) {
        this.publishedAtStart = publishedAtStart;
    }

    public TimeSeriesList publishedAtEnd(DateTime publishedAtEnd) {
        this.publishedAtEnd = publishedAtEnd;
        return this;
    }

    /**
     * The end published date of the time series
     *
     * @return publishedAtEnd
     **/
    @ApiModelProperty(example = "null", value = "The end published date of the time series")
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

