## Fabricación de projecto Android usando cookiecutter

[![Platform](https://img.shields.io/badge/platform-android-brightgreen.svg)](https://developer.android.com/index.html)
[![Language](https://img.shields.io/badge/language-EN-blue.svg)](./README.md)
[![License](https://img.shields.io/badge/license-MIT-blue.svg)](https://github.com/romellfudi/AndroidLibProject/blob/master/LICENSE)

### por Romell Domínguez
[![](https://raw.githubusercontent.com/romellfudi/assets/master/favicon.ico)](https://www.romellfudi.com/)

[cookiecutter](https://github.com/audreyr/cookiecutter) plantilla para proyectos usando gradle.

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

## Requerimientos

- [cookiecutter](https://github.com/audreyr/cookiecutter)

## Uso

```
cookiecutter gh:romellfudi/AndroidLibProject
```

### License
MIT. See the LICENSE file for the copyright notice.

2019, Enero