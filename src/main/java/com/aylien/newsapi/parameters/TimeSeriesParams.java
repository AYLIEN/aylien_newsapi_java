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

package com.aylien.newsapi.parameters;

import java.util.List;

public class TimeSeriesParams {
    private List<Long> id;
    private String title;
    private String body;
    private String text;
    private List<String> language;
    private String categoriesTaxonomy;
    private Boolean categoriesConfident;
    private List<String> categoriesId;
    private List<Integer> categoriesLevel;
    private List<String> entitiesTitleText;
    private List<String> entitiesTitleType;
    private List<String> entitiesTitleLinksDbpedia;
    private List<String> entitiesBodyText;
    private List<String> entitiesBodyType;
    private List<String> entitiesBodyLinksDbpedia;
    private String sentimentTitlePolarity;
    private String sentimentBodyPolarity;
    private Integer mediaImagesCountMin;
    private Integer mediaImagesCountMax;
    private Integer mediaVideosCountMin;
    private Integer mediaVideosCountMax;
    private List<Integer> authorId;
    private String authorName;
    private List<Integer> sourceId;
    private List<String> sourceName;
    private List<String> sourceDomain;
    private List<String> sourceLocationsCountry;
    private List<String> sourceLocationsState;
    private List<String> sourceLocationsCity;
    private List<String> sourceScopesCountry;
    private List<String> sourceScopesState;
    private List<String> sourceScopesCity;
    private List<String> sourceScopesLevel;
    private Integer sourceLinksInCountMin;
    private Integer sourceLinksInCountMax;
    private Integer sourceRankingsAlexaRankMin;
    private Integer sourceRankingsAlexaRankMax;
    private List<String> sourceRankingsAlexaCountry;
    private String publishedAtStart;
    private String publishedAtEnd;
    private String period;

