### clone a repo
git clone [remote url] ([local_dir])

### check remote url
git remote -v

### push to remote
git push (-f) [remote name]

### cancel local commit
git reset HEAD~1

### add remote
git remote add [remote name] [remote url]

### rm remote
git remote rm [remote name]

### replace local file using file in git repo
git checkout [file name]

### fetch from remote
git fetch [remote name]

### merge the local repo and the remote repo
git merge [remote name]/[remote branch]

### rm from index
git rm --cached [file to be rm]

### one commit, one line log 
git log --pretty=oneline

### to see last modifications 
git log -p -1

### view git repo visually
gitk

### view detail modification  for this commit
git log -p

### view the latest commit
git log -1

### view config infor
git config --list

### first push to a repo
git push -u origin master

### set user.name
git config --global user.name [your name here]

### show remote info
git remote show [remote name]

### switch to a branch
git branch [branch name]

### merge a branch to current branch
git merge test

### push all branches to remote
git push --all [remote name]

### stop tracking a file
git rm --cached .project

### ignore files or directories
.gitignore

### check branch infomation
git branch -v

### create and switch to a new branch
git checkout -b [new branch name here]

### delete a branch
git branch -d [branch_name] ### use -D to force delete

### check the branches that have not been merged 
git branch --no-merged

### check the branches that have been merged 
git branch --merged

### amend last commit
git commit --amend

### add tag
git tag -a [tag_name] -m [tag_description]

### list out the deleted files
git ls-files deleted
### 1. stage modified new contents of tracked files
### 2. remove files from the index if the corresponding files in the working tree have been removed.
git add -u
### read the doc about 'add' command
man git-add
git checkout -- app/res/values/strings.xml

### unstage a file
git reset HEAD [file]

### rename remote name
git remote rename origin github

### show tag
git show v1.0.1

### see info of a tag
git tag -v v1.0.1

### add a tag for some commit
git tag -a [tag_name] [commit_id, like: 5e612c5]

### push some tag to remote
git push [remote_name] [tag_name]

### push all tags to romote
git push [remote_name] tags

### check which branches have been merged
git branch --merged

### check which branches are not merged
git branch --no-merged

### show all untracked files
git status -u

### clean all untracked files
git clean -df

### discard all modified files
git checkout -- .
git log -p -1 .gitignore
gitk .gitignore

### Your branch and 'origin/master' have diverged,
git log HEAD..origin/master
git merge origin/master

### unstaging a staged file
git reset HEAD <file>

### unmodifying a modified file
git checkout -- <file>

### show diff before commtting
git commit -v


### remove all files that have the .log extension in the log/
git rm log/\*.log

### remove all files that end with ~
git rm \*~
git mv README.md r.md

### reset to some version
git reset HEAD~1

### push & update
git push -u origin master

### del a branch of remote repo
git push <remote-name> :<branch-you-want-to-delete>

### rename a remove name
git remote rename github origin

### list all commits of some author
git log --author=<author-name or email>

### list all commits of some committer
git log --committer=<committer-name or email>

### see the details before committing
git commit -v

### checkout some last version of a file
git checkout HEAD~1 <file name here>

### see last version of a file
git show HEAD~1:<file name here>

### unstage files
git rm --cached .

### push tags to remote
git push --tags <remote-name> <branch-name>

### git add . & git add -u
git add -A

### rm a file in repo
1. git filter-branch --index-filter 'git rm --cached --ignore-unmatch <full path of this file here>' --prune-empty --tag-name-filter cat -- --all
2. rm -rf .git/refs/original/
3. git reflog expire --expire=now --all
4. git gc --prune=now
5. git gc --aggressive --prune=now
