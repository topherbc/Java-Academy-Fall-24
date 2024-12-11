# Git Merging

In groups of 4, each member will play an important roll in the management of a git repository!

Decide who will be Team Member 1, 2, etc. Keep this role for entire exercise.

Each member must share their screen at the time of their instructions.

## Git branching the remote way - Pull Requests

### Team member 1

1. Create an empty repository in GitHub.
2. Initialize the repository on your local computer
3. `touch` a `MainClass.java` file
4. Open the file and Paste the following code into that file
   ```java
      public class MainClass {
         public static void main(String[] args) {
         
         }
      }
   ```
5. Finish the steps of adding, committing, git branch -M main, git remote add, and push as the instructions state in your empty repository in GitHub


### Team member 2

1. Receive repository link and git clone the repo to your local computer
2. Add `System.out.println("Hello World");` 
3. Perform the usual add, commit, and push


### Team member 3

1. Navigate to the repository in GitHub and confirm the changes
2. After confirmation, pull down the repository to your local machine
3. Run the following commands
   1. `git branch new_feature_v1`
   2. `git checkout new_feature_v1`
   3. Confirm you have switched branches by running `git status`
4. Update the println to say "Hello Class!"
5. Perform the usual add, commit, and push
   1. When pushing a branch the first time, you will need to run the command `git push --set-upstream origin new_feature_v1` where 'new_feature_v1' is your branch name


### Team member 4 / or Team member 1

1. Open and display the GitHub repository
2. Click the "Pull Request" tab
3. Click "New Pull Request"
4. Select the 'new_feature_v1' as the 'compare' branch
   1. it should be main <- new_feature_v1 
5. Click "Create Pull Request"
   1. After it brings to a screen to provide information on the PR
   2. Keep as default or update with information
6. Click "Create Pull Request"
7. After GitHub has checked for conflicts
8. Hit Merge Pull Request


### All Team members

1. In your local repository, if you are on the main branch
   1. run git pull
2. In your local repository, if you are in the new_feature_v1 branch
   1. ensure you have no new changes
      1. In this case, run `git checkout main` then `git pull`
   2. If you have changes, you will need to add, commit, push, and create a new PR


### Team member 4 or 1

1. Confirm in the remote repository that when looking at the main branch, you see "Hello Class!"
   1. If you don't, call your teacher to your room


## Git branching the manual way - with conflicts


### Team member 2

1. In your local repository
   1. Ensure you are on the main branch
   2. If you aren't, checkout to main
2. Update the MainClass.java file with the following code under the existing 'println'
   1. `System.out.println(2 + 2);`
   2. Add, commit, push


### Team member 3

1. In your local repository
   1. Ensure you are on the main branch
   2. If you aren't, checkout to main
2. DO NOT git pull
3. run `git checkout new_feature_v2`
4. Update the MainClass.java file with the following code under the existing 'println'
   1. `System.out.println(4 + 4);`
   2. Add, commit, push
      1. When pushing a branch the first time, you will need to run the command `git push --set-upstream origin new_feature_v2` where 'new_feature_v2' is your branch name


### Team member 2

1. In your local repository, in your main branch
2. Update the recent system out with "6 + 6"
3. Add, commit, push


### Team member 3

1. In your local repository, in your main branch
2. Run `git pull origin new_feature_v2`, If this fails, run `git pull` and try again
3. With the team observe the error/conflict


This will be due to changes being diverted from one branch to another. This is bad practice.

1. Run `git branch -D new_feature_v2`
   1. This will delete the branch that was created. If this fails, run `git pull` and try again


### Team member 4 or 1

1. Confirm in the remote repository that when looking at the main branch, you see "6 + 6"
   1. If you don't, call your teacher to your room


## Git branching the manual way - without conflicts


### Team member 4 or 1

1. In your local repository, on your main branch, run `git pull`
2. Then run `git branch new_feature_v3`
3. and `git checkout new_feature_v3`
4. Run `git status` to confirm you've switched branches
5. Update `MainClass.java` to include a new println statement with a nice message
6. Add, commit, push
7. Run `git checkout main`
8. Then `git pull origin new_feature_v3`
9. Then `git push`


### Team member 2

1. Confirm in the remote repository that when looking at the main branch, you see the new message
   1. If you don't, call your teacher to your room