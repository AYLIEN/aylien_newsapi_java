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
> Autocompletes listAutocompletes(AutocompletesParams autocompletesParams)

List autocompletes

This endpoint is used for getting list of autocompletes by providing a specific term and type.

### Example
```java
// Import classes:
import com.aylien.newsapi.*;
import com.aylien.newsapi.auth.*;
import com.aylien.newsapi.models.*;
import com.aylien.newsapi.parameters.*;
import com.aylien.newsapi.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: app_id
ApiKeyAuth app_id = (ApiKeyAuth) defaultClient.getAuthentication("app_id");
app_id.setApiKey("YOUR APP ID");

// Configure API key authorization: app_key
ApiKeyAuth app_key = (ApiKeyAuth) defaultClient.getAuthentication("app_key");
app_key.setApiKey("YOUR APP KEY");

DefaultApi apiInstance = new DefaultApi();

String type = "type_example"; // String | This parameter is used for defining the type of autocompletes.
String term = "term_example"; // String | This parameter is used for finding autocomplete objects whose contains the specified value.
String language = "en"; // String | This parameter is used for autocompletes whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes.
Integer perPage = 3; // Integer | This parameter is used for specifying number of the items in each page.

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
 **term** | **String**| This parameter is used for finding autocomplete objects whose contains the specified value. |
 **language** | **String**| This parameter is used for autocompletes whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes. | [optional] [default to en] [enum: en, de, fr, it, es, pt]
 **perPage** | **Integer**| This parameter is used for specifying number of the items in each page. | [optional] [default to 3]

### Return type

[**Autocompletes**](Autocompletes.md)

### Authorization

[app_key](../README.md#app_key), [app_id](../README.md#app_id)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json, text/xml

<a name="listCoverages"></a>
# **listCoverages**
> Coverages listCoverages(CoveragesParams coveragesParams)

List coverages

This endpoint is used for finding story coverages based on provided parameters. The number of coverages to return, up to a maximum of 100.

### Example
```java
// Import classes:
import com.aylien.newsapi.*;
import com.aylien.newsapi.auth.*;
import com.aylien.newsapi.models.*;
import com.aylien.newsapi.parameters.*;
import com.aylien.newsapi.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: app_id
ApiKeyAuth app_id = (ApiKeyAuth) defaultClient.getAuthentication("app_id");
app_id.setApiKey("YOUR APP ID");

// Configure API key authorization: app_key
ApiKeyAuth app_key = (ApiKeyAuth) defaultClient.getAuthentication("app_key");
app_key.setApiKey("YOUR APP KEY");

DefaultApi apiInstance = new DefaultApi();

List<Long> id = Arrays.asList(56L); // List<Long> | This parameter is used for finding stroies by story id.
String title = "title_example"; // String | This parameter is used for finding stories whose title contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).
String body = "body_example"; // String | This parameter is used for finding stories whose body contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).
String text = "text_example"; // String | This parameter is used for finding stories whose title or body contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).
List<String> language = Arrays.asList("language_example"); // List<String> | This parameter is used for finding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes.
String publishedAtStart = "publishedAtStart_example"; // String | This parameter is used for finding stories whose published at is greater than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates).
String publishedAtEnd = "publishedAtEnd_example"; // String | This parameter is used for finding stories whose published at is less than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates).
String categoriesTaxonomy = "categoriesTaxonomy_example"; // String | This parameter is used for defining type of the taxonomy for the rest of categories queries.
Boolean categoriesConfident = true; // Boolean | This parameter is used for finding stories whose categories are confident.
List<String> categoriesId = Arrays.asList("categoriesId_example"); // List<String> | This parameter is used for finding stories whose categories id is the specified value.
List<Integer> categoriesLevel = Arrays.asList(56); // List<Integer> | This parameter is used for finding stories whose categories level is the specified value.
List<String> entitiesTitleText = Arrays.asList("entitiesTitleText_example"); // List<String> | This parameter is used for finding stories whose entities text in title is the specified value.
List<String> entitiesTitleType = Arrays.asList("entitiesTitleType_example"); // List<String> | This parameter is used for finding stories whose entities type in title is the specified value.
List<String> entitiesTitleLinksDbpedia = Arrays.asList("entitiesTitleLinksDbpedia_example"); // List<String> | This parameter is used for finding stories whose entities dbpedia url in title is the specified value.
List<String> entitiesBodyText = Arrays.asList("entitiesBodyText_example"); // List<String> | This parameter is used for finding stories whose entities text in body is the specified value.
List<String> entitiesBodyType = Arrays.asList("entitiesBodyType_example"); // List<String> | This parameter is used for finding stories whose entities type in body is the specified value.
List<String> entitiesBodyLinksDbpedia = Arrays.asList("entitiesBodyLinksDbpedia_example"); // List<String> | This parameter is used for finding stories whose entities dbpedia url in body is the specified value.
String sentimentTitlePolarity = "sentimentTitlePolarity_example"; // String | This parameter is used for finding stories whose title sentiment is the specified value.
String sentimentBodyPolarity = "sentimentBodyPolarity_example"; // String | This parameter is used for finding stories whose body sentiment is the specified value.
List<Integer> authorId = Arrays.asList(56); // List<Integer> | This parameter is used for finding stories whose author id is the specified value.
String authorName = "authorName_example"; // String | This parameter is used for finding stories whose author full name contains the specified value.
List<Integer> sourceId = Arrays.asList(56); // List<Integer> | This parameter is used for finding stories whose source id is the specified value.
List<String> sourceName = Arrays.asList("sourceName_example"); // List<String> | This parameter is used for finding stories whose source name contains the specified value.
List<String> sourceDomain = Arrays.asList("sourceDomain_example"); // List<String> | This parameter is used for finding stories whose source domain is the specified value.
List<String> sourceLocationsCountry = Arrays.asList("sourceLocationsCountry_example"); // List<String> | This parameter is used for finding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes.
List<String> sourceLocationsState = Arrays.asList("sourceLocationsState_example"); // List<String> | This parameter is used for finding stories whose source state/province is the specified value.
List<String> sourceLocationsCity = Arrays.asList("sourceLocationsCity_example"); // List<String> | This parameter is used for finding stories whose source city is the specified value.
List<String> sourceScopesCountry = Arrays.asList("sourceScopesCountry_example"); // List<String> | This parameter is used for finding stories whose source scopes country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes.
List<String> sourceScopesState = Arrays.asList("sourceScopesState_example"); // List<String> | This parameter is used for finding stories whose source scopes state/province is the specified value.
List<String> sourceScopesCity = Arrays.asList("sourceScopesCity_example"); // List<String> | This parameter is used for finding stories whose source scopes city is the specified value.
List<String> sourceScopesLevel = Arrays.asList("sourceScopesLevel_example"); // List<String> | This parameter is used for finding stories whose source scopes level is the specified value.
List<String> _return = Arrays.asList("_return_example"); // List<String> | This parameter is used for specifying return fields.
Long storyId = 789L; // Long | A story id
String storyUrl = "storyUrl_example"; // String | An article or webpage
String storyTitle = "storyTitle_example"; // String | Title of the article
String storyBody = "storyBody_example"; // String | Body of the article
DateTime storyPublishedAt = new DateTime(); // DateTime | Publish date of the article. If you use url or title and body for getting coverages, this parameter is required. The format used is a restricted form of the canonical representation of dateTime in the [XML Schema specification (ISO 8601)](https://www.w3.org/TR/xmlschema-2/#dateTime).
String storyLanguage = "auto"; // String | This parameter is used for setting language of the story. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes.
Integer perPage = 3; // Integer | This parameter is used for specifying number of the items in each page.

CoveragesParams.Builder coveragesBuilder = CoveragesParams.newBuilder();

