##### clone a repo
    $ git clone <remote url> (<local_dir>)

##### check remote url
    $ git remote -v

##### push to remote
    $ git push (-f) <remote name>

##### cancel local commit
    $ git reset HEAD~1

##### add remote
    $ git remote add <remote name> <remote url>

##### rm remote
    $ git remote rm <remote name>

##### remove a remote
    $ git remote remove <remote name>

##### replace local file using file in git repo
    $ git checkout <file name>

##### fetch from remote
    $ git fetch <remote name>

##### merge the local repo and the remote repo
    $ git merge <remote name>/<remote branch>

##### rm from index
    $ git rm --cached <file to be rm>

##### one commit, one line log 
    $ git log --pretty=oneline

##### to see last modifications 
    $ git log -p -1

##### view git repo visually
    $ gitk

##### view detail modification  for this commit
    $ git log -p

##### view the latest commit
    $ git log -1

##### view config infor
    $ git config --list

##### first push to a repo
    $ git push -u origin master

##### set user.name
    $ git config --global user.name <your name here>

##### show remote info
    $ git remote show <remote name>

##### switch to a branch
    $ git branch <branch name>

##### merge a branch to current branch
    $ git merge test

##### push all branches to remote
    $ git push --all <remote name>

##### stop tracking a file
    $ git rm --cached .project

##### check branch infomation
    $ git branch -v

##### create and switch to a new branch
    $ git checkout -b <new branch name here>

##### delete a branch
    $ git branch -d(D) <branch_name>

##### check the branches that have not been merged 
    $ git branch --no-merged

##### check the branches that have been merged 
    $ git branch --merged

##### amend last commit
    $ git commit --amend

##### add tag
    $ git tag -a <tag_name>

##### list out the deleted files
    $ git ls-files deleted

##### 1.stage modified new contents of tracked files
##### 2.remove files from the index if the corresponding files in the working tree have been removed.
    $ git add -u

##### checkout a file in repo
    $ git checkout -- app/res/values/strings.xml

##### unstage a file
    $ git reset HEAD <file full path>

##### rename remote name
    $ git remote rename origin github

##### show tag
    $ git show <tag name>

##### see info of a tag
    $ git tag -v <tag name>

##### add a tag for some commit
    $ git tag -a <tag_name> <commit_id, like: 5e612c5>

##### push some tag to remote
    $ git push <remote_name> <tag_name>

##### push all tags to romote
    $ git push <remote_name> tags

##### check which branches have been merged
    $ git branch --merged

##### check which branches are not merged
    $ git branch --no-merged

##### show all untracked files
    $ git status -u

##### clean all untracked files
    $ git clean -df

##### discard all modified files
    $ git checkout -- .

##### show the modification in last commit
    $ git log -p -1 .gitignore

##### view a file visually
    $ gitk .gitignore

##### Your branch and 'origin/master' have diverged,
    $ git log HEAD..origin/master
    $ git merge origin/master

##### unstaging a staged file
    $ git reset HEAD <file>

##### unmodifying a modified file
    $ git checkout -- <file>

##### show diff before commtting
    $ git commit -v

##### remove all files that have the .log extension in the log/
    $ git rm log/\*.log

##### remove all files that end with ~
    $ git rm \*~

##### rename a file
    $ git mv <old name> <new name>

##### reset to some version
    $ git reset HEAD~1

##### push & update
    $ git push -u origin master

##### del a branch of remote repo
    $ git push <remote-name> :<branch-you-want-to-delete>

##### rename a remove name
    $ git remote rename <old name> <new name>

##### list all commits of some author
    $ git log --author=<author-name or email>

##### list all commits of some committer
    $ git log --committer=<committer-name or email>

##### checkout some last version of a file
    $ git checkout HEAD~1 <file name here>

##### see last version of a file
    $ git show HEAD~1:<file name here>

##### unstage files
    $ git rm --cached .

##### push tags to remote
    $ git push --tags <remote-name> <branch-name>

##### git add . & git add -u
    $ git add -A

##### rm a file in repo
    $ git filter-branch --index-filter 'git rm --cached --ignore-unmatch <full path of this file here>' \
    --prune-empty --tag-name-filter cat -- --all
    $ rm -rf .git/refs/original/
    $ git reflog expire --expire=now --all
    $ git gc --prune=now
    $ git gc --aggressive --prune=now

##### Show information about files in the index and the working tree
    $ git ls-files

##### let git cache your user name & password for an hour
    $ git config --global credential.helper 'cache --timeout=3600'

##### merge project pro_x in to project pro_main
    $ git remote add <pro_x name> <remote url of pro_b>
    $ git fetch <pro_x name>
    $ git merge <pro_x name>/<pro_x branch name>
    deal with conflict files manually
    $ git remote remove <pro_x name>

##### List all files in last commit.
    $ git diff --name-only HEAD^ HEAD

##### Show differences of a file between `working dir` and `index`  
    $ git diff <file-path-goes-here>

##### Show differences of a file between `index` and `git repository`  
    $ git diff --cached <file-path-goes-here>

##### List all commits that changed a specific file:
    $ git log --follow <file-name>

##### List all changed files in last commit
    $ git whatchanged -1

##### View commit hash after checking out an old version:
    $ git reflog

##### Rollback a file to earlier version
    $ 

##### Extract three topmost commits from the current branch and format them as e-mailable patches:
    $ git format-patch -3

##### Generate patch file from some commits
    $ git format-patch HEAD@{1}..HEAD
    
##### Apply a patch file
    $ git apply <patch-file-name>

##### Revert last commit
    $ git revert HEAD

##### Count your commits
    $ git shortlog

##### Create a tag against some commit
    $ git tag <tag-name> <commit>

##### Cleanup
    $ git gc

##### show all changed files between two commits
    $ git diff --name-only <commit> <commit>

##### checkout a file in some commit
    $ git checkout <commit> <file>

##### show diff of a file between two commits
    $ git diff <commit> <commit> <file>

##### check the configurations
    $ git config -l

##### Compare working dir with the index
    $ git diff

##### Compare index and last commit
    $ git diff --cached

##### Compare working dir with last commit
    $ git diff HEAD

##### unstage all files
    $ git reset

##### unstage some file
    $ git reset -- <file> 

##### show what changed between last 6 and last 2 commits
	$ git diff HEAD~6..HEAD~2
git log --grep=update
git log --since=2013-03-22

##### reset using remote HEAD
	$ git reset origin/HEAD
