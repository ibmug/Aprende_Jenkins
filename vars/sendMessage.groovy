def call(Map config){
    node{
        
        sh '''
        echo "Hello, World, this is a groovy file by PirataGomo!"
        git version
        java -version
        mvn -version
        '''
    }
}