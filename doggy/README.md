# com.mrdoggyapp.doggyapi - Kotlin client library for Doggy API

## Requires

* Kotlin 1.4.30
* Gradle 6.8.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountApi* | [**apiAccountRegisterPost**](docs/AccountApi.md#apiaccountregisterpost) | **POST** /api/account/register | 
*AccountApi* | [**apiAccountResetPasswordPost**](docs/AccountApi.md#apiaccountresetpasswordpost) | **POST** /api/account/reset-password | 
*AccountApi* | [**apiAccountSendPasswordResetCodePost**](docs/AccountApi.md#apiaccountsendpasswordresetcodepost) | **POST** /api/account/send-password-reset-code | 
*FileApi* | [**apiAppFilePreSignUrlPost**](docs/FileApi.md#apiappfilepresignurlpost) | **POST** /api/app/file/pre-sign-url | 
*FileApi* | [**apiAppFileUploadCredentialsGet**](docs/FileApi.md#apiappfileuploadcredentialsget) | **GET** /api/app/file/upload-credentials | 
*ItemApi* | [**apiAppItemGet**](docs/ItemApi.md#apiappitemget) | **GET** /api/app/item | 
*ItemApi* | [**apiAppItemIdDelete**](docs/ItemApi.md#apiappitemiddelete) | **DELETE** /api/app/item/{id} | 
*ItemApi* | [**apiAppItemIdGet**](docs/ItemApi.md#apiappitemidget) | **GET** /api/app/item/{id} | 
*ItemApi* | [**apiAppItemIdPut**](docs/ItemApi.md#apiappitemidput) | **PUT** /api/app/item/{id} | 
*ItemApi* | [**apiAppItemPost**](docs/ItemApi.md#apiappitempost) | **POST** /api/app/item | 
*ItemApi* | [**apiAppItemSpecialItemsGet**](docs/ItemApi.md#apiappitemspecialitemsget) | **GET** /api/app/item/special-items | 
*KeyValueApi* | [**apiAppKeyValueBoolGet**](docs/KeyValueApi.md#apiappkeyvalueboolget) | **GET** /api/app/key-value/bool | 
*KeyValueApi* | [**apiAppKeyValueDateTimeGet**](docs/KeyValueApi.md#apiappkeyvaluedatetimeget) | **GET** /api/app/key-value/date-time | 
*KeyValueApi* | [**apiAppKeyValueDecimalGet**](docs/KeyValueApi.md#apiappkeyvaluedecimalget) | **GET** /api/app/key-value/decimal | 
*KeyValueApi* | [**apiAppKeyValueDoubleGet**](docs/KeyValueApi.md#apiappkeyvaluedoubleget) | **GET** /api/app/key-value/double | 
*KeyValueApi* | [**apiAppKeyValueIntGet**](docs/KeyValueApi.md#apiappkeyvalueintget) | **GET** /api/app/key-value/int | 
*KeyValueApi* | [**apiAppKeyValueSetBoolPost**](docs/KeyValueApi.md#apiappkeyvaluesetboolpost) | **POST** /api/app/key-value/set-bool | 
*KeyValueApi* | [**apiAppKeyValueSetDateTimePost**](docs/KeyValueApi.md#apiappkeyvaluesetdatetimepost) | **POST** /api/app/key-value/set-date-time | 
*KeyValueApi* | [**apiAppKeyValueSetDecimalPost**](docs/KeyValueApi.md#apiappkeyvaluesetdecimalpost) | **POST** /api/app/key-value/set-decimal | 
*KeyValueApi* | [**apiAppKeyValueSetDoublePost**](docs/KeyValueApi.md#apiappkeyvaluesetdoublepost) | **POST** /api/app/key-value/set-double | 
*KeyValueApi* | [**apiAppKeyValueSetIntPost**](docs/KeyValueApi.md#apiappkeyvaluesetintpost) | **POST** /api/app/key-value/set-int | 
*KeyValueApi* | [**apiAppKeyValueSetStringPost**](docs/KeyValueApi.md#apiappkeyvaluesetstringpost) | **POST** /api/app/key-value/set-string | 
*KeyValueApi* | [**apiAppKeyValueStringGet**](docs/KeyValueApi.md#apiappkeyvaluestringget) | **GET** /api/app/key-value/string | 
*LoginApi* | [**apiAccountCheckPasswordPost**](docs/LoginApi.md#apiaccountcheckpasswordpost) | **POST** /api/account/check-password | 
*LoginApi* | [**apiAccountLoginPost**](docs/LoginApi.md#apiaccountloginpost) | **POST** /api/account/login | 
*LoginApi* | [**apiAccountLogoutGet**](docs/LoginApi.md#apiaccountlogoutget) | **GET** /api/account/logout | 
*NoteApi* | [**apiAppNoteNoteSpecsGet**](docs/NoteApi.md#apiappnotenotespecsget) | **GET** /api/app/note/note-specs | 
*ProfileApi* | [**apiAccountMyProfileChangePasswordPost**](docs/ProfileApi.md#apiaccountmyprofilechangepasswordpost) | **POST** /api/account/my-profile/change-password | 
*ProfileApi* | [**apiAccountMyProfileGet**](docs/ProfileApi.md#apiaccountmyprofileget) | **GET** /api/account/my-profile | 
*ProfileApi* | [**apiAccountMyProfilePut**](docs/ProfileApi.md#apiaccountmyprofileput) | **PUT** /api/account/my-profile | 
*SettingsApi* | [**apiAppSettingsGet**](docs/SettingsApi.md#apiappsettingsget) | **GET** /api/app/settings | 
*SettingsApi* | [**apiAppSettingsSetPost**](docs/SettingsApi.md#apiappsettingssetpost) | **POST** /api/app/settings/set | 
*SmsApi* | [**apiAppSmsSendChangePhoneCodePost**](docs/SmsApi.md#apiappsmssendchangephonecodepost) | **POST** /api/app/sms/send-change-phone-code | 
*SmsApi* | [**apiAppSmsSendLoginCodePost**](docs/SmsApi.md#apiappsmssendlogincodepost) | **POST** /api/app/sms/send-login-code | 
*TagApi* | [**apiAppTagGet**](docs/TagApi.md#apiapptagget) | **GET** /api/app/tag | 
*TagApi* | [**apiAppTagIdDelete**](docs/TagApi.md#apiapptagiddelete) | **DELETE** /api/app/tag/{id} | 
*TagApi* | [**apiAppTagIdGet**](docs/TagApi.md#apiapptagidget) | **GET** /api/app/tag/{id} | 
*TagApi* | [**apiAppTagIdPut**](docs/TagApi.md#apiapptagidput) | **PUT** /api/app/tag/{id} | 
*TagApi* | [**apiAppTagPost**](docs/TagApi.md#apiapptagpost) | **POST** /api/app/tag | 
*TodoApi* | [**apiAppTodoGet**](docs/TodoApi.md#apiapptodoget) | **GET** /api/app/todo | 
*TodoApi* | [**apiAppTodoIdDelete**](docs/TodoApi.md#apiapptodoiddelete) | **DELETE** /api/app/todo/{id} | 
*TodoApi* | [**apiAppTodoIdGet**](docs/TodoApi.md#apiapptodoidget) | **GET** /api/app/todo/{id} | 
*TodoApi* | [**apiAppTodoIdPut**](docs/TodoApi.md#apiapptodoidput) | **PUT** /api/app/todo/{id} | 
*TodoApi* | [**apiAppTodoPost**](docs/TodoApi.md#apiapptodopost) | **POST** /api/app/todo | 


<a name="documentation-for-models"></a>
## Documentation for Models

 - [com.mrdoggyapp.doggyapi.models.AbpLoginResult](docs/AbpLoginResult.md)
 - [com.mrdoggyapp.doggyapi.models.ActionApiDescriptionModel](docs/ActionApiDescriptionModel.md)
 - [com.mrdoggyapp.doggyapi.models.AppTheme](docs/AppTheme.md)
 - [com.mrdoggyapp.doggyapi.models.AppThemePlatformSettings](docs/AppThemePlatformSettings.md)
 - [com.mrdoggyapp.doggyapi.models.ApplicationApiDescriptionModel](docs/ApplicationApiDescriptionModel.md)
 - [com.mrdoggyapp.doggyapi.models.ApplicationAuthConfigurationDto](docs/ApplicationAuthConfigurationDto.md)
 - [com.mrdoggyapp.doggyapi.models.ApplicationConfigurationDto](docs/ApplicationConfigurationDto.md)
 - [com.mrdoggyapp.doggyapi.models.ApplicationFeatureConfigurationDto](docs/ApplicationFeatureConfigurationDto.md)
 - [com.mrdoggyapp.doggyapi.models.ApplicationLocalizationConfigurationDto](docs/ApplicationLocalizationConfigurationDto.md)
 - [com.mrdoggyapp.doggyapi.models.ApplicationSettingConfigurationDto](docs/ApplicationSettingConfigurationDto.md)
 - [com.mrdoggyapp.doggyapi.models.BooleanKeyValue](docs/BooleanKeyValue.md)
 - [com.mrdoggyapp.doggyapi.models.BooleanSetKeyValueDto](docs/BooleanSetKeyValueDto.md)
 - [com.mrdoggyapp.doggyapi.models.ChangePasswordInput](docs/ChangePasswordInput.md)
 - [com.mrdoggyapp.doggyapi.models.ClockDto](docs/ClockDto.md)
 - [com.mrdoggyapp.doggyapi.models.ControllerApiDescriptionModel](docs/ControllerApiDescriptionModel.md)
 - [com.mrdoggyapp.doggyapi.models.ControllerInterfaceApiDescriptionModel](docs/ControllerInterfaceApiDescriptionModel.md)
 - [com.mrdoggyapp.doggyapi.models.CreateUpdateItemDto](docs/CreateUpdateItemDto.md)
 - [com.mrdoggyapp.doggyapi.models.CreateUpdateTagDto](docs/CreateUpdateTagDto.md)
 - [com.mrdoggyapp.doggyapi.models.CreateUpdateTodoDto](docs/CreateUpdateTodoDto.md)
 - [com.mrdoggyapp.doggyapi.models.CurrentCultureDto](docs/CurrentCultureDto.md)
 - [com.mrdoggyapp.doggyapi.models.CurrentTenantDto](docs/CurrentTenantDto.md)
 - [com.mrdoggyapp.doggyapi.models.CurrentUserDto](docs/CurrentUserDto.md)
 - [com.mrdoggyapp.doggyapi.models.DateTimeFormatDto](docs/DateTimeFormatDto.md)
 - [com.mrdoggyapp.doggyapi.models.DateTimeKeyValue](docs/DateTimeKeyValue.md)
 - [com.mrdoggyapp.doggyapi.models.DateTimeSetKeyValueDto](docs/DateTimeSetKeyValueDto.md)
 - [com.mrdoggyapp.doggyapi.models.DecimalKeyValue](docs/DecimalKeyValue.md)
 - [com.mrdoggyapp.doggyapi.models.DecimalSetKeyValueDto](docs/DecimalSetKeyValueDto.md)
 - [com.mrdoggyapp.doggyapi.models.DisplayStyle](docs/DisplayStyle.md)
 - [com.mrdoggyapp.doggyapi.models.DoubleKeyValue](docs/DoubleKeyValue.md)
 - [com.mrdoggyapp.doggyapi.models.DoubleSetKeyValueDto](docs/DoubleSetKeyValueDto.md)
 - [com.mrdoggyapp.doggyapi.models.EmailSettingsDto](docs/EmailSettingsDto.md)
 - [com.mrdoggyapp.doggyapi.models.EntityExtensionDto](docs/EntityExtensionDto.md)
 - [com.mrdoggyapp.doggyapi.models.ExtensionEnumDto](docs/ExtensionEnumDto.md)
 - [com.mrdoggyapp.doggyapi.models.ExtensionEnumFieldDto](docs/ExtensionEnumFieldDto.md)
 - [com.mrdoggyapp.doggyapi.models.ExtensionPropertyApiCreateDto](docs/ExtensionPropertyApiCreateDto.md)
 - [com.mrdoggyapp.doggyapi.models.ExtensionPropertyApiDto](docs/ExtensionPropertyApiDto.md)
 - [com.mrdoggyapp.doggyapi.models.ExtensionPropertyApiGetDto](docs/ExtensionPropertyApiGetDto.md)
 - [com.mrdoggyapp.doggyapi.models.ExtensionPropertyApiUpdateDto](docs/ExtensionPropertyApiUpdateDto.md)
 - [com.mrdoggyapp.doggyapi.models.ExtensionPropertyAttributeDto](docs/ExtensionPropertyAttributeDto.md)
 - [com.mrdoggyapp.doggyapi.models.ExtensionPropertyDto](docs/ExtensionPropertyDto.md)
 - [com.mrdoggyapp.doggyapi.models.ExtensionPropertyUiDto](docs/ExtensionPropertyUiDto.md)
 - [com.mrdoggyapp.doggyapi.models.ExtensionPropertyUiFormDto](docs/ExtensionPropertyUiFormDto.md)
 - [com.mrdoggyapp.doggyapi.models.ExtensionPropertyUiLookupDto](docs/ExtensionPropertyUiLookupDto.md)
 - [com.mrdoggyapp.doggyapi.models.ExtensionPropertyUiTableDto](docs/ExtensionPropertyUiTableDto.md)
 - [com.mrdoggyapp.doggyapi.models.FeatureDto](docs/FeatureDto.md)
 - [com.mrdoggyapp.doggyapi.models.FeatureGroupDto](docs/FeatureGroupDto.md)
 - [com.mrdoggyapp.doggyapi.models.FeatureProviderDto](docs/FeatureProviderDto.md)
 - [com.mrdoggyapp.doggyapi.models.FileDto](docs/FileDto.md)
 - [com.mrdoggyapp.doggyapi.models.FindTenantResultDto](docs/FindTenantResultDto.md)
 - [com.mrdoggyapp.doggyapi.models.GetFeatureListResultDto](docs/GetFeatureListResultDto.md)
 - [com.mrdoggyapp.doggyapi.models.GetPermissionListResultDto](docs/GetPermissionListResultDto.md)
 - [com.mrdoggyapp.doggyapi.models.IStringValueType](docs/IStringValueType.md)
 - [com.mrdoggyapp.doggyapi.models.IValueValidator](docs/IValueValidator.md)
 - [com.mrdoggyapp.doggyapi.models.IanaTimeZone](docs/IanaTimeZone.md)
 - [com.mrdoggyapp.doggyapi.models.IdentityRoleCreateDto](docs/IdentityRoleCreateDto.md)
 - [com.mrdoggyapp.doggyapi.models.IdentityRoleDto](docs/IdentityRoleDto.md)
 - [com.mrdoggyapp.doggyapi.models.IdentityRoleDtoListResultDto](docs/IdentityRoleDtoListResultDto.md)
 - [com.mrdoggyapp.doggyapi.models.IdentityRoleDtoPagedResultDto](docs/IdentityRoleDtoPagedResultDto.md)
 - [com.mrdoggyapp.doggyapi.models.IdentityRoleUpdateDto](docs/IdentityRoleUpdateDto.md)
 - [com.mrdoggyapp.doggyapi.models.IdentityUserCreateDto](docs/IdentityUserCreateDto.md)
 - [com.mrdoggyapp.doggyapi.models.IdentityUserDto](docs/IdentityUserDto.md)
 - [com.mrdoggyapp.doggyapi.models.IdentityUserDtoPagedResultDto](docs/IdentityUserDtoPagedResultDto.md)
 - [com.mrdoggyapp.doggyapi.models.IdentityUserUpdateDto](docs/IdentityUserUpdateDto.md)
 - [com.mrdoggyapp.doggyapi.models.IdentityUserUpdateRolesDto](docs/IdentityUserUpdateRolesDto.md)
 - [com.mrdoggyapp.doggyapi.models.Int32KeyValue](docs/Int32KeyValue.md)
 - [com.mrdoggyapp.doggyapi.models.Int32SetKeyValueDto](docs/Int32SetKeyValueDto.md)
 - [com.mrdoggyapp.doggyapi.models.ItemDto](docs/ItemDto.md)
 - [com.mrdoggyapp.doggyapi.models.ItemDtoPagedResultDto](docs/ItemDtoPagedResultDto.md)
 - [com.mrdoggyapp.doggyapi.models.ItemThumbDto](docs/ItemThumbDto.md)
 - [com.mrdoggyapp.doggyapi.models.ItemType](docs/ItemType.md)
 - [com.mrdoggyapp.doggyapi.models.LanguageInfo](docs/LanguageInfo.md)
 - [com.mrdoggyapp.doggyapi.models.LocalizableStringDto](docs/LocalizableStringDto.md)
 - [com.mrdoggyapp.doggyapi.models.LoginResultType](docs/LoginResultType.md)
 - [com.mrdoggyapp.doggyapi.models.MethodParameterApiDescriptionModel](docs/MethodParameterApiDescriptionModel.md)
 - [com.mrdoggyapp.doggyapi.models.ModuleApiDescriptionModel](docs/ModuleApiDescriptionModel.md)
 - [com.mrdoggyapp.doggyapi.models.ModuleExtensionDto](docs/ModuleExtensionDto.md)
 - [com.mrdoggyapp.doggyapi.models.MultiTenancyInfoDto](docs/MultiTenancyInfoDto.md)
 - [com.mrdoggyapp.doggyapi.models.NameValue](docs/NameValue.md)
 - [com.mrdoggyapp.doggyapi.models.NoteSpecDto](docs/NoteSpecDto.md)
 - [com.mrdoggyapp.doggyapi.models.ObjectExtensionsDto](docs/ObjectExtensionsDto.md)
 - [com.mrdoggyapp.doggyapi.models.ParameterApiDescriptionModel](docs/ParameterApiDescriptionModel.md)
 - [com.mrdoggyapp.doggyapi.models.PermissionGrantInfoDto](docs/PermissionGrantInfoDto.md)
 - [com.mrdoggyapp.doggyapi.models.PermissionGroupDto](docs/PermissionGroupDto.md)
 - [com.mrdoggyapp.doggyapi.models.Priority](docs/Priority.md)
 - [com.mrdoggyapp.doggyapi.models.ProfileDto](docs/ProfileDto.md)
 - [com.mrdoggyapp.doggyapi.models.PropertyApiDescriptionModel](docs/PropertyApiDescriptionModel.md)
 - [com.mrdoggyapp.doggyapi.models.ProviderInfoDto](docs/ProviderInfoDto.md)
 - [com.mrdoggyapp.doggyapi.models.RegisterDto](docs/RegisterDto.md)
 - [com.mrdoggyapp.doggyapi.models.RemoteServiceErrorInfo](docs/RemoteServiceErrorInfo.md)
 - [com.mrdoggyapp.doggyapi.models.RemoteServiceErrorResponse](docs/RemoteServiceErrorResponse.md)
 - [com.mrdoggyapp.doggyapi.models.RemoteServiceValidationErrorInfo](docs/RemoteServiceValidationErrorInfo.md)
 - [com.mrdoggyapp.doggyapi.models.ResetPasswordDto](docs/ResetPasswordDto.md)
 - [com.mrdoggyapp.doggyapi.models.ReturnValueApiDescriptionModel](docs/ReturnValueApiDescriptionModel.md)
 - [com.mrdoggyapp.doggyapi.models.SendPasswordResetCodeDto](docs/SendPasswordResetCodeDto.md)
 - [com.mrdoggyapp.doggyapi.models.SendSmsCodeDto](docs/SendSmsCodeDto.md)
 - [com.mrdoggyapp.doggyapi.models.SettingsDto](docs/SettingsDto.md)
 - [com.mrdoggyapp.doggyapi.models.SpecialItemDto](docs/SpecialItemDto.md)
 - [com.mrdoggyapp.doggyapi.models.SpecialItems](docs/SpecialItems.md)
 - [com.mrdoggyapp.doggyapi.models.StringKeyValue](docs/StringKeyValue.md)
 - [com.mrdoggyapp.doggyapi.models.StringSetKeyValueDto](docs/StringSetKeyValueDto.md)
 - [com.mrdoggyapp.doggyapi.models.TagDto](docs/TagDto.md)
 - [com.mrdoggyapp.doggyapi.models.TagDtoPagedResultDto](docs/TagDtoPagedResultDto.md)
 - [com.mrdoggyapp.doggyapi.models.TenantCreateDto](docs/TenantCreateDto.md)
 - [com.mrdoggyapp.doggyapi.models.TenantDto](docs/TenantDto.md)
 - [com.mrdoggyapp.doggyapi.models.TenantDtoPagedResultDto](docs/TenantDtoPagedResultDto.md)
 - [com.mrdoggyapp.doggyapi.models.TenantUpdateDto](docs/TenantUpdateDto.md)
 - [com.mrdoggyapp.doggyapi.models.TimeZone](docs/TimeZone.md)
 - [com.mrdoggyapp.doggyapi.models.TimingDto](docs/TimingDto.md)
 - [com.mrdoggyapp.doggyapi.models.TodoDto](docs/TodoDto.md)
 - [com.mrdoggyapp.doggyapi.models.TodoDtoPagedResultDto](docs/TodoDtoPagedResultDto.md)
 - [com.mrdoggyapp.doggyapi.models.TypeApiDescriptionModel](docs/TypeApiDescriptionModel.md)
 - [com.mrdoggyapp.doggyapi.models.UpdateEmailSettingsDto](docs/UpdateEmailSettingsDto.md)
 - [com.mrdoggyapp.doggyapi.models.UpdateFeatureDto](docs/UpdateFeatureDto.md)
 - [com.mrdoggyapp.doggyapi.models.UpdateFeaturesDto](docs/UpdateFeaturesDto.md)
 - [com.mrdoggyapp.doggyapi.models.UpdatePermissionDto](docs/UpdatePermissionDto.md)
 - [com.mrdoggyapp.doggyapi.models.UpdatePermissionsDto](docs/UpdatePermissionsDto.md)
 - [com.mrdoggyapp.doggyapi.models.UpdateProfileDto](docs/UpdateProfileDto.md)
 - [com.mrdoggyapp.doggyapi.models.UploadCredentials](docs/UploadCredentials.md)
 - [com.mrdoggyapp.doggyapi.models.UserData](docs/UserData.md)
 - [com.mrdoggyapp.doggyapi.models.UserDataListResultDto](docs/UserDataListResultDto.md)
 - [com.mrdoggyapp.doggyapi.models.UserLoginInfo](docs/UserLoginInfo.md)
 - [com.mrdoggyapp.doggyapi.models.WindowsTimeZone](docs/WindowsTimeZone.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="oauth2"></a>
### oauth2

- **Type**: OAuth
- **Flow**: accessCode
- **Authorization URL**: https://api.doggy.code2code.cn/connect/authorize
- **Scopes**: 
  - Doggy: Doggy API

