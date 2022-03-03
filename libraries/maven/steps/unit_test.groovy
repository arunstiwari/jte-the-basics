void call(){
    stage("Maven: Unit Test"){
        println "Unit Test using the maven library"
            sh 'mvn clean test'
    }
}
