#!/bin/bash

export TERM=${TERM:-dumb}
cd repo
./gradlew clean build
pwd
cd ..
mkdir -p build
ls -ltr
cp repo/manifest.yml ./build
ls -ltr