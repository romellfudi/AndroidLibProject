## Fabricación de projecto Android usando cookiecutter

[![Platform](https://img.shields.io/badge/platform-android-brightgreen.svg)](https://developer.android.com/index.html)
[![](https://img.shields.io/badge/language-EN-blue.svg)](./)

### por Romell Domínguez
[![](snapshot/icono.png#favico)](https://www.romellfudi.com/)

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
                └── cookiecutter.lib_package_dir
                    └── ExampleUnitTest.java
```

## Requerimientos

- [cookiecutter](https://github.com/audreyr/cookiecutter)

## Usar

```
cookiecutter gh:romellfudi/AndroidLibProject
```
