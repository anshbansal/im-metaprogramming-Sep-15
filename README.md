# im-metaprogramming-Sep-15
Sample repository for IntelliMeet

Knowledge Prerequisite
---
- Groovy

Installation Prerequisites
---

- Java 1.7.0_79 (java -version)
- Gradle 2.3 (gradle -v)
- Groovy 2.4.3 (groovy -v)
- Intellij Idea 14+

Notes
---
- Recommended to use gvm for groovy and gradle installation. Installation/Use instructions are at http://gvmtool.net/
- The versions specified are the version with which this has been created. You can use newer versions but be aware that they have not been tested.

Steps to use this repository
---
- Clone this repo
- Go to the directory
- Run "gradle idea"
- Import project via Intellij Idea

Steps to run test
---
To run a test use "gradle test -Pnum=<exercise-num>".
e.g. for running tests for exercise 1 it needs to be "gradle test -Pnum=1"