    /**
     * Constructs parameters for Time Series endpoint
     *
     * @param id                         This parameter is used for finding stroies by story id. (optional)
     * @param title                      This parameter is used for finding stories whose title contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). (optional)
     * @param body                       This parameter is used for finding stories whose body contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). (optional)
     * @param text                       This parameter is used for finding stories whose title or body contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). (optional)
     * @param language                   This parameter is used for finding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes. (optional)
     * @param categoriesTaxonomy         This parameter is used for defining the type of the taxonomy for the rest of the categories queries. (optional)
     * @param categoriesConfident        This parameter is used for finding stories whose categories are confident. (optional, default to true)
     * @param categoriesId               This parameter is used for finding stories by categories id. (optional)
     * @param categoriesLevel            This parameter is used for finding stories by categories level. (optional)
     * @param entitiesTitleText          This parameter is used to find stories based on the specified entities &#x60;text&#x60; in story titles. (optional)
     * @param entitiesTitleType          This parameter is used to find stories based on the specified entities &#x60;type&#x60; in story titles. (optional)
     * @param entitiesTitleLinksDbpedia  This parameter is used to find stories based on the specified entities dbpedia URL in story titles. (optional)
     * @param entitiesBodyText           This parameter is used to find stories based on the specified entities &#x60;text&#x60; in the body of stories. (optional)
     * @param entitiesBodyType           This parameter is used to find stories based on the specified entities &#x60;type&#x60; in the body of stories. (optional)
     * @param entitiesBodyLinksDbpedia   This parameter is used to find stories based on the specified entities dbpedia URL in the body of stories. (optional)
     * @param sentimentTitlePolarity     This parameter is used for finding stories whose title sentiment is the specified value. (optional)
     * @param sentimentBodyPolarity      This parameter is used for finding stories whose body sentiment is the specified value. (optional)
     * @param mediaImagesCountMin        This parameter is used for finding stories whose number of images is greater than or equal to the specified value. (optional)
     * @param mediaImagesCountMax        This parameter is used for finding stories whose number of images is less than or equal to the specified value. (optional)
     * @param mediaVideosCountMin        This parameter is used for finding stories whose number of videos is greater than or equal to the specified value. (optional)
     * @param mediaVideosCountMax        This parameter is used for finding stories whose number of videos is less than or equal to the specified value. (optional)
     * @param authorId                   This parameter is used for finding stories whose author id is the specified value. (optional)
     * @param authorName                 This parameter is used for finding stories whose author full name contains the specified value. (optional)
     * @param sourceId                   This parameter is used for finding stories whose source id is the specified value. (optional)
     * @param sourceName                 This parameter is used for finding stories whose source name contains the specified value. (optional)
     * @param sourceDomain               This parameter is used for finding stories whose source domain is the specified value. (optional)
     * @param sourceLocationsCountry     This parameter is used for finding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). (optional)
     * @param sourceLocationsState       This parameter is used for finding stories whose source state/province is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). (optional)
     * @param sourceLocationsCity        This parameter is used for finding stories whose source city is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). (optional)
     * @param sourceScopesCountry        This parameter is used for finding stories whose source scopes is the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). (optional)
     * @param sourceScopesState          This parameter is used for finding stories whose source scopes is the specified state/province value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). (optional)
     * @param sourceScopesCity           This parameter is used for finding stories whose source scopes is the specified city value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). (optional)
     * @param sourceScopesLevel          This parameter is used for finding stories whose source scopes is the specified level value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). (optional)
     * @param sourceLinksInCountMin      This parameter is used for finding stories from sources whose Links in count is greater than or equal to the specified value. You can read more about working with Links in count here [https://newsapi.aylien.com/docs/working-with-links-in-count](https://newsapi.aylien.com/docs/working-with-links-in-count). (optional)
     * @param sourceLinksInCountMax      This parameter is used for finding stories from sources whose Links in count is less than or equal to the specified value. You can read more about working with Links in count here [https://newsapi.aylien.com/docs/working-with-links-in-count](https://newsapi.aylien.com/docs/working-with-links-in-count). (optional)
     * @param sourceRankingsAlexaRankMin This parameter is used for finding stories from sources whose Alexa rank is greater than or equal to the specified value. You can read more about working with Alexa ranks here [https://newsapi.aylien.com/docs/working-with-alexa-ranks](https://newsapi.aylien.com/docs/working-with-alexa-ranks). (optional)
     * @param sourceRankingsAlexaRankMax This parameter is used for finding stories from sources whose Alexa rank is less than or equal to the specified value. You can read more about working with Alexa ranks here [https://newsapi.aylien.com/docs/working-with-alexa-ranks](https://newsapi.aylien.com/docs/working-with-alexa-ranks). (optional)
     * @param sourceRankingsAlexaCountry This parameter is used for finding stories from sources whose Alexa rank is in the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. You can read more about working with Alexa ranks here [https://newsapi.aylien.com/docs/working-with-alexa-ranks](https://newsapi.aylien.com/docs/working-with-alexa-ranks). (optional)
     * @param publishedAtStart           This parameter is used for finding stories whose published at time is less than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates). (optional, default to NOW-7DAYS/DAY)
     * @param publishedAtEnd             This parameter is used for finding stories whose published at time is greater than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates). (optional, default to NOW/DAY)
     * @param period                     The size of each date range is expressed as an interval to be added to the lower bound. It supports Date Math Syntax. Valid options are &#x60;+&#x60; following an integer number greater than 0 and one of the Date Math keywords. e.g. &#x60;+1DAY&#x60;, &#x60;+2MINUTES&#x60; and &#x60;+1MONTH&#x60;. Here are [Supported keywords](https://newsapi.aylien.com/docs/working-with-dates#date-math). (optional, default to +1DAY)
     */
    public TimeSeriesParams(List<Long> id, String title, String body, String text, List<String> language, String categoriesTaxonomy, Boolean categoriesConfident, List<String> categoriesId, List<Integer> categoriesLevel, List<String> entitiesTitleText, List<String> entitiesTitleType, List<String> entitiesTitleLinksDbpedia, List<String> entitiesBodyText, List<String> entitiesBodyType, List<String> entitiesBodyLinksDbpedia, String sentimentTitlePolarity, String sentimentBodyPolarity, Integer mediaImagesCountMin, Integer mediaImagesCountMax, Integer mediaVideosCountMin, Integer mediaVideosCountMax, List<Integer> authorId, String authorName, List<Integer> sourceId, List<String> sourceName, List<String> sourceDomain, List<String> sourceLocationsCountry, List<String> sourceLocationsState, List<String> sourceLocationsCity, List<String> sourceScopesCountry, List<String> sourceScopesState, List<String> sourceScopesCity, List<String> sourceScopesLevel, Integer sourceLinksInCountMin, Integer sourceLinksInCountMax, Integer sourceRankingsAlexaRankMin, Integer sourceRankingsAlexaRankMax, List<String> sourceRankingsAlexaCountry, String publishedAtStart, String publishedAtEnd, String period) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.text = text;
        this.language = language;
        this.categoriesTaxonomy = categoriesTaxonomy;
        this.categoriesConfident = categoriesConfident;
        this.categoriesId = categoriesId;
        this.categoriesLevel = categoriesLevel;
        this.entitiesTitleText = entitiesTitleText;
        this.entitiesTitleType = entitiesTitleType;
        this.entitiesTitleLinksDbpedia = entitiesTitleLinksDbpedia;
        this.entitiesBodyText = entitiesBodyText;
        this.entitiesBodyType = entitiesBodyType;
        this.entitiesBodyLinksDbpedia = entitiesBodyLinksDbpedia;
        this.sentimentTitlePolarity = sentimentTitlePolarity;
        this.sentimentBodyPolarity = sentimentBodyPolarity;
        this.mediaImagesCountMin = mediaImagesCountMin;
        this.mediaImagesCountMax = mediaImagesCountMax;
        this.mediaVideosCountMin = mediaVideosCountMin;
        this.mediaVideosCountMax = mediaVideosCountMax;
        this.authorId = authorId;
        this.authorName = authorName;
        this.sourceId = sourceId;
        this.sourceName = sourceName;
        this.sourceDomain = sourceDomain;
        this.sourceLocationsCountry = sourceLocationsCountry;
        this.sourceLocationsState = sourceLocationsState;
        this.sourceLocationsCity = sourceLocationsCity;
        this.sourceScopesCountry = sourceScopesCountry;
        this.sourceScopesState = sourceScopesState;
        this.sourceScopesCity = sourceScopesCity;
        this.sourceScopesLevel = sourceScopesLevel;
        this.sourceLinksInCountMin = sourceLinksInCountMin;
        this.sourceLinksInCountMax = sourceLinksInCountMax;
        this.sourceRankingsAlexaRankMin = sourceRankingsAlexaRankMin;
        this.sourceRankingsAlexaRankMax = sourceRankingsAlexaRankMax;
        this.sourceRankingsAlexaCountry = sourceRankingsAlexaCountry;
        this.publishedAtStart = publishedAtStart;
        this.publishedAtEnd = publishedAtEnd;
        this.period = period;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public List<Long> getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public String getText() {
        return text;
    }

