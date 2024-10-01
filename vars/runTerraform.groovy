#!/usr/bin/env groovy
def call(String name = 'human') {
  pipeline {
    agent any
    stages {
      stage('Terraform Version') {
        steps {
          script {
            echo "Running Terraform Version"
            sh "terraform version"
          }
        }
    }
}
}
}