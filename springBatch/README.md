- login into personal docker-hub
  ```sh
  docker login -u <username>
  ```
  prompt you for password , copy/paste the api-key from docker-hub

- On your local, run the command from the Dockerfile path
  ```sh
  docker image build -t "image-name"  image-name can be any-name
  ```
  
- On your local, tag the image
  ```sh
  docker image tag "image-id" dockerhub-username/image-name
  ```
  
- push the tag to the personal docker-hub
   ```sh
  docker image push dockerhub-username/image-name
  ```