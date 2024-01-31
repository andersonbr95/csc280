CSC-280 Github Sign up & Repository Instructions

Your homework is going to be hosted on and handed in through Github.com, the most common version control system for teams working with code. It’s important to me as your professor to give you skills that you’ll use every day in your careers as software engineers, QA, etc. Included are instructions on how to set up a GitHub account for yourself, clone the class repository, and how to push your changes to your individual ‘branch’ to turn in your homework. 


Setting up your Github account (If you don’t already have one)

1.	Navigate to Github.com in the browser of your choice.
2.	On the homescreen of the site there should be a text box with a button labeled ‘Sign up for GitHub’ here you’ll enter the email address of your choosing. 
a.	NOTE: I’d recommend you use your personal email address for this if you’re comfortable with it, otherwise your school email will be fine. Your GitHub will act like a portfolio of programming projects that you’ve completed which will help you stand out in job interviews when the time comes.


3.	From here, you should be navigated to the first page in the GitHub account sign up workflow. Your email you entered on the previous screen should carry over, if it didn’t, just type it in again. Following this you’ll enter a password (please create a strong password) and then your username (I typically just use the header from my email).
a.	Note: Don’t worry about receiving emails from them, just do the account verification and you’ll be good.


 

4.	Following this, you’ll need to enter the One Time Password(OTP) sent to the email you used for your account. 

 

5.	You’ll then be taken to the personalization preference, you’re welcome to skip these but if you want to fill them out there’s no harm in that. 
 

6.	After that you’ve successfully set up your own GitHub account, congrats!


Cloning the Class Repository into your IDE

1.	Open a terminal instance on your machine 

2.	Use the following command to clone the repository onto your machine

git clone https://github.com/andersonbr95/csc280.git 

a.	Note: If you’re planning on using your personal machine for your homework I would recommend making a separate directory on your machine to house all of your programming projects. You can accomplish this with the following steps:

mkdir directoryName

cd directoryName

git clone https://github.com/andersonbr95/csc280.git


 
3.	Open your IDE (I’ll be demonstrating with IntelliJ)
4.	Select ‘Open Project’ and navigate to the location where you cloned the git repo and select ‘Open’
5.	The project should open no issues and you’re free to start coding!


Creating your own ‘Branch’ of the Repository to submit homework
Note: I’ll be using IntelliJ in these instructions

1.	While you’ve got your project opened navigate to IntelliJ’s Settings menu


2.	In the settings menu find the section titled ‘Version Control’ and navigate to the subsection labeled ‘GitHub’  

3.	Select ‘Add account…’ and select ‘Log in via Github’ 

4.	You’ll then be asked to authorize Github for your IntelliJ 
5.	After you select ‘Authorize in GitHub’ you should receive a message similar to this. (I’m using a Mac to create these instructions so the messaging may not be 1:1 but the work steps should be near identical. 

 
6.	Before closing out of the settings menu, you should see your account in the GitHub section. After this is confirmed, select ‘ Apply’ and then ‘OK’. 


NOTE: If you’re using your personal machine, you will only need to do steps 1-6 one time. If you’re using a school sanctioned machine, you may need to do these steps every time, I’m sorry the inconvenience there. 

7.	After this, locate at the top the branch navigation menu and hit the drop down  
8.	While in the branch navigation drop down, find the ‘main’ branch and select arrow on the right which will bring up another menu to the right of the branch navigation. In this new menu, select ‘New Branch from ‘main’….’
 

9.	You’ll then be prompted to create a branch name from ‘main’. I would like you to use the following naming convention. After this, select ‘Create’
sp24csc280-module#-lastName

 


10.	You should now see your newly created branch name in the branch navigation menu.

 

11.	You are now free to write the code needed to complete your homework assignment/test. 
12.	After you’re finished writing your code, you’ll perform what is called a ‘commit’ to the branch. This is essentially saving your code to the version of your branch that’s local to your machine. To perform a commit please do the following.
a.	Either use key’s CMD+K (Mac) or Ctrl+K (Windows) or open the commit menu on the left side of the IDE. 
 
b.	In the commit menu, make sure the files that you want to saved with the commit are selected. You will then need to make sure that you have a commit message written. These are a short little documentation of what the code you’re committing does. After you’re finished writing your commit message, select Commit or Commit & Push (Pushing will be explained in the following steps).

  

Note: Anything you don’t have committed will not be saved and you will lose this work. If you feel more comfortable saving your work to a flash drive as a back up at this point, feel free to. 

c.	If you select Push & Commit, the push menu will automatically pop up. Make sure the commits you have created are in the push. (Notice how the commit message I just created in there.) Once you can confirm this hit ‘Push’ and continue onto Step #14 
If you only hit ‘Commit’ this absolutely fine and, is in fact the way we do it most often in the industry on a day to day basis. Keep following the steps and you’ll be okay.

13.	Navigate back to the branch navigation menu and select your branch. You will then select ‘Push’ from this secondary menu on the right. 
 

You’ll then confirm that your commit message that you’ve created is here. Once you confirm this, select ‘Push’ and your code will be all set!

 

14.	Your code is now successfully pushed to the repository, congrats! (should see a successful push notification in the IDE). What a push does, is it takes your code that you’ve worked on (which at this point is only saved locally) and moves it to the main repository which exists remotely for anyone with access to the repository to access. 
 

Submitting your homework

1.	When you’re satisfied and would like to submit your homework, just send a message in the assignment page on Canvas with your branch name.

Note: I understand that this is a new skill for most, if not all of you. That said, if you feel more comfortable sending me a .zip file containing your code that’s absolutely fine, I just ask that you at least attempt the branching method with GitHub, it’ll be a great skill to have and show off as entry level employees when you enter the work force.
