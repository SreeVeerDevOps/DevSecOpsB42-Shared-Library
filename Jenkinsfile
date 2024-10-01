@Library('terraform-shared-library') _
pipeline {
    agent any
    stages {
        when {
            branch 'master'
        }
        stage('Deploying To DEV Environment') {
            steps {
                echo 'Deploying To DEV Environment..'
                sayHello 'MEGASTAR'
                runTerraform 'version'
            }
        }
        stage('Deploying To UAT Environment') {
            steps {
                echo 'Deploying To UAT Environment..'
                sayHello 'MEGASTAR'
                runTerraform 'version'
            }
        }
        stage('Deploying To PROD Environment') {
            steps {
                echo 'Deploying To PROD Environment..'
                sayHello 'MEGASTAR'
                runTerraform 'version'
            }
        }
    }
}