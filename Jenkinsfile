pipeline {
environment {
        registry = "kingkunal26/calculator"
        registryCredential = "kingkunal26"
        dockerImage = ''
    }
  agent any
  stages
    {

    stage ('SCM Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/kingkunal26/calculator'
            }
        }

    stage('mvn goals') {
      steps {
        bat 'mvn clean compile test package'
      }
    }
stage('Building Docker image') {
            steps {
                script {
                    dockerImage = docker.build registry + ":$BUILD_NUMBER"
                }
            }
        }
stage('Push image to DockerHub') {
            steps {
                script {
                    docker.withRegistry( '', registryCredential ) {
                        dockerImage.push()
                    }
                }
            }
        }
        stage('Cleaning up') {
            steps {
                bat "docker rmi $registry:$BUILD_NUMBER"
            }
        }
        stage('Run Container on Dev Server'){

	steps{


    	bat "docker run -p 8082:8082 -i kingkunal26/calculator:17"

                 }
             }

  }
}
