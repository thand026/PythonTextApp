# imports
import re
import random
#functions
def blank():
    print("")

def errorHandling(userInput,instruction, function, success, error):
    userInput = input(instruction)
    if function(userInput):
        print(success)
        return userInput
    else:
        while not function(userInput):
            print(error)
            userInput = input(instruction)
        return userInput

def isUsernameValid(username):
    if len(username) >=5 and "_" in username:
        return True
    else:
        return False

def isCellNrValid(cellNr):
    regex = r"\+\d{1,3}\d{9}"
    if re.match(regex, cellNr):
        return True
    else:
        return False

def isPasswordValid(password):
    passwordPattern = r'^(?=.*[A-Z])(?=.*[^a-zA-Z0-9]).{8,}$'
    if re.match(passwordPattern, password):
        return True
    else:
        return False

def loginCredentialsMatch(UserUsername, UserPassword):
    if UserUsername == username and UserPassword == password:
        print("Login Successful! \n Welcome " + name + " " + surname + "\nIt is great to see you\n")
        return True
    else:
        print("Username and/or password are incorrect \nPlease try again\n")
        return False

def sendMessage():
    blank();print("\n==       SEND MESSAGE        ==");blank()
    numMessages = int( input("How many messages would you like to send? \n"))
    for i in range(1, (numMessages+1), 1):
        print("Message nr: " + str(i))

        #random number generator for message ID
        messageID = ''.join([str(random.randint(0, 9)) for _ in range(10)])

        recName = input("Enter the name of the recepient you wish to send a message to: \n")
        
        recNr = errorHandling("", "Enter the cellphone number of the recepient " + recName + ":  \n", isCellNrValid,"",
                              "Cell phone number incorrectly formatted or does not contain international code \n Try Again")
        
        textMessage = errorHandling("", "Type your message:\n", isMessageLengthValid,"Message sent!","Message is too long (250 characters max) \nTry again\n")

def showSentMessagesBeta():
    print("This feature is still in development and will be coming soon")

def isMessageLengthValid(message):
    if len(message)<250:
        return True
    else:
        return False

def exitApplication():
    print("Exiting Application \n Thank you for Using the chat application")

# Start

#Registration
print("==   Welcome new User!   ==")
name = input("Please enter your name: \n")
# name = "Theo"
surname = input("Please enter your Surname:  \n")
# surname = "Bald"

blank()

# create username
username = errorHandling("", "Create a username: (5 Characters and underscore(_) \n",isUsernameValid, "Username captured successfully!", "Invalid Username\n" \
"Please ensure that your username has an underscore(_) and is no more than 5 characters\nTry again")
username = "th_eo"

#Create Password
password = errorHandling("", "Create a password: \n", isPasswordValid, "Password created successfully!", "Invalid password\n" \
"Passwor must be a minimum of 8 characters, contain a capital letter, and a special character\nTry again")



print("==       WELCOME TO THE LOGIN PAGE!      ==")

# login loop:
loginLoop = True
while loginLoop is True:
    loginUsername = input("Enter your username: \n")    
    loginPassword = input("Enter your password: \n")
    if loginCredentialsMatch(loginUsername, loginPassword):
        loginLoop = False

#End of phase 1

# start of phase 2

blank(); print("==       WELCOME TO QUICK CHAT!      =="); blank()

isApplicationRunning = True

while isApplicationRunning is True:
    choice = 0

    print("What would you like to do now? \n" \
    "1) Send Message \n2) Show recently sent messages (coming soon) \n" \
    "3) Exit \n Please pick an option (1-3)")
    choice = input("")

    if choice == "1":
        sendMessage();
    elif choice == "2":
        showSentMessagesBeta();
    elif choice == "3":
        exitApplication();
        isApplicationRunning = False
    else:
        print("Invalid input")

# end of phase 2:



