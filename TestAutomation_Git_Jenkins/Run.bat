mkdir bin
javac -sourcepath src -d bin src/test_git_jenkins/*.java
java -cp bin/ test_git_jenkins.Program
pause