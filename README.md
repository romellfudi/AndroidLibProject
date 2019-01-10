## Android Lib project using cookiecutter

[![Platform](https://img.shields.io/badge/platform-android-brightgreen.svg)](https://developer.android.com/index.html)
[![Language](https://img.shields.io/badge/language-ES-blue.svg)](./README.es)
[![License](https://img.shields.io/badge/license-MIT-blue.svg)](https://github.com/romellfudi/AndroidLibProject/blob/master/LICENSE)

### By Romell Domínguez
[![](snapshot/icono.png#favico)](https://www.romellfudi.com/)

[cookiecutter](https://github.com/audreyr/cookiecutter) template for Gradle-based Android projects.

## Project Organization

```
.
app_name
├── LICENSE
├── README.md
├── app
│   ├── build.gradle
│   ├── proguard-rules.pro
│   └── src
│       ├── androidTest
│       │   └── java
│       │       └── package_dir
│       │           └── ExampleInstrumentedTest.java
│       └── main
│           ├── AndroidManifest.xml
│           ├── java
│           │   └── cookiecutter.package_dir
│           │       └── MainActivity.java
│           └── res
├── build.gradle
├── gradle
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradle.properties
├── gradlew
├── gradlew.bat
├── settings.gradle
└── lib_name
    ├── build.gradle
    ├── proguard-rules.pro
    └── src
        ├── main
        │   ├── AndroidManifest.xml
        │   ├── java
        │   │   └── lib_package_dir
        │   │       ├── APICache.java
        │   │       ├── APIException.java
        │   │       ├── Api.java
        │   │       ├── ApiAbstract.java
        │   │       ├── Callback.java
        │   │       ├── DataResponse.java
        │   │       └── Module.java
        │   └── res
        └── test
            └── java
                └── lib_package_dir
                    └── ExampleUnitTest.java
```

## Requirements

- [cookiecutter](https://github.com/audreyr/cookiecutter)

## Usage

```
cookiecutter gh:romellfudi/AndroidLibProject
```

### License
MIT. See the LICENSE file for the copyright notice.

2019, January