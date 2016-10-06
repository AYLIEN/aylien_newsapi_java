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

package com.aylien.newsapi.api;

import com.aylien.newsapi.ApiClient;
import com.aylien.newsapi.ApiException;
import com.aylien.newsapi.Configuration;
import com.aylien.newsapi.Pair;
import com.aylien.newsapi.models.*;
import com.aylien.newsapi.parameters.*;
import com.sun.jersey.api.client.GenericType;
import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DefaultApi {
    private ApiClient apiClient;

    public DefaultApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DefaultApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * List autocompletes
     * This endpoint is used for getting list of autocompletes by providing a specific term and type.
     *
     * @param autocompletesParams Autocompletes parameters
     * @return Autocompletes
     * @throws ApiException if fails to make API call
     */
    public Autocompletes listAutocompletes(AutocompletesParams autocompletesParams) throws ApiException {
        Object localVarPostBody = null;

        // setting builder variables
        String type = autocompletesParams.getType();
        String term = autocompletesParams.getTerm();
        String language = autocompletesParams.getLanguage();
        Integer perPage = autocompletesParams.getPerPage();

        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException(400, "Missing the required parameter 'type' when calling listAutocompletes");
        }

        // verify the required parameter 'term' is set
        if (term == null) {
            throw new ApiException(400, "Missing the required parameter 'term' when calling listAutocompletes");
        }

        // create path and map variables
        String localVarPath = "/autocompletes".replaceAll("\\{format\\}", "json");

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        List<Pair> localVarFormParams = new ArrayList<Pair>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "term", term));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "language", language));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "per_page", perPage));


        final String[] localVarAccepts = {
                "application/json", "text/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = {
                "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{"app_key", "app_id"};

        GenericType<Autocompletes> localVarReturnType = new GenericType<Autocompletes>() {
        };
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List coverages
     * This endpoint is used for finding story coverages based on the parameters provided. The maximum number of related stories returned is 100.
     *
     * @param coveragesParams Coverages parameters
     * @return Coverages
     * @throws ApiException if fails to make API call
     */
    public Coverages listCoverages(CoveragesParams coveragesParams) throws ApiException {
        Object localVarPostBody = null;

        // setting builder variables
        List<Long> id = coveragesParams.getId();
        String title = coveragesParams.getTitle();
        String body = coveragesParams.getBody();
        String text = coveragesParams.getText();
        List<String> language = coveragesParams.getLanguage();
        String publishedAtStart = coveragesParams.getPublishedAtStart();
        String publishedAtEnd = coveragesParams.getPublishedAtEnd();
        String categoriesTaxonomy = coveragesParams.getCategoriesTaxonomy();
        Boolean categoriesConfident = coveragesParams.getCategoriesConfident();
        List<String> categoriesId = coveragesParams.getCategoriesId();
        List<Integer> categoriesLevel = coveragesParams.getCategoriesLevel();
        List<String> entitiesTitleText = coveragesParams.getEntitiesTitleText();
        List<String> entitiesTitleType = coveragesParams.getEntitiesTitleType();
        List<String> entitiesTitleLinksDbpedia = coveragesParams.getEntitiesTitleLinksDbpedia();
        List<String> entitiesBodyText = coveragesParams.getEntitiesBodyText();
        List<String> entitiesBodyType = coveragesParams.getEntitiesBodyType();
        List<String> entitiesBodyLinksDbpedia = coveragesParams.getEntitiesBodyLinksDbpedia();
        String sentimentTitlePolarity = coveragesParams.getSentimentTitlePolarity();
        String sentimentBodyPolarity = coveragesParams.getSentimentBodyPolarity();
        Integer mediaImagesCountMin = coveragesParams.getMediaImagesCountMin();
        Integer mediaImagesCountMax = coveragesParams.getMediaImagesCountMax();
        Integer mediaVideosCountMin = coveragesParams.getMediaVideosCountMin();
        Integer mediaVideosCountMax = coveragesParams.getMediaVideosCountMax();
        List<Integer> authorId = coveragesParams.getAuthorId();
        String authorName = coveragesParams.getAuthorName();
        List<Integer> sourceId = coveragesParams.getSourceId();
        List<String> sourceName = coveragesParams.getSourceName();
        List<String> sourceDomain = coveragesParams.getSourceDomain();
        List<String> sourceLocationsCountry = coveragesParams.getSourceLocationsCountry();
        List<String> sourceLocationsState = coveragesParams.getSourceLocationsState();
        List<String> sourceLocationsCity = coveragesParams.getSourceLocationsCity();
        List<String> sourceScopesCountry = coveragesParams.getSourceScopesCountry();
        List<String> sourceScopesState = coveragesParams.getSourceScopesState();
        List<String> sourceScopesCity = coveragesParams.getSourceScopesCity();
        List<String> sourceScopesLevel = coveragesParams.getSourceScopesLevel();
        Integer sourceLinksInCountMin = coveragesParams.getSourceLinksInCountMin();
        Integer sourceLinksInCountMax = coveragesParams.getSourceLinksInCountMax();
        Integer sourceRankingsAlexaRankMin = coveragesParams.getSourceRankingsAlexaRankMin();
        Integer sourceRankingsAlexaRankMax = coveragesParams.getSourceRankingsAlexaRankMax();
        List<String> sourceRankingsAlexaCountry = coveragesParams.getSourceRankingsAlexaCountry();
        Boolean cluster = coveragesParams.getCluster();
        String clusterAlgorithm = coveragesParams.getClusterAlgorithm();
        List<String> _return = coveragesParams.get_return();
        Long storyId = coveragesParams.getStoryId();
        String storyUrl = coveragesParams.getStoryUrl();
        String storyTitle = coveragesParams.getStoryTitle();
        String storyBody = coveragesParams.getStoryBody();
        DateTime storyPublishedAt = coveragesParams.getStoryPublishedAt();
        String storyLanguage = coveragesParams.getStoryLanguage();
        Integer perPage = coveragesParams.getPerPage();

        // create path and map variables
        String localVarPath = "/coverages".replaceAll("\\{format\\}", "json");

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        List<Pair> localVarFormParams = new ArrayList<Pair>();


        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "id[]", id));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "title", title));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "body", body));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "text", text));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "language[]", language));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "published_at.start", publishedAtStart));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "published_at.end", publishedAtEnd));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "categories.taxonomy", categoriesTaxonomy));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "categories.confident", categoriesConfident));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "categories.id[]", categoriesId));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "categories.level[]", categoriesLevel));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "entities.title.text[]", entitiesTitleText));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "entities.title.type[]", entitiesTitleType));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "entities.title.links.dbpedia[]", entitiesTitleLinksDbpedia));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "entities.body.text[]", entitiesBodyText));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "entities.body.type[]", entitiesBodyType));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "entities.body.links.dbpedia[]", entitiesBodyLinksDbpedia));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "sentiment.title.polarity", sentimentTitlePolarity));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "sentiment.body.polarity", sentimentBodyPolarity));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "media.images.count.min", mediaImagesCountMin));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "media.images.count.max", mediaImagesCountMax));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "media.videos.count.min", mediaVideosCountMin));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "media.videos.count.max", mediaVideosCountMax));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "author.id[]", authorId));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "author.name", authorName));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "source.id[]", sourceId));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "source.name[]", sourceName));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "source.domain[]", sourceDomain));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "source.locations.country[]", sourceLocationsCountry));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "source.locations.state[]", sourceLocationsState));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "source.locations.city[]", sourceLocationsCity));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "source.scopes.country[]", sourceScopesCountry));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "source.scopes.state[]", sourceScopesState));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "source.scopes.city[]", sourceScopesCity));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "source.scopes.level[]", sourceScopesLevel));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "source.links_in_count.min", sourceLinksInCountMin));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "source.links_in_count.max", sourceLinksInCountMax));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "source.rankings.alexa.rank.min", sourceRankingsAlexaRankMin));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "source.rankings.alexa.rank.max", sourceRankingsAlexaRankMax));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "source.rankings.alexa.country[]", sourceRankingsAlexaCountry));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "cluster", cluster));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "cluster.algorithm", clusterAlgorithm));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "return[]", _return));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "story_id", storyId));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "story_url", storyUrl));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "story_title", storyTitle));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "story_body", storyBody));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "story_published_at", storyPublishedAt));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "story_language", storyLanguage));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "per_page", perPage));


        final String[] localVarAccepts = {
                "application/json", "text/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = {
                "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{"app_key", "app_id"};

        GenericType<Coverages> localVarReturnType = new GenericType<Coverages>() {
        };
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List histograms
     * This endpoint is used for getting histograms based on the &#x60;field&#x60; parameter passed to the API.
     *
     * @param histogramsParams Histograms parameters
     * @return Histograms
     * @throws ApiException if fails to make API call
     */
    public Histograms listHistograms(HistogramsParams histogramsParams) throws ApiException {
        Object localVarPostBody = null;

        // setting builder variables
        List<Long> id = histogramsParams.getId();
        String title = histogramsParams.getTitle();
        String body = histogramsParams.getBody();
        String text = histogramsParams.getText();
        List<String> language = histogramsParams.getLanguage();
        String publishedAtStart = histogramsParams.getPublishedAtStart();
        String publishedAtEnd = histogramsParams.getPublishedAtEnd();
        String categoriesTaxonomy = histogramsParams.getCategoriesTaxonomy();
        Boolean categoriesConfident = histogramsParams.getCategoriesConfident();
        List<String> categoriesId = histogramsParams.getCategoriesId();
        List<Integer> categoriesLevel = histogramsParams.getCategoriesLevel();
        List<String> entitiesTitleText = histogramsParams.getEntitiesTitleText();
        List<String> entitiesTitleType = histogramsParams.getEntitiesTitleType();
        List<String> entitiesTitleLinksDbpedia = histogramsParams.getEntitiesTitleLinksDbpedia();
        List<String> entitiesBodyText = histogramsParams.getEntitiesBodyText();
        List<String> entitiesBodyType = histogramsParams.getEntitiesBodyType();
        List<String> entitiesBodyLinksDbpedia = histogramsParams.getEntitiesBodyLinksDbpedia();
        String sentimentTitlePolarity = histogramsParams.getSentimentTitlePolarity();
        String sentimentBodyPolarity = histogramsParams.getSentimentBodyPolarity();
        Integer mediaImagesCountMin = histogramsParams.getMediaImagesCountMin();
        Integer mediaImagesCountMax = histogramsParams.getMediaImagesCountMax();
        Integer mediaVideosCountMin = histogramsParams.getMediaVideosCountMin();
        Integer mediaVideosCountMax = histogramsParams.getMediaVideosCountMax();
        List<Integer> authorId = histogramsParams.getAuthorId();
        String authorName = histogramsParams.getAuthorName();
        List<Integer> sourceId = histogramsParams.getSourceId();
        List<String> sourceName = histogramsParams.getSourceName();
        List<String> sourceDomain = histogramsParams.getSourceDomain();
        List<String> sourceLocationsCountry = histogramsParams.getSourceLocationsCountry();
        List<String> sourceLocationsState = histogramsParams.getSourceLocationsState();
        List<String> sourceLocationsCity = histogramsParams.getSourceLocationsCity();
        List<String> sourceScopesCountry = histogramsParams.getSourceScopesCountry();
        List<String> sourceScopesState = histogramsParams.getSourceScopesState();
        List<String> sourceScopesCity = histogramsParams.getSourceScopesCity();
        List<String> sourceScopesLevel = histogramsParams.getSourceScopesLevel();
        Integer sourceLinksInCountMin = histogramsParams.getSourceLinksInCountMin();
        Integer sourceLinksInCountMax = histogramsParams.getSourceLinksInCountMax();
        Integer sourceRankingsAlexaRankMin = histogramsParams.getSourceRankingsAlexaRankMin();
        Integer sourceRankingsAlexaRankMax = histogramsParams.getSourceRankingsAlexaRankMax();
        List<String> sourceRankingsAlexaCountry = histogramsParams.getSourceRankingsAlexaCountry();
        Integer intervalStart = histogramsParams.getIntervalStart();
        Integer intervalEnd = histogramsParams.getIntervalEnd();
        Integer intervalWidth = histogramsParams.getIntervalWidth();
        String field = histogramsParams.getField();

        // create path and map variables
        String localVarPath = "/histograms".replaceAll("\\{format\\}", "json");

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        List<Pair> localVarFormParams = new ArrayList<Pair>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "id[]", id));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "title", title));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "body", body));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "text", text));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "language[]", language));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "published_at.start", publishedAtStart));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "published_at.end", publishedAtEnd));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "categories.taxonomy", categoriesTaxonomy));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "categories.confident", categoriesConfident));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "categories.id[]", categoriesId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "categories.level[]", categoriesLevel));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entities.title.text[]", entitiesTitleText));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entities.title.type[]", entitiesTitleType));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entities.title.links.dbpedia[]", entitiesTitleLinksDbpedia));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entities.body.text[]", entitiesBodyText));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entities.body.type[]", entitiesBodyType));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entities.body.links.dbpedia[]", entitiesBodyLinksDbpedia));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sentiment.title.polarity", sentimentTitlePolarity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sentiment.body.polarity", sentimentBodyPolarity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.images.count.min", mediaImagesCountMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.images.count.max", mediaImagesCountMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.videos.count.min", mediaVideosCountMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.videos.count.max", mediaVideosCountMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "author.id[]", authorId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "author.name", authorName));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.id[]", sourceId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.name[]", sourceName));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.domain[]", sourceDomain));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.locations.country[]", sourceLocationsCountry));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.locations.state[]", sourceLocationsState));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.locations.city[]", sourceLocationsCity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.scopes.country[]", sourceScopesCountry));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.scopes.state[]", sourceScopesState));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.scopes.city[]", sourceScopesCity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.scopes.level[]", sourceScopesLevel));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "source.links_in_count.min", sourceLinksInCountMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "source.links_in_count.max", sourceLinksInCountMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "source.rankings.alexa.rank.min", sourceRankingsAlexaRankMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "source.rankings.alexa.rank.max", sourceRankingsAlexaRankMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.rankings.alexa.country[]", sourceRankingsAlexaCountry));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "interval.start", intervalStart));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "interval.end", intervalEnd));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "interval.width", intervalWidth));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "field", field));


        final String[] localVarAccepts = {
                "application/json", "text/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = {
                "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{"app_key", "app_id"};

        GenericType<Histograms> localVarReturnType = new GenericType<Histograms>() {
        };
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List related stories
     * This endpoint is used for finding related stories based on the parameters provided. The maximum number of related stories returned is 100.
     *
     * @param relatedStoriesParams Related Stories parameters
     * @return RelatedStories
     * @throws ApiException if fails to make API call
     */
    public RelatedStories listRelatedStories(RelatedStoriesParams relatedStoriesParams) throws ApiException {
        Object localVarPostBody = null;

        // setting builder variables
        List<Long> id = relatedStoriesParams.getId();
        String title = relatedStoriesParams.getTitle();
        String body = relatedStoriesParams.getBody();
        String text = relatedStoriesParams.getText();
        List<String> language = relatedStoriesParams.getLanguage();
        String publishedAtStart = relatedStoriesParams.getPublishedAtStart();
        String publishedAtEnd = relatedStoriesParams.getPublishedAtEnd();
        String categoriesTaxonomy = relatedStoriesParams.getCategoriesTaxonomy();
        Boolean categoriesConfident = relatedStoriesParams.getCategoriesConfident();
        List<String> categoriesId = relatedStoriesParams.getCategoriesId();
        List<Integer> categoriesLevel = relatedStoriesParams.getCategoriesLevel();
        List<String> entitiesTitleText = relatedStoriesParams.getEntitiesTitleText();
        List<String> entitiesTitleType = relatedStoriesParams.getEntitiesTitleType();
        List<String> entitiesTitleLinksDbpedia = relatedStoriesParams.getEntitiesTitleLinksDbpedia();
        List<String> entitiesBodyText = relatedStoriesParams.getEntitiesBodyText();
        List<String> entitiesBodyType = relatedStoriesParams.getEntitiesBodyType();
        List<String> entitiesBodyLinksDbpedia = relatedStoriesParams.getEntitiesBodyLinksDbpedia();
        String sentimentTitlePolarity = relatedStoriesParams.getSentimentTitlePolarity();
        String sentimentBodyPolarity = relatedStoriesParams.getSentimentBodyPolarity();
        Integer mediaImagesCountMin = relatedStoriesParams.getMediaImagesCountMin();
        Integer mediaImagesCountMax = relatedStoriesParams.getMediaImagesCountMax();
        Integer mediaVideosCountMin = relatedStoriesParams.getMediaVideosCountMin();
        Integer mediaVideosCountMax = relatedStoriesParams.getMediaVideosCountMax();
        List<Integer> authorId = relatedStoriesParams.getAuthorId();
        String authorName = relatedStoriesParams.getAuthorName();
        List<Integer> sourceId = relatedStoriesParams.getSourceId();
        List<String> sourceName = relatedStoriesParams.getSourceName();
        List<String> sourceDomain = relatedStoriesParams.getSourceDomain();
        List<String> sourceLocationsCountry = relatedStoriesParams.getSourceLocationsCountry();
        List<String> sourceLocationsState = relatedStoriesParams.getSourceLocationsState();
        List<String> sourceLocationsCity = relatedStoriesParams.getSourceLocationsCity();
        List<String> sourceScopesCountry = relatedStoriesParams.getSourceScopesCountry();
        List<String> sourceScopesState = relatedStoriesParams.getSourceScopesState();
        List<String> sourceScopesCity = relatedStoriesParams.getSourceScopesCity();
        List<String> sourceScopesLevel = relatedStoriesParams.getSourceScopesLevel();
        Integer sourceLinksInCountMin = relatedStoriesParams.getSourceLinksInCountMin();
        Integer sourceLinksInCountMax = relatedStoriesParams.getSourceLinksInCountMax();
        Integer sourceRankingsAlexaRankMin = relatedStoriesParams.getSourceRankingsAlexaRankMin();
        Integer sourceRankingsAlexaRankMax = relatedStoriesParams.getSourceRankingsAlexaRankMax();
        List<String> sourceRankingsAlexaCountry = relatedStoriesParams.getSourceRankingsAlexaCountry();
        Boolean cluster = relatedStoriesParams.getCluster();
        String clusterAlgorithm = relatedStoriesParams.getClusterAlgorithm();
        List<String> _return = relatedStoriesParams.get_return();
        Long storyId = relatedStoriesParams.getStoryId();
        String storyUrl = relatedStoriesParams.getStoryUrl();
        String storyTitle = relatedStoriesParams.getStoryTitle();
        String storyBody = relatedStoriesParams.getStoryBody();
        String boostBy = relatedStoriesParams.getBoostBy();
        String storyLanguage = relatedStoriesParams.getStoryLanguage();
        Integer perPage = relatedStoriesParams.getPerPage();

        // create path and map variables
        String localVarPath = "/related_stories".replaceAll("\\{format\\}", "json");

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        List<Pair> localVarFormParams = new ArrayList<Pair>();


        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "id[]", id));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "title", title));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "body", body));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "text", text));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "language[]", language));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "published_at.start", publishedAtStart));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "published_at.end", publishedAtEnd));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "categories.taxonomy", categoriesTaxonomy));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "categories.confident", categoriesConfident));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "categories.id[]", categoriesId));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "categories.level[]", categoriesLevel));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "entities.title.text[]", entitiesTitleText));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "entities.title.type[]", entitiesTitleType));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "entities.title.links.dbpedia[]", entitiesTitleLinksDbpedia));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "entities.body.text[]", entitiesBodyText));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "entities.body.type[]", entitiesBodyType));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "entities.body.links.dbpedia[]", entitiesBodyLinksDbpedia));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "sentiment.title.polarity", sentimentTitlePolarity));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "sentiment.body.polarity", sentimentBodyPolarity));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "media.images.count.min", mediaImagesCountMin));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "media.images.count.max", mediaImagesCountMax));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "media.videos.count.min", mediaVideosCountMin));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "media.videos.count.max", mediaVideosCountMax));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "author.id[]", authorId));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "author.name", authorName));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "source.id[]", sourceId));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "source.name[]", sourceName));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "source.domain[]", sourceDomain));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "source.locations.country[]", sourceLocationsCountry));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "source.locations.state[]", sourceLocationsState));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "source.locations.city[]", sourceLocationsCity));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "source.scopes.country[]", sourceScopesCountry));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "source.scopes.state[]", sourceScopesState));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "source.scopes.city[]", sourceScopesCity));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "source.scopes.level[]", sourceScopesLevel));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "source.links_in_count.min", sourceLinksInCountMin));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "source.links_in_count.max", sourceLinksInCountMax));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "source.rankings.alexa.rank.min", sourceRankingsAlexaRankMin));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "source.rankings.alexa.rank.max", sourceRankingsAlexaRankMax));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "source.rankings.alexa.country[]", sourceRankingsAlexaCountry));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "cluster", cluster));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "cluster.algorithm", clusterAlgorithm));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "return[]", _return));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "story_id", storyId));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "story_url", storyUrl));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "story_title", storyTitle));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "story_body", storyBody));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "boost_by", boostBy));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "story_language", storyLanguage));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "per_page", perPage));

        final String[] localVarAccepts = {
                "application/json", "text/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = {
                "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{"app_key", "app_id"};

        GenericType<RelatedStories> localVarReturnType = new GenericType<RelatedStories>() {
        };
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List Stories
     * This endpoint is used for getting a list of stories.
     *
     * @param storiesParams Stories parameters
     * @return Stories
     * @throws ApiException if fails to make API call
     */
    public Stories listStories(StoriesParams storiesParams) throws ApiException {
        Object localVarPostBody = null;

        // setting builder variables
        List<Long> id = storiesParams.getId();
        String title = storiesParams.getTitle();
        String body = storiesParams.getBody();
        String text = storiesParams.getText();
        List<String> language = storiesParams.getLanguage();
        String publishedAtStart = storiesParams.getPublishedAtStart();
        String publishedAtEnd = storiesParams.getPublishedAtEnd();
        String categoriesTaxonomy = storiesParams.getCategoriesTaxonomy();
        Boolean categoriesConfident = storiesParams.getCategoriesConfident();
        List<String> categoriesId = storiesParams.getCategoriesId();
        List<Integer> categoriesLevel = storiesParams.getCategoriesLevel();
        List<String> entitiesTitleText = storiesParams.getEntitiesTitleText();
        List<String> entitiesTitleType = storiesParams.getEntitiesTitleType();
        List<String> entitiesTitleLinksDbpedia = storiesParams.getEntitiesTitleLinksDbpedia();
        List<String> entitiesBodyText = storiesParams.getEntitiesBodyText();
        List<String> entitiesBodyType = storiesParams.getEntitiesBodyType();
        List<String> entitiesBodyLinksDbpedia = storiesParams.getEntitiesBodyLinksDbpedia();
        String sentimentTitlePolarity = storiesParams.getSentimentTitlePolarity();
        String sentimentBodyPolarity = storiesParams.getSentimentBodyPolarity();
        Integer mediaImagesCountMin = storiesParams.getMediaImagesCountMin();
        Integer mediaImagesCountMax = storiesParams.getMediaImagesCountMax();
        Integer mediaVideosCountMin = storiesParams.getMediaVideosCountMin();
        Integer mediaVideosCountMax = storiesParams.getMediaVideosCountMax();
        List<Integer> authorId = storiesParams.getAuthorId();
        String authorName = storiesParams.getAuthorName();
        List<Integer> sourceId = storiesParams.getSourceId();
        List<String> sourceName = storiesParams.getSourceName();
        List<String> sourceDomain = storiesParams.getSourceDomain();
        List<String> sourceLocationsCountry = storiesParams.getSourceLocationsCountry();
        List<String> sourceLocationsState = storiesParams.getSourceLocationsState();
        List<String> sourceLocationsCity = storiesParams.getSourceLocationsCity();
        List<String> sourceScopesCountry = storiesParams.getSourceScopesCountry();
        List<String> sourceScopesState = storiesParams.getSourceScopesState();
        List<String> sourceScopesCity = storiesParams.getSourceScopesCity();
        List<String> sourceScopesLevel = storiesParams.getSourceScopesLevel();
        Integer sourceLinksInCountMin = storiesParams.getSourceLinksInCountMin();
        Integer sourceLinksInCountMax = storiesParams.getSourceLinksInCountMax();
        Integer sourceRankingsAlexaRankMin = storiesParams.getSourceRankingsAlexaRankMin();
        Integer sourceRankingsAlexaRankMax = storiesParams.getSourceRankingsAlexaRankMax();
        List<String> sourceRankingsAlexaCountry = storiesParams.getSourceRankingsAlexaCountry();
        Boolean cluster = storiesParams.getCluster();
        String clusterAlgorithm = storiesParams.getClusterAlgorithm();
        List<String> _return = storiesParams.get_return();
        String sortBy = storiesParams.getSortBy();
        String sortDirection = storiesParams.getSortDirection();
        String cursor = storiesParams.getCursor();
        Integer perPage = storiesParams.getPerPage();

        // create path and map variables
        String localVarPath = "/stories".replaceAll("\\{format\\}", "json");

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        List<Pair> localVarFormParams = new ArrayList<Pair>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "id[]", id));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "title", title));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "body", body));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "text", text));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "language[]", language));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "published_at.start", publishedAtStart));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "published_at.end", publishedAtEnd));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "categories.taxonomy", categoriesTaxonomy));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "categories.confident", categoriesConfident));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "categories.id[]", categoriesId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "categories.level[]", categoriesLevel));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entities.title.text[]", entitiesTitleText));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entities.title.type[]", entitiesTitleType));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entities.title.links.dbpedia[]", entitiesTitleLinksDbpedia));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entities.body.text[]", entitiesBodyText));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entities.body.type[]", entitiesBodyType));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entities.body.links.dbpedia[]", entitiesBodyLinksDbpedia));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sentiment.title.polarity", sentimentTitlePolarity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sentiment.body.polarity", sentimentBodyPolarity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.images.count.min", mediaImagesCountMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.images.count.max", mediaImagesCountMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.videos.count.min", mediaVideosCountMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.videos.count.max", mediaVideosCountMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "author.id[]", authorId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "author.name", authorName));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.id[]", sourceId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.name[]", sourceName));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.domain[]", sourceDomain));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.locations.country[]", sourceLocationsCountry));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.locations.state[]", sourceLocationsState));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.locations.city[]", sourceLocationsCity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.scopes.country[]", sourceScopesCountry));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.scopes.state[]", sourceScopesState));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.scopes.city[]", sourceScopesCity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.scopes.level[]", sourceScopesLevel));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "source.links_in_count.min", sourceLinksInCountMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "source.links_in_count.max", sourceLinksInCountMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "source.rankings.alexa.rank.min", sourceRankingsAlexaRankMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "source.rankings.alexa.rank.max", sourceRankingsAlexaRankMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.rankings.alexa.country[]", sourceRankingsAlexaCountry));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "cluster", cluster));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "cluster.algorithm", clusterAlgorithm));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "return[]", _return));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_by", sortBy));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_direction", sortDirection));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "cursor", cursor));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "per_page", perPage));


        final String[] localVarAccepts = {
                "application/json", "text/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = {
                "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{"app_key", "app_id"};

        GenericType<Stories> localVarReturnType = new GenericType<Stories>() {
        };
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List time series
     * This endpoint is used for getting time series by stories.
     *
     * @param timeSeriesParams Time Series parameters
     * @return TimeSeriesList
     * @throws ApiException if fails to make API call
     */
    public TimeSeriesList listTimeSeries(TimeSeriesParams timeSeriesParams) throws ApiException {
        Object localVarPostBody = null;

        // setting builder variables
        List<Long> id = timeSeriesParams.getId();
        String title = timeSeriesParams.getTitle();
        String body = timeSeriesParams.getBody();
        String text = timeSeriesParams.getText();
        List<String> language = timeSeriesParams.getLanguage();
        String categoriesTaxonomy = timeSeriesParams.getCategoriesTaxonomy();
        Boolean categoriesConfident = timeSeriesParams.getCategoriesConfident();
        List<String> categoriesId = timeSeriesParams.getCategoriesId();
        List<Integer> categoriesLevel = timeSeriesParams.getCategoriesLevel();
        List<String> entitiesTitleText = timeSeriesParams.getEntitiesTitleText();
        List<String> entitiesTitleType = timeSeriesParams.getEntitiesTitleType();
        List<String> entitiesTitleLinksDbpedia = timeSeriesParams.getEntitiesTitleLinksDbpedia();
        List<String> entitiesBodyText = timeSeriesParams.getEntitiesBodyText();
        List<String> entitiesBodyType = timeSeriesParams.getEntitiesBodyType();
        List<String> entitiesBodyLinksDbpedia = timeSeriesParams.getEntitiesBodyLinksDbpedia();
        String sentimentTitlePolarity = timeSeriesParams.getSentimentTitlePolarity();
        String sentimentBodyPolarity = timeSeriesParams.getSentimentBodyPolarity();
        Integer mediaImagesCountMin = timeSeriesParams.getMediaImagesCountMin();
        Integer mediaImagesCountMax = timeSeriesParams.getMediaImagesCountMax();
        Integer mediaVideosCountMin = timeSeriesParams.getMediaVideosCountMin();
        Integer mediaVideosCountMax = timeSeriesParams.getMediaVideosCountMax();
        List<Integer> authorId = timeSeriesParams.getAuthorId();
        String authorName = timeSeriesParams.getAuthorName();
        List<Integer> sourceId = timeSeriesParams.getSourceId();
        List<String> sourceName = timeSeriesParams.getSourceName();
        List<String> sourceDomain = timeSeriesParams.getSourceDomain();
        List<String> sourceLocationsCountry = timeSeriesParams.getSourceLocationsCountry();
        List<String> sourceLocationsState = timeSeriesParams.getSourceLocationsState();
        List<String> sourceLocationsCity = timeSeriesParams.getSourceLocationsCity();
        List<String> sourceScopesCountry = timeSeriesParams.getSourceScopesCountry();
        List<String> sourceScopesState = timeSeriesParams.getSourceScopesState();
        List<String> sourceScopesCity = timeSeriesParams.getSourceScopesCity();
        List<String> sourceScopesLevel = timeSeriesParams.getSourceScopesLevel();
        Integer sourceLinksInCountMin = timeSeriesParams.getSourceLinksInCountMin();
        Integer sourceLinksInCountMax = timeSeriesParams.getSourceLinksInCountMax();
        Integer sourceRankingsAlexaRankMin = timeSeriesParams.getSourceRankingsAlexaRankMin();
        Integer sourceRankingsAlexaRankMax = timeSeriesParams.getSourceRankingsAlexaRankMax();
        List<String> sourceRankingsAlexaCountry = timeSeriesParams.getSourceRankingsAlexaCountry();
        String publishedAtStart = timeSeriesParams.getPublishedAtStart();
        String publishedAtEnd = timeSeriesParams.getPublishedAtEnd();
        String period = timeSeriesParams.getPeriod();

        // create path and map variables
        String localVarPath = "/time_series".replaceAll("\\{format\\}", "json");

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        List<Pair> localVarFormParams = new ArrayList<Pair>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "id[]", id));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "title", title));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "body", body));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "text", text));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "language[]", language));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "categories.taxonomy", categoriesTaxonomy));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "categories.confident", categoriesConfident));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "categories.id[]", categoriesId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "categories.level[]", categoriesLevel));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entities.title.text[]", entitiesTitleText));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entities.title.type[]", entitiesTitleType));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entities.title.links.dbpedia[]", entitiesTitleLinksDbpedia));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entities.body.text[]", entitiesBodyText));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entities.body.type[]", entitiesBodyType));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entities.body.links.dbpedia[]", entitiesBodyLinksDbpedia));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sentiment.title.polarity", sentimentTitlePolarity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sentiment.body.polarity", sentimentBodyPolarity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.images.count.min", mediaImagesCountMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.images.count.max", mediaImagesCountMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.videos.count.min", mediaVideosCountMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.videos.count.max", mediaVideosCountMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "author.id[]", authorId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "author.name", authorName));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.id[]", sourceId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.name[]", sourceName));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.domain[]", sourceDomain));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.locations.country[]", sourceLocationsCountry));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.locations.state[]", sourceLocationsState));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.locations.city[]", sourceLocationsCity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.scopes.country[]", sourceScopesCountry));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.scopes.state[]", sourceScopesState));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.scopes.city[]", sourceScopesCity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.scopes.level[]", sourceScopesLevel));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "source.links_in_count.min", sourceLinksInCountMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "source.links_in_count.max", sourceLinksInCountMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "source.rankings.alexa.rank.min", sourceRankingsAlexaRankMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "source.rankings.alexa.rank.max", sourceRankingsAlexaRankMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.rankings.alexa.country[]", sourceRankingsAlexaCountry));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "published_at.start", publishedAtStart));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "published_at.end", publishedAtEnd));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "period", period));


        final String[] localVarAccepts = {
                "application/json", "text/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = {
                "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{"app_key", "app_id"};

        GenericType<TimeSeriesList> localVarReturnType = new GenericType<TimeSeriesList>() {
        };
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List trends
     * This endpoint is used for finding trends based on stories.
     *
     * @param trendsParams Trends parameters
     * @return Trends
     * @throws ApiException if fails to make API call
     */
    public Trends listTrends(TrendsParams trendsParams) throws ApiException {
        Object localVarPostBody = null;

        // setting builder variables
        List<Long> id = trendsParams.getId();
        String title = trendsParams.getTitle();
        String body = trendsParams.getBody();
        String text = trendsParams.getText();
        List<String> language = trendsParams.getLanguage();
        String publishedAtStart = trendsParams.getPublishedAtStart();
        String publishedAtEnd = trendsParams.getPublishedAtEnd();
        String categoriesTaxonomy = trendsParams.getCategoriesTaxonomy();
        Boolean categoriesConfident = trendsParams.getCategoriesConfident();
        List<String> categoriesId = trendsParams.getCategoriesId();
        List<Integer> categoriesLevel = trendsParams.getCategoriesLevel();
        List<String> entitiesTitleText = trendsParams.getEntitiesTitleText();
        List<String> entitiesTitleType = trendsParams.getEntitiesTitleType();
        List<String> entitiesTitleLinksDbpedia = trendsParams.getEntitiesTitleLinksDbpedia();
        List<String> entitiesBodyText = trendsParams.getEntitiesBodyText();
        List<String> entitiesBodyType = trendsParams.getEntitiesBodyType();
        List<String> entitiesBodyLinksDbpedia = trendsParams.getEntitiesBodyLinksDbpedia();
        String sentimentTitlePolarity = trendsParams.getSentimentTitlePolarity();
        String sentimentBodyPolarity = trendsParams.getSentimentBodyPolarity();
        Integer mediaImagesCountMin = trendsParams.getMediaImagesCountMin();
        Integer mediaImagesCountMax = trendsParams.getMediaImagesCountMax();
        Integer mediaVideosCountMin = trendsParams.getMediaVideosCountMin();
        Integer mediaVideosCountMax = trendsParams.getMediaVideosCountMax();
        List<Integer> authorId = trendsParams.getAuthorId();
        String authorName = trendsParams.getAuthorName();
        List<Integer> sourceId = trendsParams.getSourceId();
        List<String> sourceName = trendsParams.getSourceName();
        List<String> sourceDomain = trendsParams.getSourceDomain();
        List<String> sourceLocationsCountry = trendsParams.getSourceLocationsCountry();
        List<String> sourceLocationsState = trendsParams.getSourceLocationsState();
        List<String> sourceLocationsCity = trendsParams.getSourceLocationsCity();
        List<String> sourceScopesCountry = trendsParams.getSourceScopesCountry();
        List<String> sourceScopesState = trendsParams.getSourceScopesState();
        List<String> sourceScopesCity = trendsParams.getSourceScopesCity();
        List<String> sourceScopesLevel = trendsParams.getSourceScopesLevel();
        Integer sourceLinksInCountMin = trendsParams.getSourceLinksInCountMin();
        Integer sourceLinksInCountMax = trendsParams.getSourceLinksInCountMax();
        Integer sourceRankingsAlexaRankMin = trendsParams.getSourceRankingsAlexaRankMin();
        Integer sourceRankingsAlexaRankMax = trendsParams.getSourceRankingsAlexaRankMax();
        List<String> sourceRankingsAlexaCountry = trendsParams.getSourceRankingsAlexaCountry();
        String field = trendsParams.getField();

        // create path and map variables
        String localVarPath = "/trends".replaceAll("\\{format\\}", "json");

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        List<Pair> localVarFormParams = new ArrayList<Pair>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "id[]", id));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "title", title));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "body", body));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "text", text));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "language[]", language));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "published_at.start", publishedAtStart));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "published_at.end", publishedAtEnd));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "categories.taxonomy", categoriesTaxonomy));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "categories.confident", categoriesConfident));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "categories.id[]", categoriesId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "categories.level[]", categoriesLevel));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entities.title.text[]", entitiesTitleText));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entities.title.type[]", entitiesTitleType));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entities.title.links.dbpedia[]", entitiesTitleLinksDbpedia));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entities.body.text[]", entitiesBodyText));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entities.body.type[]", entitiesBodyType));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entities.body.links.dbpedia[]", entitiesBodyLinksDbpedia));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sentiment.title.polarity", sentimentTitlePolarity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sentiment.body.polarity", sentimentBodyPolarity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.images.count.min", mediaImagesCountMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.images.count.max", mediaImagesCountMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.videos.count.min", mediaVideosCountMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.videos.count.max", mediaVideosCountMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "author.id[]", authorId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "author.name", authorName));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.id[]", sourceId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.name[]", sourceName));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.domain[]", sourceDomain));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.locations.country[]", sourceLocationsCountry));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.locations.state[]", sourceLocationsState));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.locations.city[]", sourceLocationsCity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.scopes.country[]", sourceScopesCountry));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.scopes.state[]", sourceScopesState));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.scopes.city[]", sourceScopesCity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.scopes.level[]", sourceScopesLevel));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "source.links_in_count.min", sourceLinksInCountMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "source.links_in_count.max", sourceLinksInCountMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "source.rankings.alexa.rank.min", sourceRankingsAlexaRankMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "source.rankings.alexa.rank.max", sourceRankingsAlexaRankMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.rankings.alexa.country[]", sourceRankingsAlexaCountry));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "field", field));


        final String[] localVarAccepts = {
                "application/json", "text/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = {
                "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{"app_key", "app_id"};

        GenericType<Trends> localVarReturnType = new GenericType<Trends>() {
        };
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
