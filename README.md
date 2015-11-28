# Servlets example using the Gradle Jetty plugin

[![Build Status](https://travis-ci.org/acamino/servlets-quickstart.svg?branch=master)](https://travis-ci.org/acamino/servlets-quickstart)

This gude wil show how to build a web application with Jetty, using Gradle as
the build Tool.

## Prerequisites
* Java and Git.
* An installed version of Postgres to run the application locally.

## Local Development

1. Clone this repository and `cd` into its directory:
   ```bash
   $ git clone git@github.com:acamino/servlets-quickstart.git
   $ cd servlets-quickstart
   ```

2. Create the database.
   ```bash
   $ createdb servlets_quickstart
   ```

3. Edit the sample configuration file `.environment` to match your configuration.

   Once you have edited the `.environment` file, if you are using a UNIX operating system,
   just use the `source` command to load the variables into your environment:

   ```bash
   $ source .environment
   ```

   _If you are using a different operating system, make sure that all the
   variables from the `.environment` file are loaded into your environment._

4. Execute the migrations.
   ```bash
   $ ./gradlew flywayMigrate
   ```

5. Run the application.
   ```bash
   $ ./gradew jettyRun
   ```

6. Check it out at [http://localhost:8080](http://localhost:8080)

That's it!

## Issues & Support

Please [file tickets](https://github.com/acamino/servlets-quickstart/issues) for
bug or problems.

## Contributing

Edits and enhancements are welcome. Just fork the repository, make your changes
and send me a pull request.
