pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Build'
            }
        }
    

        stage('Test') {
            steps {
                echo 'Test'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploy'
            }
        }
    }

post{

always{
		emailext body: 'summary',subject: 'Pipeline status',to:'sudhanshu.chaurasia.sel@gmail.com'
	}
	}
}
