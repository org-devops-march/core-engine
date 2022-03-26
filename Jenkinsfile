pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven 'maven-3.8.5'
    }

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git branch: 'main', url: 'https://github.com/org-devops-march/core-engine.git'
                sh "mvn -Dmaven.test.failure.ignore=true clean deploy -s settings.xml"
            }

            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
        stage('Deploy') {
        steps {
           sh 'echo "started deployment on dev"'
        }
    }
}
}
