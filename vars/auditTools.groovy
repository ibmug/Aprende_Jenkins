def call(){
    node{
        sh '''
        echo "Hello, World!" > /tmp/hello.txt
        git version
        java -version
        mvn -version
        '''
    }
}