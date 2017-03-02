# DefaultApi

All URIs are relative to *https://api.newsapi.aylien.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listAutocompletes**](DefaultApi.md#listAutocompletes) | **GET** /autocompletes | List autocompletes
[**listCoverages**](DefaultApi.md#listCoverages) | **POST** /coverages | List coverages
[**listHistograms**](DefaultApi.md#listHistograms) | **GET** /histograms | List histograms
[**listRelatedStories**](DefaultApi.md#listRelatedStories) | **POST** /related_stories | List related stories
[**listStories**](DefaultApi.md#listStories) | **GET** /stories | List Stories
[**listTimeSeries**](DefaultApi.md#listTimeSeries) | **GET** /time_series | List time series
[**listTrends**](DefaultApi.md#listTrends) | **GET** /trends | List trends


<a name="listAutocompletes"></a>
# **listAutocompletes**
> Autocompletes listAutocompletes(autocompletesParams)

List autocompletes

This endpoint is used for getting list of autocompletes by providing a specific term and type.

### Example
```java
import com.aylien.newsapi.*;
import com.aylien.newsapi.auth.*;
import com.aylien.newsapi.models.*;
import com.aylien.newsapi.parameters.*;
import com.aylien.newsapi.api.DefaultApi;

import java.util.*;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: app_id
ApiKeyAuth app_id = (ApiKeyAuth) defaultClient.getAuthentication("app_id");
app_id.setApiKey("YOUR_APP_ID");

// Configure API key authorization: app_key
ApiKeyAuth app_key = (ApiKeyAuth) defaultClient.getAuthentication("app_key");
app_key.setApiKey("YOUR_APP_KEY");

DefaultApi apiInstance = new DefaultApi();

String type = "type_example";
String term = "term_example";
String language = "en";
Integer perPage = 3;

AutocompletesParams.Builder autocompletesBuilder = AutocompletesParams.newBuilder();

autocompletesBuilder.setType(type);
autocompletesBuilder.setTerm(term);
autocompletesBuilder.setLanguage(language);
autocompletesBuilder.setPerPage(perPage);

try {
    Autocompletes result = apiInstance.listAutocompletes(autocompletesBuilder.build());
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listAutocompletes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| This parameter is used for defining the type of autocompletes. | [enum: source_names, source_domains, entity_types, dbpedia_resources]
 **term** | **String**| This parameter is used for finding autocomplete objects that contain the specified value. |
 **language** | **String**| This parameter is used for autocompletes whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes. | [optional] [default to en] [enum: en, de, fr, it, es, pt]
 **perPage** | **Integer**| This parameter is used for specifying number of items in each page. | [optional] [default to 3]

### Return type

[**Autocompletes**](Autocompletes.md)

### Authorization

[app_key](../README.md#app_key), [app_id](../README.md#app_id)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json, text/xml

<a name="listCoverages"></a>
# **listCoverages**
> Coverages listCoverages(coveragesParams)

List coverages

This endpoint is used for finding story coverages based on the parameters provided. The maximum number of related stories returned is 100.

### Example
```java
import com.aylien.newsapi.*;
import com.aylien.newsapi.auth.*;
import com.aylien.newsapi.models.*;
import com.aylien.newsapi.parameters.*;
import com.aylien.newsapi.api.DefaultApi;

import java.util.*;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: app_id
ApiKeyAuth app_id = (ApiKeyAuth) defaultClient.getAuthentication("app_id");
app_id.setApiKey("YOUR_APP_ID");

// Configure API key authorization: app_key
ApiKeyAuth app_key = (ApiKeyAuth) defaultClient.getAuthentication("app_key");
app_key.setApiKey("YOUR_APP_KEY");

DefaultApi apiInstance = new DefaultApi();

List<Long> id = Arrays.asList(56L);
List<Long> notId = Arrays.asList(56L);
String title = "title_example";
String body = "body_example";
String text = "text_example";
List<String> language = Arrays.asList("language_example");
List<String> notLanguage = Arrays.asList("notLanguage_example");
String publishedAtStart = "publishedAtStart_example";
String publishedAtEnd = "publishedAtEnd_example";
String categoriesTaxonomy = "categoriesTaxonomy_example";
Boolean categoriesConfident = true;
List<String> categoriesId = Arrays.asList("categoriesId_example");
List<String> notCategoriesId = Arrays.asList("notCategoriesId_example");
List<Integer> categoriesLevel = Arrays.asList(56);
List<Integer> notCategoriesLevel = Arrays.asList(56);
List<String> entitiesTitleText = Arrays.asList("entitiesTitleText_example");
List<String> notEntitiesTitleText = Arrays.asList("notEntitiesTitleText_example");
List<String> entitiesTitleType = Arrays.asList("entitiesTitleType_example");
List<String> notEntitiesTitleType = Arrays.asList("notEntitiesTitleType_example");
List<String> entitiesTitleLinksDbpedia = Arrays.asList("entitiesTitleLinksDbpedia_example");
List<String> notEntitiesTitleLinksDbpedia = Arrays.asList("notEntitiesTitleLinksDbpedia_example");
List<String> entitiesBodyText = Arrays.asList("entitiesBodyText_example");
List<String> notEntitiesBodyText = Arrays.asList("notEntitiesBodyText_example");
List<String> entitiesBodyType = Arrays.asList("entitiesBodyType_example");
List<String> notEntitiesBodyType = Arrays.asList("notEntitiesBodyType_example");
List<String> entitiesBodyLinksDbpedia = Arrays.asList("entitiesBodyLinksDbpedia_example");
List<String> notEntitiesBodyLinksDbpedia = Arrays.asList("notEntitiesBodyLinksDbpedia_example");
String sentimentTitlePolarity = "sentimentTitlePolarity_example";
String notSentimentTitlePolarity = "notSentimentTitlePolarity_example";
String sentimentBodyPolarity = "sentimentBodyPolarity_example";
String notSentimentBodyPolarity = "notSentimentBodyPolarity_example";
Integer mediaImagesCountMin = 56;
Integer mediaImagesCountMax = 56;
Integer mediaImagesWidthMin = 56;
Integer mediaImagesWidthMax = 56;
Integer mediaImagesHeightMin = 56;
Integer mediaImagesHeightMax = 56;
Integer mediaImagesContentLengthMin = 56;
Integer mediaImagesContentLengthMax = 56;
List<String> mediaImagesFormat = Arrays.asList("mediaImagesFormat_example");
List<String> notMediaImagesFormat = Arrays.asList("notMediaImagesFormat_example");
Integer mediaVideosCountMin = 56;
Integer mediaVideosCountMax = 56;
List<Integer> authorId = Arrays.asList(56);
List<Integer> notAuthorId = Arrays.asList(56);
String authorName = "authorName_example";
String notAuthorName = "notAuthorName_example";
List<Integer> sourceId = Arrays.asList(56);
List<Integer> notSourceId = Arrays.asList(56);
List<String> sourceName = Arrays.asList("sourceName_example");
List<String> notSourceName = Arrays.asList("notSourceName_example");
List<String> sourceDomain = Arrays.asList("sourceDomain_example");
List<String> notSourceDomain = Arrays.asList("notSourceDomain_example");
List<String> sourceLocationsCountry = Arrays.asList("sourceLocationsCountry_example");
List<String> notSourceLocationsCountry = Arrays.asList("notSourceLocationsCountry_example");
List<String> sourceLocationsState = Arrays.asList("sourceLocationsState_example");
List<String> notSourceLocationsState = Arrays.asList("notSourceLocationsState_example");
List<String> sourceLocationsCity = Arrays.asList("sourceLocationsCity_example");
List<String> notSourceLocationsCity = Arrays.asList("notSourceLocationsCity_example");
List<String> sourceScopesCountry = Arrays.asList("sourceScopesCountry_example");
List<String> notSourceScopesCountry = Arrays.asList("notSourceScopesCountry_example");
List<String> sourceScopesState = Arrays.asList("sourceScopesState_example");
List<String> notSourceScopesState = Arrays.asList("notSourceScopesState_example");
List<String> sourceScopesCity = Arrays.asList("sourceScopesCity_example");
List<String> notSourceScopesCity = Arrays.asList("notSourceScopesCity_example");
List<String> sourceScopesLevel = Arrays.asList("sourceScopesLevel_example");
List<String> notSourceScopesLevel = Arrays.asList("notSourceScopesLevel_example");
Integer sourceLinksInCountMin = 56;
Integer sourceLinksInCountMax = 56;
Integer sourceRankingsAlexaRankMin = 56;
Integer sourceRankingsAlexaRankMax = 56;
List<String> sourceRankingsAlexaCountry = Arrays.asList("sourceRankingsAlexaCountry_example");
Integer socialSharesCountFacebookMin = 56;
Integer socialSharesCountFacebookMax = 56;
Integer socialSharesCountGooglePlusMin = 56;
Integer socialSharesCountGooglePlusMax = 56;
Integer socialSharesCountLinkedinMin = 56;
Integer socialSharesCountLinkedinMax = 56;
Integer socialSharesCountRedditMin = 56;
Integer socialSharesCountRedditMax = 56;
Boolean cluster = false;
String clusterAlgorithm = "lingo";
List<String> _return = Arrays.asList("_return_example");
Long storyId = 789L;
String storyUrl = "storyUrl_example";
String storyTitle = "storyTitle_example";
String storyBody = "storyBody_example";
DateTime storyPublishedAt = new DateTime();
String storyLanguage = "auto";
Integer perPage = 3;

CoveragesParams.Builder coveragesBuilder = CoveragesParams.newBuilder();

coveragesBuilder.setId(id);
coveragesBuilder.setNotId(notId);
coveragesBuilder.setTitle(title);
coveragesBuilder.setBody(body);
coveragesBuilder.setText(text);
coveragesBuilder.setLanguage(language);
coveragesBuilder.setNotLanguage(notLanguage);
coveragesBuilder.setPublishedAtStart(publishedAtStart);
coveragesBuilder.setPublishedAtEnd(publishedAtEnd);
coveragesBuilder.setCategoriesTaxonomy(categoriesTaxonomy);
coveragesBuilder.setCategoriesConfident(categoriesConfident);
coveragesBuilder.setCategoriesId(categoriesId);
coveragesBuilder.setNotCategoriesId(notCategoriesId);
coveragesBuilder.setCategoriesLevel(categoriesLevel);
coveragesBuilder.setNotCategoriesLevel(notCategoriesLevel);
coveragesBuilder.setEntitiesTitleText(entitiesTitleText);
coveragesBuilder.setNotEntitiesTitleText(notEntitiesTitleText);
coveragesBuilder.setEntitiesTitleType(entitiesTitleType);
coveragesBuilder.setNotEntitiesTitleType(notEntitiesTitleType);
coveragesBuilder.setEntitiesTitleLinksDbpedia(entitiesTitleLinksDbpedia);
coveragesBuilder.setNotEntitiesTitleLinksDbpedia(notEntitiesTitleLinksDbpedia);
coveragesBuilder.setEntitiesBodyText(entitiesBodyText);
coveragesBuilder.setNotEntitiesBodyText(notEntitiesBodyText);
coveragesBuilder.setEntitiesBodyType(entitiesBodyType);
coveragesBuilder.setNotEntitiesBodyType(notEntitiesBodyType);
coveragesBuilder.setEntitiesBodyLinksDbpedia(entitiesBodyLinksDbpedia);
coveragesBuilder.setNotEntitiesBodyLinksDbpedia(notEntitiesBodyLinksDbpedia);
coveragesBuilder.setSentimentTitlePolarity(sentimentTitlePolarity);
coveragesBuilder.setNotSentimentTitlePolarity(notSentimentTitlePolarity);
coveragesBuilder.setSentimentBodyPolarity(sentimentBodyPolarity);
coveragesBuilder.setNotSentimentBodyPolarity(notSentimentBodyPolarity);
coveragesBuilder.setMediaImagesCountMin(mediaImagesCountMin);
coveragesBuilder.setMediaImagesCountMax(mediaImagesCountMax);
coveragesBuilder.setMediaImagesWidthMin(mediaImagesWidthMin);
coveragesBuilder.setMediaImagesWidthMax(mediaImagesWidthMax);
coveragesBuilder.setMediaImagesHeightMin(mediaImagesHeightMin);
coveragesBuilder.setMediaImagesHeightMax(mediaImagesHeightMax);
coveragesBuilder.setMediaImagesContentLengthMin(mediaImagesContentLengthMin);
coveragesBuilder.setMediaImagesContentLengthMax(mediaImagesContentLengthMax);
coveragesBuilder.setMediaImagesFormat(mediaImagesFormat);
coveragesBuilder.setNotMediaImagesFormat(notMediaImagesFormat);
coveragesBuilder.setMediaVideosCountMin(mediaVideosCountMin);
coveragesBuilder.setMediaVideosCountMax(mediaVideosCountMax);
coveragesBuilder.setAuthorId(authorId);
coveragesBuilder.setNotAuthorId(notAuthorId);
coveragesBuilder.setAuthorName(authorName);
coveragesBuilder.setNotAuthorName(notAuthorName);
coveragesBuilder.setSourceId(sourceId);
coveragesBuilder.setNotSourceId(notSourceId);
coveragesBuilder.setSourceName(sourceName);
coveragesBuilder.setNotSourceName(notSourceName);
coveragesBuilder.setSourceDomain(sourceDomain);
coveragesBuilder.setNotSourceDomain(notSourceDomain);
coveragesBuilder.setSourceLocationsCountry(sourceLocationsCountry);
coveragesBuilder.setNotSourceLocationsCountry(notSourceLocationsCountry);
coveragesBuilder.setSourceLocationsState(sourceLocationsState);
coveragesBuilder.setNotSourceLocationsState(notSourceLocationsState);
coveragesBuilder.setSourceLocationsCity(sourceLocationsCity);
coveragesBuilder.setNotSourceLocationsCity(notSourceLocationsCity);
coveragesBuilder.setSourceScopesCountry(sourceScopesCountry);
coveragesBuilder.setNotSourceScopesCountry(notSourceScopesCountry);
coveragesBuilder.setSourceScopesState(sourceScopesState);
coveragesBuilder.setNotSourceScopesState(notSourceScopesState);
coveragesBuilder.setSourceScopesCity(sourceScopesCity);
coveragesBuilder.setNotSourceScopesCity(notSourceScopesCity);
coveragesBuilder.setSourceScopesLevel(sourceScopesLevel);
coveragesBuilder.setNotSourceScopesLevel(notSourceScopesLevel);
coveragesBuilder.setSourceLinksInCountMin(sourceLinksInCountMin);
coveragesBuilder.setSourceLinksInCountMax(sourceLinksInCountMax);
coveragesBuilder.setSourceRankingsAlexaRankMin(sourceRankingsAlexaRankMin);
coveragesBuilder.setSourceRankingsAlexaRankMax(sourceRankingsAlexaRankMax);
coveragesBuilder.setSourceRankingsAlexaCountry(sourceRankingsAlexaCountry);
coveragesBuilder.setSocialSharesCountFacebookMin(socialSharesCountFacebookMin);
coveragesBuilder.setSocialSharesCountFacebookMax(socialSharesCountFacebookMax);
coveragesBuilder.setSocialSharesCountGooglePlusMin(socialSharesCountGooglePlusMin);
coveragesBuilder.setSocialSharesCountGooglePlusMax(socialSharesCountGooglePlusMax);
coveragesBuilder.setSocialSharesCountLinkedinMin(socialSharesCountLinkedinMin);
coveragesBuilder.setSocialSharesCountLinkedinMax(socialSharesCountLinkedinMax);
coveragesBuilder.setSocialSharesCountRedditMin(socialSharesCountRedditMin);
coveragesBuilder.setSocialSharesCountRedditMax(socialSharesCountRedditMax);
coveragesBuilder.setCluster(cluster);
coveragesBuilder.setClusterAlgorithm(clusterAlgorithm);
coveragesBuilder.set_return(_return);
coveragesBuilder.setStoryId(storyId);
coveragesBuilder.setStoryUrl(storyUrl);
coveragesBuilder.setStoryTitle(storyTitle);
coveragesBuilder.setStoryBody(storyBody);
coveragesBuilder.setStoryPublishedAt(storyPublishedAt);
coveragesBuilder.setStoryLanguage(storyLanguage);
coveragesBuilder.setPerPage(perPage);

try {
    Coverages result = apiInstance.listCoverages(coveragesBuilder.build());
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listCoverages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **List&lt;Long&gt;**| This parameter is used for finding stories by story id. | [optional]
 **notId** | **List&lt;Long&gt;**| This parameter is used for excluding stories by story id. | [optional]
 **title** | **String**| This parameter is used for finding stories whose title contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). | [optional]
 **body** | **String**| This parameter is used for finding stories whose body contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). | [optional]
 **text** | **String**| This parameter is used for finding stories whose title or body contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). | [optional]
 **language** | **List&lt;String&gt;**| This parameter is used for finding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes. | [optional] [enum: en, de, fr, it, es, pt]
 **notLanguage** | **List&lt;String&gt;**| This parameter is used for excluding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes. | [optional] [enum: en, de, fr, it, es, pt]
 **publishedAtStart** | **String**| This parameter is used for finding stories whose published at time is greater than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates). | [optional]
 **publishedAtEnd** | **String**| This parameter is used for finding stories whose published at time is less than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates). | [optional]
 **categoriesTaxonomy** | **String**| This parameter is used for defining the type of the taxonomy for the rest of the categories queries. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). | [optional] [enum: iab-qag, iptc-subjectcode]
 **categoriesConfident** | **Boolean**| This parameter is used for finding stories whose categories are confident. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). | [optional] [default to true]
 **categoriesId** | **List&lt;String&gt;**| This parameter is used for finding stories by categories id. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). | [optional]
 **notCategoriesId** | **List&lt;String&gt;**| This parameter is used for excluding stories by categories id. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). | [optional]
 **categoriesLevel** | **List&lt;Integer&gt;**| This parameter is used for finding stories by categories level. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). | [optional]
 **notCategoriesLevel** | **List&lt;Integer&gt;**| This parameter is used for excluding stories by categories level. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). | [optional]
 **entitiesTitleText** | **List&lt;String&gt;**| This parameter is used to find stories based on the specified entities &#x60;text&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **notEntitiesTitleText** | **List&lt;String&gt;**| This parameter is used to exclude stories based on the specified entities &#x60;text&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **entitiesTitleType** | **List&lt;String&gt;**| This parameter is used to find stories based on the specified entities &#x60;type&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **notEntitiesTitleType** | **List&lt;String&gt;**| This parameter is used to exclude stories based on the specified entities &#x60;type&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **entitiesTitleLinksDbpedia** | **List&lt;String&gt;**| This parameter is used to find stories based on the specified entities dbpedia URL in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **notEntitiesTitleLinksDbpedia** | **List&lt;String&gt;**| This parameter is used to exclude stories based on the specified entities dbpedia URL in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **entitiesBodyText** | **List&lt;String&gt;**| This parameter is used to find stories based on the specified entities &#x60;text&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **notEntitiesBodyText** | **List&lt;String&gt;**| This parameter is used to exclude stories based on the specified entities &#x60;text&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **entitiesBodyType** | **List&lt;String&gt;**| This parameter is used to find stories based on the specified entities &#x60;type&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **notEntitiesBodyType** | **List&lt;String&gt;**| This parameter is used to exclude stories based on the specified entities &#x60;type&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **entitiesBodyLinksDbpedia** | **List&lt;String&gt;**| This parameter is used to find stories based on the specified entities dbpedia URL in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **notEntitiesBodyLinksDbpedia** | **List&lt;String&gt;**| This parameter is used to exclude stories based on the specified entities dbpedia URL in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **sentimentTitlePolarity** | **String**| This parameter is used for finding stories whose title sentiment is the specified value. | [optional] [enum: positive, neutral, negative]
 **notSentimentTitlePolarity** | **String**| This parameter is used for excluding stories whose title sentiment is the specified value. | [optional] [enum: positive, neutral, negative]
 **sentimentBodyPolarity** | **String**| This parameter is used for finding stories whose body sentiment is the specified value. | [optional] [enum: positive, neutral, negative]
 **notSentimentBodyPolarity** | **String**| This parameter is used for excluding stories whose body sentiment is the specified value. | [optional] [enum: positive, neutral, negative]
 **mediaImagesCountMin** | **Integer**| This parameter is used for finding stories whose number of images is greater than or equal to the specified value. | [optional]
 **mediaImagesCountMax** | **Integer**| This parameter is used for finding stories whose number of images is less than or equal to the specified value. | [optional]
 **mediaImagesWidthMin** | **Integer**| This parameter is used for finding stories whose width of images are greater than or equal to the specified value. | [optional]
 **mediaImagesWidthMax** | **Integer**| This parameter is used for finding stories whose width of images are less than or equal to the specified value. | [optional]
 **mediaImagesHeightMin** | **Integer**| This parameter is used for finding stories whose height of images are greater than or equal to the specified value. | [optional]
 **mediaImagesHeightMax** | **Integer**| This parameter is used for finding stories whose height of images are less than or equal to the specified value. | [optional]
 **mediaImagesContentLengthMin** | **Integer**| This parameter is used for finding stories whose images content length are greater than or equal to the specified value. | [optional]
 **mediaImagesContentLengthMax** | **Integer**| This parameter is used for finding stories whose images content length are less than or equal to the specified value. | [optional]
 **mediaImagesFormat** | **List&lt;String&gt;**| This parameter is used for finding stories whose images format are the specified value. | [optional] [enum: BMP, GIF, JPEG, PNG, TIFF, PSD, ICO, CUR, WEBP, SVG]
 **notMediaImagesFormat** | **List&lt;String&gt;**| This parameter is used for excluding stories whose images format are the specified value. | [optional] [enum: BMP, GIF, JPEG, PNG, TIFF, PSD, ICO, CUR, WEBP, SVG]
 **mediaVideosCountMin** | **Integer**| This parameter is used for finding stories whose number of videos is greater than or equal to the specified value. | [optional]
 **mediaVideosCountMax** | **Integer**| This parameter is used for finding stories whose number of videos is less than or equal to the specified value. | [optional]
 **authorId** | **List&lt;Integer&gt;**| This parameter is used for finding stories whose author id is the specified value. | [optional]
 **notAuthorId** | **List&lt;Integer&gt;**| This parameter is used for excluding stories whose author id is the specified value. | [optional]
 **authorName** | **String**| This parameter is used for finding stories whose author full name contains the specified value. | [optional]
 **notAuthorName** | **String**| This parameter is used for excluding stories whose author full name contains the specified value. | [optional]
 **sourceId** | **List&lt;Integer&gt;**| This parameter is used for finding stories whose source id is the specified value. | [optional]
 **notSourceId** | **List&lt;Integer&gt;**| This parameter is used for excluding stories whose source id is the specified value. | [optional]
 **sourceName** | **List&lt;String&gt;**| This parameter is used for finding stories whose source name contains the specified value. | [optional]
 **notSourceName** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source name contains the specified value. | [optional]
 **sourceDomain** | **List&lt;String&gt;**| This parameter is used for finding stories whose source domain is the specified value. | [optional]
 **notSourceDomain** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source domain is the specified value. | [optional]
 **sourceLocationsCountry** | **List&lt;String&gt;**| This parameter is used for finding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **notSourceLocationsCountry** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **sourceLocationsState** | **List&lt;String&gt;**| This parameter is used for finding stories whose source state/province is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **notSourceLocationsState** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source state/province is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **sourceLocationsCity** | **List&lt;String&gt;**| This parameter is used for finding stories whose source city is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **notSourceLocationsCity** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source city is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **sourceScopesCountry** | **List&lt;String&gt;**| This parameter is used for finding stories whose source scopes  is the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **notSourceScopesCountry** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source scopes  is the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **sourceScopesState** | **List&lt;String&gt;**| This parameter is used for finding stories whose source scopes is the specified state/province value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **notSourceScopesState** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source scopes is the specified state/province value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **sourceScopesCity** | **List&lt;String&gt;**| This parameter is used for finding stories whose source scopes is the specified city value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **notSourceScopesCity** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source scopes is the specified city value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **sourceScopesLevel** | **List&lt;String&gt;**| This parameter is used for finding stories whose source scopes  is the specified level value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional] [enum: international, national, local]
 **notSourceScopesLevel** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source scopes  is the specified level value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional] [enum: international, national, local]
 **sourceLinksInCountMin** | **Integer**| This parameter is used for finding stories from sources whose Links in count is greater than or equal to the specified value. You can read more about working with Links in count [here](https://newsapi.aylien.com/docs/working-with-links-in-count). | [optional]
 **sourceLinksInCountMax** | **Integer**| This parameter is used for finding stories from sources whose Links in count is less than or equal to the specified value. You can read more about working with Links in count [here](https://newsapi.aylien.com/docs/working-with-links-in-count). | [optional]
 **sourceRankingsAlexaRankMin** | **Integer**| This parameter is used for finding stories from sources whose Alexa rank is greater than or equal to the specified value. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks). | [optional]
 **sourceRankingsAlexaRankMax** | **Integer**| This parameter is used for finding stories from sources whose Alexa rank is less than or equal to the specified value. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks). | [optional]
 **sourceRankingsAlexaCountry** | **List&lt;String&gt;**| This parameter is used for finding stories from sources whose Alexa rank is in the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks). | [optional]
 **socialSharesCountFacebookMin** | **Integer**| This parameter is used for finding stories whose Facebook social shares count is greater than or equal to the specified value. | [optional]
 **socialSharesCountFacebookMax** | **Integer**| This parameter is used for finding stories whose Facebook social shares count is less than or equal to the specified value. | [optional]
 **socialSharesCountGooglePlusMin** | **Integer**| This parameter is used for finding stories whose Google+ social shares count is greater than or equal to the specified value. | [optional]
 **socialSharesCountGooglePlusMax** | **Integer**| This parameter is used for finding stories whose Google+ social shares count is less than or equal to the specified value. | [optional]
 **socialSharesCountLinkedinMin** | **Integer**| This parameter is used for finding stories whose LinkedIn social shares count is greater than or equal to the specified value. | [optional]
 **socialSharesCountLinkedinMax** | **Integer**| This parameter is used for finding stories whose LinkedIn social shares count is less than or equal to the specified value. | [optional]
 **socialSharesCountRedditMin** | **Integer**| This parameter is used for finding stories whose Reddit social shares count is greater than or equal to the specified value. | [optional]
 **socialSharesCountRedditMax** | **Integer**| This parameter is used for finding stories whose Reddit social shares count is less than or equal to the specified value. | [optional]
 **cluster** | **Boolean**| This parameter enables clustering for the returned stories. You can read more about working with clustering [here](https://newsapi.aylien.com/docs/working-with-clustering). | [optional] [default to false]
 **clusterAlgorithm** | **String**| This parameter is used for specifying the clustering algorithm you wish to use. It supprts STC, Lingo and [k-means](https://en.wikipedia.org/wiki/K-means_clustering) algorithms. You can read more about working with clustering [here](https://newsapi.aylien.com/docs/working-with-clustering). | [optional] [default to lingo] [enum: stc, lingo, kmeans]
 **_return** | **List&lt;String&gt;**| This parameter is used for specifying return fields. | [optional] [enum: id, title, body, summary, source, author, entities, keywords, hashtags, characters_count, words_count, sentences_count, paragraphs_count, categories, social_shares_count, media, sentiment, language, published_at, links]
 **storyId** | **Long**| A story id | [optional]
 **storyUrl** | **String**| An article or webpage | [optional]
 **storyTitle** | **String**| Title of the article | [optional]
 **storyBody** | **String**| Body of the article | [optional]
 **storyPublishedAt** | **DateTime**| Publish date of the article. If you use a url or title and body of an article for getting coverages, this parameter is required. The format used is a restricted form of the canonical representation of dateTime in the [XML Schema specification (ISO 8601)](https://www.w3.org/TR/xmlschema-2/#dateTime). | [optional]
 **storyLanguage** | **String**| This parameter is used for setting the language of the story. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes. | [optional] [default to auto] [enum: auto, en, de, fr, it, es, pt]
 **perPage** | **Integer**| This parameter is used for specifying number of items in each page. | [optional] [default to 3]

### Return type

[**Coverages**](Coverages.md)

### Authorization

[app_key](../README.md#app_key), [app_id](../README.md#app_id)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json, text/xml

<a name="listHistograms"></a>
# **listHistograms**
> Histograms listHistograms(histogramsParams)

List histograms

This endpoint is used for getting histograms based on the &#x60;field&#x60; parameter passed to the API.

### Example
```java
import com.aylien.newsapi.*;
import com.aylien.newsapi.auth.*;
import com.aylien.newsapi.models.*;
import com.aylien.newsapi.parameters.*;
import com.aylien.newsapi.api.DefaultApi;

import java.util.*;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: app_id
ApiKeyAuth app_id = (ApiKeyAuth) defaultClient.getAuthentication("app_id");
app_id.setApiKey("YOUR_APP_ID");

// Configure API key authorization: app_key
ApiKeyAuth app_key = (ApiKeyAuth) defaultClient.getAuthentication("app_key");
app_key.setApiKey("YOUR_APP_KEY");

DefaultApi apiInstance = new DefaultApi();

List<Long> id = Arrays.asList(56L);
List<Long> notId = Arrays.asList(56L);
String title = "title_example";
String body = "body_example";
String text = "text_example";
List<String> language = Arrays.asList("language_example");
List<String> notLanguage = Arrays.asList("notLanguage_example");
String publishedAtStart = "publishedAtStart_example";
String publishedAtEnd = "publishedAtEnd_example";
String categoriesTaxonomy = "categoriesTaxonomy_example";
Boolean categoriesConfident = true;
List<String> categoriesId = Arrays.asList("categoriesId_example");
List<String> notCategoriesId = Arrays.asList("notCategoriesId_example");
List<Integer> categoriesLevel = Arrays.asList(56);
List<Integer> notCategoriesLevel = Arrays.asList(56);
List<String> entitiesTitleText = Arrays.asList("entitiesTitleText_example");
List<String> notEntitiesTitleText = Arrays.asList("notEntitiesTitleText_example");
List<String> entitiesTitleType = Arrays.asList("entitiesTitleType_example");
List<String> notEntitiesTitleType = Arrays.asList("notEntitiesTitleType_example");
List<String> entitiesTitleLinksDbpedia = Arrays.asList("entitiesTitleLinksDbpedia_example");
List<String> notEntitiesTitleLinksDbpedia = Arrays.asList("notEntitiesTitleLinksDbpedia_example");
List<String> entitiesBodyText = Arrays.asList("entitiesBodyText_example");
List<String> notEntitiesBodyText = Arrays.asList("notEntitiesBodyText_example");
List<String> entitiesBodyType = Arrays.asList("entitiesBodyType_example");
List<String> notEntitiesBodyType = Arrays.asList("notEntitiesBodyType_example");
List<String> entitiesBodyLinksDbpedia = Arrays.asList("entitiesBodyLinksDbpedia_example");
List<String> notEntitiesBodyLinksDbpedia = Arrays.asList("notEntitiesBodyLinksDbpedia_example");
String sentimentTitlePolarity = "sentimentTitlePolarity_example";
String notSentimentTitlePolarity = "notSentimentTitlePolarity_example";
String sentimentBodyPolarity = "sentimentBodyPolarity_example";
String notSentimentBodyPolarity = "notSentimentBodyPolarity_example";
Integer mediaImagesCountMin = 56;
Integer mediaImagesCountMax = 56;
Integer mediaImagesWidthMin = 56;
Integer mediaImagesWidthMax = 56;
Integer mediaImagesHeightMin = 56;
Integer mediaImagesHeightMax = 56;
Integer mediaImagesContentLengthMin = 56;
Integer mediaImagesContentLengthMax = 56;
List<String> mediaImagesFormat = Arrays.asList("mediaImagesFormat_example");
List<String> notMediaImagesFormat = Arrays.asList("notMediaImagesFormat_example");
Integer mediaVideosCountMin = 56;
Integer mediaVideosCountMax = 56;
List<Integer> authorId = Arrays.asList(56);
List<Integer> notAuthorId = Arrays.asList(56);
String authorName = "authorName_example";
String notAuthorName = "notAuthorName_example";
List<Integer> sourceId = Arrays.asList(56);
List<Integer> notSourceId = Arrays.asList(56);
List<String> sourceName = Arrays.asList("sourceName_example");
List<String> notSourceName = Arrays.asList("notSourceName_example");
List<String> sourceDomain = Arrays.asList("sourceDomain_example");
List<String> notSourceDomain = Arrays.asList("notSourceDomain_example");
List<String> sourceLocationsCountry = Arrays.asList("sourceLocationsCountry_example");
List<String> notSourceLocationsCountry = Arrays.asList("notSourceLocationsCountry_example");
List<String> sourceLocationsState = Arrays.asList("sourceLocationsState_example");
List<String> notSourceLocationsState = Arrays.asList("notSourceLocationsState_example");
List<String> sourceLocationsCity = Arrays.asList("sourceLocationsCity_example");
List<String> notSourceLocationsCity = Arrays.asList("notSourceLocationsCity_example");
List<String> sourceScopesCountry = Arrays.asList("sourceScopesCountry_example");
List<String> notSourceScopesCountry = Arrays.asList("notSourceScopesCountry_example");
List<String> sourceScopesState = Arrays.asList("sourceScopesState_example");
List<String> notSourceScopesState = Arrays.asList("notSourceScopesState_example");
List<String> sourceScopesCity = Arrays.asList("sourceScopesCity_example");
List<String> notSourceScopesCity = Arrays.asList("notSourceScopesCity_example");
List<String> sourceScopesLevel = Arrays.asList("sourceScopesLevel_example");
List<String> notSourceScopesLevel = Arrays.asList("notSourceScopesLevel_example");
Integer sourceLinksInCountMin = 56;
Integer sourceLinksInCountMax = 56;
Integer sourceRankingsAlexaRankMin = 56;
Integer sourceRankingsAlexaRankMax = 56;
List<String> sourceRankingsAlexaCountry = Arrays.asList("sourceRankingsAlexaCountry_example");
Integer socialSharesCountFacebookMin = 56;
Integer socialSharesCountFacebookMax = 56;
Integer socialSharesCountGooglePlusMin = 56;
Integer socialSharesCountGooglePlusMax = 56;
Integer socialSharesCountLinkedinMin = 56;
Integer socialSharesCountLinkedinMax = 56;
Integer socialSharesCountRedditMin = 56;
Integer socialSharesCountRedditMax = 56;
Integer intervalStart = 56;
Integer intervalEnd = 56;
Integer intervalWidth = 56;
String field = "social_shares_count";

HistogramsParams.Builder histogramsBuilder = HistogramsParams.newBuilder();

histogramsBuilder.setId(id);
histogramsBuilder.setNotId(notId);
histogramsBuilder.setTitle(title);
histogramsBuilder.setBody(body);
histogramsBuilder.setText(text);
histogramsBuilder.setLanguage(language);
histogramsBuilder.setNotLanguage(notLanguage);
histogramsBuilder.setPublishedAtStart(publishedAtStart);
histogramsBuilder.setPublishedAtEnd(publishedAtEnd);
histogramsBuilder.setCategoriesTaxonomy(categoriesTaxonomy);
histogramsBuilder.setCategoriesConfident(categoriesConfident);
histogramsBuilder.setCategoriesId(categoriesId);
histogramsBuilder.setNotCategoriesId(notCategoriesId);
histogramsBuilder.setCategoriesLevel(categoriesLevel);
histogramsBuilder.setNotCategoriesLevel(notCategoriesLevel);
histogramsBuilder.setEntitiesTitleText(entitiesTitleText);
histogramsBuilder.setNotEntitiesTitleText(notEntitiesTitleText);
histogramsBuilder.setEntitiesTitleType(entitiesTitleType);
histogramsBuilder.setNotEntitiesTitleType(notEntitiesTitleType);
histogramsBuilder.setEntitiesTitleLinksDbpedia(entitiesTitleLinksDbpedia);
histogramsBuilder.setNotEntitiesTitleLinksDbpedia(notEntitiesTitleLinksDbpedia);
histogramsBuilder.setEntitiesBodyText(entitiesBodyText);
histogramsBuilder.setNotEntitiesBodyText(notEntitiesBodyText);
histogramsBuilder.setEntitiesBodyType(entitiesBodyType);
histogramsBuilder.setNotEntitiesBodyType(notEntitiesBodyType);
histogramsBuilder.setEntitiesBodyLinksDbpedia(entitiesBodyLinksDbpedia);
histogramsBuilder.setNotEntitiesBodyLinksDbpedia(notEntitiesBodyLinksDbpedia);
histogramsBuilder.setSentimentTitlePolarity(sentimentTitlePolarity);
histogramsBuilder.setNotSentimentTitlePolarity(notSentimentTitlePolarity);
histogramsBuilder.setSentimentBodyPolarity(sentimentBodyPolarity);
histogramsBuilder.setNotSentimentBodyPolarity(notSentimentBodyPolarity);
histogramsBuilder.setMediaImagesCountMin(mediaImagesCountMin);
histogramsBuilder.setMediaImagesCountMax(mediaImagesCountMax);
histogramsBuilder.setMediaImagesWidthMin(mediaImagesWidthMin);
histogramsBuilder.setMediaImagesWidthMax(mediaImagesWidthMax);
histogramsBuilder.setMediaImagesHeightMin(mediaImagesHeightMin);
histogramsBuilder.setMediaImagesHeightMax(mediaImagesHeightMax);
histogramsBuilder.setMediaImagesContentLengthMin(mediaImagesContentLengthMin);
histogramsBuilder.setMediaImagesContentLengthMax(mediaImagesContentLengthMax);
histogramsBuilder.setMediaImagesFormat(mediaImagesFormat);
histogramsBuilder.setNotMediaImagesFormat(notMediaImagesFormat);
histogramsBuilder.setMediaVideosCountMin(mediaVideosCountMin);
histogramsBuilder.setMediaVideosCountMax(mediaVideosCountMax);
histogramsBuilder.setAuthorId(authorId);
histogramsBuilder.setNotAuthorId(notAuthorId);
histogramsBuilder.setAuthorName(authorName);
histogramsBuilder.setNotAuthorName(notAuthorName);
histogramsBuilder.setSourceId(sourceId);
histogramsBuilder.setNotSourceId(notSourceId);
histogramsBuilder.setSourceName(sourceName);
histogramsBuilder.setNotSourceName(notSourceName);
histogramsBuilder.setSourceDomain(sourceDomain);
histogramsBuilder.setNotSourceDomain(notSourceDomain);
histogramsBuilder.setSourceLocationsCountry(sourceLocationsCountry);
histogramsBuilder.setNotSourceLocationsCountry(notSourceLocationsCountry);
histogramsBuilder.setSourceLocationsState(sourceLocationsState);
histogramsBuilder.setNotSourceLocationsState(notSourceLocationsState);
histogramsBuilder.setSourceLocationsCity(sourceLocationsCity);
histogramsBuilder.setNotSourceLocationsCity(notSourceLocationsCity);
histogramsBuilder.setSourceScopesCountry(sourceScopesCountry);
histogramsBuilder.setNotSourceScopesCountry(notSourceScopesCountry);
histogramsBuilder.setSourceScopesState(sourceScopesState);
histogramsBuilder.setNotSourceScopesState(notSourceScopesState);
histogramsBuilder.setSourceScopesCity(sourceScopesCity);
histogramsBuilder.setNotSourceScopesCity(notSourceScopesCity);
histogramsBuilder.setSourceScopesLevel(sourceScopesLevel);
histogramsBuilder.setNotSourceScopesLevel(notSourceScopesLevel);
histogramsBuilder.setSourceLinksInCountMin(sourceLinksInCountMin);
histogramsBuilder.setSourceLinksInCountMax(sourceLinksInCountMax);
histogramsBuilder.setSourceRankingsAlexaRankMin(sourceRankingsAlexaRankMin);
histogramsBuilder.setSourceRankingsAlexaRankMax(sourceRankingsAlexaRankMax);
histogramsBuilder.setSourceRankingsAlexaCountry(sourceRankingsAlexaCountry);
histogramsBuilder.setSocialSharesCountFacebookMin(socialSharesCountFacebookMin);
histogramsBuilder.setSocialSharesCountFacebookMax(socialSharesCountFacebookMax);
histogramsBuilder.setSocialSharesCountGooglePlusMin(socialSharesCountGooglePlusMin);
histogramsBuilder.setSocialSharesCountGooglePlusMax(socialSharesCountGooglePlusMax);
histogramsBuilder.setSocialSharesCountLinkedinMin(socialSharesCountLinkedinMin);
histogramsBuilder.setSocialSharesCountLinkedinMax(socialSharesCountLinkedinMax);
histogramsBuilder.setSocialSharesCountRedditMin(socialSharesCountRedditMin);
histogramsBuilder.setSocialSharesCountRedditMax(socialSharesCountRedditMax);
histogramsBuilder.setIntervalStart(intervalStart);
histogramsBuilder.setIntervalEnd(intervalEnd);
histogramsBuilder.setIntervalWidth(intervalWidth);
histogramsBuilder.setField(field);

try {
    Histograms result = apiInstance.listHistograms(histogramsBuilder.build());
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listHistograms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **List&lt;Long&gt;**| This parameter is used for finding stories by story id. | [optional]
 **notId** | **List&lt;Long&gt;**| This parameter is used for excluding stories by story id. | [optional]
 **title** | **String**| This parameter is used for finding stories whose title contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). | [optional]
 **body** | **String**| This parameter is used for finding stories whose body contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). | [optional]
 **text** | **String**| This parameter is used for finding stories whose title or body contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). | [optional]
 **language** | **List&lt;String&gt;**| This parameter is used for finding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes. | [optional] [enum: en, de, fr, it, es, pt]
 **notLanguage** | **List&lt;String&gt;**| This parameter is used for excluding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes. | [optional] [enum: en, de, fr, it, es, pt]
 **publishedAtStart** | **String**| This parameter is used for finding stories whose published at time is greater than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates). | [optional]
 **publishedAtEnd** | **String**| This parameter is used for finding stories whose published at time is less than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates). | [optional]
 **categoriesTaxonomy** | **String**| This parameter is used for defining the type of the taxonomy for the rest of the categories queries. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). | [optional] [enum: iab-qag, iptc-subjectcode]
 **categoriesConfident** | **Boolean**| This parameter is used for finding stories whose categories are confident. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). | [optional] [default to true]
 **categoriesId** | **List&lt;String&gt;**| This parameter is used for finding stories by categories id. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). | [optional]
 **notCategoriesId** | **List&lt;String&gt;**| This parameter is used for excluding stories by categories id. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). | [optional]
 **categoriesLevel** | **List&lt;Integer&gt;**| This parameter is used for finding stories by categories level. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). | [optional]
 **notCategoriesLevel** | **List&lt;Integer&gt;**| This parameter is used for excluding stories by categories level. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). | [optional]
 **entitiesTitleText** | **List&lt;String&gt;**| This parameter is used to find stories based on the specified entities &#x60;text&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **notEntitiesTitleText** | **List&lt;String&gt;**| This parameter is used to exclude stories based on the specified entities &#x60;text&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **entitiesTitleType** | **List&lt;String&gt;**| This parameter is used to find stories based on the specified entities &#x60;type&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **notEntitiesTitleType** | **List&lt;String&gt;**| This parameter is used to exclude stories based on the specified entities &#x60;type&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **entitiesTitleLinksDbpedia** | **List&lt;String&gt;**| This parameter is used to find stories based on the specified entities dbpedia URL in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **notEntitiesTitleLinksDbpedia** | **List&lt;String&gt;**| This parameter is used to exclude stories based on the specified entities dbpedia URL in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **entitiesBodyText** | **List&lt;String&gt;**| This parameter is used to find stories based on the specified entities &#x60;text&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **notEntitiesBodyText** | **List&lt;String&gt;**| This parameter is used to exclude stories based on the specified entities &#x60;text&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **entitiesBodyType** | **List&lt;String&gt;**| This parameter is used to find stories based on the specified entities &#x60;type&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **notEntitiesBodyType** | **List&lt;String&gt;**| This parameter is used to exclude stories based on the specified entities &#x60;type&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **entitiesBodyLinksDbpedia** | **List&lt;String&gt;**| This parameter is used to find stories based on the specified entities dbpedia URL in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **notEntitiesBodyLinksDbpedia** | **List&lt;String&gt;**| This parameter is used to exclude stories based on the specified entities dbpedia URL in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **sentimentTitlePolarity** | **String**| This parameter is used for finding stories whose title sentiment is the specified value. | [optional] [enum: positive, neutral, negative]
 **notSentimentTitlePolarity** | **String**| This parameter is used for excluding stories whose title sentiment is the specified value. | [optional] [enum: positive, neutral, negative]
 **sentimentBodyPolarity** | **String**| This parameter is used for finding stories whose body sentiment is the specified value. | [optional] [enum: positive, neutral, negative]
 **notSentimentBodyPolarity** | **String**| This parameter is used for excluding stories whose body sentiment is the specified value. | [optional] [enum: positive, neutral, negative]
 **mediaImagesCountMin** | **Integer**| This parameter is used for finding stories whose number of images is greater than or equal to the specified value. | [optional]
 **mediaImagesCountMax** | **Integer**| This parameter is used for finding stories whose number of images is less than or equal to the specified value. | [optional]
 **mediaImagesWidthMin** | **Integer**| This parameter is used for finding stories whose width of images are greater than or equal to the specified value. | [optional]
 **mediaImagesWidthMax** | **Integer**| This parameter is used for finding stories whose width of images are less than or equal to the specified value. | [optional]
 **mediaImagesHeightMin** | **Integer**| This parameter is used for finding stories whose height of images are greater than or equal to the specified value. | [optional]
 **mediaImagesHeightMax** | **Integer**| This parameter is used for finding stories whose height of images are less than or equal to the specified value. | [optional]
 **mediaImagesContentLengthMin** | **Integer**| This parameter is used for finding stories whose images content length are greater than or equal to the specified value. | [optional]
 **mediaImagesContentLengthMax** | **Integer**| This parameter is used for finding stories whose images content length are less than or equal to the specified value. | [optional]
 **mediaImagesFormat** | **List&lt;String&gt;**| This parameter is used for finding stories whose images format are the specified value. | [optional] [enum: BMP, GIF, JPEG, PNG, TIFF, PSD, ICO, CUR, WEBP, SVG]
 **notMediaImagesFormat** | **List&lt;String&gt;**| This parameter is used for excluding stories whose images format are the specified value. | [optional] [enum: BMP, GIF, JPEG, PNG, TIFF, PSD, ICO, CUR, WEBP, SVG]
 **mediaVideosCountMin** | **Integer**| This parameter is used for finding stories whose number of videos is greater than or equal to the specified value. | [optional]
 **mediaVideosCountMax** | **Integer**| This parameter is used for finding stories whose number of videos is less than or equal to the specified value. | [optional]
 **authorId** | **List&lt;Integer&gt;**| This parameter is used for finding stories whose author id is the specified value. | [optional]
 **notAuthorId** | **List&lt;Integer&gt;**| This parameter is used for excluding stories whose author id is the specified value. | [optional]
 **authorName** | **String**| This parameter is used for finding stories whose author full name contains the specified value. | [optional]
 **notAuthorName** | **String**| This parameter is used for excluding stories whose author full name contains the specified value. | [optional]
 **sourceId** | **List&lt;Integer&gt;**| This parameter is used for finding stories whose source id is the specified value. | [optional]
 **notSourceId** | **List&lt;Integer&gt;**| This parameter is used for excluding stories whose source id is the specified value. | [optional]
 **sourceName** | **List&lt;String&gt;**| This parameter is used for finding stories whose source name contains the specified value. | [optional]
 **notSourceName** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source name contains the specified value. | [optional]
 **sourceDomain** | **List&lt;String&gt;**| This parameter is used for finding stories whose source domain is the specified value. | [optional]
 **notSourceDomain** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source domain is the specified value. | [optional]
 **sourceLocationsCountry** | **List&lt;String&gt;**| This parameter is used for finding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **notSourceLocationsCountry** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **sourceLocationsState** | **List&lt;String&gt;**| This parameter is used for finding stories whose source state/province is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **notSourceLocationsState** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source state/province is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **sourceLocationsCity** | **List&lt;String&gt;**| This parameter is used for finding stories whose source city is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **notSourceLocationsCity** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source city is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **sourceScopesCountry** | **List&lt;String&gt;**| This parameter is used for finding stories whose source scopes is the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **notSourceScopesCountry** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source scopes is the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **sourceScopesState** | **List&lt;String&gt;**| This parameter is used for finding stories whose source scopes is the specified state/province value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **notSourceScopesState** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source scopes is the specified state/province value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **sourceScopesCity** | **List&lt;String&gt;**| This parameter is used for finding stories whose source scopes is the specified city value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **notSourceScopesCity** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source scopes is the specified city value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **sourceScopesLevel** | **List&lt;String&gt;**| This parameter is used for finding stories whose source scopes is the specified level value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional] [enum: international, national, local]
 **notSourceScopesLevel** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source scopes is the specified level value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional] [enum: international, national, local]
 **sourceLinksInCountMin** | **Integer**| This parameter is used for finding stories from sources whose Links in count is greater than or equal to the specified value. You can read more about working with Links in count [here](https://newsapi.aylien.com/docs/working-with-links-in-count). | [optional]
 **sourceLinksInCountMax** | **Integer**| This parameter is used for finding stories from sources whose Links in count is less than or equal to the specified value. You can read more about working with Links in count [here](https://newsapi.aylien.com/docs/working-with-links-in-count). | [optional]
 **sourceRankingsAlexaRankMin** | **Integer**| This parameter is used for finding stories from sources whose Alexa rank is greater than or equal to the specified value. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks). | [optional]
 **sourceRankingsAlexaRankMax** | **Integer**| This parameter is used for finding stories from sources whose Alexa rank is less than or equal to the specified value. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks). | [optional]
 **sourceRankingsAlexaCountry** | **List&lt;String&gt;**| This parameter is used for finding stories from sources whose Alexa rank is in the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks). | [optional]
 **socialSharesCountFacebookMin** | **Integer**| This parameter is used for finding stories whose Facebook social shares count is greater than or equal to the specified value. | [optional]
 **socialSharesCountFacebookMax** | **Integer**| This parameter is used for finding stories whose Facebook social shares count is less than or equal to the specified value. | [optional]
 **socialSharesCountGooglePlusMin** | **Integer**| This parameter is used for finding stories whose Google+ social shares count is greater than or equal to the specified value. | [optional]
 **socialSharesCountGooglePlusMax** | **Integer**| This parameter is used for finding stories whose Google+ social shares count is less than or equal to the specified value. | [optional]
 **socialSharesCountLinkedinMin** | **Integer**| This parameter is used for finding stories whose LinkedIn social shares count is greater than or equal to the specified value. | [optional]
 **socialSharesCountLinkedinMax** | **Integer**| This parameter is used for finding stories whose LinkedIn social shares count is less than or equal to the specified value. | [optional]
 **socialSharesCountRedditMin** | **Integer**| This parameter is used for finding stories whose Reddit social shares count is greater than or equal to the specified value. | [optional]
 **socialSharesCountRedditMax** | **Integer**| This parameter is used for finding stories whose Reddit social shares count is less than or equal to the specified value. | [optional]
 **intervalStart** | **Integer**| This parameter is used for setting the start data point of histogram intervals. | [optional]
 **intervalEnd** | **Integer**| This parameter is used for setting the end data point of histogram intervals. | [optional]
 **intervalWidth** | **Integer**| This parameter is used for setting the width of histogram intervals. | [optional]
 **field** | **String**| This parameter is used for specifying the y-axis variable for the histogram. | [optional] [default to social_shares_count] [enum: social_shares_count, social_shares_count.facebook, social_shares_count.linkedin, social_shares_count.reddit, social_shares_count.google_plus, characters_count, words_count, sentences_count, paragraphs_count, media.images.count, media.videos.count, source.links_in_count, source.rankings.alexa.rank, source.rankings.alexa.rank.AF, source.rankings.alexa.rank.AX, source.rankings.alexa.rank.AL, source.rankings.alexa.rank.DZ, source.rankings.alexa.rank.AS, source.rankings.alexa.rank.AD, source.rankings.alexa.rank.AO, source.rankings.alexa.rank.AI, source.rankings.alexa.rank.AQ, source.rankings.alexa.rank.AG, source.rankings.alexa.rank.AR, source.rankings.alexa.rank.AM, source.rankings.alexa.rank.AW, source.rankings.alexa.rank.AU, source.rankings.alexa.rank.AT, source.rankings.alexa.rank.AZ, source.rankings.alexa.rank.BS, source.rankings.alexa.rank.BH, source.rankings.alexa.rank.BD, source.rankings.alexa.rank.BB, source.rankings.alexa.rank.BY, source.rankings.alexa.rank.BE, source.rankings.alexa.rank.BZ, source.rankings.alexa.rank.BJ, source.rankings.alexa.rank.BM, source.rankings.alexa.rank.BT, source.rankings.alexa.rank.BO, source.rankings.alexa.rank.BQ, source.rankings.alexa.rank.BA, source.rankings.alexa.rank.BW, source.rankings.alexa.rank.BV, source.rankings.alexa.rank.BR, source.rankings.alexa.rank.IO, source.rankings.alexa.rank.BN, source.rankings.alexa.rank.BG, source.rankings.alexa.rank.BF, source.rankings.alexa.rank.BI, source.rankings.alexa.rank.KH, source.rankings.alexa.rank.CM, source.rankings.alexa.rank.CA, source.rankings.alexa.rank.CV, source.rankings.alexa.rank.KY, source.rankings.alexa.rank.CF, source.rankings.alexa.rank.TD, source.rankings.alexa.rank.CL, source.rankings.alexa.rank.CN, source.rankings.alexa.rank.CX, source.rankings.alexa.rank.CC, source.rankings.alexa.rank.CO, source.rankings.alexa.rank.KM, source.rankings.alexa.rank.CG, source.rankings.alexa.rank.CD, source.rankings.alexa.rank.CK, source.rankings.alexa.rank.CR, source.rankings.alexa.rank.CI, source.rankings.alexa.rank.HR, source.rankings.alexa.rank.CU, source.rankings.alexa.rank.CW, source.rankings.alexa.rank.CY, source.rankings.alexa.rank.CZ, source.rankings.alexa.rank.DK, source.rankings.alexa.rank.DJ, source.rankings.alexa.rank.DM, source.rankings.alexa.rank.DO, source.rankings.alexa.rank.EC, source.rankings.alexa.rank.EG, source.rankings.alexa.rank.SV, source.rankings.alexa.rank.GQ, source.rankings.alexa.rank.ER, source.rankings.alexa.rank.EE, source.rankings.alexa.rank.ET, source.rankings.alexa.rank.FK, source.rankings.alexa.rank.FO, source.rankings.alexa.rank.FJ, source.rankings.alexa.rank.FI, source.rankings.alexa.rank.FR, source.rankings.alexa.rank.GF, source.rankings.alexa.rank.PF, source.rankings.alexa.rank.TF, source.rankings.alexa.rank.GA, source.rankings.alexa.rank.GM, source.rankings.alexa.rank.GE, source.rankings.alexa.rank.DE, source.rankings.alexa.rank.GH, source.rankings.alexa.rank.GI, source.rankings.alexa.rank.GR, source.rankings.alexa.rank.GL, source.rankings.alexa.rank.GD, source.rankings.alexa.rank.GP, source.rankings.alexa.rank.GU, source.rankings.alexa.rank.GT, source.rankings.alexa.rank.GG, source.rankings.alexa.rank.GN, source.rankings.alexa.rank.GW, source.rankings.alexa.rank.GY, source.rankings.alexa.rank.HT, source.rankings.alexa.rank.HM, source.rankings.alexa.rank.VA, source.rankings.alexa.rank.HN, source.rankings.alexa.rank.HK, source.rankings.alexa.rank.HU, source.rankings.alexa.rank.IS, source.rankings.alexa.rank.IN, source.rankings.alexa.rank.ID, source.rankings.alexa.rank.IR, source.rankings.alexa.rank.IQ, source.rankings.alexa.rank.IE, source.rankings.alexa.rank.IM, source.rankings.alexa.rank.IL, source.rankings.alexa.rank.IT, source.rankings.alexa.rank.JM, source.rankings.alexa.rank.JP, source.rankings.alexa.rank.JE, source.rankings.alexa.rank.JO, source.rankings.alexa.rank.KZ, source.rankings.alexa.rank.KE, source.rankings.alexa.rank.KI, source.rankings.alexa.rank.KP, source.rankings.alexa.rank.KR, source.rankings.alexa.rank.KW, source.rankings.alexa.rank.KG, source.rankings.alexa.rank.LA, source.rankings.alexa.rank.LV, source.rankings.alexa.rank.LB, source.rankings.alexa.rank.LS, source.rankings.alexa.rank.LR, source.rankings.alexa.rank.LY, source.rankings.alexa.rank.LI, source.rankings.alexa.rank.LT, source.rankings.alexa.rank.LU, source.rankings.alexa.rank.MO, source.rankings.alexa.rank.MK, source.rankings.alexa.rank.MG, source.rankings.alexa.rank.MW, source.rankings.alexa.rank.MY, source.rankings.alexa.rank.MV, source.rankings.alexa.rank.ML, source.rankings.alexa.rank.MT, source.rankings.alexa.rank.MH, source.rankings.alexa.rank.MQ, source.rankings.alexa.rank.MR, source.rankings.alexa.rank.MU, source.rankings.alexa.rank.YT, source.rankings.alexa.rank.MX, source.rankings.alexa.rank.FM, source.rankings.alexa.rank.MD, source.rankings.alexa.rank.MC, source.rankings.alexa.rank.MN, source.rankings.alexa.rank.ME, source.rankings.alexa.rank.MS, source.rankings.alexa.rank.MA, source.rankings.alexa.rank.MZ, source.rankings.alexa.rank.MM, source.rankings.alexa.rank.NA, source.rankings.alexa.rank.NR, source.rankings.alexa.rank.NP, source.rankings.alexa.rank.NL, source.rankings.alexa.rank.NC, source.rankings.alexa.rank.NZ, source.rankings.alexa.rank.NI, source.rankings.alexa.rank.NE, source.rankings.alexa.rank.NG, source.rankings.alexa.rank.NU, source.rankings.alexa.rank.NF, source.rankings.alexa.rank.MP, source.rankings.alexa.rank.NO, source.rankings.alexa.rank.OM, source.rankings.alexa.rank.PK, source.rankings.alexa.rank.PW, source.rankings.alexa.rank.PS, source.rankings.alexa.rank.PA, source.rankings.alexa.rank.PG, source.rankings.alexa.rank.PY, source.rankings.alexa.rank.PE, source.rankings.alexa.rank.PH, source.rankings.alexa.rank.PN, source.rankings.alexa.rank.PL, source.rankings.alexa.rank.PT, source.rankings.alexa.rank.PR, source.rankings.alexa.rank.QA, source.rankings.alexa.rank.RE, source.rankings.alexa.rank.RO, source.rankings.alexa.rank.RU, source.rankings.alexa.rank.RW, source.rankings.alexa.rank.BL, source.rankings.alexa.rank.SH, source.rankings.alexa.rank.KN, source.rankings.alexa.rank.LC, source.rankings.alexa.rank.MF, source.rankings.alexa.rank.PM, source.rankings.alexa.rank.VC, source.rankings.alexa.rank.WS, source.rankings.alexa.rank.SM, source.rankings.alexa.rank.ST, source.rankings.alexa.rank.SA, source.rankings.alexa.rank.SN, source.rankings.alexa.rank.RS, source.rankings.alexa.rank.SC, source.rankings.alexa.rank.SL, source.rankings.alexa.rank.SG, source.rankings.alexa.rank.SX, source.rankings.alexa.rank.SK, source.rankings.alexa.rank.SI, source.rankings.alexa.rank.SB, source.rankings.alexa.rank.SO, source.rankings.alexa.rank.ZA, source.rankings.alexa.rank.GS, source.rankings.alexa.rank.SS, source.rankings.alexa.rank.ES, source.rankings.alexa.rank.LK, source.rankings.alexa.rank.SD, source.rankings.alexa.rank.SR, source.rankings.alexa.rank.SJ, source.rankings.alexa.rank.SZ, source.rankings.alexa.rank.SE, source.rankings.alexa.rank.CH, source.rankings.alexa.rank.SY, source.rankings.alexa.rank.TW, source.rankings.alexa.rank.TJ, source.rankings.alexa.rank.TZ, source.rankings.alexa.rank.TH, source.rankings.alexa.rank.TL, source.rankings.alexa.rank.TG, source.rankings.alexa.rank.TK, source.rankings.alexa.rank.TO, source.rankings.alexa.rank.TT, source.rankings.alexa.rank.TN, source.rankings.alexa.rank.TR, source.rankings.alexa.rank.TM, source.rankings.alexa.rank.TC, source.rankings.alexa.rank.TV, source.rankings.alexa.rank.UG, source.rankings.alexa.rank.UA, source.rankings.alexa.rank.AE, source.rankings.alexa.rank.GB, source.rankings.alexa.rank.US, source.rankings.alexa.rank.UM, source.rankings.alexa.rank.UY, source.rankings.alexa.rank.UZ, source.rankings.alexa.rank.VU, source.rankings.alexa.rank.VE, source.rankings.alexa.rank.VN, source.rankings.alexa.rank.VG, source.rankings.alexa.rank.VI, source.rankings.alexa.rank.WF, source.rankings.alexa.rank.EH, source.rankings.alexa.rank.YE, source.rankings.alexa.rank.ZM, source.rankings.alexa.rank.ZW]

### Return type

[**Histograms**](Histograms.md)

### Authorization

[app_key](../README.md#app_key), [app_id](../README.md#app_id)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json, text/xml

<a name="listRelatedStories"></a>
# **listRelatedStories**
> RelatedStories listRelatedStories(relatedStoriesParams)

List related stories

This endpoint is used for finding related stories based on the parameters provided. The maximum number of related stories returned is 100.

### Example
```java
import com.aylien.newsapi.*;
import com.aylien.newsapi.auth.*;
import com.aylien.newsapi.models.*;
import com.aylien.newsapi.parameters.*;
import com.aylien.newsapi.api.DefaultApi;

import java.util.*;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: app_id
ApiKeyAuth app_id = (ApiKeyAuth) defaultClient.getAuthentication("app_id");
app_id.setApiKey("YOUR_APP_ID");

// Configure API key authorization: app_key
ApiKeyAuth app_key = (ApiKeyAuth) defaultClient.getAuthentication("app_key");
app_key.setApiKey("YOUR_APP_KEY");

DefaultApi apiInstance = new DefaultApi();

List<Long> id = Arrays.asList(56L);
List<Long> notId = Arrays.asList(56L);
String title = "title_example";
String body = "body_example";
String text = "text_example";
List<String> language = Arrays.asList("language_example");
List<String> notLanguage = Arrays.asList("notLanguage_example");
String publishedAtStart = "publishedAtStart_example";
String publishedAtEnd = "publishedAtEnd_example";
String categoriesTaxonomy = "categoriesTaxonomy_example";
Boolean categoriesConfident = true;
List<String> categoriesId = Arrays.asList("categoriesId_example");
List<String> notCategoriesId = Arrays.asList("notCategoriesId_example");
List<Integer> categoriesLevel = Arrays.asList(56);
List<Integer> notCategoriesLevel = Arrays.asList(56);
List<String> entitiesTitleText = Arrays.asList("entitiesTitleText_example");
List<String> notEntitiesTitleText = Arrays.asList("notEntitiesTitleText_example");
List<String> entitiesTitleType = Arrays.asList("entitiesTitleType_example");
List<String> notEntitiesTitleType = Arrays.asList("notEntitiesTitleType_example");
List<String> entitiesTitleLinksDbpedia = Arrays.asList("entitiesTitleLinksDbpedia_example");
List<String> notEntitiesTitleLinksDbpedia = Arrays.asList("notEntitiesTitleLinksDbpedia_example");
List<String> entitiesBodyText = Arrays.asList("entitiesBodyText_example");
List<String> notEntitiesBodyText = Arrays.asList("notEntitiesBodyText_example");
List<String> entitiesBodyType = Arrays.asList("entitiesBodyType_example");
List<String> notEntitiesBodyType = Arrays.asList("notEntitiesBodyType_example");
List<String> entitiesBodyLinksDbpedia = Arrays.asList("entitiesBodyLinksDbpedia_example");
List<String> notEntitiesBodyLinksDbpedia = Arrays.asList("notEntitiesBodyLinksDbpedia_example");
String sentimentTitlePolarity = "sentimentTitlePolarity_example";
String notSentimentTitlePolarity = "notSentimentTitlePolarity_example";
String sentimentBodyPolarity = "sentimentBodyPolarity_example";
String notSentimentBodyPolarity = "notSentimentBodyPolarity_example";
Integer mediaImagesCountMin = 56;
Integer mediaImagesCountMax = 56;
Integer mediaImagesWidthMin = 56;
Integer mediaImagesWidthMax = 56;
Integer mediaImagesHeightMin = 56;
Integer mediaImagesHeightMax = 56;
Integer mediaImagesContentLengthMin = 56;
Integer mediaImagesContentLengthMax = 56;
List<String> mediaImagesFormat = Arrays.asList("mediaImagesFormat_example");
List<String> notMediaImagesFormat = Arrays.asList("notMediaImagesFormat_example");
Integer mediaVideosCountMin = 56;
Integer mediaVideosCountMax = 56;
List<Integer> authorId = Arrays.asList(56);
List<Integer> notAuthorId = Arrays.asList(56);
String authorName = "authorName_example";
String notAuthorName = "notAuthorName_example";
List<Integer> sourceId = Arrays.asList(56);
List<Integer> notSourceId = Arrays.asList(56);
List<String> sourceName = Arrays.asList("sourceName_example");
List<String> notSourceName = Arrays.asList("notSourceName_example");
List<String> sourceDomain = Arrays.asList("sourceDomain_example");
List<String> notSourceDomain = Arrays.asList("notSourceDomain_example");
List<String> sourceLocationsCountry = Arrays.asList("sourceLocationsCountry_example");
List<String> notSourceLocationsCountry = Arrays.asList("notSourceLocationsCountry_example");
List<String> sourceLocationsState = Arrays.asList("sourceLocationsState_example");
List<String> notSourceLocationsState = Arrays.asList("notSourceLocationsState_example");
List<String> sourceLocationsCity = Arrays.asList("sourceLocationsCity_example");
List<String> notSourceLocationsCity = Arrays.asList("notSourceLocationsCity_example");
List<String> sourceScopesCountry = Arrays.asList("sourceScopesCountry_example");
List<String> notSourceScopesCountry = Arrays.asList("notSourceScopesCountry_example");
List<String> sourceScopesState = Arrays.asList("sourceScopesState_example");
List<String> notSourceScopesState = Arrays.asList("notSourceScopesState_example");
List<String> sourceScopesCity = Arrays.asList("sourceScopesCity_example");
List<String> notSourceScopesCity = Arrays.asList("notSourceScopesCity_example");
List<String> sourceScopesLevel = Arrays.asList("sourceScopesLevel_example");
List<String> notSourceScopesLevel = Arrays.asList("notSourceScopesLevel_example");
Integer sourceLinksInCountMin = 56;
Integer sourceLinksInCountMax = 56;
Integer sourceRankingsAlexaRankMin = 56;
Integer sourceRankingsAlexaRankMax = 56;
List<String> sourceRankingsAlexaCountry = Arrays.asList("sourceRankingsAlexaCountry_example");
Integer socialSharesCountFacebookMin = 56;
Integer socialSharesCountFacebookMax = 56;
Integer socialSharesCountGooglePlusMin = 56;
Integer socialSharesCountGooglePlusMax = 56;
Integer socialSharesCountLinkedinMin = 56;
Integer socialSharesCountLinkedinMax = 56;
Integer socialSharesCountRedditMin = 56;
Integer socialSharesCountRedditMax = 56;
Boolean cluster = false;
String clusterAlgorithm = "lingo";
List<String> _return = Arrays.asList("_return_example");
Long storyId = 789L;
String storyUrl = "storyUrl_example";
String storyTitle = "storyTitle_example";
String storyBody = "storyBody_example";
String boostBy = "boostBy_example";
String storyLanguage = "auto";
Integer perPage = 3;

RelatedStoriesParams.Builder relatedStoriesBuilder = RelatedStoriesParams.newBuilder();

relatedStoriesBuilder.setId(id);
relatedStoriesBuilder.setNotId(notId);
relatedStoriesBuilder.setTitle(title);
relatedStoriesBuilder.setBody(body);
relatedStoriesBuilder.setText(text);
relatedStoriesBuilder.setLanguage(language);
relatedStoriesBuilder.setNotLanguage(notLanguage);
relatedStoriesBuilder.setPublishedAtStart(publishedAtStart);
relatedStoriesBuilder.setPublishedAtEnd(publishedAtEnd);
relatedStoriesBuilder.setCategoriesTaxonomy(categoriesTaxonomy);
relatedStoriesBuilder.setCategoriesConfident(categoriesConfident);
relatedStoriesBuilder.setCategoriesId(categoriesId);
relatedStoriesBuilder.setNotCategoriesId(notCategoriesId);
relatedStoriesBuilder.setCategoriesLevel(categoriesLevel);
relatedStoriesBuilder.setNotCategoriesLevel(notCategoriesLevel);
relatedStoriesBuilder.setEntitiesTitleText(entitiesTitleText);
relatedStoriesBuilder.setNotEntitiesTitleText(notEntitiesTitleText);
relatedStoriesBuilder.setEntitiesTitleType(entitiesTitleType);
relatedStoriesBuilder.setNotEntitiesTitleType(notEntitiesTitleType);
relatedStoriesBuilder.setEntitiesTitleLinksDbpedia(entitiesTitleLinksDbpedia);
relatedStoriesBuilder.setNotEntitiesTitleLinksDbpedia(notEntitiesTitleLinksDbpedia);
relatedStoriesBuilder.setEntitiesBodyText(entitiesBodyText);
relatedStoriesBuilder.setNotEntitiesBodyText(notEntitiesBodyText);
relatedStoriesBuilder.setEntitiesBodyType(entitiesBodyType);
relatedStoriesBuilder.setNotEntitiesBodyType(notEntitiesBodyType);
relatedStoriesBuilder.setEntitiesBodyLinksDbpedia(entitiesBodyLinksDbpedia);
relatedStoriesBuilder.setNotEntitiesBodyLinksDbpedia(notEntitiesBodyLinksDbpedia);
relatedStoriesBuilder.setSentimentTitlePolarity(sentimentTitlePolarity);
relatedStoriesBuilder.setNotSentimentTitlePolarity(notSentimentTitlePolarity);
relatedStoriesBuilder.setSentimentBodyPolarity(sentimentBodyPolarity);
relatedStoriesBuilder.setNotSentimentBodyPolarity(notSentimentBodyPolarity);
relatedStoriesBuilder.setMediaImagesCountMin(mediaImagesCountMin);
relatedStoriesBuilder.setMediaImagesCountMax(mediaImagesCountMax);
relatedStoriesBuilder.setMediaImagesWidthMin(mediaImagesWidthMin);
relatedStoriesBuilder.setMediaImagesWidthMax(mediaImagesWidthMax);
relatedStoriesBuilder.setMediaImagesHeightMin(mediaImagesHeightMin);
relatedStoriesBuilder.setMediaImagesHeightMax(mediaImagesHeightMax);
relatedStoriesBuilder.setMediaImagesContentLengthMin(mediaImagesContentLengthMin);
relatedStoriesBuilder.setMediaImagesContentLengthMax(mediaImagesContentLengthMax);
relatedStoriesBuilder.setMediaImagesFormat(mediaImagesFormat);
relatedStoriesBuilder.setNotMediaImagesFormat(notMediaImagesFormat);
relatedStoriesBuilder.setMediaVideosCountMin(mediaVideosCountMin);
relatedStoriesBuilder.setMediaVideosCountMax(mediaVideosCountMax);
relatedStoriesBuilder.setAuthorId(authorId);
relatedStoriesBuilder.setNotAuthorId(notAuthorId);
relatedStoriesBuilder.setAuthorName(authorName);
relatedStoriesBuilder.setNotAuthorName(notAuthorName);
relatedStoriesBuilder.setSourceId(sourceId);
relatedStoriesBuilder.setNotSourceId(notSourceId);
relatedStoriesBuilder.setSourceName(sourceName);
relatedStoriesBuilder.setNotSourceName(notSourceName);
relatedStoriesBuilder.setSourceDomain(sourceDomain);
relatedStoriesBuilder.setNotSourceDomain(notSourceDomain);
relatedStoriesBuilder.setSourceLocationsCountry(sourceLocationsCountry);
relatedStoriesBuilder.setNotSourceLocationsCountry(notSourceLocationsCountry);
relatedStoriesBuilder.setSourceLocationsState(sourceLocationsState);
relatedStoriesBuilder.setNotSourceLocationsState(notSourceLocationsState);
relatedStoriesBuilder.setSourceLocationsCity(sourceLocationsCity);
relatedStoriesBuilder.setNotSourceLocationsCity(notSourceLocationsCity);
relatedStoriesBuilder.setSourceScopesCountry(sourceScopesCountry);
relatedStoriesBuilder.setNotSourceScopesCountry(notSourceScopesCountry);
relatedStoriesBuilder.setSourceScopesState(sourceScopesState);
relatedStoriesBuilder.setNotSourceScopesState(notSourceScopesState);
relatedStoriesBuilder.setSourceScopesCity(sourceScopesCity);
relatedStoriesBuilder.setNotSourceScopesCity(notSourceScopesCity);
relatedStoriesBuilder.setSourceScopesLevel(sourceScopesLevel);
relatedStoriesBuilder.setNotSourceScopesLevel(notSourceScopesLevel);
relatedStoriesBuilder.setSourceLinksInCountMin(sourceLinksInCountMin);
relatedStoriesBuilder.setSourceLinksInCountMax(sourceLinksInCountMax);
relatedStoriesBuilder.setSourceRankingsAlexaRankMin(sourceRankingsAlexaRankMin);
relatedStoriesBuilder.setSourceRankingsAlexaRankMax(sourceRankingsAlexaRankMax);
relatedStoriesBuilder.setSourceRankingsAlexaCountry(sourceRankingsAlexaCountry);
relatedStoriesBuilder.setSocialSharesCountFacebookMin(socialSharesCountFacebookMin);
relatedStoriesBuilder.setSocialSharesCountFacebookMax(socialSharesCountFacebookMax);
relatedStoriesBuilder.setSocialSharesCountGooglePlusMin(socialSharesCountGooglePlusMin);
relatedStoriesBuilder.setSocialSharesCountGooglePlusMax(socialSharesCountGooglePlusMax);
relatedStoriesBuilder.setSocialSharesCountLinkedinMin(socialSharesCountLinkedinMin);
relatedStoriesBuilder.setSocialSharesCountLinkedinMax(socialSharesCountLinkedinMax);
relatedStoriesBuilder.setSocialSharesCountRedditMin(socialSharesCountRedditMin);
relatedStoriesBuilder.setSocialSharesCountRedditMax(socialSharesCountRedditMax);
relatedStoriesBuilder.setCluster(cluster);
relatedStoriesBuilder.setClusterAlgorithm(clusterAlgorithm);
relatedStoriesBuilder.set_return(_return);
relatedStoriesBuilder.setStoryId(storyId);
relatedStoriesBuilder.setStoryUrl(storyUrl);
relatedStoriesBuilder.setStoryTitle(storyTitle);
relatedStoriesBuilder.setStoryBody(storyBody);
relatedStoriesBuilder.setBoostBy(boostBy);
relatedStoriesBuilder.setStoryLanguage(storyLanguage);
relatedStoriesBuilder.setPerPage(perPage);

try {
    RelatedStories result = apiInstance.listRelatedStories(relatedStoriesBuilder.build());
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listRelatedStories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **List&lt;Long&gt;**| This parameter is used for finding stories by story id. | [optional]
 **notId** | **List&lt;Long&gt;**| This parameter is used for excluding stories by story id. | [optional]
 **title** | **String**| This parameter is used for finding stories whose title contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). | [optional]
 **body** | **String**| This parameter is used for finding stories whose body contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). | [optional]
 **text** | **String**| This parameter is used for finding stories whose title or body contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). | [optional]
 **language** | **List&lt;String&gt;**| This parameter is used for finding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes. | [optional] [enum: en, de, fr, it, es, pt]
 **notLanguage** | **List&lt;String&gt;**| This parameter is used for excluding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes. | [optional] [enum: en, de, fr, it, es, pt]
 **publishedAtStart** | **String**| This parameter is used for finding stories whose published at time is greater than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates). | [optional]
 **publishedAtEnd** | **String**| This parameter is used for finding stories whose published at time is less than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates). | [optional]
 **categoriesTaxonomy** | **String**| This parameter is used for defining the type of the taxonomy for the rest of the categories queries. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). | [optional] [enum: iab-qag, iptc-subjectcode]
 **categoriesConfident** | **Boolean**| This parameter is used for finding stories whose categories are confident. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). | [optional] [default to true]
 **categoriesId** | **List&lt;String&gt;**| This parameter is used for finding stories by categories id. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). | [optional]
 **notCategoriesId** | **List&lt;String&gt;**| This parameter is used for excluding stories by categories id. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). | [optional]
 **categoriesLevel** | **List&lt;Integer&gt;**| This parameter is used for finding stories by categories level. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). | [optional]
 **notCategoriesLevel** | **List&lt;Integer&gt;**| This parameter is used for excluding stories by categories level. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). | [optional]
 **entitiesTitleText** | **List&lt;String&gt;**| This parameter is used to find stories based on the specified entities &#x60;text&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **notEntitiesTitleText** | **List&lt;String&gt;**| This parameter is used to exclude stories based on the specified entities &#x60;text&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **entitiesTitleType** | **List&lt;String&gt;**| This parameter is used to find stories based on the specified entities &#x60;type&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **notEntitiesTitleType** | **List&lt;String&gt;**| This parameter is used to exclude stories based on the specified entities &#x60;type&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **entitiesTitleLinksDbpedia** | **List&lt;String&gt;**| This parameter is used to find stories based on the specified entities dbpedia URL in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **notEntitiesTitleLinksDbpedia** | **List&lt;String&gt;**| This parameter is used to exclude stories based on the specified entities dbpedia URL in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **entitiesBodyText** | **List&lt;String&gt;**| This parameter is used to find stories based on the specified entities &#x60;text&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **notEntitiesBodyText** | **List&lt;String&gt;**| This parameter is used to exclude stories based on the specified entities &#x60;text&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **entitiesBodyType** | **List&lt;String&gt;**| This parameter is used to find stories based on the specified entities &#x60;type&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **notEntitiesBodyType** | **List&lt;String&gt;**| This parameter is used to exclude stories based on the specified entities &#x60;type&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **entitiesBodyLinksDbpedia** | **List&lt;String&gt;**| This parameter is used to find stories based on the specified entities dbpedia URL in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **notEntitiesBodyLinksDbpedia** | **List&lt;String&gt;**| This parameter is used to exclude stories based on the specified entities dbpedia URL in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **sentimentTitlePolarity** | **String**| This parameter is used for finding stories whose title sentiment is the specified value. | [optional] [enum: positive, neutral, negative]
 **notSentimentTitlePolarity** | **String**| This parameter is used for excluding stories whose title sentiment is the specified value. | [optional] [enum: positive, neutral, negative]
 **sentimentBodyPolarity** | **String**| This parameter is used for finding stories whose body sentiment is the specified value. | [optional] [enum: positive, neutral, negative]
 **notSentimentBodyPolarity** | **String**| This parameter is used for excluding stories whose body sentiment is the specified value. | [optional] [enum: positive, neutral, negative]
 **mediaImagesCountMin** | **Integer**| This parameter is used for finding stories whose number of images is greater than or equal to the specified value. | [optional]
 **mediaImagesCountMax** | **Integer**| This parameter is used for finding stories whose number of images is less than or equal to the specified value. | [optional]
 **mediaImagesWidthMin** | **Integer**| This parameter is used for finding stories whose width of images are greater than or equal to the specified value. | [optional]
 **mediaImagesWidthMax** | **Integer**| This parameter is used for finding stories whose width of images are less than or equal to the specified value. | [optional]
 **mediaImagesHeightMin** | **Integer**| This parameter is used for finding stories whose height of images are greater than or equal to the specified value. | [optional]
 **mediaImagesHeightMax** | **Integer**| This parameter is used for finding stories whose height of images are less than or equal to the specified value. | [optional]
 **mediaImagesContentLengthMin** | **Integer**| This parameter is used for finding stories whose images content length are greater than or equal to the specified value. | [optional]
 **mediaImagesContentLengthMax** | **Integer**| This parameter is used for finding stories whose images content length are less than or equal to the specified value. | [optional]
 **mediaImagesFormat** | **List&lt;String&gt;**| This parameter is used for finding stories whose images format are the specified value. | [optional] [enum: BMP, GIF, JPEG, PNG, TIFF, PSD, ICO, CUR, WEBP, SVG]
 **notMediaImagesFormat** | **List&lt;String&gt;**| This parameter is used for excluding stories whose images format are the specified value. | [optional] [enum: BMP, GIF, JPEG, PNG, TIFF, PSD, ICO, CUR, WEBP, SVG]
 **mediaVideosCountMin** | **Integer**| This parameter is used for finding stories whose number of videos is greater than or equal to the specified value. | [optional]
 **mediaVideosCountMax** | **Integer**| This parameter is used for finding stories whose number of videos is less than or equal to the specified value. | [optional]
 **authorId** | **List&lt;Integer&gt;**| This parameter is used for finding stories whose author id is the specified value. | [optional]
 **notAuthorId** | **List&lt;Integer&gt;**| This parameter is used for excluding stories whose author id is the specified value. | [optional]
 **authorName** | **String**| This parameter is used for finding stories whose author full name contains the specified value. | [optional]
 **notAuthorName** | **String**| This parameter is used for excluding stories whose author full name contains the specified value. | [optional]
 **sourceId** | **List&lt;Integer&gt;**| This parameter is used for finding stories whose source id is the specified value. | [optional]
 **notSourceId** | **List&lt;Integer&gt;**| This parameter is used for excluding stories whose source id is the specified value. | [optional]
 **sourceName** | **List&lt;String&gt;**| This parameter is used for finding stories whose source name contains the specified value. | [optional]
 **notSourceName** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source name contains the specified value. | [optional]
 **sourceDomain** | **List&lt;String&gt;**| This parameter is used for finding stories whose source domain is the specified value. | [optional]
 **notSourceDomain** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source domain is the specified value. | [optional]
 **sourceLocationsCountry** | **List&lt;String&gt;**| This parameter is used for finding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **notSourceLocationsCountry** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **sourceLocationsState** | **List&lt;String&gt;**| This parameter is used for finding stories whose source state/province is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **notSourceLocationsState** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source state/province is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **sourceLocationsCity** | **List&lt;String&gt;**| This parameter is used for finding stories whose source city is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **notSourceLocationsCity** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source city is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **sourceScopesCountry** | **List&lt;String&gt;**| This parameter is used for finding stories whose source scopes  is the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **notSourceScopesCountry** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source scopes  is the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **sourceScopesState** | **List&lt;String&gt;**| This parameter is used for finding stories whose source scopes is the specified state/province value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **notSourceScopesState** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source scopes is the specified state/province value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **sourceScopesCity** | **List&lt;String&gt;**| This parameter is used for finding stories whose source scopes is the specified city value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **notSourceScopesCity** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source scopes is the specified city value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **sourceScopesLevel** | **List&lt;String&gt;**| This parameter is used for finding stories whose source scopes  is the specified level value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional] [enum: international, national, local]
 **notSourceScopesLevel** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source scopes  is the specified level value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional] [enum: international, national, local]
 **sourceLinksInCountMin** | **Integer**| This parameter is used for finding stories from sources whose Links in count is greater than or equal to the specified value. You can read more about working with Links in count [here](https://newsapi.aylien.com/docs/working-with-links-in-count). | [optional]
 **sourceLinksInCountMax** | **Integer**| This parameter is used for finding stories from sources whose Links in count is less than or equal to the specified value. You can read more about working with Links in count [here](https://newsapi.aylien.com/docs/working-with-links-in-count). | [optional]
 **sourceRankingsAlexaRankMin** | **Integer**| This parameter is used for finding stories from sources whose Alexa rank is greater than or equal to the specified value. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks). | [optional]
 **sourceRankingsAlexaRankMax** | **Integer**| This parameter is used for finding stories from sources whose Alexa rank is less than or equal to the specified value. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks). | [optional]
 **sourceRankingsAlexaCountry** | **List&lt;String&gt;**| This parameter is used for finding stories from sources whose Alexa rank is in the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks). | [optional]
 **socialSharesCountFacebookMin** | **Integer**| This parameter is used for finding stories whose Facebook social shares count is greater than or equal to the specified value. | [optional]
 **socialSharesCountFacebookMax** | **Integer**| This parameter is used for finding stories whose Facebook social shares count is less than or equal to the specified value. | [optional]
 **socialSharesCountGooglePlusMin** | **Integer**| This parameter is used for finding stories whose Google+ social shares count is greater than or equal to the specified value. | [optional]
 **socialSharesCountGooglePlusMax** | **Integer**| This parameter is used for finding stories whose Google+ social shares count is less than or equal to the specified value. | [optional]
 **socialSharesCountLinkedinMin** | **Integer**| This parameter is used for finding stories whose LinkedIn social shares count is greater than or equal to the specified value. | [optional]
 **socialSharesCountLinkedinMax** | **Integer**| This parameter is used for finding stories whose LinkedIn social shares count is less than or equal to the specified value. | [optional]
 **socialSharesCountRedditMin** | **Integer**| This parameter is used for finding stories whose Reddit social shares count is greater than or equal to the specified value. | [optional]
 **socialSharesCountRedditMax** | **Integer**| This parameter is used for finding stories whose Reddit social shares count is less than or equal to the specified value. | [optional]
 **cluster** | **Boolean**| This parameter enables clustering for the returned stories. You can read more about working with clustering [here](https://newsapi.aylien.com/docs/working-with-clustering). | [optional] [default to false]
 **clusterAlgorithm** | **String**| This parameter is used for specifying the clustering algorithm you wish to use. It supprts STC, Lingo and [k-means](https://en.wikipedia.org/wiki/K-means_clustering) algorithms. You can read more about working with clustering [here](https://newsapi.aylien.com/docs/working-with-clustering). | [optional] [default to lingo] [enum: stc, lingo, kmeans]
 **_return** | **List&lt;String&gt;**| This parameter is used for specifying return fields. | [optional] [enum: id, title, body, summary, source, author, entities, keywords, hashtags, characters_count, words_count, sentences_count, paragraphs_count, categories, social_shares_count, media, sentiment, language, published_at, links]
 **storyId** | **Long**| A story id | [optional]
 **storyUrl** | **String**| An article or webpage | [optional]
 **storyTitle** | **String**| Title of the article | [optional]
 **storyBody** | **String**| Body of the article | [optional]
 **boostBy** | **String**| This parameter is used for boosting the result by the specified value. | [optional] [enum: recency, popularity]
 **storyLanguage** | **String**| This parameter is used for setting the language of the story. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes. | [optional] [default to auto] [enum: auto, en, de, fr, it, es, pt]
 **perPage** | **Integer**| This parameter is used for specifying number of items in each page. | [optional] [default to 3]

### Return type

[**RelatedStories**](RelatedStories.md)

### Authorization

[app_key](../README.md#app_key), [app_id](../README.md#app_id)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json, text/xml

<a name="listStories"></a>
# **listStories**
> Stories listStories(storiesParams)

List Stories

This endpoint is used for getting a list of stories.

### Example
```java
import com.aylien.newsapi.*;
import com.aylien.newsapi.auth.*;
import com.aylien.newsapi.models.*;
import com.aylien.newsapi.parameters.*;
import com.aylien.newsapi.api.DefaultApi;

import java.util.*;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: app_id
ApiKeyAuth app_id = (ApiKeyAuth) defaultClient.getAuthentication("app_id");
app_id.setApiKey("YOUR_APP_ID");

// Configure API key authorization: app_key
ApiKeyAuth app_key = (ApiKeyAuth) defaultClient.getAuthentication("app_key");
app_key.setApiKey("YOUR_APP_KEY");

DefaultApi apiInstance = new DefaultApi();

List<Long> id = Arrays.asList(56L);
List<Long> notId = Arrays.asList(56L);
String title = "title_example";
String body = "body_example";
String text = "text_example";
List<String> language = Arrays.asList("language_example");
List<String> notLanguage = Arrays.asList("notLanguage_example");
String publishedAtStart = "publishedAtStart_example";
String publishedAtEnd = "publishedAtEnd_example";
String categoriesTaxonomy = "categoriesTaxonomy_example";
Boolean categoriesConfident = true;
List<String> categoriesId = Arrays.asList("categoriesId_example");
List<String> notCategoriesId = Arrays.asList("notCategoriesId_example");
List<Integer> categoriesLevel = Arrays.asList(56);
List<Integer> notCategoriesLevel = Arrays.asList(56);
List<String> entitiesTitleText = Arrays.asList("entitiesTitleText_example");
List<String> notEntitiesTitleText = Arrays.asList("notEntitiesTitleText_example");
List<String> entitiesTitleType = Arrays.asList("entitiesTitleType_example");
List<String> notEntitiesTitleType = Arrays.asList("notEntitiesTitleType_example");
List<String> entitiesTitleLinksDbpedia = Arrays.asList("entitiesTitleLinksDbpedia_example");
List<String> notEntitiesTitleLinksDbpedia = Arrays.asList("notEntitiesTitleLinksDbpedia_example");
List<String> entitiesBodyText = Arrays.asList("entitiesBodyText_example");
List<String> notEntitiesBodyText = Arrays.asList("notEntitiesBodyText_example");
List<String> entitiesBodyType = Arrays.asList("entitiesBodyType_example");
List<String> notEntitiesBodyType = Arrays.asList("notEntitiesBodyType_example");
List<String> entitiesBodyLinksDbpedia = Arrays.asList("entitiesBodyLinksDbpedia_example");
List<String> notEntitiesBodyLinksDbpedia = Arrays.asList("notEntitiesBodyLinksDbpedia_example");
String sentimentTitlePolarity = "sentimentTitlePolarity_example";
String notSentimentTitlePolarity = "notSentimentTitlePolarity_example";
String sentimentBodyPolarity = "sentimentBodyPolarity_example";
String notSentimentBodyPolarity = "notSentimentBodyPolarity_example";
Integer mediaImagesCountMin = 56;
Integer mediaImagesCountMax = 56;
Integer mediaImagesWidthMin = 56;
Integer mediaImagesWidthMax = 56;
Integer mediaImagesHeightMin = 56;
Integer mediaImagesHeightMax = 56;
Integer mediaImagesContentLengthMin = 56;
Integer mediaImagesContentLengthMax = 56;
List<String> mediaImagesFormat = Arrays.asList("mediaImagesFormat_example");
List<String> notMediaImagesFormat = Arrays.asList("notMediaImagesFormat_example");
Integer mediaVideosCountMin = 56;
Integer mediaVideosCountMax = 56;
List<Integer> authorId = Arrays.asList(56);
List<Integer> notAuthorId = Arrays.asList(56);
String authorName = "authorName_example";
String notAuthorName = "notAuthorName_example";
List<Integer> sourceId = Arrays.asList(56);
List<Integer> notSourceId = Arrays.asList(56);
List<String> sourceName = Arrays.asList("sourceName_example");
List<String> notSourceName = Arrays.asList("notSourceName_example");
List<String> sourceDomain = Arrays.asList("sourceDomain_example");
List<String> notSourceDomain = Arrays.asList("notSourceDomain_example");
List<String> sourceLocationsCountry = Arrays.asList("sourceLocationsCountry_example");
List<String> notSourceLocationsCountry = Arrays.asList("notSourceLocationsCountry_example");
List<String> sourceLocationsState = Arrays.asList("sourceLocationsState_example");
List<String> notSourceLocationsState = Arrays.asList("notSourceLocationsState_example");
List<String> sourceLocationsCity = Arrays.asList("sourceLocationsCity_example");
List<String> notSourceLocationsCity = Arrays.asList("notSourceLocationsCity_example");
List<String> sourceScopesCountry = Arrays.asList("sourceScopesCountry_example");
List<String> notSourceScopesCountry = Arrays.asList("notSourceScopesCountry_example");
List<String> sourceScopesState = Arrays.asList("sourceScopesState_example");
List<String> notSourceScopesState = Arrays.asList("notSourceScopesState_example");
List<String> sourceScopesCity = Arrays.asList("sourceScopesCity_example");
List<String> notSourceScopesCity = Arrays.asList("notSourceScopesCity_example");
List<String> sourceScopesLevel = Arrays.asList("sourceScopesLevel_example");
List<String> notSourceScopesLevel = Arrays.asList("notSourceScopesLevel_example");
Integer sourceLinksInCountMin = 56;
Integer sourceLinksInCountMax = 56;
Integer sourceRankingsAlexaRankMin = 56;
Integer sourceRankingsAlexaRankMax = 56;
List<String> sourceRankingsAlexaCountry = Arrays.asList("sourceRankingsAlexaCountry_example");
Integer socialSharesCountFacebookMin = 56;
Integer socialSharesCountFacebookMax = 56;
Integer socialSharesCountGooglePlusMin = 56;
Integer socialSharesCountGooglePlusMax = 56;
Integer socialSharesCountLinkedinMin = 56;
Integer socialSharesCountLinkedinMax = 56;
Integer socialSharesCountRedditMin = 56;
Integer socialSharesCountRedditMax = 56;
Boolean cluster = false;
String clusterAlgorithm = "lingo";
List<String> _return = Arrays.asList("_return_example");
String sortBy = "published_at";
String sortDirection = "desc";
String cursor = "*";
Integer perPage = 10;

StoriesParams.Builder storiesBuilder = StoriesParams.newBuilder();

storiesBuilder.setId(id);
storiesBuilder.setNotId(notId);
storiesBuilder.setTitle(title);
storiesBuilder.setBody(body);
storiesBuilder.setText(text);
storiesBuilder.setLanguage(language);
storiesBuilder.setNotLanguage(notLanguage);
storiesBuilder.setPublishedAtStart(publishedAtStart);
storiesBuilder.setPublishedAtEnd(publishedAtEnd);
storiesBuilder.setCategoriesTaxonomy(categoriesTaxonomy);
storiesBuilder.setCategoriesConfident(categoriesConfident);
storiesBuilder.setCategoriesId(categoriesId);
storiesBuilder.setNotCategoriesId(notCategoriesId);
storiesBuilder.setCategoriesLevel(categoriesLevel);
storiesBuilder.setNotCategoriesLevel(notCategoriesLevel);
storiesBuilder.setEntitiesTitleText(entitiesTitleText);
storiesBuilder.setNotEntitiesTitleText(notEntitiesTitleText);
storiesBuilder.setEntitiesTitleType(entitiesTitleType);
storiesBuilder.setNotEntitiesTitleType(notEntitiesTitleType);
storiesBuilder.setEntitiesTitleLinksDbpedia(entitiesTitleLinksDbpedia);
storiesBuilder.setNotEntitiesTitleLinksDbpedia(notEntitiesTitleLinksDbpedia);
storiesBuilder.setEntitiesBodyText(entitiesBodyText);
storiesBuilder.setNotEntitiesBodyText(notEntitiesBodyText);
storiesBuilder.setEntitiesBodyType(entitiesBodyType);
storiesBuilder.setNotEntitiesBodyType(notEntitiesBodyType);
storiesBuilder.setEntitiesBodyLinksDbpedia(entitiesBodyLinksDbpedia);
storiesBuilder.setNotEntitiesBodyLinksDbpedia(notEntitiesBodyLinksDbpedia);
storiesBuilder.setSentimentTitlePolarity(sentimentTitlePolarity);
storiesBuilder.setNotSentimentTitlePolarity(notSentimentTitlePolarity);
storiesBuilder.setSentimentBodyPolarity(sentimentBodyPolarity);
storiesBuilder.setNotSentimentBodyPolarity(notSentimentBodyPolarity);
storiesBuilder.setMediaImagesCountMin(mediaImagesCountMin);
storiesBuilder.setMediaImagesCountMax(mediaImagesCountMax);
storiesBuilder.setMediaImagesWidthMin(mediaImagesWidthMin);
storiesBuilder.setMediaImagesWidthMax(mediaImagesWidthMax);
storiesBuilder.setMediaImagesHeightMin(mediaImagesHeightMin);
storiesBuilder.setMediaImagesHeightMax(mediaImagesHeightMax);
storiesBuilder.setMediaImagesContentLengthMin(mediaImagesContentLengthMin);
storiesBuilder.setMediaImagesContentLengthMax(mediaImagesContentLengthMax);
storiesBuilder.setMediaImagesFormat(mediaImagesFormat);
storiesBuilder.setNotMediaImagesFormat(notMediaImagesFormat);
storiesBuilder.setMediaVideosCountMin(mediaVideosCountMin);
storiesBuilder.setMediaVideosCountMax(mediaVideosCountMax);
storiesBuilder.setAuthorId(authorId);
storiesBuilder.setNotAuthorId(notAuthorId);
storiesBuilder.setAuthorName(authorName);
storiesBuilder.setNotAuthorName(notAuthorName);
storiesBuilder.setSourceId(sourceId);
storiesBuilder.setNotSourceId(notSourceId);
storiesBuilder.setSourceName(sourceName);
storiesBuilder.setNotSourceName(notSourceName);
storiesBuilder.setSourceDomain(sourceDomain);
storiesBuilder.setNotSourceDomain(notSourceDomain);
storiesBuilder.setSourceLocationsCountry(sourceLocationsCountry);
storiesBuilder.setNotSourceLocationsCountry(notSourceLocationsCountry);
storiesBuilder.setSourceLocationsState(sourceLocationsState);
storiesBuilder.setNotSourceLocationsState(notSourceLocationsState);
storiesBuilder.setSourceLocationsCity(sourceLocationsCity);
storiesBuilder.setNotSourceLocationsCity(notSourceLocationsCity);
storiesBuilder.setSourceScopesCountry(sourceScopesCountry);
storiesBuilder.setNotSourceScopesCountry(notSourceScopesCountry);
storiesBuilder.setSourceScopesState(sourceScopesState);
storiesBuilder.setNotSourceScopesState(notSourceScopesState);
storiesBuilder.setSourceScopesCity(sourceScopesCity);
storiesBuilder.setNotSourceScopesCity(notSourceScopesCity);
storiesBuilder.setSourceScopesLevel(sourceScopesLevel);
storiesBuilder.setNotSourceScopesLevel(notSourceScopesLevel);
storiesBuilder.setSourceLinksInCountMin(sourceLinksInCountMin);
storiesBuilder.setSourceLinksInCountMax(sourceLinksInCountMax);
storiesBuilder.setSourceRankingsAlexaRankMin(sourceRankingsAlexaRankMin);
storiesBuilder.setSourceRankingsAlexaRankMax(sourceRankingsAlexaRankMax);
storiesBuilder.setSourceRankingsAlexaCountry(sourceRankingsAlexaCountry);
storiesBuilder.setSocialSharesCountFacebookMin(socialSharesCountFacebookMin);
storiesBuilder.setSocialSharesCountFacebookMax(socialSharesCountFacebookMax);
storiesBuilder.setSocialSharesCountGooglePlusMin(socialSharesCountGooglePlusMin);
storiesBuilder.setSocialSharesCountGooglePlusMax(socialSharesCountGooglePlusMax);
storiesBuilder.setSocialSharesCountLinkedinMin(socialSharesCountLinkedinMin);
storiesBuilder.setSocialSharesCountLinkedinMax(socialSharesCountLinkedinMax);
storiesBuilder.setSocialSharesCountRedditMin(socialSharesCountRedditMin);
storiesBuilder.setSocialSharesCountRedditMax(socialSharesCountRedditMax);
storiesBuilder.setCluster(cluster);
storiesBuilder.setClusterAlgorithm(clusterAlgorithm);
storiesBuilder.set_return(_return);
storiesBuilder.setSortBy(sortBy);
storiesBuilder.setSortDirection(sortDirection);
storiesBuilder.setCursor(cursor);
storiesBuilder.setPerPage(perPage);

try {
    Stories result = apiInstance.listStories(storiesBuilder.build());
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listStories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **List&lt;Long&gt;**| This parameter is used for finding stories by story id. | [optional]
 **notId** | **List&lt;Long&gt;**| This parameter is used for excluding stories by story id. | [optional]
 **title** | **String**| This parameter is used for finding stories whose title contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). | [optional]
 **body** | **String**| This parameter is used for finding stories whose body contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). | [optional]
 **text** | **String**| This parameter is used for finding stories whose title or body contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). | [optional]
 **language** | **List&lt;String&gt;**| This parameter is used for finding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes. | [optional] [enum: en, de, fr, it, es, pt]
 **notLanguage** | **List&lt;String&gt;**| This parameter is used for excluding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes. | [optional] [enum: en, de, fr, it, es, pt]
 **publishedAtStart** | **String**| This parameter is used for finding stories whose published at time is greater than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates). | [optional]
 **publishedAtEnd** | **String**| This parameter is used for finding stories whose published at time is less than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates). | [optional]
 **categoriesTaxonomy** | **String**| This parameter is used for defining the type of the taxonomy for the rest of the categories queries. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). | [optional] [enum: iab-qag, iptc-subjectcode]
 **categoriesConfident** | **Boolean**| This parameter is used for finding stories whose categories are confident. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). | [optional] [default to true]
 **categoriesId** | **List&lt;String&gt;**| This parameter is used for finding stories by categories id. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). | [optional]
 **notCategoriesId** | **List&lt;String&gt;**| This parameter is used for excluding stories by categories id. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). | [optional]
 **categoriesLevel** | **List&lt;Integer&gt;**| This parameter is used for finding stories by categories level. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). | [optional]
 **notCategoriesLevel** | **List&lt;Integer&gt;**| This parameter is used for excluding stories by categories level. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). | [optional]
 **entitiesTitleText** | **List&lt;String&gt;**| This parameter is used to find stories based on the specified entities &#x60;text&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **notEntitiesTitleText** | **List&lt;String&gt;**| This parameter is used to exclude stories based on the specified entities &#x60;text&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **entitiesTitleType** | **List&lt;String&gt;**| This parameter is used to find stories based on the specified entities &#x60;type&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **notEntitiesTitleType** | **List&lt;String&gt;**| This parameter is used to exclude stories based on the specified entities &#x60;type&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **entitiesTitleLinksDbpedia** | **List&lt;String&gt;**| This parameter is used to find stories based on the specified entities dbpedia URL in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **notEntitiesTitleLinksDbpedia** | **List&lt;String&gt;**| This parameter is used to exclude stories based on the specified entities dbpedia URL in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **entitiesBodyText** | **List&lt;String&gt;**| This parameter is used to find stories based on the specified entities &#x60;text&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **notEntitiesBodyText** | **List&lt;String&gt;**| This parameter is used to exclude stories based on the specified entities &#x60;text&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **entitiesBodyType** | **List&lt;String&gt;**| This parameter is used to find stories based on the specified entities &#x60;type&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **notEntitiesBodyType** | **List&lt;String&gt;**| This parameter is used to exclude stories based on the specified entities &#x60;type&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **entitiesBodyLinksDbpedia** | **List&lt;String&gt;**| This parameter is used to find stories based on the specified entities dbpedia URL in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **notEntitiesBodyLinksDbpedia** | **List&lt;String&gt;**| This parameter is used to exclude stories based on the specified entities dbpedia URL in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **sentimentTitlePolarity** | **String**| This parameter is used for finding stories whose title sentiment is the specified value. | [optional] [enum: positive, neutral, negative]
 **notSentimentTitlePolarity** | **String**| This parameter is used for excluding stories whose title sentiment is the specified value. | [optional] [enum: positive, neutral, negative]
 **sentimentBodyPolarity** | **String**| This parameter is used for finding stories whose body sentiment is the specified value. | [optional] [enum: positive, neutral, negative]
 **notSentimentBodyPolarity** | **String**| This parameter is used for excluding stories whose body sentiment is the specified value. | [optional] [enum: positive, neutral, negative]
 **mediaImagesCountMin** | **Integer**| This parameter is used for finding stories whose number of images is greater than or equal to the specified value. | [optional]
 **mediaImagesCountMax** | **Integer**| This parameter is used for finding stories whose number of images is less than or equal to the specified value. | [optional]
 **mediaImagesWidthMin** | **Integer**| This parameter is used for finding stories whose width of images are greater than or equal to the specified value. | [optional]
 **mediaImagesWidthMax** | **Integer**| This parameter is used for finding stories whose width of images are less than or equal to the specified value. | [optional]
 **mediaImagesHeightMin** | **Integer**| This parameter is used for finding stories whose height of images are greater than or equal to the specified value. | [optional]
 **mediaImagesHeightMax** | **Integer**| This parameter is used for finding stories whose height of images are less than or equal to the specified value. | [optional]
 **mediaImagesContentLengthMin** | **Integer**| This parameter is used for finding stories whose images content length are greater than or equal to the specified value. | [optional]
 **mediaImagesContentLengthMax** | **Integer**| This parameter is used for finding stories whose images content length are less than or equal to the specified value. | [optional]
 **mediaImagesFormat** | **List&lt;String&gt;**| This parameter is used for finding stories whose images format are the specified value. | [optional] [enum: BMP, GIF, JPEG, PNG, TIFF, PSD, ICO, CUR, WEBP, SVG]
 **notMediaImagesFormat** | **List&lt;String&gt;**| This parameter is used for excluding stories whose images format are the specified value. | [optional] [enum: BMP, GIF, JPEG, PNG, TIFF, PSD, ICO, CUR, WEBP, SVG]
 **mediaVideosCountMin** | **Integer**| This parameter is used for finding stories whose number of videos is greater than or equal to the specified value. | [optional]
 **mediaVideosCountMax** | **Integer**| This parameter is used for finding stories whose number of videos is less than or equal to the specified value. | [optional]
 **authorId** | **List&lt;Integer&gt;**| This parameter is used for finding stories whose author id is the specified value. | [optional]
 **notAuthorId** | **List&lt;Integer&gt;**| This parameter is used for excluding stories whose author id is the specified value. | [optional]
 **authorName** | **String**| This parameter is used for finding stories whose author full name contains the specified value. | [optional]
 **notAuthorName** | **String**| This parameter is used for excluding stories whose author full name contains the specified value. | [optional]
 **sourceId** | **List&lt;Integer&gt;**| This parameter is used for finding stories whose source id is the specified value. | [optional]
 **notSourceId** | **List&lt;Integer&gt;**| This parameter is used for excluding stories whose source id is the specified value. | [optional]
 **sourceName** | **List&lt;String&gt;**| This parameter is used for finding stories whose source name contains the specified value. | [optional]
 **notSourceName** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source name contains the specified value. | [optional]
 **sourceDomain** | **List&lt;String&gt;**| This parameter is used for finding stories whose source domain is the specified value. | [optional]
 **notSourceDomain** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source domain is the specified value. | [optional]
 **sourceLocationsCountry** | **List&lt;String&gt;**| This parameter is used for finding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **notSourceLocationsCountry** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **sourceLocationsState** | **List&lt;String&gt;**| This parameter is used for finding stories whose source state/province is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **notSourceLocationsState** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source state/province is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **sourceLocationsCity** | **List&lt;String&gt;**| This parameter is used for finding stories whose source city is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **notSourceLocationsCity** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source city is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **sourceScopesCountry** | **List&lt;String&gt;**| This parameter is used for finding stories whose source scopes is the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **notSourceScopesCountry** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source scopes is the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **sourceScopesState** | **List&lt;String&gt;**| This parameter is used for finding stories whose source scopes is the specified state/province value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **notSourceScopesState** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source scopes is the specified state/province value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **sourceScopesCity** | **List&lt;String&gt;**| This parameter is used for finding stories whose source scopes is the specified city value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **notSourceScopesCity** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source scopes is the specified city value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **sourceScopesLevel** | **List&lt;String&gt;**| This parameter is used for finding stories whose source scopes is the specified level value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional] [enum: international, national, local]
 **notSourceScopesLevel** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source scopes is the specified level value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional] [enum: international, national, local]
 **sourceLinksInCountMin** | **Integer**| This parameter is used for finding stories from sources whose Links in count is greater than or equal to the specified value. You can read more about working with Links in count [here](https://newsapi.aylien.com/docs/working-with-links-in-count). | [optional]
 **sourceLinksInCountMax** | **Integer**| This parameter is used for finding stories from sources whose Links in count is less than or equal to the specified value. You can read more about working with Links in count [here](https://newsapi.aylien.com/docs/working-with-links-in-count). | [optional]
 **sourceRankingsAlexaRankMin** | **Integer**| This parameter is used for finding stories from sources whose Alexa rank is greater than or equal to the specified value. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks). | [optional]
 **sourceRankingsAlexaRankMax** | **Integer**| This parameter is used for finding stories from sources whose Alexa rank is less than or equal to the specified value. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks). | [optional]
 **sourceRankingsAlexaCountry** | **List&lt;String&gt;**| This parameter is used for finding stories from sources whose Alexa rank is in the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks). | [optional]
 **socialSharesCountFacebookMin** | **Integer**| This parameter is used for finding stories whose Facebook social shares count is greater than or equal to the specified value. | [optional]
 **socialSharesCountFacebookMax** | **Integer**| This parameter is used for finding stories whose Facebook social shares count is less than or equal to the specified value. | [optional]
 **socialSharesCountGooglePlusMin** | **Integer**| This parameter is used for finding stories whose Google+ social shares count is greater than or equal to the specified value. | [optional]
 **socialSharesCountGooglePlusMax** | **Integer**| This parameter is used for finding stories whose Google+ social shares count is less than or equal to the specified value. | [optional]
 **socialSharesCountLinkedinMin** | **Integer**| This parameter is used for finding stories whose LinkedIn social shares count is greater than or equal to the specified value. | [optional]
 **socialSharesCountLinkedinMax** | **Integer**| This parameter is used for finding stories whose LinkedIn social shares count is less than or equal to the specified value. | [optional]
 **socialSharesCountRedditMin** | **Integer**| This parameter is used for finding stories whose Reddit social shares count is greater than or equal to the specified value. | [optional]
 **socialSharesCountRedditMax** | **Integer**| This parameter is used for finding stories whose Reddit social shares count is less than or equal to the specified value. | [optional]
 **cluster** | **Boolean**| This parameter enables clustering for the returned stories. You can read more about working with clustering [here](https://newsapi.aylien.com/docs/working-with-clustering). | [optional] [default to false]
 **clusterAlgorithm** | **String**| This parameter is used for specifying the clustering algorithm you wish to use. It supprts STC, Lingo and [k-means](https://en.wikipedia.org/wiki/K-means_clustering) algorithms. You can read more about working with clustering [here](https://newsapi.aylien.com/docs/working-with-clustering). | [optional] [default to lingo] [enum: stc, lingo, kmeans]
 **_return** | **List&lt;String&gt;**| This parameter is used for specifying return fields. | [optional] [enum: id, title, body, summary, source, author, entities, keywords, hashtags, characters_count, words_count, sentences_count, paragraphs_count, categories, social_shares_count, media, sentiment, language, published_at, links]
 **sortBy** | **String**| This parameter is used for changing the order column of the results. | [optional] [default to published_at] [enum: relevance, recency, hotness, published_at, social_shares_count, social_shares_count.facebook, social_shares_count.linkedin, social_shares_count.google_plus, social_shares_count.reddit, media.images.count, media.videos.count, source.links_in_count, source.rankings.alexa.rank, source.rankings.alexa.rank.AF, source.rankings.alexa.rank.AX, source.rankings.alexa.rank.AL, source.rankings.alexa.rank.DZ, source.rankings.alexa.rank.AS, source.rankings.alexa.rank.AD, source.rankings.alexa.rank.AO, source.rankings.alexa.rank.AI, source.rankings.alexa.rank.AQ, source.rankings.alexa.rank.AG, source.rankings.alexa.rank.AR, source.rankings.alexa.rank.AM, source.rankings.alexa.rank.AW, source.rankings.alexa.rank.AU, source.rankings.alexa.rank.AT, source.rankings.alexa.rank.AZ, source.rankings.alexa.rank.BS, source.rankings.alexa.rank.BH, source.rankings.alexa.rank.BD, source.rankings.alexa.rank.BB, source.rankings.alexa.rank.BY, source.rankings.alexa.rank.BE, source.rankings.alexa.rank.BZ, source.rankings.alexa.rank.BJ, source.rankings.alexa.rank.BM, source.rankings.alexa.rank.BT, source.rankings.alexa.rank.BO, source.rankings.alexa.rank.BQ, source.rankings.alexa.rank.BA, source.rankings.alexa.rank.BW, source.rankings.alexa.rank.BV, source.rankings.alexa.rank.BR, source.rankings.alexa.rank.IO, source.rankings.alexa.rank.BN, source.rankings.alexa.rank.BG, source.rankings.alexa.rank.BF, source.rankings.alexa.rank.BI, source.rankings.alexa.rank.KH, source.rankings.alexa.rank.CM, source.rankings.alexa.rank.CA, source.rankings.alexa.rank.CV, source.rankings.alexa.rank.KY, source.rankings.alexa.rank.CF, source.rankings.alexa.rank.TD, source.rankings.alexa.rank.CL, source.rankings.alexa.rank.CN, source.rankings.alexa.rank.CX, source.rankings.alexa.rank.CC, source.rankings.alexa.rank.CO, source.rankings.alexa.rank.KM, source.rankings.alexa.rank.CG, source.rankings.alexa.rank.CD, source.rankings.alexa.rank.CK, source.rankings.alexa.rank.CR, source.rankings.alexa.rank.CI, source.rankings.alexa.rank.HR, source.rankings.alexa.rank.CU, source.rankings.alexa.rank.CW, source.rankings.alexa.rank.CY, source.rankings.alexa.rank.CZ, source.rankings.alexa.rank.DK, source.rankings.alexa.rank.DJ, source.rankings.alexa.rank.DM, source.rankings.alexa.rank.DO, source.rankings.alexa.rank.EC, source.rankings.alexa.rank.EG, source.rankings.alexa.rank.SV, source.rankings.alexa.rank.GQ, source.rankings.alexa.rank.ER, source.rankings.alexa.rank.EE, source.rankings.alexa.rank.ET, source.rankings.alexa.rank.FK, source.rankings.alexa.rank.FO, source.rankings.alexa.rank.FJ, source.rankings.alexa.rank.FI, source.rankings.alexa.rank.FR, source.rankings.alexa.rank.GF, source.rankings.alexa.rank.PF, source.rankings.alexa.rank.TF, source.rankings.alexa.rank.GA, source.rankings.alexa.rank.GM, source.rankings.alexa.rank.GE, source.rankings.alexa.rank.DE, source.rankings.alexa.rank.GH, source.rankings.alexa.rank.GI, source.rankings.alexa.rank.GR, source.rankings.alexa.rank.GL, source.rankings.alexa.rank.GD, source.rankings.alexa.rank.GP, source.rankings.alexa.rank.GU, source.rankings.alexa.rank.GT, source.rankings.alexa.rank.GG, source.rankings.alexa.rank.GN, source.rankings.alexa.rank.GW, source.rankings.alexa.rank.GY, source.rankings.alexa.rank.HT, source.rankings.alexa.rank.HM, source.rankings.alexa.rank.VA, source.rankings.alexa.rank.HN, source.rankings.alexa.rank.HK, source.rankings.alexa.rank.HU, source.rankings.alexa.rank.IS, source.rankings.alexa.rank.IN, source.rankings.alexa.rank.ID, source.rankings.alexa.rank.IR, source.rankings.alexa.rank.IQ, source.rankings.alexa.rank.IE, source.rankings.alexa.rank.IM, source.rankings.alexa.rank.IL, source.rankings.alexa.rank.IT, source.rankings.alexa.rank.JM, source.rankings.alexa.rank.JP, source.rankings.alexa.rank.JE, source.rankings.alexa.rank.JO, source.rankings.alexa.rank.KZ, source.rankings.alexa.rank.KE, source.rankings.alexa.rank.KI, source.rankings.alexa.rank.KP, source.rankings.alexa.rank.KR, source.rankings.alexa.rank.KW, source.rankings.alexa.rank.KG, source.rankings.alexa.rank.LA, source.rankings.alexa.rank.LV, source.rankings.alexa.rank.LB, source.rankings.alexa.rank.LS, source.rankings.alexa.rank.LR, source.rankings.alexa.rank.LY, source.rankings.alexa.rank.LI, source.rankings.alexa.rank.LT, source.rankings.alexa.rank.LU, source.rankings.alexa.rank.MO, source.rankings.alexa.rank.MK, source.rankings.alexa.rank.MG, source.rankings.alexa.rank.MW, source.rankings.alexa.rank.MY, source.rankings.alexa.rank.MV, source.rankings.alexa.rank.ML, source.rankings.alexa.rank.MT, source.rankings.alexa.rank.MH, source.rankings.alexa.rank.MQ, source.rankings.alexa.rank.MR, source.rankings.alexa.rank.MU, source.rankings.alexa.rank.YT, source.rankings.alexa.rank.MX, source.rankings.alexa.rank.FM, source.rankings.alexa.rank.MD, source.rankings.alexa.rank.MC, source.rankings.alexa.rank.MN, source.rankings.alexa.rank.ME, source.rankings.alexa.rank.MS, source.rankings.alexa.rank.MA, source.rankings.alexa.rank.MZ, source.rankings.alexa.rank.MM, source.rankings.alexa.rank.NA, source.rankings.alexa.rank.NR, source.rankings.alexa.rank.NP, source.rankings.alexa.rank.NL, source.rankings.alexa.rank.NC, source.rankings.alexa.rank.NZ, source.rankings.alexa.rank.NI, source.rankings.alexa.rank.NE, source.rankings.alexa.rank.NG, source.rankings.alexa.rank.NU, source.rankings.alexa.rank.NF, source.rankings.alexa.rank.MP, source.rankings.alexa.rank.NO, source.rankings.alexa.rank.OM, source.rankings.alexa.rank.PK, source.rankings.alexa.rank.PW, source.rankings.alexa.rank.PS, source.rankings.alexa.rank.PA, source.rankings.alexa.rank.PG, source.rankings.alexa.rank.PY, source.rankings.alexa.rank.PE, source.rankings.alexa.rank.PH, source.rankings.alexa.rank.PN, source.rankings.alexa.rank.PL, source.rankings.alexa.rank.PT, source.rankings.alexa.rank.PR, source.rankings.alexa.rank.QA, source.rankings.alexa.rank.RE, source.rankings.alexa.rank.RO, source.rankings.alexa.rank.RU, source.rankings.alexa.rank.RW, source.rankings.alexa.rank.BL, source.rankings.alexa.rank.SH, source.rankings.alexa.rank.KN, source.rankings.alexa.rank.LC, source.rankings.alexa.rank.MF, source.rankings.alexa.rank.PM, source.rankings.alexa.rank.VC, source.rankings.alexa.rank.WS, source.rankings.alexa.rank.SM, source.rankings.alexa.rank.ST, source.rankings.alexa.rank.SA, source.rankings.alexa.rank.SN, source.rankings.alexa.rank.RS, source.rankings.alexa.rank.SC, source.rankings.alexa.rank.SL, source.rankings.alexa.rank.SG, source.rankings.alexa.rank.SX, source.rankings.alexa.rank.SK, source.rankings.alexa.rank.SI, source.rankings.alexa.rank.SB, source.rankings.alexa.rank.SO, source.rankings.alexa.rank.ZA, source.rankings.alexa.rank.GS, source.rankings.alexa.rank.SS, source.rankings.alexa.rank.ES, source.rankings.alexa.rank.LK, source.rankings.alexa.rank.SD, source.rankings.alexa.rank.SR, source.rankings.alexa.rank.SJ, source.rankings.alexa.rank.SZ, source.rankings.alexa.rank.SE, source.rankings.alexa.rank.CH, source.rankings.alexa.rank.SY, source.rankings.alexa.rank.TW, source.rankings.alexa.rank.TJ, source.rankings.alexa.rank.TZ, source.rankings.alexa.rank.TH, source.rankings.alexa.rank.TL, source.rankings.alexa.rank.TG, source.rankings.alexa.rank.TK, source.rankings.alexa.rank.TO, source.rankings.alexa.rank.TT, source.rankings.alexa.rank.TN, source.rankings.alexa.rank.TR, source.rankings.alexa.rank.TM, source.rankings.alexa.rank.TC, source.rankings.alexa.rank.TV, source.rankings.alexa.rank.UG, source.rankings.alexa.rank.UA, source.rankings.alexa.rank.AE, source.rankings.alexa.rank.GB, source.rankings.alexa.rank.US, source.rankings.alexa.rank.UM, source.rankings.alexa.rank.UY, source.rankings.alexa.rank.UZ, source.rankings.alexa.rank.VU, source.rankings.alexa.rank.VE, source.rankings.alexa.rank.VN, source.rankings.alexa.rank.VG, source.rankings.alexa.rank.VI, source.rankings.alexa.rank.WF, source.rankings.alexa.rank.EH, source.rankings.alexa.rank.YE, source.rankings.alexa.rank.ZM, source.rankings.alexa.rank.ZW]
 **sortDirection** | **String**| This parameter is used for changing the order direction of the result. | [optional] [default to desc] [enum: asc, desc]
 **cursor** | **String**| This parameter is used for finding a specific page. You can read more about pagination of results [here](https://newsapi.aylien.com/docs/pagination-of-results). | [optional] [default to *]
 **perPage** | **Integer**| This parameter is used for specifying number of items in each page You can read more about pagination of results [here](https://newsapi.aylien.com/docs/pagination-of-results) | [optional] [default to 10]

### Return type

[**Stories**](Stories.md)

### Authorization

[app_key](../README.md#app_key), [app_id](../README.md#app_id)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json, text/xml

<a name="listTimeSeries"></a>
# **listTimeSeries**
> TimeSeriesList listTimeSeries(timeSeriesListParams)

List time series

This endpoint is used for getting time series by stories.

### Example
```java
import com.aylien.newsapi.*;
import com.aylien.newsapi.auth.*;
import com.aylien.newsapi.models.*;
import com.aylien.newsapi.parameters.*;
import com.aylien.newsapi.api.DefaultApi;

import java.util.*;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: app_id
ApiKeyAuth app_id = (ApiKeyAuth) defaultClient.getAuthentication("app_id");
app_id.setApiKey("YOUR_APP_ID");

// Configure API key authorization: app_key
ApiKeyAuth app_key = (ApiKeyAuth) defaultClient.getAuthentication("app_key");
app_key.setApiKey("YOUR_APP_KEY");

DefaultApi apiInstance = new DefaultApi();

List<Long> id = Arrays.asList(56L);
List<Long> notId = Arrays.asList(56L);
String title = "title_example";
String body = "body_example";
String text = "text_example";
List<String> language = Arrays.asList("language_example");
List<String> notLanguage = Arrays.asList("notLanguage_example");
String categoriesTaxonomy = "categoriesTaxonomy_example";
Boolean categoriesConfident = true;
List<String> categoriesId = Arrays.asList("categoriesId_example");
List<String> notCategoriesId = Arrays.asList("notCategoriesId_example");
List<Integer> categoriesLevel = Arrays.asList(56);
List<Integer> notCategoriesLevel = Arrays.asList(56);
List<String> entitiesTitleText = Arrays.asList("entitiesTitleText_example");
List<String> notEntitiesTitleText = Arrays.asList("notEntitiesTitleText_example");
List<String> entitiesTitleType = Arrays.asList("entitiesTitleType_example");
List<String> notEntitiesTitleType = Arrays.asList("notEntitiesTitleType_example");
List<String> entitiesTitleLinksDbpedia = Arrays.asList("entitiesTitleLinksDbpedia_example");
List<String> notEntitiesTitleLinksDbpedia = Arrays.asList("notEntitiesTitleLinksDbpedia_example");
List<String> entitiesBodyText = Arrays.asList("entitiesBodyText_example");
List<String> notEntitiesBodyText = Arrays.asList("notEntitiesBodyText_example");
List<String> entitiesBodyType = Arrays.asList("entitiesBodyType_example");
List<String> notEntitiesBodyType = Arrays.asList("notEntitiesBodyType_example");
List<String> entitiesBodyLinksDbpedia = Arrays.asList("entitiesBodyLinksDbpedia_example");
List<String> notEntitiesBodyLinksDbpedia = Arrays.asList("notEntitiesBodyLinksDbpedia_example");
String sentimentTitlePolarity = "sentimentTitlePolarity_example";
String notSentimentTitlePolarity = "notSentimentTitlePolarity_example";
String sentimentBodyPolarity = "sentimentBodyPolarity_example";
String notSentimentBodyPolarity = "notSentimentBodyPolarity_example";
Integer mediaImagesCountMin = 56;
Integer mediaImagesCountMax = 56;
Integer mediaImagesWidthMin = 56;
Integer mediaImagesWidthMax = 56;
Integer mediaImagesHeightMin = 56;
Integer mediaImagesHeightMax = 56;
Integer mediaImagesContentLengthMin = 56;
Integer mediaImagesContentLengthMax = 56;
List<String> mediaImagesFormat = Arrays.asList("mediaImagesFormat_example");
List<String> notMediaImagesFormat = Arrays.asList("notMediaImagesFormat_example");
Integer mediaVideosCountMin = 56;
Integer mediaVideosCountMax = 56;
List<Integer> authorId = Arrays.asList(56);
List<Integer> notAuthorId = Arrays.asList(56);
String authorName = "authorName_example";
String notAuthorName = "notAuthorName_example";
List<Integer> sourceId = Arrays.asList(56);
List<Integer> notSourceId = Arrays.asList(56);
List<String> sourceName = Arrays.asList("sourceName_example");
List<String> notSourceName = Arrays.asList("notSourceName_example");
List<String> sourceDomain = Arrays.asList("sourceDomain_example");
List<String> notSourceDomain = Arrays.asList("notSourceDomain_example");
List<String> sourceLocationsCountry = Arrays.asList("sourceLocationsCountry_example");
List<String> notSourceLocationsCountry = Arrays.asList("notSourceLocationsCountry_example");
List<String> sourceLocationsState = Arrays.asList("sourceLocationsState_example");
List<String> notSourceLocationsState = Arrays.asList("notSourceLocationsState_example");
List<String> sourceLocationsCity = Arrays.asList("sourceLocationsCity_example");
List<String> notSourceLocationsCity = Arrays.asList("notSourceLocationsCity_example");
List<String> sourceScopesCountry = Arrays.asList("sourceScopesCountry_example");
List<String> notSourceScopesCountry = Arrays.asList("notSourceScopesCountry_example");
List<String> sourceScopesState = Arrays.asList("sourceScopesState_example");
List<String> notSourceScopesState = Arrays.asList("notSourceScopesState_example");
List<String> sourceScopesCity = Arrays.asList("sourceScopesCity_example");
List<String> notSourceScopesCity = Arrays.asList("notSourceScopesCity_example");
List<String> sourceScopesLevel = Arrays.asList("sourceScopesLevel_example");
List<String> notSourceScopesLevel = Arrays.asList("notSourceScopesLevel_example");
Integer sourceLinksInCountMin = 56;
Integer sourceLinksInCountMax = 56;
Integer sourceRankingsAlexaRankMin = 56;
Integer sourceRankingsAlexaRankMax = 56;
List<String> sourceRankingsAlexaCountry = Arrays.asList("sourceRankingsAlexaCountry_example");
Integer socialSharesCountFacebookMin = 56;
Integer socialSharesCountFacebookMax = 56;
Integer socialSharesCountGooglePlusMin = 56;
Integer socialSharesCountGooglePlusMax = 56;
Integer socialSharesCountLinkedinMin = 56;
Integer socialSharesCountLinkedinMax = 56;
Integer socialSharesCountRedditMin = 56;
Integer socialSharesCountRedditMax = 56;
String publishedAtStart = "NOW-7DAYS/DAY";
String publishedAtEnd = "NOW/DAY";
String period = "+1DAY";

TimeSeriesListParams.Builder timeSeriesBuilder = TimeSeriesListParams.newBuilder();

timeSeriesBuilder.setId(id);
timeSeriesBuilder.setNotId(notId);
timeSeriesBuilder.setTitle(title);
timeSeriesBuilder.setBody(body);
timeSeriesBuilder.setText(text);
timeSeriesBuilder.setLanguage(language);
timeSeriesBuilder.setNotLanguage(notLanguage);
timeSeriesBuilder.setCategoriesTaxonomy(categoriesTaxonomy);
timeSeriesBuilder.setCategoriesConfident(categoriesConfident);
timeSeriesBuilder.setCategoriesId(categoriesId);
timeSeriesBuilder.setNotCategoriesId(notCategoriesId);
timeSeriesBuilder.setCategoriesLevel(categoriesLevel);
timeSeriesBuilder.setNotCategoriesLevel(notCategoriesLevel);
timeSeriesBuilder.setEntitiesTitleText(entitiesTitleText);
timeSeriesBuilder.setNotEntitiesTitleText(notEntitiesTitleText);
timeSeriesBuilder.setEntitiesTitleType(entitiesTitleType);
timeSeriesBuilder.setNotEntitiesTitleType(notEntitiesTitleType);
timeSeriesBuilder.setEntitiesTitleLinksDbpedia(entitiesTitleLinksDbpedia);
timeSeriesBuilder.setNotEntitiesTitleLinksDbpedia(notEntitiesTitleLinksDbpedia);
timeSeriesBuilder.setEntitiesBodyText(entitiesBodyText);
timeSeriesBuilder.setNotEntitiesBodyText(notEntitiesBodyText);
timeSeriesBuilder.setEntitiesBodyType(entitiesBodyType);
timeSeriesBuilder.setNotEntitiesBodyType(notEntitiesBodyType);
timeSeriesBuilder.setEntitiesBodyLinksDbpedia(entitiesBodyLinksDbpedia);
timeSeriesBuilder.setNotEntitiesBodyLinksDbpedia(notEntitiesBodyLinksDbpedia);
timeSeriesBuilder.setSentimentTitlePolarity(sentimentTitlePolarity);
timeSeriesBuilder.setNotSentimentTitlePolarity(notSentimentTitlePolarity);
timeSeriesBuilder.setSentimentBodyPolarity(sentimentBodyPolarity);
timeSeriesBuilder.setNotSentimentBodyPolarity(notSentimentBodyPolarity);
timeSeriesBuilder.setMediaImagesCountMin(mediaImagesCountMin);
timeSeriesBuilder.setMediaImagesCountMax(mediaImagesCountMax);
timeSeriesBuilder.setMediaImagesWidthMin(mediaImagesWidthMin);
timeSeriesBuilder.setMediaImagesWidthMax(mediaImagesWidthMax);
timeSeriesBuilder.setMediaImagesHeightMin(mediaImagesHeightMin);
timeSeriesBuilder.setMediaImagesHeightMax(mediaImagesHeightMax);
timeSeriesBuilder.setMediaImagesContentLengthMin(mediaImagesContentLengthMin);
timeSeriesBuilder.setMediaImagesContentLengthMax(mediaImagesContentLengthMax);
timeSeriesBuilder.setMediaImagesFormat(mediaImagesFormat);
timeSeriesBuilder.setNotMediaImagesFormat(notMediaImagesFormat);
timeSeriesBuilder.setMediaVideosCountMin(mediaVideosCountMin);
timeSeriesBuilder.setMediaVideosCountMax(mediaVideosCountMax);
timeSeriesBuilder.setAuthorId(authorId);
timeSeriesBuilder.setNotAuthorId(notAuthorId);
timeSeriesBuilder.setAuthorName(authorName);
timeSeriesBuilder.setNotAuthorName(notAuthorName);
timeSeriesBuilder.setSourceId(sourceId);
timeSeriesBuilder.setNotSourceId(notSourceId);
timeSeriesBuilder.setSourceName(sourceName);
timeSeriesBuilder.setNotSourceName(notSourceName);
timeSeriesBuilder.setSourceDomain(sourceDomain);
timeSeriesBuilder.setNotSourceDomain(notSourceDomain);
timeSeriesBuilder.setSourceLocationsCountry(sourceLocationsCountry);
timeSeriesBuilder.setNotSourceLocationsCountry(notSourceLocationsCountry);
timeSeriesBuilder.setSourceLocationsState(sourceLocationsState);
timeSeriesBuilder.setNotSourceLocationsState(notSourceLocationsState);
timeSeriesBuilder.setSourceLocationsCity(sourceLocationsCity);
timeSeriesBuilder.setNotSourceLocationsCity(notSourceLocationsCity);
timeSeriesBuilder.setSourceScopesCountry(sourceScopesCountry);
timeSeriesBuilder.setNotSourceScopesCountry(notSourceScopesCountry);
timeSeriesBuilder.setSourceScopesState(sourceScopesState);
timeSeriesBuilder.setNotSourceScopesState(notSourceScopesState);
timeSeriesBuilder.setSourceScopesCity(sourceScopesCity);
timeSeriesBuilder.setNotSourceScopesCity(notSourceScopesCity);
timeSeriesBuilder.setSourceScopesLevel(sourceScopesLevel);
timeSeriesBuilder.setNotSourceScopesLevel(notSourceScopesLevel);
timeSeriesBuilder.setSourceLinksInCountMin(sourceLinksInCountMin);
timeSeriesBuilder.setSourceLinksInCountMax(sourceLinksInCountMax);
timeSeriesBuilder.setSourceRankingsAlexaRankMin(sourceRankingsAlexaRankMin);
timeSeriesBuilder.setSourceRankingsAlexaRankMax(sourceRankingsAlexaRankMax);
timeSeriesBuilder.setSourceRankingsAlexaCountry(sourceRankingsAlexaCountry);
timeSeriesBuilder.setSocialSharesCountFacebookMin(socialSharesCountFacebookMin);
timeSeriesBuilder.setSocialSharesCountFacebookMax(socialSharesCountFacebookMax);
timeSeriesBuilder.setSocialSharesCountGooglePlusMin(socialSharesCountGooglePlusMin);
timeSeriesBuilder.setSocialSharesCountGooglePlusMax(socialSharesCountGooglePlusMax);
timeSeriesBuilder.setSocialSharesCountLinkedinMin(socialSharesCountLinkedinMin);
timeSeriesBuilder.setSocialSharesCountLinkedinMax(socialSharesCountLinkedinMax);
timeSeriesBuilder.setSocialSharesCountRedditMin(socialSharesCountRedditMin);
timeSeriesBuilder.setSocialSharesCountRedditMax(socialSharesCountRedditMax);
timeSeriesBuilder.setPublishedAtStart(publishedAtStart);
timeSeriesBuilder.setPublishedAtEnd(publishedAtEnd);
timeSeriesBuilder.setPeriod(period);

try {
    TimeSeriesList result = apiInstance.listTimeSeries(timeSeriesBuilder.build());
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listTimeSeries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **List&lt;Long&gt;**| This parameter is used for finding stories by story id. | [optional]
 **notId** | **List&lt;Long&gt;**| This parameter is used for excluding stories by story id. | [optional]
 **title** | **String**| This parameter is used for finding stories whose title contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). | [optional]
 **body** | **String**| This parameter is used for finding stories whose body contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). | [optional]
 **text** | **String**| This parameter is used for finding stories whose title or body contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). | [optional]
 **language** | **List&lt;String&gt;**| This parameter is used for finding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes. | [optional] [enum: en, de, fr, it, es, pt]
 **notLanguage** | **List&lt;String&gt;**| This parameter is used for excluding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes. | [optional] [enum: en, de, fr, it, es, pt]
 **categoriesTaxonomy** | **String**| This parameter is used for defining the type of the taxonomy for the rest of the categories queries. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). | [optional] [enum: iab-qag, iptc-subjectcode]
 **categoriesConfident** | **Boolean**| This parameter is used for finding stories whose categories are confident. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). | [optional] [default to true]
 **categoriesId** | **List&lt;String&gt;**| This parameter is used for finding stories by categories id. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). | [optional]
 **notCategoriesId** | **List&lt;String&gt;**| This parameter is used for excluding stories by categories id. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). | [optional]
 **categoriesLevel** | **List&lt;Integer&gt;**| This parameter is used for finding stories by categories level. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). | [optional]
 **notCategoriesLevel** | **List&lt;Integer&gt;**| This parameter is used for excluding stories by categories level. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). | [optional]
 **entitiesTitleText** | **List&lt;String&gt;**| This parameter is used to find stories based on the specified entities &#x60;text&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **notEntitiesTitleText** | **List&lt;String&gt;**| This parameter is used to exclude stories based on the specified entities &#x60;text&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **entitiesTitleType** | **List&lt;String&gt;**| This parameter is used to find stories based on the specified entities &#x60;type&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **notEntitiesTitleType** | **List&lt;String&gt;**| This parameter is used to exclude stories based on the specified entities &#x60;type&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **entitiesTitleLinksDbpedia** | **List&lt;String&gt;**| This parameter is used to find stories based on the specified entities dbpedia URL in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **notEntitiesTitleLinksDbpedia** | **List&lt;String&gt;**| This parameter is used to exclude stories based on the specified entities dbpedia URL in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **entitiesBodyText** | **List&lt;String&gt;**| This parameter is used to find stories based on the specified entities &#x60;text&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **notEntitiesBodyText** | **List&lt;String&gt;**| This parameter is used to exclude stories based on the specified entities &#x60;text&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **entitiesBodyType** | **List&lt;String&gt;**| This parameter is used to find stories based on the specified entities &#x60;type&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **notEntitiesBodyType** | **List&lt;String&gt;**| This parameter is used to exclude stories based on the specified entities &#x60;type&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **entitiesBodyLinksDbpedia** | **List&lt;String&gt;**| This parameter is used to find stories based on the specified entities dbpedia URL in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **notEntitiesBodyLinksDbpedia** | **List&lt;String&gt;**| This parameter is used to exclude stories based on the specified entities dbpedia URL in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **sentimentTitlePolarity** | **String**| This parameter is used for finding stories whose title sentiment is the specified value. | [optional] [enum: positive, neutral, negative]
 **notSentimentTitlePolarity** | **String**| This parameter is used for excluding stories whose title sentiment is the specified value. | [optional] [enum: positive, neutral, negative]
 **sentimentBodyPolarity** | **String**| This parameter is used for finding stories whose body sentiment is the specified value. | [optional] [enum: positive, neutral, negative]
 **notSentimentBodyPolarity** | **String**| This parameter is used for excluding stories whose body sentiment is the specified value. | [optional] [enum: positive, neutral, negative]
 **mediaImagesCountMin** | **Integer**| This parameter is used for finding stories whose number of images is greater than or equal to the specified value. | [optional]
 **mediaImagesCountMax** | **Integer**| This parameter is used for finding stories whose number of images is less than or equal to the specified value. | [optional]
 **mediaImagesWidthMin** | **Integer**| This parameter is used for finding stories whose width of images are greater than or equal to the specified value. | [optional]
 **mediaImagesWidthMax** | **Integer**| This parameter is used for finding stories whose width of images are less than or equal to the specified value. | [optional]
 **mediaImagesHeightMin** | **Integer**| This parameter is used for finding stories whose height of images are greater than or equal to the specified value. | [optional]
 **mediaImagesHeightMax** | **Integer**| This parameter is used for finding stories whose height of images are less than or equal to the specified value. | [optional]
 **mediaImagesContentLengthMin** | **Integer**| This parameter is used for finding stories whose images content length are greater than or equal to the specified value. | [optional]
 **mediaImagesContentLengthMax** | **Integer**| This parameter is used for finding stories whose images content length are less than or equal to the specified value. | [optional]
 **mediaImagesFormat** | **List&lt;String&gt;**| This parameter is used for finding stories whose images format are the specified value. | [optional] [enum: BMP, GIF, JPEG, PNG, TIFF, PSD, ICO, CUR, WEBP, SVG]
 **notMediaImagesFormat** | **List&lt;String&gt;**| This parameter is used for excluding stories whose images format are the specified value. | [optional] [enum: BMP, GIF, JPEG, PNG, TIFF, PSD, ICO, CUR, WEBP, SVG]
 **mediaVideosCountMin** | **Integer**| This parameter is used for finding stories whose number of videos is greater than or equal to the specified value. | [optional]
 **mediaVideosCountMax** | **Integer**| This parameter is used for finding stories whose number of videos is less than or equal to the specified value. | [optional]
 **authorId** | **List&lt;Integer&gt;**| This parameter is used for finding stories whose author id is the specified value. | [optional]
 **notAuthorId** | **List&lt;Integer&gt;**| This parameter is used for excluding stories whose author id is the specified value. | [optional]
 **authorName** | **String**| This parameter is used for finding stories whose author full name contains the specified value. | [optional]
 **notAuthorName** | **String**| This parameter is used for excluding stories whose author full name contains the specified value. | [optional]
 **sourceId** | **List&lt;Integer&gt;**| This parameter is used for finding stories whose source id is the specified value. | [optional]
 **notSourceId** | **List&lt;Integer&gt;**| This parameter is used for excluding stories whose source id is the specified value. | [optional]
 **sourceName** | **List&lt;String&gt;**| This parameter is used for finding stories whose source name contains the specified value. | [optional]
 **notSourceName** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source name contains the specified value. | [optional]
 **sourceDomain** | **List&lt;String&gt;**| This parameter is used for finding stories whose source domain is the specified value. | [optional]
 **notSourceDomain** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source domain is the specified value. | [optional]
 **sourceLocationsCountry** | **List&lt;String&gt;**| This parameter is used for finding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **notSourceLocationsCountry** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **sourceLocationsState** | **List&lt;String&gt;**| This parameter is used for finding stories whose source state/province is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **notSourceLocationsState** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source state/province is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **sourceLocationsCity** | **List&lt;String&gt;**| This parameter is used for finding stories whose source city is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **notSourceLocationsCity** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source city is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **sourceScopesCountry** | **List&lt;String&gt;**| This parameter is used for finding stories whose source scopes is the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **notSourceScopesCountry** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source scopes is the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **sourceScopesState** | **List&lt;String&gt;**| This parameter is used for finding stories whose source scopes is the specified state/province value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **notSourceScopesState** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source scopes is the specified state/province value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **sourceScopesCity** | **List&lt;String&gt;**| This parameter is used for finding stories whose source scopes is the specified city value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **notSourceScopesCity** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source scopes is the specified city value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **sourceScopesLevel** | **List&lt;String&gt;**| This parameter is used for finding stories whose source scopes is the specified level value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional] [enum: international, national, local]
 **notSourceScopesLevel** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source scopes is the specified level value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional] [enum: international, national, local]
 **sourceLinksInCountMin** | **Integer**| This parameter is used for finding stories from sources whose Links in count is greater than or equal to the specified value. You can read more about working with Links in count [here](https://newsapi.aylien.com/docs/working-with-links-in-count). | [optional]
 **sourceLinksInCountMax** | **Integer**| This parameter is used for finding stories from sources whose Links in count is less than or equal to the specified value. You can read more about working with Links in count [here](https://newsapi.aylien.com/docs/working-with-links-in-count). | [optional]
 **sourceRankingsAlexaRankMin** | **Integer**| This parameter is used for finding stories from sources whose Alexa rank is greater than or equal to the specified value. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks). | [optional]
 **sourceRankingsAlexaRankMax** | **Integer**| This parameter is used for finding stories from sources whose Alexa rank is less than or equal to the specified value. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks). | [optional]
 **sourceRankingsAlexaCountry** | **List&lt;String&gt;**| This parameter is used for finding stories from sources whose Alexa rank is in the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks). | [optional]
 **socialSharesCountFacebookMin** | **Integer**| This parameter is used for finding stories whose Facebook social shares count is greater than or equal to the specified value. | [optional]
 **socialSharesCountFacebookMax** | **Integer**| This parameter is used for finding stories whose Facebook social shares count is less than or equal to the specified value. | [optional]
 **socialSharesCountGooglePlusMin** | **Integer**| This parameter is used for finding stories whose Google+ social shares count is greater than or equal to the specified value. | [optional]
 **socialSharesCountGooglePlusMax** | **Integer**| This parameter is used for finding stories whose Google+ social shares count is less than or equal to the specified value. | [optional]
 **socialSharesCountLinkedinMin** | **Integer**| This parameter is used for finding stories whose LinkedIn social shares count is greater than or equal to the specified value. | [optional]
 **socialSharesCountLinkedinMax** | **Integer**| This parameter is used for finding stories whose LinkedIn social shares count is less than or equal to the specified value. | [optional]
 **socialSharesCountRedditMin** | **Integer**| This parameter is used for finding stories whose Reddit social shares count is greater than or equal to the specified value. | [optional]
 **socialSharesCountRedditMax** | **Integer**| This parameter is used for finding stories whose Reddit social shares count is less than or equal to the specified value. | [optional]
 **publishedAtStart** | **String**| This parameter is used for finding stories whose published at time is less than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates). | [optional] [default to NOW-7DAYS/DAY]
 **publishedAtEnd** | **String**| This parameter is used for finding stories whose published at time is greater than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates). | [optional] [default to NOW/DAY]
 **period** | **String**| The size of each date range is expressed as an interval to be added to the lower bound. It supports Date Math Syntax. Valid options are &#x60;+&#x60; following an integer number greater than 0 and one of the Date Math keywords. e.g. &#x60;+1DAY&#x60;, &#x60;+2MINUTES&#x60; and &#x60;+1MONTH&#x60;. Here are [Supported keywords](https://newsapi.aylien.com/docs/working-with-dates#date-math). | [optional] [default to +1DAY]

