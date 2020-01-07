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
 * The format of media
 */
@JsonAdapter(MediaFormat.Adapter.class)
public enum MediaFormat {
  
  BMP("BMP"),
  
  GIF("GIF"),
  
  JPEG("JPEG"),
  
  PNG("PNG"),
  
  TIFF("TIFF"),
  
  PSD("PSD"),
  
  ICO("ICO"),
  
  CUR("CUR"),
  
  WEBP("WEBP"),
  
  SVG("SVG");

  private String value;

  MediaFormat(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MediaFormat fromValue(String value) {
    for (MediaFormat b : MediaFormat.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<MediaFormat> {
    @Override
    public void write(final JsonWriter jsonWriter, final MediaFormat enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public MediaFormat read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return MediaFormat.fromValue(value);
    }
  }
}
