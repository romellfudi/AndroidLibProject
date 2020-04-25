## Android Lib project using cookiecutter

[![Platform](https://img.shields.io/badge/platform-android-brightgreen.svg)](https://developer.android.com/index.html)
[![Language](https://img.shields.io/badge/language-ES-blue.svg)](./README.es)
[![License](https://img.shields.io/badge/license-MIT-blue.svg)](https://github.com/romellfudi/AndroidLibProject/blob/master/LICENSE)

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


### To start a new project, run:
------------

    cookiecutter  gh:romellfudi/AndroidLibProject

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
│           │   └── package_dir
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

[cookiecutter](https://github.com/audreyr/cookiecutter) template for Gradle-based Android projects.

## Check Dagger-MVP-Interator [sources](https://github.com/romellfudi/AndroidLibProject/releases/download/Rev07/sources.zip) & [res](https://github.com/romellfudi/AndroidLibProject/releases/download/Rev07/sources.zip)

### License
MIT. See the LICENSE file for the copyright notice.

2019, January