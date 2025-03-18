pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                script {
                    def services = ['user-service', 'order-service', 'product-service', 'inventory-service', 'payment-service']
                    services.each { service ->
                        dir(service) {
                            sh 'mvn clean package'
                        }
                    }
                }
            }
        }
        stage('Docker Build') {
            steps {
                script {
                    def services = ['user-service', 'order-service', 'product-service', 'inventory-service', 'payment-service']
                    services.each { service ->
                        dir(service) {
                            sh "docker build -t ${service}:latest ."
                        }
                    }
                }
            }
        }
        stage('Docker Compose Up') {
            steps {
                sh 'docker-compose up -d'
            }
        }
    }
    post {
        always {
            sh 'docker-compose down'
        }
    }
}
