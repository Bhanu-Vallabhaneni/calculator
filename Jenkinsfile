#!groovy
pipeline {
    agent any
    stages {
     stage('Maven Install and Build Jar') {
      steps {
       sh 'mvn clean package -DskipTests'
       }
     }
     stage('Docker Build') {
      steps {
        sh 'docker build -t bhanu201/calculatordocker:latest .'
      }
    }
     stage('Docker Hub'){
     steps{
 	  withDockerRegistry([ credentialsId: "Dockerhub", url: "" ]){
 	   sh 'docker push bhanu201/calculatordocker:latest'
 	  }
     }
   }
        stage('Deploy using Rundeck') {
      agent any
      steps {
        script {
          step([$class: "RundeckNotifier",
          rundeckInstance: "Rundeck",
          shouldFailTheBuild: true,
          shouldWaitForRundeckJob: true,
          options: """
            BUILD_VERSION=$BUILD_NUMBER
          """,
          jobId: "6d50a1b5-fd68-4659-bd77-9d1e67980740"])
        }
      }
    }
 } 
 }