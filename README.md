# Steps to follow
1. Fork this repository, you will see a fork button as mentioned in the image
![image](https://github.com/Kishor-C/activities-repo/assets/32559275/6f5f850b-539a-4660-a46b-5bc661e30a2d)

2. Now go to your account dashboard, you will see a copy of this repoistory in your account, you can click on your repositories(click on your account at the top right) to see the copy of the repository you forked
3. Click on that repository link, where you will see the content of the repository and a green button called <>Code as show in the image, click on the <>Code button to see the URL
![image](https://github.com/Kishor-C/activities-repo/assets/32559275/9c6dcac9-85eb-4583-9a5b-91fea7af0cbc)
4. Copy that url and open the Git bash terminal in your machine, ensure you are opening a folder which is not part of any existing repository
5. In the Git bash terminal enter the following command & hit enter, replace  &lt;url-copied&gt; with the URL what you copied from the &lt;&gt;Code button
   ```
   git clone <url-copied>
   ```
7. You must see a folder getting created which will have the same name of the repository you have in your account
8. Save your projects inside this repository
9. Once you are done with the project, push this project to your account following the below steps
10. Open Git bash terminal in your machine inside the parent folder of the repository, parent folder is the folder which will have the name of the repository, if you are in any other location it may not work as expected
11. Enter below git commands in the Git bash terminal
    ```
    git add .
    # make sure you have entered a dot after git add & there's a space between git, add and a dot
    git commit -m 'some message to describe what you are saving'
    example: git commit -m 'final project'
    git push -u origin master
    ```
13. Now you must able to see the final project pushed in the Git Hub account
    Note: If you are using Git Bash for the first time, you will be asked to authenticate, you have to provide the required credentials and then perform the git commit & git push
