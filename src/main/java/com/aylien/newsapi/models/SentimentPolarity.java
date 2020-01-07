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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Polarity of the sentiment
 */
@JsonAdapter(SentimentPolarity.Adapter.class)
public enum SentimentPolarity {
  
  POSITIVE("positive"),
  
  NEUTRAL("neutral"),
  
  NEGATIVE("negative");

  private String value;

  SentimentPolarity(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SentimentPolarity fromValue(String value) {
    for (SentimentPolarity b : SentimentPolarity.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<SentimentPolarity> {
    @Override
    public void write(final JsonWriter jsonWriter, final SentimentPolarity enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SentimentPolarity read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SentimentPolarity.fromValue(value);
    }
  }
}

