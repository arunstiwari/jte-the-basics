void call(){
    stage("Gradle: Test"){
        println "Unit Test using the Gradle library"
        node{
            git branch: 'main', url: 'https://github.com/arunstiwari/devops-java-reference-pipeline.git'
            sh 'gradle test'
        }
    }
}
