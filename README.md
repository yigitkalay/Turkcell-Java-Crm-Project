
# 🟡 Turkcell Crm Project - GYGY 3.0 - Yigit Kalay


This project was carried out within the scope of Turkcell Youth Investment Software for the Future 3.0 Java programme. With the 120-hour course, it was decided to do the project in groups. I took part in the development process of CustomerService from start to finish in the group I was in. 

We carried out our work by creating a common organisation on GitHub. At the same time, we used it as a configuration server by creating a repository in our common github organisation. You can access the project's configuration server from  [this link](https://github.com/yigitkalay/Turkcell-Java-Crm-Project-Configurations) in my repository. In addition, we used it effectively by creating a common page on Figma to analyse the project and determine the requirements and follow the development. Each group member was responsible for the service/server that fell on him.



## Hi, I'm Yiğit! 👋 I have a little more information for you:

In this project I was involved in the development of the CustomerService from start to finish. Here are the main topics I covered during the development process:
- Creation of entities
- Configuring the database with code first with JPA Hibernate
- Establishment of DTOs
- Mapping with map struct
- Creation of services of entities
- Creation of managers and implementation of services
- Creation of controllers
- Performing validations
- Creation of business rules
- Ensuring global exception handling
- Testing via Docker

🚀 I am happy to complete CustomerService after a very instructive and developing process. It has been a very useful process for me. I spent productive time both in analysing and coding the project and in the testing phase.

🙏 At the end of the day, I would like to thank Turkcell and all those who contributed to this process. My Linkedin address if you want to take a look:

[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/yigitkalay/)
## Endpoints

