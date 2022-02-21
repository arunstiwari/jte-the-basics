void call(){
    stage("Maven Build"){
        println "build from the maven library"
        node{    
          sh 'mvn clean package'
        }
    }
}