coveragesBuilder.setId(id);
coveragesBuilder.setTitle(title);
coveragesBuilder.setBody(body);
coveragesBuilder.setText(text);
coveragesBuilder.setLanguage(language);
coveragesBuilder.setPublishedAtStart(publishedAtStart);
coveragesBuilder.setPublishedAtEnd(publishedAtEnd);
coveragesBuilder.setCategoriesTaxonomy(categoriesTaxonomy);
coveragesBuilder.setCategoriesConfident(categoriesConfident);
coveragesBuilder.setCategoriesId(categoriesId);
coveragesBuilder.setCategoriesLevel(categoriesLevel);
coveragesBuilder.setEntitiesTitleText(entitiesTitleText);
coveragesBuilder.setEntitiesTitleType(entitiesTitleType);
coveragesBuilder.setEntitiesTitleLinksDbpedia(entitiesTitleLinksDbpedia);
coveragesBuilder.setEntitiesBodyText(entitiesBodyText);
coveragesBuilder.setEntitiesBodyType(entitiesBodyType);
coveragesBuilder.setEntitiesBodyLinksDbpedia(entitiesBodyLinksDbpedia);
coveragesBuilder.setSentimentTitlePolarity(sentimentTitlePolarity);
coveragesBuilder.setSentimentBodyPolarity(sentimentBodyPolarity);
coveragesBuilder.setAuthorId(authorName);
coveragesBuilder.setAuthorName(language);
coveragesBuilder.setSourceId(sourceId);
coveragesBuilder.setSourceName(sourceName);
coveragesBuilder.setSourceDomain(sourceDomain);
coveragesBuilder.setSourceLocationsCountry(sourceLocationsCountry);
coveragesBuilder.setSourceLocationsState(sourceLocationsState);
coveragesBuilder.setSourceLocationsCity(sourceLocationsCity);
coveragesBuilder.setSourceScopesCountry(sourceScopesCountry);
coveragesBuilder.setSourceScopesState(sourceScopesState);
coveragesBuilder.setSourceScopesCity(sourceScopesCity);
coveragesBuilder.setSourceScopesLevel(sourceScopesLevel);
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
 **id** | [**List&lt;Long&gt;**](Long.md)| This parameter is used for finding stroies by story id. | [optional]
 **title** | **String**| This parameter is used for finding stories whose title contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). | [optional]
 **body** | **String**| This parameter is used for finding stories whose body contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). | [optional]
 **text** | **String**| This parameter is used for finding stories whose title or body contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). | [optional]
 **language** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes. | [optional]
 **publishedAtStart** | **String**| This parameter is used for finding stories whose published at is greater than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates). | [optional]
 **publishedAtEnd** | **String**| This parameter is used for finding stories whose published at is less than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates). | [optional]
 **categoriesTaxonomy** | **String**| This parameter is used for defining type of the taxonomy for the rest of categories queries. | [optional] [enum: iab-qag, iptc-subjectcode]
 **categoriesConfident** | **Boolean**| This parameter is used for finding stories whose categories are confident. | [optional] [default to true]
 **categoriesId** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose categories id is the specified value. | [optional]
 **categoriesLevel** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for finding stories whose categories level is the specified value. | [optional]
 **entitiesTitleText** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose entities text in title is the specified value. | [optional]
 **entitiesTitleType** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose entities type in title is the specified value. | [optional]
 **entitiesTitleLinksDbpedia** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose entities dbpedia url in title is the specified value. | [optional]
 **entitiesBodyText** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose entities text in body is the specified value. | [optional]
 **entitiesBodyType** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose entities type in body is the specified value. | [optional]
 **entitiesBodyLinksDbpedia** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose entities dbpedia url in body is the specified value. | [optional]
 **sentimentTitlePolarity** | **String**| This parameter is used for finding stories whose title sentiment is the specified value. | [optional] [enum: positive, neutral, negative]
 **sentimentBodyPolarity** | **String**| This parameter is used for finding stories whose body sentiment is the specified value. | [optional] [enum: positive, neutral, negative]
 **authorId** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for finding stories whose author id is the specified value. | [optional]
 **authorName** | **String**| This parameter is used for finding stories whose author full name contains the specified value. | [optional]
 **sourceId** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for finding stories whose source id is the specified value. | [optional]
 **sourceName** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source name contains the specified value. | [optional]
 **sourceDomain** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source domain is the specified value. | [optional]
 **sourceLocationsCountry** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. | [optional]
 **sourceLocationsState** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source state/province is the specified value. | [optional]
 **sourceLocationsCity** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source city is the specified value. | [optional]
 **sourceScopesCountry** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source scopes country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. | [optional]
 **sourceScopesState** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source scopes state/province is the specified value. | [optional]
 **sourceScopesCity** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source scopes city is the specified value. | [optional]
 **sourceScopesLevel** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source scopes level is the specified value. | [optional]
 **_return** | [**List&lt;String&gt;**](String.md)| This parameter is used for specifying return fields. | [optional]
 **storyId** | **Long**| A story id | [optional]
 **storyUrl** | **String**| An article or webpage | [optional]
 **storyTitle** | **String**| Title of the article | [optional]
 **storyBody** | **String**| Body of the article | [optional]
 **storyPublishedAt** | **DateTime**| Publish date of the article. If you use url or title and body for getting coverages, this parameter is required. The format used is a restricted form of the canonical representation of dateTime in the [XML Schema specification (ISO 8601)](https://www.w3.org/TR/xmlschema-2/#dateTime). | [optional]
 **storyLanguage** | **String**| This parameter is used for setting language of the story. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes. | [optional] [default to auto] [enum: auto, en, de, fr, it, es, pt]
 **perPage** | **Integer**| This parameter is used for specifying number of the items in each page. | [optional] [default to 3]

### Return type

[**Coverages**](Coverages.md)

### Authorization

[app_key](../README.md#app_key), [app_id](../README.md#app_id)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json, text/xml

<a name="listHistograms"></a>
# **listHistograms**
> Histograms listHistograms(HistogramsParams histogramsParams)

List histograms

This endpoint is used for getting histograms based on the field parameter is passed.

### Example
```java
// Import classes:
import com.aylien.newsapi.*;
import com.aylien.newsapi.auth.*;
import com.aylien.newsapi.models.*;
import com.aylien.newsapi.parameters.*;
import com.aylien.newsapi.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: app_id
ApiKeyAuth app_id = (ApiKeyAuth) defaultClient.getAuthentication("app_id");
app_id.setApiKey("YOUR APP ID");

// Configure API key authorization: app_key
ApiKeyAuth app_key = (ApiKeyAuth) defaultClient.getAuthentication("app_key");
app_key.setApiKey("YOUR APP KEY");

DefaultApi apiInstance = new DefaultApi();

List<Long> id = Arrays.asList(56L); // List<Long> | This parameter is used for finding stroies by story id.
String title = "title_example"; // String | This parameter is used for finding stories whose title contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).
String body = "body_example"; // String | This parameter is used for finding stories whose body contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).
String text = "text_example"; // String | This parameter is used for finding stories whose title or body contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).
List<String> language = Arrays.asList("language_example"); // List<String> | This parameter is used for finding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes.
String publishedAtStart = "publishedAtStart_example"; // String | This parameter is used for finding stories whose published at is greater than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates).
String publishedAtEnd = "publishedAtEnd_example"; // String | This parameter is used for finding stories whose published at is less than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates).
String categoriesTaxonomy = "categoriesTaxonomy_example"; // String | This parameter is used for defining type of the taxonomy for the rest of categories queries.
Boolean categoriesConfident = true; // Boolean | This parameter is used for finding stories whose categories are confident.
List<String> categoriesId = Arrays.asList("categoriesId_example"); // List<String> | This parameter is used for finding stories whose categories id is the specified value.
List<Integer> categoriesLevel = Arrays.asList(56); // List<Integer> | This parameter is used for finding stories whose categories level is the specified value.
List<String> entitiesTitleText = Arrays.asList("entitiesTitleText_example"); // List<String> | This parameter is used for finding stories whose entities text in title is the specified value.
List<String> entitiesTitleType = Arrays.asList("entitiesTitleType_example"); // List<String> | This parameter is used for finding stories whose entities type in title is the specified value.
List<String> entitiesTitleLinksDbpedia = Arrays.asList("entitiesTitleLinksDbpedia_example"); // List<String> | This parameter is used for finding stories whose entities dbpedia url in title is the specified value.
List<String> entitiesBodyText = Arrays.asList("entitiesBodyText_example"); // List<String> | This parameter is used for finding stories whose entities text in body is the specified value.
List<String> entitiesBodyType = Arrays.asList("entitiesBodyType_example"); // List<String> | This parameter is used for finding stories whose entities type in body is the specified value.
List<String> entitiesBodyLinksDbpedia = Arrays.asList("entitiesBodyLinksDbpedia_example"); // List<String> | This parameter is used for finding stories whose entities dbpedia url in body is the specified value.
String sentimentTitlePolarity = "sentimentTitlePolarity_example"; // String | This parameter is used for finding stories whose title sentiment is the specified value.
String sentimentBodyPolarity = "sentimentBodyPolarity_example"; // String | This parameter is used for finding stories whose body sentiment is the specified value.
List<Integer> authorId = Arrays.asList(56); // List<Integer> | This parameter is used for finding stories whose author id is the specified value.
String authorName = "authorName_example"; // String | This parameter is used for finding stories whose author full name contains the specified value.
List<Integer> sourceId = Arrays.asList(56); // List<Integer> | This parameter is used for finding stories whose source id is the specified value.
List<String> sourceName = Arrays.asList("sourceName_example"); // List<String> | This parameter is used for finding stories whose source name contains the specified value.
List<String> sourceDomain = Arrays.asList("sourceDomain_example"); // List<String> | This parameter is used for finding stories whose source domain is the specified value.
List<String> sourceLocationsCountry = Arrays.asList("sourceLocationsCountry_example"); // List<String> | This parameter is used for finding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes.
List<String> sourceLocationsState = Arrays.asList("sourceLocationsState_example"); // List<String> | This parameter is used for finding stories whose source state/province is the specified value.
List<String> sourceLocationsCity = Arrays.asList("sourceLocationsCity_example"); // List<String> | This parameter is used for finding stories whose source city is the specified value.
List<String> sourceScopesCountry = Arrays.asList("sourceScopesCountry_example"); // List<String> | This parameter is used for finding stories whose source scopes country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes.
List<String> sourceScopesState = Arrays.asList("sourceScopesState_example"); // List<String> | This parameter is used for finding stories whose source scopes state/province is the specified value.
List<String> sourceScopesCity = Arrays.asList("sourceScopesCity_example"); // List<String> | This parameter is used for finding stories whose source scopes city is the specified value.
List<String> sourceScopesLevel = Arrays.asList("sourceScopesLevel_example"); // List<String> | This parameter is used for finding stories whose source scopes level is the specified value.
Integer intervalStart = 56; // Integer | This parameter is used for setting the start data point of histogram intervals.
Integer intervalEnd = 56; // Integer | This parameter is used for setting the end data point of histogram intervals.
Integer intervalWidth = 56; // Integer | This parameter is used for setting the width of histogram intervals.
String field = "social_shares_count"; // String | This parameter is used for specifying the y-axis variable for the histogram.

HistogramsParams.Builder histogramsBuilder = HistogramsParams.newBuilder();

histogramsBuilder.setId(id);
histogramsBuilder.setTitle(title);
histogramsBuilder.setBody(body);
histogramsBuilder.setText(text);
histogramsBuilder.setLanguage(language);
histogramsBuilder.setPublishedAtStart(publishedAtStart);
histogramsBuilder.setPublishedAtEnd(publishedAtEnd);
histogramsBuilder.setCategoriesTaxonomy(categoriesTaxonomy);
histogramsBuilder.setCategoriesConfident(categoriesConfident);
histogramsBuilder.setCategoriesId(categoriesId);
histogramsBuilder.setCategoriesLevel(categoriesLevel);
histogramsBuilder.setEntitiesTitleText(entitiesTitleText);
histogramsBuilder.setEntitiesTitleType(entitiesTitleType);
histogramsBuilder.setEntitiesTitleLinksDbpedia(entitiesTitleLinksDbpedia);
histogramsBuilder.setEntitiesBodyText(entitiesBodyText);
histogramsBuilder.setEntitiesBodyType(entitiesBodyType);
histogramsBuilder.setEntitiesBodyLinksDbpedia(entitiesBodyLinksDbpedia);
histogramsBuilder.setSentimentTitlePolarity(sentimentTitlePolarity);
histogramsBuilder.setSentimentBodyPolarity(sentimentBodyPolarity);
histogramsBuilder.setAuthorId(authorName);
histogramsBuilder.setAuthorName(language);
histogramsBuilder.setSourceId(sourceId);
histogramsBuilder.setSourceName(sourceName);
histogramsBuilder.setSourceDomain(sourceDomain);
histogramsBuilder.setSourceLocationsCountry(sourceLocationsCountry);
histogramsBuilder.setSourceLocationsState(sourceLocationsState);
histogramsBuilder.setSourceLocationsCity(sourceLocationsCity);
histogramsBuilder.setSourceScopesCountry(sourceScopesCountry);
histogramsBuilder.setSourceScopesState(sourceScopesState);
histogramsBuilder.setSourceScopesCity(sourceScopesCity);
histogramsBuilder.setSourceScopesLevel(sourceScopesLevel);
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
 **id** | [**List&lt;Long&gt;**](Long.md)| This parameter is used for finding stroies by story id. | [optional]
 **title** | **String**| This parameter is used for finding stories whose title contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). | [optional]
 **body** | **String**| This parameter is used for finding stories whose body contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). | [optional]
 **text** | **String**| This parameter is used for finding stories whose title or body contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). | [optional]
 **language** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes. | [optional]
 **publishedAtStart** | **String**| This parameter is used for finding stories whose published at is greater than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates). | [optional]
 **publishedAtEnd** | **String**| This parameter is used for finding stories whose published at is less than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates). | [optional]
 **categoriesTaxonomy** | **String**| This parameter is used for defining type of the taxonomy for the rest of categories queries. | [optional] [enum: iab-qag, iptc-subjectcode]
 **categoriesConfident** | **Boolean**| This parameter is used for finding stories whose categories are confident. | [optional] [default to true]
 **categoriesId** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose categories id is the specified value. | [optional]
 **categoriesLevel** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for finding stories whose categories level is the specified value. | [optional]
 **entitiesTitleText** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose entities text in title is the specified value. | [optional]
 **entitiesTitleType** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose entities type in title is the specified value. | [optional]
 **entitiesTitleLinksDbpedia** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose entities dbpedia url in title is the specified value. | [optional]
 **entitiesBodyText** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose entities text in body is the specified value. | [optional]
 **entitiesBodyType** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose entities type in body is the specified value. | [optional]
 **entitiesBodyLinksDbpedia** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose entities dbpedia url in body is the specified value. | [optional]
 **sentimentTitlePolarity** | **String**| This parameter is used for finding stories whose title sentiment is the specified value. | [optional] [enum: positive, neutral, negative]
 **sentimentBodyPolarity** | **String**| This parameter is used for finding stories whose body sentiment is the specified value. | [optional] [enum: positive, neutral, negative]
 **authorId** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for finding stories whose author id is the specified value. | [optional]
 **authorName** | **String**| This parameter is used for finding stories whose author full name contains the specified value. | [optional]
 **sourceId** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for finding stories whose source id is the specified value. | [optional]
 **sourceName** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source name contains the specified value. | [optional]
 **sourceDomain** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source domain is the specified value. | [optional]
 **sourceLocationsCountry** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. | [optional]
 **sourceLocationsState** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source state/province is the specified value. | [optional]
 **sourceLocationsCity** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source city is the specified value. | [optional]
 **sourceScopesCountry** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source scopes country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. | [optional]
 **sourceScopesState** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source scopes state/province is the specified value. | [optional]
 **sourceScopesCity** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source scopes city is the specified value. | [optional]
 **sourceScopesLevel** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source scopes level is the specified value. | [optional]
 **intervalStart** | **Integer**| This parameter is used for setting the start data point of histogram intervals. | [optional]
 **intervalEnd** | **Integer**| This parameter is used for setting the end data point of histogram intervals. | [optional]
 **intervalWidth** | **Integer**| This parameter is used for setting the width of histogram intervals. | [optional]
 **field** | **String**| This parameter is used for specifying the y-axis variable for the histogram. | [optional] [default to social_shares_count] [enum: social_shares_count, social_shares_count.facebook, social_shares_count.linkedin, social_shares_count.reddit, social_shares_count.google_plus, characters_count, words_count, sentences_count, paragraphs_count]

### Return type

[**Histograms**](Histograms.md)

### Authorization

[app_key](../README.md#app_key), [app_id](../README.md#app_id)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json, text/xml

<a name="listRelatedStories"></a>
# **listRelatedStories**
> RelatedStories listRelatedStories(RelatedStoriesParams relatedStoriesParams)

List related stories

This endpoint is used for finding related stories based on provided parameters. The number of related stories to return, up to a maximum of 100.

### Example
```java
// Import classes:
import com.aylien.newsapi.*;
import com.aylien.newsapi.auth.*;
import com.aylien.newsapi.models.*;
import com.aylien.newsapi.parameters.*;
import com.aylien.newsapi.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: app_id
ApiKeyAuth app_id = (ApiKeyAuth) defaultClient.getAuthentication("app_id");
app_id.setApiKey("YOUR APP ID");

// Configure API key authorization: app_key
ApiKeyAuth app_key = (ApiKeyAuth) defaultClient.getAuthentication("app_key");
app_key.setApiKey("YOUR APP KEY");

DefaultApi apiInstance = new DefaultApi();

List<Long> id = Arrays.asList(56L); // List<Long> | This parameter is used for finding stroies by story id.
String title = "title_example"; // String | This parameter is used for finding stories whose title contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).
String body = "body_example"; // String | This parameter is used for finding stories whose body contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).
String text = "text_example"; // String | This parameter is used for finding stories whose title or body contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).
List<String> language = Arrays.asList("language_example"); // List<String> | This parameter is used for finding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes.
String publishedAtStart = "publishedAtStart_example"; // String | This parameter is used for finding stories whose published at is greater than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates).
String publishedAtEnd = "publishedAtEnd_example"; // String | This parameter is used for finding stories whose published at is less than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates).
String categoriesTaxonomy = "categoriesTaxonomy_example"; // String | This parameter is used for defining type of the taxonomy for the rest of categories queries.
Boolean categoriesConfident = true; // Boolean | This parameter is used for finding stories whose categories are confident.
List<String> categoriesId = Arrays.asList("categoriesId_example"); // List<String> | This parameter is used for finding stories whose categories id is the specified value.
List<Integer> categoriesLevel = Arrays.asList(56); // List<Integer> | This parameter is used for finding stories whose categories level is the specified value.
List<String> entitiesTitleText = Arrays.asList("entitiesTitleText_example"); // List<String> | This parameter is used for finding stories whose entities text in title is the specified value.
List<String> entitiesTitleType = Arrays.asList("entitiesTitleType_example"); // List<String> | This parameter is used for finding stories whose entities type in title is the specified value.
List<String> entitiesTitleLinksDbpedia = Arrays.asList("entitiesTitleLinksDbpedia_example"); // List<String> | This parameter is used for finding stories whose entities dbpedia url in title is the specified value.
List<String> entitiesBodyText = Arrays.asList("entitiesBodyText_example"); // List<String> | This parameter is used for finding stories whose entities text in body is the specified value.
List<String> entitiesBodyType = Arrays.asList("entitiesBodyType_example"); // List<String> | This parameter is used for finding stories whose entities type in body is the specified value.
List<String> entitiesBodyLinksDbpedia = Arrays.asList("entitiesBodyLinksDbpedia_example"); // List<String> | This parameter is used for finding stories whose entities dbpedia url in body is the specified value.
String sentimentTitlePolarity = "sentimentTitlePolarity_example"; // String | This parameter is used for finding stories whose title sentiment is the specified value.
String sentimentBodyPolarity = "sentimentBodyPolarity_example"; // String | This parameter is used for finding stories whose body sentiment is the specified value.
List<Integer> authorId = Arrays.asList(56); // List<Integer> | This parameter is used for finding stories whose author id is the specified value.
String authorName = "authorName_example"; // String | This parameter is used for finding stories whose author full name contains the specified value.
List<Integer> sourceId = Arrays.asList(56); // List<Integer> | This parameter is used for finding stories whose source id is the specified value.
List<String> sourceName = Arrays.asList("sourceName_example"); // List<String> | This parameter is used for finding stories whose source name contains the specified value.
List<String> sourceDomain = Arrays.asList("sourceDomain_example"); // List<String> | This parameter is used for finding stories whose source domain is the specified value.
List<String> sourceLocationsCountry = Arrays.asList("sourceLocationsCountry_example"); // List<String> | This parameter is used for finding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes.
List<String> sourceLocationsState = Arrays.asList("sourceLocationsState_example"); // List<String> | This parameter is used for finding stories whose source state/province is the specified value.
List<String> sourceLocationsCity = Arrays.asList("sourceLocationsCity_example"); // List<String> | This parameter is used for finding stories whose source city is the specified value.
List<String> sourceScopesCountry = Arrays.asList("sourceScopesCountry_example"); // List<String> | This parameter is used for finding stories whose source scopes country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes.
List<String> sourceScopesState = Arrays.asList("sourceScopesState_example"); // List<String> | This parameter is used for finding stories whose source scopes state/province is the specified value.
List<String> sourceScopesCity = Arrays.asList("sourceScopesCity_example"); // List<String> | This parameter is used for finding stories whose source scopes city is the specified value.
List<String> sourceScopesLevel = Arrays.asList("sourceScopesLevel_example"); // List<String> | This parameter is used for finding stories whose source scopes level is the specified value.
List<String> _return = Arrays.asList("_return_example"); // List<String> | This parameter is used for specifying return fields.
Long storyId = 789L; // Long | A story id
String storyUrl = "storyUrl_example"; // String | An article or webpage
String storyTitle = "storyTitle_example"; // String | Title of the article
String storyBody = "storyBody_example"; // String | Body of the article
String boostBy = "boostBy_example"; // String | This parameter is used for boosting result by the specified value.
String storyLanguage = "auto"; // String | This parameter is used for setting language of the story. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes.
Integer perPage = 3; // Integer | This parameter is used for specifying number of the items in each page.

RelatedStoriesParams.Builder relatedStoriesBuilder = RelatedStoriesParams.newBuilder();

relatedStoriesBuilder.setId(id);
relatedStoriesBuilder.setTitle(title);
relatedStoriesBuilder.setBody(body);
relatedStoriesBuilder.setText(text);
relatedStoriesBuilder.setLanguage(language);
relatedStoriesBuilder.setPublishedAtStart(publishedAtStart);
relatedStoriesBuilder.setPublishedAtEnd(publishedAtEnd);
relatedStoriesBuilder.setCategoriesTaxonomy(categoriesTaxonomy);
relatedStoriesBuilder.setCategoriesConfident(categoriesConfident);
relatedStoriesBuilder.setCategoriesId(categoriesId);
relatedStoriesBuilder.setCategoriesLevel(categoriesLevel);
relatedStoriesBuilder.setEntitiesTitleText(entitiesTitleText);
relatedStoriesBuilder.setEntitiesTitleType(entitiesTitleType);
relatedStoriesBuilder.setEntitiesTitleLinksDbpedia(entitiesTitleLinksDbpedia);
relatedStoriesBuilder.setEntitiesBodyText(entitiesBodyText);
relatedStoriesBuilder.setEntitiesBodyType(entitiesBodyType);
relatedStoriesBuilder.setEntitiesBodyLinksDbpedia(entitiesBodyLinksDbpedia);
relatedStoriesBuilder.setSentimentTitlePolarity(sentimentTitlePolarity);
relatedStoriesBuilder.setSentimentBodyPolarity(sentimentBodyPolarity);
relatedStoriesBuilder.setAuthorId(authorName);
relatedStoriesBuilder.setAuthorName(language);
relatedStoriesBuilder.setSourceId(sourceId);
relatedStoriesBuilder.setSourceName(sourceName);
relatedStoriesBuilder.setSourceDomain(sourceDomain);
relatedStoriesBuilder.setSourceLocationsCountry(sourceLocationsCountry);
relatedStoriesBuilder.setSourceLocationsState(sourceLocationsState);
relatedStoriesBuilder.setSourceLocationsCity(sourceLocationsCity);
relatedStoriesBuilder.setSourceScopesCountry(sourceScopesCountry);
relatedStoriesBuilder.setSourceScopesState(sourceScopesState);
relatedStoriesBuilder.setSourceScopesCity(sourceScopesCity);
relatedStoriesBuilder.setSourceScopesLevel(sourceScopesLevel);
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
 **id** | [**List&lt;Long&gt;**](Long.md)| This parameter is used for finding stroies by story id. | [optional]
 **title** | **String**| This parameter is used for finding stories whose title contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). | [optional]
 **body** | **String**| This parameter is used for finding stories whose body contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). | [optional]
 **text** | **String**| This parameter is used for finding stories whose title or body contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). | [optional]
 **language** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes. | [optional]
 **publishedAtStart** | **String**| This parameter is used for finding stories whose published at is greater than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates). | [optional]
 **publishedAtEnd** | **String**| This parameter is used for finding stories whose published at is less than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates). | [optional]
 **categoriesTaxonomy** | **String**| This parameter is used for defining type of the taxonomy for the rest of categories queries. | [optional] [enum: iab-qag, iptc-subjectcode]
 **categoriesConfident** | **Boolean**| This parameter is used for finding stories whose categories are confident. | [optional] [default to true]
 **categoriesId** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose categories id is the specified value. | [optional]
 **categoriesLevel** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for finding stories whose categories level is the specified value. | [optional]
 **entitiesTitleText** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose entities text in title is the specified value. | [optional]
 **entitiesTitleType** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose entities type in title is the specified value. | [optional]
 **entitiesTitleLinksDbpedia** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose entities dbpedia url in title is the specified value. | [optional]
 **entitiesBodyText** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose entities text in body is the specified value. | [optional]
 **entitiesBodyType** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose entities type in body is the specified value. | [optional]
 **entitiesBodyLinksDbpedia** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose entities dbpedia url in body is the specified value. | [optional]
 **sentimentTitlePolarity** | **String**| This parameter is used for finding stories whose title sentiment is the specified value. | [optional] [enum: positive, neutral, negative]
 **sentimentBodyPolarity** | **String**| This parameter is used for finding stories whose body sentiment is the specified value. | [optional] [enum: positive, neutral, negative]
 **authorId** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for finding stories whose author id is the specified value. | [optional]
 **authorName** | **String**| This parameter is used for finding stories whose author full name contains the specified value. | [optional]
 **sourceId** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for finding stories whose source id is the specified value. | [optional]
 **sourceName** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source name contains the specified value. | [optional]
 **sourceDomain** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source domain is the specified value. | [optional]
 **sourceLocationsCountry** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. | [optional]
 **sourceLocationsState** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source state/province is the specified value. | [optional]
 **sourceLocationsCity** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source city is the specified value. | [optional]
 **sourceScopesCountry** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source scopes country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. | [optional]
 **sourceScopesState** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source scopes state/province is the specified value. | [optional]
 **sourceScopesCity** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source scopes city is the specified value. | [optional]
 **sourceScopesLevel** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source scopes level is the specified value. | [optional]
 **_return** | [**List&lt;String&gt;**](String.md)| This parameter is used for specifying return fields. | [optional]
 **storyId** | **Long**| A story id | [optional]
 **storyUrl** | **String**| An article or webpage | [optional]
 **storyTitle** | **String**| Title of the article | [optional]
 **storyBody** | **String**| Body of the article | [optional]
 **boostBy** | **String**| This parameter is used for boosting result by the specified value. | [optional] [enum: recency, popularity]
 **storyLanguage** | **String**| This parameter is used for setting language of the story. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes. | [optional] [default to auto] [enum: auto, en, de, fr, it, es, pt]
 **perPage** | **Integer**| This parameter is used for specifying number of the items in each page. | [optional] [default to 3]

