IMAGE_NAME = "simpleci"

def preBuild() {
    echo "Pre build stage"
}

def buildDockerImage() {
    echo "Building image..."
    sh("docker build -t $IMAGE_NAME -f src/Dockerfile src")
}

def buildDockerImage() {
    echo "Running image..."
    sh("docker run $IMAGE_NAME")
}

def clearCache() {
    sh("docker rmi -f $IMAGE_NAME")
}

return this