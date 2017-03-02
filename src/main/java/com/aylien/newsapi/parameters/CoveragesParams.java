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

import org.joda.time.DateTime;

import java.util.List;

public class CoveragesParams {
    private List<Long> id;
    private List<Long> notId;
    private String title;
    private String body;
    private String text;
    private List<String> language;
    private List<String> notLanguage;
    private String publishedAtStart;
    private String publishedAtEnd;
    private String categoriesTaxonomy;
    private Boolean categoriesConfident;
    private List<String> categoriesId;
    private List<String> notCategoriesId;
    private List<Integer> categoriesLevel;
    private List<Integer> notCategoriesLevel;
    private List<String> entitiesTitleText;
    private List<String> notEntitiesTitleText;
    private List<String> entitiesTitleType;
    private List<String> notEntitiesTitleType;
    private List<String> entitiesTitleLinksDbpedia;
    private List<String> notEntitiesTitleLinksDbpedia;
    private List<String> entitiesBodyText;
    private List<String> notEntitiesBodyText;
    private List<String> entitiesBodyType;
    private List<String> notEntitiesBodyType;
    private List<String> entitiesBodyLinksDbpedia;
    private List<String> notEntitiesBodyLinksDbpedia;
    private String sentimentTitlePolarity;
    private String notSentimentTitlePolarity;
    private String sentimentBodyPolarity;
    private String notSentimentBodyPolarity;
    private Integer mediaImagesCountMin;
    private Integer mediaImagesCountMax;
    private Integer mediaImagesWidthMin;
    private Integer mediaImagesWidthMax;
    private Integer mediaImagesHeightMin;
    private Integer mediaImagesHeightMax;
    private Integer mediaImagesContentLengthMin;
    private Integer mediaImagesContentLengthMax;
    private List<String> mediaImagesFormat;
    private List<String> notMediaImagesFormat;
    private Integer mediaVideosCountMin;
    private Integer mediaVideosCountMax;
    private List<Integer> authorId;
    private List<Integer> notAuthorId;
    private String authorName;
    private String notAuthorName;
    private List<Integer> sourceId;
    private List<Integer> notSourceId;
    private List<String> sourceName;
    private List<String> notSourceName;
    private List<String> sourceDomain;
    private List<String> notSourceDomain;
    private List<String> sourceLocationsCountry;
    private List<String> notSourceLocationsCountry;
    private List<String> sourceLocationsState;
    private List<String> notSourceLocationsState;
    private List<String> sourceLocationsCity;
    private List<String> notSourceLocationsCity;
    private List<String> sourceScopesCountry;
    private List<String> notSourceScopesCountry;
    private List<String> sourceScopesState;
    private List<String> notSourceScopesState;
    private List<String> sourceScopesCity;
    private List<String> notSourceScopesCity;
    private List<String> sourceScopesLevel;
    private List<String> notSourceScopesLevel;
    private Integer sourceLinksInCountMin;
    private Integer sourceLinksInCountMax;
    private Integer sourceRankingsAlexaRankMin;
    private Integer sourceRankingsAlexaRankMax;
    private List<String> sourceRankingsAlexaCountry;
    private Integer socialSharesCountFacebookMin;
    private Integer socialSharesCountFacebookMax;
    private Integer socialSharesCountGooglePlusMin;
    private Integer socialSharesCountGooglePlusMax;
    private Integer socialSharesCountLinkedinMin;
    private Integer socialSharesCountLinkedinMax;
    private Integer socialSharesCountRedditMin;
    private Integer socialSharesCountRedditMax;
    private Boolean cluster;
    private String clusterAlgorithm;
    private List<String> _return;
    private Long storyId;
    private String storyUrl;
    private String storyTitle;
    private String storyBody;
    private DateTime storyPublishedAt;
    private String storyLanguage;
    private Integer perPage;

