pipeline {
    agent any

    tools {
        maven 'maven3.9.5'
    }

    stages {
        stage('Checkout and Build') {
            steps {
                script {
                    // Checkout the 'master' branch from your Git repository
                    checkout([$class: 'GitSCM',
                        branches: [[name: '*/master']],
                        userRemoteConfigs: [[url: 'https://github.com/madhavi092/note1.git']]])

                    // Build your Maven project
                    bat 'mvn clean install'
                }
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    // Build a Docker image from your Spring Boot application
                    bat "docker build -t note."
                }
            }
        }

        stage('Push Docker Image to Docker Hub') {
            steps {
                script {
                    // Log in to Docker Hub
                    bat 'docker login -u madhupavi -p 9492055170'

                    // Push the Docker image to Docker Hub
                    bat "docker push note"
                }
            }
        }
    }
}