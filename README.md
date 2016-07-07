# angular-springboot-todo
TODO App based on react and spring

## Overview

Demo Install: https://ng-springboot-todo.herokuapp.com/

This is a simple TODO List App consisting of an angular Frontend based on [TodoMVC](https://github.com/tastejs/todomvc/tree/master/examples/angularjs) a SpringBoot Backend.
This is just a proof-of-concept therefore there is no database. At the moment everything is stored in memory - therefore you should not use this productive.


# Quick Start Guide

### Prerequisites

In order to use the TODO APP, you must have the following installed:

- [Git](https://git-scm.com/)
- optional: [Maven](https://maven.apache.org/) (since the project contains a wrapper)

### Installation & Startup

To install the TODO APP, simply enter the below in the terminal window:

```bash
$ git clone https://github.com/eiselems/angular-springboot-todo.git && cd angular-springboot-todo
$ ./mvnw install
```

This will install the TODO-APP components into the target directory of `your-project` directory.

### Starting the App

To start the app, make sure you're in the project directory and type `java -jar target/todo-0.0.1-SNAPSHOT.jar`
 into the terminal. This will start the SpringBoot Application.

You should get a bit of log output while the tomcat is booting with something like:

```
Tomcat started on port(s): 8080 (http)
```

Next, open your browser and enter `http://localhost:8080/`. Congrats, you're up and running!


## License

MIT License. [Click here for more information.](LICENSE.md)