### Return type

[**RelatedStories**](RelatedStories.md)

### Authorization

[app_key](../README.md#app_key), [app_id](../README.md#app_id)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json, text/xml

<a name="listStories"></a>
# **listStories**
> Stories listStories(StoriesParams storiesParams)

List Stories

This endpoint is used for getting list of stories.

### Example
```java
// Import classes:
import com.aylien.newsapi.*;
import com.aylien.newsapi.auth.*;
import com.aylien.newsapi.models.*;
import com.aylien.newsapi.parameters.*;
import com.aylien.newsapi.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: app_id
ApiKeyAuth app_id = (ApiKeyAuth) defaultClient.getAuthentication("app_id");
app_id.setApiKey("YOUR APP ID");

// Configure API key authorization: app_key
ApiKeyAuth app_key = (ApiKeyAuth) defaultClient.getAuthentication("app_key");
app_key.setApiKey("YOUR APP KEY");

DefaultApi apiInstance = new DefaultApi();

List<Long> id = Arrays.asList(56L); // List<Long> | This parameter is used for finding stroies by story id.
String title = "title_example"; // String | This parameter is used for finding stories whose title contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).
String body = "body_example"; // String | This parameter is used for finding stories whose body contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).
String text = "text_example"; // String | This parameter is used for finding stories whose title or body contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).
List<String> language = Arrays.asList("language_example"); // List<String> | This parameter is used for finding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes.
String publishedAtStart = "publishedAtStart_example"; // String | This parameter is used for finding stories whose published at is greater than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates).
String publishedAtEnd = "publishedAtEnd_example"; // String | This parameter is used for finding stories whose published at is less than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates).
String categoriesTaxonomy = "categoriesTaxonomy_example"; // String | This parameter is used for defining type of the taxonomy for the rest of categories queries.
Boolean categoriesConfident = true; // Boolean | This parameter is used for finding stories whose categories are confident.
List<String> categoriesId = Arrays.asList("categoriesId_example"); // List<String> | This parameter is used for finding stories whose categories id is the specified value.
List<Integer> categoriesLevel = Arrays.asList(56); // List<Integer> | This parameter is used for finding stories whose categories level is the specified value.
List<String> entitiesTitleText = Arrays.asList("entitiesTitleText_example"); // List<String> | This parameter is used for finding stories whose entities text in title is the specified value.
List<String> entitiesTitleType = Arrays.asList("entitiesTitleType_example"); // List<String> | This parameter is used for finding stories whose entities type in title is the specified value.
List<String> entitiesTitleLinksDbpedia = Arrays.asList("entitiesTitleLinksDbpedia_example"); // List<String> | This parameter is used for finding stories whose entities dbpedia url in title is the specified value.
List<String> entitiesBodyText = Arrays.asList("entitiesBodyText_example"); // List<String> | This parameter is used for finding stories whose entities text in body is the specified value.
List<String> entitiesBodyType = Arrays.asList("entitiesBodyType_example"); // List<String> | This parameter is used for finding stories whose entities type in body is the specified value.
List<String> entitiesBodyLinksDbpedia = Arrays.asList("entitiesBodyLinksDbpedia_example"); // List<String> | This parameter is used for finding stories whose entities dbpedia url in body is the specified value.
String sentimentTitlePolarity = "sentimentTitlePolarity_example"; // String | This parameter is used for finding stories whose title sentiment is the specified value.
String sentimentBodyPolarity = "sentimentBodyPolarity_example"; // String | This parameter is used for finding stories whose body sentiment is the specified value.
List<Integer> authorId = Arrays.asList(56); // List<Integer> | This parameter is used for finding stories whose author id is the specified value.
String authorName = "authorName_example"; // String | This parameter is used for finding stories whose author full name contains the specified value.
List<Integer> sourceId = Arrays.asList(56); // List<Integer> | This parameter is used for finding stories whose source id is the specified value.
List<String> sourceName = Arrays.asList("sourceName_example"); // List<String> | This parameter is used for finding stories whose source name contains the specified value.
List<String> sourceDomain = Arrays.asList("sourceDomain_example"); // List<String> | This parameter is used for finding stories whose source domain is the specified value.
List<String> sourceLocationsCountry = Arrays.asList("sourceLocationsCountry_example"); // List<String> | This parameter is used for finding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes.
List<String> sourceLocationsState = Arrays.asList("sourceLocationsState_example"); // List<String> | This parameter is used for finding stories whose source state/province is the specified value.
List<String> sourceLocationsCity = Arrays.asList("sourceLocationsCity_example"); // List<String> | This parameter is used for finding stories whose source city is the specified value.
List<String> sourceScopesCountry = Arrays.asList("sourceScopesCountry_example"); // List<String> | This parameter is used for finding stories whose source scopes country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes.
List<String> sourceScopesState = Arrays.asList("sourceScopesState_example"); // List<String> | This parameter is used for finding stories whose source scopes state/province is the specified value.
List<String> sourceScopesCity = Arrays.asList("sourceScopesCity_example"); // List<String> | This parameter is used for finding stories whose source scopes city is the specified value.
List<String> sourceScopesLevel = Arrays.asList("sourceScopesLevel_example"); // List<String> | This parameter is used for finding stories whose source scopes level is the specified value.
Boolean cluster = false; // Boolean | This parameter enables clustering for the returned stories.
String clusterAlgorithm = "lingo"; // String | This parameter is used for specifying the clustering algorithm. It supprts STC, Lingo and [k-means](https://en.wikipedia.org/wiki/K-means_clustering) algorithms.
List<String> _return = Arrays.asList("_return_example"); // List<String> | This parameter is used for specifying return fields.
String sortBy = "published_at"; // String | This parameter is used for changing the order column of the result.
String sortDirection = "desc"; // String | This parameter is used for changing the order direction of the result.
String cursor = "*"; // String | This parameter is used for finding a specific page.
Integer perPage = 10; // Integer | This parameter is used for specifying number of the items in each page.

StoriesParams.Builder storiesBuilder = StoriesParams.newBuilder();

storiesBuilder.setId(id);
storiesBuilder.setTitle(title);
storiesBuilder.setBody(body);
storiesBuilder.setText(text);
storiesBuilder.setLanguage(language);
storiesBuilder.setPublishedAtStart(publishedAtStart);
storiesBuilder.setPublishedAtEnd(publishedAtEnd);
storiesBuilder.setCategoriesTaxonomy(categoriesTaxonomy);
storiesBuilder.setCategoriesConfident(categoriesConfident);
storiesBuilder.setCategoriesId(categoriesId);
storiesBuilder.setCategoriesLevel(categoriesLevel);
storiesBuilder.setEntitiesTitleText(entitiesTitleText);
storiesBuilder.setEntitiesTitleType(entitiesTitleType);
storiesBuilder.setEntitiesTitleLinksDbpedia(entitiesTitleLinksDbpedia);
storiesBuilder.setEntitiesBodyText(entitiesBodyText);
storiesBuilder.setEntitiesBodyType(entitiesBodyType);
storiesBuilder.setEntitiesBodyLinksDbpedia(entitiesBodyLinksDbpedia);
storiesBuilder.setSentimentTitlePolarity(sentimentTitlePolarity);
storiesBuilder.setSentimentBodyPolarity(sentimentBodyPolarity);
storiesBuilder.setAuthorId(authorName);
storiesBuilder.setAuthorName(language);
storiesBuilder.setSourceId(sourceId);
storiesBuilder.setSourceName(sourceName);
storiesBuilder.setSourceDomain(sourceDomain);
storiesBuilder.setSourceLocationsCountry(sourceLocationsCountry);
storiesBuilder.setSourceLocationsState(sourceLocationsState);
storiesBuilder.setSourceLocationsCity(sourceLocationsCity);
storiesBuilder.setSourceScopesCountry(sourceScopesCountry);
storiesBuilder.setSourceScopesState(sourceScopesState);
storiesBuilder.setSourceScopesCity(sourceScopesCity);
storiesBuilder.setSourceScopesLevel(sourceScopesLevel);
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
 **id** | [**List&lt;Long&gt;**](Long.md)| This parameter is used for finding stroies by story id. | [optional]
 **title** | **String**| This parameter is used for finding stories whose title contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). | [optional]
 **body** | **String**| This parameter is used for finding stories whose body contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). | [optional]
 **text** | **String**| This parameter is used for finding stories whose title or body contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). | [optional]
 **language** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes. | [optional]
 **publishedAtStart** | **String**| This parameter is used for finding stories whose published at is greater than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates). | [optional]
 **publishedAtEnd** | **String**| This parameter is used for finding stories whose published at is less than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates). | [optional]
 **categoriesTaxonomy** | **String**| This parameter is used for defining type of the taxonomy for the rest of categories queries. | [optional] [enum: iab-qag, iptc-subjectcode]
 **categoriesConfident** | **Boolean**| This parameter is used for finding stories whose categories are confident. | [optional] [default to true]
 **categoriesId** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose categories id is the specified value. | [optional]
 **categoriesLevel** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for finding stories whose categories level is the specified value. | [optional]
 **entitiesTitleText** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose entities text in title is the specified value. | [optional]
 **entitiesTitleType** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose entities type in title is the specified value. | [optional]
 **entitiesTitleLinksDbpedia** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose entities dbpedia url in title is the specified value. | [optional]
 **entitiesBodyText** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose entities text in body is the specified value. | [optional]
 **entitiesBodyType** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose entities type in body is the specified value. | [optional]
 **entitiesBodyLinksDbpedia** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose entities dbpedia url in body is the specified value. | [optional]
 **sentimentTitlePolarity** | **String**| This parameter is used for finding stories whose title sentiment is the specified value. | [optional] [enum: positive, neutral, negative]
 **sentimentBodyPolarity** | **String**| This parameter is used for finding stories whose body sentiment is the specified value. | [optional] [enum: positive, neutral, negative]
 **authorId** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for finding stories whose author id is the specified value. | [optional]
 **authorName** | **String**| This parameter is used for finding stories whose author full name contains the specified value. | [optional]
 **sourceId** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for finding stories whose source id is the specified value. | [optional]
 **sourceName** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source name contains the specified value. | [optional]
 **sourceDomain** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source domain is the specified value. | [optional]
 **sourceLocationsCountry** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. | [optional]
 **sourceLocationsState** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source state/province is the specified value. | [optional]
 **sourceLocationsCity** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source city is the specified value. | [optional]
 **sourceScopesCountry** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source scopes country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. | [optional]
 **sourceScopesState** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source scopes state/province is the specified value. | [optional]
 **sourceScopesCity** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source scopes city is the specified value. | [optional]
 **sourceScopesLevel** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source scopes level is the specified value. | [optional]
 **cluster** | **Boolean**| This parameter enables clustering for the returned stories. | [optional] [default to false]
 **clusterAlgorithm** | **String**| This parameter is used for specifying the clustering algorithm. It supprts STC, Lingo and [k-means](https://en.wikipedia.org/wiki/K-means_clustering) algorithms. | [optional] [default to lingo] [enum: stc, lingo, kmeans]
 **_return** | [**List&lt;String&gt;**](String.md)| This parameter is used for specifying return fields. | [optional]
 **sortBy** | **String**| This parameter is used for changing the order column of the result. | [optional] [default to published_at] [enum: relevance, recency, hotness, published_at, social_shares_count, social_shares_count.facebook, social_shares_count.linkedin, social_shares_count.google_plus, social_shares_count.reddit]
 **sortDirection** | **String**| This parameter is used for changing the order direction of the result. | [optional] [default to desc] [enum: asc, desc]
 **cursor** | **String**| This parameter is used for finding a specific page. | [optional] [default to *]
 **perPage** | **Integer**| This parameter is used for specifying number of the items in each page. | [optional] [default to 10]

### Return type

[**Stories**](Stories.md)

### Authorization

[app_key](../README.md#app_key), [app_id](../README.md#app_id)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json, text/xml

<a name="listTimeSeries"></a>
# **listTimeSeries**
> TimeSeriesList listTimeSeries(TimeSeriesParams timeSeriesParams)

List time series

This endpoint is used for getting time series by stories.

### Example
```java
// Import classes:
import com.aylien.newsapi.*;
import com.aylien.newsapi.auth.*;
import com.aylien.newsapi.models.*;
import com.aylien.newsapi.parameters.*;
import com.aylien.newsapi.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: app_id
ApiKeyAuth app_id = (ApiKeyAuth) defaultClient.getAuthentication("app_id");
app_id.setApiKey("YOUR APP ID");

// Configure API key authorization: app_key
ApiKeyAuth app_key = (ApiKeyAuth) defaultClient.getAuthentication("app_key");
app_key.setApiKey("YOUR APP KEY");

DefaultApi apiInstance = new DefaultApi();

List<Long> id = Arrays.asList(56L); // List<Long> | This parameter is used for finding stroies by story id.
String title = "title_example"; // String | This parameter is used for finding stories whose title contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).
String body = "body_example"; // String | This parameter is used for finding stories whose body contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).
String text = "text_example"; // String | This parameter is used for finding stories whose title or body contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).
List<String> language = Arrays.asList("language_example"); // List<String> | This parameter is used for finding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes.
String categoriesTaxonomy = "categoriesTaxonomy_example"; // String | This parameter is used for defining type of the taxonomy for the rest of categories queries.
Boolean categoriesConfident = true; // Boolean | This parameter is used for finding stories whose categories are confident.
List<String> categoriesId = Arrays.asList("categoriesId_example"); // List<String> | This parameter is used for finding stories whose categories id is the specified value.
List<Integer> categoriesLevel = Arrays.asList(56); // List<Integer> | This parameter is used for finding stories whose categories level is the specified value.
List<String> entitiesTitleText = Arrays.asList("entitiesTitleText_example"); // List<String> | This parameter is used for finding stories whose entities text in title is the specified value.
List<String> entitiesTitleType = Arrays.asList("entitiesTitleType_example"); // List<String> | This parameter is used for finding stories whose entities type in title is the specified value.
List<String> entitiesTitleLinksDbpedia = Arrays.asList("entitiesTitleLinksDbpedia_example"); // List<String> | This parameter is used for finding stories whose entities dbpedia url in title is the specified value.
List<String> entitiesBodyText = Arrays.asList("entitiesBodyText_example"); // List<String> | This parameter is used for finding stories whose entities text in body is the specified value.
List<String> entitiesBodyType = Arrays.asList("entitiesBodyType_example"); // List<String> | This parameter is used for finding stories whose entities type in body is the specified value.
List<String> entitiesBodyLinksDbpedia = Arrays.asList("entitiesBodyLinksDbpedia_example"); // List<String> | This parameter is used for finding stories whose entities dbpedia url in body is the specified value.
String sentimentTitlePolarity = "sentimentTitlePolarity_example"; // String | This parameter is used for finding stories whose title sentiment is the specified value.
String sentimentBodyPolarity = "sentimentBodyPolarity_example"; // String | This parameter is used for finding stories whose body sentiment is the specified value.
List<Integer> authorId = Arrays.asList(56); // List<Integer> | This parameter is used for finding stories whose author id is the specified value.
String authorName = "authorName_example"; // String | This parameter is used for finding stories whose author full name contains the specified value.
List<Integer> sourceId = Arrays.asList(56); // List<Integer> | This parameter is used for finding stories whose source id is the specified value.
List<String> sourceName = Arrays.asList("sourceName_example"); // List<String> | This parameter is used for finding stories whose source name contains the specified value.
List<String> sourceDomain = Arrays.asList("sourceDomain_example"); // List<String> | This parameter is used for finding stories whose source domain is the specified value.
List<String> sourceLocationsCountry = Arrays.asList("sourceLocationsCountry_example"); // List<String> | This parameter is used for finding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes.
List<String> sourceLocationsState = Arrays.asList("sourceLocationsState_example"); // List<String> | This parameter is used for finding stories whose source state/province is the specified value.
List<String> sourceLocationsCity = Arrays.asList("sourceLocationsCity_example"); // List<String> | This parameter is used for finding stories whose source city is the specified value.
List<String> sourceScopesCountry = Arrays.asList("sourceScopesCountry_example"); // List<String> | This parameter is used for finding stories whose source scopes country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes.
List<String> sourceScopesState = Arrays.asList("sourceScopesState_example"); // List<String> | This parameter is used for finding stories whose source scopes state/province is the specified value.
List<String> sourceScopesCity = Arrays.asList("sourceScopesCity_example"); // List<String> | This parameter is used for finding stories whose source scopes city is the specified value.
List<String> sourceScopesLevel = Arrays.asList("sourceScopesLevel_example"); // List<String> | This parameter is used for finding stories whose source scopes level is the specified value.
String publishedAtStart = "NOW-7DAYS/DAY"; // String | This parameter is used for finding stories whose published at is less than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates).
String publishedAtEnd = "NOW/DAY"; // String | This parameter is used for finding stories whose published at is greater than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates).
String period = "+1DAY"; // String | The size of each date range expressed as an interval to be added to the lower bound. It supports Date Math Syntax. Valid options are `+` following an integer number greater than 0 and one of the Date Math keywords. e.g. `+1DAY`, `+2MINUTES` and `+1MONTH`. Here are [Supported keywords](https://newsapi.aylien.com/docs/working-with-dates#date-math).

TimeSeriesParams.Builder timeSeriesBuilder = TimeSeriesParams.newBuilder();

timeSeriesBuilder.setId(id);
timeSeriesBuilder.setTitle(title);
timeSeriesBuilder.setBody(body);
timeSeriesBuilder.setText(text);
timeSeriesBuilder.setLanguage(language);
timeSeriesBuilder.setCategoriesTaxonomy(categoriesTaxonomy);
timeSeriesBuilder.setCategoriesConfident(categoriesConfident);
timeSeriesBuilder.setCategoriesId(categoriesId);
timeSeriesBuilder.setCategoriesLevel(categoriesLevel);
timeSeriesBuilder.setEntitiesTitleText(entitiesTitleText);
timeSeriesBuilder.setEntitiesTitleType(entitiesTitleType);
timeSeriesBuilder.setEntitiesTitleLinksDbpedia(entitiesTitleLinksDbpedia);
timeSeriesBuilder.setEntitiesBodyText(entitiesBodyText);
timeSeriesBuilder.setEntitiesBodyType(entitiesBodyType);
timeSeriesBuilder.setEntitiesBodyLinksDbpedia(entitiesBodyLinksDbpedia);
timeSeriesBuilder.setSentimentTitlePolarity(sentimentTitlePolarity);
timeSeriesBuilder.setSentimentBodyPolarity(sentimentBodyPolarity);
timeSeriesBuilder.setAuthorId(authorName);
timeSeriesBuilder.setAuthorName(language);
timeSeriesBuilder.setSourceId(sourceId);
timeSeriesBuilder.setSourceName(sourceName);
timeSeriesBuilder.setSourceDomain(sourceDomain);
timeSeriesBuilder.setSourceLocationsCountry(sourceLocationsCountry);
timeSeriesBuilder.setSourceLocationsState(sourceLocationsState);
timeSeriesBuilder.setSourceLocationsCity(sourceLocationsCity);
timeSeriesBuilder.setSourceScopesCountry(sourceScopesCountry);
timeSeriesBuilder.setSourceScopesState(sourceScopesState);
timeSeriesBuilder.setSourceScopesCity(sourceScopesCity);
timeSeriesBuilder.setSourceScopesLevel(sourceScopesLevel);
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
 **id** | [**List&lt;Long&gt;**](Long.md)| This parameter is used for finding stroies by story id. | [optional]
 **title** | **String**| This parameter is used for finding stories whose title contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). | [optional]
 **body** | **String**| This parameter is used for finding stories whose body contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). | [optional]
 **text** | **String**| This parameter is used for finding stories whose title or body contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). | [optional]
 **language** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes. | [optional]
 **categoriesTaxonomy** | **String**| This parameter is used for defining type of the taxonomy for the rest of categories queries. | [optional] [enum: iab-qag, iptc-subjectcode]
 **categoriesConfident** | **Boolean**| This parameter is used for finding stories whose categories are confident. | [optional] [default to true]
 **categoriesId** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose categories id is the specified value. | [optional]
 **categoriesLevel** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for finding stories whose categories level is the specified value. | [optional]
 **entitiesTitleText** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose entities text in title is the specified value. | [optional]
 **entitiesTitleType** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose entities type in title is the specified value. | [optional]
 **entitiesTitleLinksDbpedia** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose entities dbpedia url in title is the specified value. | [optional]
 **entitiesBodyText** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose entities text in body is the specified value. | [optional]
 **entitiesBodyType** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose entities type in body is the specified value. | [optional]
 **entitiesBodyLinksDbpedia** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose entities dbpedia url in body is the specified value. | [optional]
 **sentimentTitlePolarity** | **String**| This parameter is used for finding stories whose title sentiment is the specified value. | [optional] [enum: positive, neutral, negative]
 **sentimentBodyPolarity** | **String**| This parameter is used for finding stories whose body sentiment is the specified value. | [optional] [enum: positive, neutral, negative]
 **authorId** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for finding stories whose author id is the specified value. | [optional]
 **authorName** | **String**| This parameter is used for finding stories whose author full name contains the specified value. | [optional]
 **sourceId** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for finding stories whose source id is the specified value. | [optional]
 **sourceName** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source name contains the specified value. | [optional]
 **sourceDomain** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source domain is the specified value. | [optional]
 **sourceLocationsCountry** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. | [optional]
 **sourceLocationsState** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source state/province is the specified value. | [optional]
 **sourceLocationsCity** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source city is the specified value. | [optional]
 **sourceScopesCountry** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source scopes country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. | [optional]
 **sourceScopesState** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source scopes state/province is the specified value. | [optional]
 **sourceScopesCity** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source scopes city is the specified value. | [optional]
 **sourceScopesLevel** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source scopes level is the specified value. | [optional]
 **publishedAtStart** | **String**| This parameter is used for finding stories whose published at is less than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates). | [optional] [default to NOW-7DAYS/DAY]
 **publishedAtEnd** | **String**| This parameter is used for finding stories whose published at is greater than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates). | [optional] [default to NOW/DAY]
 **period** | **String**| The size of each date range expressed as an interval to be added to the lower bound. It supports Date Math Syntax. Valid options are &#x60;+&#x60; following an integer number greater than 0 and one of the Date Math keywords. e.g. &#x60;+1DAY&#x60;, &#x60;+2MINUTES&#x60; and &#x60;+1MONTH&#x60;. Here are [Supported keywords](https://newsapi.aylien.com/docs/working-with-dates#date-math). | [optional] [default to +1DAY]

