# hellowrold示例项目

To build
--------
mvn clean package

Dockerfile build

docker build -t helloworld:0.1 .

To run
--------
docker run --name tomcat  -d -p 8080:8080 -it tomcat:8.5.58

To kubernetes
--------
kubectl apply -f helloworld.yaml
