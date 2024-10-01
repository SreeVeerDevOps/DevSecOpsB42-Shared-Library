@Library('terraform-shared-library') _
pipeline {
    agent any
    stages {
        stage('Deploying To DEV Environment') {
            when {
                branch 'dev'
            }
            steps {
                echo 'Deploying To DEV Environment..'
                sayHello 'MEGASTAR'
                runTerraform 'version'
            }
        }
        stage('Deploying To UAT Environment') {
            when {
                branch 'uat'
            }
            steps {
                echo 'Deploying To UAT Environment..'
                sayHello 'MEGASTAR'
                runTerraform 'version'
            }
        }
        stage('Deploying To PROD Environment') {
            when {
                branch 'master'
            }
            steps {
                echo 'Deploying To PROD Environment..'
                sayHello 'MEGASTAR'
                runTerraform 'version'
            }
        }
    }
}