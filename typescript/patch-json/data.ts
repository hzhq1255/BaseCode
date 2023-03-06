export const source : object = {
  "apiVersion": "apps/v1",
  "kind": "Deployment",
  "metadata": {
    "name": "myapp",
    "labels": {
        "a": "b"
    }
  },
  "spec": {
    "selector": {
      "matchLabels": {
        "app": "myapp"
      }
    },
    "template": {
      "metadata": {
        "labels": {
          "app": "myapp"
        }
      },
      "spec": {
        "containers": [
          {
            "name": "myapp",
            "image": "nginx:latest",
            "resources": {
              "limits": {
                "memory": "128Mi",
                "cpu": "500m"
              }
            },
            "ports": [
              {
                "containerPort": 80
              }
            ]
          }
        ]
      }
    }
  }
};

export const target: object = {
  "apiVersion": "apps/v1",
  "kind": "Deployment",
  "metadata": {
    "name": "myapp",
    "labels": {
        "c": "d"
    }
  },
  "spec": {
    "selector": {
      "matchLabels": {
        "app": "myapp"
      }
    },
    "template": {
      "metadata": {
        "labels": {
          "app": "myapp"
        }
      },
      "spec": {
        "containers": [
          {
            "name": "myapp",
            "image": "nginx:latest",
            "resources": {
              "limits": {
                "memory": "128Mi",
                "cpu": "500m"
              }
            },
            "ports": [
              {
                "containerPort": 80
              }
            ]
          }
        ]
      }
    }
  }
};