# Java
Java is a well known enterprise programming language. As a language it is well designed ti scale in size and capabilities. There are a few key details you should know about the language:(QC will ask!)
- Jva is a **strongly typed language**.
    - once a data type is set, it can not be changed. (Ex: Can't do add on words)
- Java is a **statically typed language**
    - you must declare the data type you are working with every time you create data in your Java application. (String, Integer, etc.)
- Java has **automatic memory management**(C++ is a lanague that you have to assign which piece that need to be memorized.)
    - Java will handle all memory mangement and garbage collection for you
    - garbage collection is the removal of data from memory that we are no longer using.
- Write Once, Run Anywhere
    -Any machine that has a JRE/JVA on it can run a Java app, no matter where that app was made
        -a Java app designed 
## JDK, JRE, JVM
The Java Development Kit (JDK) contains the libraries and tools we need to be able to write our Java applications. One of the key tools we need is the Java compiler: this is what allows us to turn your source code (.java files) into byte code that can be executed on our computer (.class files). It also provides a debugger taht can be helpful is figuring our issues with our code. **(Ex: using javac in terminal to compile .java file to .class file (source code) which can be understand by computer and use java (file name) to execute the java file)** JDK use to build your code!

A Java Runtime Environment (JRE) is provided with the JDK when you download it. A JRE is what is needed to actually be able to run your Java application. **The JRE contains the runtime libraries neceassary for your code to execute.** Contained within the JRE is the Java Virtual Machine, which is the tool that actually handles ensuring your code will run on your machine.

The JVM is the tool that takes the byte code.(.class files) and turns it into data that is understanable by your particular operating system. Keep in mind, all JVMs are found in their respective Java Runtime Environment.

Java primitive data types:
-Java represents the most basic of data in structures called primitives: these data types are the simplies ones you can work with in Java, and we will be making extensive use of them while we look at the other aspects of Java
** 
**these primitive types represent whole numbers**
byte b = 0; // 8 bits in size
short s = 0; // 16 bits in size
int i = 0; // 32 bits in size (max size 2^32 - 1)
long l = 0; //64 bits in size
**these primitive types represent numbers with decimals**
float f = 0f; (must have f at the end of data or java will determine it as double) // 32 bits in size
double d = 0; //64 bits in size
**this primitive represents the unicode character**
char c = 'c'; // 16 bits
**this primitive represents logical true or false**
boolean bb = true; // 1 bit

## Classes & Objects
Java is an Object Oriented Programming language: this means that everything is tied to classes and objects. Classes in Java are like blueprints: they contain the information needed for your code to work. Objects in Java are the implementation of the blueprints. It is important to remember that objects do not share the value of their fields with one another: the values are unique to the object when these fields are part of the instance/object scope.

## Interfaces
If Classes are blueprints for objects, Interfaces are more like contract agreements for classes. If a class 
"implements" and interface it is like an agreement has been made that the class will, somehow, implement the feature of the interface. Interface are also unique in that a class can implement multiple interfaces, whereas only a single class can be extended.
# When to use abstract vs Interface
If the only thing that needs to be shared is methods then use an interface: if you also need to share fields (variables associated with the objects) then use an Abstract class