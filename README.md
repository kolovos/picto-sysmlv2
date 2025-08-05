# Visualising SysML V2 Models with Picto

This is a demonstration of using Picto to visualise SysML V2 models. To run this demo:

- Install [Epsilon 2.8 or later](https://eclipse.dev/epsilon/download/#development-tools) on top of Eclipse
- Add [SysML v2](https://github.com/Systems-Modeling/SysML-v2-Release/tree/master/install/eclipse) to your Eclipse Installation
- Clone this repository
- Import the `org.eclipse.epsilon.examples.picto.sysmlv2` project into your Eclipse workspace
- Right-click on the project and select `Run As -> Eclipse Application` 
- In the nested Eclipse workspace, import the `mbse2025-hackathon` project
- Clone the [SysML v2 repository](https://github.com/Systems-Modeling/SysML-v2-Release)
- Import the [SysML library](https://github.com/Systems-Modeling/SysML-v2-Release/tree/master/sysml.library) project into the nested workspace
- Go to the `Preferences` of the `mbse2025-hackathon` project and add `sysml.library` to `Project References`
- Open `model.sysml`
- Open the Picto view through `Window -> Show View -> Other -> Picto`
- Your Eclipse should look like this

<img width="1644" height="1176" alt="image" src="https://github.com/user-attachments/assets/ad06cd4a-2863-4567-8aec-769a885ee3fa" />