### Return type

[**TimeSeriesList**](TimeSeriesList.md)

### Authorization

[app_key](../README.md#app_key), [app_id](../README.md#app_id)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json, text/xml

<a name="listTrends"></a>
# **listTrends**
> Trends listTrends(trendsParams)

List trends

This endpoint is used for finding trends based on stories.

### Example
```java
import com.aylien.newsapi.*;
import com.aylien.newsapi.auth.*;
import com.aylien.newsapi.models.*;
import com.aylien.newsapi.parameters.*;
import com.aylien.newsapi.api.DefaultApi;

import java.util.*;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: app_id
ApiKeyAuth app_id = (ApiKeyAuth) defaultClient.getAuthentication("app_id");
app_id.setApiKey("YOUR_APP_ID");

// Configure API key authorization: app_key
ApiKeyAuth app_key = (ApiKeyAuth) defaultClient.getAuthentication("app_key");
app_key.setApiKey("YOUR_APP_KEY");

DefaultApi apiInstance = new DefaultApi();

String field = "field_example";
List<Long> id = Arrays.asList(56L);
List<Long> notId = Arrays.asList(56L);
String title = "title_example";
String body = "body_example";
String text = "text_example";
List<String> language = Arrays.asList("language_example");
List<String> notLanguage = Arrays.asList("notLanguage_example");
String publishedAtStart = "publishedAtStart_example";
String publishedAtEnd = "publishedAtEnd_example";
String categoriesTaxonomy = "categoriesTaxonomy_example";
Boolean categoriesConfident = true;
List<String> categoriesId = Arrays.asList("categoriesId_example");
List<String> notCategoriesId = Arrays.asList("notCategoriesId_example");
List<Integer> categoriesLevel = Arrays.asList(56);
List<Integer> notCategoriesLevel = Arrays.asList(56);
List<String> entitiesTitleText = Arrays.asList("entitiesTitleText_example");
List<String> notEntitiesTitleText = Arrays.asList("notEntitiesTitleText_example");
List<String> entitiesTitleType = Arrays.asList("entitiesTitleType_example");
List<String> notEntitiesTitleType = Arrays.asList("notEntitiesTitleType_example");
List<String> entitiesTitleLinksDbpedia = Arrays.asList("entitiesTitleLinksDbpedia_example");
List<String> notEntitiesTitleLinksDbpedia = Arrays.asList("notEntitiesTitleLinksDbpedia_example");
List<String> entitiesBodyText = Arrays.asList("entitiesBodyText_example");
List<String> notEntitiesBodyText = Arrays.asList("notEntitiesBodyText_example");
List<String> entitiesBodyType = Arrays.asList("entitiesBodyType_example");
List<String> notEntitiesBodyType = Arrays.asList("notEntitiesBodyType_example");
List<String> entitiesBodyLinksDbpedia = Arrays.asList("entitiesBodyLinksDbpedia_example");
List<String> notEntitiesBodyLinksDbpedia = Arrays.asList("notEntitiesBodyLinksDbpedia_example");
String sentimentTitlePolarity = "sentimentTitlePolarity_example";
String notSentimentTitlePolarity = "notSentimentTitlePolarity_example";
String sentimentBodyPolarity = "sentimentBodyPolarity_example";
String notSentimentBodyPolarity = "notSentimentBodyPolarity_example";
Integer mediaImagesCountMin = 56;
Integer mediaImagesCountMax = 56;
Integer mediaImagesWidthMin = 56;
Integer mediaImagesWidthMax = 56;
Integer mediaImagesHeightMin = 56;
Integer mediaImagesHeightMax = 56;
Integer mediaImagesContentLengthMin = 56;
Integer mediaImagesContentLengthMax = 56;
List<String> mediaImagesFormat = Arrays.asList("mediaImagesFormat_example");
List<String> notMediaImagesFormat = Arrays.asList("notMediaImagesFormat_example");
Integer mediaVideosCountMin = 56;
Integer mediaVideosCountMax = 56;
List<Integer> authorId = Arrays.asList(56);
List<Integer> notAuthorId = Arrays.asList(56);
String authorName = "authorName_example";
String notAuthorName = "notAuthorName_example";
List<Integer> sourceId = Arrays.asList(56);
List<Integer> notSourceId = Arrays.asList(56);
List<String> sourceName = Arrays.asList("sourceName_example");
List<String> notSourceName = Arrays.asList("notSourceName_example");
List<String> sourceDomain = Arrays.asList("sourceDomain_example");
List<String> notSourceDomain = Arrays.asList("notSourceDomain_example");
List<String> sourceLocationsCountry = Arrays.asList("sourceLocationsCountry_example");
List<String> notSourceLocationsCountry = Arrays.asList("notSourceLocationsCountry_example");
List<String> sourceLocationsState = Arrays.asList("sourceLocationsState_example");
List<String> notSourceLocationsState = Arrays.asList("notSourceLocationsState_example");
List<String> sourceLocationsCity = Arrays.asList("sourceLocationsCity_example");
List<String> notSourceLocationsCity = Arrays.asList("notSourceLocationsCity_example");
List<String> sourceScopesCountry = Arrays.asList("sourceScopesCountry_example");
List<String> notSourceScopesCountry = Arrays.asList("notSourceScopesCountry_example");
List<String> sourceScopesState = Arrays.asList("sourceScopesState_example");
List<String> notSourceScopesState = Arrays.asList("notSourceScopesState_example");
List<String> sourceScopesCity = Arrays.asList("sourceScopesCity_example");
List<String> notSourceScopesCity = Arrays.asList("notSourceScopesCity_example");
List<String> sourceScopesLevel = Arrays.asList("sourceScopesLevel_example");
List<String> notSourceScopesLevel = Arrays.asList("notSourceScopesLevel_example");
Integer sourceLinksInCountMin = 56;
Integer sourceLinksInCountMax = 56;
Integer sourceRankingsAlexaRankMin = 56;
Integer sourceRankingsAlexaRankMax = 56;
List<String> sourceRankingsAlexaCountry = Arrays.asList("sourceRankingsAlexaCountry_example");
Integer socialSharesCountFacebookMin = 56;
Integer socialSharesCountFacebookMax = 56;
Integer socialSharesCountGooglePlusMin = 56;
Integer socialSharesCountGooglePlusMax = 56;
Integer socialSharesCountLinkedinMin = 56;
Integer socialSharesCountLinkedinMax = 56;
Integer socialSharesCountRedditMin = 56;
Integer socialSharesCountRedditMax = 56;

TrendsParams.Builder trendsBuilder = TrendsParams.newBuilder();

trendsBuilder.setField(field);
trendsBuilder.setId(id);
trendsBuilder.setNotId(notId);
trendsBuilder.setTitle(title);
trendsBuilder.setBody(body);
trendsBuilder.setText(text);
trendsBuilder.setLanguage(language);
trendsBuilder.setNotLanguage(notLanguage);
trendsBuilder.setPublishedAtStart(publishedAtStart);
trendsBuilder.setPublishedAtEnd(publishedAtEnd);
trendsBuilder.setCategoriesTaxonomy(categoriesTaxonomy);
trendsBuilder.setCategoriesConfident(categoriesConfident);
trendsBuilder.setCategoriesId(categoriesId);
trendsBuilder.setNotCategoriesId(notCategoriesId);
trendsBuilder.setCategoriesLevel(categoriesLevel);
trendsBuilder.setNotCategoriesLevel(notCategoriesLevel);
trendsBuilder.setEntitiesTitleText(entitiesTitleText);
trendsBuilder.setNotEntitiesTitleText(notEntitiesTitleText);
trendsBuilder.setEntitiesTitleType(entitiesTitleType);
trendsBuilder.setNotEntitiesTitleType(notEntitiesTitleType);
trendsBuilder.setEntitiesTitleLinksDbpedia(entitiesTitleLinksDbpedia);
trendsBuilder.setNotEntitiesTitleLinksDbpedia(notEntitiesTitleLinksDbpedia);
trendsBuilder.setEntitiesBodyText(entitiesBodyText);
trendsBuilder.setNotEntitiesBodyText(notEntitiesBodyText);
trendsBuilder.setEntitiesBodyType(entitiesBodyType);
trendsBuilder.setNotEntitiesBodyType(notEntitiesBodyType);
trendsBuilder.setEntitiesBodyLinksDbpedia(entitiesBodyLinksDbpedia);
trendsBuilder.setNotEntitiesBodyLinksDbpedia(notEntitiesBodyLinksDbpedia);
trendsBuilder.setSentimentTitlePolarity(sentimentTitlePolarity);
trendsBuilder.setNotSentimentTitlePolarity(notSentimentTitlePolarity);
trendsBuilder.setSentimentBodyPolarity(sentimentBodyPolarity);
trendsBuilder.setNotSentimentBodyPolarity(notSentimentBodyPolarity);
trendsBuilder.setMediaImagesCountMin(mediaImagesCountMin);
trendsBuilder.setMediaImagesCountMax(mediaImagesCountMax);
trendsBuilder.setMediaImagesWidthMin(mediaImagesWidthMin);
trendsBuilder.setMediaImagesWidthMax(mediaImagesWidthMax);
trendsBuilder.setMediaImagesHeightMin(mediaImagesHeightMin);
trendsBuilder.setMediaImagesHeightMax(mediaImagesHeightMax);
trendsBuilder.setMediaImagesContentLengthMin(mediaImagesContentLengthMin);
trendsBuilder.setMediaImagesContentLengthMax(mediaImagesContentLengthMax);
trendsBuilder.setMediaImagesFormat(mediaImagesFormat);
trendsBuilder.setNotMediaImagesFormat(notMediaImagesFormat);
trendsBuilder.setMediaVideosCountMin(mediaVideosCountMin);
trendsBuilder.setMediaVideosCountMax(mediaVideosCountMax);
trendsBuilder.setAuthorId(authorId);
trendsBuilder.setNotAuthorId(notAuthorId);
trendsBuilder.setAuthorName(authorName);
trendsBuilder.setNotAuthorName(notAuthorName);
trendsBuilder.setSourceId(sourceId);
trendsBuilder.setNotSourceId(notSourceId);
trendsBuilder.setSourceName(sourceName);
trendsBuilder.setNotSourceName(notSourceName);
trendsBuilder.setSourceDomain(sourceDomain);
trendsBuilder.setNotSourceDomain(notSourceDomain);
trendsBuilder.setSourceLocationsCountry(sourceLocationsCountry);
trendsBuilder.setNotSourceLocationsCountry(notSourceLocationsCountry);
trendsBuilder.setSourceLocationsState(sourceLocationsState);
trendsBuilder.setNotSourceLocationsState(notSourceLocationsState);
trendsBuilder.setSourceLocationsCity(sourceLocationsCity);
trendsBuilder.setNotSourceLocationsCity(notSourceLocationsCity);
trendsBuilder.setSourceScopesCountry(sourceScopesCountry);
trendsBuilder.setNotSourceScopesCountry(notSourceScopesCountry);
trendsBuilder.setSourceScopesState(sourceScopesState);
trendsBuilder.setNotSourceScopesState(notSourceScopesState);
trendsBuilder.setSourceScopesCity(sourceScopesCity);
trendsBuilder.setNotSourceScopesCity(notSourceScopesCity);
trendsBuilder.setSourceScopesLevel(sourceScopesLevel);
trendsBuilder.setNotSourceScopesLevel(notSourceScopesLevel);
trendsBuilder.setSourceLinksInCountMin(sourceLinksInCountMin);
trendsBuilder.setSourceLinksInCountMax(sourceLinksInCountMax);
trendsBuilder.setSourceRankingsAlexaRankMin(sourceRankingsAlexaRankMin);
trendsBuilder.setSourceRankingsAlexaRankMax(sourceRankingsAlexaRankMax);
trendsBuilder.setSourceRankingsAlexaCountry(sourceRankingsAlexaCountry);
trendsBuilder.setSocialSharesCountFacebookMin(socialSharesCountFacebookMin);
trendsBuilder.setSocialSharesCountFacebookMax(socialSharesCountFacebookMax);
trendsBuilder.setSocialSharesCountGooglePlusMin(socialSharesCountGooglePlusMin);
trendsBuilder.setSocialSharesCountGooglePlusMax(socialSharesCountGooglePlusMax);
trendsBuilder.setSocialSharesCountLinkedinMin(socialSharesCountLinkedinMin);
trendsBuilder.setSocialSharesCountLinkedinMax(socialSharesCountLinkedinMax);
trendsBuilder.setSocialSharesCountRedditMin(socialSharesCountRedditMin);
trendsBuilder.setSocialSharesCountRedditMax(socialSharesCountRedditMax);

try {
    Trends result = apiInstance.listTrends(trendsBuilder.build());
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listTrends");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **field** | **String**| This parameter is used to specify the trend field. | [enum: author.name, source.name, source.domain, keywords, entities.title.text, entities.title.type, entities.title.links.dbpedia, entities.body.text, entities.body.type, entities.body.links.dbpedia, hashtags, categories.id, sentiment.title.polarity, sentiment.body.polarity]
 **id** | **List&lt;Long&gt;**| This parameter is used for finding stories by story id. | [optional]
 **notId** | **List&lt;Long&gt;**| This parameter is used for excluding stories by story id. | [optional]
 **title** | **String**| This parameter is used for finding stories whose title contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). | [optional]
 **body** | **String**| This parameter is used for finding stories whose body contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). | [optional]
 **text** | **String**| This parameter is used for finding stories whose title or body contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). | [optional]
 **language** | **List&lt;String&gt;**| This parameter is used for finding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes. | [optional] [enum: en, de, fr, it, es, pt]
 **notLanguage** | **List&lt;String&gt;**| This parameter is used for excluding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes. | [optional] [enum: en, de, fr, it, es, pt]
 **publishedAtStart** | **String**| This parameter is used for finding stories whose published at time is greater than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates). | [optional]
 **publishedAtEnd** | **String**| This parameter is used for finding stories whose published at time is less than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates). | [optional]
 **categoriesTaxonomy** | **String**| This parameter is used for defining the type of the taxonomy for the rest of the categories queries. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). | [optional] [enum: iab-qag, iptc-subjectcode]
 **categoriesConfident** | **Boolean**| This parameter is used for finding stories whose categories are confident. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). | [optional] [default to true]
 **categoriesId** | **List&lt;String&gt;**| This parameter is used for finding stories by categories id. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). | [optional]
 **notCategoriesId** | **List&lt;String&gt;**| This parameter is used for excluding stories by categories id. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). | [optional]
 **categoriesLevel** | **List&lt;Integer&gt;**| This parameter is used for finding stories by categories level. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). | [optional]
 **notCategoriesLevel** | **List&lt;Integer&gt;**| This parameter is used for excluding stories by categories level. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). | [optional]
 **entitiesTitleText** | **List&lt;String&gt;**| This parameter is used to find stories based on the specified entities &#x60;text&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **notEntitiesTitleText** | **List&lt;String&gt;**| This parameter is used to exclude stories based on the specified entities &#x60;text&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **entitiesTitleType** | **List&lt;String&gt;**| This parameter is used to find stories based on the specified entities &#x60;type&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **notEntitiesTitleType** | **List&lt;String&gt;**| This parameter is used to exclude stories based on the specified entities &#x60;type&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **entitiesTitleLinksDbpedia** | **List&lt;String&gt;**| This parameter is used to find stories based on the specified entities dbpedia URL in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **notEntitiesTitleLinksDbpedia** | **List&lt;String&gt;**| This parameter is used to exclude stories based on the specified entities dbpedia URL in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **entitiesBodyText** | **List&lt;String&gt;**| This parameter is used to find stories based on the specified entities &#x60;text&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **notEntitiesBodyText** | **List&lt;String&gt;**| This parameter is used to exclude stories based on the specified entities &#x60;text&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **entitiesBodyType** | **List&lt;String&gt;**| This parameter is used to find stories based on the specified entities &#x60;type&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **notEntitiesBodyType** | **List&lt;String&gt;**| This parameter is used to exclude stories based on the specified entities &#x60;type&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **entitiesBodyLinksDbpedia** | **List&lt;String&gt;**| This parameter is used to find stories based on the specified entities dbpedia URL in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **notEntitiesBodyLinksDbpedia** | **List&lt;String&gt;**| This parameter is used to exclude stories based on the specified entities dbpedia URL in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). | [optional]
 **sentimentTitlePolarity** | **String**| This parameter is used for finding stories whose title sentiment is the specified value. | [optional] [enum: positive, neutral, negative]
 **notSentimentTitlePolarity** | **String**| This parameter is used for excluding stories whose title sentiment is the specified value. | [optional] [enum: positive, neutral, negative]
 **sentimentBodyPolarity** | **String**| This parameter is used for finding stories whose body sentiment is the specified value. | [optional] [enum: positive, neutral, negative]
 **notSentimentBodyPolarity** | **String**| This parameter is used for excluding stories whose body sentiment is the specified value. | [optional] [enum: positive, neutral, negative]
 **mediaImagesCountMin** | **Integer**| This parameter is used for finding stories whose number of images is greater than or equal to the specified value. | [optional]
 **mediaImagesCountMax** | **Integer**| This parameter is used for finding stories whose number of images is less than or equal to the specified value. | [optional]
 **mediaImagesWidthMin** | **Integer**| This parameter is used for finding stories whose width of images are greater than or equal to the specified value. | [optional]
 **mediaImagesWidthMax** | **Integer**| This parameter is used for finding stories whose width of images are less than or equal to the specified value. | [optional]
 **mediaImagesHeightMin** | **Integer**| This parameter is used for finding stories whose height of images are greater than or equal to the specified value. | [optional]
 **mediaImagesHeightMax** | **Integer**| This parameter is used for finding stories whose height of images are less than or equal to the specified value. | [optional]
 **mediaImagesContentLengthMin** | **Integer**| This parameter is used for finding stories whose images content length are greater than or equal to the specified value. | [optional]
 **mediaImagesContentLengthMax** | **Integer**| This parameter is used for finding stories whose images content length are less than or equal to the specified value. | [optional]
 **mediaImagesFormat** | **List&lt;String&gt;**| This parameter is used for finding stories whose images format are the specified value. | [optional] [enum: BMP, GIF, JPEG, PNG, TIFF, PSD, ICO, CUR, WEBP, SVG]
 **notMediaImagesFormat** | **List&lt;String&gt;**| This parameter is used for excluding stories whose images format are the specified value. | [optional] [enum: BMP, GIF, JPEG, PNG, TIFF, PSD, ICO, CUR, WEBP, SVG]
 **mediaVideosCountMin** | **Integer**| This parameter is used for finding stories whose number of videos is greater than or equal to the specified value. | [optional]
 **mediaVideosCountMax** | **Integer**| This parameter is used for finding stories whose number of videos is less than or equal to the specified value. | [optional]
 **authorId** | **List&lt;Integer&gt;**| This parameter is used for finding stories whose author id is the specified value. | [optional]
 **notAuthorId** | **List&lt;Integer&gt;**| This parameter is used for excluding stories whose author id is the specified value. | [optional]
 **authorName** | **String**| This parameter is used for finding stories whose author full name contains the specified value. | [optional]
 **notAuthorName** | **String**| This parameter is used for excluding stories whose author full name contains the specified value. | [optional]
 **sourceId** | **List&lt;Integer&gt;**| This parameter is used for finding stories whose source id is the specified value. | [optional]
 **notSourceId** | **List&lt;Integer&gt;**| This parameter is used for excluding stories whose source id is the specified value. | [optional]
 **sourceName** | **List&lt;String&gt;**| This parameter is used for finding stories whose source name contains the specified value. | [optional]
 **notSourceName** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source name contains the specified value. | [optional]
 **sourceDomain** | **List&lt;String&gt;**| This parameter is used for finding stories whose source domain is the specified value. | [optional]
 **notSourceDomain** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source domain is the specified value. | [optional]
 **sourceLocationsCountry** | **List&lt;String&gt;**| This parameter is used for finding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **notSourceLocationsCountry** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **sourceLocationsState** | **List&lt;String&gt;**| This parameter is used for finding stories whose source state/province is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **notSourceLocationsState** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source state/province is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **sourceLocationsCity** | **List&lt;String&gt;**| This parameter is used for finding stories whose source city is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **notSourceLocationsCity** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source city is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **sourceScopesCountry** | **List&lt;String&gt;**| This parameter is used for finding stories whose source scopes is the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **notSourceScopesCountry** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source scopes is the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **sourceScopesState** | **List&lt;String&gt;**| This parameter is used for finding stories whose source scopes is the specified state/province value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **notSourceScopesState** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source scopes is the specified state/province value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **sourceScopesCity** | **List&lt;String&gt;**| This parameter is used for finding stories whose source scopes is the specified city value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **notSourceScopesCity** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source scopes is the specified city value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional]
 **sourceScopesLevel** | **List&lt;String&gt;**| This parameter is used for finding stories whose source scopes is the specified level value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional] [enum: international, national, local]
 **notSourceScopesLevel** | **List&lt;String&gt;**| This parameter is used for excluding stories whose source scopes is the specified level value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). | [optional] [enum: international, national, local]
 **sourceLinksInCountMin** | **Integer**| This parameter is used for finding stories from sources whose Links in count is greater than or equal to the specified value. You can read more about working with Links in count [here](https://newsapi.aylien.com/docs/working-with-links-in-count). | [optional]
 **sourceLinksInCountMax** | **Integer**| This parameter is used for finding stories from sources whose Links in count is less than or equal to the specified value. You can read more about working with Links in count [here](https://newsapi.aylien.com/docs/working-with-links-in-count). | [optional]
 **sourceRankingsAlexaRankMin** | **Integer**| This parameter is used for finding stories from sources whose Alexa rank is greater than or equal to the specified value. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks). | [optional]
 **sourceRankingsAlexaRankMax** | **Integer**| This parameter is used for finding stories from sources whose Alexa rank is less than or equal to the specified value. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks). | [optional]
 **sourceRankingsAlexaCountry** | **List&lt;String&gt;**| This parameter is used for finding stories from sources whose Alexa rank is in the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks). | [optional]
 **socialSharesCountFacebookMin** | **Integer**| This parameter is used for finding stories whose Facebook social shares count is greater than or equal to the specified value. | [optional]
 **socialSharesCountFacebookMax** | **Integer**| This parameter is used for finding stories whose Facebook social shares count is less than or equal to the specified value. | [optional]
 **socialSharesCountGooglePlusMin** | **Integer**| This parameter is used for finding stories whose Google+ social shares count is greater than or equal to the specified value. | [optional]
 **socialSharesCountGooglePlusMax** | **Integer**| This parameter is used for finding stories whose Google+ social shares count is less than or equal to the specified value. | [optional]
 **socialSharesCountLinkedinMin** | **Integer**| This parameter is used for finding stories whose LinkedIn social shares count is greater than or equal to the specified value. | [optional]
 **socialSharesCountLinkedinMax** | **Integer**| This parameter is used for finding stories whose LinkedIn social shares count is less than or equal to the specified value. | [optional]
 **socialSharesCountRedditMin** | **Integer**| This parameter is used for finding stories whose Reddit social shares count is greater than or equal to the specified value. | [optional]
 **socialSharesCountRedditMax** | **Integer**| This parameter is used for finding stories whose Reddit social shares count is less than or equal to the specified value. | [optional]

### Return type

[**Trends**](Trends.md)

### Authorization

[app_key](../README.md#app_key), [app_id](../README.md#app_id)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json, text/xml

