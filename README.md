# Sample Springboot App 

Sample springboot app for testing CICD.

### The K8s Deployment

The **deployment** and a **service**:

```bash
apiVersion: extensions/v1beta1
kind: Deployment
metadata:
  name: hello-world
spec:
  replicas: 2
  template:
    metadata:
      labels:
        app: hello-world
        visualize: "true"
    spec:
      containers:
      - name: hello-world-pod
        image: marounbassam/hello-spring
        ports:
        - containerPort: 8080
---
apiVersion: v1
kind: Service
metadata:
  labels:
    visualize: "true"
  name: hello-world-service
spec:
  selector:
    app: hello-world
  ports:
  - name: http
    protocol: TCP
    port: 8080
    targetPort: 8080
  type: ClusterIP

```

Reference: \
I forked this from https://github.com/MarounMaroun/spring-k8s-helloworld.