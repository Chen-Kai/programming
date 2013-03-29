### set env variable
    $ vi ~/.bashrc
    $ export PATH=/home/null/dev/android/sdk/platform-tools:$PATH
    $ export PATH=/usr/lib/jvm/jdk1.6.0_32/bin:$PATH

### install Gnome in Ubuntu 12.04
    $ sudo apt-get install gnome-panel

### comparing text files with `diff` 
    $ diff --side-by-side <txt-file-a> <txt-file-b> 
    
### app
* Kazam Screencaster
* astah

### Solutions
> The package system is broken.
Check if you are using third party repositories. If so disable them, since they are a common source of problems.
Furthermore run the following command in a Terminal: apt-get install -f

    $ sudo apt-get install -f

> Requires installation of untrusted packages.
The action would require the installation of packages from not authenticated sources.

    $ sudo apt-get update
    $ sudo apt-get upgrade

