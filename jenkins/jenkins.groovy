pipeline {
    agent { label 'DevelopmentBuild'}
    stages {
        stage('Build') { 
            steps {
                sh 'echo HelloWorld'

            }
        }
        
    }
}