    public List<String> getLanguage() {
        return language;
    }

    public String getCategoriesTaxonomy() {
        return categoriesTaxonomy;
    }

    public Boolean getCategoriesConfident() {
        return categoriesConfident;
    }

    public List<String> getCategoriesId() {
        return categoriesId;
    }

    public List<Integer> getCategoriesLevel() {
        return categoriesLevel;
    }

    public List<String> getEntitiesTitleText() {
        return entitiesTitleText;
    }

    public List<String> getEntitiesTitleType() {
        return entitiesTitleType;
    }

    public List<String> getEntitiesTitleLinksDbpedia() {
        return entitiesTitleLinksDbpedia;
    }

    public List<String> getEntitiesBodyText() {
        return entitiesBodyText;
    }

    public List<String> getEntitiesBodyType() {
        return entitiesBodyType;
    }

    public List<String> getEntitiesBodyLinksDbpedia() {
        return entitiesBodyLinksDbpedia;
    }

    public String getSentimentTitlePolarity() {
        return sentimentTitlePolarity;
    }

    public String getSentimentBodyPolarity() {
        return sentimentBodyPolarity;
    }

    public Integer getMediaImagesCountMin() {
        return mediaImagesCountMin;
    }

    public Integer getMediaImagesCountMax() {
        return mediaImagesCountMax;
    }

    public Integer getMediaVideosCountMin() {
        return mediaVideosCountMin;
    }

    public Integer getMediaVideosCountMax() {
        return mediaVideosCountMax;
    }

