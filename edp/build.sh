#!/bin/bash
cd repo
./gradlew clean assemble
cp build/libs/*.jar ../artifacts/

