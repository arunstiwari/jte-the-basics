void call(){
    stage("Maven Build"){
        println "build from the maven library"
        steps{    
          sh 'mvn clean package'
        }
    }
}
