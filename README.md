# Formative1_JD522


Hey there! 👋

Welcome to the formativeLogin project, where I've built a Java Swing application to handle user registration and login. This project is all about creating a simple yet effective GUI for users to manage their accounts. Here's a breakdown of what this project does and how it meets the requirements.

## What This Project Does
### User Registration
You can create a new account by filling in a username, password, first name, and last name. The application checks if:

* Username: Contains a # and is no more than 8 characters long.

* Password: Meets these requirements:
  * At least 8 characters long
  * Contains at least one capital letter
  * Includes a number
  * Has at least one special character

 
If your username and password meet these criteria, you'll get a success message.
If not, you'll get detailed feedback to help you fix the issues.

### User Login
Once you're registered, you can log in with your credentials. The system will:

* Show a congratulatory message if your login is successful, pulling in your first and last name automatically.
* Display an error message if your login fails, asking you to try again.

## How It Works

### Placeholder Text
The text fields for username, password, first name, and last name have placeholder text like "Enter Username" that disappears when you start typing. This makes it clear what information is needed.
```
private void registerUserTxtFieldFocusGained(java.awt.event.FocusEvent evt) {
    if (registerUserTxtField.getText().equals("Enter Username")) {
        registerUserTxtField.setText("");
        registerUserTxtField.setForeground(new Color(0, 0, 0));
    }
}
```

### Registration Logic
When you register, the app validates your inputs and stores your information if everything checks out.
```
public boolean regUser(String username, String password, String firstName, String lastName) {
    if (correctUserName(username) && meetPasswordComplexity(password) && isNameFieldsEmpty(firstName, lastName)) {
        registeredUsers.add(new User(username, password, firstName, lastName));
        JOptionPane.showMessageDialog(null, "Successfully registered", "Success", JOptionPane.INFORMATION_MESSAGE);
        return true;
    } else {
        JOptionPane.showMessageDialog(null, "Registration failed", "Failed", JOptionPane.ERROR_MESSAGE);
        return false;
    }
}
```

### Login Logic
Logging in checks your credentials and shows the appropriate message based on whether the login is successful.
```
public String returnLogin(String username, String password) {
    if (login(username, password)) {
        return "Congratulations " + this.firstName + " " + this.lastName + ",\n"
                + " You have made it to the second year.\n"
                + "Wishing you all the best";
    } else {
        return "Incorrect credentials have been supplied, try again.";
    }
}
```

## Running the Project
1. Clone this repository to your local machine.
2. Open it in NetBeans or your favorite Java IDE.
3. Run the main method in the formativeLogin class to launch the application.

## Additional Notes
* I've kept everything in a single class (formativeLogin) for simplicity.
* All user data is managed in an ArrayList.
* The GUI uses Java Swing components with the Nimbus Look and Feel for a modern touch.

Feel free to explore the code, make improvements, or just use it as a reference for your own projects. If you have any questions or feedback, don't hesitate to reach out!

Happy coding! 🚀
