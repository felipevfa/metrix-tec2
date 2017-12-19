# Metrix

[![Build Status](https://travis-ci.org/felipevfa/metrix-tec2.svg?branch=development)](https://travis-ci.org/felipevfa/metrix-tec2)

Metrix is a metric extractor for code. It takes in your project's source code and returns a set of quality metrics that help you assert your project's code quality.
(This project was done in the context of the discipline "Técnicas de programação II".)

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

You need to install Maven, if you don't have yet:

* [Installing Apache Maven](https://maven.apache.org/install.html)

### Installing

A step by step series of examples that tell you have to get a development env running

First, clone the project

* HTTPS:
```
git clone https://github.com/felipevfa/metrix-tec2.git
```
* SSH:
```
git clone git@github.com:felipevfa/metrix-tec2.git
```

And second, build it with Maven

```
mvn package
```

Now, run (See [wiki](https://github.com/felipevfa/metrix-tec2/wiki) for more information about metrics and other stuff)

* Example:
```
java -jar metrix input-project-path [output-file-name]
```

## Running the tests

To run all tests with Maven

```
mvn test
```

## Contributing

Please read [CONTRIBUTING.md](CONTRIBUTING.md) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/felipevfa/metrix-tec2/tags). 

## Contributors

See the list of [contributors](https://github.com/felipevfa/metrix-tec2/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.
