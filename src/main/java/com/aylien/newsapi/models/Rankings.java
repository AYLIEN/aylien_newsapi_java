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

import com.aylien.newsapi.models.Rank;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Rankings
 */

public class Rankings {
    @JsonProperty("alexa")
    private List<Rank> alexa = new ArrayList<Rank>();

    public Rankings alexa(List<Rank> alexa) {
        this.alexa = alexa;
        return this;
    }

    public Rankings addAlexaItem(Rank alexaItem) {
        this.alexa.add(alexaItem);
        return this;
    }

    /**
     * Get alexa
     *
     * @return alexa
     **/
    @ApiModelProperty(example = "null", value = "")
    public List<Rank> getAlexa() {
        return alexa;
    }

    public void setAlexa(List<Rank> alexa) {
        this.alexa = alexa;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Rankings rankings = (Rankings) o;
        return Objects.equals(this.alexa, rankings.alexa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alexa);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Rankings {\n");

        sb.append("    alexa: ").append(toIndentedString(alexa)).append("\n");
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

