# HelloWorld
simple  service for deploy in openshift

**create docker registry**<br>
`docker run -d \
  -p 5000:5000 \
  --restart=always \
  --name registry \
  registry:2`

**push image to local registry**<br>
`docker tag hello-world:1.0 localhost:5000/hello-world`<br>
`docker push localhost:5000/hello-world`

**pull image from local registry**<br>
`docker pull localhost:5000/image_name:tag`

..
