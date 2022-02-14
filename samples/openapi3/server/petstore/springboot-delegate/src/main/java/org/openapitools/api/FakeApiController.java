package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.Client;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.model.FileSchemaTestClass;
import java.time.LocalDate;
import java.util.Map;
import org.openapitools.model.ModelApiResponse;
import java.time.OffsetDateTime;
import org.openapitools.model.OuterComposite;
import org.openapitools.model.User;
import org.openapitools.model.XmlItem;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Controller
@RequestMapping("${openapi.openAPIPetstore.base-path:/v2}")
public class FakeApiController implements FakeApi {

    private final FakeApiDelegate delegate;

    public FakeApiController(@Autowired(required = false) FakeApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new FakeApiDelegate() {});
    }

    @Override
    public FakeApiDelegate getDelegate() {
        return delegate;
    }

    /**
     * POST /fake/create_xml_item : creates an XmlItem
     * this route creates an XmlItem
     *
     * @param xmlItem XmlItem Body (required)
     * @return successful operation (status code 200)
     * @see FakeApi#createXmlItem
     */
    public ResponseEntity<Void> createXmlItem(
        @Parameter(name = "XmlItem", description = "XmlItem Body", required = true) @Valid @RequestBody XmlItem xmlItem
    ) {
        return delegate.createXmlItem(xmlItem);
    }

    /**
     * POST /fake/outer/boolean
     * Test serialization of outer boolean types
     *
     * @param body Input boolean as post body (optional)
     * @return Output boolean (status code 200)
     * @see FakeApi#fakeOuterBooleanSerialize
     */
    public ResponseEntity<Boolean> fakeOuterBooleanSerialize(
        @Parameter(name = "body", description = "Input boolean as post body") @Valid @RequestBody(required = false) Boolean body
    ) {
        return delegate.fakeOuterBooleanSerialize(body);
    }

    /**
     * POST /fake/outer/composite
     * Test serialization of object with outer number type
     *
     * @param body Input composite as post body (optional)
     * @return Output composite (status code 200)
     * @see FakeApi#fakeOuterCompositeSerialize
     */
    public ResponseEntity<OuterComposite> fakeOuterCompositeSerialize(
        @Parameter(name = "body", description = "Input composite as post body") @Valid @RequestBody(required = false) OuterComposite body
    ) {
        return delegate.fakeOuterCompositeSerialize(body);
    }

    /**
     * POST /fake/outer/number
     * Test serialization of outer number types
     *
     * @param body Input number as post body (optional)
     * @return Output number (status code 200)
     * @see FakeApi#fakeOuterNumberSerialize
     */
    public ResponseEntity<BigDecimal> fakeOuterNumberSerialize(
        @Parameter(name = "body", description = "Input number as post body") @Valid @RequestBody(required = false) BigDecimal body
    ) {
        return delegate.fakeOuterNumberSerialize(body);
    }

    /**
     * POST /fake/outer/string
     * Test serialization of outer string types
     *
     * @param body Input string as post body (optional)
     * @return Output string (status code 200)
     * @see FakeApi#fakeOuterStringSerialize
     */
    public ResponseEntity<String> fakeOuterStringSerialize(
        @Parameter(name = "body", description = "Input string as post body") @Valid @RequestBody(required = false) String body
    ) {
        return delegate.fakeOuterStringSerialize(body);
    }

    /**
     * PUT /fake/body-with-file-schema
     * For this test, the body for this request much reference a schema named &#x60;File&#x60;.
     *
     * @param body  (required)
     * @return Success (status code 200)
     * @see FakeApi#testBodyWithFileSchema
     */
    public ResponseEntity<Void> testBodyWithFileSchema(
        @Parameter(name = "body", description = "", required = true) @Valid @RequestBody FileSchemaTestClass body
    ) {
        return delegate.testBodyWithFileSchema(body);
    }

    /**
     * PUT /fake/body-with-query-params
     *
     * @param query  (required)
     * @param body  (required)
     * @return Success (status code 200)
     * @see FakeApi#testBodyWithQueryParams
     */
    public ResponseEntity<Void> testBodyWithQueryParams(
        @NotNull @Parameter(name = "query", description = "", required = true) @Valid @RequestParam(value = "query", required = true) String query,
        @Parameter(name = "body", description = "", required = true) @Valid @RequestBody User body
    ) {
        return delegate.testBodyWithQueryParams(query, body);
    }

    /**
     * PATCH /fake : To test \&quot;client\&quot; model
     * To test \&quot;client\&quot; model
     *
     * @param body client model (required)
     * @return successful operation (status code 200)
     * @see FakeApi#testClientModel
     */
    public ResponseEntity<Client> testClientModel(
        @Parameter(name = "body", description = "client model", required = true) @Valid @RequestBody Client body
    ) {
        return delegate.testClientModel(body);
    }

    /**
     * POST /fake : Fake endpoint for testing various parameters  假端點  偽のエンドポイント  가짜 엔드 포인트
     * Fake endpoint for testing various parameters  假端點  偽のエンドポイント  가짜 엔드 포인트
     *
     * @param number None (required)
     * @param _double None (required)
     * @param patternWithoutDelimiter None (required)
     * @param _byte None (required)
     * @param integer None (optional)
     * @param int32 None (optional)
     * @param int64 None (optional)
     * @param _float None (optional)
     * @param string None (optional)
     * @param binary None (optional)
     * @param date None (optional)
     * @param dateTime None (optional)
     * @param password None (optional)
     * @param paramCallback None (optional)
     * @return Invalid username supplied (status code 400)
     *         or User not found (status code 404)
     * @see FakeApi#testEndpointParameters
     */
    public ResponseEntity<Void> testEndpointParameters(
        @Parameter(name = "number", description = "None", required = true) @Valid @RequestPart(value = "number", required = true) BigDecimal number,
        @Parameter(name = "double", description = "None", required = true) @Valid @RequestPart(value = "double", required = true) Double _double,
        @Parameter(name = "pattern_without_delimiter", description = "None", required = true) @Valid @RequestPart(value = "pattern_without_delimiter", required = true) String patternWithoutDelimiter,
        @Parameter(name = "byte", description = "None", required = true) @Valid @RequestPart(value = "byte", required = true) byte[] _byte,
        @Parameter(name = "integer", description = "None") @Valid @RequestPart(value = "integer", required = false) Integer integer,
        @Parameter(name = "int32", description = "None") @Valid @RequestPart(value = "int32", required = false) Integer int32,
        @Parameter(name = "int64", description = "None") @Valid @RequestPart(value = "int64", required = false) Long int64,
        @Parameter(name = "float", description = "None") @Valid @RequestPart(value = "float", required = false) Float _float,
        @Parameter(name = "string", description = "None") @Valid @RequestPart(value = "string", required = false) String string,
        @Parameter(name = "binary", description = "None") @RequestPart(value = "binary", required = false) MultipartFile binary,
        @Parameter(name = "date", description = "None") @Valid @RequestPart(value = "date", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date,
        @Parameter(name = "dateTime", description = "None") @Valid @RequestPart(value = "dateTime", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) OffsetDateTime dateTime,
        @Parameter(name = "password", description = "None") @Valid @RequestPart(value = "password", required = false) String password,
        @Parameter(name = "callback", description = "None") @Valid @RequestPart(value = "callback", required = false) String paramCallback
    ) {
        return delegate.testEndpointParameters(number, _double, patternWithoutDelimiter, _byte, integer, int32, int64, _float, string, binary, date, dateTime, password, paramCallback);
    }

    /**
     * GET /fake : To test enum parameters
     * To test enum parameters
     *
     * @param enumHeaderStringArray Header parameter enum test (string array) (optional)
     * @param enumHeaderString Header parameter enum test (string) (optional, default to -efg)
     * @param enumQueryStringArray Query parameter enum test (string array) (optional)
     * @param enumQueryString Query parameter enum test (string) (optional, default to -efg)
     * @param enumQueryInteger Query parameter enum test (double) (optional)
     * @param enumQueryDouble Query parameter enum test (double) (optional)
     * @param enumFormStringArray Form parameter enum test (string array) (optional, default to $)
     * @param enumFormString Form parameter enum test (string) (optional, default to -efg)
     * @return Invalid request (status code 400)
     *         or Not found (status code 404)
     * @see FakeApi#testEnumParameters
     */
    public ResponseEntity<Void> testEnumParameters(
        @Parameter(name = "enum_header_string_array", description = "Header parameter enum test (string array)") @RequestHeader(value = "enum_header_string_array", required = false) List<String> enumHeaderStringArray,
        @Parameter(name = "enum_header_string", description = "Header parameter enum test (string)") @RequestHeader(value = "enum_header_string", required = false, defaultValue = "-efg") String enumHeaderString,
        @Parameter(name = "enum_query_string_array", description = "Query parameter enum test (string array)") @Valid @RequestParam(value = "enum_query_string_array", required = false) List<String> enumQueryStringArray,
        @Parameter(name = "enum_query_string", description = "Query parameter enum test (string)") @Valid @RequestParam(value = "enum_query_string", required = false, defaultValue = "-efg") String enumQueryString,
        @Parameter(name = "enum_query_integer", description = "Query parameter enum test (double)") @Valid @RequestParam(value = "enum_query_integer", required = false) Integer enumQueryInteger,
        @Parameter(name = "enum_query_double", description = "Query parameter enum test (double)") @Valid @RequestParam(value = "enum_query_double", required = false) Double enumQueryDouble,
        @Parameter(name = "enum_form_string_array", description = "Form parameter enum test (string array)") @Valid @RequestPart(value = "enum_form_string_array", required = false) List<String> enumFormStringArray,
        @Parameter(name = "enum_form_string", description = "Form parameter enum test (string)") @Valid @RequestPart(value = "enum_form_string", required = false) String enumFormString
    ) {
        return delegate.testEnumParameters(enumHeaderStringArray, enumHeaderString, enumQueryStringArray, enumQueryString, enumQueryInteger, enumQueryDouble, enumFormStringArray, enumFormString);
    }

    /**
     * DELETE /fake : Fake endpoint to test group parameters (optional)
     * Fake endpoint to test group parameters (optional)
     *
     * @param requiredStringGroup Required String in group parameters (required)
     * @param requiredBooleanGroup Required Boolean in group parameters (required)
     * @param requiredInt64Group Required Integer in group parameters (required)
     * @param stringGroup String in group parameters (optional)
     * @param booleanGroup Boolean in group parameters (optional)
     * @param int64Group Integer in group parameters (optional)
     * @return Someting wrong (status code 400)
     * @see FakeApi#testGroupParameters
     */
    public ResponseEntity<Void> testGroupParameters(
        @NotNull @Parameter(name = "required_string_group", description = "Required String in group parameters", required = true) @Valid @RequestParam(value = "required_string_group", required = true) Integer requiredStringGroup,
        @Parameter(name = "required_boolean_group", description = "Required Boolean in group parameters", required = true) @RequestHeader(value = "required_boolean_group", required = true) Boolean requiredBooleanGroup,
        @NotNull @Parameter(name = "required_int64_group", description = "Required Integer in group parameters", required = true) @Valid @RequestParam(value = "required_int64_group", required = true) Long requiredInt64Group,
        @Parameter(name = "string_group", description = "String in group parameters") @Valid @RequestParam(value = "string_group", required = false) Integer stringGroup,
        @Parameter(name = "boolean_group", description = "Boolean in group parameters") @RequestHeader(value = "boolean_group", required = false) Boolean booleanGroup,
        @Parameter(name = "int64_group", description = "Integer in group parameters") @Valid @RequestParam(value = "int64_group", required = false) Long int64Group
    ) {
        return delegate.testGroupParameters(requiredStringGroup, requiredBooleanGroup, requiredInt64Group, stringGroup, booleanGroup, int64Group);
    }

    /**
     * POST /fake/inline-additionalProperties : test inline additionalProperties
     *
     * @param param request body (required)
     * @return successful operation (status code 200)
     * @see FakeApi#testInlineAdditionalProperties
     */
    public ResponseEntity<Void> testInlineAdditionalProperties(
        @Parameter(name = "param", description = "request body", required = true) @Valid @RequestBody Map<String, String> param
    ) {
        return delegate.testInlineAdditionalProperties(param);
    }

    /**
     * GET /fake/jsonFormData : test json serialization of form data
     *
     * @param param field1 (required)
     * @param param2 field2 (required)
     * @return successful operation (status code 200)
     * @see FakeApi#testJsonFormData
     */
    public ResponseEntity<Void> testJsonFormData(
        @Parameter(name = "param", description = "field1", required = true) @Valid @RequestPart(value = "param", required = true) String param,
        @Parameter(name = "param2", description = "field2", required = true) @Valid @RequestPart(value = "param2", required = true) String param2
    ) {
        return delegate.testJsonFormData(param, param2);
    }

    /**
     * PUT /fake/test-query-parameters
     * To test the collection format in query parameters
     *
     * @param pipe  (required)
     * @param ioutil  (required)
     * @param http  (required)
     * @param url  (required)
     * @param context  (required)
     * @return Success (status code 200)
     * @see FakeApi#testQueryParameterCollectionFormat
     */
    public ResponseEntity<Void> testQueryParameterCollectionFormat(
        @NotNull @Parameter(name = "pipe", description = "", required = true) @Valid @RequestParam(value = "pipe", required = true) List<String> pipe,
        @NotNull @Parameter(name = "ioutil", description = "", required = true) @Valid @RequestParam(value = "ioutil", required = true) List<String> ioutil,
        @NotNull @Parameter(name = "http", description = "", required = true) @Valid @RequestParam(value = "http", required = true) List<String> http,
        @NotNull @Parameter(name = "url", description = "", required = true) @Valid @RequestParam(value = "url", required = true) List<String> url,
        @NotNull @Parameter(name = "context", description = "", required = true) @Valid @RequestParam(value = "context", required = true) List<String> context
    ) {
        return delegate.testQueryParameterCollectionFormat(pipe, ioutil, http, url, context);
    }

    /**
     * POST /fake/{petId}/uploadImageWithRequiredFile : uploads an image (required)
     *
     * @param petId ID of pet to update (required)
     * @param requiredFile file to upload (required)
     * @param additionalMetadata Additional data to pass to server (optional)
     * @return successful operation (status code 200)
     * @see FakeApi#uploadFileWithRequiredFile
     */
    public ResponseEntity<ModelApiResponse> uploadFileWithRequiredFile(
        @Parameter(name = "petId", description = "ID of pet to update", required = true) @PathVariable("petId") Long petId,
        @Parameter(name = "requiredFile", description = "file to upload", required = true) @RequestPart(value = "requiredFile", required = true) MultipartFile requiredFile,
        @Parameter(name = "additionalMetadata", description = "Additional data to pass to server") @Valid @RequestPart(value = "additionalMetadata", required = false) String additionalMetadata
    ) {
        return delegate.uploadFileWithRequiredFile(petId, requiredFile, additionalMetadata);
    }

}
