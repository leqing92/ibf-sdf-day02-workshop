## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Compile and run java code
1. compiling javac --source-path src -d bin src/*

2. running compiled class java -cp bin App

3. packing to jar jar -c -v -f day02-workshop.jar -e App . (Do inside bin folder)

4. run jar java -cp bin/day02-workshop.jar App java -cp day02-workshop.jar App

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
