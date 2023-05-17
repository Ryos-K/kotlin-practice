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

## jar_cmd
以下の構成の場合
```
jar_cmd
┗ hellojava
    ┣META-INF
    ┃   ┗MANIFEST.MF
    ┣utils
    ┃   ┗Hello.java
    ┗Main.java
```
```sh
javac hellojava/Main.java hellojava/utils/Hello.java
 -> hellojava/Main.class, hellojava/utils/Hello.class
jar -cvfm hellojava/hello.jar hellojava/META-INF/MANIFEST.MF hellojava/
```
**注意点 1 : Curent Directoryはpackageよりも上の階層でなくてはならない**  
**注意点 2 : MANIFEST.MFは最後に改行を入力しなければならない**

- options

| Option | Description |
| ------ | ----------- |
| c      | jarファイルの新規作成 | 
| v      | 詳細の出力 |
| m      | MANIFEST.MFの指定 |
| f      | 出力ファイルの指定 |
 