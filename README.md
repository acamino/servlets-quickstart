# Servlets Example Using the Gradle Jetty Plugin

[![Build Status](https://travis-ci.org/acamino/servlets-quickstart.svg?branch=master)](https://travis-ci.org/acamino/servlets-quickstart)

This guide will show you how to build a servlets application with Gradle and
the Jetty Plugin.

## Prerequisites

- Java and Git.
- An installed version of Postgres to run the application locally.

## Local Development

1. First clone this repository and `cd` into it.

   ```bash
   $ git clone git@github.com:acamino/servlets-quickstart.git
   $ cd servlets-quickstart
   ```

1. Create the database.

   ```bash
   $ createdb servlets_quickstart
   ```

1. Copy the `.env.example` file to `.env`, and edit it including your credentials.
   Run `source .env` to export the environment variables.

1. Run the migrations.

   ```bash
   $ ./gradlew flywayMigrate
   ```

1. Start the server.

   ```bash
   $ ./gradew jettyRun
   ```

1. Check it out at http://localhost:8080

## Issues & Support

Please [file tickets](https://github.com/acamino/servlets-quickstart/issues) for
bug or problems.

## Contributing

Edits and enhancements are welcome. Just fork the repository, make your changes
and send me a pull request.
