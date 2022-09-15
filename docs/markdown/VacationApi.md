# VacationApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTodayRequest**](VacationApi.md#getTodayRequest) | **GET** /vacations/today | Get vacattions that was submitted today


<a name="getTodayRequest"></a>
# **getTodayRequest**
> List&lt;Vacation&gt; getTodayRequest()

Get vacattions that was submitted today

Get vacattions that was submitted today

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VacationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    VacationApi apiInstance = new VacationApi(defaultClient);
    try {
      List<Vacation> result = apiInstance.getTodayRequest();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VacationApi#getTodayRequest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Vacation&gt;**](Vacation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

