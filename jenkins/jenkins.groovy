pipeline {
    agent {'DevelopmentBuild'}
    stages {
        stage('Build') { 
            steps {
                sh 'echo HelloWorld'

            }
        }
        
    }
}