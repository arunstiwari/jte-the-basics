void call(){
    stage("Maven: Test"){
        println "Unit Test using the maven library"
        node{
            git branch: 'main', url: 'https://github.com/arunstiwari/devops-java-reference-pipeline.git'
            sh 'mvn clean test'
        }
    }
}
