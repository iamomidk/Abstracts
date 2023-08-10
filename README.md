# API Presenter

An abstract API presenter framework for efficient API calls using Retrofit and Coroutines in Kotlin.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Usage](#usage)
- [API Service](#api-service)
- [Error Handling](#error-handling)
- [Contributing](#contributing)
- [License](#license)

## Introduction

API Presenter is a Kotlin library that provides a convenient way to make API calls using Retrofit and Coroutines. It abstracts the repetitive tasks of making API requests and handling responses, allowing developers to focus on the core logic of their application.

## Features

- Abstracts API call logic using Retrofit and Coroutines
- Built-in error handling with customizable error messages
- Supports handling various types of errors and exceptions
- Provides a modular and flexible structure for API integration

## Getting Started

### Prerequisites

- Kotlin (1.5+)
- Retrofit (2.x)
- kotlinx.coroutines (1.x)

### Installation

1. Add the following dependencies to your app's `build.gradle` file:

```groovy
implementation 'com.squareup.retrofit2:retrofit:2.x'
implementation 'com.squareup.retrofit2:converter-gson:2.x'
implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-core:1.x'
implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.x'
```

2. Copy and integrate the provided `BaseApiPresenter`, `ApiErrorHandler`, and other classes into your project.

## Usage

1. Create your Retrofit `ApiService` interface.
2. Implement your own `ApiResponseHandler` to handle different API responses.
3. Set up the `ApiErrorHandler` for handling errors and exceptions.
4. Use the `BaseApiPresenter` to make API calls efficiently.

## API Service

Define your Retrofit `ApiService` interface with endpoints and expected response models. For example:

```kotlin
interface ApiService {
    @GET("data")
    suspend fun getData(): Response<MyData>
}
```

## Error Handling

The `ApiErrorHandler` provides a way to handle API errors and exceptions. You can customize error messages for different HTTP error codes and common exceptions.

```kotlin
class DefaultApiErrorHandler : ApiErrorHandler {
    // ...
}
```

## Contributing

Contributions are welcome! If you'd like to contribute to My API Presenter.

## License

This project is licensed under the [MIT License](LICENSE).
