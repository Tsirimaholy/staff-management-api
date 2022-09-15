# DepartmentApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](DepartmentApi.md#create) | **PUT** /departments | Get all departments
[**getAll2**](DepartmentApi.md#getAll2) | **GET** /departments | Create or update a department


<a name="create"></a>
# **create**
> List&lt;Department&gt; create(department)

Get all departments

Get all departments

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DepartmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    DepartmentApi apiInstance = new DepartmentApi(defaultClient);
    List<Department> department = Arrays.asList(); // List<Department> | 
    try {
      List<Department> result = apiInstance.create(department);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DepartmentApi#create");
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
 **department** | [**List&lt;Department&gt;**](Department.md)|  |

### Return type

[**List&lt;Department&gt;**](Department.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getAll2"></a>
# **getAll2**
> List&lt;Department&gt; getAll2()

Create or update a department

Create or update a department

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DepartmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    DepartmentApi apiInstance = new DepartmentApi(defaultClient);
    try {
      List<Department> result = apiInstance.getAll2();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DepartmentApi#getAll2");
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

[**List&lt;Department&gt;**](Department.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

