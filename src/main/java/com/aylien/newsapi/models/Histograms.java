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


public class Histograms {

    private List<HistogramInterval> intervals = new ArrayList<HistogramInterval>();
    private Integer intervalStart = null;
    private Integer intervalEnd = null;
    private Integer intervalWidth = null;
    private String field = null;


    /**
     * The intervals of the histograms
     **/
    public Histograms intervals(List<HistogramInterval> intervals) {
        this.intervals = intervals;
        return this;
    }

    @ApiModelProperty(example = "null", value = "The intervals of the histograms")
    @JsonProperty("intervals")
    public List<HistogramInterval> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<HistogramInterval> intervals) {
        this.intervals = intervals;
    }


    /**
     * The start interval of the histogram
     **/
    public Histograms intervalStart(Integer intervalStart) {
        this.intervalStart = intervalStart;
        return this;
    }

    @ApiModelProperty(example = "null", value = "The start interval of the histogram")
    @JsonProperty("interval.start")
    public Integer getIntervalStart() {
        return intervalStart;
    }

    public void setIntervalStart(Integer intervalStart) {
        this.intervalStart = intervalStart;
    }


    /**
     * The end interval of the histogram
     **/
    public Histograms intervalEnd(Integer intervalEnd) {
        this.intervalEnd = intervalEnd;
        return this;
    }

    @ApiModelProperty(example = "null", value = "The end interval of the histogram")
    @JsonProperty("interval.end")
    public Integer getIntervalEnd() {
        return intervalEnd;
    }

    public void setIntervalEnd(Integer intervalEnd) {
        this.intervalEnd = intervalEnd;
    }


    /**
     * The width of the histogram
     **/
    public Histograms intervalWidth(Integer intervalWidth) {
        this.intervalWidth = intervalWidth;
        return this;
    }

    @ApiModelProperty(example = "null", value = "The width of the histogram")
    @JsonProperty("interval.width")
    public Integer getIntervalWidth() {
        return intervalWidth;
    }

    public void setIntervalWidth(Integer intervalWidth) {
        this.intervalWidth = intervalWidth;
    }


    /**
     **/
    public Histograms field(String field) {
        this.field = field;
        return this;
    }

    @ApiModelProperty(example = "null", value = "")
    @JsonProperty("field")
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
        Histograms histograms = (Histograms) o;
        return Objects.equals(this.intervals, histograms.intervals) &&
                Objects.equals(this.intervalStart, histograms.intervalStart) &&
                Objects.equals(this.intervalEnd, histograms.intervalEnd) &&
                Objects.equals(this.intervalWidth, histograms.intervalWidth) &&
                Objects.equals(this.field, histograms.field);
    }

    @Override
    public int hashCode() {
        return Objects.hash(intervals, intervalStart, intervalEnd, intervalWidth, field);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Histograms {\n");

        sb.append("    intervals: ").append(toIndentedString(intervals)).append("\n");
        sb.append("    intervalStart: ").append(toIndentedString(intervalStart)).append("\n");
        sb.append("    intervalEnd: ").append(toIndentedString(intervalEnd)).append("\n");
        sb.append("    intervalWidth: ").append(toIndentedString(intervalWidth)).append("\n");
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

