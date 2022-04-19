pipeline {
    agent any
    tools{
        maven 'maven'
    }

    stages {
        stage('Build') {
            steps {
                sh 'cd jacoco/java-project && mvn package'
            }
        }
        stage('test') {
            steps {
                sh 'cd jacoco/java-project mvn test'
            }
        }        
    }
}
