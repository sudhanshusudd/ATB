pipeline {
    agent any
	tools{
	maven: mvn
	}

    stages {
        stage('Build') {
            steps {
                echo 'Building the application'
		git branch: 'main', url:'https://github.com/sudhanshusudd/ATB.git'
		bat mvn clean test - Dsuite=testng.xml
		    
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
