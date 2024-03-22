## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).


# Cycling Portal Application

## Introduction

The Cycling Portal Application is a Java-based system designed to manage cycling races, teams, and riders. It allows users to create races, add stages to races, record race results, manage teams, and track rider details.

## Features

- Add and remove riders from teams
- Create and manage teams
- Create races and add stages to races
- Record race results
- Error handling for various exceptions

## Setup and Usage

1. Open the project in your preferred IDE.
2. Build and run the application.
3. Follow the on-screen instructions to interact with the application.

## Project Structure

The project is organized into several packages:
- `cycling`: Contains classes related to the cycling domain model.
- `exceptions`: Contains custom exception classes used for error handling.
- `testing`: Contains test classes for the application.

## Usage

- To add a rider to a team, use the `addRider` method in the `CyclingPortalImpl` class.
- To create a race, use the `createRace` method in the `CyclingPortalImpl` class.
- To record race results, use the `recordRaceResult` method in the `CyclingPortalImpl` class.


