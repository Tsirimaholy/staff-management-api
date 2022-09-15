# StaffApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findByStaffId**](StaffApi.md#findByStaffId) | **GET** /staffs/{id}/vacations | get the list of vacations request for an identified staff
[**fire**](StaffApi.md#fire) | **DELETE** /staffs/{id} | delete a staff
[**getAll**](StaffApi.md#getAll) | **GET** /staffs | Get the list of all staff
[**requestVacation**](StaffApi.md#requestVacation) | **POST** /staffs/{id}/vacations | add new staff
[**saveAll**](StaffApi.md#saveAll) | **PUT** /staffs | Create or update staff
[**updatePosition**](StaffApi.md#updatePosition) | **PATCH** /staffs/{idStaff}/positions/to/{idPosition} | change position for an identified staff


<a name="findByStaffId"></a>
# **findByStaffId**
> List&lt;Vacation&gt; findByStaffId(id, page, pageSize)

get the list of vacations request for an identified staff

Get vacations request for an identified staff

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StaffApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    StaffApi apiInstance = new StaffApi(defaultClient);
    Long id = 56L; // Long | 
    Integer page = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    try {
      List<Vacation> result = apiInstance.findByStaffId(id, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StaffApi#findByStaffId");
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
 **id** | **Long**|  |
 **page** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]

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

<a name="fire"></a>
# **fire**
> String fire(id)

delete a staff

delete a staff

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StaffApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    StaffApi apiInstance = new StaffApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      String result = apiInstance.fire(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StaffApi#fire");
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
 **id** | **Long**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getAll"></a>
# **getAll**
> List&lt;Staff&gt; getAll(page, pageSize)

Get the list of all staff

Get the list of all staff

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StaffApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    StaffApi apiInstance = new StaffApi(defaultClient);
    Integer page = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    try {
      List<Staff> result = apiInstance.getAll(page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StaffApi#getAll");
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
 **page** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]

### Return type

[**List&lt;Staff&gt;**](Staff.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="requestVacation"></a>
# **requestVacation**
> Vacation requestVacation(id, vacation)

add new staff

add new staff

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StaffApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    StaffApi apiInstance = new StaffApi(defaultClient);
    Long id = 56L; // Long | 
    Vacation vacation = new Vacation(); // Vacation | 
    try {
      Vacation result = apiInstance.requestVacation(id, vacation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StaffApi#requestVacation");
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
 **id** | **Long**|  |
 **vacation** | [**Vacation**](Vacation.md)|  |

### Return type

[**Vacation**](Vacation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="saveAll"></a>
# **saveAll**
> List&lt;Staff&gt; saveAll(staff)

Create or update staff

Create or update staff

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StaffApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    StaffApi apiInstance = new StaffApi(defaultClient);
    List<Staff> staff = Arrays.asList(); // List<Staff> | 
    try {
      List<Staff> result = apiInstance.saveAll(staff);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StaffApi#saveAll");
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
 **staff** | [**List&lt;Staff&gt;**](Staff.md)|  |

### Return type

[**List&lt;Staff&gt;**](Staff.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updatePosition"></a>
# **updatePosition**
> Staff updatePosition(idStaff, idPosition)

change position for an identified staff

change position for an identified staff

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StaffApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    StaffApi apiInstance = new StaffApi(defaultClient);
    Long idStaff = 56L; // Long | 
    Long idPosition = 56L; // Long | 
    try {
      Staff result = apiInstance.updatePosition(idStaff, idPosition);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StaffApi#updatePosition");
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
 **idStaff** | **Long**|  |
 **idPosition** | **Long**|  |

### Return type

[**Staff**](Staff.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

