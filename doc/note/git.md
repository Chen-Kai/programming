### ¿¿tag
	$ git tag -a ¿¿¿

### ¿¿¿¿¿¿
	$ git show ¿¿¿

### ¿¿¿¿¿¿¿¿¿¿¿
	$ git tag -v ¿¿¿

### ¿¿¿¿¿¿¿¿¿tag
	$ git tag -a ¿¿¿ ¿¿¿

### ¿¿¿tag¿¿¿¿¿
	$ git push ¿¿¿ ¿¿¿

### ¿¿¿tag¿¿¿¿¿¿
	$ git push ¿¿¿ --tags

### ¿¿¿¿¿
	$ git clone ¿¿¿¿¿ ¿¿¿¿

### ¿¿¿¿URL
	$ git remote -v

### ¿¿¿¿¿
	$ git push -f -u ¿¿¿¿¿ --all

### ¿¿¿¿¿¿¿¿¿¿
	$ git reset HEAD~1

### ¿¿¿¿¿¿
	$ git remote add ¿¿ ¿¿

### ¿¿¿¿¿¿
	$ git remote rm ¿¿

### ¿¿¿¿¿
	$ git remote rename ¿¿¿ ¿¿¿

### ¿git¿¿¿¿¿¿¿¿¿¿¿¿¿
	$ git checkout -- ¿¿

### ¿¿¿¿¿¿¿¿¿
	$ git fetch ¿¿¿

### merge¿¿¿¿¿¿¿¿¿¿¿¿¿¿
	$ git merge ¿¿¿/¿¿¿

### ¿¿¿¿¿¿¿¿¿¿¿
	$ git rm --cached ¿¿

### ¿¿log¿¿¿¿¿¿¿¿
	$ git log --pretty=oneline

### ¿¿¿¿¿¿¿¿¿¿¿
	$ git log -p -1

### ¿¿gitk
	$ gitk

### ¿¿¿¿¿¿¿¿¿¿¿
	$ git log -1 -p

### ¿¿¿¿¿¿¿
	$ git log -1

### ¿¿git¿¿¿¿
	$ git config --list

### ¿¿¿¿¿
	$ git config --global user.name ¿¿

### ¿¿¿¿¿¿
	$ git remote show ¿¿¿

### ¿¿¿¿¿¿¿
	$ git branch ¿¿¿

### ¿¿¿¿¿¿
	$ git branch -v

### ¿¿¿¿¿merge¿¿¿¿¿
	$ git merge ¿¿¿

### ¿git¿¿¿¿¿¿¿¿
	$ git rm --cached .project

### ¿¿¿¿¿¿¿¿¿¿¿¿¿¿
	$ git checkout -b ¿¿¿

### ¿¿¿¿¿¿
	$ git branch -d ¿¿¿
	$ git branch -D ¿¿¿

### ¿¿¿¿¿merge¿¿¿
	$ git branch --no-merged

### ¿¿¿¿merge¿¿¿¿¿
	$ git branch --merged

### ¿¿¿¿¿¿¿¿
	$ git commit --amend


### ¿¿¿¿¿¿¿¿¿¿¿
	$ git ls-files deleted

### ¿¿index¿¿¿¿¿¿¿¿¿¿¿¿
	$ git add -u

### ¿¿¿¿¿¿¿¿¿¿
	$ git status -u

### ¿¿¿¿¿¿¿git¿¿¿¿¿¿¿¿¿
	$ git clean -df

### ¿¿¿¿commit¿¿¿¿¿
	$ git checkout -- .

### ¿¿¿¿commit¿¿¿¿¿¿¿¿¿¿¿
	$ git log -p -1 ¿¿

### ¿¿gitk¿¿¿¿¿¿¿¿
	$ gitk .gitignore

### Your branch and 'origin/master' have diverged,
	$ git log HEAD..origin/master
	$ git merge origin/master

### unstaging a staged file
	$ git reset HEAD -- ¿¿

### ¿¿¿¿¿¿¿¿¿¿¿
	$ git checkout -- ¿¿

### ¿commit¿¿¿¿¿¿¿¿
	$ git commit -v

### ¿¿log¿¿¿¿¿¿¿log¿¿¿¿¿¿
	$ git rm log/\*.log

### ¿¿¿¿¿~¿¿¿¿¿¿
	$ git rm \*~

### ¿¿¿¿¿¿¿
	$ git mv <¿¿¿> <¿¿¿>

### reset¿¿¿¿¿¿¿¿¿¿
	$ git reset HEAD~1

### push¿¿update
	$ git push -u origin master

### ¿¿¿¿¿¿¿¿
	$ git push ¿¿¿ :¿¿¿

### ¿¿¿¿¿¿¿
	$ git remote rename ¿¿¿ ¿¿¿

### ¿¿¿¿¿¿¿¿¿¿¿¿
	$ git log --author=¿¿

