## Android Lib template using cookiecutter

[![Platform](https://img.shields.io/badge/platform-android-brightgreen.svg)](https://developer.android.com/index.html)
[![Language](https://img.shields.io/badge/language-ES-blue.svg)](./README.es)
[![License](https://img.shields.io/badge/license-MIT-blue.svg)](https://github.com/romellfudi/AndroidLibProject/blob/master/LICENSE)
[![Website](https://img.shields.io/website?up_message=online&url=https%3A%2F%2Fwww.romellfudi.com%2FAndroidLibProject%2F)](https://bit.ly/android_lib)

### By Romell Domínguez
[![](https://raw.githubusercontent.com/romellfudi/assets/master/favicon.ico)](https://www.romellfudi.com/)

### Requirements to use the cookiecutter template:
-----------
 - Python 2.7 or 3.6
 - [Cookiecutter Python package](http://cookiecutter.readthedocs.org/en/latest/installation.html) >= 1.4.0: This can be installed with pip by or conda depending on how you manage your Python packages:

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
    cookiecutter  gh:romellfudi/AndroidLibProject --checkout kotlin_dsl


### To develop a new kotlin project, run:
------------
    cookiecutter  gh:romellfudi/AndroidLibProject --checkout kotlin


### To develop a new java project, run:
------------
    cookiecutter  gh:romellfudi/AndroidLibProject --checkout java

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

[cookiecutter](https://github.com/audreyr/cookiecutter) template for Gradle-based Android projects.

### License
MIT. See the LICENSE file for the copyright notice.

2020, April