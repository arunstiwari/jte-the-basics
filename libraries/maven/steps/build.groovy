void call(){
    stage("Maven:  Build the package"){
        println "build from the maven library"
          sh 'mvn package -DskipTests=true'
    }
}