### ¿¿¿¿¿¿¿¿¿¿¿¿
	$ git log --committer=¿¿¿

### ¿¿¿¿¿¿¿¿¿¿¿
	$ git checkout HEAD~1 -- ¿¿

### ¿¿¿git¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿
	$ git checkout HEAD -- ¿¿

### ¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿
	$ git show HEAD~1:¿¿

### unstage ¿¿¿¿
	$ git rm --cached .

### git add . & git add -u
	$ git add -A

### ¿¿¿git¿¿¿¿¿¿¿¿¿
	$ git filter-branch --index-filter 'git rm --cached --ignore-unmatch <full path of this file here>' \
	--prune-empty --tag-name-filter cat -- --all
	$ rm -rf .git/refs/original/
	$ git reflog expire --expire=now --all
	$ git gc --prune=now
	$ git gc --aggressive --prune=now

### ¿¿¿¿git¿¿¿¿¿¿¿
	$ git ls-files

### ¿7200¿(2¿¿¿)¿¿¿¿¿
	$ git config --global credential.helper 'cache --timeout=7200'

### ¿¿¿¿¿¿¿¿¿
	$ git config --system --unset-all credential.helper

### merge project pro_x into project pro_main
	$ git remote add <pro_x name> <remote url of pro_b>
	$ git fetch <pro_x name>
	$ git merge <pro_x name>/<pro_x branch name>
	deal with conflict files manually
	$ git remote remove <pro_x name>

### ¿¿¿¿¿¿¿¿¿¿¿
	$ git diff --name-only HEAD^ HEAD

### ¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿
	$ git diff <file-path-goes-here>

### ¿¿¿¿¿¿¿¿¿¿¿git¿¿¿¿¿
	$ git diff --cached <file-path-goes-here>

### ¿¿¿¿¿¿¿¿¿¿¿¿¿¿
	$ git log --follow <file-name>
### ¿¿¿¿¿¿¿¿¿¿¿¿¿
	$ git whatchanged -1

### ¿¿HEAD¿¿¿¿
	$ git reflog

### ¿¿¿¿¿¿¿¿¿patch
	$ git format-patch -3

### ¿¿¿¿¿¿¿¿¿¿patch
	$ git format-patch HEAD@{1}..HEAD
	
### merge¿¿patch
	$ git apply <patch-file-name>

### ¿¿¿¿¿¿
	$ git revert HEAD

### ¿¿¿¿¿¿
	$ git shortlog

### ¿¿¿¿¿¿¿¿¿tag
	$ git tag -a <tag-name> <commit> -m 'messag-here'

### ¿¿¿¿
	$ git gc

### ¿¿¿¿¿¿¿¿¿¿¿¿¿
	$ git diff --name-only <commit> <commit>

### ¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿
	$ git checkout <commit> <file>

### ¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿
	$ git diff <commit> <commit> <file>

### ¿¿¿¿¿¿
	$ git config -l

### ¿¿¿¿¿¿¿¿¿¿¿¿
	$ git diff

### ¿¿¿¿¿¿¿¿¿¿¿¿¿
	$ git diff --cached

### ¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿
	$ git diff HEAD

### ¿¿HEAD¿¿¿¿6¿¿¿¿HEAD¿¿¿¿2¿¿¿¿¿¿¿¿
	$ git diff HEAD~6..HEAD~2

### ¿¿¿¿¿¿¿update¿¿¿¿¿log
	$ git log --grep=update

### ¿¿¿¿¿¿¿update¿¿¿¿¿log
	$ git log --since=2013-03-22
	$ git log --since=2.weeks

### ¿¿¿¿¿¿¿¿¿¿
	$ git reset origin/HEAD

### ¿¿¿¿tag
	$ git tag -d <tag-name>

### ¿¿¿¿¿¿¿
	$ git branch -m <old-name> <new-name>

### ¿¿¿¿¿¿¿
	$ git config --global core.editor vim
	
### ¿¿¿¿merge¿¿merge¿¿¿¿
	$ git reset --merge
	
### ¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿merge¿
	$ git push origin --force master 
	
### ¿¿¿¿¿¿¿¿
	$ git push -u origin --all   # to push up the repo for the first time

### ¿¿¿¿¿¿¿¿¿
	$ mkdir <project name>
	$ cd <project name>
	$ mkdir .git
	$ cd .git/
	$ git --bare init

### ¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿
	$ git diff HEAD

### ¿¿HEAD¿¿¿¿¿¿
	$ git reset (--hard)

### ¿¿¿¿¿¿&¿¿¿¿¿¿¿¿¿¿¿¿¿¿
	$ git fetch origin
	$ git reset --hard origin/master

### ¿¿HEAD¿¿¿¿¿¿
	$ git reset -- <file-name>

### ¿¿¿¿commit¿¿¿¿¿¿
	$ git diff HEAD^^

