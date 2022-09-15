# PositionApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAll1**](PositionApi.md#getAll1) | **GET** /positions | get all positions
[**saveAll1**](PositionApi.md#saveAll1) | **POST** /positions | Create new position


<a name="getAll1"></a>
# **getAll1**
> List&lt;Position&gt; getAll1()

get all positions

get all positions

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PositionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    PositionApi apiInstance = new PositionApi(defaultClient);
    try {
      List<Position> result = apiInstance.getAll1();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PositionApi#getAll1");
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

[**List&lt;Position&gt;**](Position.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="saveAll1"></a>
# **saveAll1**
> List&lt;Position&gt; saveAll1(position)

Create new position

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PositionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    PositionApi apiInstance = new PositionApi(defaultClient);
    List<Position> position = Arrays.asList(); // List<Position> | 
    try {
      List<Position> result = apiInstance.saveAll1(position);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PositionApi#saveAll1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **position** | [**List&lt;Position&gt;**](Position.md)|  |

### Return type

[**List&lt;Position&gt;**](Position.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

