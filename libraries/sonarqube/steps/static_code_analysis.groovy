void call(){
    stage("SonarQube: Static Code Analysis"){
       String sonarServerName = config.sonarServerName;
       String login = config.login;
       String projectKey = config.projectKey;
       String projectArgument = config.projectArgument ?: "";

       withSonarQubeEnv(sonarServerName){
           sh "sonar-scanner -Dsonar.login=${login} -Dsonar.projectKey=${projectKey}   ${projectArgument}"
       }
    }
}