    /**
     * Constructs parameters for Coverages endpoint
     *
     * @param id                             This parameter is used for finding stories by story id. (optional)
     * @param notId                          This parameter is used for excluding stories by story id. (optional)
     * @param title                          This parameter is used for finding stories whose title contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). (optional)
     * @param body                           This parameter is used for finding stories whose body contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). (optional)
     * @param text                           This parameter is used for finding stories whose title or body contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). (optional)
     * @param language                       This parameter is used for finding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes. (optional)
     * @param notLanguage                    This parameter is used for excluding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes. (optional)
     * @param publishedAtStart               This parameter is used for finding stories whose published at time is greater than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates). (optional)
     * @param publishedAtEnd                 This parameter is used for finding stories whose published at time is less than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates). (optional)
     * @param categoriesTaxonomy             This parameter is used for defining the type of the taxonomy for the rest of the categories queries. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). (optional)
     * @param categoriesConfident            This parameter is used for finding stories whose categories are confident. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). (optional, default to true)
     * @param categoriesId                   This parameter is used for finding stories by categories id. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). (optional)
     * @param notCategoriesId                This parameter is used for excluding stories by categories id. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). (optional)
     * @param categoriesLevel                This parameter is used for finding stories by categories level. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). (optional)
     * @param notCategoriesLevel             This parameter is used for excluding stories by categories level. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). (optional)
     * @param entitiesTitleText              This parameter is used to find stories based on the specified entities &#x60;text&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). (optional)
     * @param notEntitiesTitleText           This parameter is used to exclude stories based on the specified entities &#x60;text&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). (optional)
     * @param entitiesTitleType              This parameter is used to find stories based on the specified entities &#x60;type&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). (optional)
     * @param notEntitiesTitleType           This parameter is used to exclude stories based on the specified entities &#x60;type&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). (optional)
     * @param entitiesTitleLinksDbpedia      This parameter is used to find stories based on the specified entities dbpedia URL in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). (optional)
     * @param notEntitiesTitleLinksDbpedia   This parameter is used to exclude stories based on the specified entities dbpedia URL in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). (optional)
     * @param entitiesBodyText               This parameter is used to find stories based on the specified entities &#x60;text&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). (optional)
     * @param notEntitiesBodyText            This parameter is used to exclude stories based on the specified entities &#x60;text&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). (optional)
     * @param entitiesBodyType               This parameter is used to find stories based on the specified entities &#x60;type&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). (optional)
     * @param notEntitiesBodyType            This parameter is used to exclude stories based on the specified entities &#x60;type&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). (optional)
     * @param entitiesBodyLinksDbpedia       This parameter is used to find stories based on the specified entities dbpedia URL in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). (optional)
     * @param notEntitiesBodyLinksDbpedia    This parameter is used to exclude stories based on the specified entities dbpedia URL in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). (optional)
     * @param sentimentTitlePolarity         This parameter is used for finding stories whose title sentiment is the specified value. (optional)
     * @param notSentimentTitlePolarity      This parameter is used for excluding stories whose title sentiment is the specified value. (optional)
     * @param sentimentBodyPolarity          This parameter is used for finding stories whose body sentiment is the specified value. (optional)
     * @param notSentimentBodyPolarity       This parameter is used for excluding stories whose body sentiment is the specified value. (optional)
     * @param mediaImagesCountMin            This parameter is used for finding stories whose number of images is greater than or equal to the specified value. (optional)
     * @param mediaImagesCountMax            This parameter is used for finding stories whose number of images is less than or equal to the specified value. (optional)
     * @param mediaImagesWidthMin            This parameter is used for finding stories whose width of images are greater than or equal to the specified value. (optional)
     * @param mediaImagesWidthMax            This parameter is used for finding stories whose width of images are less than or equal to the specified value. (optional)
     * @param mediaImagesHeightMin           This parameter is used for finding stories whose height of images are greater than or equal to the specified value. (optional)
     * @param mediaImagesHeightMax           This parameter is used for finding stories whose height of images are less than or equal to the specified value. (optional)
     * @param mediaImagesContentLengthMin    This parameter is used for finding stories whose images content length are greater than or equal to the specified value. (optional)
     * @param mediaImagesContentLengthMax    This parameter is used for finding stories whose images content length are less than or equal to the specified value. (optional)
     * @param mediaImagesFormat              This parameter is used for finding stories whose images format are the specified value. (optional)
     * @param notMediaImagesFormat           This parameter is used for excluding stories whose images format are the specified value. (optional)
     * @param mediaVideosCountMin            This parameter is used for finding stories whose number of videos is greater than or equal to the specified value. (optional)
     * @param mediaVideosCountMax            This parameter is used for finding stories whose number of videos is less than or equal to the specified value. (optional)
     * @param authorId                       This parameter is used for finding stories whose author id is the specified value. (optional)
     * @param notAuthorId                    This parameter is used for excluding stories whose author id is the specified value. (optional)
     * @param authorName                     This parameter is used for finding stories whose author full name contains the specified value. (optional)
     * @param notAuthorName                  This parameter is used for excluding stories whose author full name contains the specified value. (optional)
     * @param sourceId                       This parameter is used for finding stories whose source id is the specified value. (optional)
     * @param notSourceId                    This parameter is used for excluding stories whose source id is the specified value. (optional)
     * @param sourceName                     This parameter is used for finding stories whose source name contains the specified value. (optional)
     * @param notSourceName                  This parameter is used for excluding stories whose source name contains the specified value. (optional)
     * @param sourceDomain                   This parameter is used for finding stories whose source domain is the specified value. (optional)
     * @param notSourceDomain                This parameter is used for excluding stories whose source domain is the specified value. (optional)
     * @param sourceLocationsCountry         This parameter is used for finding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). (optional)
     * @param notSourceLocationsCountry      This parameter is used for excluding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). (optional)
     * @param sourceLocationsState           This parameter is used for finding stories whose source state/province is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). (optional)
     * @param notSourceLocationsState        This parameter is used for excluding stories whose source state/province is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). (optional)
     * @param sourceLocationsCity            This parameter is used for finding stories whose source city is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). (optional)
     * @param notSourceLocationsCity         This parameter is used for excluding stories whose source city is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). (optional)
     * @param sourceScopesCountry            This parameter is used for finding stories whose source scopes  is the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). (optional)
     * @param notSourceScopesCountry         This parameter is used for excluding stories whose source scopes  is the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). (optional)
     * @param sourceScopesState              This parameter is used for finding stories whose source scopes is the specified state/province value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). (optional)
     * @param notSourceScopesState           This parameter is used for excluding stories whose source scopes is the specified state/province value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). (optional)
     * @param sourceScopesCity               This parameter is used for finding stories whose source scopes is the specified city value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). (optional)
     * @param notSourceScopesCity            This parameter is used for excluding stories whose source scopes is the specified city value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). (optional)
     * @param sourceScopesLevel              This parameter is used for finding stories whose source scopes  is the specified level value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). (optional)
     * @param notSourceScopesLevel           This parameter is used for excluding stories whose source scopes  is the specified level value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). (optional)
     * @param sourceLinksInCountMin          This parameter is used for finding stories from sources whose Links in count is greater than or equal to the specified value. You can read more about working with Links in count [here](https://newsapi.aylien.com/docs/working-with-links-in-count). (optional)
     * @param sourceLinksInCountMax          This parameter is used for finding stories from sources whose Links in count is less than or equal to the specified value. You can read more about working with Links in count [here](https://newsapi.aylien.com/docs/working-with-links-in-count). (optional)
     * @param sourceRankingsAlexaRankMin     This parameter is used for finding stories from sources whose Alexa rank is greater than or equal to the specified value. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks). (optional)
     * @param sourceRankingsAlexaRankMax     This parameter is used for finding stories from sources whose Alexa rank is less than or equal to the specified value. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks). (optional)
     * @param sourceRankingsAlexaCountry     This parameter is used for finding stories from sources whose Alexa rank is in the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks). (optional)
     * @param socialSharesCountFacebookMin   This parameter is used for finding stories whose Facebook social shares count is greater than or equal to the specified value. (optional)
     * @param socialSharesCountFacebookMax   This parameter is used for finding stories whose Facebook social shares count is less than or equal to the specified value. (optional)
     * @param socialSharesCountGooglePlusMin This parameter is used for finding stories whose Google+ social shares count is greater than or equal to the specified value. (optional)
     * @param socialSharesCountGooglePlusMax This parameter is used for finding stories whose Google+ social shares count is less than or equal to the specified value. (optional)
     * @param socialSharesCountLinkedinMin   This parameter is used for finding stories whose LinkedIn social shares count is greater than or equal to the specified value. (optional)
     * @param socialSharesCountLinkedinMax   This parameter is used for finding stories whose LinkedIn social shares count is less than or equal to the specified value. (optional)
     * @param socialSharesCountRedditMin     This parameter is used for finding stories whose Reddit social shares count is greater than or equal to the specified value. (optional)
     * @param socialSharesCountRedditMax     This parameter is used for finding stories whose Reddit social shares count is less than or equal to the specified value. (optional)
     * @param cluster                        This parameter enables clustering for the returned stories. You can read more about working with clustering [here](https://newsapi.aylien.com/docs/working-with-clustering). (optional, default to false)
     * @param clusterAlgorithm               This parameter is used for specifying the clustering algorithm you wish to use. It supprts STC, Lingo and [k-means](https://en.wikipedia.org/wiki/K-means_clustering) algorithms. You can read more about working with clustering [here](https://newsapi.aylien.com/docs/working-with-clustering). (optional, default to lingo)
     * @param _return                        This parameter is used for specifying return fields. (optional)
     * @param storyId                        A story id (optional)
     * @param storyUrl                       An article or webpage (optional)
     * @param storyTitle                     Title of the article (optional)
     * @param storyBody                      Body of the article (optional)
     * @param storyPublishedAt               Publish date of the article. If you use a url or title and body of an article for getting coverages, this parameter is required. The format used is a restricted form of the canonical representation of dateTime in the [XML Schema specification (ISO 8601)](https://www.w3.org/TR/xmlschema-2/#dateTime). (optional)
     * @param storyLanguage                  This parameter is used for setting the language of the story. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes. (optional, default to auto)
     * @param perPage                        This parameter is used for specifying number of items in each page. (optional, default to 3)
     */
    public CoveragesParams(List<Long> id, List<Long> notId, String title, String body, String text, List<String> language, List<String> notLanguage, String publishedAtStart, String publishedAtEnd, String categoriesTaxonomy, Boolean categoriesConfident, List<String> categoriesId, List<String> notCategoriesId, List<Integer> categoriesLevel, List<Integer> notCategoriesLevel, List<String> entitiesTitleText, List<String> notEntitiesTitleText, List<String> entitiesTitleType, List<String> notEntitiesTitleType, List<String> entitiesTitleLinksDbpedia, List<String> notEntitiesTitleLinksDbpedia, List<String> entitiesBodyText, List<String> notEntitiesBodyText, List<String> entitiesBodyType, List<String> notEntitiesBodyType, List<String> entitiesBodyLinksDbpedia, List<String> notEntitiesBodyLinksDbpedia, String sentimentTitlePolarity, String notSentimentTitlePolarity, String sentimentBodyPolarity, String notSentimentBodyPolarity, Integer mediaImagesCountMin, Integer mediaImagesCountMax, Integer mediaImagesWidthMin, Integer mediaImagesWidthMax, Integer mediaImagesHeightMin, Integer mediaImagesHeightMax, Integer mediaImagesContentLengthMin, Integer mediaImagesContentLengthMax, List<String> mediaImagesFormat, List<String> notMediaImagesFormat, Integer mediaVideosCountMin, Integer mediaVideosCountMax, List<Integer> authorId, List<Integer> notAuthorId, String authorName, String notAuthorName, List<Integer> sourceId, List<Integer> notSourceId, List<String> sourceName, List<String> notSourceName, List<String> sourceDomain, List<String> notSourceDomain, List<String> sourceLocationsCountry, List<String> notSourceLocationsCountry, List<String> sourceLocationsState, List<String> notSourceLocationsState, List<String> sourceLocationsCity, List<String> notSourceLocationsCity, List<String> sourceScopesCountry, List<String> notSourceScopesCountry, List<String> sourceScopesState, List<String> notSourceScopesState, List<String> sourceScopesCity, List<String> notSourceScopesCity, List<String> sourceScopesLevel, List<String> notSourceScopesLevel, Integer sourceLinksInCountMin, Integer sourceLinksInCountMax, Integer sourceRankingsAlexaRankMin, Integer sourceRankingsAlexaRankMax, List<String> sourceRankingsAlexaCountry, Integer socialSharesCountFacebookMin, Integer socialSharesCountFacebookMax, Integer socialSharesCountGooglePlusMin, Integer socialSharesCountGooglePlusMax, Integer socialSharesCountLinkedinMin, Integer socialSharesCountLinkedinMax, Integer socialSharesCountRedditMin, Integer socialSharesCountRedditMax, Boolean cluster, String clusterAlgorithm, List<String> _return, Long storyId, String storyUrl, String storyTitle, String storyBody, DateTime storyPublishedAt, String storyLanguage, Integer perPage) {
        this.id = id;
        this.notId = notId;
        this.title = title;
        this.body = body;
        this.text = text;
        this.language = language;
        this.notLanguage = notLanguage;
        this.publishedAtStart = publishedAtStart;
        this.publishedAtEnd = publishedAtEnd;
        this.categoriesTaxonomy = categoriesTaxonomy;
        this.categoriesConfident = categoriesConfident;
        this.categoriesId = categoriesId;
        this.notCategoriesId = notCategoriesId;
        this.categoriesLevel = categoriesLevel;
        this.notCategoriesId = notCategoriesId;
        this.entitiesTitleText = entitiesTitleText;
        this.notEntitiesTitleText = notEntitiesTitleText;
        this.entitiesTitleType = entitiesTitleType;
        this.notEntitiesTitleType = notEntitiesTitleType;
        this.entitiesTitleLinksDbpedia = entitiesTitleLinksDbpedia;
        this.notEntitiesTitleLinksDbpedia = notEntitiesTitleLinksDbpedia;
        this.entitiesBodyText = entitiesBodyText;
        this.notEntitiesBodyText = notEntitiesBodyText;
        this.entitiesBodyType = entitiesBodyType;
        this.notEntitiesBodyType = notEntitiesBodyType;
        this.entitiesBodyLinksDbpedia = entitiesBodyLinksDbpedia;
        this.notEntitiesBodyLinksDbpedia = notEntitiesBodyLinksDbpedia;
        this.sentimentTitlePolarity = sentimentTitlePolarity;
        this.notSentimentTitlePolarity = notSentimentTitlePolarity;
        this.sentimentBodyPolarity = sentimentBodyPolarity;
        this.notSentimentBodyPolarity = notSentimentBodyPolarity;
        this.mediaImagesCountMin = mediaImagesCountMin;
        this.mediaImagesCountMax = mediaImagesCountMax;
        this.mediaImagesWidthMin = mediaImagesWidthMin;
        this.mediaImagesWidthMax = mediaImagesWidthMax;
        this.mediaImagesHeightMin = mediaImagesHeightMin;
        this.mediaImagesHeightMax = mediaImagesHeightMax;
        this.mediaImagesContentLengthMin = mediaImagesContentLengthMin;
        this.mediaImagesContentLengthMax = mediaImagesContentLengthMax;
        this.mediaImagesFormat = mediaImagesFormat;
        this.notMediaImagesFormat = notMediaImagesFormat;
        this.mediaVideosCountMin = mediaVideosCountMin;
        this.mediaVideosCountMax = mediaVideosCountMax;
        this.authorId = authorId;
        this.notAuthorId = notAuthorId;
        this.authorName = authorName;
        this.notAuthorName = notAuthorName;
        this.sourceId = sourceId;
        this.notSourceId = notSourceId;
        this.sourceName = sourceName;
        this.notSourceName = notSourceName;
        this.sourceDomain = sourceDomain;
        this.notSourceDomain = notSourceDomain;
        this.sourceLocationsCountry = sourceLocationsCountry;
        this.notSourceLocationsCountry = notSourceLocationsCountry;
        this.sourceLocationsState = sourceLocationsState;
        this.notSourceLocationsState = notSourceLocationsState;
        this.sourceLocationsCity = sourceLocationsCity;
        this.notSourceLocationsCity = notSourceLocationsCity;
        this.sourceScopesCountry = sourceScopesCountry;
        this.notSourceScopesCountry = notSourceScopesCountry;
        this.sourceScopesState = sourceScopesState;
        this.notSourceScopesState = notSourceScopesState;
        this.sourceScopesCity = sourceScopesCity;
        this.notSourceScopesCity = notSourceScopesCity;
        this.sourceScopesLevel = sourceScopesLevel;
        this.notSourceScopesLevel = notSourceScopesLevel;
        this.sourceLinksInCountMin = sourceLinksInCountMin;
        this.sourceLinksInCountMax = sourceLinksInCountMax;
        this.sourceRankingsAlexaRankMin = sourceRankingsAlexaRankMin;
        this.sourceRankingsAlexaRankMax = sourceRankingsAlexaRankMax;
        this.sourceRankingsAlexaCountry = sourceRankingsAlexaCountry;
        this.socialSharesCountFacebookMin = socialSharesCountFacebookMin;
        this.socialSharesCountFacebookMax = socialSharesCountFacebookMax;
        this.socialSharesCountGooglePlusMin = socialSharesCountGooglePlusMin;
        this.socialSharesCountGooglePlusMax = socialSharesCountGooglePlusMax;
        this.socialSharesCountLinkedinMin = socialSharesCountLinkedinMin;
        this.socialSharesCountLinkedinMax = socialSharesCountLinkedinMax;
        this.socialSharesCountRedditMin = socialSharesCountRedditMin;
        this.socialSharesCountRedditMax = socialSharesCountRedditMax;
        this.cluster = cluster;
        this.clusterAlgorithm = clusterAlgorithm;
        this._return = _return;
        this.storyId = storyId;
        this.storyUrl = storyUrl;
        this.storyTitle = storyTitle;
        this.storyBody = storyBody;
        this.storyPublishedAt = storyPublishedAt;
        this.storyLanguage = storyLanguage;
        this.perPage = perPage;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public List<Long> getId() {
        return id;
    }

    public List<Long> getNotId() {
        return notId;
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

    public List<String> getNotLanguage() {
        return notLanguage;
    }

    public String getPublishedAtStart() {
        return publishedAtStart;
    }

    public String getPublishedAtEnd() {
        return publishedAtEnd;
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

    public List<String> getNotCategoriesId() {
        return notCategoriesId;
    }

    public List<Integer> getCategoriesLevel() {
        return categoriesLevel;
    }

    public List<Integer> getNotCategoriesLevel() {
        return notCategoriesLevel;
    }

    public List<String> getEntitiesTitleText() {
        return entitiesTitleText;
    }

    public List<String> getNotEntitiesTitleText() {
        return notEntitiesTitleText;
    }

    public List<String> getEntitiesTitleType() {
        return entitiesTitleType;
    }

    public List<String> getNotEntitiesTitleType() {
        return notEntitiesTitleType;
    }


    public List<String> getEntitiesTitleLinksDbpedia() {
        return entitiesTitleLinksDbpedia;
    }

    public List<String> getNotEntitiesTitleLinksDbpedia() {
        return notEntitiesTitleLinksDbpedia;
    }

    public List<String> getEntitiesBodyText() {
        return entitiesBodyText;
    }

    public List<String> getNotEntitiesBodyText() {
        return notEntitiesBodyText;
    }

    public List<String> getEntitiesBodyType() {
        return entitiesBodyType;
    }

    public List<String> getNotEntitiesBodyType() {
        return notEntitiesBodyType;
    }

    public List<String> getEntitiesBodyLinksDbpedia() {
        return entitiesBodyLinksDbpedia;
    }

    public List<String> getNotEntitiesBodyLinksDbpedia() {
        return notEntitiesBodyLinksDbpedia;
    }

    public String getSentimentTitlePolarity() {
        return sentimentTitlePolarity;
    }

    public String getNotSentimentTitlePolarity() {
        return notSentimentTitlePolarity;
    }

    public String getSentimentBodyPolarity() {
        return sentimentBodyPolarity;
    }

    public String getNotSentimentBodyPolarity() {
        return notSentimentBodyPolarity;
    }

    public Integer getMediaImagesCountMin() {
        return mediaImagesCountMin;
    }

    public Integer getMediaImagesCountMax() {
        return mediaImagesCountMax;
    }

    public Integer getMediaImagesWidthMin() {
        return mediaImagesWidthMin;
    }

    public Integer getMediaImagesWidthMax() {
        return mediaImagesWidthMax;
    }

    public Integer getMediaImagesHeightMin() {
        return mediaImagesHeightMin;
    }

    public Integer getMediaImagesHeightMax() {
        return mediaImagesHeightMax;
    }

    public Integer getMediaImagesContentLengthMin() {
        return mediaImagesContentLengthMin;
    }

    public Integer getMediaImagesContentLengthMax() {
        return mediaImagesContentLengthMax;
    }

    public List<String> getMediaImagesFormat() {
        return mediaImagesFormat;
    }

    public List<String> getNotMediaImagesFormat() {
        return notMediaImagesFormat;
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

    public List<Integer> getNotAuthorId() {
        return notAuthorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getNotAuthorName() {
        return notAuthorName;
    }

    public List<Integer> getSourceId() {
        return sourceId;
    }

    public List<Integer> getNotSourceId() {
        return notSourceId;
    }

    public List<String> getSourceName() {
        return sourceName;
    }

    public List<String> getNotSourceName() {
        return notSourceName;
    }

    public List<String> getSourceDomain() {
        return sourceDomain;
    }

    public List<String> getNotSourceDomain() {
        return notSourceDomain;
    }

    public List<String> getSourceLocationsCountry() {
        return sourceLocationsCountry;
    }

    public List<String> getNotSourceLocationsCountry() {
        return notSourceLocationsCountry;
    }

    public List<String> getSourceLocationsState() {
        return sourceLocationsState;
    }

    public List<String> getNotSourceLocationsState() {
        return notSourceLocationsState;
    }

    public List<String> getSourceLocationsCity() {
        return sourceLocationsCity;
    }

    public List<String> getNotSourceLocationsCity() {
        return notSourceLocationsCity;
    }

    public List<String> getSourceScopesCountry() {
        return sourceScopesCountry;
    }

    public List<String> getNotSourceScopesCountry() {
        return notSourceScopesCountry;
    }

    public List<String> getSourceScopesState() {
        return sourceScopesState;
    }

    public List<String> getNotSourceScopesState() {
        return notSourceScopesState;
    }

    public List<String> getSourceScopesCity() {
        return sourceScopesCity;
    }

    public List<String> getNotSourceScopesCity() {
        return notSourceScopesCity;
    }

    public List<String> getSourceScopesLevel() {
        return sourceScopesLevel;
    }

    public List<String> getNotSourceScopesLevel() {
        return notSourceScopesLevel;
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

    public Integer getSocialSharesCountFacebookMin() {
        return socialSharesCountFacebookMin;
    }

    public Integer getSocialSharesCountFacebookMax() {
        return socialSharesCountFacebookMax;
    }

    public Integer getSocialSharesCountGooglePlusMin() {
        return socialSharesCountGooglePlusMin;
    }

    public Integer getSocialSharesCountGooglePlusMax() {
        return socialSharesCountGooglePlusMax;
    }

    public Integer getSocialSharesCountLinkedinMin() {
        return socialSharesCountLinkedinMin;
    }

    public Integer getSocialSharesCountLinkedinMax() {
        return socialSharesCountLinkedinMax;
    }

    public Integer getSocialSharesCountRedditMin() {
        return socialSharesCountRedditMin;
    }

    public Integer getSocialSharesCountRedditMax() {
        return socialSharesCountRedditMax;
    }

    public Boolean getCluster() {
        return cluster;
    }

    public String getClusterAlgorithm() {
        return clusterAlgorithm;
    }

    public List<String> get_return() {
        return _return;
    }

    public Integer getPerPage() {
        return perPage;
    }

    public Long getStoryId() {
        return storyId;
    }

    public String getStoryUrl() {
        return storyUrl;
    }

    public String getStoryTitle() {
        return storyTitle;
    }

    public String getStoryBody() {
        return storyBody;
    }

    public DateTime getStoryPublishedAt() {
        return storyPublishedAt;
    }

    public String getStoryLanguage() {
        return storyLanguage;
    }


    public static class Builder {
        private List<Long> id;
        private List<Long> notId;
        private String title;
        private String body;
        private String text;
        private List<String> language;
        private List<String> notLanguage;
        private String publishedAtStart;
        private String publishedAtEnd;
        private String categoriesTaxonomy;
        private Boolean categoriesConfident;
        private List<String> categoriesId;
        private List<String> notCategoriesId;
        private List<Integer> categoriesLevel;
        private List<Integer> notCategoriesLevel;
        private List<String> entitiesTitleText;
        private List<String> notEntitiesTitleText;
        private List<String> entitiesTitleType;
        private List<String> notEntitiesTitleType;
        private List<String> entitiesTitleLinksDbpedia;
        private List<String> notEntitiesTitleLinksDbpedia;
        private List<String> entitiesBodyText;
        private List<String> notEntitiesBodyText;
        private List<String> entitiesBodyType;
        private List<String> notEntitiesBodyType;
        private List<String> entitiesBodyLinksDbpedia;
        private List<String> notEntitiesBodyLinksDbpedia;
        private String sentimentTitlePolarity;
        private String notSentimentTitlePolarity;
        private String sentimentBodyPolarity;
        private String notSentimentBodyPolarity;
        private Integer mediaImagesCountMin;
        private Integer mediaImagesCountMax;
        private Integer mediaImagesWidthMin;
        private Integer mediaImagesWidthMax;
        private Integer mediaImagesHeightMin;
        private Integer mediaImagesHeightMax;
        private Integer mediaImagesContentLengthMin;
        private Integer mediaImagesContentLengthMax;
        private List<String> mediaImagesFormat;
        private List<String> notMediaImagesFormat;
        private Integer mediaVideosCountMin;
        private Integer mediaVideosCountMax;
        private List<Integer> authorId;
        private List<Integer> notAuthorId;
        private String authorName;
        private String notAuthorName;
        private List<Integer> sourceId;
        private List<Integer> notSourceId;
        private List<String> sourceName;
        private List<String> notSourceName;
        private List<String> sourceDomain;
        private List<String> notSourceDomain;
        private List<String> sourceLocationsCountry;
        private List<String> notSourceLocationsCountry;
        private List<String> sourceLocationsState;
        private List<String> notSourceLocationsState;
        private List<String> sourceLocationsCity;
        private List<String> notSourceLocationsCity;
        private List<String> sourceScopesCountry;
        private List<String> notSourceScopesCountry;
        private List<String> sourceScopesState;
        private List<String> notSourceScopesState;
        private List<String> sourceScopesCity;
        private List<String> notSourceScopesCity;
        private List<String> sourceScopesLevel;
        private List<String> notSourceScopesLevel;
        private Integer sourceLinksInCountMin;
        private Integer sourceLinksInCountMax;
        private Integer sourceRankingsAlexaRankMin;
        private Integer sourceRankingsAlexaRankMax;
        private List<String> sourceRankingsAlexaCountry;
        private Integer socialSharesCountFacebookMin;
        private Integer socialSharesCountFacebookMax;
        private Integer socialSharesCountGooglePlusMin;
        private Integer socialSharesCountGooglePlusMax;
        private Integer socialSharesCountLinkedinMin;
        private Integer socialSharesCountLinkedinMax;
        private Integer socialSharesCountRedditMin;
        private Integer socialSharesCountRedditMax;
        private Boolean cluster;
        private String clusterAlgorithm;
        private List<String> _return;
        private Long storyId;
        private String storyUrl;
        private String storyTitle;
        private String storyBody;
        private DateTime storyPublishedAt;
        private String storyLanguage;
        private Integer perPage;

        public Builder setId(List<Long> id) {
            this.id = id;
            return this;
        }

        public Builder setNotId(List<Long> notId) {
            this.notId = notId;
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

        public Builder setNotLanguage(List<String> notLanguage) {
            this.notLanguage = notLanguage;
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

        public Builder setNotCategoriesId(List<String> notCategoriesId) {
            this.notCategoriesId = notCategoriesId;
            return this;
        }

        public Builder setCategoriesLevel(List<Integer> categoriesLevel) {
            this.categoriesLevel = categoriesLevel;
            return this;
        }

        public Builder setNotCategoriesLevel(List<Integer> notCategoriesLevel) {
            this.notCategoriesLevel = notCategoriesLevel;
            return this;
        }

        public Builder setEntitiesTitleText(List<String> entitiesTitleText) {
            this.entitiesTitleText = entitiesTitleText;
            return this;
        }

        public Builder setNotEntitiesTitleText(List<String> notEntitiesTitleText) {
            this.notEntitiesTitleText = notEntitiesTitleText;
            return this;
        }

        public Builder setEntitiesTitleType(List<String> entitiesTitleType) {
            this.entitiesTitleType = entitiesTitleType;
            return this;
        }

        public Builder setNotEntitiesTitleType(List<String> notEntitiesTitleType) {
            this.notEntitiesTitleType = notEntitiesTitleType;
            return this;
        }

        public Builder setEntitiesTitleLinksDbpedia(List<String> entitiesTitleLinksDbpedia) {
            this.entitiesTitleLinksDbpedia = entitiesTitleLinksDbpedia;
            return this;
        }

        public Builder setNotEntitiesTitleLinksDbpedia(List<String> notEntitiesTitleLinksDbpedia) {
            this.notEntitiesTitleLinksDbpedia = notEntitiesTitleLinksDbpedia;
            return this;
        }

        public Builder setEntitiesBodyText(List<String> entitiesBodyText) {
            this.entitiesBodyText = entitiesBodyText;
            return this;
        }

        public Builder setNotEntitiesBodyText(List<String> notEntitiesBodyText) {
            this.notEntitiesBodyText = notEntitiesBodyText;
            return this;
        }

        public Builder setEntitiesBodyType(List<String> entitiesBodyType) {
            this.entitiesBodyType = entitiesBodyType;
            return this;
        }

        public Builder setNotEntitiesBodyType(List<String> notEntitiesBodyType) {
            this.notEntitiesBodyType = notEntitiesBodyType;
            return this;
        }

        public Builder setEntitiesBodyLinksDbpedia(List<String> entitiesBodyLinksDbpedia) {
            this.entitiesBodyLinksDbpedia = entitiesBodyLinksDbpedia;
            return this;
        }

        public Builder setNotEntitiesBodyLinksDbpedia(List<String> notEntitiesBodyLinksDbpedia) {
            this.notEntitiesBodyLinksDbpedia = notEntitiesBodyLinksDbpedia;
            return this;
        }

        public Builder setSentimentTitlePolarity(String sentimentTitlePolarity) {
            this.sentimentTitlePolarity = sentimentTitlePolarity;
            return this;
        }

        public Builder setNotSentimentTitlePolarity(String notSentimentTitlePolarity) {
            this.notSentimentTitlePolarity = notSentimentTitlePolarity;
            return this;
        }

        public Builder setSentimentBodyPolarity(String sentimentBodyPolarity) {
            this.sentimentBodyPolarity = sentimentBodyPolarity;
            return this;
        }

        public Builder setNotSentimentBodyPolarity(String notSentimentBodyPolarity) {
            this.notSentimentBodyPolarity = notSentimentBodyPolarity;
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

        public Builder setMediaImagesWidthMin(Integer mediaImagesWidthMin) {
            this.mediaImagesWidthMin = mediaImagesWidthMin;
            return this;
        }

        public Builder setMediaImagesWidthMax(Integer mediaImagesWidthMax) {
            this.mediaImagesWidthMax = mediaImagesWidthMax;
            return this;
        }

        public Builder setMediaImagesHeightMin(Integer mediaImagesHeightMin) {
            this.mediaImagesHeightMin = mediaImagesHeightMin;
            return this;
        }

        public Builder setMediaImagesHeightMax(Integer mediaImagesHeightMax) {
            this.mediaImagesHeightMax = mediaImagesHeightMax;
            return this;
        }

        public Builder setMediaImagesContentLengthMin(Integer mediaImagesContentLengthMin) {
            this.mediaImagesContentLengthMin = mediaImagesContentLengthMin;
            return this;
        }

        public Builder setMediaImagesContentLengthMax(Integer mediaImagesContentLengthMax) {
            this.mediaImagesContentLengthMax = mediaImagesContentLengthMax;
            return this;
        }

        public Builder setMediaImagesFormat(List<String> mediaImagesFormat) {
            this.mediaImagesFormat = mediaImagesFormat;
            return this;
        }

        public Builder setNotMediaImagesFormat(List<String> notMediaImagesFormat) {
            this.notMediaImagesFormat = notMediaImagesFormat;
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

        public Builder setNotAuthorId(List<Integer> notAuthorId) {
            this.notAuthorId = notAuthorId;
            return this;
        }

        public Builder setAuthorName(String authorName) {
            this.authorName = authorName;
            return this;
        }

        public Builder setNotAuthorName(String notAuthorName) {
            this.notAuthorName = notAuthorName;
            return this;
        }

        public Builder setSourceId(List<Integer> sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        public Builder setNotSourceId(List<Integer> notSourceId) {
            this.notSourceId = notSourceId;
            return this;
        }

        public Builder setSourceName(List<String> sourceName) {
            this.sourceName = sourceName;
            return this;
        }

        public Builder setNotSourceName(List<String> notSourceName) {
            this.notSourceName = notSourceName;
            return this;
        }

        public Builder setSourceDomain(List<String> sourceDomain) {
            this.sourceDomain = sourceDomain;
            return this;
        }

        public Builder setNotSourceDomain(List<String> notSourceDomain) {
            this.notSourceDomain = notSourceDomain;
            return this;
        }

        public Builder setSourceLocationsCountry(List<String> sourceLocationsCountry) {
            this.sourceLocationsCountry = sourceLocationsCountry;
            return this;
        }

        public Builder setNotSourceLocationsCountry(List<String> notSourceLocationsCountry) {
            this.notSourceLocationsCountry = notSourceLocationsCountry;
            return this;
        }

        public Builder setSourceLocationsState(List<String> sourceLocationsState) {
            this.sourceLocationsState = sourceLocationsState;
            return this;
        }

        public Builder setNotSourceLocationsState(List<String> notSourceLocationsState) {
            this.notSourceLocationsState = notSourceLocationsState;
            return this;
        }

        public Builder setSourceLocationsCity(List<String> sourceLocationsCity) {
            this.sourceLocationsCity = sourceLocationsCity;
            return this;
        }

        public Builder setNotSourceLocationsCity(List<String> notSourceLocationsCity) {
            this.notSourceLocationsCity = notSourceLocationsCity;
            return this;
        }

        public Builder setSourceScopesCountry(List<String> sourceScopesCountry) {
            this.sourceScopesCountry = sourceScopesCountry;
            return this;
        }

        public Builder setNotSourceScopesCountry(List<String> notSourceScopesCountry) {
            this.notSourceScopesCountry = notSourceScopesCountry;
            return this;
        }

        public Builder setSourceScopesState(List<String> sourceScopesState) {
            this.sourceScopesState = sourceScopesState;
            return this;
        }

        public Builder setNotSourceScopesState(List<String> notSourceScopesState) {
            this.notSourceScopesState = notSourceScopesState;
            return this;
        }

        public Builder setSourceScopesCity(List<String> sourceScopesCity) {
            this.sourceScopesCity = sourceScopesCity;
            return this;
        }

        public Builder setNotSourceScopesCity(List<String> notSourceScopesCity) {
            this.notSourceScopesCity = notSourceScopesCity;
            return this;
        }

        public Builder setSourceScopesLevel(List<String> sourceScopesLevel) {
            this.sourceScopesLevel = sourceScopesLevel;
            return this;
        }

        public Builder setNotSourceScopesLevel(List<String> notSourceScopesLevel) {
            this.notSourceScopesLevel = notSourceScopesLevel;
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

        public Builder setSocialSharesCountFacebookMin(Integer socialSharesCountFacebookMin) {
            this.socialSharesCountFacebookMin = socialSharesCountFacebookMin;
            return this;
        }

        public Builder setSocialSharesCountFacebookMax(Integer socialSharesCountFacebookMax) {
            this.socialSharesCountFacebookMax = socialSharesCountFacebookMax;
            return this;
        }

        public Builder setSocialSharesCountGooglePlusMin(Integer socialSharesCountGooglePlusMin) {
            this.socialSharesCountGooglePlusMin = socialSharesCountGooglePlusMin;
            return this;
        }

        public Builder setSocialSharesCountGooglePlusMax(Integer socialSharesCountGooglePlusMax) {
            this.socialSharesCountGooglePlusMax = socialSharesCountGooglePlusMax;
            return this;
        }

        public Builder setSocialSharesCountLinkedinMin(Integer socialSharesCountLinkedinMin) {
            this.socialSharesCountLinkedinMin = socialSharesCountLinkedinMin;
            return this;
        }

        public Builder setSocialSharesCountLinkedinMax(Integer socialSharesCountLinkedinMax) {
            this.socialSharesCountLinkedinMax = socialSharesCountLinkedinMax;
            return this;
        }

        public Builder setSocialSharesCountRedditMin(Integer socialSharesCountRedditMin) {
            this.socialSharesCountRedditMin = socialSharesCountRedditMin;
            return this;
        }

        public Builder setSocialSharesCountRedditMax(Integer socialSharesCountRedditMax) {
            this.socialSharesCountRedditMax = socialSharesCountRedditMax;
            return this;
        }

        public Builder setCluster(Boolean cluster) {
            this.cluster = cluster;
            return this;
        }

        public Builder setClusterAlgorithm(String clusterAlgorithm) {
            this.clusterAlgorithm = clusterAlgorithm;
            return this;
        }

        public Builder set_return(List<String> _return) {
            this._return = _return;
            return this;
        }

        public Builder setStoryId(Long storyId) {
            this.storyId = storyId;
            return this;
        }

        public Builder setStoryUrl(String storyUrl) {
            this.storyUrl = storyUrl;
            return this;
        }

        public Builder setStoryTitle(String storyTitle) {
            this.storyTitle = storyTitle;
            return this;
        }

        public Builder setStoryBody(String storyBody) {
            this.storyBody = storyBody;
            return this;
        }

        public Builder setStoryPublishedAt(DateTime storyPublishedAt) {
            this.storyPublishedAt = storyPublishedAt;
            return this;
        }

        public Builder setStoryLanguage(String storyLanguage) {
            this.storyLanguage = storyLanguage;
            return this;
        }

        public Builder setPerPage(Integer perPage) {
            this.perPage = perPage;
            return this;
        }

        public CoveragesParams build() {
            return new CoveragesParams(id, notId, title, body, text, language, notLanguage, publishedAtStart, publishedAtEnd, categoriesTaxonomy, categoriesConfident, categoriesId, notCategoriesId, categoriesLevel, notCategoriesLevel, entitiesTitleText, notEntitiesTitleText, entitiesTitleType, notEntitiesTitleType, entitiesTitleLinksDbpedia, notEntitiesTitleLinksDbpedia, entitiesBodyText, notEntitiesBodyText, entitiesBodyType, notEntitiesBodyType, entitiesBodyLinksDbpedia, notEntitiesBodyLinksDbpedia, sentimentTitlePolarity, notSentimentTitlePolarity, sentimentBodyPolarity, notSentimentBodyPolarity, mediaImagesCountMin, mediaImagesCountMax, mediaImagesWidthMin, mediaImagesWidthMax, mediaImagesHeightMin, mediaImagesHeightMax, mediaImagesContentLengthMin, mediaImagesContentLengthMax, mediaImagesFormat, notMediaImagesFormat, mediaVideosCountMin, mediaVideosCountMax, authorId, notAuthorId, authorName, notAuthorName, sourceId, notSourceId, sourceName, notSourceName, sourceDomain, notSourceDomain, sourceLocationsCountry, notSourceLocationsCountry, sourceLocationsState, notSourceLocationsState, sourceLocationsCity, notSourceLocationsCity, sourceScopesCountry, notSourceScopesCountry, sourceScopesState, notSourceScopesState, sourceScopesCity, notSourceScopesCity, sourceScopesLevel, notSourceScopesLevel, sourceLinksInCountMin, sourceLinksInCountMax, sourceRankingsAlexaRankMin, sourceRankingsAlexaRankMax, sourceRankingsAlexaCountry, socialSharesCountFacebookMin, socialSharesCountFacebookMax, socialSharesCountGooglePlusMin, socialSharesCountGooglePlusMax, socialSharesCountLinkedinMin, socialSharesCountLinkedinMax, socialSharesCountRedditMin, socialSharesCountRedditMax, cluster, clusterAlgorithm, _return, storyId, storyUrl, storyTitle, storyBody, storyPublishedAt, storyLanguage, perPage);
        }
    }
}
