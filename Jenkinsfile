#!groovy
pipeline {
    agent any
   stages {
    stage('Maven Install and Build Jar') {
  steps {
       sh 'mvn clean package -DskipTests'
       sh 'java -cp target/my-app-1.0-SNAPSHOT.jar Calculator'
       }
     }
   }
 }
