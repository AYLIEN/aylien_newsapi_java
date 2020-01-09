/*
 * AYLIEN News API
 * The AYLIEN News API is the most powerful way of sourcing, searching and syndicating analyzed and enriched news content. It is accessed by sending HTTP requests to our server, which returns information to your client. 
 *
 * The version of the OpenAPI document: 3.0
 * Contact: support@aylien.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.aylien.newsapi.models;

import java.util.Objects;
import java.util.Arrays;
import com.aylien.newsapi.models.HistogramInterval;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Histograms
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-09T08:35:56.141Z[Europe/Dublin]")
public class Histograms {
  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private String field;

  public static final String SERIALIZED_NAME_INTERVAL_END = "interval.end";
  @SerializedName(SERIALIZED_NAME_INTERVAL_END)
  private Integer intervalEnd;

  public static final String SERIALIZED_NAME_INTERVAL_START = "interval.start";
  @SerializedName(SERIALIZED_NAME_INTERVAL_START)
  private Integer intervalStart;

  public static final String SERIALIZED_NAME_INTERVAL_WIDTH = "interval.width";
  @SerializedName(SERIALIZED_NAME_INTERVAL_WIDTH)
  private Integer intervalWidth;

  public static final String SERIALIZED_NAME_INTERVALS = "intervals";
  @SerializedName(SERIALIZED_NAME_INTERVALS)
  private List<HistogramInterval> intervals = null;


  public Histograms field(String field) {
    
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getField() {
    return field;
  }


  public void setField(String field) {
    this.field = field;
  }


  public Histograms intervalEnd(Integer intervalEnd) {
    
    this.intervalEnd = intervalEnd;
    return this;
  }

   /**
   * The end interval of the histogram
   * @return intervalEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The end interval of the histogram")

  public Integer getIntervalEnd() {
    return intervalEnd;
  }


  public void setIntervalEnd(Integer intervalEnd) {
    this.intervalEnd = intervalEnd;
  }


  public Histograms intervalStart(Integer intervalStart) {
    
    this.intervalStart = intervalStart;
    return this;
  }

   /**
   * The start interval of the histogram
   * @return intervalStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The start interval of the histogram")

  public Integer getIntervalStart() {
    return intervalStart;
  }


  public void setIntervalStart(Integer intervalStart) {
    this.intervalStart = intervalStart;
  }


  public Histograms intervalWidth(Integer intervalWidth) {
    
    this.intervalWidth = intervalWidth;
    return this;
  }

   /**
   * The width of the histogram
   * @return intervalWidth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The width of the histogram")

  public Integer getIntervalWidth() {
    return intervalWidth;
  }


  public void setIntervalWidth(Integer intervalWidth) {
    this.intervalWidth = intervalWidth;
  }


  public Histograms intervals(List<HistogramInterval> intervals) {
    
    this.intervals = intervals;
    return this;
  }

  public Histograms addIntervalsItem(HistogramInterval intervalsItem) {
    if (this.intervals == null) {
      this.intervals = new ArrayList<HistogramInterval>();
    }
    this.intervals.add(intervalsItem);
    return this;
  }

   /**
   * The intervals of the histograms
   * @return intervals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The intervals of the histograms")

  public List<HistogramInterval> getIntervals() {
    return intervals;
  }


  public void setIntervals(List<HistogramInterval> intervals) {
    this.intervals = intervals;
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
    return Objects.equals(this.field, histograms.field) &&
        Objects.equals(this.intervalEnd, histograms.intervalEnd) &&
        Objects.equals(this.intervalStart, histograms.intervalStart) &&
        Objects.equals(this.intervalWidth, histograms.intervalWidth) &&
        Objects.equals(this.intervals, histograms.intervals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, intervalEnd, intervalStart, intervalWidth, intervals);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Histograms {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    intervalEnd: ").append(toIndentedString(intervalEnd)).append("\n");
    sb.append("    intervalStart: ").append(toIndentedString(intervalStart)).append("\n");
    sb.append("    intervalWidth: ").append(toIndentedString(intervalWidth)).append("\n");
    sb.append("    intervals: ").append(toIndentedString(intervals)).append("\n");
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

