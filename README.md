# Text Editor

# Overview
This is a simple text editor built using Java Swing, featuring functionalities such as searching by string, searching by regular expressions, and a file chooser. The program offers a user-friendly graphical interface.

![Screenshot 2024-07-06 013909](https://github.com/kaneki780/Text-Editor/assets/111025359/57c2e2e2-ab6a-410c-b256-c97361a43429)

# Functionality of Java Files
## 1. TextEditor.java
This is the main class that initializes the text editor application. It sets up the GUI, handles user interactions, and integrates other functionalities like file operations and search features.

## 2. FileOperations.java
Handles all file-related operations such as opening, saving, and creating new files. It manages interactions with the file system and ensures that text content is correctly read from and written to files.

![Screenshot 2024-07-06 013758](https://github.com/kaneki780/Text-Editor/assets/111025359/e5d22e76-07ec-4f6f-a4b1-7649491ba8c4)

## 3. SearchFunctionality.java
Provides the search capabilities within the text editor. This includes both simple string searches and more complex searches using regular expressions. It highlights the search results in the text area.

## 4. GUIComponents.java
Defines and organizes the various GUI components such as menus, buttons, and dialogs. This class is responsible for the layout and aesthetic aspects of the application.

## How It Works
The Text Editor application starts by launching the TextEditor class, which sets up the main window and integrates the various components. Users can open and edit text files using the FileOperations class, which handles the file I/O operations. Searching within the text is managed by the SearchFunctionality class, allowing users to find specific text or patterns within the document. The GUIComponents class ensures a cohesive and user-friendly interface by managing all the visual elements.

