## Fabricación de librerías Android usando cookiecutter

[![Platform](https://img.shields.io/badge/platform-android-brightgreen.svg)](https://developer.android.com/index.html)
[![Language](https://img.shields.io/badge/language-EN-blue.svg)](./)
[![License](https://img.shields.io/badge/license-MIT-blue.svg)](https://github.com/romellfudi/AndroidLibProject/blob/master/LICENSE)
[![Website](https://img.shields.io/website?up_message=online&url=https%3A%2F%2Fwww.romellfudi.com%2FAndroidLibProject%2F)](https://bit.ly/android_lib)
[![Coockiecutter Testing](https://github.com/romellfudi/AndroidLibProject/actions/workflows/environment.yml/badge.svg)](https://github.com/romellfudi/AndroidLibProject/actions/workflows/environment.yml)

### por Romell Domínguez
[![](https://raw.githubusercontent.com/romellfudi/assets/master/favicon.ico)](https://www.romellfudi.com/)

### Requerimientos para usar la plantilla de cookiecutter:
-----------
 - Python 2.7 or 3.6
 - [Cookiecutter Python package](http://cookiecutter.readthedocs.org/en/latest/installation.html) >= 1.4.0: Esta librería debe ser instalado mediante `pip` or mediante el gestor de paquete de Python `anaconda`:

``` bash
$ pip install cookiecutter
```

or

``` bash
$ conda config --add channels conda-forge
$ conda install cookiecutter
```
### To develop a new kotlin DSL project, run:
------------
    cookiecutter  gh:romellfudi/AndroidLibProject --checkout kotlin

### To develop a new kotlin DSL project, run:
------------
    cookiecutter  gh:romellfudi/AndroidLibProject --checkout kotlin_dsl


### To develop a new java project, run:
------------
    cookiecutter  gh:romellfudi/AndroidLibProject --checkout java

## Project Organization in Java & Kotlin

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
│       │           └── ExampleInstrumentedTest
│       └── main
│           ├── AndroidManifest.xml
│           ├── java
│           │   └── package_dir
│           │       └── MainActivity
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
        │   │       ├── APICache
        │   │       ├── APIException
        │   │       ├── Api
        │   │       ├── ApiAbstract
        │   │       ├── Callback
        │   │       ├── DataResponse
        │   │       └── Module
        │   └── res
        └── test
            └── java
                └── lib_package_dir
                    └── ExampleUnitTest
```

## Project Organization in Kotlin DSL

```
.
├── LICENSE
├── README.md
├── app
│   ├── build.gradle.kts
│   ├── proguard-rules.pro
│   └── src
│       ├── androidTest
│       │   └── java
│       │       └── package_dir
│       │           └── ExampleInstrumentedTest.kt
│       └── main
│           ├── AndroidManifest.xml
│           ├── assets
│           │   └── seed
│           │       ├── options.json
│           │       └── questions.json
│           ├── java
│           │   └── package_dir
│           │       ├── App.kt
│           │       ├── data
│           │       ├── di
│           │       ├── model
│           │       ├── ui
│           │       └── util
│           └── res
├── build.gradle.kts
├── gradle
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradle.properties
├── gradlew
├── gradlew.bat
├── ktlint.gradle.kts
├── local.properties
├── settings.gradle.kts
└── lib_name
    ├── build.gradle.kts
    ├── proguard-rules.pro
    └── src
        ├── main
        │   ├── AndroidManifest.xml
        │   ├── java
        │   │   └── lib_package_dir
        │   │       ├── APICache.kt
        │   │       ├── APIException.kt
        │   │       ├── Api.kt
        │   │       ├── ApiAbstract.kt
        │   │       ├── Callback.kt
        │   │       ├── DataResponse.kt
        │   │       └── Module.kt
        │   └── res
        │       └── values
        │           └── strings.xml
        └── test
            └── java
                └── lib_package_dir
                    └── ExampleUnitTest.kt
```

[cookiecutter](https://github.com/audreyr/cookiecutter) plantilla para proyectos usando gradle.

### License
MIT. See the LICENSE file for the copyright notice.

Updated
2021, March