    public List<Integer> getAuthorId() {
        return authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public List<Integer> getSourceId() {
        return sourceId;
    }

    public List<String> getSourceName() {
        return sourceName;
    }

    public List<String> getSourceDomain() {
        return sourceDomain;
    }

    public List<String> getSourceLocationsCountry() {
        return sourceLocationsCountry;
    }

    public List<String> getSourceLocationsState() {
        return sourceLocationsState;
    }

    public List<String> getSourceLocationsCity() {
        return sourceLocationsCity;
    }

    public List<String> getSourceScopesCountry() {
        return sourceScopesCountry;
    }

    public List<String> getSourceScopesState() {
        return sourceScopesState;
    }

    public List<String> getSourceScopesCity() {
        return sourceScopesCity;
    }

    public List<String> getSourceScopesLevel() {
        return sourceScopesLevel;
    }

    public Integer getSourceLinksInCountMin() {
        return sourceLinksInCountMin;
    }

    public Integer getSourceLinksInCountMax() {
        return sourceLinksInCountMax;
    }

    public Integer getSourceRankingsAlexaRankMin() {
        return sourceRankingsAlexaRankMin;
    }

    public Integer getSourceRankingsAlexaRankMax() {
        return sourceRankingsAlexaRankMax;
    }

    public List<String> getSourceRankingsAlexaCountry() {
        return sourceRankingsAlexaCountry;
    }

    public String getPublishedAtStart() {
        return publishedAtStart;
    }

    public String getPublishedAtEnd() {
        return publishedAtEnd;
    }

    public String getPeriod() {
        return period;
    }

    public static class Builder {
        private List<Long> id;
        private String title;
        private String body;
        private String text;
        private List<String> language;
        private String categoriesTaxonomy;
        private Boolean categoriesConfident;
        private List<String> categoriesId;
        private List<Integer> categoriesLevel;
        private List<String> entitiesTitleText;
        private List<String> entitiesTitleType;
        private List<String> entitiesTitleLinksDbpedia;
        private List<String> entitiesBodyText;
        private List<String> entitiesBodyType;
        private List<String> entitiesBodyLinksDbpedia;
        private String sentimentTitlePolarity;
        private String sentimentBodyPolarity;
        private Integer mediaImagesCountMin;
        private Integer mediaImagesCountMax;
        private Integer mediaVideosCountMin;
        private Integer mediaVideosCountMax;
        private List<Integer> authorId;
        private String authorName;
        private List<Integer> sourceId;
        private List<String> sourceName;
        private List<String> sourceDomain;
        private List<String> sourceLocationsCountry;
        private List<String> sourceLocationsState;
        private List<String> sourceLocationsCity;
        private List<String> sourceScopesCountry;
        private List<String> sourceScopesState;
        private List<String> sourceScopesCity;
        private List<String> sourceScopesLevel;
        private Integer sourceLinksInCountMin;
        private Integer sourceLinksInCountMax;
        private Integer sourceRankingsAlexaRankMin;
        private Integer sourceRankingsAlexaRankMax;
        private List<String> sourceRankingsAlexaCountry;
        private String publishedAtStart;
        private String publishedAtEnd;
        private String period;

        public Builder setId(List<Long> id) {
            this.id = id;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setBody(String body) {
            this.body = body;
            return this;
        }

        public Builder setText(String text) {
            this.text = text;
            return this;
        }

        public Builder setLanguage(List<String> language) {
            this.language = language;
            return this;
        }

        public Builder setCategoriesTaxonomy(String categoriesTaxonomy) {
            this.categoriesTaxonomy = categoriesTaxonomy;
            return this;
        }

        public Builder setCategoriesConfident(Boolean categoriesConfident) {
            this.categoriesConfident = categoriesConfident;
            return this;
        }

        public Builder setCategoriesId(List<String> categoriesId) {
            this.categoriesId = categoriesId;
            return this;
        }

        public Builder setCategoriesLevel(List<Integer> categoriesLevel) {
            this.categoriesLevel = categoriesLevel;
            return this;
        }

        public Builder setEntitiesTitleText(List<String> entitiesTitleText) {
            this.entitiesTitleText = entitiesTitleText;
            return this;
        }

        public Builder setEntitiesTitleType(List<String> entitiesTitleType) {
            this.entitiesTitleType = entitiesTitleType;
            return this;
        }

        public Builder setEntitiesTitleLinksDbpedia(List<String> entitiesTitleLinksDbpedia) {
            this.entitiesTitleLinksDbpedia = entitiesTitleLinksDbpedia;
            return this;
        }

        public Builder setEntitiesBodyText(List<String> entitiesBodyText) {
            this.entitiesBodyText = entitiesBodyText;
            return this;
        }

        public Builder setEntitiesBodyType(List<String> entitiesBodyType) {
            this.entitiesBodyType = entitiesBodyType;
            return this;
        }

        public Builder setEntitiesBodyLinksDbpedia(List<String> entitiesBodyLinksDbpedia) {
            this.entitiesBodyLinksDbpedia = entitiesBodyLinksDbpedia;
            return this;
        }

        public Builder setSentimentTitlePolarity(String sentimentTitlePolarity) {
            this.sentimentTitlePolarity = sentimentTitlePolarity;
            return this;
        }

        public Builder setSentimentBodyPolarity(String sentimentBodyPolarity) {
            this.sentimentBodyPolarity = sentimentBodyPolarity;
            return this;
        }

        public Builder setMediaImagesCountMin(Integer mediaImagesCountMin) {
            this.mediaImagesCountMin = mediaImagesCountMin;
            return this;
        }

        public Builder setMediaImagesCountMax(Integer mediaImagesCountMax) {
            this.mediaImagesCountMax = mediaImagesCountMax;
            return this;
        }

        public Builder setMediaVideosCountMin(Integer mediaVideosCountMin) {
            this.mediaVideosCountMin = mediaVideosCountMin;
            return this;
        }

        public Builder setMediaVideosCountMax(Integer mediaVideosCountMax) {
            this.mediaVideosCountMax = mediaVideosCountMax;
            return this;
        }

        public Builder setAuthorId(List<Integer> authorId) {
            this.authorId = authorId;
            return this;
        }

        public Builder setAuthorName(String authorName) {
            this.authorName = authorName;
            return this;
        }

        public Builder setSourceId(List<Integer> sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        public Builder setSourceName(List<String> sourceName) {
            this.sourceName = sourceName;
            return this;
        }

        public Builder setSourceDomain(List<String> sourceDomain) {
            this.sourceDomain = sourceDomain;
            return this;
        }

        public Builder setSourceLocationsCountry(List<String> sourceLocationsCountry) {
            this.sourceLocationsCountry = sourceLocationsCountry;
            return this;
        }

        public Builder setSourceLocationsState(List<String> sourceLocationsState) {
            this.sourceLocationsState = sourceLocationsState;
            return this;
        }

        public Builder setSourceLocationsCity(List<String> sourceLocationsCity) {
            this.sourceLocationsCity = sourceLocationsCity;
            return this;
        }

        public Builder setSourceScopesCountry(List<String> sourceScopesCountry) {
            this.sourceScopesCountry = sourceScopesCountry;
            return this;
        }

        public Builder setSourceScopesState(List<String> sourceScopesState) {
            this.sourceScopesState = sourceScopesState;
            return this;
        }

        public Builder setSourceScopesCity(List<String> sourceScopesCity) {
            this.sourceScopesCity = sourceScopesCity;
            return this;
        }

        public Builder setSourceScopesLevel(List<String> sourceScopesLevel) {
            this.sourceScopesLevel = sourceScopesLevel;
            return this;
        }

        public Builder setSourceLinksInCountMin(Integer sourceLinksInCountMin) {
            this.sourceLinksInCountMin = sourceLinksInCountMin;
            return this;
        }

        public Builder setSourceLinksInCountMax(Integer sourceLinksInCountMax) {
            this.sourceLinksInCountMax = sourceLinksInCountMax;
            return this;
        }

        public Builder setSourceRankingsAlexaRankMin(Integer sourceRankingsAlexaRankMin) {
            this.sourceRankingsAlexaRankMin = sourceRankingsAlexaRankMin;
            return this;
        }

        public Builder setSourceRankingsAlexaRankMax(Integer sourceRankingsAlexaRankMax) {
            this.sourceRankingsAlexaRankMax = sourceRankingsAlexaRankMax;
            return this;
        }

        public Builder setSourceRankingsAlexaCountry(List<String> sourceRankingsAlexaCountry) {
            this.sourceRankingsAlexaCountry = sourceRankingsAlexaCountry;
            return this;
        }

        public Builder setPublishedAtStart(String publishedAtStart) {
            this.publishedAtStart = publishedAtStart;
            return this;
        }

        public Builder setPublishedAtEnd(String publishedAtEnd) {
            this.publishedAtEnd = publishedAtEnd;
            return this;
        }

        public Builder setPeriod(String period) {
            this.period = period;
            return this;
        }

        public TimeSeriesParams build() {
            return new TimeSeriesParams(id, title, body, text, language, categoriesTaxonomy, categoriesConfident, categoriesId, categoriesLevel, entitiesTitleText, entitiesTitleType, entitiesTitleLinksDbpedia, entitiesBodyText, entitiesBodyType, entitiesBodyLinksDbpedia, sentimentTitlePolarity, sentimentBodyPolarity, mediaImagesCountMin, mediaImagesCountMax, mediaVideosCountMin, mediaVideosCountMax, authorId, authorName, sourceId, sourceName, sourceDomain, sourceLocationsCountry, sourceLocationsState, sourceLocationsCity, sourceScopesCountry, sourceScopesState, sourceScopesCity, sourceScopesLevel, sourceLinksInCountMin, sourceLinksInCountMax, sourceRankingsAlexaRankMin, sourceRankingsAlexaRankMax, sourceRankingsAlexaCountry, publishedAtStart, publishedAtEnd, period);
        }
    }
}
