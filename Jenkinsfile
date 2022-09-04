pipeline {
    agent any
	tools{
	       maven "MVN_HOME"
	}

    stages {
        stage('Build') {
            steps {
                echo 'Building the application'
		        git branch: 'main', url:'https://github.com/sudhanshusudd/ATB.git'
		        bat "mvn clean test"
		    
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