### Return type

[**TimeSeriesList**](TimeSeriesList.md)

### Authorization

[app_key](../README.md#app_key), [app_id](../README.md#app_id)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json, text/xml

<a name="listTrends"></a>
# **listTrends**
> Trends listTrends(TrendsParams trendsParams)

List trends

This endpoint is used for finding news trendings based on stories resource.

### Example
```java
// Import classes:
import com.aylien.newsapi.*;
import com.aylien.newsapi.auth.*;
import com.aylien.newsapi.models.*;
import com.aylien.newsapi.parameters.*;
import com.aylien.newsapi.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: app_id
ApiKeyAuth app_id = (ApiKeyAuth) defaultClient.getAuthentication("app_id");
app_id.setApiKey("YOUR APP ID");

// Configure API key authorization: app_key
ApiKeyAuth app_key = (ApiKeyAuth) defaultClient.getAuthentication("app_key");
app_key.setApiKey("YOUR APP KEY");

DefaultApi apiInstance = new DefaultApi();

List<Long> id = Arrays.asList(56L); // List<Long> | This parameter is used for finding stroies by story id.
String title = "title_example"; // String | This parameter is used for finding stories whose title contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).
String body = "body_example"; // String | This parameter is used for finding stories whose body contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).
String text = "text_example"; // String | This parameter is used for finding stories whose title or body contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).
List<String> language = Arrays.asList("language_example"); // List<String> | This parameter is used for finding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes.
String publishedAtStart = "publishedAtStart_example"; // String | This parameter is used for finding stories whose published at is greater than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates).
String publishedAtEnd = "publishedAtEnd_example"; // String | This parameter is used for finding stories whose published at is less than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates).
String categoriesTaxonomy = "categoriesTaxonomy_example"; // String | This parameter is used for defining type of the taxonomy for the rest of categories queries.
Boolean categoriesConfident = true; // Boolean | This parameter is used for finding stories whose categories are confident.
List<String> categoriesId = Arrays.asList("categoriesId_example"); // List<String> | This parameter is used for finding stories whose categories id is the specified value.
List<Integer> categoriesLevel = Arrays.asList(56); // List<Integer> | This parameter is used for finding stories whose categories level is the specified value.
List<String> entitiesTitleText = Arrays.asList("entitiesTitleText_example"); // List<String> | This parameter is used for finding stories whose entities text in title is the specified value.
List<String> entitiesTitleType = Arrays.asList("entitiesTitleType_example"); // List<String> | This parameter is used for finding stories whose entities type in title is the specified value.
List<String> entitiesTitleLinksDbpedia = Arrays.asList("entitiesTitleLinksDbpedia_example"); // List<String> | This parameter is used for finding stories whose entities dbpedia url in title is the specified value.
List<String> entitiesBodyText = Arrays.asList("entitiesBodyText_example"); // List<String> | This parameter is used for finding stories whose entities text in body is the specified value.
List<String> entitiesBodyType = Arrays.asList("entitiesBodyType_example"); // List<String> | This parameter is used for finding stories whose entities type in body is the specified value.
List<String> entitiesBodyLinksDbpedia = Arrays.asList("entitiesBodyLinksDbpedia_example"); // List<String> | This parameter is used for finding stories whose entities dbpedia url in body is the specified value.
String sentimentTitlePolarity = "sentimentTitlePolarity_example"; // String | This parameter is used for finding stories whose title sentiment is the specified value.
String sentimentBodyPolarity = "sentimentBodyPolarity_example"; // String | This parameter is used for finding stories whose body sentiment is the specified value.
List<Integer> authorId = Arrays.asList(56); // List<Integer> | This parameter is used for finding stories whose author id is the specified value.
String authorName = "authorName_example"; // String | This parameter is used for finding stories whose author full name contains the specified value.
List<Integer> sourceId = Arrays.asList(56); // List<Integer> | This parameter is used for finding stories whose source id is the specified value.
List<String> sourceName = Arrays.asList("sourceName_example"); // List<String> | This parameter is used for finding stories whose source name contains the specified value.
List<String> sourceDomain = Arrays.asList("sourceDomain_example"); // List<String> | This parameter is used for finding stories whose source domain is the specified value.
List<String> sourceLocationsCountry = Arrays.asList("sourceLocationsCountry_example"); // List<String> | This parameter is used for finding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes.
List<String> sourceLocationsState = Arrays.asList("sourceLocationsState_example"); // List<String> | This parameter is used for finding stories whose source state/province is the specified value.
List<String> sourceLocationsCity = Arrays.asList("sourceLocationsCity_example"); // List<String> | This parameter is used for finding stories whose source city is the specified value.
List<String> sourceScopesCountry = Arrays.asList("sourceScopesCountry_example"); // List<String> | This parameter is used for finding stories whose source scopes country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes.
List<String> sourceScopesState = Arrays.asList("sourceScopesState_example"); // List<String> | This parameter is used for finding stories whose source scopes state/province is the specified value.
List<String> sourceScopesCity = Arrays.asList("sourceScopesCity_example"); // List<String> | This parameter is used for finding stories whose source scopes city is the specified value.
List<String> sourceScopesLevel = Arrays.asList("sourceScopesLevel_example"); // List<String> | This parameter is used for finding stories whose source scopes level is the specified value.
String field = "field_example"; // String | This parameter is used to specify the trend field.

TrendsParams.Builder trendsBuilder = TrendsParams.newBuilder();

trendsBuilder.setId(id);
trendsBuilder.setTitle(title);
trendsBuilder.setBody(body);
trendsBuilder.setText(text);
trendsBuilder.setLanguage(language);
trendsBuilder.setPublishedAtStart(publishedAtStart);
trendsBuilder.setPublishedAtEnd(publishedAtEnd);
trendsBuilder.setCategoriesTaxonomy(categoriesTaxonomy);
trendsBuilder.setCategoriesConfident(categoriesConfident);
trendsBuilder.setCategoriesId(categoriesId);
trendsBuilder.setCategoriesLevel(categoriesLevel);
trendsBuilder.setEntitiesTitleText(entitiesTitleText);
trendsBuilder.setEntitiesTitleType(entitiesTitleType);
trendsBuilder.setEntitiesTitleLinksDbpedia(entitiesTitleLinksDbpedia);
trendsBuilder.setEntitiesBodyText(entitiesBodyText);
trendsBuilder.setEntitiesBodyType(entitiesBodyType);
trendsBuilder.setEntitiesBodyLinksDbpedia(entitiesBodyLinksDbpedia);
trendsBuilder.setSentimentTitlePolarity(sentimentTitlePolarity);
trendsBuilder.setSentimentBodyPolarity(sentimentBodyPolarity);
trendsBuilder.setAuthorId(authorName);
trendsBuilder.setAuthorName(language);
trendsBuilder.setSourceId(sourceId);
trendsBuilder.setSourceName(sourceName);
trendsBuilder.setSourceDomain(sourceDomain);
trendsBuilder.setSourceLocationsCountry(sourceLocationsCountry);
trendsBuilder.setSourceLocationsState(sourceLocationsState);
trendsBuilder.setSourceLocationsCity(sourceLocationsCity);
trendsBuilder.setSourceScopesCountry(sourceScopesCountry);
trendsBuilder.setSourceScopesState(sourceScopesState);
trendsBuilder.setSourceScopesCity(sourceScopesCity);
trendsBuilder.setSourceScopesLevel(sourceScopesLevel);
trendsBuilder.setField(field);

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
 **id** | [**List&lt;Long&gt;**](Long.md)| This parameter is used for finding stroies by story id. | [optional]
 **title** | **String**| This parameter is used for finding stories whose title contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). | [optional]
 **body** | **String**| This parameter is used for finding stories whose body contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). | [optional]
 **text** | **String**| This parameter is used for finding stories whose title or body contains a specfic keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). | [optional]
 **language** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes. | [optional]
 **publishedAtStart** | **String**| This parameter is used for finding stories whose published at is greater than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates). | [optional]
 **publishedAtEnd** | **String**| This parameter is used for finding stories whose published at is less than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates). | [optional]
 **categoriesTaxonomy** | **String**| This parameter is used for defining type of the taxonomy for the rest of categories queries. | [optional] [enum: iab-qag, iptc-subjectcode]
 **categoriesConfident** | **Boolean**| This parameter is used for finding stories whose categories are confident. | [optional] [default to true]
 **categoriesId** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose categories id is the specified value. | [optional]
 **categoriesLevel** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for finding stories whose categories level is the specified value. | [optional]
 **entitiesTitleText** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose entities text in title is the specified value. | [optional]
 **entitiesTitleType** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose entities type in title is the specified value. | [optional]
 **entitiesTitleLinksDbpedia** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose entities dbpedia url in title is the specified value. | [optional]
 **entitiesBodyText** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose entities text in body is the specified value. | [optional]
 **entitiesBodyType** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose entities type in body is the specified value. | [optional]
 **entitiesBodyLinksDbpedia** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose entities dbpedia url in body is the specified value. | [optional]
 **sentimentTitlePolarity** | **String**| This parameter is used for finding stories whose title sentiment is the specified value. | [optional] [enum: positive, neutral, negative]
 **sentimentBodyPolarity** | **String**| This parameter is used for finding stories whose body sentiment is the specified value. | [optional] [enum: positive, neutral, negative]
 **authorId** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for finding stories whose author id is the specified value. | [optional]
 **authorName** | **String**| This parameter is used for finding stories whose author full name contains the specified value. | [optional]
 **sourceId** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for finding stories whose source id is the specified value. | [optional]
 **sourceName** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source name contains the specified value. | [optional]
 **sourceDomain** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source domain is the specified value. | [optional]
 **sourceLocationsCountry** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. | [optional]
 **sourceLocationsState** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source state/province is the specified value. | [optional]
 **sourceLocationsCity** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source city is the specified value. | [optional]
 **sourceScopesCountry** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source scopes country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. | [optional]
 **sourceScopesState** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source scopes state/province is the specified value. | [optional]
 **sourceScopesCity** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source scopes city is the specified value. | [optional]
 **sourceScopesLevel** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source scopes level is the specified value. | [optional]
 **field** | **String**| This parameter is used to specify the trend field. | [optional] [enum: author.name, source.name, source.domain, keywords, entities.title.text, entities.title.type, entities.title.links.dbpedia, entities.body.text, entities.body.type, entities.body.links.dbpedia, hashtags, categories.id, sentiment.title.polarity, sentiment.body.polarity]

### Return type

[**Trends**](Trends.md)

### Authorization

[app_key](../README.md#app_key), [app_id](../README.md#app_id)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json, text/xml