The following table lists the end points that CustomerServis has. The table includes the endpoint URL, http status, request and response return values. Under the [DTOs](#dtos) heading, the contents of the request and response values are shown.

| #  | Url                                         | HttpStatus | Request                                               | Response                                                |  
|:--:|:------------------------------------------- |:----------:|:----------------------------------------------------- |:------------------------------------------------------- |
| 1  | **/api/v1/customers**                       | `PUT`      | [UpdateCustomerRequest](#updatecustomerrequest)       | [UpdateCustomerResponse](#updatecustomerresponse)       |
| 2  | **/api/v1/customers**                       | `POST`     | [AddCustomerRequest](#addcustomerrequest)             | [AddCustomerResponse](#addcustomerresponse)             |
| 3  | **/api/v1/customers/{id}**                  | `GET`      | int id                                                | [GetCustomerByIdResponse](#getcustomerbyidresponse)     |
| 4  | **/api/v1/customers/getDetailed/{id}**      | `GET`      | int id                                                | [GetCustomerDetailByIdResponse](#getcustomerdetailbyidresponse) |
| 5  | **/api/v1/customers/getAllCustomers**       | `GET`      | - | [GetAllCustomersResponse](#getallcustomersresponse)     |
| 6  | **/api/v1/customers/deletebyId/{id}**       | `DELETE`   | int id                                                | String message                                                  |
| 7  | **/api/v1/contacts**                        | `PUT`      | [UpdateContactRequest](#updatecontactrequest)         | [UpdateContactResponse](#updatecontactresponse)         |
| 8  | **/api/v1/contacts**                        | `POST`     | [AddContactRequest](#addcontactrequest)               | [AddContactResponse](#addcontactresponse)               |
| 9  | **/api/v1/contacts/{id}**                   | `GET`      | int id                                                | [GetContactByIdResponse](#getcontactbyidresponse)       |
|10  | **/api/v1/contacts/getContactByCustomerId/{id}** | `GET` | int id                                                | [GetContactByCustomerIdResponse](#getcontactbycustomeridresponse) |
|11  | **/api/v1/contacts/getAllContacts**         | `GET`      | -                                                | [GetAllContactsResponse](#getallcontactsresponse)       |
|12  | **/api/v1/addresses**                       | `PUT`      | [UpdateAddressRequest](#updateaddressrequest)         | [UpdateAddressResponse](#updateaddressresponse)         |
|13  | **/api/v1/addresses**                       | `POST`     | [AddAddressRequest](#addaddressrequest)               | [AddAddressResponse](#addaddressresponse)               |
|14  | **/api/v1/addresses/updateDefaultAddress/{id}** | `PUT` | int id                                                | String message                                                  |
|15  | **/api/v1/addresses/{id}**                  | `GET`      | int id                                                | [GetAddressByIdResponse](#getaddressbyidresponse)       |
|16  | **/api/v1/addresses/getAllAddresses**       | `GET`      | -                                                | [GetAllAddressesResponse](#getalladdressesresponse)     |
|17  | **/api/v1/addresses/getAddressByCustomerId/{id}** | `GET` | int id                                                | [GetAddressesByCustomerIdResponse](#getaddressesbycustomeridresponse) |
|18  | **/api/v1/addresses/deletebyId/{id}**       | `DELETE`   | int id                                                | String message                                                  |
|19  | **/api/v1/account**                         | `PUT`      | [UpdateAccountRequest](#updateaccountrequest)         | [UpdateAccountResponse](#updateaccountresponse)         |
|20  | **/api/v1/account**                         | `POST`     | [AddAccountRequest](#addaccountrequest)               | [AddAccountResponse](#addaccountresponse)               |
|21  | **/api/v1/account/{id}**                    | `GET`      | int id                                                | [GetAccountByIdResponse](#getaccountbyidresponse)       |
|22  | **/api/v1/account/getAllAccounts**          | `GET`      | -                                                | [GetAllAccountsResponse](#getallaccountsresponse)       |
|23  | **/api/v1/account/getAccountByCustomerId/{id}** | `GET` | int id                                                | [GetAccountByCustomerIdResponse](#getaccountbycustomeridresponse) |
|24  | **/api/v1/accounts/deletebyId/{id}**        | `DELETE`   | int id                                                | String message                                                  |
|25  | **/api/v1/searchs**                         | `POST`     | [SearchCustomerRequest](#searchcustomerrequest)       | [SearchCustomerResponse](#searchcustomerresponse)       |


## Sample Screenshots

![Get All Customers Sample Screenshot](https://github.com/yigitkalay/Turkcell-Java-Crm-Project/blob/main/screenshots/1-Customer.png)

![Add Customer Sample Screenshot](https://github.com/yigitkalay/Turkcell-Java-Crm-Project/blob/main/screenshots/2-Customer.png)

![Search Sample Screenshot](https://github.com/yigitkalay/Turkcell-Java-Crm-Project/blob/main/screenshots/3-Search.png)

![Add Account Sample Screenshot](https://github.com/yigitkalay/Turkcell-Java-Crm-Project/blob/main/screenshots/4-Account.png)

![Update Default Address Sample Screenshot](https://github.com/yigitkalay/Turkcell-Java-Crm-Project/blob/main/screenshots/5-Address.png)

![Delete Address Sample Screenshot](https://github.com/yigitkalay/Turkcell-Java-Crm-Project/blob/main/screenshots/6-Address.png)

![Update Contact Sample Screenshot](https://github.com/yigitkalay/Turkcell-Java-Crm-Project/blob/main/screenshots/7-Contact.png)



## DTOs

#### AddCustomerRequest

```java
    private String firstName;
    private String middleName;
    private String lastName;
    private String nationalityId;
    private LocalDate birthDate;
    private String motherName;
    private String fatherName;
    private String gender;
    private int user_id;
```

#### UpdateCustomerRequest

```java
    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String nationalityId;
    private LocalDate birthDate;
    private String motherName;
    private String fatherName;
    private String gender;
```

#### AddCustomerResponse

```java
    private int id;
    private String firstName;
    private String lastName;
    private int user_id;
    private boolean status;
```

#### UpdateCustomerResponse

```java
    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String nationalityId;
    private LocalDate birthDate;
    private String motherName;
    private String fatherName;
    private String gender;
    private int user_id;
```

#### GetCustomerByIdResponse

```java
    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String nationalityId;
    private LocalDate birthDate;
    private String motherName;
    private String fatherName;
    private String gender;
    private boolean status;
    private int user_id;
```
#### GetAllCustomersResponse

```java
    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String nationalityId;
    private LocalDate birthDate;
    private String motherName;
    private String fatherName;
    private String gender;
    private boolean status;
    private int user_id;
```

#### GetCustomerDetailByIdResponse

```java
    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String nationalityId;
    private LocalDate birthDate;
    private String motherName;
    private String fatherName;
    private String gender;
    private boolean status;
    private int user_id;
    private List<GetAddressesByCustomerIdResponse> addresses;
    private GetContactByCustomerIdResponse contact;
    private List<GetAccountByCustomerIdResponse> accounts;
```

#### AddContactRequest

```java
    private String email;
    private String mobilePhone;
    private String homePhone;
    private String fax;
    private int customerId;
```

#### UpdateContactRequest

```java
    private int id;
    private String email;
    private String mobilePhone;
    private String homePhone;
    private String fax;
```

#### AddContactResponse

```java
    private int id;
    private String email;
    private String mobilePhone;
    private String homePhone;
    private String fax;
    private boolean status;
    private int customerId;
```

#### UpdateContactResponse

```java
    private int id;
    private String email;
    private String mobilePhone;
    private String homePhone;
    private String fax;
    private boolean status;
    private int customerId;
```

#### GetAllContactsResponse

```java
    private int id;
    private String email;
    private String mobilePhone;
    private String homePhone;
    private String fax;
    private boolean status;
    private int customerId;
```

#### GetContactByCustomerIdResponse

```java
    private int id;
    private String email;
    private String mobilePhone;
    private String homePhone;
    private String fax;
    private boolean status;
    private int customerId;
```

#### GetContactByIdResponse

```java
    private int id;
    private String email;
    private String mobilePhone;
    private String homePhone;
    private String fax;
    private boolean status;
    private int customerId;
```

#### AddAddressRequest

```java
    private String addressName;
    private String city;
    private String district;
    private String street;
    private String houseNumber;
    private String addressDesc;
    private int customerId;
```
#### UpdateAddressRequest

```java
    private int id;
    private String addressName;
    private String city;
    private String district;
    private String street;
    private String houseNumber;
    private String addressDesc;
```
#### AddAddressResponse

```java
    private int id;
    private String addressName;
    private String city;
    private boolean defaultAddress;
    private int customerId;
```
#### GetAddressByIdResponse

```java
    private int id;
    private String addressName;
    private String city;
    private String district;
    private String street;
    private String houseNumber;
    private String addressDesc;
    private boolean defaultAddress;
    private boolean status;
    private int customerId;
```
#### GetAddressesByCustomerIdResponse

```java
    private int id;
    private String addressName;
    private String city;
    private String district;
    private String street;
    private String houseNumber;
    private String addressDesc;
    private boolean defaultAddress;
    private boolean status;
    private int customerId;
```
#### GetAllAddressesResponse

```java
    private int id;
    private String addressName;
    private String city;
    private String district;
    private String street;
    private String houseNumber;
    private String addressDesc;
    private boolean defaultAddress;
    private boolean status;
    private int customerId;
```
#### UpdateAddressResponse

```java
    private int id;
    private String addressName;
    private String city;
    private String district;
    private String street;
    private String houseNumber;
    private String addressDesc;
    private boolean defaultAddress;
    private int customerId;
```
#### AddAccountRequest

```java
    private String accountDesc;
    private int addressId;
    private int customerId;
```
#### UpdateAccountRequest

```java
    private int id;
    private String accountDesc;
    private int addressId;
```
#### AddAccountResponse

```java
    private int id;
    private int accountNumber;
    private String accountStatus;
    private String accountName;
    private String accountType;
    private String accountDesc;
    private boolean status;
    private int addressId;
    private int customerId;
```
#### GetAccountByCustomerIdResponse

```java
    private int id;
    private int accountNumber;
    private String accountStatus;
    private String accountName;
    private String accountType;
    private String accountDesc;
    private boolean status;
    private int addressId;
    private int customerId;
```
#### GetAccountByIdResponse

```java
    private int id;
    private int accountNumber;
    private String accountStatus;
    private String accountName;
    private String accountType;
    private String accountDesc;
    private boolean status;
    private int addressId;
    private int customerId;
```
#### GetAllAccountsResponse

```java
    private int id;
    private int accountNumber;
    private String accountStatus;
    private String accountName;
    private String accountType;
    private String accountDesc;
    private boolean status;
    private int addressId;
    private int customerId;
```
#### UpdateAccountResponse

```java
    private int id;
    private int accountNumber;
    private String accountStatus;
    private String accountName;
    private String accountType;
    private String accountDesc;
    private boolean status;
    private int addressId;
    private int customerId;
```
#### SearchCustomerRequest

```java
    private int id;
    private String firstName;
    private String lastName;
    private String nationalityId;
    private int accountNumber;
    private String gsmNumber;
```
#### SearchCustomerResponse

```java
    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String nationalityId;
    private String role;
```
## Learned

In this project and 120 hours of learning:
- JPA Hibernate
- N-tier Architecture
- Docker
- Spring Boot
- PostgreSQL
- Lombok
- Maven
- Netflix Eureka
- Spring Cloud
- MapStruct
and many more important things for backend developer so for me 😄

It was a process in which I learned and started to apply what I learned. I will continue to use what I have learned and increase my knowledge. Keep moving 🚀

