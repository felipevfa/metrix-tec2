# Metrix

[![Build Status](https://travis-ci.org/felipevfa/metrix-tec2.svg?branch=development)](https://travis-ci.org/felipevfa/metrix-tec2) [![codecov](https://codecov.io/gh/felipevfa/metrix-tec2/branch/development/graph/badge.svg)](https://codecov.io/gh/felipevfa/metrix-tec2)

Metrix is a metric extractor for code. It takes in your project's source code and returns a set of quality metrics that help you assert your project's code quality.

**Note:** This project was organized as part of the [CK0236 Programming Techniques II (in pt-br)](http://cc.ufc.br/curso/matriz-curricular/?cod=CK0236) course taught at the Computer Science degree at Federal University of Ceará by [Dr. Lincoln Rocha (in pt-br)](http://cc.ufc.br/curso/corpo-docente/lincoln). 

## Getting Started

### Prerequisites

Please make sure you have [Apache Maven installed](https://maven.apache.org/install.html) before downloading the project.

### Installing

If you have Git installed, you may clone the project by typing in the terminal:

```git clone https://github.com/felipevfa/metrix-tec2.git```

Or download the project by clicking in "Clone or Download > Download ZIP".


After downloading MetriX, navigate to it's folder and build it with Maven:

```mvn package```

Finally, you can run MetriX by issuing the command:

```java -jar metrix input-project-path [output-file-name]```


See the [Wiki](https://github.com/felipevfa/metrix-tec2/wiki) for more information about the extracted metrics and the project itself.

## Running the tests

Run all tests with Maven by typing ```mvn test``` in the terminal. This will run all tests and generate a JaCoCo code-coverage report in the ```target```folder.

## Code Quality

To assert code quality, you man run the ```mvn site``` command, which will generate a page inside the ```target``` folder containing all the code quality reports for the project (namely JaCoCo, PMD and FindBugs reports).

## Contributing

Please read [CONTRIBUTING.md](CONTRIBUTING.md) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/felipevfa/metrix-tec2/tags). 

## Contributors

See the list of [contributors](https://github.com/felipevfa/metrix-tec2/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.
