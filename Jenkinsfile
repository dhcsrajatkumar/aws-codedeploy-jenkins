pipeline {
    agent {
        docker {
            image 'maven:3.8.1-adoptopenjdk-11'
            args '-v /root/.m2:/root/.m2'
        }
    }
    environment {
        AWS_ACCESS_KEY_ID     = credentials('aws-jenkins-secret-key-id')
        AWS_SECRET_ACCESS_KEY = credentials('aws-jenkins-secret-access-key')
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
        stage('Deploy') {
            steps {
                step([$class: 'AWSCodeDeployPublisher',
                    applicationName: 'aws-codedeploy-jenkins',
                    awsAccessKey: ${AWS_ACCESS_KEY_ID},
                    awsSecretKey: ${AWS_SECRET_ACCESS_KEY},
                    credentials: 'awsAccessKey',
                    deploymentConfig: 'CodeDeployDefault.AllAtOnce',
                    deploymentGroupAppspec: false,
                    deploymentGroupName: 'aws-codedeploy-jenkins-ec2-in-pace',
                    deploymentMethod: 'deploy',
                    excludes: '', iamRoleArn: '', includes: '**', pollingFreqSec: 15, pollingTimeoutSec: 300, proxyHost: '', proxyPort: 0,
                    region: 'eu-central-1', s3bucket: 'io-aws-codedeploy', s3prefix: 'aws-codedeploy-jenkins',
                    subdirectory: '', versionFileName: '', waitForCompletion: true])
            }
        }
    }
}
