# About
Kotlinの学習記録

# Structure
```
kotlin-practice
┣ atcoder
┃
┗
```
## Manage Version
```sh
# install SDKMAN!
curl -s "https://get.sdkman.io" | bash
source "$HOME/.sdkman/bin/sdkman-init.sh"

# install kotlin
sdk install kotlin <version>
```
## Auto Change Version
```sh
cd <targetDirectory>
sdk env init
echo "kotlin=<version>" >| .sdkmanrc
sdk config # open editor
# change "sdkman_auto_env=true"
```

# Contents
## atcoder
- Collection
    - List
    - Set 
    - Map