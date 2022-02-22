void call(){
    stage("Maven Build"){
        println "build from the maven library"
        node{
//          git branch: 'main', url: 'https://github.com/arunstiwari/devops-java-reference-pipeline.git'
          sh 'mvn package -DskipTests=true'
        }
    }
}
