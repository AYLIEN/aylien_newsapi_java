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
        List<Long> notId = coveragesParams.getNotId();
        String title = coveragesParams.getTitle();
        String body = coveragesParams.getBody();
        String text = coveragesParams.getText();
        List<String> language = coveragesParams.getLanguage();
        List<String> notLanguage = coveragesParams.getNotLanguage();
        String publishedAtStart = coveragesParams.getPublishedAtStart();
        String publishedAtEnd = coveragesParams.getPublishedAtEnd();
        String categoriesTaxonomy = coveragesParams.getCategoriesTaxonomy();
        Boolean categoriesConfident = coveragesParams.getCategoriesConfident();
        List<String> categoriesId = coveragesParams.getCategoriesId();
        List<String> notCategoriesId = coveragesParams.getNotCategoriesId();
        List<Integer> categoriesLevel = coveragesParams.getCategoriesLevel();
        List<Integer> notCategoriesLevel = coveragesParams.getNotCategoriesLevel();
        List<String> entitiesTitleText = coveragesParams.getEntitiesTitleText();
        List<String> notEntitiesTitleText = coveragesParams.getNotEntitiesTitleText();
        List<String> entitiesTitleType = coveragesParams.getEntitiesTitleType();
        List<String> notEntitiesTitleType = coveragesParams.getNotEntitiesTitleType();
        List<String> entitiesTitleLinksDbpedia = coveragesParams.getEntitiesTitleLinksDbpedia();
        List<String> notEntitiesTitleLinksDbpedia = coveragesParams.getNotEntitiesTitleLinksDbpedia();
        List<String> entitiesBodyText = coveragesParams.getEntitiesBodyText();
        List<String> notEntitiesBodyText = coveragesParams.getNotEntitiesBodyText();
        List<String> entitiesBodyType = coveragesParams.getEntitiesBodyType();
        List<String> notEntitiesBodyType = coveragesParams.getNotEntitiesBodyType();
        List<String> entitiesBodyLinksDbpedia = coveragesParams.getEntitiesBodyLinksDbpedia();
        List<String> notEntitiesBodyLinksDbpedia = coveragesParams.getNotEntitiesBodyLinksDbpedia();
        String sentimentTitlePolarity = coveragesParams.getSentimentTitlePolarity();
        String notSentimentTitlePolarity = coveragesParams.getNotSentimentTitlePolarity();
        String sentimentBodyPolarity = coveragesParams.getSentimentBodyPolarity();
        String notSentimentBodyPolarity = coveragesParams.getNotSentimentBodyPolarity();
        Integer mediaImagesCountMin = coveragesParams.getMediaImagesCountMin();
        Integer mediaImagesCountMax = coveragesParams.getMediaImagesCountMax();
        Integer mediaImagesWidthMin = coveragesParams.getMediaImagesWidthMin();
        Integer mediaImagesWidthMax = coveragesParams.getMediaImagesWidthMax();
        Integer mediaImagesHeightMin = coveragesParams.getMediaImagesHeightMin();
        Integer mediaImagesHeightMax = coveragesParams.getMediaImagesHeightMax();
        Integer mediaImagesContentLengthMin = coveragesParams.getMediaImagesContentLengthMin();
        Integer mediaImagesContentLengthMax = coveragesParams.getMediaImagesContentLengthMax();
        List<String> mediaImagesFormat = coveragesParams.getMediaImagesFormat();
        List<String> notMediaImagesFormat = coveragesParams.getNotMediaImagesFormat();
        Integer mediaVideosCountMin = coveragesParams.getMediaVideosCountMin();
        Integer mediaVideosCountMax = coveragesParams.getMediaVideosCountMax();
        List<Integer> authorId = coveragesParams.getAuthorId();
        List<Integer> notAuthorId = coveragesParams.getNotAuthorId();
        String authorName = coveragesParams.getAuthorName();
        String notAuthorName = coveragesParams.getNotAuthorName();
        List<Integer> sourceId = coveragesParams.getSourceId();
        List<Integer> notSourceId = coveragesParams.getNotSourceId();
        List<String> sourceName = coveragesParams.getSourceName();
        List<String> notSourceName = coveragesParams.getNotSourceName();
        List<String> sourceDomain = coveragesParams.getSourceDomain();
        List<String> notSourceDomain = coveragesParams.getNotSourceDomain();
        List<String> sourceLocationsCountry = coveragesParams.getSourceLocationsCountry();
        List<String> notSourceLocationsCountry = coveragesParams.getNotSourceLocationsCountry();
        List<String> sourceLocationsState = coveragesParams.getSourceLocationsState();
        List<String> notSourceLocationsState = coveragesParams.getNotSourceLocationsState();
        List<String> sourceLocationsCity = coveragesParams.getSourceLocationsCity();
        List<String> notSourceLocationsCity = coveragesParams.getNotSourceLocationsCity();
        List<String> sourceScopesCountry = coveragesParams.getSourceScopesCountry();
        List<String> notSourceScopesCountry = coveragesParams.getNotSourceScopesCountry();
        List<String> sourceScopesState = coveragesParams.getSourceScopesState();
        List<String> notSourceScopesState = coveragesParams.getNotSourceScopesState();
        List<String> sourceScopesCity = coveragesParams.getSourceScopesCity();
        List<String> notSourceScopesCity = coveragesParams.getNotSourceScopesCity();
        List<String> sourceScopesLevel = coveragesParams.getSourceScopesLevel();
        List<String> notSourceScopesLevel = coveragesParams.getNotSourceScopesLevel();
        Integer sourceLinksInCountMin = coveragesParams.getSourceLinksInCountMin();
        Integer sourceLinksInCountMax = coveragesParams.getSourceLinksInCountMax();
        Integer sourceRankingsAlexaRankMin = coveragesParams.getSourceRankingsAlexaRankMin();
        Integer sourceRankingsAlexaRankMax = coveragesParams.getSourceRankingsAlexaRankMax();
        List<String> sourceRankingsAlexaCountry = coveragesParams.getSourceRankingsAlexaCountry();
        Integer socialSharesCountFacebookMin = coveragesParams.getSocialSharesCountFacebookMin();
        Integer socialSharesCountFacebookMax = coveragesParams.getSocialSharesCountFacebookMax();
        Integer socialSharesCountGooglePlusMin = coveragesParams.getSocialSharesCountGooglePlusMin();
        Integer socialSharesCountGooglePlusMax = coveragesParams.getSocialSharesCountGooglePlusMax();
        Integer socialSharesCountLinkedinMin = coveragesParams.getSocialSharesCountLinkedinMin();
        Integer socialSharesCountLinkedinMax = coveragesParams.getSocialSharesCountLinkedinMax();
        Integer socialSharesCountRedditMin = coveragesParams.getSocialSharesCountRedditMin();
        Integer socialSharesCountRedditMax = coveragesParams.getSocialSharesCountRedditMax();
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
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "!id[]", notId));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "title", title));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "body", body));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "text", text));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "language[]", language));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "!language[]", notLanguage));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "published_at.start", publishedAtStart));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "published_at.end", publishedAtEnd));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "categories.taxonomy", categoriesTaxonomy));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "categories.confident", categoriesConfident));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "categories.id[]", categoriesId));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "!categories.id[]", notCategoriesId));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "categories.level[]", categoriesLevel));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "!categories.level[]", notCategoriesLevel));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "entities.title.text[]", entitiesTitleText));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "!entities.title.text[]", notEntitiesTitleText));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "entities.title.type[]", entitiesTitleType));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "!entities.title.type[]", notEntitiesTitleType));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "entities.title.links.dbpedia[]", entitiesTitleLinksDbpedia));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "!entities.title.links.dbpedia[]", notEntitiesTitleLinksDbpedia));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "entities.body.text[]", entitiesBodyText));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "!entities.body.text[]", notEntitiesBodyText));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "entities.body.type[]", entitiesBodyType));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "!entities.body.type[]", notEntitiesBodyType));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "entities.body.links.dbpedia[]", entitiesBodyLinksDbpedia));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "!entities.body.links.dbpedia[]", notEntitiesBodyLinksDbpedia));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "sentiment.title.polarity", sentimentTitlePolarity));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "!sentiment.title.polarity", notSentimentTitlePolarity));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "sentiment.body.polarity", sentimentBodyPolarity));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "!sentiment.body.polarity", notSentimentBodyPolarity));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "media.images.count.min", mediaImagesCountMin));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "media.images.count.max", mediaImagesCountMax));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "media.images.width.min", mediaImagesWidthMin));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "media.images.width.max", mediaImagesWidthMax));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "media.images.height.min", mediaImagesHeightMin));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "media.images.height.max", mediaImagesHeightMax));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "media.images.content_length.min", mediaImagesContentLengthMin));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "media.images.content_length.max", mediaImagesContentLengthMax));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "media.images.format[]", mediaImagesFormat));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "!media.images.format[]", notMediaImagesFormat));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "media.videos.count.min", mediaVideosCountMin));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "media.videos.count.max", mediaVideosCountMax));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "author.id[]", authorId));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "!author.id[]", notAuthorId));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "author.name", authorName));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "!author.name", notAuthorName));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "source.id[]", sourceId));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "!source.id[]", notSourceId));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "source.name[]", sourceName));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "!source.name[]", notSourceName));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "source.domain[]", sourceDomain));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "!source.domain[]", notSourceDomain));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "source.locations.country[]", sourceLocationsCountry));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "!source.locations.country[]", notSourceLocationsCountry));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "source.locations.state[]", sourceLocationsState));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "!source.locations.state[]", notSourceLocationsState));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "source.locations.city[]", sourceLocationsCity));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "!source.locations.city[]", notSourceLocationsCity));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "source.scopes.country[]", sourceScopesCountry));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "!source.scopes.country[]", notSourceScopesCountry));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "source.scopes.state[]", sourceScopesState));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "!source.scopes.state[]", notSourceScopesState));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "source.scopes.city[]", sourceScopesCity));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "!source.scopes.city[]", notSourceScopesCity));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "source.scopes.level[]", sourceScopesLevel));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "!source.scopes.level[]", notSourceScopesLevel));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "source.links_in_count.min", sourceLinksInCountMin));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "source.links_in_count.max", sourceLinksInCountMax));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "source.rankings.alexa.rank.min", sourceRankingsAlexaRankMin));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "source.rankings.alexa.rank.max", sourceRankingsAlexaRankMax));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "source.rankings.alexa.country[]", sourceRankingsAlexaCountry));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "social_shares_count.facebook.min", socialSharesCountFacebookMin));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "social_shares_count.facebook.max", socialSharesCountFacebookMax));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "social_shares_count.google_plus.min", socialSharesCountGooglePlusMin));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "social_shares_count.google_plus.max", socialSharesCountGooglePlusMax));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "social_shares_count.linkedin.min", socialSharesCountLinkedinMin));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "social_shares_count.linkedin.max", socialSharesCountLinkedinMax));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "social_shares_count.reddit.min", socialSharesCountRedditMin));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "social_shares_count.reddit.max", socialSharesCountRedditMax));
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
        List<Long> notId = histogramsParams.getNotId();
        String title = histogramsParams.getTitle();
        String body = histogramsParams.getBody();
        String text = histogramsParams.getText();
        List<String> language = histogramsParams.getLanguage();
        List<String> notLanguage = histogramsParams.getNotLanguage();
        String publishedAtStart = histogramsParams.getPublishedAtStart();
        String publishedAtEnd = histogramsParams.getPublishedAtEnd();
        String categoriesTaxonomy = histogramsParams.getCategoriesTaxonomy();
        Boolean categoriesConfident = histogramsParams.getCategoriesConfident();
        List<String> categoriesId = histogramsParams.getCategoriesId();
        List<String> notCategoriesId = histogramsParams.getNotCategoriesId();
        List<Integer> categoriesLevel = histogramsParams.getCategoriesLevel();
        List<Integer> notCategoriesLevel = histogramsParams.getNotCategoriesLevel();
        List<String> entitiesTitleText = histogramsParams.getEntitiesTitleText();
        List<String> notEntitiesTitleText = histogramsParams.getNotEntitiesTitleText();
        List<String> entitiesTitleType = histogramsParams.getEntitiesTitleType();
        List<String> notEntitiesTitleType = histogramsParams.getNotEntitiesTitleType();
        List<String> entitiesTitleLinksDbpedia = histogramsParams.getEntitiesTitleLinksDbpedia();
        List<String> notEntitiesTitleLinksDbpedia = histogramsParams.getNotEntitiesTitleLinksDbpedia();
        List<String> entitiesBodyText = histogramsParams.getEntitiesBodyText();
        List<String> notEntitiesBodyText = histogramsParams.getNotEntitiesBodyText();
        List<String> entitiesBodyType = histogramsParams.getEntitiesBodyType();
        List<String> notEntitiesBodyType = histogramsParams.getNotEntitiesBodyType();
        List<String> entitiesBodyLinksDbpedia = histogramsParams.getEntitiesBodyLinksDbpedia();
        List<String> notEntitiesBodyLinksDbpedia = histogramsParams.getNotEntitiesBodyLinksDbpedia();
        String sentimentTitlePolarity = histogramsParams.getSentimentTitlePolarity();
        String notSentimentTitlePolarity = histogramsParams.getNotSentimentTitlePolarity();
        String sentimentBodyPolarity = histogramsParams.getSentimentBodyPolarity();
        String notSentimentBodyPolarity = histogramsParams.getNotSentimentBodyPolarity();
        Integer mediaImagesCountMin = histogramsParams.getMediaImagesCountMin();
        Integer mediaImagesCountMax = histogramsParams.getMediaImagesCountMax();
        Integer mediaImagesWidthMin = histogramsParams.getMediaImagesWidthMin();
        Integer mediaImagesWidthMax = histogramsParams.getMediaImagesWidthMax();
        Integer mediaImagesHeightMin = histogramsParams.getMediaImagesHeightMin();
        Integer mediaImagesHeightMax = histogramsParams.getMediaImagesHeightMax();
        Integer mediaImagesContentLengthMin = histogramsParams.getMediaImagesContentLengthMin();
        Integer mediaImagesContentLengthMax = histogramsParams.getMediaImagesContentLengthMax();
        List<String> mediaImagesFormat = histogramsParams.getMediaImagesFormat();
        List<String> notMediaImagesFormat = histogramsParams.getNotMediaImagesFormat();
        Integer mediaVideosCountMin = histogramsParams.getMediaVideosCountMin();
        Integer mediaVideosCountMax = histogramsParams.getMediaVideosCountMax();
        List<Integer> authorId = histogramsParams.getAuthorId();
        List<Integer> notAuthorId = histogramsParams.getNotAuthorId();
        String authorName = histogramsParams.getAuthorName();
        String notAuthorName = histogramsParams.getNotAuthorName();
        List<Integer> sourceId = histogramsParams.getSourceId();
        List<Integer> notSourceId = histogramsParams.getNotSourceId();
        List<String> sourceName = histogramsParams.getSourceName();
        List<String> notSourceName = histogramsParams.getNotSourceName();
        List<String> sourceDomain = histogramsParams.getSourceDomain();
        List<String> notSourceDomain = histogramsParams.getNotSourceDomain();
        List<String> sourceLocationsCountry = histogramsParams.getSourceLocationsCountry();
        List<String> notSourceLocationsCountry = histogramsParams.getNotSourceLocationsCountry();
        List<String> sourceLocationsState = histogramsParams.getSourceLocationsState();
        List<String> notSourceLocationsState = histogramsParams.getNotSourceLocationsState();
        List<String> sourceLocationsCity = histogramsParams.getSourceLocationsCity();
        List<String> notSourceLocationsCity = histogramsParams.getNotSourceLocationsCity();
        List<String> sourceScopesCountry = histogramsParams.getSourceScopesCountry();
        List<String> notSourceScopesCountry = histogramsParams.getNotSourceScopesCountry();
        List<String> sourceScopesState = histogramsParams.getSourceScopesState();
        List<String> notSourceScopesState = histogramsParams.getNotSourceScopesState();
        List<String> sourceScopesCity = histogramsParams.getSourceScopesCity();
        List<String> notSourceScopesCity = histogramsParams.getNotSourceScopesCity();
        List<String> sourceScopesLevel = histogramsParams.getSourceScopesLevel();
        List<String> notSourceScopesLevel = histogramsParams.getNotSourceScopesLevel();
        Integer sourceLinksInCountMin = histogramsParams.getSourceLinksInCountMin();
        Integer sourceLinksInCountMax = histogramsParams.getSourceLinksInCountMax();
        Integer sourceRankingsAlexaRankMin = histogramsParams.getSourceRankingsAlexaRankMin();
        Integer sourceRankingsAlexaRankMax = histogramsParams.getSourceRankingsAlexaRankMax();
        List<String> sourceRankingsAlexaCountry = histogramsParams.getSourceRankingsAlexaCountry();
        Integer socialSharesCountFacebookMin = histogramsParams.getSocialSharesCountFacebookMin();
        Integer socialSharesCountFacebookMax = histogramsParams.getSocialSharesCountFacebookMax();
        Integer socialSharesCountGooglePlusMin = histogramsParams.getSocialSharesCountGooglePlusMin();
        Integer socialSharesCountGooglePlusMax = histogramsParams.getSocialSharesCountGooglePlusMax();
        Integer socialSharesCountLinkedinMin = histogramsParams.getSocialSharesCountLinkedinMin();
        Integer socialSharesCountLinkedinMax = histogramsParams.getSocialSharesCountLinkedinMax();
        Integer socialSharesCountRedditMin = histogramsParams.getSocialSharesCountRedditMin();
        Integer socialSharesCountRedditMax = histogramsParams.getSocialSharesCountRedditMax();
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
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!id[]", notId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "title", title));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "body", body));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "text", text));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "language[]", language));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!language[]", notLanguage));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "published_at.start", publishedAtStart));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "published_at.end", publishedAtEnd));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "categories.taxonomy", categoriesTaxonomy));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "categories.confident", categoriesConfident));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "categories.id[]", categoriesId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!categories.id[]", notCategoriesId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "categories.level[]", categoriesLevel));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!categories.level[]", notCategoriesLevel));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entities.title.text[]", entitiesTitleText));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!entities.title.text[]", notEntitiesTitleText));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entities.title.type[]", entitiesTitleType));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!entities.title.type[]", notEntitiesTitleType));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entities.title.links.dbpedia[]", entitiesTitleLinksDbpedia));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!entities.title.links.dbpedia[]", notEntitiesTitleLinksDbpedia));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entities.body.text[]", entitiesBodyText));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!entities.body.text[]", notEntitiesBodyText));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entities.body.type[]", entitiesBodyType));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!entities.body.type[]", notEntitiesBodyType));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entities.body.links.dbpedia[]", entitiesBodyLinksDbpedia));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!entities.body.links.dbpedia[]", notEntitiesBodyLinksDbpedia));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sentiment.title.polarity", sentimentTitlePolarity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "!sentiment.title.polarity", notSentimentTitlePolarity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sentiment.body.polarity", sentimentBodyPolarity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "!sentiment.body.polarity", notSentimentBodyPolarity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.images.count.min", mediaImagesCountMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.images.count.max", mediaImagesCountMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.images.width.min", mediaImagesWidthMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.images.width.max", mediaImagesWidthMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.images.height.min", mediaImagesHeightMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.images.height.max", mediaImagesHeightMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.images.content_length.min", mediaImagesContentLengthMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.images.content_length.max", mediaImagesContentLengthMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "media.images.format[]", mediaImagesFormat));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!media.images.format[]", notMediaImagesFormat));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.videos.count.min", mediaVideosCountMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.videos.count.max", mediaVideosCountMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "author.id[]", authorId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!author.id[]", notAuthorId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "author.name", authorName));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "!author.name", notAuthorName));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.id[]", sourceId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!source.id[]", notSourceId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.name[]", sourceName));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!source.name[]", notSourceName));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.domain[]", sourceDomain));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!source.domain[]", notSourceDomain));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.locations.country[]", sourceLocationsCountry));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!source.locations.country[]", notSourceLocationsCountry));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.locations.state[]", sourceLocationsState));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!source.locations.state[]", notSourceLocationsState));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.locations.city[]", sourceLocationsCity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!source.locations.city[]", notSourceLocationsCity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.scopes.country[]", sourceScopesCountry));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!source.scopes.country[]", notSourceScopesCountry));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.scopes.state[]", sourceScopesState));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!source.scopes.state[]", notSourceScopesState));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.scopes.city[]", sourceScopesCity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!source.scopes.city[]", notSourceScopesCity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.scopes.level[]", sourceScopesLevel));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!source.scopes.level[]", notSourceScopesLevel));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "source.links_in_count.min", sourceLinksInCountMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "source.links_in_count.max", sourceLinksInCountMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "source.rankings.alexa.rank.min", sourceRankingsAlexaRankMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "source.rankings.alexa.rank.max", sourceRankingsAlexaRankMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.rankings.alexa.country[]", sourceRankingsAlexaCountry));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "social_shares_count.facebook.min", socialSharesCountFacebookMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "social_shares_count.facebook.max", socialSharesCountFacebookMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "social_shares_count.google_plus.min", socialSharesCountGooglePlusMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "social_shares_count.google_plus.max", socialSharesCountGooglePlusMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "social_shares_count.linkedin.min", socialSharesCountLinkedinMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "social_shares_count.linkedin.max", socialSharesCountLinkedinMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "social_shares_count.reddit.min", socialSharesCountRedditMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "social_shares_count.reddit.max", socialSharesCountRedditMax));
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
     * @param relatedStoriesParams RelatedStories parameters
     * @return RelatedStories
     * @throws ApiException if fails to make API call
     */
    public RelatedStories listRelatedStories(RelatedStoriesParams relatedStoriesParams) throws ApiException {
        Object localVarPostBody = null;

        // setting builder variables
        List<Long> id = relatedStoriesParams.getId();
        List<Long> notId = relatedStoriesParams.getNotId();
        String title = relatedStoriesParams.getTitle();
        String body = relatedStoriesParams.getBody();
        String text = relatedStoriesParams.getText();
        List<String> language = relatedStoriesParams.getLanguage();
        List<String> notLanguage = relatedStoriesParams.getNotLanguage();
        String publishedAtStart = relatedStoriesParams.getPublishedAtStart();
        String publishedAtEnd = relatedStoriesParams.getPublishedAtEnd();
        String categoriesTaxonomy = relatedStoriesParams.getCategoriesTaxonomy();
        Boolean categoriesConfident = relatedStoriesParams.getCategoriesConfident();
        List<String> categoriesId = relatedStoriesParams.getCategoriesId();
        List<String> notCategoriesId = relatedStoriesParams.getNotCategoriesId();
        List<Integer> categoriesLevel = relatedStoriesParams.getCategoriesLevel();
        List<Integer> notCategoriesLevel = relatedStoriesParams.getNotCategoriesLevel();
        List<String> entitiesTitleText = relatedStoriesParams.getEntitiesTitleText();
        List<String> notEntitiesTitleText = relatedStoriesParams.getNotEntitiesTitleText();
        List<String> entitiesTitleType = relatedStoriesParams.getEntitiesTitleType();
        List<String> notEntitiesTitleType = relatedStoriesParams.getNotEntitiesTitleType();
        List<String> entitiesTitleLinksDbpedia = relatedStoriesParams.getEntitiesTitleLinksDbpedia();
        List<String> notEntitiesTitleLinksDbpedia = relatedStoriesParams.getNotEntitiesTitleLinksDbpedia();
        List<String> entitiesBodyText = relatedStoriesParams.getEntitiesBodyText();
        List<String> notEntitiesBodyText = relatedStoriesParams.getNotEntitiesBodyText();
        List<String> entitiesBodyType = relatedStoriesParams.getEntitiesBodyType();
        List<String> notEntitiesBodyType = relatedStoriesParams.getNotEntitiesBodyType();
        List<String> entitiesBodyLinksDbpedia = relatedStoriesParams.getEntitiesBodyLinksDbpedia();
        List<String> notEntitiesBodyLinksDbpedia = relatedStoriesParams.getNotEntitiesBodyLinksDbpedia();
        String sentimentTitlePolarity = relatedStoriesParams.getSentimentTitlePolarity();
        String notSentimentTitlePolarity = relatedStoriesParams.getNotSentimentTitlePolarity();
        String sentimentBodyPolarity = relatedStoriesParams.getSentimentBodyPolarity();
        String notSentimentBodyPolarity = relatedStoriesParams.getNotSentimentBodyPolarity();
        Integer mediaImagesCountMin = relatedStoriesParams.getMediaImagesCountMin();
        Integer mediaImagesCountMax = relatedStoriesParams.getMediaImagesCountMax();
        Integer mediaImagesWidthMin = relatedStoriesParams.getMediaImagesWidthMin();
        Integer mediaImagesWidthMax = relatedStoriesParams.getMediaImagesWidthMax();
        Integer mediaImagesHeightMin = relatedStoriesParams.getMediaImagesHeightMin();
        Integer mediaImagesHeightMax = relatedStoriesParams.getMediaImagesHeightMax();
        Integer mediaImagesContentLengthMin = relatedStoriesParams.getMediaImagesContentLengthMin();
        Integer mediaImagesContentLengthMax = relatedStoriesParams.getMediaImagesContentLengthMax();
        List<String> mediaImagesFormat = relatedStoriesParams.getMediaImagesFormat();
        List<String> notMediaImagesFormat = relatedStoriesParams.getNotMediaImagesFormat();
        Integer mediaVideosCountMin = relatedStoriesParams.getMediaVideosCountMin();
        Integer mediaVideosCountMax = relatedStoriesParams.getMediaVideosCountMax();
        List<Integer> authorId = relatedStoriesParams.getAuthorId();
        List<Integer> notAuthorId = relatedStoriesParams.getNotAuthorId();
        String authorName = relatedStoriesParams.getAuthorName();
        String notAuthorName = relatedStoriesParams.getNotAuthorName();
        List<Integer> sourceId = relatedStoriesParams.getSourceId();
        List<Integer> notSourceId = relatedStoriesParams.getNotSourceId();
        List<String> sourceName = relatedStoriesParams.getSourceName();
        List<String> notSourceName = relatedStoriesParams.getNotSourceName();
        List<String> sourceDomain = relatedStoriesParams.getSourceDomain();
        List<String> notSourceDomain = relatedStoriesParams.getNotSourceDomain();
        List<String> sourceLocationsCountry = relatedStoriesParams.getSourceLocationsCountry();
        List<String> notSourceLocationsCountry = relatedStoriesParams.getNotSourceLocationsCountry();
        List<String> sourceLocationsState = relatedStoriesParams.getSourceLocationsState();
        List<String> notSourceLocationsState = relatedStoriesParams.getNotSourceLocationsState();
        List<String> sourceLocationsCity = relatedStoriesParams.getSourceLocationsCity();
        List<String> notSourceLocationsCity = relatedStoriesParams.getNotSourceLocationsCity();
        List<String> sourceScopesCountry = relatedStoriesParams.getSourceScopesCountry();
        List<String> notSourceScopesCountry = relatedStoriesParams.getNotSourceScopesCountry();
        List<String> sourceScopesState = relatedStoriesParams.getSourceScopesState();
        List<String> notSourceScopesState = relatedStoriesParams.getNotSourceScopesState();
        List<String> sourceScopesCity = relatedStoriesParams.getSourceScopesCity();
        List<String> notSourceScopesCity = relatedStoriesParams.getNotSourceScopesCity();
        List<String> sourceScopesLevel = relatedStoriesParams.getSourceScopesLevel();
        List<String> notSourceScopesLevel = relatedStoriesParams.getNotSourceScopesLevel();
        Integer sourceLinksInCountMin = relatedStoriesParams.getSourceLinksInCountMin();
        Integer sourceLinksInCountMax = relatedStoriesParams.getSourceLinksInCountMax();
        Integer sourceRankingsAlexaRankMin = relatedStoriesParams.getSourceRankingsAlexaRankMin();
        Integer sourceRankingsAlexaRankMax = relatedStoriesParams.getSourceRankingsAlexaRankMax();
        List<String> sourceRankingsAlexaCountry = relatedStoriesParams.getSourceRankingsAlexaCountry();
        Integer socialSharesCountFacebookMin = relatedStoriesParams.getSocialSharesCountFacebookMin();
        Integer socialSharesCountFacebookMax = relatedStoriesParams.getSocialSharesCountFacebookMax();
        Integer socialSharesCountGooglePlusMin = relatedStoriesParams.getSocialSharesCountGooglePlusMin();
        Integer socialSharesCountGooglePlusMax = relatedStoriesParams.getSocialSharesCountGooglePlusMax();
        Integer socialSharesCountLinkedinMin = relatedStoriesParams.getSocialSharesCountLinkedinMin();
        Integer socialSharesCountLinkedinMax = relatedStoriesParams.getSocialSharesCountLinkedinMax();
        Integer socialSharesCountRedditMin = relatedStoriesParams.getSocialSharesCountRedditMin();
        Integer socialSharesCountRedditMax = relatedStoriesParams.getSocialSharesCountRedditMax();
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
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "!id[]", notId));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "title", title));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "body", body));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "text", text));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "language[]", language));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "!language[]", notLanguage));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "published_at.start", publishedAtStart));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "published_at.end", publishedAtEnd));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "categories.taxonomy", categoriesTaxonomy));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "categories.confident", categoriesConfident));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "categories.id[]", categoriesId));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "!categories.id[]", notCategoriesId));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "categories.level[]", categoriesLevel));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "!categories.level[]", notCategoriesLevel));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "entities.title.text[]", entitiesTitleText));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "!entities.title.text[]", notEntitiesTitleText));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "entities.title.type[]", entitiesTitleType));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "!entities.title.type[]", notEntitiesTitleType));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "entities.title.links.dbpedia[]", entitiesTitleLinksDbpedia));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "!entities.title.links.dbpedia[]", notEntitiesTitleLinksDbpedia));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "entities.body.text[]", entitiesBodyText));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "!entities.body.text[]", notEntitiesBodyText));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "entities.body.type[]", entitiesBodyType));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "!entities.body.type[]", notEntitiesBodyType));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "entities.body.links.dbpedia[]", entitiesBodyLinksDbpedia));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "!entities.body.links.dbpedia[]", notEntitiesBodyLinksDbpedia));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "sentiment.title.polarity", sentimentTitlePolarity));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "!sentiment.title.polarity", notSentimentTitlePolarity));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "sentiment.body.polarity", sentimentBodyPolarity));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "!sentiment.body.polarity", notSentimentBodyPolarity));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "media.images.count.min", mediaImagesCountMin));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "media.images.count.max", mediaImagesCountMax));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "media.images.width.min", mediaImagesWidthMin));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "media.images.width.max", mediaImagesWidthMax));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "media.images.height.min", mediaImagesHeightMin));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "media.images.height.max", mediaImagesHeightMax));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "media.images.content_length.min", mediaImagesContentLengthMin));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "media.images.content_length.max", mediaImagesContentLengthMax));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "media.images.format[]", mediaImagesFormat));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "!media.images.format[]", notMediaImagesFormat));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "media.videos.count.min", mediaVideosCountMin));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "media.videos.count.max", mediaVideosCountMax));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "author.id[]", authorId));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "!author.id[]", notAuthorId));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "author.name", authorName));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "!author.name", notAuthorName));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "source.id[]", sourceId));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "!source.id[]", notSourceId));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "source.name[]", sourceName));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "!source.name[]", notSourceName));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "source.domain[]", sourceDomain));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "!source.domain[]", notSourceDomain));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "source.locations.country[]", sourceLocationsCountry));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "!source.locations.country[]", notSourceLocationsCountry));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "source.locations.state[]", sourceLocationsState));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "!source.locations.state[]", notSourceLocationsState));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "source.locations.city[]", sourceLocationsCity));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "!source.locations.city[]", notSourceLocationsCity));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "source.scopes.country[]", sourceScopesCountry));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "!source.scopes.country[]", notSourceScopesCountry));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "source.scopes.state[]", sourceScopesState));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "!source.scopes.state[]", notSourceScopesState));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "source.scopes.city[]", sourceScopesCity));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "!source.scopes.city[]", notSourceScopesCity));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "source.scopes.level[]", sourceScopesLevel));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "!source.scopes.level[]", notSourceScopesLevel));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "source.links_in_count.min", sourceLinksInCountMin));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "source.links_in_count.max", sourceLinksInCountMax));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "source.rankings.alexa.rank.min", sourceRankingsAlexaRankMin));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "source.rankings.alexa.rank.max", sourceRankingsAlexaRankMax));
        localVarFormParams.addAll(apiClient.parameterToPairs("multi", "source.rankings.alexa.country[]", sourceRankingsAlexaCountry));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "social_shares_count.facebook.min", socialSharesCountFacebookMin));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "social_shares_count.facebook.max", socialSharesCountFacebookMax));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "social_shares_count.google_plus.min", socialSharesCountGooglePlusMin));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "social_shares_count.google_plus.max", socialSharesCountGooglePlusMax));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "social_shares_count.linkedin.min", socialSharesCountLinkedinMin));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "social_shares_count.linkedin.max", socialSharesCountLinkedinMax));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "social_shares_count.reddit.min", socialSharesCountRedditMin));
        localVarFormParams.addAll(apiClient.parameterToPairs("", "social_shares_count.reddit.max", socialSharesCountRedditMax));
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
        List<Long> notId = storiesParams.getNotId();
        String title = storiesParams.getTitle();
        String body = storiesParams.getBody();
        String text = storiesParams.getText();
        List<String> language = storiesParams.getLanguage();
        List<String> notLanguage = storiesParams.getNotLanguage();
        String publishedAtStart = storiesParams.getPublishedAtStart();
        String publishedAtEnd = storiesParams.getPublishedAtEnd();
        String categoriesTaxonomy = storiesParams.getCategoriesTaxonomy();
        Boolean categoriesConfident = storiesParams.getCategoriesConfident();
        List<String> categoriesId = storiesParams.getCategoriesId();
        List<String> notCategoriesId = storiesParams.getNotCategoriesId();
        List<Integer> categoriesLevel = storiesParams.getCategoriesLevel();
        List<Integer> notCategoriesLevel = storiesParams.getNotCategoriesLevel();
        List<String> entitiesTitleText = storiesParams.getEntitiesTitleText();
        List<String> notEntitiesTitleText = storiesParams.getNotEntitiesTitleText();
        List<String> entitiesTitleType = storiesParams.getEntitiesTitleType();
        List<String> notEntitiesTitleType = storiesParams.getNotEntitiesTitleType();
        List<String> entitiesTitleLinksDbpedia = storiesParams.getEntitiesTitleLinksDbpedia();
        List<String> notEntitiesTitleLinksDbpedia = storiesParams.getNotEntitiesTitleLinksDbpedia();
        List<String> entitiesBodyText = storiesParams.getEntitiesBodyText();
        List<String> notEntitiesBodyText = storiesParams.getNotEntitiesBodyText();
        List<String> entitiesBodyType = storiesParams.getEntitiesBodyType();
        List<String> notEntitiesBodyType = storiesParams.getNotEntitiesBodyType();
        List<String> entitiesBodyLinksDbpedia = storiesParams.getEntitiesBodyLinksDbpedia();
        List<String> notEntitiesBodyLinksDbpedia = storiesParams.getNotEntitiesBodyLinksDbpedia();
        String sentimentTitlePolarity = storiesParams.getSentimentTitlePolarity();
        String notSentimentTitlePolarity = storiesParams.getNotSentimentTitlePolarity();
        String sentimentBodyPolarity = storiesParams.getSentimentBodyPolarity();
        String notSentimentBodyPolarity = storiesParams.getNotSentimentBodyPolarity();
        Integer mediaImagesCountMin = storiesParams.getMediaImagesCountMin();
        Integer mediaImagesCountMax = storiesParams.getMediaImagesCountMax();
        Integer mediaImagesWidthMin = storiesParams.getMediaImagesWidthMin();
        Integer mediaImagesWidthMax = storiesParams.getMediaImagesWidthMax();
        Integer mediaImagesHeightMin = storiesParams.getMediaImagesHeightMin();
        Integer mediaImagesHeightMax = storiesParams.getMediaImagesHeightMax();
        Integer mediaImagesContentLengthMin = storiesParams.getMediaImagesContentLengthMin();
        Integer mediaImagesContentLengthMax = storiesParams.getMediaImagesContentLengthMax();
        List<String> mediaImagesFormat = storiesParams.getMediaImagesFormat();
        List<String> notMediaImagesFormat = storiesParams.getNotMediaImagesFormat();
        Integer mediaVideosCountMin = storiesParams.getMediaVideosCountMin();
        Integer mediaVideosCountMax = storiesParams.getMediaVideosCountMax();
        List<Integer> authorId = storiesParams.getAuthorId();
        List<Integer> notAuthorId = storiesParams.getNotAuthorId();
        String authorName = storiesParams.getAuthorName();
        String notAuthorName = storiesParams.getNotAuthorName();
        List<Integer> sourceId = storiesParams.getSourceId();
        List<Integer> notSourceId = storiesParams.getNotSourceId();
        List<String> sourceName = storiesParams.getSourceName();
        List<String> notSourceName = storiesParams.getNotSourceName();
        List<String> sourceDomain = storiesParams.getSourceDomain();
        List<String> notSourceDomain = storiesParams.getNotSourceDomain();
        List<String> sourceLocationsCountry = storiesParams.getSourceLocationsCountry();
        List<String> notSourceLocationsCountry = storiesParams.getNotSourceLocationsCountry();
        List<String> sourceLocationsState = storiesParams.getSourceLocationsState();
        List<String> notSourceLocationsState = storiesParams.getNotSourceLocationsState();
        List<String> sourceLocationsCity = storiesParams.getSourceLocationsCity();
        List<String> notSourceLocationsCity = storiesParams.getNotSourceLocationsCity();
        List<String> sourceScopesCountry = storiesParams.getSourceScopesCountry();
        List<String> notSourceScopesCountry = storiesParams.getNotSourceScopesCountry();
        List<String> sourceScopesState = storiesParams.getSourceScopesState();
        List<String> notSourceScopesState = storiesParams.getNotSourceScopesState();
        List<String> sourceScopesCity = storiesParams.getSourceScopesCity();
        List<String> notSourceScopesCity = storiesParams.getNotSourceScopesCity();
        List<String> sourceScopesLevel = storiesParams.getSourceScopesLevel();
        List<String> notSourceScopesLevel = storiesParams.getNotSourceScopesLevel();
        Integer sourceLinksInCountMin = storiesParams.getSourceLinksInCountMin();
        Integer sourceLinksInCountMax = storiesParams.getSourceLinksInCountMax();
        Integer sourceRankingsAlexaRankMin = storiesParams.getSourceRankingsAlexaRankMin();
        Integer sourceRankingsAlexaRankMax = storiesParams.getSourceRankingsAlexaRankMax();
        List<String> sourceRankingsAlexaCountry = storiesParams.getSourceRankingsAlexaCountry();
        Integer socialSharesCountFacebookMin = storiesParams.getSocialSharesCountFacebookMin();
        Integer socialSharesCountFacebookMax = storiesParams.getSocialSharesCountFacebookMax();
        Integer socialSharesCountGooglePlusMin = storiesParams.getSocialSharesCountGooglePlusMin();
        Integer socialSharesCountGooglePlusMax = storiesParams.getSocialSharesCountGooglePlusMax();
        Integer socialSharesCountLinkedinMin = storiesParams.getSocialSharesCountLinkedinMin();
        Integer socialSharesCountLinkedinMax = storiesParams.getSocialSharesCountLinkedinMax();
        Integer socialSharesCountRedditMin = storiesParams.getSocialSharesCountRedditMin();
        Integer socialSharesCountRedditMax = storiesParams.getSocialSharesCountRedditMax();
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
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!id[]", notId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "title", title));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "body", body));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "text", text));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "language[]", language));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!language[]", notLanguage));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "published_at.start", publishedAtStart));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "published_at.end", publishedAtEnd));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "categories.taxonomy", categoriesTaxonomy));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "categories.confident", categoriesConfident));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "categories.id[]", categoriesId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!categories.id[]", notCategoriesId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "categories.level[]", categoriesLevel));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!categories.level[]", notCategoriesLevel));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entities.title.text[]", entitiesTitleText));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!entities.title.text[]", notEntitiesTitleText));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entities.title.type[]", entitiesTitleType));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!entities.title.type[]", notEntitiesTitleType));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entities.title.links.dbpedia[]", entitiesTitleLinksDbpedia));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!entities.title.links.dbpedia[]", notEntitiesTitleLinksDbpedia));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entities.body.text[]", entitiesBodyText));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!entities.body.text[]", notEntitiesBodyText));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entities.body.type[]", entitiesBodyType));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!entities.body.type[]", notEntitiesBodyType));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entities.body.links.dbpedia[]", entitiesBodyLinksDbpedia));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!entities.body.links.dbpedia[]", notEntitiesBodyLinksDbpedia));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sentiment.title.polarity", sentimentTitlePolarity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "!sentiment.title.polarity", notSentimentTitlePolarity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sentiment.body.polarity", sentimentBodyPolarity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "!sentiment.body.polarity", notSentimentBodyPolarity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.images.count.min", mediaImagesCountMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.images.count.max", mediaImagesCountMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.images.width.min", mediaImagesWidthMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.images.width.max", mediaImagesWidthMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.images.height.min", mediaImagesHeightMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.images.height.max", mediaImagesHeightMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.images.content_length.min", mediaImagesContentLengthMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.images.content_length.max", mediaImagesContentLengthMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "media.images.format[]", mediaImagesFormat));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!media.images.format[]", notMediaImagesFormat));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.videos.count.min", mediaVideosCountMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.videos.count.max", mediaVideosCountMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "author.id[]", authorId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!author.id[]", notAuthorId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "author.name", authorName));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "!author.name", notAuthorName));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.id[]", sourceId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!source.id[]", notSourceId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.name[]", sourceName));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!source.name[]", notSourceName));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.domain[]", sourceDomain));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!source.domain[]", notSourceDomain));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.locations.country[]", sourceLocationsCountry));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!source.locations.country[]", notSourceLocationsCountry));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.locations.state[]", sourceLocationsState));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!source.locations.state[]", notSourceLocationsState));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.locations.city[]", sourceLocationsCity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!source.locations.city[]", notSourceLocationsCity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.scopes.country[]", sourceScopesCountry));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!source.scopes.country[]", notSourceScopesCountry));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.scopes.state[]", sourceScopesState));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!source.scopes.state[]", notSourceScopesState));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.scopes.city[]", sourceScopesCity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!source.scopes.city[]", notSourceScopesCity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.scopes.level[]", sourceScopesLevel));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!source.scopes.level[]", notSourceScopesLevel));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "source.links_in_count.min", sourceLinksInCountMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "source.links_in_count.max", sourceLinksInCountMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "source.rankings.alexa.rank.min", sourceRankingsAlexaRankMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "source.rankings.alexa.rank.max", sourceRankingsAlexaRankMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.rankings.alexa.country[]", sourceRankingsAlexaCountry));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "social_shares_count.facebook.min", socialSharesCountFacebookMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "social_shares_count.facebook.max", socialSharesCountFacebookMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "social_shares_count.google_plus.min", socialSharesCountGooglePlusMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "social_shares_count.google_plus.max", socialSharesCountGooglePlusMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "social_shares_count.linkedin.min", socialSharesCountLinkedinMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "social_shares_count.linkedin.max", socialSharesCountLinkedinMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "social_shares_count.reddit.min", socialSharesCountRedditMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "social_shares_count.reddit.max", socialSharesCountRedditMax));
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
     * @param timeSeriesParams TimeSeriesList parameters
     * @return TimeSeriesList
     * @throws ApiException if fails to make API call
     */
    public TimeSeriesList listTimeSeries(TimeSeriesParams timeSeriesParams) throws ApiException {
        Object localVarPostBody = null;

        // setting builder variables
        List<Long> id = timeSeriesParams.getId();
        List<Long> notId = timeSeriesParams.getNotId();
        String title = timeSeriesParams.getTitle();
        String body = timeSeriesParams.getBody();
        String text = timeSeriesParams.getText();
        List<String> language = timeSeriesParams.getLanguage();
        List<String> notLanguage = timeSeriesParams.getNotLanguage();
        String categoriesTaxonomy = timeSeriesParams.getCategoriesTaxonomy();
        Boolean categoriesConfident = timeSeriesParams.getCategoriesConfident();
        List<String> categoriesId = timeSeriesParams.getCategoriesId();
        List<String> notCategoriesId = timeSeriesParams.getNotCategoriesId();
        List<Integer> categoriesLevel = timeSeriesParams.getCategoriesLevel();
        List<Integer> notCategoriesLevel = timeSeriesParams.getNotCategoriesLevel();
        List<String> entitiesTitleText = timeSeriesParams.getEntitiesTitleText();
        List<String> notEntitiesTitleText = timeSeriesParams.getNotEntitiesTitleText();
        List<String> entitiesTitleType = timeSeriesParams.getEntitiesTitleType();
        List<String> notEntitiesTitleType = timeSeriesParams.getNotEntitiesTitleType();
        List<String> entitiesTitleLinksDbpedia = timeSeriesParams.getEntitiesTitleLinksDbpedia();
        List<String> notEntitiesTitleLinksDbpedia = timeSeriesParams.getNotEntitiesTitleLinksDbpedia();
        List<String> entitiesBodyText = timeSeriesParams.getEntitiesBodyText();
        List<String> notEntitiesBodyText = timeSeriesParams.getNotEntitiesBodyText();
        List<String> entitiesBodyType = timeSeriesParams.getEntitiesBodyType();
        List<String> notEntitiesBodyType = timeSeriesParams.getNotEntitiesBodyType();
        List<String> entitiesBodyLinksDbpedia = timeSeriesParams.getEntitiesBodyLinksDbpedia();
        List<String> notEntitiesBodyLinksDbpedia = timeSeriesParams.getNotEntitiesBodyLinksDbpedia();
        String sentimentTitlePolarity = timeSeriesParams.getSentimentTitlePolarity();
        String notSentimentTitlePolarity = timeSeriesParams.getNotSentimentTitlePolarity();
        String sentimentBodyPolarity = timeSeriesParams.getSentimentBodyPolarity();
        String notSentimentBodyPolarity = timeSeriesParams.getNotSentimentBodyPolarity();
        Integer mediaImagesCountMin = timeSeriesParams.getMediaImagesCountMin();
        Integer mediaImagesCountMax = timeSeriesParams.getMediaImagesCountMax();
        Integer mediaImagesWidthMin = timeSeriesParams.getMediaImagesWidthMin();
        Integer mediaImagesWidthMax = timeSeriesParams.getMediaImagesWidthMax();
        Integer mediaImagesHeightMin = timeSeriesParams.getMediaImagesHeightMin();
        Integer mediaImagesHeightMax = timeSeriesParams.getMediaImagesHeightMax();
        Integer mediaImagesContentLengthMin = timeSeriesParams.getMediaImagesContentLengthMin();
        Integer mediaImagesContentLengthMax = timeSeriesParams.getMediaImagesContentLengthMax();
        List<String> mediaImagesFormat = timeSeriesParams.getMediaImagesFormat();
        List<String> notMediaImagesFormat = timeSeriesParams.getNotMediaImagesFormat();
        Integer mediaVideosCountMin = timeSeriesParams.getMediaVideosCountMin();
        Integer mediaVideosCountMax = timeSeriesParams.getMediaVideosCountMax();
        List<Integer> authorId = timeSeriesParams.getAuthorId();
        List<Integer> notAuthorId = timeSeriesParams.getNotAuthorId();
        String authorName = timeSeriesParams.getAuthorName();
        String notAuthorName = timeSeriesParams.getNotAuthorName();
        List<Integer> sourceId = timeSeriesParams.getSourceId();
        List<Integer> notSourceId = timeSeriesParams.getNotSourceId();
        List<String> sourceName = timeSeriesParams.getSourceName();
        List<String> notSourceName = timeSeriesParams.getNotSourceName();
        List<String> sourceDomain = timeSeriesParams.getSourceDomain();
        List<String> notSourceDomain = timeSeriesParams.getNotSourceDomain();
        List<String> sourceLocationsCountry = timeSeriesParams.getSourceLocationsCountry();
        List<String> notSourceLocationsCountry = timeSeriesParams.getNotSourceLocationsCountry();
        List<String> sourceLocationsState = timeSeriesParams.getSourceLocationsState();
        List<String> notSourceLocationsState = timeSeriesParams.getNotSourceLocationsState();
        List<String> sourceLocationsCity = timeSeriesParams.getSourceLocationsCity();
        List<String> notSourceLocationsCity = timeSeriesParams.getNotSourceLocationsCity();
        List<String> sourceScopesCountry = timeSeriesParams.getSourceScopesCountry();
        List<String> notSourceScopesCountry = timeSeriesParams.getNotSourceScopesCountry();
        List<String> sourceScopesState = timeSeriesParams.getSourceScopesState();
        List<String> notSourceScopesState = timeSeriesParams.getNotSourceScopesState();
        List<String> sourceScopesCity = timeSeriesParams.getSourceScopesCity();
        List<String> notSourceScopesCity = timeSeriesParams.getNotSourceScopesCity();
        List<String> sourceScopesLevel = timeSeriesParams.getSourceScopesLevel();
        List<String> notSourceScopesLevel = timeSeriesParams.getNotSourceScopesLevel();
        Integer sourceLinksInCountMin = timeSeriesParams.getSourceLinksInCountMin();
        Integer sourceLinksInCountMax = timeSeriesParams.getSourceLinksInCountMax();
        Integer sourceRankingsAlexaRankMin = timeSeriesParams.getSourceRankingsAlexaRankMin();
        Integer sourceRankingsAlexaRankMax = timeSeriesParams.getSourceRankingsAlexaRankMax();
        List<String> sourceRankingsAlexaCountry = timeSeriesParams.getSourceRankingsAlexaCountry();
        Integer socialSharesCountFacebookMin = timeSeriesParams.getSocialSharesCountFacebookMin();
        Integer socialSharesCountFacebookMax = timeSeriesParams.getSocialSharesCountFacebookMax();
        Integer socialSharesCountGooglePlusMin = timeSeriesParams.getSocialSharesCountGooglePlusMin();
        Integer socialSharesCountGooglePlusMax = timeSeriesParams.getSocialSharesCountGooglePlusMax();
        Integer socialSharesCountLinkedinMin = timeSeriesParams.getSocialSharesCountLinkedinMin();
        Integer socialSharesCountLinkedinMax = timeSeriesParams.getSocialSharesCountLinkedinMax();
        Integer socialSharesCountRedditMin = timeSeriesParams.getSocialSharesCountRedditMin();
        Integer socialSharesCountRedditMax = timeSeriesParams.getSocialSharesCountRedditMax();
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
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!id[]", notId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "title", title));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "body", body));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "text", text));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "language[]", language));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!language[]", notLanguage));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "categories.taxonomy", categoriesTaxonomy));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "categories.confident", categoriesConfident));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "categories.id[]", categoriesId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!categories.id[]", notCategoriesId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "categories.level[]", categoriesLevel));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!categories.level[]", notCategoriesLevel));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entities.title.text[]", entitiesTitleText));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!entities.title.text[]", notEntitiesTitleText));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entities.title.type[]", entitiesTitleType));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!entities.title.type[]", notEntitiesTitleType));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entities.title.links.dbpedia[]", entitiesTitleLinksDbpedia));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!entities.title.links.dbpedia[]", notEntitiesTitleLinksDbpedia));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entities.body.text[]", entitiesBodyText));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!entities.body.text[]", notEntitiesBodyText));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entities.body.type[]", entitiesBodyType));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!entities.body.type[]", notEntitiesBodyType));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entities.body.links.dbpedia[]", entitiesBodyLinksDbpedia));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!entities.body.links.dbpedia[]", notEntitiesBodyLinksDbpedia));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sentiment.title.polarity", sentimentTitlePolarity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "!sentiment.title.polarity", notSentimentTitlePolarity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sentiment.body.polarity", sentimentBodyPolarity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "!sentiment.body.polarity", notSentimentBodyPolarity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.images.count.min", mediaImagesCountMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.images.count.max", mediaImagesCountMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.images.width.min", mediaImagesWidthMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.images.width.max", mediaImagesWidthMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.images.height.min", mediaImagesHeightMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.images.height.max", mediaImagesHeightMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.images.content_length.min", mediaImagesContentLengthMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.images.content_length.max", mediaImagesContentLengthMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "media.images.format[]", mediaImagesFormat));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!media.images.format[]", notMediaImagesFormat));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.videos.count.min", mediaVideosCountMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.videos.count.max", mediaVideosCountMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "author.id[]", authorId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!author.id[]", notAuthorId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "author.name", authorName));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "!author.name", notAuthorName));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.id[]", sourceId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!source.id[]", notSourceId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.name[]", sourceName));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!source.name[]", notSourceName));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.domain[]", sourceDomain));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!source.domain[]", notSourceDomain));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.locations.country[]", sourceLocationsCountry));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!source.locations.country[]", notSourceLocationsCountry));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.locations.state[]", sourceLocationsState));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!source.locations.state[]", notSourceLocationsState));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.locations.city[]", sourceLocationsCity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!source.locations.city[]", notSourceLocationsCity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.scopes.country[]", sourceScopesCountry));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!source.scopes.country[]", notSourceScopesCountry));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.scopes.state[]", sourceScopesState));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!source.scopes.state[]", notSourceScopesState));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.scopes.city[]", sourceScopesCity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!source.scopes.city[]", notSourceScopesCity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.scopes.level[]", sourceScopesLevel));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!source.scopes.level[]", notSourceScopesLevel));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "source.links_in_count.min", sourceLinksInCountMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "source.links_in_count.max", sourceLinksInCountMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "source.rankings.alexa.rank.min", sourceRankingsAlexaRankMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "source.rankings.alexa.rank.max", sourceRankingsAlexaRankMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.rankings.alexa.country[]", sourceRankingsAlexaCountry));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "social_shares_count.facebook.min", socialSharesCountFacebookMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "social_shares_count.facebook.max", socialSharesCountFacebookMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "social_shares_count.google_plus.min", socialSharesCountGooglePlusMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "social_shares_count.google_plus.max", socialSharesCountGooglePlusMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "social_shares_count.linkedin.min", socialSharesCountLinkedinMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "social_shares_count.linkedin.max", socialSharesCountLinkedinMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "social_shares_count.reddit.min", socialSharesCountRedditMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "social_shares_count.reddit.max", socialSharesCountRedditMax));
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
        String field = trendsParams.getField();
        List<Long> id = trendsParams.getId();
        List<Long> notId = trendsParams.getNotId();
        String title = trendsParams.getTitle();
        String body = trendsParams.getBody();
        String text = trendsParams.getText();
        List<String> language = trendsParams.getLanguage();
        List<String> notLanguage = trendsParams.getNotLanguage();
        String publishedAtStart = trendsParams.getPublishedAtStart();
        String publishedAtEnd = trendsParams.getPublishedAtEnd();
        String categoriesTaxonomy = trendsParams.getCategoriesTaxonomy();
        Boolean categoriesConfident = trendsParams.getCategoriesConfident();
        List<String> categoriesId = trendsParams.getCategoriesId();
        List<String> notCategoriesId = trendsParams.getNotCategoriesId();
        List<Integer> categoriesLevel = trendsParams.getCategoriesLevel();
        List<Integer> notCategoriesLevel = trendsParams.getNotCategoriesLevel();
        List<String> entitiesTitleText = trendsParams.getEntitiesTitleText();
        List<String> notEntitiesTitleText = trendsParams.getNotEntitiesTitleText();
        List<String> entitiesTitleType = trendsParams.getEntitiesTitleType();
        List<String> notEntitiesTitleType = trendsParams.getNotEntitiesTitleType();
        List<String> entitiesTitleLinksDbpedia = trendsParams.getEntitiesTitleLinksDbpedia();
        List<String> notEntitiesTitleLinksDbpedia = trendsParams.getNotEntitiesTitleLinksDbpedia();
        List<String> entitiesBodyText = trendsParams.getEntitiesBodyText();
        List<String> notEntitiesBodyText = trendsParams.getNotEntitiesBodyText();
        List<String> entitiesBodyType = trendsParams.getEntitiesBodyType();
        List<String> notEntitiesBodyType = trendsParams.getNotEntitiesBodyType();
        List<String> entitiesBodyLinksDbpedia = trendsParams.getEntitiesBodyLinksDbpedia();
        List<String> notEntitiesBodyLinksDbpedia = trendsParams.getNotEntitiesBodyLinksDbpedia();
        String sentimentTitlePolarity = trendsParams.getSentimentTitlePolarity();
        String notSentimentTitlePolarity = trendsParams.getNotSentimentTitlePolarity();
        String sentimentBodyPolarity = trendsParams.getSentimentBodyPolarity();
        String notSentimentBodyPolarity = trendsParams.getNotSentimentBodyPolarity();
        Integer mediaImagesCountMin = trendsParams.getMediaImagesCountMin();
        Integer mediaImagesCountMax = trendsParams.getMediaImagesCountMax();
        Integer mediaImagesWidthMin = trendsParams.getMediaImagesWidthMin();
        Integer mediaImagesWidthMax = trendsParams.getMediaImagesWidthMax();
        Integer mediaImagesHeightMin = trendsParams.getMediaImagesHeightMin();
        Integer mediaImagesHeightMax = trendsParams.getMediaImagesHeightMax();
        Integer mediaImagesContentLengthMin = trendsParams.getMediaImagesContentLengthMin();
        Integer mediaImagesContentLengthMax = trendsParams.getMediaImagesContentLengthMax();
        List<String> mediaImagesFormat = trendsParams.getMediaImagesFormat();
        List<String> notMediaImagesFormat = trendsParams.getNotMediaImagesFormat();
        Integer mediaVideosCountMin = trendsParams.getMediaVideosCountMin();
        Integer mediaVideosCountMax = trendsParams.getMediaVideosCountMax();
        List<Integer> authorId = trendsParams.getAuthorId();
        List<Integer> notAuthorId = trendsParams.getNotAuthorId();
        String authorName = trendsParams.getAuthorName();
        String notAuthorName = trendsParams.getNotAuthorName();
        List<Integer> sourceId = trendsParams.getSourceId();
        List<Integer> notSourceId = trendsParams.getNotSourceId();
        List<String> sourceName = trendsParams.getSourceName();
        List<String> notSourceName = trendsParams.getNotSourceName();
        List<String> sourceDomain = trendsParams.getSourceDomain();
        List<String> notSourceDomain = trendsParams.getNotSourceDomain();
        List<String> sourceLocationsCountry = trendsParams.getSourceLocationsCountry();
        List<String> notSourceLocationsCountry = trendsParams.getNotSourceLocationsCountry();
        List<String> sourceLocationsState = trendsParams.getSourceLocationsState();
        List<String> notSourceLocationsState = trendsParams.getNotSourceLocationsState();
        List<String> sourceLocationsCity = trendsParams.getSourceLocationsCity();
        List<String> notSourceLocationsCity = trendsParams.getNotSourceLocationsCity();
        List<String> sourceScopesCountry = trendsParams.getSourceScopesCountry();
        List<String> notSourceScopesCountry = trendsParams.getNotSourceScopesCountry();
        List<String> sourceScopesState = trendsParams.getSourceScopesState();
        List<String> notSourceScopesState = trendsParams.getNotSourceScopesState();
        List<String> sourceScopesCity = trendsParams.getSourceScopesCity();
        List<String> notSourceScopesCity = trendsParams.getNotSourceScopesCity();
        List<String> sourceScopesLevel = trendsParams.getSourceScopesLevel();
        List<String> notSourceScopesLevel = trendsParams.getNotSourceScopesLevel();
        Integer sourceLinksInCountMin = trendsParams.getSourceLinksInCountMin();
        Integer sourceLinksInCountMax = trendsParams.getSourceLinksInCountMax();
        Integer sourceRankingsAlexaRankMin = trendsParams.getSourceRankingsAlexaRankMin();
        Integer sourceRankingsAlexaRankMax = trendsParams.getSourceRankingsAlexaRankMax();
        List<String> sourceRankingsAlexaCountry = trendsParams.getSourceRankingsAlexaCountry();
        Integer socialSharesCountFacebookMin = trendsParams.getSocialSharesCountFacebookMin();
        Integer socialSharesCountFacebookMax = trendsParams.getSocialSharesCountFacebookMax();
        Integer socialSharesCountGooglePlusMin = trendsParams.getSocialSharesCountGooglePlusMin();
        Integer socialSharesCountGooglePlusMax = trendsParams.getSocialSharesCountGooglePlusMax();
        Integer socialSharesCountLinkedinMin = trendsParams.getSocialSharesCountLinkedinMin();
        Integer socialSharesCountLinkedinMax = trendsParams.getSocialSharesCountLinkedinMax();
        Integer socialSharesCountRedditMin = trendsParams.getSocialSharesCountRedditMin();
        Integer socialSharesCountRedditMax = trendsParams.getSocialSharesCountRedditMax();

        // verify the required parameter 'field' is set
        if (field == null) {
            throw new ApiException(400, "Missing the required parameter 'field' when calling listTrends");
        }

        // create path and map variables
        String localVarPath = "/trends".replaceAll("\\{format\\}", "json");

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        List<Pair> localVarFormParams = new ArrayList<Pair>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "id[]", id));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!id[]", notId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "title", title));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "body", body));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "text", text));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "language[]", language));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!language[]", notLanguage));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "published_at.start", publishedAtStart));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "published_at.end", publishedAtEnd));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "categories.taxonomy", categoriesTaxonomy));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "categories.confident", categoriesConfident));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "categories.id[]", categoriesId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!categories.id[]", notCategoriesId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "categories.level[]", categoriesLevel));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!categories.level[]", notCategoriesLevel));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entities.title.text[]", entitiesTitleText));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!entities.title.text[]", notEntitiesTitleText));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entities.title.type[]", entitiesTitleType));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!entities.title.type[]", notEntitiesTitleType));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entities.title.links.dbpedia[]", entitiesTitleLinksDbpedia));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!entities.title.links.dbpedia[]", notEntitiesTitleLinksDbpedia));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entities.body.text[]", entitiesBodyText));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!entities.body.text[]", notEntitiesBodyText));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entities.body.type[]", entitiesBodyType));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!entities.body.type[]", notEntitiesBodyType));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entities.body.links.dbpedia[]", entitiesBodyLinksDbpedia));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!entities.body.links.dbpedia[]", notEntitiesBodyLinksDbpedia));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sentiment.title.polarity", sentimentTitlePolarity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "!sentiment.title.polarity", notSentimentTitlePolarity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sentiment.body.polarity", sentimentBodyPolarity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "!sentiment.body.polarity", notSentimentBodyPolarity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.images.count.min", mediaImagesCountMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.images.count.max", mediaImagesCountMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.images.width.min", mediaImagesWidthMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.images.width.max", mediaImagesWidthMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.images.height.min", mediaImagesHeightMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.images.height.max", mediaImagesHeightMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.images.content_length.min", mediaImagesContentLengthMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.images.content_length.max", mediaImagesContentLengthMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "media.images.format[]", mediaImagesFormat));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!media.images.format[]", notMediaImagesFormat));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.videos.count.min", mediaVideosCountMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media.videos.count.max", mediaVideosCountMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "author.id[]", authorId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!author.id[]", notAuthorId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "author.name", authorName));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "!author.name", notAuthorName));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.id[]", sourceId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!source.id[]", notSourceId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.name[]", sourceName));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!source.name[]", notSourceName));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.domain[]", sourceDomain));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!source.domain[]", notSourceDomain));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.locations.country[]", sourceLocationsCountry));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!source.locations.country[]", notSourceLocationsCountry));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.locations.state[]", sourceLocationsState));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!source.locations.state[]", notSourceLocationsState));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.locations.city[]", sourceLocationsCity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!source.locations.city[]", notSourceLocationsCity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.scopes.country[]", sourceScopesCountry));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!source.scopes.country[]", notSourceScopesCountry));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.scopes.state[]", sourceScopesState));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!source.scopes.state[]", notSourceScopesState));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.scopes.city[]", sourceScopesCity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!source.scopes.city[]", notSourceScopesCity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.scopes.level[]", sourceScopesLevel));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "!source.scopes.level[]", notSourceScopesLevel));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "source.links_in_count.min", sourceLinksInCountMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "source.links_in_count.max", sourceLinksInCountMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "source.rankings.alexa.rank.min", sourceRankingsAlexaRankMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "source.rankings.alexa.rank.max", sourceRankingsAlexaRankMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source.rankings.alexa.country[]", sourceRankingsAlexaCountry));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "social_shares_count.facebook.min", socialSharesCountFacebookMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "social_shares_count.facebook.max", socialSharesCountFacebookMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "social_shares_count.google_plus.min", socialSharesCountGooglePlusMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "social_shares_count.google_plus.max", socialSharesCountGooglePlusMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "social_shares_count.linkedin.min", socialSharesCountLinkedinMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "social_shares_count.linkedin.max", socialSharesCountLinkedinMax));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "social_shares_count.reddit.min", socialSharesCountRedditMin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "social_shares_count.reddit.max", socialSharesCountRedditMax));
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
