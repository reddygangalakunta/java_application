pipeline {
    agent any

    stages {
        stage('Build') {
            parallel {
                stage('Build User Service') {
                    steps {
                        dir('user-service') {
                            sh 'mvn clean package'
                        }
                    }
                }
                stage('Build Product Service') {
                    steps {
                        dir('product-service') {
                            sh 'mvn clean package'
                        }
                    }
                }
                stage('Build Order Service') {
                    steps {
                        dir('order-service') {
                            sh 'mvn clean package'
                        }
                    }
                }
                stage('Build Payment Service') {
                    steps {
                        dir('payment-service') {
                            sh 'mvn clean package'
                        }
                    }
                }
                stage('Build Inventory Service') {
                    steps {
                        dir('inventory-service') {
                            sh 'mvn clean package'
                        }
                    }
                }
                stage('Build Notification Service') {
                    steps {
                        dir('notification-service') {
                            sh 'mvn clean package'
                        }
                    }
                }
            }
        }
        stage('Test') {
            parallel {
                stage('Test User Service') {
                    steps {
                        dir('user-service') {
                            sh 'mvn test'
                        }
                    }
                }
                stage('Test Product Service') {
                    steps {
                        dir('product-service') {
                            sh 'mvn test'
                        }
                    }
                }
                stage('Test Order Service') {
                    steps {
                        dir('order-service') {
                            sh 'mvn test'
                        }
                    }
                }
                stage('Test Payment Service') {
                    steps {
                        dir('payment-service') {
                            sh 'mvn test'
                        }
                    }
                }
                stage('Test Inventory Service') {
                    steps {
                        dir('inventory-service') {
                            sh 'mvn test'
                        }
                    }
                }
                stage('Test Notification Service') {
                    steps {
                        dir('notification-service') {
                            sh 'mvn test'
                        }
                    }
                }
            }
        }
        stage('Docker Build') {
            parallel {
                stage('Docker Build User Service') {
                    steps {
                        dir('user-service') {
                            sh 'docker build -t user-service .'
                        }
                    }
                }
                stage('Docker Build Product Service') {
                    steps {
                        dir('product-service') {
                            sh 'docker build -t product-service .'
                        }
                    }
                }
                stage('Docker Build Order Service') {
                    steps {
                        dir('order-service') {
                            sh 'docker build -t order-service .'
                        }
                    }
                }
                stage('Docker Build Payment Service') {
                    steps {
                        dir('payment-service') {
                            sh 'docker build -t payment-service .'
                        }
                    }
                }
                stage('Docker Build Inventory Service') {
                    steps {
                        dir('inventory-service') {
                            sh 'docker build -t inventory-service .'
                        }
                    }
                }
                stage('Docker Build Notification Service') {
                    steps {
                        dir('notification-service') {
                            sh 'docker build -t notification-service .'
                        }
                    }
                }
            }
        }
        stage('Deploy') {
            steps {
                sh './deploy.sh'
            }
        }
    }
}