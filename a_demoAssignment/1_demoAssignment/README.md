Assuming you are in the directory above src directory:

## To clean:
ant -buildfile src/build.xml clean

-----------------------------------------------------------------------
## To compile: 
ant -buildfile src/build.xml all

-----------------------------------------------------------------------
## To run by specifying arguments from command line 
## We will use this to run your code
ant -buildfile src/build.xml run -Darg0=<path_to_input_file> -Darg1=<k_value> -Darg2=<debug_level>

-----------------------------------------------------------------------

## To create tarball for submission
ant -buildfile src/build.xml tarzip

-----------------------------------------------------------------------

## Command to tar and zip
tar -czvf demoAssignment.tar.gz demoAssignment

## Command to unzip and untar the tar.gz file
tar -xzvf demoAssignment.tar.gz

-----------------------------------------------------------------------

## Command Line Validations:

Number of Arguments.
Debug Value is of integer type and falls in the range.
Input File(s) exist and is not a directory.
K Value is of integer type.

-----------------------------------------------------------------------

"I have done this assignment completely on my own. I have not copied
it, nor have I given my solution to anyone else. I understand that if
I am involved in plagiarism or cheating I will have to sign an
official form that I have cheated and that this form will be stored in
my official university record. I also understand that I will receive a
grade of 0 for the involved assignment for my first offense and that I
will receive a grade of F for the course for any additional
offense.�

[Date: 07/22/2018]

-----------------------------------------------------------------------

Provide justification for Data Structures: 


-----------------------------------------------------------------------

Provide list of citations (urls, etc.) from where you have taken code
(if any).

https://www.geeksforgeeks.org/heap-sort/
https://www.geeksforgeeks.org/bubble-sort/