### ¿¿¿@¿¿¿¿#¿¿¿¿¿¿¿¿¿¿@abc#¿¿
	$ @.*#

### ¿¿¿¿
	$ git tag -d v1.16.6

### ¿¿¿¿¿¿
	$ git push origin --all

### ¿¿¿¿¿merge¿¿
	$ git mergetool

### ¿git¿¿¿¿¿¿
	$ git rm <file-name>

### ¿git¿¿¿¿¿¿¿
	$ git rm -r <folder-name>/

### ¿¿¿¿¿¿¿
	$ git mv <old-name> <new-name>

### ¿¿¿¿¿¿
	$ git revert <commit-hash> 

### ¿¿¿¿¿¿¿¿¿¿
	$ git diff '@{yesterday}'

### ¿¿¿¿¿¿¿¿¿¿
	$ git whatchanged --since='2 days ago'

### ¿¿¿¿"featured"¿¿¿
	$ git tag -l '*featured*'

### ¿¿¿¿¿commit¿¿¿¿¿¿¿¿¿
	$ git show --name-only <commit-hash>

### ¿¿¿¿¿¿¿¿¿¿¿¿commit
	$ git log -p <file-name>

### ¿¿¿¿commit¿¿¿¿¿¿¿¿
	$ git diff --name-only <hash-1> <hash-2>

### ¿¿¿¿¿¿
	$ git status
	error: bad index file sha1 signature
	fatal: index file corrupt
	¿¿¿¿¿
	1. ¿¿
	2. rm -f .git/index
	3. git reset

### merge¿¿¿
fatal: You have not concluded your merge (MERGE_HEAD exists).
Please, commit your changes before you can merge.
¿¿¿¿¿
	$ git reset --merge 

### ¿¿(¿¿)¿¿
	$ git stash

### ¿¿¿¿¿¿¿¿¿¿
	$ git stash list

### ¿¿¿¿¿¿¿
	$ git stash apply

### ¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿
	$ git stash pop

### ¿¿`git add <file>`
	$ git reset <file>

### ¿¿dev¿¿merge¿master¿¿¿¿¿¿¿¿¿¿
	$ git merge --no-ff dev

### ¿¿hash¿¿¿¿¿
	$ git cat-file -p <hash>

### ¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿
	$ git log --stat

### ¿¿HEAD¿¿¿¿¿
	$ git ls-tree HEAD

### ¿¿¿¿¿¿
	$ git cat-file -p

### ¿¿¿¿HEAD¿¿
	$ git diff HEAD

### ¿¿¿¿log
	$ git log --oneline

### ¿¿¿¿¿¿¿¿undo 'git add' ¿¿
	$ git reset HEAD

### ¿¿¿¿¿¿¿
	$ git rev-list HEAD | wc -l

### ¿¿¿¿¿¿¿(¿¿Unicode)
	$ git config --global core.quotepath false

### ¿¿¿¿
	$ git config --unset --global user.name

### ¿¿¿¿¿
	$ git commit --amend --author='name'

### ¿¿¿¿¿¿¿¿¿¿¿
	$ git blame ¿¿¿

### ¿¿master¿¿¿¿dev¿¿¿¿¿¿¿¿¿¿¿
	$ git rebase -i master

### ¿¿¿¿¿¿¿¿¿
	$ git rebase -i origin/master

### ¿¿tig
	$ sudo apt-get install tig

### ¿¿¿add, checkout, reset
	$ git add -i
	$ git checkout -p
	$ git reset -p

### Problem:
	fatal: You have not concluded your merge (MERGE_HEAD exists).
	Please, commit your changes before you can merge.
	Solution-1:
	$ rm -rf .git/MERGE*
	Solution-2:
	$ git reset --merge

### ¿¿¿¿¿¿¿¿¿¿¿
	$ git commit --amend --author="name <email>"

### ¿¿merge
	$ git reset --hard HEAD
	$ git clean -df

### ¿¿¿¿¿¿¿¿¿
	$ git rm log/\*.log
	$ git rm \*~

### ¿¿¿¿¿¿
	$ git config --global core.filemode false

### ¿¿¿¿¿¿
	$ git config --global core.autocrlf false

### ¿¿¿¿¿¿
	$ git archive -o export.zip <commit-id>

### ¿¿¿¿¿¿¿¿¿¿¿
	$ git checkout --theirs

log
¿¿¿¿
$ git log -p

¿¿¿¿¿¿
$ git log --stat

¿¿¿¿¿¿¿¿
$ git log --pretty=format:"%h - %an, %ar : %s" --graph

¿¿¿¿¿¿¿¿
$ git log --since=2.weeks

¿¿¿¿¿¿¿¿¿¿¿¿
$ git log -Sfix --oneline

¿¿¿¿¿¿¿¿¿
$ git log --author 'Jake Wharton'

¿¿¿¿¿¿
$ git shortlog -sn

¿¿¿¿
$ git shortlog --help


