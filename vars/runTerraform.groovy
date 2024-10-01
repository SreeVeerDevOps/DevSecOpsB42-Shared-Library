#!/usr/bin/env groovy
def call(String action = 'version') {
  echo "Lets Run Terraform ${action}."
  terraform ${action}
}