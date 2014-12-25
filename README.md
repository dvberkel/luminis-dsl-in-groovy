DSL in Groovy
=============

This project accompanies an article on the 
[Luminis Developer blog](http://lsd.luminis.eu/blog/ "The Luminis Corporate Blog").

Specifically [Domain Specific Languages in Groovy](http://lsd.luminis.eu/domain-specific-languages-in-groovy/ "DSL in Groovy").

Running a Test
--------------

Use the following command to run a test. It is assumped that groovy is installed
and present on the path.

    groovy -cp src/main/groovy <file>

For example

    groovy -cp src/main/groovy src/test/groovy/ProgramBuilderTest.groovy

Directory Structure
-------------------
    .
    ├── README.md
    └── src
        ├── main
        │   └── groovy
        │       ├── program
        │       │   ├── AbstractProgram.groovy    
        │       │   ├── DoProgram.groovy
        │       │   ├── ForwardProgram.groovy
        │       │   ├── LeftProgram.groovy
        │       │   ├── Program.groovy
        │       │   └── RightProgram.groovy    
        │       ├── ProgramBuilder.groovy
        │       └── robot
        │           ├── LoggerRobot.groovy
        │           └── Robot.groovy
        └── test
            └── groovy
                ├── program
                │   └── ProgramTest.groovy
                ├── ProgramBuilderTest.groovy
                └── robot
                    └── LoggerRobotTest.groovy
