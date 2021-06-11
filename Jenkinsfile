pipeline {
//     agent {
//         docker {
//             image 'maven:3.8.1-adoptopenjdk-11'
//             args '-v /root/.m2:/root/.m2'
//         }
//     }
    stages {
        stage('MavenBuild') {
              withMaven(jdk: 'jdk8', maven: 'M3') {
                sh "mvn -f ./pom.xml clean package"
              }
            }
    }
}
