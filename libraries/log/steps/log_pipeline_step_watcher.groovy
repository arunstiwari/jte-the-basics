@BeforeStep
void before(){
    println "Log: Running before the ${hookContext.library} library's ${hookContext.step} step"
}

@AfterStep
void after(){
    println "Log: Running After the ${hookContext.library} library's ${hookContext.step} step"
}