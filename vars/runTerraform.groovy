#!/usr/bin/env groovy
def tform(String action = 'version') {
  echo "Lets Run Terraform ${action}."
  terraform ${action}
}