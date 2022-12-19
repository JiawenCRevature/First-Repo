pwd - print working directory show current directory.

ls to see files/directories in current working directory

ls -a to see hidden files/folders as well

mkdir to create a folder

cd to change directory

clear will clear the console without removing the old commands/outputs

rm to remove a file  ex: rm fileName

mv to rename a file ex: mv originFilename newFileName

touch will create a file

cat will print the content of a file to the console

up arrow will pull up previous commands

use the down arrow if you miss the command you wanted using the up arrow

echo will print your input into the console

> can be used to save the output of the echo command into a file. adding another info to same file will replace entire info to your newly added info           
 Example: echo "this is info" > example-file 

>> does the same thing as a single >, but it appends content instead of replacing it     
Example: echo "this is info" >> example-file   (new info will beadd to next line)

cd ../ is a reference to the parent directory(go up a directory)

vim filename will enter edit mode of your file. click i to start inserting information and click esc to exit insert then save by using :wq

:q to just exit the vim and not save.

:q! to force quit without any added changes made.

cd ~  or cd  to go to home directory

. {script} to execute the script EX: . my-script.sh

cd ./filename

single . represents the current directory, useful if you want to be explicit about changing directories

double dot .. is a reference to the parent directory

grep can be used to search through a file for specified text

grep specifiedtext filename that you want to search    ex: grep imporant important note

Instead of manpulate with data directly, use variable to assign a data.

greeting="hello world" (greeting is the variable name and "hello world" is the value)#make sure not to have whitespace between the variable, =, or value being saved

echo $greeting  (print the greeting to console.) #put a $ before the variable name to indicate you are referencing a variable

Math in bash
numOne=10
numTwo=15
echo $numOne + $numTwo # this will print "10 + 15" to the console. not doing math.
echo $((numOne + numTwo)) #this will output 25 (warp the variables in doule (()) and put the $ outside of it if you want to perform basic calculations and return the results)

sum=$((numOne + numTwo)) # this save result to variable sum
echo $sum  #this will output 25 as well (dont forget to add $ sign)

! Bash does not support floating point values. (10.2 + 3.7) this will fail!
floatOne=10.8
floatTwo=3.7
## An easy way to get floating point values is to use the bc command alongside a echo command to pass the relevant data into the bc command

## scale tells bc how many decimal places to calaculate, and then you provide the equation you want calculated (In this case, you tell bc that you only want one value after decimal point)
result=$(echo "scale=1; $floatOne + $floatTwo" | bc) #This output floating point value
echo result  ## you will get 14.5

Loop in bash

## loop through range
for num in {0..10}  ## looping condition(starting number inclusive..ending number inclusive..increment amount) ex: {0..10..2} this mean increase 2 per time 
do 
    echo $num    #what to do in loop goes here
done ## this indicate loop is done here

## loop through text content in a file below
story=$(cat textfilename)
echo $story ##output content in your textfile without formating. By output a formated content, use echo "$story"

for line in $story
do
    echo $line
done
## this output each word of text file in a line

IFS=$'\n' # surround the value you want to use as a delimiter with $''
for line in $story
do
    echo $line
done
## this will ouput each line of your text file on console.

## While loop
controlVariable=0
while [ $controlVariable -lt 11 ] ## lt stand for less than. Space is needed!!!
do
    echo $controlVariable   ## stuff to do
    ((controlVariable++))
done ## output from 0 to 10

## until loop
## until loop trigger when condition is false until it turn true. (opposite to while)
until [ $controlVariable -eq 21 ] ## -eq means equal to
do
    echo $controlVariable
    ((controlVariable++))
done

## if statement
numOne=10
numTwo=5

if [ $numOne -gt $numTwo ]
then
    echo "number one is greater than number two"
elif [ $numOne -eq $numTwo ]
then
    echo "num one and two are same"
else 
    echo "number two is greater than number one"
fi

## grep command
httpCodes=$(grep Status fake-logs.log | cut -f 4 -d , | cut -f 2 -d :)
## -f check the field you are looking for. In this case, "Status" is in 4th place of commas
## -d It is delimiter that use to separate the text. 
httpRequestTotal=0
httpFailures=0

for status in $httpCodes
do
    ((httpRequestTotal++))
    if [ $status -eq 500 ]
    then
        ((httpFailures++))
    fi
done
echo $httpRequestTotal
echo $httpFailures
httpSuccess=$(($httpRequestTotal - $httpFailures))
result=$(echo "scale=2; $httpSuccess / $httpRequestTotal" | bc)
echo $result

awk command instead of bc
result=$(awk "BEGIN {print $httpSuccess / $httpRequstTotal *100; exit}")
echo "Http success rate: $result%"

grep Response rolling.log | cut -f 2 -d [ | cut -f 1 -d ] | cut -f 1 -d ' '
grep Response rolling.log | cut -f 2 -d ' ' | cut -f 2 -d [

    if (($(echo "$num1 >= $num2" | bc -l)))
The option -l is equivalent to --mathlib; it loads the standard math library.
Piping through the basic calculator command bc returns either 1 or 0.

Enclosing the whole expression between double parenthesis (( )) will translate these values to respectively true or false.

