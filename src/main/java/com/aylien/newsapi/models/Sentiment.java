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
 * Sentiment
 */

public class Sentiment {
    @JsonProperty("polarity")
    private PolarityEnum polarity = null;
    @JsonProperty("score")
    private Double score = null;

    public Sentiment polarity(PolarityEnum polarity) {
        this.polarity = polarity;
        return this;
    }

    /**
     * Polarity of the sentiment
     *
     * @return polarity
     **/
    @ApiModelProperty(example = "null", value = "Polarity of the sentiment")
    public PolarityEnum getPolarity() {
        return polarity;
    }

    public void setPolarity(PolarityEnum polarity) {
        this.polarity = polarity;
    }

    public Sentiment score(Double score) {
        this.score = score;
        return this;
    }

    /**
     * Polarity score of the sentiment
     * minimum: 0
     * maximum: 1
     *
     * @return score
     **/
    @ApiModelProperty(example = "null", value = "Polarity score of the sentiment")
    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Sentiment sentiment = (Sentiment) o;
        return Objects.equals(this.polarity, sentiment.polarity) &&
                Objects.equals(this.score, sentiment.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(polarity, score);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Sentiment {\n");

        sb.append("    polarity: ").append(toIndentedString(polarity)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
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
     * Polarity of the sentiment
     */
    public enum PolarityEnum {
        POSITIVE("positive"),

        NEUTRAL("neutral"),

        NEGATIVE("negative");

        private String value;

        PolarityEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static PolarityEnum fromValue(String text) {
            for (PolarityEnum b : PolarityEnum.values()) {
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

