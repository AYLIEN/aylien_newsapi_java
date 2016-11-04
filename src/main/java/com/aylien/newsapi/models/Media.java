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
 * Media
 */

public class Media {
    @JsonProperty("type")
    private TypeEnum type = null;
    @JsonProperty("url")
    private String url = null;
    @JsonProperty("format")
    private FormatEnum format = null;
    @JsonProperty("content_length")
    private Integer contentLength = null;
    @JsonProperty("width")
    private Integer width = null;
    @JsonProperty("height")
    private Integer height = null;

    public Media type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * The type of media
     *
     * @return type
     **/
    @ApiModelProperty(example = "null", value = "The type of media")
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public Media url(String url) {
        this.url = url;
        return this;
    }

    /**
     * A URL which points to the media file
     *
     * @return url
     **/
    @ApiModelProperty(example = "null", value = "A URL which points to the media file")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Media format(FormatEnum format) {
        this.format = format;
        return this;
    }

    /**
     * The format of media
     *
     * @return format
     **/
    @ApiModelProperty(example = "null", value = "The format of media")
    public FormatEnum getFormat() {
        return format;
    }

    public void setFormat(FormatEnum format) {
        this.format = format;
    }

    public Media contentLength(Integer contentLength) {
        this.contentLength = contentLength;
        return this;
    }

    /**
     * The content length of media
     *
     * @return contentLength
     **/
    @ApiModelProperty(example = "null", value = "The content length of media")
    public Integer getContentLength() {
        return contentLength;
    }

    public void setContentLength(Integer contentLength) {
        this.contentLength = contentLength;
    }

    public Media width(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * The width of media
     *
     * @return width
     **/
    @ApiModelProperty(example = "null", value = "The width of media")
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Media height(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * The height of media
     *
     * @return height
     **/
    @ApiModelProperty(example = "null", value = "The height of media")
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Media media = (Media) o;
        return Objects.equals(this.type, media.type) &&
                Objects.equals(this.url, media.url) &&
                Objects.equals(this.format, media.format) &&
                Objects.equals(this.contentLength, media.contentLength) &&
                Objects.equals(this.width, media.width) &&
                Objects.equals(this.height, media.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, url, format, contentLength, width, height);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Media {\n");

        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    contentLength: ").append(toIndentedString(contentLength)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
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
     * The type of media
     */
    public enum TypeEnum {
        IMAGE("image"),

        VIDEO("video");

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static TypeEnum fromValue(String text) {
            for (TypeEnum b : TypeEnum.values()) {
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

    /**
     * The format of media
     */
    public enum FormatEnum {
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

        FormatEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static FormatEnum fromValue(String text) {
            for (FormatEnum b : FormatEnum.values()) {
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

